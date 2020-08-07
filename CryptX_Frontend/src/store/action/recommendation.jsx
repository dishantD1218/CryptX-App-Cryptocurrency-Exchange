import * as actionType from './actionType';
import axios from '../../axios_cryptx';

export const transactionStart = () => {
    return {
        type: actionType.TRANS_RECOM_FAILED
    }
}
export const transactionSuccess = (res) => {
    return {
        type: actionType.TRANS_RECOM_SUCCESS,
        response: res.data
    }
}
export const transactionFailed = (error) => {
    return {
        type: actionType.TRANS_RECOM_FAILED,
        error: error
    }
}

export const getRecommendation = () => {
   
    return dispatch => {
        dispatch(transactionStart())
        axios.get('/cryptx/Recommendation').then(res => {
            console.log(res);
            dispatch(transactionSuccess(res));
        }).catch(error => {
            dispatch(transactionFailed(error))
        })
    }
}