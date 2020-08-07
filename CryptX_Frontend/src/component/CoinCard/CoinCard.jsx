import React from "react";

import bitcoin from '../../assets/bitcoin.svg';
import ethereum from '../../assets/ethereum.svg';
import bitcoin_icon from '../../assets/bitcoini_com.png';
import bitfinex from '../../assets/bitfinex_com.jpg';

const CoinCard = (props) => {
  return (
    <div>
      <div  style={{ padding: '8px', display: 'grid', gridTemplateColumns: '32px 1fr 14px', fontSize: '27px'}}>
        {props.coin[0].exchange==='Bitcoin.com' ?
                      <img alt="BTC icon" src={bitcoin_icon} width="30px" /> :
                      <img alt="BTC icon" src={bitfinex} width="30px" />
                    }
        <span>{props.coin[0].exchange}</span>
      </div>
      {props.coin ? props.coin.map(c =>
        <div class="sc-fznWqX cBuHL sc-qOvHb iaNjcG">
          <a href="/crypto/BTC">
            <div class="sc-qWgaf ePgZJE">
              {c.name === 'Bitcoin' ?
                <img alt="BTC icon" src={bitcoin} width="32" /> :
                <img alt="BTC icon" src={ethereum} width="32" height= '35px'/>
              }
              <div><div>{c.name}</div>
                <div class="sc-pDbHj MKhwC">{c.coin}</div>
              </div>
            </div>
          </a>
          <div class="sc-pLwIe edWcep">
            <div style={{width: '50%', paddingLeft: '45px'}}>
            <div style={{    fontSize: '14px'}}>BUY</div>
              <div>
                <h4 class="sc-fzowVh sc-pTWqp cRRUab">${c.buy}</h4>
              </div>
            </div>
              <div>
              <div style={{color: 'rgb(10, 193, 142)',  fontSize: '14px'}}>SELL</div>
                <div class="sc-qcrrk dPeTyD">
                  ${c.sell}
                </div>
              </div>
            </div>
          </div>
      ) : null}
    </div>

      );
};

export default CoinCard;
