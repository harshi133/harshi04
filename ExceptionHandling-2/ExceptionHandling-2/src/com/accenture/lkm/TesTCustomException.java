package com.accenture.lkm;

public class TesTCustomException {

	public static void main(String[] args) 
	{
		System.out.println("inside main");
		try 
		{
			throw new RangeCustomException("User raised an exception forcefully");
		} 
		catch (RangeCustomException e)
		{
			//e.printStackTrace();
			System.out.println(e);
			e.showError();
		}
		System.out.println("End of main");
		
	}

}
