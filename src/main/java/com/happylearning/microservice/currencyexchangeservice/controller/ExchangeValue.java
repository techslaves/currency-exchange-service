package com.happylearning.microservice.currencyexchangeservice.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {

    @Id
    private Long id;

    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;

    @Column(name="conversion_multiple")
    private BigDecimal conversionAmount;

    @Column(name="port")
    private Integer port;

    public ExchangeValue() {
    }

    public Integer getPort() {
        return port;
    }

    public ExchangeValue(String from, String to, BigDecimal conversionAmount, Integer port) {
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
