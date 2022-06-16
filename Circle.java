package com.constructor.org;


/*Question

Circle Class
Create a class to represent a Circle type in java, which should have following :
radius. Instance field of type double
No-argument constructor. Set radius with default value of 1.0
Constructor. that accept an argument for radius
getRadius. public method that returns the radius of Circle
getArea. Method that returns the area of Circle

*/


public class Circle {
	
	//attributes
	private double radius;
	private double area;
	
	//no- arg constructor
	Circle()
	{
		radius=1.0;
	}
	
	Circle(double radius){
		this.radius=radius;
	}
	
	//getter
	public double getRadius() {
		return radius;		
	}
	
	public double getArea() {
		return area=radius*radius;
		
	}

	public static void main(String[] args) {
		Circle circle=new Circle();
		Circle circle2=new Circle(2.0);
		
		System.out.println("Area of Circle"+circle.getRadius());
		System.out.println();
		System.out.println("Area of Circle"+circle2.getArea());
	}

}
