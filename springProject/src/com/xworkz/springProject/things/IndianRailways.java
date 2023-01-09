package com.xworkz.springProject.things;

import org.springframework.stereotype.Component;

@Component("indianRailways")
public class IndianRailways {

	public IndianRailways() {
		System.out.println("Indian Railways running ");
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "indian Railways";
}
	
}
