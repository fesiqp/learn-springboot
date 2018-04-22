package com.learningapi.learningapi.repository;

import com.learningapi.learningapi.model.hardwr.Board;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardRepositoryImpl implements BoardRepository {
    private List<Board> boards = new ArrayList<Board>();

    @Override
    public List<Board> findAll() {
        return boards;
    }

    @Override
    public void save(Board board) {
        this.boards.add(board);
    }
}
