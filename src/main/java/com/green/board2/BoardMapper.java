package com.green.board2;


import com.green.board2.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardPostReq p);

    List<BoardGetRes> getBoard();

    BoardGetOneRes getOneBoard(int boardId);

    int putBoard(BoardPutReq p);
}
