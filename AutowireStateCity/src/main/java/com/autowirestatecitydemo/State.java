package com.autowirestatecitydemo;


public class State {

    private City c; // This field name should match the bean ID in your Spring XML

    public State() {
        System.out.println("This is State constructor");
    }



    // Setter for the City object. The name 'setC' matches the bean ID 'c' from the XML
    public void setC(City c) {
        this.c = c;
    }

    // Getter for the City object, used in your MainApp
    public City getC() {
        return this.c;
    }
    
	public void printStateDisplay()
	{
		System.out.println("City is iniside the State. This is printStateDisplay()");
	}

}
