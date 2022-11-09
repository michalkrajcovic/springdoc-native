package com.example.springdocnative.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.springdocnative.web.model.ErrorResponse;

@ControllerAdvice
public class GreetingsAdvice {

    @ExceptionHandler(GreetingsException.class)
    public ResponseEntity<ErrorResponse> onException(GreetingsException exception) {
        return new ResponseEntity<>(new ErrorResponse(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
