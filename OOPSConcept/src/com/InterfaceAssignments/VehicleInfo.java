package com.InterfaceAssignments;

interface Bike
{
	void offer();
	default void details()
	{
		System.out.println("Bike interface");
	}
}
interface Scooty
{
	void offer();
	default void details()
	{
		System.out.println("Bike interface");
	}
}
class Buysomething implements Bike,Scooty
{
	public void offer()
	{
		System.out.println("offer method present in Buysomething");
	}
	public void details()
	{
		Bike.super.details();       // to call
	}
}
public class VehicleInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
