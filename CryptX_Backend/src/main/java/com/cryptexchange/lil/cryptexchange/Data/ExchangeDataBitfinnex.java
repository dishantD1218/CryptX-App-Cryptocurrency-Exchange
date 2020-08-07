package com.cryptexchange.lil.cryptexchange.Data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mid",
        "bid",
        "ask",
        "last_price",
        "low",
        "high",
        "volume",
        "timestamp"
})
public class ExchangeDataBitfinnex {

    @JsonProperty("mid")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String mid = "";

    @JsonProperty("bid")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String bid = "";

    @JsonProperty("ask")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String ask = "";

    @JsonProperty("last_price")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String lastPrice = "";

    @JsonProperty("low")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String low = "";

    @JsonProperty("high")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String high = "";

    @JsonProperty("volume")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String volume = "";

    @JsonProperty("timestamp")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String timestamp = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mid")
    public String getMid() {
        return mid;
    }

    @JsonProperty("mid")
    public void setMid(String mid) {
        this.mid = mid;
    }

    @JsonProperty("bid")
    public String getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(String bid) {
        this.bid = bid;
    }

    @JsonProperty("ask")
    public String getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(String ask) {
        this.ask = ask;
    }

    @JsonProperty("last_price")
    public String getLastPrice() {
        return lastPrice;
    }

    @JsonProperty("last_price")
    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    @JsonProperty("low")
    public String getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(String low) {
        this.low = low;
    }

    @JsonProperty("high")
    public String getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(String high) {
        this.high = high;
    }

    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CoinEntity getCointData() {
        CoinEntity coin =  new CoinEntity();
        coin.setExchange("Bitfinex");
        coin.setSell(Double.parseDouble(getAsk()));
        coin.setBuy(Double.parseDouble(getBid()));
        return coin;
    }

//    @Override
//    public String toString() {
//        return "{"+ "\"exchange\":\"bitfinex\"" +
//                ",\"buy\":" + Double.parseDouble(getBid())  +
//                ",\"sell\":" + Double.parseDouble(getAsk())  +
//                '}';
//    }

}