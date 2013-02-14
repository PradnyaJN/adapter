package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MockingBirdTest {

	Bird bird = new MockingBird();
	
	@Test
	public void testHasAProperName() {
		assertEquals("Mickey the MockingBird", bird.getProperName());
	}

	@Test
	public void testHasALatinName() {
		assertEquals("Mimus dorsalis", bird.getLatinName());
	}
	
	@Test
	public void testSingsLikeAnAngel() {
		assertEquals("♫♪♫", bird.sing());
	}
	
	@Test
	public void testFliesLikeABird() {
		assertEquals("Wheeeeee!", bird.fly());
	}
}
