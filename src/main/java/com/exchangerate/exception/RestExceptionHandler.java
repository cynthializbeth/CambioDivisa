package com.exchangerate.exception;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Clase Rest Exception Handler, maneja las excepciones de la API.
 * 
 * @author: Sánchez Urbano Cynthia Lizbeth
 * @version: 10/04/2023
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
	
    /**
     * Método que maneja las excepciones de la API.
     */
	@ExceptionHandler(ApiException.class)
    protected ResponseEntity<ExceptionResponse> handleApiException(ApiException exception, WebRequest request){       
        ExceptionResponse response = new ExceptionResponse(); 
        
        response.setTimestamp(LocalDateTime.now());
        response.setStatus(exception.getStatus().value());
        response.setError(exception.getStatus());
        response.setMessage(exception.getMessage());
        response.setPath(((ServletWebRequest)request).getRequest().getRequestURI().toString());
        
        return new ResponseEntity<>(response, response.getError());
    }
}
