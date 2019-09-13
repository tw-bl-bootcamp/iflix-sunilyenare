package com.thoughtworks.bootcamp.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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

	private long userId;
	
	@ManyToMany
	private List<Theater> theater;
	
	@OneToMany
	private List<User> user;

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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public List<Theater> getTheater() {
		return theater;
	}

	public void setTheater(List<Theater> theater) {
		this.theater = theater;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public Movie(long movieId,
			@NotEmpty(message = "please provide movie name") @NotNull(message = "please provide movie name") String name,
			@NotEmpty(message = "please provide movie name") @NotNull(message = "please provide movie name") String language,
			long userId, List<Theater> theater, List<User> user) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.language = language;
		this.userId = userId;
		this.theater = theater;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", language=" + language + ", userId=" + userId
				+ ", theater=" + theater + ", user=" + user + "]";
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
