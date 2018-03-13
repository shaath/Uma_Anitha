package com.SeleniumProject.javaprogrammes;

public class StringRevEg {

	public static void main(String[] args) 
	{
		String course="Madam"; //miuneleS----- madam---> madam
		String rev="";
		int len=course.length();
		
		for (int i = len-1; i >= 0; i--)
		{
//			System.out.print(course.charAt(i));
			rev=rev+course.charAt(i);
			
		}
		System.out.println(rev);
		if (rev.equalsIgnoreCase(course)) 
		{
			System.out.println("Given string is a polyndrome");
		}
		else
		{
			System.out.println("Given string is not a polyndrome");
		}
	}

}
