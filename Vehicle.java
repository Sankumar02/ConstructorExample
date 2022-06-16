package com.constructor.org;

public class Vehicle {
	String vechicleType;
	String vechicleName;
	int noOfTyres;
	String fuelType;
	int noOfGears;

	void showVechicleInfo1() {
		System.out.println("The type of Vechicle is " + vechicleType);
		System.out.println("The Name of Vechicle is " + vechicleName);
		System.out.println("The No of tyres in a given Vechicle is " + noOfTyres);
		System.out.println("The No of Gears in a given Vechicle is " + noOfGears);
		System.out.println("The Fuel Type of given Vechicle is " + fuelType);
	}

	void showVechicleInfo2() {
		System.out.println("The type of Vechicle is " + vechicleType);
		System.out.println("The Name of Vechicle is " + vechicleName);
		System.out.println("The No of tyres in a given Vechicle is " + noOfTyres);
		System.out.println("The No of Gears in a given Vechicle is " + noOfGears);
		System.out.println("The Fuel Type of given Vechicle is " + fuelType);
	}

	public Vehicle(String Type, int Tyres, String fuel, int Gears, String name) {

		fuelType = fuel;
		noOfGears = Gears;
		noOfTyres = Tyres;
		vechicleType = Type;
		vechicleName = name;
	}

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("Two Wheeler", 2, "Petrol", 6, "R15 V3");
		bike.showVechicleInfo1();
		System.out.println("");
		Vehicle car = new Vehicle("Four Wheeler", 4, "Diesel", 5, "Tata Harrier");
		car.showVechicleInfo2();

	}

}

