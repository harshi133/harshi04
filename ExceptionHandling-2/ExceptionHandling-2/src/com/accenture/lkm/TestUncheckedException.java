package com.accenture.lkm;

public class TestUncheckedException {

	public static void main(String[] args) 
	{
		System.out.println("inside main");
		try
		{
		m1();
		}
		catch(NullPointerException e)
		{
			System.out.println("handled in main");
			e.printStackTrace();
		}
		System.out.println("end of main");
	}
	public static void m1() 
	{
		System.out.println("inside m1");
		Integer i=null;
		System.out.println("Double value: "+i.doubleValue()); //sensitive code --unchecked
		System.out.println("end of m1");
	}

}
