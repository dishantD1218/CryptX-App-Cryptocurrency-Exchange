const initialState = {
    bitfinex: null,
    loading: false,
    error: null,
    contacted: false
}

const reducer = (state = initialState, action) => {
    switch (action.type) {
        case ('TRANS_BITFINEX_START'):
            return {
                ...state,
                loading: true,
                error: null
            };
        case ('TRANS_BITFINEX_SUCCESS'):
            return {
                ...state,
                bitfinex: action.response,
                loading: false,
                contacted: true,
                error: null
            };
        case ('TRANS_BITFINEX_FAILED'):
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