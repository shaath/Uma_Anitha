package com.SeleniumProject.javaprogrammes;

public class MethodsEg {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		
		m.function3();
		boolean flag=m.function4();
		System.out.println(flag);
	}
	
	//Static method without returning value
	public static void function1()
	{
		System.out.println("This is function1 code");
	}

	//Static method with returning anyvalue
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	
	//Non-Static method without returning anyvalue
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	//Non static method with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sum(int a, int b, int c)
	{
		int d=a+b+c;
		return d;
	}
}
