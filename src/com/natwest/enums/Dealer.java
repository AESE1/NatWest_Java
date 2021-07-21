package com.natwest.enums;
import java.util.Random;


public class Dealer {

	private Card card;

	Random random = new Random();

	public Dealer(Card card) {

		this.card = card;

	}

	public Card getCard() {
		return card;
	}

	public Card deal() {
		
		System.out.println(Rank.values().length);
		System.out.println(Suit.values().length);
		return new Card(Rank.values()[random.nextInt(Rank.values().length)], Suit.values()[random.nextInt(Suit.values().length)]);
	}


	}
