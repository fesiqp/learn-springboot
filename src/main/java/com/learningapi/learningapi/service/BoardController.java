package com.learningapi.learningapi.service;

import com.learningapi.learningapi.model.hardwr.Board;
import com.learningapi.learningapi.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @RequestMapping("/devices")
    public Map<String, Board> findAllBoards() {
        return boardRepository.findAll();
    }

    @RequestMapping(path="/salute", method=RequestMethod.POST)
    public ResponseEntity salute(@RequestBody Board board) {
        try {
            boardRepository.save(board);
        } catch (Exception e) {
            throw new BoardAlreadyExistsException(e.getMessage());
//            return new ResponseEntity(e.getMessage(),HttpStatus.CONFLICT)
        }
        return new ResponseEntity<Board>(board, HttpStatus.CREATED);
    }

}