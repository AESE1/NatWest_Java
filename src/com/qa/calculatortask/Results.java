package com.qa.calculatortask;

public class Results {
	
	public static double Physics = 80;
	public static double Chemistry = 90;
	public static double Biology = 100;
	public static double Total = Physics + Biology + Chemistry;
	public static double Percentage = (Total*100)/450;
		
	public static void main(String[] args) {
		
		findTotal();
		findPercentage();
		
		
	}
		
	
	public static void findTotal() {
		
		System.out.println(Total);
	}

	public static void findPercentage() {
		
		System.out.println(Percentage + "%") ;
		
	}
	
	
}
