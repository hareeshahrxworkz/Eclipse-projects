package com.xworkz.webmvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.webmvc")
public class SpringConfigurationWebMVC {

	public SpringConfigurationWebMVC() {

		System.out.println("Running configuration");
	}

}
