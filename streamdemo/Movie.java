package com.streamdemo;

public class Movie {

	private String name;
	private Integer releaseYear;
	private String actor;
	
	public Movie(String name, Integer releaseYear, String actor){
		this.name = name;
		this.releaseYear =releaseYear;
		this.actor = actor;
	}
	
	public String getName() {
		return name;
	}
	public String setName(String name){
		return this.name = name;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public Integer setReleaseYear(Integer releaseYear) {
		return this.releaseYear = releaseYear;
	}
	public String getActor() {
		return actor;
	}
	public String setActor(String actor) {
		return this.actor = actor;
	}
	
}
