package com.exchangerate.api.entity;

public class Data {
        private String id;
        private String symbol;
        private String currencySymbol;
        private String type;
        private String rateUsd;
    
        // Constructor vacío necesario para la deserialización
        public Data() {}
    
        // Getters y setters para los campos
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getSymbol() {
            return symbol;
        }
    
        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
    
        public String getCurrencySymbol() {
            return currencySymbol;
        }
    
        public void setCurrencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
        }
    
        public String getType() {
            return type;
        }
    
        public void setType(String type) {
            this.type = type;
        }
    
        public String getRateUsd() {
            return rateUsd;
        }
    

        public void setRateUsd(String rateUsd) {
            this.rateUsd = rateUsd;
        }
    }
