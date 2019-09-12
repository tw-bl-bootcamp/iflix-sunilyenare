package com.thoughtworks.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.model.User;
import com.thoughtworks.bootcamp.repository.UserRepository;
import com.thoughtworks.bootcamp.response.ResponseToken;
import com.thoughtworks.bootcamp.util.UserToken;

@Service("userService")
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserToken userToken;
	@Override
	public ResponseToken login(LoginDto loginDto) {

		@SuppressWarnings("unused")
		ResponseToken response = null;
		Optional<User> user = userRepository.findByEmail(loginDto.getEmail());

		if (user.isPresent()) {
			if (loginDto.getEmail().equals(user.get().getEmail())
					&& loginDto.getPassword().equals(user.get().getPassword())) {
				String generatedToken = userToken.generateToken(user.get().getUserId());
			return response = new ResponseToken("SuceessFully Login", 200, generatedToken);
			}else {
				return response = new ResponseToken("password is not matching", 204, "");}
		}
		return response = new ResponseToken("User not registered", 400, "");

	}

}
