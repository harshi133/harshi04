package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.IOException;

public class T {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("inside T");
		try {
			
			CheckedExceptionDemo.main(args);
		    } 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of T");
	}

}
