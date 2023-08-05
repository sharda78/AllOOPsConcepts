package com.AbstractionAssignments;

abstract class Locker
{
	private int money;
	private String jewellery;
	private int pin_code;
	
	public Locker(int money,String jewellery,int pin_code)
	{
		this.money = money;
		this.jewellery = jewellery;
		this.pin_code = pin_code;
	}
	public abstract void key();
	public void display_details()
	{
		System.out.println("Total Money in Locker: " + money);
		System.out.println("Jewellery is: " + jewellery);
		System.out.println("Pin_Code is: " + pin_code);
	}
}
public class LockerInfo extends Locker
{
	LockerInfo()
	{
		super(125000,"Nekles",425036);
	}
	@Override
	public void key()
	{
		System.out.println("Overriden Method");
	}
	public static void main(String[] args) 
	{
		Locker l = new LockerInfo();
		l.display_details();
		l.key();

	}

}
