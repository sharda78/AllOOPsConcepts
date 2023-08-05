package com.InterfaceAssignments;

import java.util.Scanner;

/*

 */
interface Account
{
	void deposit();
	void withdraw();
	static void aboutbank()
	{
		System.out.println("Account Interface");
	}
	default void takeloan()
	{
		System.out.println();
	}
}
class Saving implements Account
{
	int dept,bal,with;
	Scanner sc = new Scanner(System.in);
	public void deposit()
	{
		
		System.out.println("How many amount you want to deposit ?");
		dept = sc.nextInt();
		bal = with + dept;
		System.out.println("After Deposit Your Balance is: " + bal + "\nNow Your Total Balance is: " + bal);
	
		
	}
	public void withdraw()
	{
		int withdrawAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many amount you want to withdraw ?");
		withdrawAmount = sc.nextInt();
	
		if(bal > 0)
		{
		with = bal - withdrawAmount;
		System.out.println("After Withdraw Your Balance is: " + with);
		}else {
			System.out.println("Your Balance is Low.");
		}
		sc.close();
	}
	public void takeloan()
	{
		System.out.println("\ntakeloan method in saving class");
	}
	
}
class Current implements Account
{
	public void deposit()
	{
		System.out.println("Deposit");
	}
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void takeloan()
	{
		System.out.println("takeloan method in current class");
	}
	
}
public class AccountAssign {

	public static void main(String[] args) {
		Saving s = new Saving();
		s.deposit();
		s.withdraw();
		s.takeloan();
		
		Current c = new Current();
		c.deposit();
		c.withdraw();
		c.takeloan();
		
		

	}

}

// what is (instanceof) operator ?