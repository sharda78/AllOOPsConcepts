package com.AbstractionAssignments;
import java.util.*;
abstract class Company
{
	String names;
	int id;
	int hours;
	float sal;
	
	Company(String names,int id,int hours)
	{
		this.names = names;
		this.id = id;
		this.hours = hours;
	}
	
	public abstract void track();
	
}
class Employees extends Company
{
	
		Employees()
	{
		super("Reena ", 13,8);
	}
	@Override
	public void track()
	{
		System.out.println("Company track the Employees Informations\n");
		if(hours <= 5)
		{
			sal = hours * 200;	
			System.out.println(names + " is Part-Time Employee having Salary " + sal);
		}
		else if( hours > 5 || hours == 8)
		{
			sal = hours * 500;	
			System.out.println(names + " is Full-Time Employee having Salary " + sal);
		}
	}
	
	public void displayEmployeesInfos()
	{
		System.out.println("Employee Name is: " + names);
		System.out.println("Employee ID is: " + id);
		
	}
}
public class EmployeesInfo 
{

	public static void main(String[] args) 
	{
		Company c = new Employees();
		c.track();
		
		Employees e = new Employees();
		e.displayEmployeesInfos();
		
		
		

	}

}
