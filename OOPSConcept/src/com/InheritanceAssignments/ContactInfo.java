package com.InheritanceAssignments;
class Contact
{
	String contactperson;
	String mobile;
	String email;
	public String city,country;
	int pin;
	Contact(String contactperson,String mobile,String email)
	{
		this.contactperson = contactperson;
		this.mobile = mobile;
		this.email = email;
	}
	public void printContact()
	{
		System.out.println("\n\t Contact Class: \n Name: " + contactperson + "\nMobile No: " + mobile + "\nEmail: " + email);
	}
}
class CompanyContact extends Contact
{
	
	String companyname ,website,department,address;
	public CompanyContact(String companyname ,String website,String department,String address,String city,String country,int pin)
	{
		super("Raj","9878906775","raj2005@gmail.com");
		this.companyname = companyname;
		this.website = website;
		this.department = department;
		this.address = address;
		this.city= city;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public void printContact()
	{
		System.out.println("\n\t CompanyContact Class: \nCompany Name: " + companyname);
		System.out.println("Website: " + website);
		System.out.println("Department: " + department);
		System.out.println("Company Address: " + address);
		System.out.println("City: " + city);
		System.out.println("Country: " + country);
		System.out.println("Pin-Code: " + pin);
		
	}
	
}
class EmplyeeContact extends Contact
{
	String designation,dateofbirth;
	EmplyeeContact(String designation, String dateofbirth ,String city,String country,int pin)
	{
		super("ram","8978677897","john34@gmail.com");
		this.designation = designation;
		this.dateofbirth = dateofbirth;
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public void printContact()
	{
	System.out.println("\tEmployeeContact Class: \n Department: " + designation);
	System.out.println("Date of Birth: " + dateofbirth);
	System.out.println("City: " + city);
	System.out.println("Country: " + country);
	System.out.println("Pin-Code: " + pin);
	}
	
		
}
public class ContactInfo 
{

	public static void main(String[] args) 
	{	
		Contact c1 = new EmplyeeContact("Certificate" , "7-August-2001" ,"Pune","India",425037);
		c1.printContact();
		
		Contact c = new CompanyContact("TQ","www.tq.org","IT","Warje","Pune","India",425036);
		c.printContact();
		
		c = new Contact("John","8978677897","john34@gmail.com");
		c.printContact();
		
		
		
		
		

	}

}
