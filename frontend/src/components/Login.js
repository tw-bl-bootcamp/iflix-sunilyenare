import React, { Component } from "react";
import Button from "@material-ui/core/Button";
import CssBaseline from "@material-ui/core/CssBaseline";
import TextField from "@material-ui/core/TextField";
import Link from "@material-ui/core/Link";
import Grid from "@material-ui/core/Grid";
import Typography from "@material-ui/core/Typography";
import Container from "@material-ui/core/Container";
import Snackbar from "@material-ui/core/Snackbar";
import { Box } from "@material-ui/core";
import { userLogin } from "../services/UserService";

class Login extends Component {
  constructor(props) {
    super(props);
    this.state = {
      email: "",
      password: ""
    };
    //preserve initial state in new object
    this.baseState = this.State;
  }
  handleEmail = event => {
    const email = event.target.value;
    this.setState({ email: email });
  };
  handlePassword = event => {
    const password = event.target.value;
    this.setState({ password: password });
  };
  handleSubmit = e => {
    e.preventDefault();
    //email validation
    if (this.state.email.length === 0) {
      this.setState({
        openSnackBar: true,
        snackBarMessage: "Please Enter Email Id"
      });
    } else if (
      !/^[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[A-Za-z]+$/.test(this.state.email)
    ) {
      this.setState({
        openSnackBar: true,
        snackBarMessage: "Please Enter Valid Email"
      });
    }
    //Password validation
    else if (this.state.password.length === 0) {
      this.setState({
        openSnackBar: true,
        snackBarMessage: "Please Enter Password"
      });
    } else {
      this.setState({
        openSnackBar: false
      });
      var data = {
        email: this.state.email,
        password: this.state.password
      };
      userLogin(data)
        .then(response => {
          console.log("Login Successfull.");
          console.log(response)
          localStorage.setItem("token", response.data.token);
          
         this.props.history.push("/dashboard");
        })
        .catch(error => {
         console.log(error.data)
        });
    }
  };


  /** auto close SnackBar */
  handleSnackClose = () => {
    this.setState({
      openSnackBar: false
    });
  };
  render() {
    return (
      <div className="root">
   
          <Box   boxShadow={3}
        bgcolor="background.paper"
        p={9}
       m={10}
        >
          
          <Container  maxWidth='xs'>
         
          <Typography component="h3" variant="h3" color='inherit'  color="primary">
          IFlix cinema <img
                                 width='11%' 
                                 height='11%'
                                src={require('../assets/Papernotes.svg')}
                                alt="icon"
                            />
              </Typography>
            <CssBaseline />
         
            <div className="paper">
              <Typography component="h1" variant="h5">
                Sign in
              </Typography>
              <form autoComplete="off" className="formoValidate">
                <Grid container spacing={2} >
                  <Grid item xs={12}>
                    <TextField
                      autoComplete='false'
                      variant="outlined"
                      margin="normal"
                      fullWidth
                      id="email"
                      label="Email Address"
                      placeholder="Enter Email"
                      name="email"
                      value={this.state.email}
                      onChange={this.handleEmail.bind(this)}
                      autoFocus
                    />
                  </Grid>
                  <Grid item xs={12}>
                    <TextField
                    autoComplete='false'
                      variant="outlined"
                      margin="normal"
                      fullWidth
                      name="password"
                      label="Password"
                      placeholder="Enter Password"
                      type="password"
                      id="password"
                      value={this.state.password}
                      onChange={this.handlePassword.bind(this)}
                      autoComplete="current-password"
                    />
                  </Grid>

                  <Grid item xs={12}>
                    <Button
                      type="submit"
                      fullWidth
                      variant="contained"
                      color="primary"
                      className="submit"
                      onClick={this.handleSubmit}
                    >
                      Sign In
                    </Button>
                  </Grid>
                  <Grid container>
                    <Grid item xs>
                      <Link href="/forgotpassword" variant="body2">
                        Forgot password?
                      </Link>
                    </Grid>
                    <Grid item>
                      <Link href="/register" variant="body2">
                        {"Don't have an account? Sign Up"}
                      </Link>
                    </Grid>
                  </Grid>
                

                
                </Grid>
              </form>
            </div>
            <Snackbar
              anchorOrigin={{
                vertical: "top",
                horizontal: "center"
              }}
              open={this.state.openSnackBar}
              autoHideDuration={1000}
              onClose={this.state.handleSnackBarClose}
              varient="error"
              ContentProps={{
                "aria-describedby": "message_id"
              }}
              message={
                <span id="message_id">{this.state.snackBarMessage}</span>
              }
              action={[
                <div key="undo">
                  <Button
                    key="undo"
                    color="primary"
                    size="small"
                    onClick={this.handleSnackClose}
                  >
                    Undo
                  </Button>
                </div>
              ]}
            />
          </Container>
        </Box>
      </div>
    );
  }
}
export default Login;
