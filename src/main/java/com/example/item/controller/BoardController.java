package com.example.item.controller;

import com.example.item.entity.Board;
import com.example.item.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/item/")
public class BoardController {
    @Autowired
    private BoardService boardService;

    //添加
    @PostMapping("addBoard")
    public Board getBoard(@RequestBody Board board){
     log.debug(board.getName());
    return boardService.addBoard(board);


    }

    //查询看板信息
    @GetMapping("findBoard/{id}")
    public Board getBoard(@PathVariable int id){
        return boardService.getBoard(id);
    }
    //删除看板信息
    @GetMapping("deleteBoard/{id}")
    public void deleteBoard(@PathVariable int id){
         boardService.deleteBoard(id);
    }
    //更新看板
    @PostMapping("updateBoard")
    public Board updateBoard(@RequestBody Board board){
        return boardService.updateBoard(board);

    }

}
