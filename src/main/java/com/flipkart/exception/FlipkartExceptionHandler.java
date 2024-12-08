package com.flipkart.exception;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

//@RestControllerAdvice
//public class FlipkartExceptionHandler {
//
//    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
//    public ResponseEntity<Object> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("error", "Check path, it's not properly formed: " + ex.getMessage());
//        return new ResponseEntity<Object>(map, HttpStatus.BAD_REQUEST);
//    }
//
//    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//    public ResponseEntity<Object> handleMethodNotSupported(HttpRequestMethodNotSupportedException ex) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("error", "The method is not supported for this request: " + ex.getMessage());
//        return new ResponseEntity<Object>(map, HttpStatus.METHOD_NOT_ALLOWED);
//    }
//
//    @ExceptionHandler(NoResourceFoundException.class)
//    public ResponseEntity<Object> handleNoResourceFound(NoResourceFoundException ex) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("error", "Check the path properly, it's not correct: " + ex.getMessage());
//        return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
//    }
//
//    // Add more exception handlers as needed
//}
