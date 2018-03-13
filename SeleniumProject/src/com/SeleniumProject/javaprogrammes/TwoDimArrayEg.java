package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		int[][] x=new int[3][2];

		//Finding the length of the rows
		System.out.println(x.length);
		
		//Finding the length of the columns
		System.out.println(x[0].length);
		
		
		//Writing the data into an array
		x[0][1]=60000;
		x[2][1]=30000;
		
		
		//Reading the data from an array
//		System.out.println(x[1][0]);
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
		
	}

}
