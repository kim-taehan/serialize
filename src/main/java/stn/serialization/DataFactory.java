package stn.serialization;

import lombok.experimental.UtilityClass;
import stn.serialization.data.BodyA;
import stn.serialization.data.Game;
import stn.serialization.data.Header;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

import static java.security.SecureRandom.getInstanceStrong;

@UtilityClass
public class DataFactory {
    private final SecureRandom random;

    static {
        try {
            random = getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


    public static BodyA createBodyA() {

        Header header = new Header();
        header.setStartCode("ATZ");
        header.setTransType("100");
        header.setTransLen(200);
        header.setTransId(UUID.randomUUID().toString().substring(16));
        header.setTkserNum(1);
        header.setResyncYn(false);
        header.setResultCd("00");
        header.setTagNum("1234567890123456");
        header.setGameId("01");
        header.setTotalStake(nextInt(10) * 10000);
        header.setGcBlockCnt(4);

        BodyA bodyA = new BodyA();
        bodyA.setBlockIdx(1);
        bodyA.setProgNum(11);
        int betMode = nextInt(20) + 1;
        bodyA.setBetMode(betMode + "");
        bodyA.setPoolStake(header.getTotalStake());


        int matchCnt = nextInt(10) + 1;
        bodyA.setMatchCnt(matchCnt);
        for (int i = 0; i < matchCnt; i++) {
            bodyA.addGame(createGame());
        }

        return bodyA;

    }

    private int nextInt(int bound) {
        return random.nextInt(bound);
    }


    private Game createGame(){
        Game game = new Game();
        game.setMatchNo(nextInt(1000) + 1);
        game.setMatchSel(123);
        game.setMatchOdds(0);
        game.setMatchHandi(0);
        return game;
    }
}
