package com.thoughtworks.bootcamp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Seat {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seatId;
	
	private String seatRow;
	
	private int seatNumber;
	
	
	@ManyToMany
	private Set<Movie> movie;
	
	@ManyToMany
	private Set<User> user;
}
