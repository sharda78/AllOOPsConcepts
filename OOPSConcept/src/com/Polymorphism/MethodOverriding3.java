package com.Polymorphism;
//18th july 2023
//method overriding
//Rule 1
//method signature
//child class method should have same name and same para 
//which is present in parent class
//@Override annotation - java 1.5
class Vehicle{
	
	public void drive(int a) {
		System.out.println("Inside parent class");
	}
}
class Car extends Vehicle{
	
	@Override
	public void drive(int s) {
		System.out.println("Inside child class");
	}
	
	public void speed() {
		System.out.println("speed method");
	}
}
class BMW extends Car{
	
}
public class MethodOverriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case 1
		Vehicle v=new Vehicle();
		v.drive(10); //parent class method
		
		//case 2
		Car c=new Car();
		c.drive(10); //child class method
		
		//case 3
		Vehicle v1=new Car();
		v1.drive(20);
		
		
	}



}
