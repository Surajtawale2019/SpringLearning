package com.test.learningspringframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("unused")
public class App02HelloWorld 
{

	public static void main(String[] args) 
	{
		//Launch Spring spring context
		
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) 
		{
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person1"));
			System.out.println(context.getBean("person2Parameter"));
//		    System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean("add"));
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person3Parameter"));
		} 
		catch (BeansException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//configure things that we want spring to manage   - @configure

		
		
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
