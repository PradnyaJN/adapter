package com.example;

public class MockingBird implements Bird {
	@Override
	public String getProperName() {
		return "Mickey the MockingBird";
	}

	@Override
	public String getLatinName() {
		return "Mimus dorsalis";
	}

	@Override
	public String sing() {
		return "♫♪♫";
	}

	@Override
	public String fly() {
		return "Wheeeeee!";
	}
}
