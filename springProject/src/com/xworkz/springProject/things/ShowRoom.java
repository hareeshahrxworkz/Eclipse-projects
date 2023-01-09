package com.xworkz.springProject.things;

import org.springframework.stereotype.Component;

@Component("showRoom")
public class ShowRoom {
	public ShowRoom() {
		System.out.println("Show room constructor is running");
	}
	
	@Override
	public String toString() {
		return "Show Room";
	}

}
