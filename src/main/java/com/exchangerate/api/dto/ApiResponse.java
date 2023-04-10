package com.exchangerate.api.dto;

/**
 * Clase ApiResponse, clase que representa la respuesta de la API.
 * 
 * @author: Sánchez Urbano Cynthia Lizbeth
 * @version: 10/04/2023
 */
public class ApiResponse {
    /* Atributo de tipo String, representa el mensaje de la respuesta de la API */
    private String message;

    /**
     * Constructor de ApiResponse.
     * @param message, el mensaje de la respuesta de la API.
     */
	public ApiResponse(String message) {
		super();
		this.message = message;
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
}
