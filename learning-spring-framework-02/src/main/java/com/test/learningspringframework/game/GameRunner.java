package com.test.learningspringframework.game;

public class GameRunner 
{
	//private MarioGame mario;
	//private SuperContarGame contarGame;
	private GamingConsole console;

//	public GameRunner(MarioGame mario) 
//	{
//		this.mario = mario;
//	}

//	public GameRunner(SuperContarGame contarGame)
//	{
//		this.contarGame = contarGame;
//	}
	
	public GameRunner(GamingConsole console) 
	{
		this.console = console;
	}
	
	public void run()
	{
		//System.out.println("Running game mario "+ mario);
		System.out.println("Running game "+ console);
		console.up();
		console.down();
		console.left();
		console.right();
	}



	
	
	
}
