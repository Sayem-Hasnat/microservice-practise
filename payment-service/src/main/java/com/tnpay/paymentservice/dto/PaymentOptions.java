package com.tnpay.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class PaymentOptions {
    private String type;
    private String code;
}
