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
    /**
     * 添加看板
     * @paramBoard要添加的看板对象
     * @return
     */
    @PostMapping("addBoard")
    public Map getBoard(@RequestBody Board board){
     log.debug(board.getName());
     boardService.addBoard(board);
     return Map.of();
    }

}
