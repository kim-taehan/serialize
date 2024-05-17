package stn.serialization.data;


import lombok.Data;

import java.io.Serializable;

@Data
public class Game implements Serializable {

    private static final long serialVersionUID = 10002L;

    // 경기 번호 (3)
    private int matchNo;

    // 경기 결과 (1)
    private int matchSel;

    // 배당율 (6)
    private int matchOdds;

    // 핸디 (4)
    private int matchHandi;
}
