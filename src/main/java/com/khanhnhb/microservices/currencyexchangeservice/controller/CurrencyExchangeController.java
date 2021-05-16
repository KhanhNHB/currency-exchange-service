package com.khanhnhb.microservices.currencyexchangeservice.controller;

import com.khanhnhb.microservices.currencyexchangeservice.entity.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyExchangeController {

    @Autowired
    Environment environment;

    @GetMapping("/currency-exchange")
    public ResponseEntity<ExchangeValue> retrieveCurrencyExchange(@RequestParam("from") String from, @RequestParam("to") String to) {
        return new ResponseEntity<>(new ExchangeValue(123L, from, to, 123L,
                Integer.parseInt(environment.getProperty("local.server.port"))), HttpStatus.OK);
    }
}
