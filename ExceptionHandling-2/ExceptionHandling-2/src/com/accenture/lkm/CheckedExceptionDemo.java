package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("Inside main");
		
		m1(); //sensitive code
	
		System.out.println("end of main");
	}
	
	public static void m1() throws FileNotFoundException,IOException
	{
		System.out.println("inside m1");
		FileReader r=new FileReader("hello.txt");//sensitive code ---- checked exception
		System.out.println("end of m1");

	}

}
