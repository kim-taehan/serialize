package stn.serialization.data;

import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

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

}
