package com.MethodAndStaticAssignment;

public class ArithematicOperations 
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
	public int mod(int a,int b)
	{
		return a % b;
	}

	public static void main(String[] args) {
		
		ArithematicOperations ao = new ArithematicOperations();
		System.out.println(ao.add(5, 6));
		System.out.println(ao.sub(10, 6));
		System.out.println(ao.mod(20, 3));
		System.out.println(ao.div(50, 25));
		System.out.println(ao.mul(4, 8));
	}

}
