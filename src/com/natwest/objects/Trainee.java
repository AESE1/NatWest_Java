package com.natwest.objects;

import java.util.ArrayList;

public class Trainee {
//These are the class members
	public String name;
	public String pathway;
	public boolean hired = false;

	ArrayList<Trainee> TraineeList = new ArrayList <>();
	
	public Trainee(String name, String pathway, boolean hired) {
//	ALL Args constructor
		this.name = name;
		this.pathway = pathway;
		this.hired = hired;
	}

	
//	This is overloading - SAME NAME but DIFFERENT arguments 
	public Trainee(String name, String pathway){
		this.name = name;
		this.pathway = pathway;
	}
	
//	This is a default constructor
	public Trainee() {
	}

	@Override
	public String toString() {
		return "Trainee is " + name + ", Pathway is " + pathway + ", Hired " + hired;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPathway() {
		return pathway;
	}


	public void setPathway(String pathway) {
		this.pathway = pathway;
	}


	public boolean isHired() {
		return hired;
	}


	public void setHired(boolean hired) {
		this.hired = hired;
	}
}


	public void addToList(Trainee) {
		TraineeList.add(p);
		
		
	}
	
	
	
	
	}
