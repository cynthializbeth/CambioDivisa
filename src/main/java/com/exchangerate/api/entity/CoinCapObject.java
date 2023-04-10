package com.exchangerate.api.entity;

/**
 * Clase CoinCapObject, clase que mapea los datos de la resouesta de la API CoinCap.
 * 
 * @author: Sánchez Urbano Cynthia Lizbeth
 * @version: 10/04/2023
 */
public class CoinCapObject {
    /* Atributo de tipo data, representa el campo del mismo nombre que se obtiene en la respuesta de la API */
    private Data data;
    /* Atributo de tipo timestamp, representa el campo del mismo nombre que se obtiene en la respuesta de la API */
    private long timestamp;

    /**
     * Constructor vacío necesario para el mapeo de la respuesta de la API.
     */
    public CoinCapObject() {}

    /**
     * Método que obtiene el valor del atributo data.
     * @return data
     */
    public Data getData() {
        return data;
    }

    /**
     * Método que asigna un nuevo valor al atributo data.
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * Método que obtiene el valor del atributo timestamp.
     * @return timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Método que asigna un nuevo valor al atributo timestamp.
     * @param timestamp
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}