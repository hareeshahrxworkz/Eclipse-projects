package com.xworkz.springInit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.springInit.things.Actor;
import com.xworkz.springInit.things.Rocket;
import com.xworkz.springInit.things.Session;

@Configuration
@ComponentScan("com.xworkz.springInit")
public class SpringConfiguration {

	@Bean("information")
	public Rocket getRocketInfo() {
		System.out.println("Registring Rocket");
		Rocket rocket = new Rocket("Russia", "puttin", 45321.0);
		
		return rocket;
	}
	@Bean
	
	public Actor getActoInfo()
	{
		Actor actor=new Actor("Hareesha", "Kannada", 23);
		return actor;
	}
	
	@Bean
	
	public Session  getSessionInformation()
	{
		Session session=new Session();
		
		return session;
	}

}
