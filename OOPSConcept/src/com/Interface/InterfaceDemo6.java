package com.Interface;

class Phone
{
	void msg()
	{
		System.out.println("Making msg using this method");
	}
	void call()
	{
		System.out.println("Making call using this method");
	}
}

interface SmallPhone
{
	void recordvideo();
	void click();
}
interface Photos
{
	void play();
	void pause();
	void stop();
}
class SmartPhone extends Phone implements SmallPhone,Photos
{
	@Override
	public void recordvideo()
	{
		System.out.println("Record video");
	}
	@Override
	public void click()
	{
		System.out.println("Click picture");
	}
	@Override
	public void play()
	{
		System.out.println("Play Music");
	}
	@Override
	public void pause()
	{
		System.out.println("Pause Music");
	}
	@Override
	public void stop()
	{
		System.out.println("Stop Music");
	}
	
}
public class InterfaceDemo6 {

	public static void main(String[] args) 
	{
		SmartPhone obj = new SmartPhone();
		obj.call();
		obj.msg();
		obj.recordvideo();
		obj.click();
		obj.play();
		obj.pause();
		obj.stop();

	}

}
