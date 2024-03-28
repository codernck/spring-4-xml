package com.learnspring;

public class Parotta implements Bread {
	// this is dependency which will e injected
	private Addon addon;

	// default constructor
	public Parotta() {
	}

	// setter injection
	public void setAddon(Addon addon) {
		this.addon = addon;
	}

	@Override
	public String getDescription() {
		return "Indian layered flat-bread, made with all-purpose flour";
	}

	@Override
	public String getAddon() {
		return addon.getAddon();
	}

}
