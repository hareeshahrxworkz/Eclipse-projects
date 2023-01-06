package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component

public class Road {
	public Road() {
		System.out.println("Road Constructor  Running ");
	}

	@Override
	public String toString() {
		System.out.println("Road tostring Running");
		return "Road";
	}
}
