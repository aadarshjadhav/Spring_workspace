package com.scopeDemo;

public class HelloWorld {

	private String msg; //Setting this private for singleton demo
	
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
	public void show()
	{
		System.out.println("Msg= "+msg);
	}


}
