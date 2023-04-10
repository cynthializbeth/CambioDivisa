package com.exchangerate.api.entity;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeRate {
    private Data data;
    private long timestamp;

    // Constructor vacío necesario para la deserialización
    public ExchangeRate() {}

    // Getters y setters para los campos
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}