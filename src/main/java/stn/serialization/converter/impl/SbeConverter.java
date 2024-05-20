package stn.serialization.converter.impl;

import com.google.protobuf.InvalidProtocolBufferException;
import org.agrona.concurrent.UnsafeBuffer;
import stn.serialization.converter.Converter;
import stn.serialization.data.BodyA;
import stn.serialization.data.Game;
import stn.serialization.data.Header;
import stn.serialization.protobuf.UserProfile;
import stn.serialization.sbe.*;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.List;

public class SbeConverter implements Converter<byte[]> {

    @Override
    public <O> byte[] serialization(O obj) {
        BodyA bodyA = (BodyA) obj;
        SampleGroupEncoder encoder = new SampleGroupEncoder();
        final MessageHeaderEncoder messageHeaderEncoder = new MessageHeaderEncoder();
        final ByteBuffer byteBuffer = ByteBuffer.allocateDirect(256);
        final UnsafeBuffer directBuffer = new UnsafeBuffer(byteBuffer);
        byte[] bytes = directBuffer.byteArray();
//        //write the encoded output to the direct buffer
        encoder.wrapAndApplyHeader(directBuffer, 0, messageHeaderEncoder);

        Header header1 = bodyA.getHeader();
        HeaderEncoder header = encoder.header()
                .startCode(header1.getStartCode())
                .transType(header1.getTransType())
                .transLen((short) header1.getTransLen())
                .transId(header1.getTransId())
                .tkserNum(header1.getTkserNum())
                .resyncYn((short) (header1.isResyncYn() ? 1 : 0))
                .resultCd(header1.getResultCd())
                .tagNum(header1.getTagNum())
                .gameId(header1.getGameId())
                .totalStake((short) header1.getTotalStake())
                .gcBlockCnt((short) header1.getGcBlockCnt());
        encoder.blockIdx((short) bodyA.getBlockIdx());
        encoder.progNum((short) bodyA.getProgNum());
        encoder.betMode(bodyA.getBetMode());
        encoder.poolStake((short) bodyA.getPoolStake());
        encoder.matchCnt((short) bodyA.getMatchCnt());

        int size = bodyA.getGames().size();
        SampleGroupEncoder.GroupEncoder groupEncoder = encoder.groupCount(size);
        SampleGroupEncoder.GroupEncoder now = null;
        for (int i = 0; i < size; i++) {
            Game game = bodyA.getGames().get(i);
            now = now == null ? groupEncoder.next() : now.next();
            now.matchSel(game.getMatchSel());
            now.matchHandi(game.getMatchHandi());
            now.matchOdds(game.getMatchOdds());
            now.matchNo(game.getMatchNo());
        }
        byte[] arr = new byte[byteBuffer.remaining()];
        ByteBuffer byteBuffer1 = byteBuffer.get(arr);

        return arr;
    }

    @Override
    public <O> O deserialization(byte[] bytes, Class<O> oClass) {


        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

         UnsafeBuffer buffer = new UnsafeBuffer(byteBuffer);

        final SampleGroupDecoder decoder = new SampleGroupDecoder();
        final MessageHeaderDecoder headerDecoder = new MessageHeaderDecoder();
        int bufferOffset = 0;

        headerDecoder.wrap(buffer, bufferOffset);

// Lookup the applicable flyweight to decode this type of message based on templateId and version.
        final int templateId = headerDecoder.templateId();
        if (templateId != SampleGroupDecoder.TEMPLATE_ID)
        {
            throw new IllegalStateException("Template ids do not match");
        }

        final int actingBlockLength = headerDecoder.blockLength();
        final int actingVersion = headerDecoder.version();

        bufferOffset += headerDecoder.encodedLength();
        decoder.wrap(buffer, bufferOffset, actingBlockLength, actingVersion);


        SampleGroupDecoder.GroupDecoder root = decoder.group();
        HeaderDecoder header1 = decoder.header();



        BodyA bodyA = new BodyA();

        Header header2 = new Header();
        header2.setStartCode(header1.startCode());
        header2.setTransType(header1.transType());
        header2.setTransLen(header1.transLen());
        header2.setTransId(header1.transId());
        header2.setTkserNum((int) header1.tkserNum());

        if(header1.resyncYn() == (short) 1){
            header2.setResyncYn(true);
        }
        else{
            header2.setResyncYn(false);
        }
        header2.setTagNum(header1.tagNum());
        header2.setGameId(header1.gameId());
        header2.setTotalStake(header1.totalStake());
        header2.setGcBlockCnt(header1.gcBlockCnt());

        bodyA.setHeader(header2);
        bodyA.setBlockIdx(decoder.blockIdx());
        bodyA.setProgNum(decoder.progNum());
        bodyA.setBetMode(decoder.betMode());
        bodyA.setPoolStake(decoder.poolStake());
        bodyA.setMatchCnt(decoder.matchCnt());


        int count = root.count();
//        SampleGroupDecoder.GroupDecoder group = root.next();
        SampleGroupDecoder.GroupDecoder group = null;
        for (int i = 0; i < count; i++) {

            Game game = new Game();

            if (group == null) {
                group = root.next();
            }
            else{
                group = group.next();
            }

            game.setMatchHandi(group.matchHandi());
            game.setMatchOdds(group.matchOdds());
            game.setMatchSel(group.matchSel());
            game.setMatchNo(group.matchNo());
            bodyA.addGame(game);

        }

//        int size = bodyA.getGames().size();
//        SampleGroupEncoder.GroupEncoder groupEncoder = encoder.groupCount(size);
//        SampleGroupEncoder.GroupEncoder now = null;
//        for (int i = 0; i < size; i++) {
//            Game game = bodyA.getGames().get(i);
//            now = now == null ? groupEncoder.next() : now.next();
//            now.matchSel(game.getMatchSel());
//            now.matchHandi(game.getMatchHandi());
//            now.matchOdds(game.getMatchOdds());
//            now.matchNo(game.getMatchNo());
//        }
//        theater.getGamesList().stream().forEach(game -> {
//            Game game1 = new Game();
//            game1.setMatchHandi((int) game.getMatchHandi());
//            game1.setMatchNo((int) game.getMatchNo());
//            game1.setMatchSel((int) game.getMatchSel());
//            game1.setMatchOdds((int) game.getMatchOdds());
//            bodyA.addGame(game1);
//        });
        return (O) bodyA;
    }
}
