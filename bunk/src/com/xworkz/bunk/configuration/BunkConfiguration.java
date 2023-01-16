package com.xworkz.bunk.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bunk")
public class BunkConfiguration {
	public BunkConfiguration() {
		System.out.println("bunk constructor is running");
	}

}
