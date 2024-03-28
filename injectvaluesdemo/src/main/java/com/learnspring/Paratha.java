package com.learnspring;


public class Paratha implements Bread {
	private String continent;
	private String country;
	
	// default constructor
	public Paratha() {}

	@Override
	public String getDescription() {
		return "Indian bread made with whole wheat-stufffed with vegtables or India cheese and pan fried.";
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
