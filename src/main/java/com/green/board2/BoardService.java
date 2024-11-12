package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPostReq;
import com.green.board2.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public int postBoard(BoardPostReq p){
        return mapper.insBoard(p);
    }

    public List<BoardGetRes> getBoard(){
        return mapper.getBoard();
    }

    public BoardGetOneRes getOneBoard(int boardId){
        return mapper.getOneBoard(boardId);
    }

    public int putBoard(BoardPutReq p){
        return mapper.putBoard(p);
    }
}
