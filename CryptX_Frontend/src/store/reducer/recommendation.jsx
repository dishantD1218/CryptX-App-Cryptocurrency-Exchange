const initialState = {
    recommendation: null,
    loading: false,
    error: null,
    contacted: false
}

const reducer = (state = initialState, action) => {
    switch (action.type) {
        case ('TRANS_RECOM_START'):
            return {
                ...state,
                loading: true,
                error: null
            };
        case ('TRANS_RECOM_SUCCESS'):
            return {
                ...state,
                recommendation: action.response,
                loading: false,
                contacted: true,
                error: null
            };
        case ('TRANS_RECOM_FAILED'):
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