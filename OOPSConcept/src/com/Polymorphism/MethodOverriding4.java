package com.Polymorphism;
//18th july 2023

//Rule 3
//Return type
//void-void
//primitive-same return type which is present in parent class
//eg parent ->int
//child ->int 
class Shape{
	
	public int draw() {
		System.out.println("Shape Class");
		return 0;
	}
}

class Rect extends Shape{
	//can not use diffrent
	/*
	public long draw() {
		System.out.println("Rect class");
		return 0;
	}
	*/
	
	public int draw() {
		return 10;
	}
}
public class MethodOverriding4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1=new Shape();
		s1.draw();
		
		Rect r1=new Rect();
		r1.draw();
		
		Shape s2=new Rect();
		s2.draw();
	}



}
