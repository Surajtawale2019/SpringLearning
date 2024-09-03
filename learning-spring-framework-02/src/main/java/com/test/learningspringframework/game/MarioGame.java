package com.test.learningspringframework.game;

public class MarioGame implements GamingConsole
{
	public void up()
	{
		System.out.println("Mario Jump");
	}
	
	public void down()
	{
		System.out.println("Mario Down hole");
	}
	
	public void left()
	{
		System.out.println("Mario Go back");
	}
	
	public void right()
	{
		System.out.println("Mario Run");
	}
}
