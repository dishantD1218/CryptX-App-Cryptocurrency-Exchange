import React, { Component } from "react";
import logo from "./logo.svg";
import classes from "./App.css";
import Container from "@material-ui/core/Container";
import MainPage from "./containers/MainPage";


class App extends Component {
  render() {
    return (
      <Container fixed>
        <MainPage></MainPage>
      </Container>
    );
  }
}

export default App;
