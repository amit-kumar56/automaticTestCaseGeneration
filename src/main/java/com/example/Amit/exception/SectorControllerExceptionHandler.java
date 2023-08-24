package com.example.Amit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SectorControllerExceptionHandler
{
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleCompanyNotFoundException(SectorNotFoundException e)
    {
        ErrorResponse errorResponse = new ErrorResponse();
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }
}