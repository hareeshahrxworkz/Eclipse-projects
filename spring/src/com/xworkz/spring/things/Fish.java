package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Fish {
	public Fish() {
		System.out.println(System.lineSeparator());
		System.out.println("fish Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("to string Fish");
		return "Fish";
	}

}
