package com.example;

import java.util.LinkedList;
import java.util.List;

public class Aviary {

	public static void main(String[] args) {
		List<Bird> birds = new LinkedList<Bird>();
		
		MockingBird mockingBird = new MockingBird("Mike");
		birds.add(mockingBird);

		// FIXME 1: Object Adapter 
		//Bird turkey = new TurkeyAdapter(new WildTurkey("Ted"));
		
		// FIXME 2: Class Adapter
		//Bird turkey = new TurkeyAdapter("Ted");

		birds.add(turkey);
		
		for (Bird bird : birds)
			show(bird);
	}

	private static void show(Bird bird) {
		System.out.println(bird.getProperName() + " (" + bird.getLatinName() + ")");
		System.out.println(bird.sing());
		System.out.println(bird.fly());
	}
}
