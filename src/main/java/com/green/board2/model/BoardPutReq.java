package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardPutReq {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
}
