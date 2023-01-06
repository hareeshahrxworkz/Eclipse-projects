package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Cycle {
	public Cycle() {
		System.out.println(System.lineSeparator());
		System.out.println("Cycle Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("Cycle toString Running ");
		return "Cycle";
	}
}
