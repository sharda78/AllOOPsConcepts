package com.ClassesAndObject;
class Car
{
	int model;
	String cname;
	int price;
	
	public Car(int id,String name,int p)
	{
		model=id;
		cname=name;
		price=p;
	}
	public void showCar()
	{
		System.out.println(model+" "+cname+" "+price);
	}
	
}
public class CarInfo {
	public static void main(String[] args) {
		
		Car c=new Car(1233,"BMw",8900000);
		c.showCar();
	
	}
}
