package com.constructor.org;

public class Animal1 extends Animals {

	public Animal1(String name, String type, String behvior, String color) {
		super(name, type, behvior, color);
       
	}

	public static void main(String[] args) {
		
		Animal1 animal1 = new Animal1("Elepant", "carnivores", "Aggressive while sick", "Black");
		animal1.showAnimalInfo();

	}

}
