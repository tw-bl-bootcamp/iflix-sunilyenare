package com.thoughtworks.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.bootcamp.dto.MovieDto;
import com.thoughtworks.bootcamp.response.Response;
import com.thoughtworks.bootcamp.service.MovieService;


@RestController
@CrossOrigin(allowedHeaders = "*" ,origins = "*")
@RequestMapping("/user")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping("/addMovie")
	public Response addShow(@RequestBody MovieDto movieDto,String token){
		Response statusResponse =  movieService.MovieShow(movieDto, token);
		return statusResponse;
	}
}
