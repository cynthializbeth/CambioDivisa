package com.exchangerate.api.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.exchangerate.api.entity.ExchangeRate;
import com.exchangerate.exception.ApiException;
import com.exchangerate.api.entity.ExchangeRateSimple;

@RestController
public class CtrlExchangeRate {
    
    @GetMapping("/rate/{currency}")
    public ResponseEntity<ExchangeRateSimple> getExchangeRate(@PathVariable String currency) {
        // Crea una instancia de RestTemplate
        RestTemplate restTemplate = new RestTemplate();
    
        // Realiza la solicitud GET a la API CoinCap y obtiene la respuesta
        String url = "https://api.coincap.io/v2/rates/" + currency;
        ExchangeRate response = restTemplate.getForObject(url, ExchangeRate.class);
    
        // Verifica si la respuesta es nula
        if (response == null || response.getData() == null) {
            throw new ApiException(HttpStatus.NOT_FOUND, "Divisa no encontrada: " + currency);
        }
    
        // Crea una instancia de ExchangeRateSimple y asigna los valores correspondientes
        ExchangeRateSimple simpleResponse = new ExchangeRateSimple();
        simpleResponse.setRate(Double.parseDouble(response.getData().getRateUsd()));
    
        // Retorna la respuesta simplificada de la API CoinCap al cliente
        return new ResponseEntity<>(simpleResponse, HttpStatus.OK);
    }
    
    
}
