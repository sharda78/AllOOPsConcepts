package com.Polymorphism;

////18th july 2023

//Rule 4-return type
//non-primitive
//child class method can use same of its co-variant
//if parent class method is returning any object then subclass overriding method
//can return same or its subclass object
//java 1.5

class Calculator{

public int m2() {
	return 10;
}
public Object add() {
	return 12;
}

public Car m1() {
	return new Car();
}
}

class SimpleCalculator extends Calculator{

public String add() {
	return "hello";
}

public BMW m1() {
	return new BMW();
}
}


public class Methodoverriding5 {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	Calculator c1=new Calculator();
	c1.add();
	
	SimpleCalculator s1=new SimpleCalculator();
	//without co-variant
	//String msg=(String) s1.add();
	//System.out.println(msg);
	
	//with co-variant
	String m=s1.add();
	System.out.println(m);
}




}
