package com.InheritanceAssignments;
class Bank
{ 
	public int getInterest(int a)
	{
		return a;
	}
}
class ICICI extends Bank
{
	@Override
	public int getInterest(int b)
	{
		return b;
	}
	
}
class SBI extends Bank
{
	@Override
	public int getInterest(int c)
	{
		return c;
	}
	
}
class Axis extends Bank
{
	@Override
	public int getInterest(int d)
	{
		return d;
	}
	
}
public class BankInfo {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Banks Return Interest: " + b.getInterest(5) +"%");
;
		b = new ICICI();
		System.out.println("ICICI Bank Return Interest: " + b.getInterest(10)+"%");
		
		b = new SBI();
		System.out.println("SBI Bank Return Interest: " + b.getInterest(15)+"%");
		
		b = new Axis();
		System.out.println("Axis Bank Return Interest: " +b.getInterest(20) +"%");
	}

}
