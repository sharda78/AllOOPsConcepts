package com.ClassesAndObject;

public class Product
{
	int product_id;
	public Product()
	{
		System.out.println("Default");
		product_id=540;
		
	}
	public Product(String name)
	{
		System.out.println("Product name= "+name);
	}
	

	public static void main(String[] args) {
		
		Product p=new Product();
		System.out.println(p.product_id);
	//	Product p2=new Product("PenDrive");
				

	}


}
