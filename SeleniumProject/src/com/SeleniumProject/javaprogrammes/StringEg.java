package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) 
	{
		String course="Selenium"; //muineleS
		//Finding the length of the string
//		System.out.println(course.length());
		
//		System.out.println(course.charAt(2));

//		System.out.println("You are selected "+course);
		
		for (int i = 0; i < course.length(); i++) 
		{
			System.out.println(course.charAt(i));
			
		}
	}

}
