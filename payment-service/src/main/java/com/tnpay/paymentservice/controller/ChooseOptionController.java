package com.tnpay.paymentservice.controller;

import com.tnpay.paymentservice.CurrencyConverterProxy;
import com.tnpay.paymentservice.dto.CurrencyExchange;
import com.tnpay.paymentservice.dto.PaymentOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/payment-service/api")
@RequestMapping("/")
public class ChooseOptionController {
    private Logger logger = LoggerFactory.getLogger(ChooseOptionController.class);

    @Autowired
    private CurrencyConverterProxy currencyConverterProxy;
    @GetMapping("hello")
    public String hello() {
        return "Hello Payment Service";
    }

    @GetMapping("payment-options")
    public PaymentOptions getOptions() {
        return new PaymentOptions("Visa","UCBV6237");
    }

    @GetMapping("get-exchange-rate")
    public List<CurrencyExchange> getExchangeRate() {
        List<CurrencyExchange> currencyExchange =
                currencyConverterProxy.retrieveExchangeValue();
        return currencyExchange;
    }
}