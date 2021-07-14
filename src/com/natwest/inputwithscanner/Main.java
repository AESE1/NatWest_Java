package com.natwest.inputwithscanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner Calculator = new Scanner(System.in);
		System.out.println("Welcome to the Calculator, which method would you like to use?");
		System.out.println("Please choose");
		System.out.println("1. AddTwo");
		System.out.println("2. SubTWo");
		System.out.println("3. MulTwo");
		System.out.println("4. DivTwo");
		System.out.println("5. Quit");
		
		int operation = Calculator.nextInt();
		
		switch(operation) {
		case 1:
			System.out.println("Give me one number");
			double number1 = Calculator.nextDouble();
			System.out.println("Give me another number");
			double number2 = Calculator.nextDouble();
			System.out.println("The answer is: " + Calculator.addTwo(number1+number2));
						break;
			
		}
		
//		String methodName = Calculator.nextLine();
//		System.out.println("Ok, " + methodName + " it is!");
//		System.out.println("Give me one number");
//		double number1 = Calculator.nextDouble();
//		System.out.println("Give me another number");
//		double number2 = Calculator.nextDouble();
//		
//		Calculator calc = new Calculator();
//		calc.addTwo(number1, number2);
//		
//		Calculator calc1 = new Calculator();
//		calc1.subTwo(number1, number2);
//		
//		Calculator calc2 = new Calculator();
//		calc2.mulTwo(number1, number2);
//		
//		Calculator calc3 = new Calculator();
//		calc3.divTwo(number1, number2);

	}

}
