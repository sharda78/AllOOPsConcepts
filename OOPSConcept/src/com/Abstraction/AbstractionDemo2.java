package com.Abstraction;

abstract class Mobile
{
	private String modelName;
	private double price;
	
	public abstract void call();
	
	public void display()
	{
		System.out.println("Mobile display method");
	}
}
class Basic extends Mobile
{
	@Override
	public void call()
	{
		System.out.println("Basic method calling");
	}
	
}
abstract class Android extends Mobile
{
	public abstract void call();
}
class Oneplus extends Android
{
	@Override
	public void call()
	{
		System.out.println("Oneplus method calling");
	}
}
public class AbstractionDemo2 {

	public static void main(String[] args) {
		Mobile m = new Basic();
		m.call();
		//m=new Android(); // we cannot instantiated 
		m  =new Oneplus();
		m.call();

	}

}
