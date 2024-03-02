package com.bagsp;

public class Bag {

	String brandname;
	double bag_price;
	
	Pen pen_obj;

	public Bag(String brandname, double bag_price, Pen pen_obj) {
		super();
		this.brandname = brandname;
		this.bag_price = bag_price;
		this.pen_obj = pen_obj;
	}
	
	public void show()
	{
		System.out.print("Brand: "+brandname+ " Bag Price:"+bag_price+" Pen:"+pen_obj);
	}
}
