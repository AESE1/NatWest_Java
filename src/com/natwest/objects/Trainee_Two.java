package com.natwest.objects;

public class Trainee_Two {
	
	//These are the class members
		
	public String name;
	public String pathway;
	public boolean hired = false;
	
	public Trainee_Two(String name, String pathway, boolean hired) {
		this.name = name;
		this.pathway = pathway;
		this.hired = hired;
	}

	public Trainee_Two() {
		
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

	@Override
	public String toString() {
		return "Trainee_Two is " + name + ", Pathway is " + pathway + ", Hired Result is " + hired;
		
	}
		

	
}
