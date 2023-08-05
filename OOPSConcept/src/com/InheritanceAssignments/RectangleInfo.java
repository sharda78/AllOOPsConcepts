package com.InheritanceAssignments;
class Rectangle
{
	int l,b;
	Rectangle(int l,int b)
	{
		this.l = l;
		this.b = b;
	}
	public void area()
	{
		System.out.println("Area of Rectangle: " + l * b);
	}
}
class Box extends Rectangle
{
	int depth;
	Box(int depth)
	{
		super(14,5);
		this.depth = depth;
	}
	public void boxarea()
	{
		System.out.println("Area of Box: " + l * b * depth);
	}
	
	
}
public class RectangleInfo {

	public static void main(String[] args)
	{
		Box r = new Box(5);
		r.area();
		r.boxarea();
		

	}

}
