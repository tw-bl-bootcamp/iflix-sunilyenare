package com.thoughtworks.bootcamp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Theater {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long theaterId;
	
	@NotEmpty(message = "please provide theater name")
	@NotNull(message = "please provide theater name")
	private String name;
	
	@NotEmpty(message = "please provide venue name")
	private String venue;

	public long getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(long theaterId) {
		this.theaterId = theaterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Theater(long theaterId,
			@NotEmpty(message = "please provide theater name") @NotNull(message = "please provide theater name") String name,
			@NotEmpty(message = "please provide venue name") String venue) {
		super();
		this.theaterId = theaterId;
		this.name = name;
		this.venue = venue;
	}

	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
