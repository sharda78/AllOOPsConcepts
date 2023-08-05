package com.Polymorphism;
//hirarchical inheritance
class Mobile
{
	public void msg() //method overriding
	{
		System.out.println("Parent mobile msg method");
	}
}
class Jio extends Mobile
{
	public void msg() // method overriding
	{
		System.out.println("msg method from child class");
	}
	public void call()
	{
		System.out.println("call method from child class ");
	}
	
}
class Idea extends Mobile
{
	public void msg()   //method overriding
	{
		System.out.println("Idea msg method");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.msg();

		
		Mobile m1 = new Jio(); //accessing child class method by using parent class object.
		m1.msg();  // upcasting or dynamic dispatch
		
		Jio j = new Jio();
		j.call();
		
		//m1.call(); // cannot invoke bcoz in dynamic dispatching (compulsary method overring is there means 
		               //common mth having parent class and child class)
		
		Mobile m2 = new Idea();
		m2.msg();

	}

}
