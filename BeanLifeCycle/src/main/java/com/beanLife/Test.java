package com.beanLife;

public class Test {

	String msg;
	
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
	
	public void display()
	{
		System.out.println("Mmessage"+msg);
		
	}
	
	public void init()
	{
		System.out.println("Bean is in init");
	}
	
	public void destroy()
	{
		System.out.println("Bean wiill be destroyed now.....");
	}

}
