package com.thoughtworks.bootcamp.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.bootcamp.dto.MovieDto;
import com.thoughtworks.bootcamp.model.Movie;
import com.thoughtworks.bootcamp.model.User;
import com.thoughtworks.bootcamp.repository.MovieRepository;
import com.thoughtworks.bootcamp.repository.UserRepository;
import com.thoughtworks.bootcamp.response.Response;
import com.thoughtworks.bootcamp.util.UserToken;

public class MovieServiceImplementation implements MovieService {

	
	@Autowired
	private UserToken userToken;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public Response MovieShow(MovieDto movieDto, String token) {
		
		
		if(movieDto.getTitle().isEmpty() && movieDto.getLanguage().isEmpty()) {
			
			return new Response(400,"please fill data");

		}
		
		long id = userToken.tokenVerify(token);
		Movie movie = modelMapper.map(movieDto, Movie.class);
		Optional<User> user = userRepository.findById(id);
		movie.setUserId(id);
		movie.setLanguage(movieDto.getLanguage());
		movie.setName(movieDto.getTitle());
		user.get().getMovie().add(movie);
		movieRepository.save(movie);
		userRepository.save(user.get());
		
		return new Response(200,"Good To Go");
	}

}
