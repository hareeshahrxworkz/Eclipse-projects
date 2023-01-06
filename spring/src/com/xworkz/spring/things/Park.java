package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Park {
	public Park() {
		System.out.println(System.lineSeparator());
		System.out.println("Park Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("to string Park");
		return "Park";
	}
}
