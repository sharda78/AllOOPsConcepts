package com.MethodAndStaticAssignment;

class Student
{
	 int id;
	 int customid;
	 String customName;
	 
	public void displayData()
	{
		int id = 32;
		id = 45;
		String name = "Ram";
		name = "John";
		System.out.println(id + " " + name);
		Student s1 = new Student();
		System.out.println(s1.getId(50));

	}
	public int getId(int id)
	{
		return id;
	}
	public void setCustomData(int customid,String customName)
	{
		this.customid =customid;
		this.customName = customName;
	System.out.println(customid + " " + customName);	
	}
	
	
}
public class MethodAss1 
{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.displayData();
		s1.setCustomData(40, "John Doe");
		
	System.out.println(s1);

	}

}
