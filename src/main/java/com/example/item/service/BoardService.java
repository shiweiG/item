package com.example.item.service;

import com.example.item.entity.Board;
import com.example.item.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
    public Board getBoard(int bid){
        return boardRepository.findById(bid).orElse(null);
    }
    public List<Board> getUser(String uname, String position){
        return boardRepository.findByNameAndPosition(uname,position);
    }
    public void updateBoard(Board board){
        boardRepository.save(board);
    }
    public void deleteBoard(int bid){
        boardRepository.deleteById(bid);
    }
    public void addBoard(Board board){
        boardRepository.save(board);
    }


}
