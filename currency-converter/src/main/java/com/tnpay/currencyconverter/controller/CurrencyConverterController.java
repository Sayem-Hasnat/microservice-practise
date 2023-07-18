package com.tnpay.currencyconverter.controller;

import com.tnpay.currencyconverter.dto.CurrencyExchange;
import com.tnpay.currencyconverter.repository.CurrencyExchangeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/currency-Converter/api")
@RequestMapping("/")
public class CurrencyConverterController {
    private Logger logger = LoggerFactory.getLogger(CurrencyConverterController.class);

    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    @GetMapping("hello")
    public String hello() {
        return "Hello Currency-Converter Service";
    }

    @GetMapping("exchange/from/{from}/to/{to}")
    public CurrencyExchange exchangeRate(@PathVariable String from,
                                         @PathVariable String to) {
        String port = environment.getProperty("local.server.port");
        return new CurrencyExchange(100L, "Dollar", 100,port);
    }

    @PostMapping("exchange-rate")
    public CurrencyExchange saveCurrency(@RequestBody CurrencyExchange currency){
       return currencyExchangeRepository.save(currency);
    }

    @GetMapping("exchange-rate")
    public List<CurrencyExchange> getCurrency(){
        List<CurrencyExchange> exchangeList = currencyExchangeRepository.findAll();
        for(CurrencyExchange exchange : exchangeList){
            exchange.setEnvironment(environment.getProperty("local.server.port"));
        }
        return exchangeList;
    }

}