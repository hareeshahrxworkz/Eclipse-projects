package com.xworkz.movieDirection.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.movieDirection")

public class MovieConfiguration {

	public MovieConfiguration() {

		System.out.println("configuaration running MovieConfiguration");

	}

}
