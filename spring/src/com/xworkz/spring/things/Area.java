package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Area {

	public Area() {
		System.out.println(System.lineSeparator());
		System.out.println("Area Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("to string running Area");
		return "Area";
	}

}
