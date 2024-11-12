package com.green.board2;

// URL /board

import com.green.board2.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //빈등록+컨트롤러 임명
@RequestMapping("board") //주소맵핑
@RequiredArgsConstructor //Bean등록된 객체 생성자 자동생성하고 DI설정
public class BoardController {
    private final BoardService service;

    @PostMapping
    public int postInsReq(@RequestBody BoardPostReq p){
        return service.postBoard(p);
    }

    @GetMapping
    public List<BoardGetRes> selGetRes(){
        return service.getBoard();
    }

    @GetMapping("{boardId}")
    public BoardGetOneRes selGetOneRes(@PathVariable int boardId){
        return service.getOneBoard(boardId);
    }

    @PutMapping
    public int putBoard(@RequestBody BoardPutReq p){
        return service.putBoard(p);
    }
}
