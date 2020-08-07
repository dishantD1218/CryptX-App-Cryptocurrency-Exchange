package com.cryptexchange.lil.cryptexchange.RestService;

import com.cryptexchange.lil.cryptexchange.Data.ExchangeData;
import com.cryptexchange.lil.cryptexchange.Data.ExchangeDataBitfinnex;
import com.cryptexchange.lil.cryptexchange.Data.CoinEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "/cryptx")

public class BitcoinRestService {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/bitcoin")
    @ResponseStatus(HttpStatus.OK)
    public CoinEntity[] getBTC() {
        CoinEntity[] coinArr = new CoinEntity[2];

        ExchangeData BTC = restTemplate.getForObject(
                "https://api.exchange.bitcoin.com/api/2/public/ticker/btcusd", ExchangeData.class);
        ExchangeData ETH = restTemplate.getForObject(
                "https://api.exchange.bitcoin.com/api/2/public/ticker/ethusd", ExchangeData.class);

        coinArr[0] = BTC.getCointData().setCoin("BTC").setName("Bitcoin");
        coinArr[1] = ETH.getCointData().setCoin("ETH").setName("Ethereum");

        return coinArr;

    }

    @GetMapping("/bitfinex")
    @ResponseStatus(HttpStatus.OK)
    public CoinEntity[] getETH() {
        CoinEntity[] coinArr = new CoinEntity[2];

        ExchangeDataBitfinnex BTC_Bit = restTemplate.getForObject(
                "https://api.bitfinex.com/v1/pubticker/btcusd", ExchangeDataBitfinnex.class);
        ExchangeDataBitfinnex ETH_Bit = restTemplate.getForObject(
                "https://api.bitfinex.com/v1/pubticker/ethusd", ExchangeDataBitfinnex.class);

        coinArr[0] = BTC_Bit.getCointData().setCoin("BTC").setName("Bitcoin");
        coinArr[1] = ETH_Bit.getCointData().setCoin("ETH").setName("Ethereum");

        return coinArr;

    }

    @GetMapping("/Recommendation")
    @ResponseStatus(HttpStatus.OK)

    public String getRecommendation() {
        ExchangeData BTC = restTemplate.getForObject(
                "https://api.exchange.bitcoin.com/api/2/public/ticker/btcusd", ExchangeData.class);
        ExchangeData ETH = restTemplate.getForObject(
                "https://api.exchange.bitcoin.com/api/2/public/ticker/ethusd", ExchangeData.class);
        ExchangeDataBitfinnex BTC_Bit = restTemplate.getForObject(
                "https://api.bitfinex.com/v1/pubticker/btcusd", ExchangeDataBitfinnex.class);
        ExchangeDataBitfinnex ETH_Bit = restTemplate.getForObject(
                "https://api.bitfinex.com/v1/pubticker/ethusd", ExchangeDataBitfinnex.class);

        double sellBitcoin_BTC = Double.parseDouble(BTC.getAsk());
        double sellBitfinex_BTC = Double.parseDouble(BTC_Bit.getAsk());
        double buyBitcoin_BTC = Double.parseDouble(BTC.getBid());
        double buyBitfinex_BTC = Double.parseDouble(BTC_Bit.getBid());

        double sellBitcoin_ETH = Double.parseDouble(ETH.getAsk());
        double sellBitfinex_ETH = Double.parseDouble(ETH_Bit.getAsk());
        double buyBitcoin_ETH = Double.parseDouble(ETH.getBid());
        double buyBitfinex_ETH = Double.parseDouble(ETH_Bit.getBid());

        String str = "{";
        if(buyBitcoin_BTC>buyBitfinex_BTC) {
            str += "\"buyExchange_BTC\":\"Bitcoin.com\",";
            str += "\"buy_BTC\":" + buyBitcoin_BTC + ",";
        } else {
            str += "\"buyExchange_BTC\":\"Bitfinex\",";
            str += "\"buy_BTC\":" + buyBitfinex_BTC + ",";
        }

        if(sellBitcoin_BTC>sellBitfinex_BTC) {
            str += "\"sellExchange_BTC\": \"Bitcoin.com\",";
            str += "\"sell_BTC\":" + sellBitcoin_BTC + ",";
        } else {
            str += "\"sellExchange_BTC\":\"Bitfinex\",";
            str += "\"sell_BTC\":" + sellBitfinex_BTC + ",";
        }

        if(buyBitcoin_ETH>buyBitfinex_ETH) {
            str += "\"buyExchange_ETH\":\"Bitcoin.com\",";
            str += "\"buy_ETH\":" + buyBitcoin_ETH + ",";
        } else {
            str += "\"buyExchange_ETH\":\"Bitfinex\",";
            str += "\"buy_ETH\":" + buyBitfinex_ETH + ",";

        }

        if(buyBitcoin_ETH>buyBitfinex_ETH) {
            str += "\"sellExchange_ETH\":\"Bitcoin.com\",";
            str += "\"sell_ETH\":" + sellBitcoin_ETH ;
        } else {
            str += "\"sellExchange_ETH\":\"Bitfinex\",";
            str += "\"sell_ETH\":" + sellBitfinex_ETH;

        }
        str += "}";

        return str;
    }

}
