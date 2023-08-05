package com.overridingAssignments;

class Kid
{
	float price;
	String name;
	
	public void readBook()
	{
		System.out.println("Overloaded Method 1");
	}
	public void readBook(float price,String name)
	{
		this.price = price;
		this.name = name;
	}
}
class BigKid extends Kid
{
	@Override
	public void readBook(float price,String name) //overriden method
	{
		System.out.println("Price is: " + price);
		System.out.println("Name is: " + name );
		 
	}
}

public class KidInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigKid b = new BigKid();
		b.readBook();
		b.readBook(200.0f, "Alphabets For Kids");


	}

}
