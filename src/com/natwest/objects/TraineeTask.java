package com.natwest.objects;

import java.util.ArrayList;

public class TraineeTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> myList = new ArrayList<>();
		Trainee Anton = new Trainee ("Anton","Software Engineer",true) ;
		Trainee Joe = new Trainee ("Joe", "Scaffholder",true);
		Trainee Paul = new Trainee ("Paul","Optician");
		
		System.out.println(Anton);
		System.out.println(Joe);
		System.out.println(Paul);
		
		Trainee_Two Tido = new Trainee_Two();
		System.out.println(Tido);
		Tido.setName("Tido");
		System.out.println(Tido);
		System.out.println(Anton.getPathway());
		Tido.setPathway("Dancer");
		Tido.setHired(true);
		System.out.println(Tido);
		
		ArrayList<Trainee> TraineeList = new ArrayList <>();
		TraineeList.add(Anton);
		TraineeList.add(Joe);
		TraineeList.add(Paul);
		
		for (Trainee aTrain : TraineeList);
		System.out.println(aTrain);
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

}
