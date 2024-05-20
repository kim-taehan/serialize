package stn.serialization.converter.impl;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import stn.serialization.converter.Converter;
import stn.serialization.data.BodyA;
import stn.serialization.data.Game;
import stn.serialization.data.Header;
import stn.serialization.protobuf.UserProfile;

import java.util.List;

public class ProtoBufConverter implements Converter<byte[]> {
    @Override
    public <O> byte[] serialization(O obj) {
        BodyA bodyA = (BodyA) obj;
        Header header = bodyA.getHeader();
        UserProfile.Header header2 = UserProfile.Header.newBuilder()
                .setStartCode(header.getStartCode())
                .setTransType(header.getTransType())
                .setTransLen(header.getTransLen())
                .setTransId(header.getTransId())
                .setTkserNum(header.getTkserNum())
                .setResyncYn(header.isResyncYn())
                .setResultCd(header.getResultCd())
                .setTagNum(header.getTagNum())
                .setGameId(header.getGameId())
                .setTotalStake(header.getTotalStake())
                .setGcBlockCnt(header.getGcBlockCnt())
                .build();

        List<UserProfile.Game> list = bodyA.getGames().stream()
                .map(game -> {
                    return UserProfile.Game.newBuilder()
                            .setMatchHandi(game.getMatchHandi())
                            .setMatchNo(game.getMatchNo())
                            .setMatchSel(game.getMatchSel())
                            .setMatchOdds(game.getMatchOdds())
                            .build();
                }).toList();


        UserProfile.Theater build = UserProfile.Theater.newBuilder()
                .setBlockIdx(bodyA.getBlockIdx())
                .setProgNum(bodyA.getProgNum())
                .setBetMode(bodyA.getBetMode())
                .setPoolStake(bodyA.getPoolStake())
                .setMatchCnt(bodyA.getMatchCnt())
                .setHeader(header2)
                .addAllGames(list)
                .build();

        return build.toByteArray();

    }

    @Override
    public <O> O deserialization(byte[] byteArray, Class<O> oClass) {
        try {
            UserProfile.Theater theater = UserProfile.Theater.parseFrom(byteArray);
            BodyA bodyA = new BodyA();

            UserProfile.Header header = theater.getHeader();
            Header header2 = new Header();
            header2.setStartCode(header.getStartCode());
            header2.setTransType(header.getTransType());
            header2.setTransLen((int) header.getTransLen());
            header2.setTransId(header.getTransId());
            header2.setTkserNum((int) header.getTkserNum());
            header2.setResyncYn(header.getResyncYn());
            header2.setResultCd(header.getResultCd());
            header2.setTagNum(header.getTagNum());
            header2.setGameId(header.getGameId());
            header2.setTotalStake((int) header.getTotalStake());
            header2.setGcBlockCnt((int) header.getGcBlockCnt());

            bodyA.setHeader(header2);
            theater.getGamesList().stream().forEach(game -> {
                Game game1 = new Game();
                game1.setMatchHandi((int) game.getMatchHandi());
                game1.setMatchNo((int) game.getMatchNo());
                game1.setMatchSel((int) game.getMatchSel());
                game1.setMatchOdds((int) game.getMatchOdds());
                bodyA.addGame(game1);
            });

            bodyA.setBlockIdx((int) theater.getBlockIdx());
            bodyA.setProgNum((int) theater.getProgNum());
            bodyA.setBetMode(theater.getBetMode());
            bodyA.setPoolStake((int)theater.getPoolStake());
            bodyA.setMatchCnt((int) theater.getMatchCnt());

            return (O) bodyA;

        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }
}
