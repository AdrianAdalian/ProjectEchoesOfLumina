package com.perceus.eol.branch.crp.enums;

public enum Rarity
{
	ONE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	;
	
	private final int rarity;
	
	private Rarity(int rarity) 
	{
		this.rarity = rarity;
	}
	
	public int getRarity() 
	{
		return this.rarity;
	}
}
