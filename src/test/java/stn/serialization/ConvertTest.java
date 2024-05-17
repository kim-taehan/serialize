package stn.serialization;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import stn.serialization.converter.impl.ByteStreamConverter;
import stn.serialization.converter.impl.GsonConverter;
import stn.serialization.converter.impl.JacksonConverter;
import stn.serialization.data.BodyA;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@Slf4j
public class ConvertTest {


    private static List<BodyA> bodyAList = new ArrayList<>(100_000);

    private static int BODY_COUNT = 100_000;


    @BeforeAll
    public static void before(){
        for (int i = 0; i < BODY_COUNT; i++) {
            bodyAList.add(DataFactory.createBodyA());
        }
    }


    @Test
    void jacksonTest(){
        JacksonConverter converter = new JacksonConverter();
        Instant beforeTime = Instant.now();
        int totalSize = 0;
        for (BodyA bodyA : bodyAList) {
            String serialization = converter.serialization(bodyA);
            totalSize += serialization.length();
            BodyA deserialization = converter.deserialization(serialization, BodyA.class);
            assertThat(deserialization).isEqualTo(bodyA);
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
            assertThat(deserialization).isEqualTo(bodyA);
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
            assertThat(deserialization).isEqualTo(bodyA);
        }

        long diffTime = getDiffTime(beforeTime);
        log.info("byteStreamTest -> 소요시간={}, 평균사이즈={}", diffTime, totalSize/bodyAList.size());
    }

    private static long getDiffTime(Instant beforeTime) {
        return Duration.between(beforeTime, Instant.now()).toMillis();
    }





}
