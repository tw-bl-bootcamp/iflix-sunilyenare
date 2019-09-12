package com.thoughtworks.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.model.User;
import com.thoughtworks.bootcamp.repository.UserRepository;
import com.thoughtworks.bootcamp.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
class test {

	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserService service;
	
	@Test
	void valid() {
		
	
		LoginDto loginDto=new LoginDto("s@gmail.com","1234");
		
		
		User user= new User(1,null,"s@gmail.com","1234");
		Optional<User> useroptional= Optional.ofNullable(user);
		
		when(userRepository.findByEmail("")).thenReturn(useroptional);
		
		assertEquals(true,service.login(loginDto));
	}
}
