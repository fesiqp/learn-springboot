package com.learningapi.learningapi.repository;

import com.learningapi.learningapi.model.hardwr.Board;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface BoardRepository {
    Map<String, Board> findAll();
    void save(Board board) throws Exception;
}
