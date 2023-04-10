package com.exchangerate.api.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.exchangerate.api.entity.CoinCapObject;
import com.exchangerate.exception.ApiException;
import com.exchangerate.api.entity.ExchangeRate;

/**
 * Clase CtrlExchangeRate, controlador de la API ExchangeRate.
 * 
 * @author: Sánchez Urbano Cynthia Lizbeth
 * @version: 10/04/2023
 */
@RestController
public class CtrlExchangeRate {
    
    /**
     * Método getExchangeRate, obtiene el tipo de cambio de una divisa.
     * Usamos RestTemplate para realizar la solicitud GET a la API CoinCap.
     * La respuesta de la API CoinCap es deserializada a un objeto CoinCapObject.
     * Si la respuesta es nula, se lanza una excepción. Si no, se crea una instancia de ExchangeRate
     * 
     * @param currency, divisa a consultar.
     * @return ResponseEntity<ExchangeRate>, cambio en dolares obtenido de la API CoinCap.
     */
    @GetMapping("/rate/{currency}")
    public ResponseEntity<ExchangeRate> getExchangeRate(@PathVariable String currency) {
        RestTemplate restTemplate = new RestTemplate();
    
        // Realiza la solicitud GET a la API CoinCap y obtiene la respuesta
        String url = "https://api.coincap.io/v2/rates/" + currency;
        CoinCapObject response = restTemplate.getForObject(url, CoinCapObject.class);
    
        if (response == null || response.getData() == null) {
            throw new ApiException(HttpStatus.NOT_FOUND, "Divisa no encontrada: " + currency);
        }
    
        ExchangeRate simpleResponse = new ExchangeRate();
        simpleResponse.setRate(Double.parseDouble(response.getData().getRateUsd()));
    
        return new ResponseEntity<>(simpleResponse, HttpStatus.OK);
    }
    
}
