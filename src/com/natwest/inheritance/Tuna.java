package com.natwest.inheritance;

public class Tuna extends Fish {

		private int angerLevel;

		public Tuna(String name, String colour, double weight, int numberOfFins, boolean livesInTheWater,
				boolean freshWayer, int angerLevel) {
			super(name, colour, weight, numberOfFins, livesInTheWater, freshWayer);
			this.angerLevel = angerLevel;
		}
		
		
}
