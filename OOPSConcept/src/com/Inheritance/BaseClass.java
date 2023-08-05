package com.Inheritance;

class Base {

	public void m1() {

		System.out.println("hi");
	}
}

class Derived extends Base {

	public void m1() {

		System.out.println("hello");

	}
	public void m2() {
		System.out.println("welcome");
	}

}
public class BaseClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Derived();
		b.m1();
		//b.m2(); CE- m2() is not present in Base class
	}
}
