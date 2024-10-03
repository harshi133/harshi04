package com.accenture.lkm;

public class RangeCustomException extends Exception
{
private String errorMessage;
	public RangeCustomException() 
	{
		System.out.println("My Custom Exception");	
	}
	public RangeCustomException(String message) 
	{
		this.errorMessage=message;
		System.out.println("My Custom Exception");	
	}
	public void showError()
	{
		System.out.println("You have custom exception in your code");
	}
	@Override
	public String toString() {
		return "RangeCustomException [errorMessage=" + errorMessage + "]";
	}
	

	}
