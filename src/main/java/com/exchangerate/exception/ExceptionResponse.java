package com.exchangerate.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Clase ExceptionResponse, representa la respuesta de la API en caso de que ocurra una excepción.
 * 
 * @author: Sánchez Urbano Cynthia Lizbeth
 * @version: 10/04/2023
 */
public class ExceptionResponse {
    /* Atributo de tipo LocalDateTime, representa la fecha y hora de la excepción */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timestamp;
    /* Atributo de tipo Integer, representa el código de la excepción */
	private Integer status;
    /* Atributo de tipo HttpStatus, representa el estado de la respuesta de la API */
	private HttpStatus error;
    /* Atributo de tipo String, representa el mensaje de la respuesta de la API */
	private String message;
    /* Atributo de tipo String, representa la ruta de la excepción */
	private String path;
	
    /*
     * Constructor de ExceptionResponse.
     */
	public ExceptionResponse() {
	}

    /**
     * Método que obtiene el valor del atributo timestamp.
     * @return timestamp
     */
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

    /**
     * Método que asigna un nuevo valor al atributo timestamp.
     * @param timestamp
     */
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

    /**
     * Método que obtiene el valor del atributo status.
     * @return status
     */
	public Integer getStatus() {
		return status;
	}

    /**
     * Método que asigna un nuevo valor al atributo status.
     * @param status
     */
	public void setStatus(Integer status) {
		this.status = status;
	}

    /**
     * Método que obtiene el valor del atributo error.
     * @return error
     */
	public HttpStatus getError() {
		return error;
	}

    /**
     * Método que asigna un nuevo valor al atributo error.
     * @param error
     */
	public void setError(HttpStatus error) {
		this.error = error;
	}

    /**
     * Método que obtiene el valor del atributo message.
     * @return message
     */
	public String getMessage() {
		return message;
	}

    /**
     * Método que asigna un nuevo valor al atributo message.
     * @param message
     */
	public void setMessage(String message) {
		this.message = message;
	}

    /**
     * Método que obtiene el valor del atributo path.
     * @return path
     */
	public String getPath() {
		return path;
	}

    /**
     * Método que asigna un nuevo valor al atributo path.
     * @param path
     */
	public void setPath(String path) {
		this.path = path;
	}

}
