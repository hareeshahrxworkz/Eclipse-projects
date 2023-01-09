package com.xworkz.springProject.things;

import org.springframework.stereotype.Component;

@Component("temple")
public class Temple {
	public Temple() {
		System.out.println("Temple class is running");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Temple";
	}

}
