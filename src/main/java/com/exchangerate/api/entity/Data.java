package com.exchangerate.api.entity;

/**
 * Clase Data, clase que mapea los datos del objeto Data de la API CoinCap.
 * 
 * @author: Sánchez Urbano Cynthia Lizbeth
 * @version: 10/04/2023
 */
public class Data {
        /* Atributo id que se mapea del id en la respuesta de la API */
        private String id;
        /* Atributo symbol que se mapea del symbol en la respuesta de la API */
        private String symbol;
        /* Atributo currencySymbol que se mapea del currencySymbol en la respuesta de la API */
        private String currencySymbol;
        /* Atributo type que se mapea del type en la respuesta de la API */
        private String type;
        /* Atributo rateUsd que se mapea del rateUsd en la respuesta de la API */
        private String rateUsd;
    
        /**
         * Constructor vacío necesario para el mapeo de la respuesta de la API.
         */
        public Data() {}
    
        /**
         * Método que obtiene el valor del atributo id.
         * @return id
         */
        public String getId() {
            return id;
        }

        /**
         * Método que asigna un nuevo valor al atributo id.
         * @param id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * Método que obtiene el valor del atributo symbol.
         * @return symbol
         */
        public String getSymbol() {
            return symbol;
        }

        /**
         * Método que asigna un nuevo valor al atributo symbol.
         * @param symbol
         */
        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        /**
         * Método que obtiene el valor del atributo currencySymbol.
         * @return currencySymbol
         */
        public String getCurrencySymbol() {
            return currencySymbol;
        }

        /**
         * Método que asigna un nuevo valor al atributo currencySymbol.
         * @param currencySymbol
         */
        public void setCurrencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
        }

        /**
         * Método que obtiene el valor del atributo type.
         * @return type
         */
        public String getType() {
            return type;
        }

        /**
         * Método que asigna un nuevo valor al atributo type.
         * @param type
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * Método que obtiene el valor del atributo rateUsd.
         * @return rateUsd
         */
        public String getRateUsd() {
            return rateUsd;
        }

        /**
         * Método que asigna un nuevo valor al atributo rateUsd.
         * @param rateUsd
         */
        public void setRateUsd(String rateUsd) {
            this.rateUsd = rateUsd;
        }
    }
