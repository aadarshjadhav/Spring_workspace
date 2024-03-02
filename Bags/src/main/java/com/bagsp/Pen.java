package com.bagsp;

public class Pen {
	
	String colour;
	double price;
	
	Nib nibs;

	public Pen(String colour, double price, Nib nibs) {
		super();
		this.colour = colour;
		this.price = price;
		this.nibs = nibs;
	}

	@Override
	public String toString() {
		return "Pen [colour=" + colour + ", price=" + price + ", nibs=" + nibs + "]";
	}
	
	

}
