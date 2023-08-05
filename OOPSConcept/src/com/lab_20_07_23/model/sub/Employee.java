package com.lab_20_07_23.model.sub;

import com.lab_20_07_23.model.Person;

public class Employee extends Person
{
	public Employee()
	{
		super();
	}
	String dest;
	public void getDest(String dest)
	{
	this.dest=dest;
	}
	public void setDest()
	{
		System.out.println("Destination: " + dest);
	}
	@Override
	public String toString()
	{
		super.toString(); //method calling
		System.out.println("toString Method in Employee Class");
		return " "; 
	}


	

}
