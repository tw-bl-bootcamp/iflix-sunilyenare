package com.thoughtworks.bootcamp.service;

import java.time.LocalDateTime;
import java.util.Optional;

import com.thoughtworks.bootcamp.dto.MovieDto;
import com.thoughtworks.bootcamp.response.Response;

public class MovieServiceImplementation implements MovieService {

	@Override
	public Response MovieShow(MovieDto movieDto, String token) {
		
		
		if(notesDto.getTitle().isEmpty() && notesDto.getDescription().isEmpty()) {
			
			throw new NotesException("Title and description are empty", -5);

		}
		
		long id = userToken.tokenVerify(token);
		Note notes = modelMapper.map(notesDto, Note.class);
		Optional<User> user = userRepository.findById(id);
		notes.setUserId(id);
		notes.setCreated(LocalDateTime.now());
		notes.setModified(LocalDateTime.now());
		user.get().getNotes().add(notes);
		notesRepository.save(notes);
		userRepository.save(user.get());
	
		Response response = StatusHelper.statusInfo(environment.getProperty("status.notes.createdSuccessfull"), Integer.parseInt(environment.getProperty("status.success.code")));
		return response;
	}

}
