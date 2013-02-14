package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class WildTurkeyTest {

	// FIXME: we want to do this, but it doesn't work
	//Turkey turkey = new WildTurkey("William the Wild Turkey");
	//Bird bird = new TurkeyAdapter(turkey);
	// FIXME: let's set to null for now
	Bird bird = null;
	
	@Test
	public void testHasAProperName() {
		assertEquals("William the Wild Turkey", bird.getProperName());
	}
	
	@Test
	public void testHasALatinName() {
		assertEquals("Meleagris gallopavo", bird.getLatinName());
	}
	
	@Test
	public void testSingsLikeAnAngelButNotQuite() {
		assertEquals("Gobble, gobble", bird.sing());
	}
	
	@Test
	public void testFliesLikeAFatClumsyBird() {
		assertEquals("Flap, flap", bird.fly());
	}
}
