package com.AbstractionAssignments;
abstract class Wifi
{
	protected String name;
	public Wifi(String name)
	{
		this.name = name;
	}
	public void adjacentRoom()
	{
		System.out.println("Wifi is connected having Name: " + name);
	}
}
class Employee extends Wifi
{
	 Employee()
	{
		super("Digisol");
	}
	@Override
	public void adjacentRoom()
	{
		System.out.println(name + " Wifi is Accessed by the Employees");
	}
}
class AdminStaff extends Wifi
{
	AdminStaff()
	{
		super("Digisol");
	}
	
	@Override
	public void adjacentRoom()
	{
		System.out.println(name + " Wifi is Accessed by the Employee as well as Admin Staff");
	}
}
public class WifiInfo {

	public static void main(String[] args) {
		Wifi w = new Employee();
		w.adjacentRoom();
		
		w = new AdminStaff();
		w.adjacentRoom();

		
		

	}

}
