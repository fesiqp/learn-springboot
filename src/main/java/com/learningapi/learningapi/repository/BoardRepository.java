package com.learningapi.learningapi.repository;

import com.learningapi.learningapi.model.hardwr.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {
    List<Board> findAll();
    void save(Board board);
}
