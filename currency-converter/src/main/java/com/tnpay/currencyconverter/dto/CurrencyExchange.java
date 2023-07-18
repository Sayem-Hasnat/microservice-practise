package com.tnpay.currencyconverter.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="currency-exchange")
public class CurrencyExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "currency-type", nullable = false)
    private String currencyType;

    @Column(name = "currency-rate", nullable = false)
    private int currencyRate;
    @Column(name = "environment")
    private String environment;

}
