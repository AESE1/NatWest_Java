package com.qa.calculatortask;

public class Mains {

	Calculator calc = new Calculator();
	Scanner sc = new Scanner(System.in);
	double num1;
	double num2;

	public void start() {
		System.out.println("What would you like to do?");
		System.out.println("Press 1 - Add numbers ");
		System.out.println("Press 2 - Sub numbers ");
		System.out.println("Press 3 - Mul numbers ");
		System.out.println("Press 4 - Div numbers ");
		System.out.println("Press 0 - To Exit ");
}
