package com.jensen.model;

public enum Constants {
	N_DICE(5), MAX_PLAYERS(6), N_CATEGORIES(13), ONES(1), TWOS(2), THRES(3), FOURS(4), FIVES(5),
	SIXES(6), THREE_OF_KIND(9), FOUR_OF_KIND(10), FULL_HOUSE(11), SMALL_STRIGHT(15), LARGE_STRIGHT(20),
	YAHTZEE(14), CHANGE(15), BONUS(35), TOTAL(63);
	
	private int number;
	
	Constants(int number) {
        this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

}
