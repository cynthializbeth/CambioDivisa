package com.exchangerate.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.exchangerate.api.entity.ExchangeRate;
import com.exchangerate.exception.ApiException;

@RestController
public class CtrlExchangeRate {
    
    @GetMapping("/rate/{id}")
    public ExchangeRate getExchangeRate(@PathVariable String id) {
        // Crea una instancia de RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Realiza la solicitud GET a la API CoinCap y obtiene la respuesta
        String url = "https://api.coincap.io/v2/rates/" + id;
        ExchangeRate response = restTemplate.getForObject(url, ExchangeRate.class);

        // Verifica si la respuesta es nula
        if (response == null) {
            throw new ApiException("Divisa no encontrada: " + id);
        }

        // Retorna la respuesta de la API CoinCap al cliente
        return response;
    }
    
}
