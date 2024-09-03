package com.test.learningspringframework.game;

public class PacmanGame implements GamingConsole
{
	public void up()
	{
		System.out.println("Pacman Jump");
	}
	
	public void down()
	{
		System.out.println("Pacman Down hole");
	}
	
	public void left()
	{
		System.out.println("Pacman Go back");
	}
	
	public void right()
	{
		System.out.println("Pacman Run");
	}
}
