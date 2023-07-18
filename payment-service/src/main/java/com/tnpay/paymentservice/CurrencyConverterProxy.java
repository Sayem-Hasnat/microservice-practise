package com.tnpay.paymentservice;

import com.tnpay.paymentservice.dto.CurrencyExchange;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "currency-converter", url="localhost:8005")
@FeignClient(name = "currency-converter")
public interface CurrencyConverterProxy {

        @GetMapping("/exchange-rate")
        List<CurrencyExchange> retrieveExchangeValue();
}
