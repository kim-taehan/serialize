package stn.serialization.data;

import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Data
public class BodyA  implements Serializable {

    private static final long serialVersionUID = 10001L;

    private Header header;

    // 슬립지 블락 인덱스 (1)
    private int blockIdx;

    // 프로그램 번호 (6)
    private int progNum;

    // 배팅 유형 코드 (2)
    private String betMode;

    // 발매금액 (6)
    private int poolStake;
    
    // 경기수 (2)
    private int matchCnt;

    private List<Game> games = new LinkedList<>();

    public void addGame(Game game){
        games.add(game);
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BodyA bodyA = (BodyA) object;
        return blockIdx == bodyA.blockIdx && progNum == bodyA.progNum && poolStake == bodyA.poolStake && matchCnt == bodyA.matchCnt && Objects.equals(header, bodyA.header) && Objects.equals(betMode, bodyA.betMode) && Objects.equals(games, bodyA.games);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, blockIdx, progNum, betMode, poolStake, matchCnt, games);
    }
}
