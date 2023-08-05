package com.AbstractionAssignments;

abstract class PhoneBook
{
	public String name;
	public int contact;
	
	public PhoneBook(String name,int contact)
	{
		this.name = name;
		this.contact = contact;
	}
	public void getdetails()
	{
		System.out.println("Name is: " + name + "\n" + "Contact is:" + contact);
	}

}
public  class PhoneBookInfo extends PhoneBook
{
	
	 PhoneBookInfo()
	{
		super("ram",897675789);
	}
	public static void main(String[] args) 
	{
		PhoneBook p = new PhoneBookInfo();
		p.getdetails();
		

	}

}
