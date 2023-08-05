package com.ClassesAndObject;


public class Cube {
	int square(int x)
	{
		return x*x;
		
	}
	
	int cubic(int x)
	{
		return square(x)*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c=new Cube();
		System.out.println(c.cubic(5));

	}

}
