package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardGetOneRes {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
    private String createdAt;
}
