package com.thoughtworks.bootcamp.service;

import com.thoughtworks.bootcamp.dto.TheaterDto;
import com.thoughtworks.bootcamp.response.Response;

public interface TheaterService {
	
	public Response Theater(TheaterDto theaterDto);
	public Response bookShowInTheater(long movieId ,String token ,long theaterId);
}
