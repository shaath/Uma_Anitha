package com.SeleniumProject.javaprogrammes;

public class StringEg2 {

	public static void main(String[] args) 
	{
		String x="    I am Sharath     ";
		int len=x.length();
		System.out.println(len);
//		System.out.println(x.substring(2, 6));
		
//		System.out.println(x.lastIndexOf('a'));

//		System.out.println(y.length());
		
//		System.out.println(y.startsWith("am"));
		System.out.println(x.replace(" ", ""));
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		
	}

}
