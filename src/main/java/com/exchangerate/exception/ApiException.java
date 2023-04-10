package com.exchangerate.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
/**
 * Clase ApiException, que extiende de RuntimeException para manejar las excepciones.
 * 
 * @author: Sánchez Urbano Cynthia Lizbeth
 * @version: 10/04/2023
 */
public class ApiException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    /* Atributo de tipo HttpStatus, representa el estado de la respuesta de la API */
    private HttpStatus status;

    /**
     * Constructor de ApiException.
     * @param status, el estado de la respuesta de la API.
     * @param message, el mensaje de la respuesta de la API.
     */
    public ApiException(HttpStatus status,String message) { 
        super(message);
        this.status = status;
    }

    /**
     * Método que obtiene el valor del atributo status.
     * @return
     */
    public HttpStatus getStatus() {
        return status;
    }

    /**
     * Método que asigna un nuevo valor al atributo status.
     * @param status
     */
    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    
}
