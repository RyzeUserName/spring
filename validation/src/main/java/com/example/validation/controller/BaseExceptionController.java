package com.example.validation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * 异常处理类
 * request 参数 错误提示是500 而不是400 这里转一下
 * @author Ryze
 * @date 2019-04-08 11:26
 */
@RestControllerAdvice
public class BaseExceptionController {
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e) {
        return new ResponseEntity<>("参数校验未通过: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
