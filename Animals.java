package com.constructor.org;

public class Animals {
	String animalType;
	String animalName;
	String animalBehavior;
	String animalColor;

	public void showAnimalInfo() {
		System.out.println("The type of Animal is " + animalType);
		System.out.println("The name of Animal is " + animalName);
		System.out.println("The Behvior of Animal is " + animalBehavior);
		System.out.println("The color of Animal is " + animalColor);
		

	}

	public Animals(String name, String type, String behvior, String color) {
		animalName = name;
		animalType = type;
		animalBehavior = behvior;
		animalColor = color;
	}
	

	public static void main(String[] args) {
		Animals animal = new Animals("lion", "omnivores", "roars", "orane" + "\n");
		animal.showAnimalInfo();
		Animals animals2 = new Animals("zebra", "omnivores", "silent", "white with black stripes");
		animals2.showAnimalInfo();

	}

}

