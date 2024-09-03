package com.test.learningspringframework.game;

public class SuperContarGame implements GamingConsole
{
	public void up()
	{
		System.out.println("Contra Jump");
	}
	
	public void down()
	{
		System.out.println("Contra Down hole");
	}
	
	public void left()
	{
		System.out.println("Contra Go back");
	}
	
	public void right()
	{
		System.out.println("Contra Run");
	}
}
