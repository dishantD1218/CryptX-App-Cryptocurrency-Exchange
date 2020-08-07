const initialState = {
    bitcoin: null,
    loading: false,
    error: null,
    contacted: false
}

const reducer = (state = initialState, action) => {
    switch (action.type) {
        case ('TRANS_BITCOIN_START'):
            return {
                ...state,
                loading: true,
                error: null
            };
        case ('TRANS_BITCOIN_SUCCESS'):
            return {
                ...state,
                bitcoin: action.response,
                loading: false,
                contacted: true,
                error: null
            };
        case ('TRANS_BITCOIN_FAILED'):
            return {
                ...state,
                error: action.error,
                loading: false
            };
        default:
            return state;
    }
}

export default reducer;