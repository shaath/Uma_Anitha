package com.SeleniumProject.javaprogrammes;

import java.util.Random;

public class RandomStringEg {

	public static void main(String[] args) 
	{
		Random r=new Random();
		
		int c=1+r.nextInt(100);
		System.out.println(c);


	}

}
