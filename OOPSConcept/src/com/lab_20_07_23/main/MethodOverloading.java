package com.lab_20_07_23.main;
import com.lab_20_07_23.model.Person;
import com.lab_20_07_23.model.sub.Employee;
import com.lab_20_07_23.service.EmployeeService;
//import com.lab_20_07_23.model.Person;

public class MethodOverloading 
{
	public void add(int a,int b)
	{
		System.out.println("addition is : " + (a+b));
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add(10, 20);
		
		System.out.println("------------------------------");
		EmployeeService e2 = new EmployeeService();
		e2.isEligibleForRetirement(null);
		
		System.out.println("-------------------------------");
		
		Person p = new Person(2,"John",34);
		p.display();
		
		System.out.println("----------------------------");
		
		Employee e1 = new Employee();
		
		e1.getId(3);
		e1.getName("Reena");
		e1.getDest("pune");
		e1.getAge(21);
		
			
		e1.setId();
		e1.setName();
		e1.setAge();
		e1.setDest();
		e1.toString();

	}

}
