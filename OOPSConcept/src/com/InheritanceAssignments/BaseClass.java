package com.InheritanceAssignments;
import java.util.*;
class Base
{
	static int n1;
	static int n2;
	int a;
	int b;
	Base(int n1,int n2)
	{
		Base.n1 = n1;
		Base.n2 = n2;
	}
	
}
class Derived extends Base
{
	
	Derived()
	{
		super(n1,n2);
		Scanner sc =  new Scanner(System.in);	
		System.out.println("Enter first number");
		n1 = sc.nextInt();
		System.out.println("Enter second number");
		n2 = sc.nextInt();
	}
	public void dispMax()
	{
		
			System.out.println(n1 > n2);
			
	}
	public void dispMin()
	{
			System.out.println(n2 > n1);	
	}
}
public class BaseClass {

	public static void main(String[] args) 
	{
		Derived d = new Derived();
		d.dispMax();
		d.dispMin();

	}

}
