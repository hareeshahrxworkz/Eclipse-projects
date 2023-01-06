package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class City {
	public City() {
		System.out.println(System.lineSeparator());
		System.out.println("City Constructor Running");

	}

	@Override
	public String toString() {
		System.out.println("to string City");
		return "City";
	}

}
