package com.Interface;

interface Cng_Car
{
	void drive();
	void cng_car_kit();
}
interface Petrol_Car
{
	void drive();
	void petrol_car_kit();
}
class HybridCar implements Cng_Car,Petrol_Car
{
	@Override
	public void drive()
	{
		System.out.println("Drive method in hybridcar");
	}
	@Override
	public void cng_car_kit()
	{
		System.out.println("cng_car_kit method in hybridcar");
	}
	@Override
	public void petrol_car_kit()
	{
		System.out.println("petrol_car_kit method in hybridcar");
	}
}

public class InterfaceDemo5 {

	public static void main(String[] args) 
	{
		HybridCar ob = new HybridCar();
		ob.drive();
		ob.cng_car_kit();
		ob.petrol_car_kit();

	}

}
