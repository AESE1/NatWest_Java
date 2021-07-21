package com.natwest.enums;

public class Runner {

	public static void main(String[] args) {
	
		Card card = new Card(Rank.FIVE, Suit.HEARTS);
		Dealer dBo = new Dealer(card);
		
		
//		System.out.println(card);
		System.out.println(dBo.getCard());
		System.out.println(dBo.deal());
				
		
//		for (Rank r : Rank.values()) {
//			System.out.println(r);
			
		}

	}
