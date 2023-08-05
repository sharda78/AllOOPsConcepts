package com.overridingAssignments;

class Shape
{
	public int a;
	public void draw()
	{
		System.out.println("draw method in shape class");
	}
}
class Circle extends Shape
{
	int r = 3;
	float pi=3.14f;
	public void draw()
	{
		System.out.println("Area of circle: " + pi*r*r);
	}
}
class Square extends Shape
{
	public void draw()
	{
		int a=5;
		System.out.println("Area of Square: " + a*a);
		 
	}
}
class Rectangle extends Shape
{
	public void draw()
	{
		int l= 6,b = 8;
		System.out.println("Area of Rectangle is: " + l*b);
	}
}
public class ShapeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.draw();
		s=new Circle();
		s.draw();
		s=new Square();
		s.draw();
		s=new Rectangle();
		s.draw();

	}

}
