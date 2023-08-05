package com.Polymorphism;
class Fruit
{
	public void color()
	{
		System.out.println("Fruit Class");
	}
}
class Apple extends Fruit
{
	public void color()
	{
		System.out.println("Apple Class");
	}
}
class Banana extends Fruit
{
	public void color()
	{
		System.out.println("Banana Class");
	}
}
public class DynamicDispatch {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.color();
		System.out.println("--------------------------");
		
		Apple a = new Apple();
		a.color();
		System.out.println("--------------------------");
		
		Banana b = new Banana();
		b.color();
		System.out.println("--------------------------");
		
		Fruit ft = new Apple();
		ft.color();
		System.out.println("--------------------------");
		
		ft=new Banana();
		ft.color();
		System.out.println("--------------------------");
		
		ft = new Fruit();
		ft.color();
		System.out.println("--------------------------");
		ft.color();

	}

}
