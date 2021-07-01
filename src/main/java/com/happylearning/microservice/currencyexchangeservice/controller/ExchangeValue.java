package com.happylearning.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;

public class ExchangeValue {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionAmount;
    private int port;

    public ExchangeValue() {
    }

    public int getPort() {
        return port;
    }

    public ExchangeValue(String from, String to, BigDecimal conversionAmount, int port) {
        this.from = from;
        this.to = to;
        this.conversionAmount = conversionAmount;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionAmount() {
        return conversionAmount;
    }
}
