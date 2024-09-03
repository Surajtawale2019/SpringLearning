package com.test.learningspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//public accesor methods / constructors
//equals , to string , hascode are automatically created

record Person(String name , int age ,Address address) {};

record Address(String fname, String city , int pin) {};

@Configuration
public class HelloWorldConfiguration 
{
	@Bean
	public String name()
	{
		return "Suraj";
	}
	
	@Bean
	public int age()
	{
		return 23;
	}
	
	@Bean
	public Person person()
	{
		return new Person("Rushi", 25, new Address("ghatkopar", "Mumbai" ,400604 ));
	}
	
	@Bean
	public Person person1()
	{
		return new Person(name(), age() , address());	// creating bean based on exsisting beans
	}
	
	@Bean
	@Primary
	public Person person2Parameter(String name , int age , Address add1)
	{
		return new Person(name, age , add1);	// creating bean based on exsisting beans
	}
	
	@Bean
	@Primary
	public Person person3Parameter(String name , int age ,@Qualifier("addQulifier") Address address)
	{
		return new Person(name, age , address);	// creating bean based on exsisting beans
	}
	
	@Bean(name = "add")
	public Address address()
	{
		return new Address("mulund", "Mumbai" ,400608);
	}
	
	@Bean(name = "add1")
	@Primary
	public Address address1()
	{
		return new Address("Thane", "Mumbai" ,400604 );
	}
	
	@Bean(name = "add2")
	@Qualifier("addQulifier")
	public Address address2()
	{
		return new Address("CST", "Mumbai" ,400609 );
	}
}
