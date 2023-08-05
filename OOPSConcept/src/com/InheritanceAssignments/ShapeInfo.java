package com.InheritanceAssignments;

class Shape
{
	public void area()
	{
		System.out.println("Shape Class");
	}
}
class Circle extends Shape
{
	
	public void area()
	{
		System.out.println("Area of circle is: " + 3.14 * 5 * 5);
	}
}
class Square extends Shape
{
	public void area()
	{
		System.out.println("Area of Square is: " + 4*4);
	}
}
public class ShapeInfo 
{

	public static void main(String[] args) 
	{
		Shape s = new Shape();
		s.area();
		System.out.println("--------------------------");
		
		Circle a = new Circle();
		a.area();
		System.out.println("--------------------------");
		
		Square b = new Square();
		b.area();
		System.out.println("--------------------------");
		
		Shape obj = new Circle();
		obj.area();
		System.out.println("--------------------------");
		
		obj=new Square();
		obj.area();
		System.out.println("--------------------------");
		
		obj = new Shape();
		obj.area();
		System.out.println("--------------------------");
		obj.area();
	}

}
