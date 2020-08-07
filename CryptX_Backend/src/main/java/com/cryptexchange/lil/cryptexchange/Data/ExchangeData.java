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


/**
 * The root schema
 * <p>
 * The root schema comprises the entire JSON document.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "symbol",
        "ask",
        "bid",
        "last",
        "low",
        "high",
        "open",
        "volume",
        "volumeQuote",
        "timestamp"
})
public class ExchangeData {

    @JsonProperty("symbol")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String symbol = "";
    @JsonProperty("ask")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String ask = "";
    @JsonProperty("bid")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String bid = "";
    @JsonProperty("last")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String last = "";
    @JsonProperty("low")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String low = "";
    @JsonProperty("high")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String high = "";
    @JsonProperty("open")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String open = "";
    @JsonProperty("volume")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String volume = "";
    @JsonProperty("volumeQuote")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String volumeQuote = "";
    @JsonProperty("timestamp")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String timestamp = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("ask")
    public String getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(String ask) {
        this.ask = ask;
    }
    @JsonProperty("bid")
    public String getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(String bid) {
        this.bid = bid;
    }
    @JsonProperty("last")
    public String getLast() {
        return last;
    }
    @JsonProperty("last")
    public void setLast(String last) {
        this.last = last;
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
    @JsonProperty("open")
    public String getOpen() {
        return open;
    }
    @JsonProperty("open")
    public void setOpen(String open) {
        this.open = open;
    }
    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }
    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }
    @JsonProperty("volumeQuote")
    public String getVolumeQuote() {
        return volumeQuote;
    }
    @JsonProperty("volumeQuote")
    public void setVolumeQuote(String volumeQuote) {
        this.volumeQuote = volumeQuote;
    }
    @JsonProperty("timestamp")
    public String getTimestamp()
    {
        return timestamp;
    }
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp)
    {
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
        coin.setExchange("Bitcoin.com");
        coin.setCoin(getSymbol());
        coin.setSell(Double.parseDouble(getAsk()));
        coin.setBuy(Double.parseDouble(getBid()));
        return coin;
    }

}