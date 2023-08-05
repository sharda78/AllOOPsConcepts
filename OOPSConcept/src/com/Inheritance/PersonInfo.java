package com.Inheritance;
//19th july 2023

class Person {

	protected String name;
	protected int age;
	protected String email;
	protected String contact;

	Person(String name, int age, String email, String contact) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.contact = contact;
	}

	public void show() {
		System.out.println("Name\t:" + name);
		System.out.println("Age\t:" + age);
		System.out.println("Email\t:" + email);
		System.out.println("Contact\t:" + contact);

	}
}

class Student2 extends Person {
	int rollno;
	double marks;

	Student2(String name, int age, String email, String contact, int rollno, double marks) {
		super(name, age, email, contact);
		this.rollno = rollno;
		this.marks = marks;
	}

	public void show() {
		System.out.println("Rollno\t:" + rollno);
		super.show();
		System.out.println("Marks\t:" + marks);
	}
}
//class Teacher
//desgree
//sal

public class PersonInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Kiara", 30, "kiara@gmail.com", "7894561233");
		p1.show();
		System.out.println("----------------------");
		Student2 s = new Student2("rahul", 20, "rahul@gmail.com", "7412589633", 101, 45);
		s.show();
	}

}
