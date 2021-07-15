package com.natwest.inputwithscanner;

import java.util.Scanner;

public class Menu {
	
	Calculator calc = new Calculator();
	Scanner scan = new Scanner(System.in);
	double num1;
	double num2;
	
		public void go(){
			System.out.println("Welcome to the calculator, what method would you like to use?");
			System.out.println("1. AddTwo");
			System.out.println("2. SubTwo");
			System.out.println("3. MulTwo");
			System.out.println("4. DivTwo");
			System.out.println("0. Exit");
			
			int option = scan.nextInt();
			if (option != 0) {
				System.out.println("Give me one number");
				num1 = scan.nextDouble();
				System.out.println("Give me another number");
				num2 = scan.nextDouble();
				choose(option);
			} else {
				System.out.println("Thank you for trying our methods");
				scan.close();
		}
		
		}
		
		public void choose(int option) {
			
			switch (option) {
			case 1:
				System.out.println(calc.addTwo(num1, num2));
				break;
			case 2:
				System.out.println(calc.subTwo(num1, num2));
				break;
			case 3:
				System.out.println(calc.mulTwo(num1, num2));
				break;
			case 4:
				System.out.println(calc.divTwo(num1, num2));
				break;
				
			default:
				
				break;
				
			}
			goAgain();
							
			}
		

		public void goAgain() {
			System.out.println("Would you like to go again");
			System.out.println("1 = YES");
			System.out.println("2 = NO");
			int playAgain = scan.nextInt();
			if (playAgain == 1) {
				go();
			} else if (playAgain == 0) {
				return;
			} else {
				goAgain();
			}
						
			
		}
}

		
