package com.thoughtworks.bootcamp.service;

import java.util.List;

import com.thoughtworks.bootcamp.dto.MovieDto;
import com.thoughtworks.bootcamp.model.Movie;
import com.thoughtworks.bootcamp.response.Response;

public interface MovieService {
	
	
	public Response MovieShow(MovieDto movieDto,String token);
	
	
}
