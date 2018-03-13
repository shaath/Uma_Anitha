package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into an arraylist
		
		x.add("Selenium");
		x.add('M');
		x.add(60000);
		x.add(true);
		x.add(4, 60000);
		//Finding the size of an arraylist
		System.out.println(x.size());
		
		//Reading the data from an arraylist
//		System.out.println(x.get(2));
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
		

	}

}
