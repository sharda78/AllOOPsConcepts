package com.Inheritance;
class testperson
{
protected String name;
protected int age;
protected String email;
protected String contact;

testperson()
{
	System.out.println("Parent Class");
}
}
class Student extends testperson
{
	int roll_no;
	double marks;
	Student()
	{
		super();
		System.out.println("child Class");
	}
	
}
public class SingleInheritance3 {

	public static void main(String[] args) {
		Student s = new Student();

	}

}
