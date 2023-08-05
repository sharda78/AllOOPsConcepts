package com.Inheritance;
class Product
{
	private int pid;
	private String pname;
	private float price;
	 int pages;
	Product(int pages)
	{
		this.pages = pages;
	}
	public void get(int pid,String pname,float price)
	{
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public void display()
	{
		System.out.println("Product id: " + pid);
		System.out.println("Product Name: " + pname);
		System.out.println("Product Price: " + price);
		System.out.println("Number of pages: : " + pages);
		System.out.println("--------------------------------");
	}
}
class Items extends Product
{
	String iname;
	int iprice;

	
	Items()
	{
		super(200);
	}
	public void items(String iname,int iprice)
	{
		this.iname = iname;
		this.iprice = iprice;
		
	}
	public void show()
	{
		System.out.println("Item name: " + iname);
		System.out.println("Item Price: " + iprice);
		
	}
}
public class SingleInheritance2 {

	public static void main(String[] args) {
		Product p = new Product(200);
		p.get(2,"Book" ,500);
		p.display();
		
		Items i = new Items();
		i.items("Pendrive", 500);
		i.show();
		
		

	}

}
