package com.thoughtworks.bootcamp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long movieId;
	
	@NotEmpty(message = "please provide movie name")
	@NotNull(message = "please provide movie name")
	private String name;
	
	@NotEmpty(message = "please provide movie name")
	@NotNull(message = "please provide movie name")
	private String language;

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Movie(long movieId,
			@NotEmpty(message = "please provide movie name") @NotNull(message = "please provide movie name") String name,
			@NotEmpty(message = "please provide movie name") @NotNull(message = "please provide movie name") String language) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.language = language;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
