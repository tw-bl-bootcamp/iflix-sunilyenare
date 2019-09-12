import React, { Component } from "react";
import './App.css';
import { BrowserRouter as Router, Route } from "react-router-dom";
import Dashboard from "./components/Dashboard";
import Login from "./components/Login";

class App extends Component {
  render() {
    return (
      <div>
        <Router>
          <div className="App">
            <Route exact path="/" component={Login} />
            <Route path="/login" component={Login} />
            <Route exact path="/dashboard" component={Dashboard} />
          </div>
        </Router>
      </div>
    );
  }
}

export default App;
