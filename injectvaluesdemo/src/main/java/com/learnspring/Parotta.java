package com.learnspring;


public class Parotta implements Bread {
	private String continent;
	private String country;
	
	// default constructor
	public Parotta() {
	}

	@Override
	public String getDescription() {
		return "Indian layered flat-bread, made with all-purpose flour";
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
