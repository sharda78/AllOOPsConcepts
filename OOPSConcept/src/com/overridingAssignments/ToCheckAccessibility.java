package com.overridingAssignments;
class Parent
{
	public int n1;
	private int n2;
	protected int n3;
	int n4;
	public void initilize()
	{
		n1 = 10;
		n2 = 20;
		n3 = 30;
		n4 = 40;
	}
	public void display()
	{
		System.out.println("In Parent Class");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
}
class Child extends Parent
{
	public void show()
	{
		System.out.println("\nIn Child Class");
		System.out.println(n1);
	 //   System.out.println(n2);  //we cannot access n2 bcoz of private acess modifier
		System.out.println(n3);
		System.out.println(n4);

	}
}

public class ToCheckAccessibility {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.initilize();
		c1.display();
		c1.show();


	}

}
