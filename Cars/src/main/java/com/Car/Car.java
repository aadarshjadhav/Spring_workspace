package com.Car;

public class Car {
	
	int modelno;
	String name;
	double price;
	
	Engine egine;

	public Car(int modelno, String name, double price, Engine egine) {
		super();
		this.modelno = modelno;
		this.name = name;
		this.price = price;
		this.egine = egine;
	}

	public void show()
	{
		System.out.print("Modelno: "+modelno+ " Name:"+name+" price:"+price+" engine:"+egine);
	}
	

}
