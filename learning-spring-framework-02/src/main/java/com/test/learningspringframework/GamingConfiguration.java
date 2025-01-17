package com.test.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.learningspringframework.game.GameRunner;
import com.test.learningspringframework.game.GamingConsole;
import com.test.learningspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration 
{
	@Bean
	public GamingConsole game()
	{
		var pacman = new PacmanGame();
		return pacman;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game)
	{
		var gameRunner = new GameRunner(game);		// or use game();
		return gameRunner;
	}
	
}
