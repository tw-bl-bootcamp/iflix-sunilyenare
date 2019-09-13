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
        <Container maxWidth='xs'>

          <Toolbar>
            <img
              className="img"
              width='21%'
              height='21%'
              src={require("../assets/Papernotes.svg")}
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
                &nbsp;
              <Button color="primary" >
                  Imdb: 6/10
              </Button>
                <div className="titleName">
                  <Typography variant="h7" className="title">
                    When the world is under attack from creatures who hunt their human prey by sound, a teenager who lost her hearing at 13 and her family, seek safety in a remote refuge. However, they discover a cult who are eager to exploit her heightened senses.
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
              <Button color="primary" >
                  Imdb: 4.3/10
              </Button>
                <div className="titleName">
                  <Typography variant="h7" className="title">
                    Avinash and his friend Shaukat decide to take a trip to Kochi to sort out a misunderstanding. However, due to a twist of fate, a teenager ends up joining them on the trip.                </Typography>
                </div>
                &nbsp;
                
              <Button variant="contained" color="secondary">
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
              
                <Button color="primary" >
                  Imdb: 4.3/10
      </Button>
                <div className="titleName">
                  <Typography variant="h7" className="title">
                    Avinash and his friend Shaukat decide to take a trip to Kochi to sort out a misunderstanding. However, due to a twist of fate, a teenager ends up joining them on the trip.                </Typography>
                </div>
            
                &nbsp;
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
