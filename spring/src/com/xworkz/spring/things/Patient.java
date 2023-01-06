package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Patient {

	public Patient() {
		System.out.println(System.lineSeparator());
		System.out.println("Patient Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("to string patient running");
		return super.toString();
	}

}
