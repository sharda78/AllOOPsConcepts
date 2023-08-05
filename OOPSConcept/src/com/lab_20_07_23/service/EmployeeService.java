package com.lab_20_07_23.service;
import com.lab_20_07_23.model.sub.Employee;
import com.lab_20_07_23.model.Person;
public class EmployeeService 
{
	public boolean isEligibleForRetirement(Employee e)
	{
		Person p1 = new Person();
		if(p1.age >= 60)
		{
			return true;
		}
		else
		{
			return false;
		}	
		
	}
}
