package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class God {

	public God() {
		System.out.println(System.lineSeparator());
		System.out.println("God Constructor Running");
	}

	@Override
	public String toString() {
		System.out.println("to string God");
		return "God";
	}

}
