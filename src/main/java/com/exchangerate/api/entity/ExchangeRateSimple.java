package com.exchangerate.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeRateSimple {
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("rate")
    private String rate;

    public ExchangeRateSimple() {}

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
    
}
