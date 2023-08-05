package com.overridingAssignments;
//method Overridining
class Company
{
	public void address()
	{
		System.out.println("Address Method in Company Class");
	}
}
class eBay extends Company
{
	public void address()
	{
		System.out.println("Address Method in eBay Class");
	}
	
}

public class CompanyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		c.address();
		
		Company c1 =  new eBay();
		c1.address();
	
	

	}

}
