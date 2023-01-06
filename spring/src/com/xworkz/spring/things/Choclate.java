package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Choclate {
	public Choclate() {
		System.out.println(System.lineSeparator());
		System.out.println("Chcolate Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println(System.lineSeparator());
		
		return "Choclate";
	}
	
}
