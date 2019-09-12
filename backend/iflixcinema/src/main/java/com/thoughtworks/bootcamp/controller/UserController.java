package com.thoughtworks.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.response.ResponseToken;
import com.thoughtworks.bootcamp.service.UserService;

@RestController
@CrossOrigin(allowedHeaders = "*" ,origins = "*")
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public ResponseToken login(@RequestBody LoginDto loginDto){
		ResponseToken statusResponse = userService.login(loginDto);
		return statusResponse;
	}
}
