package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEg {

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		
		//Writing the data
		s.add("Selenium");
		s.add("Apple");
		s.add("Boll");
		s.add("mad");
		s.add("Cat");
		s.add("Cat");
		//Reading the data
		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
			String data=it.next();
			System.out.println(data);
		}
		
	}

}
