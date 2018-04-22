package com.learningapi.learningapi.service;

import com.learningapi.learningapi.model.hardwr.Board;
import com.learningapi.learningapi.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @RequestMapping("/devices")
    public List<Board> findAllBoards() {
        return boardRepository.findAll();
    }

    @RequestMapping(path="/salute", method=RequestMethod.POST)
    public ResponseEntity<Board> salute(@RequestBody Board board) {
        boardRepository.save(board);
        return new ResponseEntity<Board>(board, HttpStatus.CREATED);
    }
}
