package com.constructor.org;

public class Bird {
	int noOfLegs;
	String birdName;
	String birdBehavior;
	String birdColor;

	public void showBirdInfo() {
		System.out.println("The type of Animal is " + birdName);
		System.out.println("The name of Animal is " + birdBehavior);
		System.out.println("The Behvior of Animal is " + noOfLegs);
		System.out.println("The color of Animal is " + birdColor);

	}

	public Bird(String name, String behavior, int legs, String color) {
		birdName = name;
		birdBehavior = behavior;
		noOfLegs = legs;
		birdColor = color;
	}

	public static void main(String[] args) {
		Bird bird = new Bird("Sparrow", "Racebird", 2, "White with Shade Black");
		bird.showBirdInfo();

	}

}