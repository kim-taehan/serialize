package stn.serialization.sbe;

import lombok.extern.slf4j.Slf4j;
import org.agrona.concurrent.UnsafeBuffer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.nio.ByteBuffer;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class MarketDataTest {

    @Test
    void test(){

        UnsafeBuffer buffer = new UnsafeBuffer(ByteBuffer.allocate(128));
        MessageHeaderEncoder headerEncoder = new MessageHeaderEncoder();
        Body1Encoder dataEncoder = new Body1Encoder();
        Body1Encoder encoder = dataEncoder.wrapAndApplyHeader(buffer, 0, headerEncoder);
        encoder.blockIdx(100);

        Body1Encoder.GamesEncoder gamesEncoder = encoder.gamesCount(2);


        Body1Encoder.GamesEncoder next = gamesEncoder.next();
        next.matchHandi(20);
        next.matchNo(20);
        Body1Encoder.GamesEncoder next2 = next.next();
        next.matchHandi(30);
        next.matchNo(30);

        MessageHeaderDecoder headerDecoder = new MessageHeaderDecoder();
        Body1Decoder decoder = new Body1Decoder().wrapAndApplyHeader(buffer, 0, headerDecoder);
        Assertions.assertEquals(100, decoder.blockIdx());
//        Assertions.assertEquals(2, decoder.games().count());
        int i = decoder.games().matchHandi();
        Body1Decoder.GamesDecoder games = decoder.games();
        Assertions.assertEquals(10, games.matchHandi());
        Assertions.assertEquals(10, games.matchNo());
        boolean b = decoder.games().hasNext();

        for (Body1Decoder.GamesDecoder game : decoder.games()) {
            log.info("game={}", game.matchHandi());
        }

        log.info("test");
//        Iterator<Body1Decoder.GamesDecoder> iterator = decoder.games().iterator();
//        Assertions.assertEquals(20, next1.matchHandi());
//        Assertions.assertEquals(20, next1.matchNo());
//        MarketData marketData = new MarketData(2, 128.99, Market.NYSE, Currency.USD, "IBM");
//
//        UnsafeBuffer buffer = new UnsafeBuffer(ByteBuffer.allocate(128));
//        MessageHeaderEncoder headerEncoder = new MessageHeaderEncoder();
//        TradeDataEncoder dataEncoder = new TradeDataEncoder();
//
//        BigDecimal priceDecimal = BigDecimal.valueOf(marketData.getPrice());
//        int priceMantissa = priceDecimal.scaleByPowerOfTen(priceDecimal.scale()).intValue();
//        int priceExponent = priceDecimal.scale() * -1;
//
//        TradeDataEncoder encoder = dataEncoder.wrapAndApplyHeader(buffer, 0, headerEncoder);
//        encoder.amount(marketData.getAmount());
//        encoder.quote()
//                .market(marketData.getMarket())
//                .currency(marketData.getCurrency())
//                .symbol(marketData.getSymbol())
//                .price()
//                .mantissa(priceMantissa)
//                .exponent((byte) priceExponent);
//
//
//        log.info("test ={}", encoder);
//
//
//        MessageHeaderDecoder headerDecoder = new MessageHeaderDecoder();
//        TradeDataDecoder dataDecoder = new TradeDataDecoder();
//
//        dataDecoder.wrapAndApplyHeader(buffer, 0, headerDecoder);
//        double price = BigDecimal.valueOf(dataDecoder.quote().price().mantissa())
//                .scaleByPowerOfTen(dataDecoder.quote().price().exponent())
//                .doubleValue();
//
//        Assertions.assertEquals(2, dataDecoder.amount());
//        Assertions.assertEquals("IBM", dataDecoder.quote().symbol());
//        Assertions.assertEquals(Market.NYSE, dataDecoder.quote().market());
//        Assertions.assertEquals(Currency.USD, dataDecoder.quote().currency());
//        Assertions.assertEquals(128.99, price);
    }

}