package com.InterfaceAssignments;

interface Playable
{
	void play();
}
class Football implements Playable
{
	public void play()
	{
		System.out.println("Players are playing Football on ground\n");
	}
}
class Vollyball implements Playable
{
	public void play()
	{
		System.out.println("Players are playing Vollyball on ground\n");
	}
}
class Basketball implements Playable
{
	public void play()
	{
		System.out.println("Players are playing Basketball on ground\n");
	}
}
public class PlayableInfo {

	public static void main(String[] args) {
		Basketball b = new Basketball();
		b.play();
		
		Vollyball v =  new Vollyball();
		v.play();
		
		Football f = new Football();
		f.play();
		
	}

}
