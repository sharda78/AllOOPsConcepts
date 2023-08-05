package com.overridingAssignments;
import java.util.Scanner;

class Bank
{
	
	
	public void get()
	{
		System.out.println("Choose an account: Default,Saving,Current");
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();
		switch(ch)
		{
		case "Default":
			System.out.println("Default Account");
			System.out.println("Bank has the principal amount and a rate of interest is 2%.");
			break;
		
		case "Saving":
			System.out.println("Saving Account");
			System.out.println("Bank has the principal amount and a rate of interest is 3%.");
			break;
		case "Current":
			System.out.println("Current Account");
			System.out.println("Bank has the principal amount and a rate of interest is 5%.");
			break;
		case "default":
			System.out.println("Invalid");
			break;
		

			
		}
		sc.close();
	}
}
public class BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.get();


	}

}
