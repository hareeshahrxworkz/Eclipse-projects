package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Milk {
	public Milk() {
		System.out.println(System.lineSeparator());
		System.out.println("milk Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("To string Running Milk");
		return "Milk";
	}

}
