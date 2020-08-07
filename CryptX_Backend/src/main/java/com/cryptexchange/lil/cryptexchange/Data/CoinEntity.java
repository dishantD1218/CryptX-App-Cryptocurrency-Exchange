package com.cryptexchange.lil.cryptexchange.Data;

public class CoinEntity {
    private String exchange;
    private String coin;
    private String name;
    private double buy;
    private double sell;

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCoin() {
        return coin;
    }

    public CoinEntity setCoin(String coin) {
        this.coin = coin;
        return this;
    }

    public String getName() {
        return name;
    }

    public CoinEntity setName(String name) {
        this.name = name;
        return this;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

}
