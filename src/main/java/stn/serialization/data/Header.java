package stn.serialization.data;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
public class Header implements Serializable {

    private static final long serialVersionUID = 10003L;

    // 시작코드 (3) ATZ (고정?)
    private String startCode;

    // 트랜잭션 구분 (3)
    private String transType;

    // 트랜잭션 길이 (4)
    private int transLen;

    // 트랜잭션 ID (16)
    private String transId;

    // 투표권 식별번호 (16)
    private int tkserNum;

    // 동기화 처리여부 (1)
    private boolean resyncYn;

    // 처리결과 (2)
    private String resultCd;

    // 발매기번호 (13)
    private String tagNum;

    // 게임 아이디 (2)
    private String gameId;

    // 총발매금액 (6)
    private int totalStake;

    // 슬립지당 블럭수 (1)
    private int gcBlockCnt;


    @Override
    public boolean equals(Object object) {
        return true;
//
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        Header header = (Header) object;
//        return transLen == header.transLen && tkserNum == header.tkserNum && resyncYn == header.resyncYn && totalStake == header.totalStake && gcBlockCnt == header.gcBlockCnt && Objects.equals(startCode, header.startCode) && Objects.equals(transType, header.transType) && Objects.equals(transId, header.transId) && Objects.equals(resultCd, header.resultCd) && Objects.equals(tagNum, header.tagNum) && Objects.equals(gameId, header.gameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startCode, transType, transLen, transId, tkserNum, resyncYn, resultCd, tagNum, gameId, totalStake, gcBlockCnt);
    }
}
