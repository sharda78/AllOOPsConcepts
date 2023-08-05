package com.InterfaceAssignments;

class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Draw method present in circle class");
	}
	public void erase()
	{
		System.out.println("Erase method present in circle class\n");
	}
}
class Square implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("\nDraw method present in Square class");
	}
	@Override
	public void erase()
	{
		System.out.println("Erase method present in Square class\n");
	}
}
class Triangle implements Shape
{                
	@Override
	public void draw()
	{
		System.out.println("\nDraw method present in Triangle class");
	}
	@Override
	public void erase()
	{
		System.out.println("Erase method present in Triangle class");
	}
}
public class ShapeInfo {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.draw();
		t.erase();
		
		Square s = new Square();
		s.draw();
		s.erase();
		
		Circle c = new Circle();
		c.draw();
		c.erase();

	}

}
