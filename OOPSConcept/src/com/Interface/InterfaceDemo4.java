package com.Interface;
//multilevel inheritance used here 
interface Mobile
{
	void call();
}
interface Basic extends Mobile
{
	void msg();
}
class Nokia implements Basic
{
	public void msg()
	{
		System.out.println("nokia phone msg method");
	}
	public void call()
	{
		System.out.println("nokia phone call methos");
	}
}
public class InterfaceDemo4 {

	public static void main(String[] args) {
		Nokia n = new Nokia();
		n.msg();
		n.call();

	}

}
