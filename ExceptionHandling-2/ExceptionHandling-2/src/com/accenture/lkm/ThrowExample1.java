package com.accenture.lkm;

import java.util.Scanner;

public class ThrowExample1 {

	public static void main(String[] args) 
	{
			int salary=0,bonus=0,total=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter salary and bonus");
			salary=sc.nextInt();
			bonus=sc.nextInt();
			total=salary+bonus;
			try
			{
			if(total>100000)
			{
				throw new ArithmeticException("Salary and bonus can not be >100000");
			}
			}
			catch(ArithmeticException ob)
			{
				System.out.println(ob);
				ob.printStackTrace();
			}
			System.out.println("End of program");
	}

}
