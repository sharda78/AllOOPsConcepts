package com.overridingAssignments;
class Programmer
{
	public void workingHours(int hours)
	{ 
		System.out.println("Programmer work " + hours + " hours in the day");
	}
}
class Employee extends Programmer
{
	@Override
	public void workingHours(int day)
	{
		System.out.println("Employee work " + day + " days in the month");
	}
}

public class ProgrammerInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		p.workingHours(10) ;
		
		p = new Employee();
		p. workingHours(20);

	}

}
