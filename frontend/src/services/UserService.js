import axios from "axios";
var baseURL = "http://localhost:8081";


export function userLogin(data) {
    return axios.post(baseURL + "/user/login", data);
  }



