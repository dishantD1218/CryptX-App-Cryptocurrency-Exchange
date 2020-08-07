import React, { Component } from "react";
import CoinCard from "../component/CoinCard/CoinCard";
import RecommendationCard from "../component/CoinCard/RecommendationCard";
import "./MainPage.css";

import { connect } from 'react-redux';
import * as transaction from '../store/action/index';

class MainPage extends Component {

    constructor(props) {
        super(props);
        this.props.ongetRecommendation();
        this.props.ongetBitcoin();
        this.props.ongetBitfinex();
    }

    render() {
        return (
            <div style={{ alignContent:'center'}}>
                <div style={{ display: "flex", flexDirection: "row" }}>
                    <div style={{ width: '50%' }}>
                        {this.props.bitcoin ?
                            <CoinCard coin={this.props.bitcoin}></CoinCard> : 'No data'}
                    </div>
                    <div style={{ width: '50%' }}>
                        {this.props.bitfinex ?
                            <CoinCard coin={this.props.bitfinex}></CoinCard> : 'No data'}
                    </div>
                </div>
                <div>
                    {this.props.recommendation ?
                        <RecommendationCard recommendation={this.props.recommendation}></RecommendationCard> : 'No data'}
                </div>
            </div>
        );
    }
}

const mapStateToProps = state => {
    return {
        recommendation: state.RecReducer.recommendation,
        bitcoin: state.bitcoinReducer.bitcoin,
        bitfinex: state.bitfinexReducer.bitfinex
    }
}

const dispatchPropsToState = dispatch => {
    return {
        ongetRecommendation: () => dispatch(transaction.getRecommendation()),
        ongetBitcoin: () => dispatch(transaction.getBitcoin()),
        ongetBitfinex: () => dispatch(transaction.getBitfinex())
    }
}

export default connect(mapStateToProps, dispatchPropsToState)(MainPage);
