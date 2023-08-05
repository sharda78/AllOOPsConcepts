package com.InheritanceAssignments;
class Student1
{
	
	int roll_no;
	String name;
	Student1(int roll_no,String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
	
}
class Record extends Student1
{
	Record()
	{
		super(22,"Garg");
	}
	public void display()
	{
		System.out.println("Roll NUmbner: " + roll_no);
		System.out.println("Name: " + name);
	}
}
public class StudentInfo1 {

	public static void main(String[] args) {
		Record s2 = new Record();
		s2.display();

	}

}
