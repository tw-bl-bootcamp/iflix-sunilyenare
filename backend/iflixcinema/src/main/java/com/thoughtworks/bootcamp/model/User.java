package com.thoughtworks.bootcamp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long  userId;
	
	@NotEmpty(message = "please provide your name")
	@NotNull(message = "please provide your name")
	private String name;
	
	@Column(name = "email",unique = true)
	@Email(regexp =  "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.(?:[A-Z]{2,}|com|org))+$")
	@NotEmpty(message = "Please provide valid email")
	@NotNull(message = "Please provide valid email")
	private String email;
	
	@NotEmpty(message = "please provide valid password")
	@NotNull(message = "please provide valid password")
	private String password;
	
	
	@ManyToMany
	private List<Theater> theater;
	
	

	@ManyToMany(mappedBy = "user")
	private List<Movie> movie;



	public long getUserId() {
		return userId;
	}



	public void setUserId(long userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<Theater> getTheater() {
		return theater;
	}



	public void setTheater(List<Theater> theater) {
		this.theater = theater;
	}



	public List<Movie> getMovie() {
		return movie;
	}



	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}



	public User(long userId,
			@NotEmpty(message = "please provide your name") @NotNull(message = "please provide your name") String name,
			@Email(regexp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.(?:[A-Z]{2,}|com|org))+$") @NotEmpty(message = "Please provide valid email") @NotNull(message = "Please provide valid email") String email,
			@NotEmpty(message = "please provide valid password") @NotNull(message = "please provide valid password") String password,
			List<Theater> theater, List<Movie> movie) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.theater = theater;
		this.movie = movie;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
