package com.constructor.org;



/*Question 

Pet Class
Create a class to represent a Pet type in java, which should have the following fields:
name. Instance variable of type String that holds the name of a pet.
animal. Instance variable of type String that holds the type of animal that a pet is.
age. Instance variable of type int holds the pet's age.
The Pet class should also have the following methods:
constructor for this class. The constructor should accept an argument for each of the fields.
setName, The setName method stores a value in the name field.
setAnimal. The setAnimal method stores a value in the animal field.
setAge. The setAge method stores a value in the age field.
getName. The getName method returns the value of the name field.
getAnimal. The getAnimal method returns the value of the animal field.
getAge. The getAge method returns the value of the age field.*/



class Pet {
	
	//attributes
	private String name;
	private String animal;
	private int age;

	//constructor
	public Pet()
	{
	System.out.println("=============Pet Details===============");
	}
	
	//Setter
	public void setName(String petName) {
		name=petName;
	}
	
	public void setAnimal(String petAnimal) {
		animal=petAnimal;
	}
	
	public void setAge(int petAge) {
		age=petAge;
	}
	
	//getter
	public String getName() {
		return name;
		
	}
	
	public String getAnimal() {
		return animal;
		
	}
	
	public int getAge() {
		return age;		
	}
	
	public static void main(String[] args) {
		
		Pet pet=new Pet();
		pet.setName("Jupiter");
		pet.setAnimal("Cat");
		pet.setAge(04);
		System.out.println("Pet Name : "+pet.getName());
		System.out.println("Pet Animal : "+pet.getAnimal());
		System.out.println("Pet Age : "+pet.getAge());
		
		

	}

}
