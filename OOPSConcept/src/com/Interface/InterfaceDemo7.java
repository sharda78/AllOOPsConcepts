package com.Interface;
interface Calculator
{
	public int add(int a,int b);
	public int sub(int a,int b);
	public int mul(int a,int b);
	public int div(int a,int b);
	
	default void display()
	{
		System.out.println("Default Class");
	}
	
}
class Basiccal implements Calculator
{
	public int add(int a,int b)
	{
		return a + b;
	}
	public int sub(int a,int b)
	{
		return a - b;
	}
	public int mul(int a,int b)
	{
		return a * b;
	}
	public int div(int a,int b)
	{
		return a / b;
	}
}
public class InterfaceDemo7 {

	public static void main(String[] args) 
	{
		Basiccal b = new Basiccal();
		System.out.println("ADD: " + b.add(5,8));
		System.out.println(b.sub(20,10));
		System.out.println(b.mul(6,9));
		System.out.println(b.div(50,25));
		b.display();
	}

}
