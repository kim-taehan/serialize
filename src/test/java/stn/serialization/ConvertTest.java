package stn.serialization;

import lombok.extern.slf4j.Slf4j;
import org.agrona.concurrent.UnsafeBuffer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import stn.serialization.converter.impl.*;
import stn.serialization.data.BodyA;
import stn.serialization.data.Game;
import stn.serialization.data.Header;
import stn.serialization.protobuf.UserProfile;
import stn.serialization.sbe.*;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class ConvertTest {


    private static List<BodyA> bodyAList = new ArrayList<>(100_000);

    private static int BODY_COUNT = 100_000;

    @BeforeAll
    public static void before(){
        for (int i = 0; i < BODY_COUNT; i++) {
            BodyA bodyA = DataFactory.createBodyA();
            bodyAList.add(bodyA);
        }
    }



    @Test
    void jacksonTest(){
        JacksonConverter converter = new JacksonConverter();
        Instant beforeTime = Instant.now();
        int totalSize = 0;
        for (BodyA bodyA : bodyAList) {
            byte[] serialization = converter.serialization(bodyA);
            totalSize += serialization.length;
            BodyA deserialization = converter.deserialization(serialization, BodyA.class);
//            assertThat(deserialization).isEqualTo(bodyA);
        }

        long diffTime = getDiffTime(beforeTime);
        log.info("jacksonTest -> 소요시간={}, 평균사이즈={}", diffTime, totalSize/bodyAList.size());
    }

    @Test
    void gsonTest(){
        GsonConverter converter = new GsonConverter();
        Instant beforeTime = Instant.now();
        int totalSize = 0;
        for (BodyA bodyA : bodyAList) {
            String serialization = converter.serialization(bodyA);
            totalSize += serialization.length();
            BodyA deserialization = converter.deserialization(serialization, BodyA.class);
//            assertThat(deserialization).isEqualTo(bodyA);
        }

        long diffTime = getDiffTime(beforeTime);
        log.info("gsonTest -> 소요시간={}, 평균사이즈={}", diffTime, totalSize/bodyAList.size());
    }

    @Test
    void byteStreamTest(){
        ByteStreamConverter converter = new ByteStreamConverter();
        Instant beforeTime = Instant.now();
        int totalSize = 0;
        for (BodyA bodyA : bodyAList) {
            byte[] serialization = converter.serialization(bodyA);
            totalSize += serialization.length;
            BodyA deserialization = converter.deserialization(serialization, BodyA.class);
//            assertThat(deserialization).isEqualTo(bodyA);
        }

        long diffTime = getDiffTime(beforeTime);
        log.info("byteStreamTest -> 소요시간={}, 평균사이즈={}", diffTime, totalSize/bodyAList.size());
    }

    @Test
    void test(){

        ProtoBufConverter converter = new ProtoBufConverter();
        Instant beforeTime = Instant.now();
        int totalSize = 0;
        for (BodyA bodyA : bodyAList) {
            byte[] serialization = converter.serialization(bodyA);
            totalSize += serialization.length;
            BodyA deserialization = converter.deserialization(serialization, BodyA.class);
//            assertThat(deserialization).isEqualTo(bodyA);
        }

        long diffTime = getDiffTime(beforeTime);
        log.info("ProtoBufTest -> 소요시간={}, 평균사이즈={}", diffTime, totalSize/bodyAList.size());


    }
    @Test
    void sbeTest(){
        SbeConverter converter = new SbeConverter();
        Instant beforeTime = Instant.now();
        int totalSize = 0;
        for (BodyA bodyA : bodyAList) {
            byte[] serialization = converter.serialization(bodyA);
            totalSize += serialization.length;
            BodyA deserialization = converter.deserialization(serialization, BodyA.class);
        }

        long diffTime = getDiffTime(beforeTime);
        log.info("SBEConvert -> 소요시간={}, 평균사이즈={}", diffTime, totalSize/bodyAList.size());



    }




    private static long getDiffTime(Instant beforeTime) {
        return Duration.between(beforeTime, Instant.now()).toMillis();
    }





}
