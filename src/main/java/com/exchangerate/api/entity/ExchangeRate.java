package com.exchangerate.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Clase ExchageRate, representación de un objeto ExchangeRate.
 * 
 * @author: Sánchez Urbano Cynthia Lizbeth
 * @version: 10/04/2023
 */
public class ExchangeRate {
    /* Atributo de tipo Double, representa el valor de la tasa de cambio */
    @JsonProperty("rate")
    private Double rate;

    /**
     * Constructor vacío necesario para el mapeo de la respuesta de la API.
     */
    public ExchangeRate() {}

    /**
     * Método que obtiene el valor del atributo rate.
     * @return rate
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Método que asigna un nuevo valor al atributo rate.
     * @param rate
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }
    
}
