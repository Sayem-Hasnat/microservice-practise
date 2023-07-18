package com.tnpay.financialapiintegration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/financial/api")
@RequestMapping("/")
public class FinancialApIController {
    private Logger logger = LoggerFactory.getLogger(FinancialApIController.class);

    @GetMapping("hello")
    public String hello() {

        return "Hello Financial ApI  Service";
    }


}