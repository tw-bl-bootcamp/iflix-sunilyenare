package com.thoughtworks.bootcamp.dto;

public class MovieDto {

	private String title;
	private String language;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public MovieDto(String title, String language) {
		super();
		this.title = title;
		this.language = language;
	}
	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
