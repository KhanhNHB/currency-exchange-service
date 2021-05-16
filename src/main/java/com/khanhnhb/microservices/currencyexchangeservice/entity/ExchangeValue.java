package com.khanhnhb.microservices.currencyexchangeservice.entity;

public class ExchangeValue {
    private Long id;
    private String from;
    private String to;
    private Long conversionMultiple;
    private Integer port;

    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, Long conversionMultiple, Integer port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Long getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(Long conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
