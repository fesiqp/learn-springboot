package com.learningapi.learningapi.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class BoardAlreadyExistsException extends RuntimeException {
    public BoardAlreadyExistsException(String exception) {
        super(exception);
    }
}
