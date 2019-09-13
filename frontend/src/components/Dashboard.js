import React, { Component } from 'react'
import Toolbar from "@material-ui/core/Toolbar";
import Typography from "@material-ui/core/Typography";
import IconButton from "@material-ui/core/IconButton";
import { MuiThemeProvider, createMuiTheme } from "@material-ui/core";
import Button from "@material-ui/core/Button";
import { Box } from "@material-ui/core";
import Grid from "@material-ui/core/Grid";
import Container from "@material-ui/core/Container";
import Snackbar from "@material-ui/core/Snackbar";
import { userLogin } from "../services/UserService";

export default class Dashboard extends Component {
  constructor(props) {
      super(props)
  
      this.state = {
        open: true,
        popoverOpen: false,
        grid: false
      }
  }
  
    render() {
        return (
            <div className="root">
        <Container  maxWidth='xs'>
         
          <Toolbar>
              <img
                className="img"
                src={require("../assets/film-reel.svg")}
                alt="cinema icon"
              />
              &nbsp;
              <div className="titleName">
                <Typography variant="h5" className="title">
                  IFlix cinema..
                </Typography>
              </div>
              
            
              
            </Toolbar>
          
         
              <Typography component="h1" variant="h5">
                Show List
              </Typography>
        
              <form autoComplete="off" className="formoValidate">
                <Grid container spacing={2} >
                  <Grid item xs={12}>
                  <img
              width='101%' 
              height='70%'
                src={require("../assets/poster3.jpg")}
                alt="cinema icon"
              />
              &nbsp;
              <div className="titleName">
                <Typography variant="h5" className="title">
                  IFlix cinema..
                </Typography>
              </div>
              <Button variant="contained" color="secondary">
              Book Now
      </Button>
                  </Grid>

                  <Grid item xs={12}>
             
                  <img
               width='101%' 
               height='70%'
                src={require("../assets/poster1.jpg")}
                alt="cinema icon"
              />

              &nbsp;
              <div className="titleName">
                <Typography variant="h5" className="title">
                  IFlix cinema..
                </Typography>
              </div>
              <Button variant="contained" color="secondary" >
              Book Now
      </Button>
                  </Grid>

                  <Grid item xs={12}>
                  <img
               width='101%' 
               height='70%'
                src={require("../assets/poster2.jpg")}
                alt="cinema icon"
              />
              &nbsp;
              <div className="titleName">
                <Typography variant="h5" className="title">
                  IFlix cinema..
                </Typography>
              </div>
              <Button variant="contained" color="secondary">
       Book Now
      </Button>
                  </Grid>
                

                
                </Grid>
              </form>           
          </Container>
      </div>
        )
    }
}
