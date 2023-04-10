package com.exchangerate.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeRateSimple {
    @JsonProperty("rate")
    private Double rate;

    public ExchangeRateSimple() {}

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
    
}
