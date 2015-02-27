package com.example;

public class MockingBird implements Bird {
	private final String name;

	public MockingBird(String name) {
		this.name = name;
	}

	public String getProperName() {
		return name + " the MockingBird";
	}

	public String getLatinName() {
		return "Mimus dorsalis";
	}

	public String sing() {
		return "Fififiiiii fiii";
	}

	public String fly() {
		return "Wheeeeee!";
	}
}
