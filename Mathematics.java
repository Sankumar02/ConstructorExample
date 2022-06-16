package com.Challenge;

import java.util.Scanner;

public class Mathematics {

	static int num1;
	static int num2;
	static int operation;
	static int addition;
	static int subraction;
	static int multiply;
	static int divide;

	Mathematics(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public static void main(String[] args) {
		Mathematics calc = new Mathematics(2, 3);
		Scanner calculation = new Scanner(System.in);

		while (true) {
			System.out.println("-----Mathematical Operation-------");
			System.out.println();

			System.out.println("Enter the first number:" + num1);
			// num1=calculation.nextInt();

			System.out.println("Enter the second number:" + num2);
			// num2=calculation.nextInt();

			System.out.println("Enter 1 for addition of two number");
			System.out.println("Enter 2 for subraction of two number");
			System.out.println("Enter 3 for division of two number");
			System.out.println("Enter 4 for multiplication of two number");
			System.out.println("Enter your choice for operation");
			operation = calculation.nextInt();

			switch (operation) {

			case 1:

				addition = num1 + num2;
				System.out.println("Addition of two number is :" + addition);
				System.out.println();
				break;

			case 2:

				subraction = num1 - num2;
				System.out.println("Subraction of two number is :" + subraction);
				System.out.println();
				break;

			case 3:

				multiply = num1 * num2;
				System.out.println("Multiplication of two number is:" + multiply);
				System.out.println();
				break;

			case 4:

				divide = num1 / num2;
				System.out.println("Division of two number is :" + divide);
				System.out.println();
				break;

			default:
				System.out.println("You have entered the wrong choice");

			}

		}
	}

}
