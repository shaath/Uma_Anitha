package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args) 
	{
		//Incrementing loop
		for(int i=1; i<=100 ; i++)
		{
			System.out.println(i);
			if (i == 75)
			{
				break;
			}
		}
		System.out.println("********");
		//Decrementor Loop
		for(int j=100; j>=1; j--)
		{
			System.out.println(j);
		}
		
	}

}
