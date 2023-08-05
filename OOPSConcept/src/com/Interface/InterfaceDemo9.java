package com.Interface;
interface Calculator2
{
	public int add(int a,int b);
	public int sub(int a,int b);
	public int mul(int a,int b);
	public int div(int a,int b);
	
	//java 9
	private void data()
	{
		System.out.println("method in interface");
	}
	//java9
	 static void shareData()
	{
		
		//m1();
		System.out.println("static method in interface");
		share();// we can call private method in static
	}
	private static void share()
		{
			
			//m1();
			System.out.println("private static method in interface");
		}
	default void display()
	{
		data(); // private cannot call
		System.out.println("facebook");
		shareData();
	}
	default void m1()
	{
		//we cannot access this method in static method shareData.
	
		System.out.println("amazon");
	}
	default void m2()
	{
		System.out.println("flipcard");
	}
}
public class InterfaceDemo9 
{

	public static void main(String[] args) {
	//Calculator .share(); // it is private method so it is cannot visible for calculator
	Calculator2.shareData();
	
	
	}
	}
 
