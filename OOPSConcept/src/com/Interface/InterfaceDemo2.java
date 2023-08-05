package com.Interface;

interface Language
{
	void show(String name);  // by default it's default or public
}
class ProgrammingLang implements Language
{
	public void show(String name)
	{
		System.out.println("Programming Language :" + name);
	}
}
class CommunicationLang implements Language
{
	public void show(String name)
	{
		System.out.println("Programming Language :" + name);
	}
}
class ScriptingLang implements Language
{
	public void show(String name)
	{
		System.out.println("Programming Language :" + name);
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) 
	{
		Language ob;
		ob = new ProgrammingLang();
		ob.show("Core Java");
		
		ob = new CommunicationLang();
		ob.show("English");
		
		ob = new ScriptingLang();
		ob.show("Javascript");

	}

}
