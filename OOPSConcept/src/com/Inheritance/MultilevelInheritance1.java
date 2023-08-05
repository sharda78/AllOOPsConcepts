package com.Inheritance;
class Car 
{
	public void drive()
	{
		System.out.println("Drive Method...");
	}
}
class BMW extends Car
{
	public void engine()
	{
		System.out.println("Engine Method");
	}
}
class Audi extends BMW
{
	public void color()
	{
		System.out.println("Color Method");
	}
	public void seat()
	{
		System.out.println("Seat Method");
	}
}

public class MultilevelInheritance1 {

	public static void main(String[] args) {
		Audi a = new Audi();
		a.drive();
		a.seat();
		a.color();

	}
	
	//toString - this mtd is  string representation of an object

}
