import * as actionType from './actionType';
import axios from '../../axios_cryptx';

export const transactionStart = () => {
    return {
        type: actionType.TRANS_BITFINEX_START
    }
}
export const transactionSuccess = (res) => {
    return {
        type: actionType.TRANS_BITFINEX_SUCCESS,
        response: res.data
    }
}
export const transactionFailed = (error) => {
    return {
        type: actionType.TRANS_BITFINEX_FAILED,
        error: error
    }
}

export const getBitfinex = () => {
    return dispatch => {
        dispatch(transactionStart())
        axios.get('/cryptx/bitfinex').then(res => {
            console.log(res);
            dispatch(transactionSuccess(res));
        }).catch(error => {
            dispatch(transactionFailed(error))
        })
    }
}