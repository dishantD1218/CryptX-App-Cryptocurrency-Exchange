import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

import { Provider } from 'react-redux';
import { createStore, combineReducers, compose, applyMiddleware } from 'redux';
import thunk from 'redux-thunk';

import recommReducer from './store/reducer/recommendation';
import bitcoinReducer from './store/reducer/bitcoin';
import bitfinexReducer from './store/reducer/bitfinex';

const composeReducer = combineReducers({
    RecReducer: recommReducer,
    bitcoinReducer: bitcoinReducer,
    bitfinexReducer: bitfinexReducer
    
})

const composeEnhancers = window._REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

const store = createStore(composeReducer, composeEnhancers(
    applyMiddleware(thunk)
));

ReactDOM.render(
    <React.StrictMode>
        <Provider store={store}>
            <App />
        </Provider>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
