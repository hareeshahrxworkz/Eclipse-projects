package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Application {

	public Application() {
		System.out.println(System.lineSeparator());
		System.out.println("Application Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("to string running Applications");
		return "Application";
	}
}
