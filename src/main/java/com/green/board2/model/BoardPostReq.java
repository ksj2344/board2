package com.green.board2.model;
//Insert때 사용.

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardPostReq {
    private String title;
    private String contents;
    private String writer;
}
