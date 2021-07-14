package com.natwest.inheritance;

public class Fish extends Animal{
	
	public int numberOfFins;
	public boolean livesInTheWater;
	public boolean freshWayer;
	
	public Fish() {
		super();
		
	}

	public Fish(String name, String colour, double weight, int numberOfFins, boolean livesInTheWater,
			boolean freshWayer) {
		super(name, colour, weight);
		this.numberOfFins = numberOfFins;
		this.livesInTheWater = livesInTheWater;
		this.freshWayer = freshWayer;
	}

	public int getNumberOfFins() {
		return numberOfFins;
	}

	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}

	public boolean isLivesInTheWater() {
		return livesInTheWater;
	}

	public void setLivesInTheWater(boolean livesInTheWater) {
		this.livesInTheWater = livesInTheWater;
	}

	public boolean isFreshWayer() {
		return freshWayer;
	}

	public void setFreshWayer(boolean freshWayer) {
		this.freshWayer = freshWayer;
	}
	
}
	
