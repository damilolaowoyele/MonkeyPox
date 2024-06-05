package org.fhi360.monkeypox.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
        // Create a response body, which could be a custom class or a Map
        // For simplicity, let's use a String
        String responseBody = "Resource not found: " + ex.getMessage();

        // Return a ResponseEntity
        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

    // You can add more methods to handle other exceptions
}
