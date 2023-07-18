package com.tnpay.fraudchecker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/fraud-checker/api")
@RequestMapping("/")
public class FraudCheckerController {
    private Logger logger = LoggerFactory.getLogger(FraudCheckerController.class);

    @GetMapping("hello")
    public String hello() {

        return "Hello FraudChecker Service";
    }


}