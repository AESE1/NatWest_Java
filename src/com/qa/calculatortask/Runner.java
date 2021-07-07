package com.qa.calculatortask;

public class Runner {

	// Entry point - MAIN METHOD
	public static void main(String[] args) {
		System.out.println(addTwo(10.5423456d, 150.46465d));
//		System.out.println(addTwo(2354467, 20000));
//		System.out.println(addTwo(1343, 345646));
//		System.out.println(subTwo(10, 20));// -10
//		System.out.println(subTwo(30, 20));
		System.out.println(mulTwo(10, 10));
		System.out.println(divTwo(10, 5));
		
	}// END

	// methods - outside of the main method
	public static double addTwo(double number1, double number2) {
		return number1 + number2;
	}

	public static int subTwo(int number1, int number2) {
		return number1 - number2;
	}

	public static int mulTwo(int number1, int number2) {
		return number1 * number2;
	}

	public static int divTwo(int number1, int number2) {
		return number1 / number2;
	}

}// END
