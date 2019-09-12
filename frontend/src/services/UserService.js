import axios from "axios";
var baseURL = "http://localhost:8081";


/**
 * @param data
 * @description send registration data to server
 */

export function userRegister(data) {
    return axios.post(baseURL + "/user/register", data);
  }

  /**
 * @param data
 * @description send login data to server
 */
export function userLogin(data) {
    return axios.post(baseURL + "/user/login", data);
  }

  /**
 * @param data
 * @description send email id to server
 */
export function forgotPasswordService(data) {
  return axios.post(baseURL + "/user/forgotpassword", data);
}



/**
 * @param data
 * @description send new password data to server
 * @return response
 */
export function resetPasswordService(data,token) {
  console.log('calling')
  return( axios.put(baseURL + "/user/resetpassword/", data, {
    headers:{
        'token' : token
    }
})
);
}

