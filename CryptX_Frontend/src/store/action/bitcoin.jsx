import * as actionType from './actionType';
import axios from '../../axios_cryptx';

export const transactionStart = () => {
    return {
        type: actionType.TRANS_BITCOIN_START
    }
}
export const transactionSuccess = (res) => {
    return {
        type: actionType.TRANS_BITCOIN_SUCCESS,
        response: res.data
    }
}
export const transactionFailed = (error) => {
    return {
        type: actionType.TRANS_BITCOIN_FAILED,
        error: error
    }
}

export const getBitcoin = () => {
    return dispatch => {
        dispatch(transactionStart())
        axios.get('/cryptx/bitcoin').then(res => {
            console.log(res);
            dispatch(transactionSuccess(res));
        }).catch(error => {
            dispatch(transactionFailed(error))
        })
    }
}