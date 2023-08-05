package com.Polymorphism;
////18th july 2023

//Rule 2
//access modifier
//child class method can use same access modifier or in higher order

class Person{
	
	public void eat() {
		System.out.println("Parent class Method");
	}
}

class Student extends Person{
	
	@Override
	public void eat() {
		System.out.println("student is eating");
	}
}
public class MethodOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
