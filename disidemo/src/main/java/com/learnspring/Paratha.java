package com.learnspring;

public class Paratha implements Bread {
	// this is dependency which will e injected
	private Addon addon;
	
	// default constructor
	public Paratha() {}

	// setter injection
	public void setAddon(Addon addon) {
		this.addon = addon;
	}

	@Override
	public String getDescription() {
		return "Indian bread made with whole wheat-stufffed with vegtables or India cheese and pan fried.";
	}

	@Override
	public String getAddon() {
		return addon.getAddon();
	}

}
