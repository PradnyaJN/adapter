package com.example;

public class MockingBird implements Bird {
	public String getProperName() {
		return "Mickey the MockingBird";
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
