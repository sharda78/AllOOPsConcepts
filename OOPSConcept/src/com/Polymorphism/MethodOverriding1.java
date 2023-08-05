package com.Polymorphism;
//singal inheritance with mthoverriding
class Person1
{
	protected String name;
	public int id;
	private String email;
	protected String contact;
	Person1(String name,int id,String email,String contact)
	{
		this.name = name;
		this.id = id;
		this.email = email;
		this.contact = contact;
	}
	public void show()
	{
		System.out.println("Name: " + name);
		System.out.println("ID: " +id);
		System.out.println("Email: " + email);
		System.out.println("Contact: " + contact);
	}
	
}
class Employee extends Person1
{
	int eno;
	int eid;
	String ename;
	Employee(String name,int id,String email,String contact,int eno,int eid,String ename)
	{
	super(name,id,email,contact);
	this.eno = eno;
	this.eid = eid;
	this.ename = name;
	
	}
	public void show()
	{
		super.show();
		System.out.println("*****************************");
		System.out.println("eno: " +eno);
		System.out.println("eid: " + eid);
		System.out.println("ename: " + ename);
	}
	
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		//Person1 p = new Person1("Raj",21,"raj22@gmail.com","8765789876");
				//p.show();
			
				Employee e = new Employee("Raj",21,"raj22@gmail.com","8765789876",2,23,"john");
						e.show();

	}

}
