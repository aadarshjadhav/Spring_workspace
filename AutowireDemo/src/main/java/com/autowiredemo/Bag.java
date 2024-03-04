package com.autowiredemo;

public class Bag {
	
	Pen p;
	
	public Bag(Pen p)
	{
		System.out.println("This is Bag parameterized constructor of p");
		this.p=p;
	}
	
	public Bag() {
		
		System.out.println("This is Bag constructor");
	}
	
	public void setP(Pen p)
	{
		this.p=p;
	}
	
	public Pen getP()
	{
		return p;
	}
	
	public void printBagDisplay()
	{
		System.out.println("Pen is kept iniside the Bag");
	}
}