package com.bagsp;

public class Nib {
	
	String material_type;
	double nib_price;
	
	public Nib(String material_type, double nib_price) {
		super();
		this.material_type = material_type;
		this.nib_price = nib_price;
	}

	@Override
	public String toString() {
		return "Nib [material_type=" + material_type + ", nib_price=" + nib_price + "]";
	}
	
	

}
