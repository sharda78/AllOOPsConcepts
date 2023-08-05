package com.Interface;
interface interfaceA
{
	// default method present in interface is implicitly public 
	// we cannot use any other acess modifier to default method
	// in interface ,methods are by default public abstract
	public default void show()
	{
		System.out.println("show mthd in interface A");
	}
}
interface interfaceB
{
	default void show()
	{
		System.out.println("interfaceB");
	}
}
class Child implements interfaceA,interfaceB
{
	public void show()
	{
		interfaceA.super.show();
		interfaceB.super.show();
	}
}
public class InterfaceDemo8 {

	public static void main(String[] args) {
		Child c = new Child();
		c.show();

	}

}
