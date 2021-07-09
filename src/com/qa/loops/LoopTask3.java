package com.qa.loops;

public class LoopTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int A = 1; A <= 10; A++) {
//            System.out.println("1-10");
		
//		for(int A = 1; A <= 10; A++) {
//            System.out.println("1"+ A);
//        for(int B = 2; B <= 10; B++) {
//                System.out.println("1"+ B);
		
		for(int A = 0; A <= 10; A++) {
			if (A%2 == 0) {
				System.out.println("-" + A);
			}
			else {
				System.out.println("*" + A);
			}
			printNumbs();
			
		}

				
	}


public static void printNumbs() {
	for(int A=1;A<10;A++) {
		System.out.println(A+""+A);
	}
}
}

