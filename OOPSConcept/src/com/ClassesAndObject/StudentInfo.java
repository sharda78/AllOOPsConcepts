package com.ClassesAndObject;

public class StudentInfo 
{
	int id;
	String name;
	double marks;
	
	public StudentInfo(int sid,String sname,double mk)
	{
		id=sid;
		name=sname;
		marks=mk;
		
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+marks);
	}



	public static void main(String[] args) {
		StudentInfo s=new StudentInfo(101,"neha",89.45);
		s.display();


	}

}
