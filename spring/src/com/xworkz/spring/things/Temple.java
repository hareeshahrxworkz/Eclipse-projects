package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Temple {
	public Temple() {
		System.out.println(System.lineSeparator());
		System.out.println("Temple Constructor Running");
	}
	@Override
	public String toString() {
		System.out.println("to string Temple");
		return "Temple";
	}

}
