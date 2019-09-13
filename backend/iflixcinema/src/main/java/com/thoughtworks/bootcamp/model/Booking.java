package com.thoughtworks.bootcamp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingId;
	@ManyToMany
	private List<Theater> theater;
	@ManyToMany
	private List<Movie> movie;
	@ManyToMany
	private List<User> user;
	
}
