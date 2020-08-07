import React from "react";
import { makeStyles } from "@material-ui/core/styles";
import Card from "@material-ui/core/Card";
import CardActions from "@material-ui/core/CardActions";
import CardContent from "@material-ui/core/CardContent";
import Button from "@material-ui/core/Button";
import Typography from "@material-ui/core/Typography";
import "./CoinCard.css";


import bitcoin from '../../assets/bitcoini_com.png';
import bitfinex from '../../assets/bitfinex_com.jpg';

const useStyles = makeStyles({
  coinCard: {
    display: 'flex',
    flexDirection: 'row'
  },
  root: {
    minWidth: 275,
    textAlign: 'center',
    marginRight: '10px'
  },
  bullet: {
    display: "inline-block",
    margin: "0 2px",
    transform: "scale(0.8)",
  },
  title: {
    fontSize: 15,
  },
  pos: {
    marginBottom: 12,
  },
});

const RecommendationCard = (props) => {
  const classes = useStyles();
  const bull = <span className={classes.bullet}>•</span>;

  return (

    <div>
      <span style={{ fontSize: '27px' }}>Recommendation</span>
      {props.recommendation ? <div style={{ display: "flex", marginTop: '20px' }}>
        <Card className={classes.root}>
          <div style={{ textAlign: 'center', marginTop: '16px', fontFamily: '"SF Mono", sans-serif' }}>
            BUY
            </div>
          <CardContent className={classes.coinCard}>
            <div>
            <span style={{ fontWeight: 'bold' }}>
                <span style={{ textDecoration: 'underline' }}>
                Bitcoin 
                </span>(BTC)
              </span>
              <div style={{ paddingTop: '30px', display: 'grid', gridTemplateColumns: '32px 1fr 14px', fontSize: '20px' }}>
                {props.recommendation.buyExchange_BTC === 'Bitcoin.com' ?
                  <img alt="BTC icon" src={bitcoin} width="25px" /> :
                  <img alt="BTC icon" src={bitfinex} width="25px" />
                }
                {props.recommendation.buyExchange_BTC}
              </div>
              <div style={{padding: '13px'}}>
                ${props.recommendation.buy_BTC}
              </div>

            </div>
            <div style={{ borderLeft: '2px solid #afafaf', height: '18vh', margin: '7px' }}>

            </div>
            <div>
            <span style={{ fontWeight: 'bold' }}>
                <span style={{ textDecoration: 'underline' }}>
                Ethereum 
                </span>(ETH)
              </span>
              <div style={{ paddingTop: '30px', display: 'grid', gridTemplateColumns: '32px 1fr 14px', fontSize: '20px' }}>
                {props.recommendation.buyExchange_ETH === 'Bitcoin.com' ?
                  <img alt="BTC icon" src={bitcoin} width="25px" /> :
                  <img alt="BTC icon" src={bitfinex} width="25px" />
                }
                {props.recommendation.buyExchange_ETH}
              </div>
              <div style={{padding: '13px'}}>
                ${props.recommendation.buy_ETH}
              </div>
            </div>
          </CardContent>
        </Card>

        <Card className={classes.root}>
          <div style={{ textAlign: 'center', marginTop: '16px', fontFamily: '"SF Mono", sans-serif' }}>
            SELL
            </div>
          <CardContent className={classes.coinCard}>
            <div>
            <span style={{ fontWeight: 'bold' }}>
                <span style={{ textDecoration: 'underline' }}>
                Bitcoin
              </span>(BTC)
              </span>
              <div style={{ paddingTop: '30px', display: 'grid', gridTemplateColumns: '32px 1fr 14px', fontSize: '20px' }}>
                {props.recommendation.sellExchange_BTC === 'Bitcoin.com' ?
                  <img alt="BTC icon" src={bitcoin} width="25px" /> :
                  <img alt="BTC icon" src={bitfinex} width="25px" />
                }
                {props.recommendation.sellExchange_BTC}
              </div>
              <div style={{padding: '13px'}}>
                ${props.recommendation.sell_BTC}
              </div>

            </div>
            <div style={{ borderLeft: '2px solid #afafaf', height: '18vh', margin: '7px' }}>

            </div>
            <div>
              <span style={{ fontWeight: 'bold' }}>
                <span style={{ textDecoration: 'underline' }}>
                  Ethereum
                </span>(ETH)
              </span>
              <div style={{ paddingTop: '30px', display: 'grid', gridTemplateColumns: '32px 1fr 14px', fontSize: '20px' }}>
                {props.recommendation.sellExchange_ETH === 'Bitcoin.com' ?
                  <img alt="BTC icon" src={bitcoin} width="25px" /> :
                  <img alt="BTC icon" src={bitfinex} width="25px" />
                }
                {props.recommendation.sellExchange_ETH}
              </div>
              <div style={{padding: '13px'}}>
                ${props.recommendation.sell_ETH}
              </div>
            </div>
          </CardContent>
        </Card></div>
        : "no data"}
    </div>

  );
};

export default RecommendationCard;
