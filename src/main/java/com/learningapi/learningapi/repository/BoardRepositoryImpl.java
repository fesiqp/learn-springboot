package com.learningapi.learningapi.repository;

import com.learningapi.learningapi.model.hardwr.Board;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BoardRepositoryImpl implements BoardRepository {
    private Map<String, Board> boards = new HashMap<>();

    @Override
    public Map<String, Board> findAll() {
        return boards;
    }

    @Override
    public void save(Board board) throws Exception {
        if (this.boards.containsKey(board.getURL())) {
            throw new Exception("Board already exists");
        }
        this.boards.put(board.getURL(), board);
    }
}
