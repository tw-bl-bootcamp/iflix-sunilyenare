import React, { Component } from 'react'
import AppBar from "@material-ui/core/AppBar";
import Toolbar from "@material-ui/core/Toolbar";
import Typography from "@material-ui/core/Typography";
import IconButton from "@material-ui/core/IconButton";
import { MuiThemeProvider, createMuiTheme } from "@material-ui/core";
import Tooltip from '@material-ui/core/Tooltip';
import InputBase from "@material-ui/core/InputBase";
import Search from "@material-ui/icons/Search";
import RefreshIcon from "@material-ui/icons/Refresh";
import GridView from "@material-ui/icons/ViewAgendaOutlined";
import ListView from "@material-ui/icons/BorderAllRounded";
import Menu from "@material-ui/core/Menu";
import MenuItem from "@material-ui/core/MenuItem";
import PopupState, { bindTrigger, bindMenu } from "material-ui-popup-state";
import AccountCircle from "@material-ui/icons/AccountCircle";
import MenuIcon from "@material-ui/icons/Menu";
const thm = createMuiTheme({
    overrides: {
      MuiDrawer: {
        paperAnchorLeft: {
          top: 60,
          width: 240,
          background: "white",
          border: "transparent"
        },
        paperAnchorDockedLeft: {
          borderColor: "white"
        }
      },
      MuiAppBar: {
        colorPrimary: {
          color: "black",
          backgroundColor: "whitesmoke"
        },
        root: {
          left: "auto"
        }
      }
    }
  });

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
            <div className="dashboard">
        <MuiThemeProvider theme={thm}>
          <AppBar position="fixed" color="inherit">
          <Toolbar>
              <img
                className="img"
                src={require("../assets/film-reel.svg")}
                alt="fundoo icon"
              />
              &nbsp;
              <div className="titleName">
                <Typography variant="h5" className="title">
                  IFlix cinema
                </Typography>
              </div>
              
            
              
            </Toolbar>
          </AppBar>
        </MuiThemeProvider>
        
      </div>
        )
    }
}
