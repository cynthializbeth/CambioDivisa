package com.exchangerate.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private HttpStatus status;

    public ApiException(HttpStatus status,String message) { 
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    
}
