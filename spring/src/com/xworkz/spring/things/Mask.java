package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Mask {
	public Mask() {
		System.out.println(System.lineSeparator());
		System.out.println("mask Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("to string Running mask");
		return "Mask";
	}

}
