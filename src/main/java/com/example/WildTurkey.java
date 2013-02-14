package com.example;

public class WildTurkey extends Turkey {
	private String name;

	public WildTurkey(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String gobble() {
		return "Gobble, gobble";
	}
	
	public String fly() {
		return "Flap, flap";
	}
}
