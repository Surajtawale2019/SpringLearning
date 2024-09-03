package com.test.learningspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.learningspringframework.game.GameRunner;
import com.test.learningspringframework.game.GamingConsole;
import com.test.learningspringframework.game.MarioGame;
import com.test.learningspringframework.game.PacmanGame;
import com.test.learningspringframework.game.SuperContarGame;


public class App03GamingBasic 
{

	public static void main(String[] args) 
	{
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);)
		{
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		} 
		catch (BeansException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
