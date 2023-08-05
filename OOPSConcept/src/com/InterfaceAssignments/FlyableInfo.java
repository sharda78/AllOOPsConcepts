package com.InterfaceAssignments;
interface Flyable
{
	void fly_obj();
}
class Spacecraft implements Flyable
{
	@Override
	public void fly_obj()
	{
		System.out.println("Spacecraft Class");
	}
}
class Airplane implements Flyable
{
	@Override
	public void fly_obj()
	{
		System.out.println("Airplane Class");
	}
}
class Helicopter implements Flyable
{
	@Override
	public void fly_obj()
	{
		System.out.println("Helicopter Class");
	}
}
public class FlyableInfo
{

	public static void main(String[] args)
	{
		Helicopter h = new Helicopter();
		h.fly_obj();
		
		Airplane a = new Airplane();
		a.fly_obj();
				
		Spacecraft s = new Spacecraft();
		s.fly_obj();

	}

}
