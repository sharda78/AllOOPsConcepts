package com.MethodAndStaticAssignment;
import java.util.*;
public class AccountInfo {
	int bal,with,dept;
	public void insert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Balance:");
		bal = sc.nextInt();
		}
	public void display()
	{
		System.out.println("Balance: " + bal);
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
	}
	public void deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many amount you want to deposit ?");
		dept = sc.nextInt();
		bal = with + dept;
		System.out.println("After Deposit Your Balance is: " + bal);
		sc.close();
	}
	public void check_balance()
	{
		System.out.println( "\nNow Your Total Balance is: " + bal);
	}

	public static void main(String[] args) {
		AccountInfo ac = new AccountInfo();
		ac.insert();
		ac.display();
		ac.withdraw();
		ac.deposit();

	}

}
