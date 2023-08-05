package com.InheritanceAssignments;
class Student
{
	protected String name;
	protected int roll_no;
	protected int marks;
	Student(String name,int roll_no,int marks)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.marks = marks;
	}
	public void show()
	{
		System.out.println("Name : " + name);
		System.out.println("Roll Number: " + roll_no);
		System.out.println("Marks: " + marks);
	}
	
}
class Myrecord extends Student
{
	float per = marks / 3;
	String degree;
	Myrecord(String degree)
	{
		super("John",13,250);
		this.degree = degree;
	}
	public void show()
	{
		super.show(); 
		System.out.println("Degree: " + degree);
		System.out.println("Percentage: " + per);
	}
}
public class StudentInfo {

	public static void main(String[] args) 
	{
		Myrecord s = new Myrecord("MCA");
		s.show();

	}

}
