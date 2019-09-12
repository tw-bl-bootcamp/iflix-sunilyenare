package com.thoughtworks.bootcamp.service;

import org.springframework.stereotype.Service;

import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.response.ResponseToken;
@Service
public interface UserService {
	
	public ResponseToken login(LoginDto loginDto);
}
