package com.overridingAssignments;

class Bike
{
	String color;
	int speed;
	
	public  Bike(String color,int speed) //parameterized constructor
	{
		this.color = color;
		this.speed = speed;
	}
	public void bikeinfo()
	{
		System.out.println("Bike Color is:" + color);
		System.out.println("Bike Speed is: " + speed);
	}
}
class Pulsar extends Bike
{
	Pulsar(String color,int speed)
	{
		super(color,speed);
	}
	@Override
	public void bikeinfo()
	{
		System.out.println("Pulsar Color is:" + color);
		System.out.println("Pulsar Speed is: " + speed);

	}
}

public class BikeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike("Red" , 100);
		b.bikeinfo();
		
		b = new Pulsar("Blue" , 80);
		b.bikeinfo();

	}

}
