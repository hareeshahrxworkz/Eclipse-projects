package com.xworkz.springProject.things;

import org.springframework.stereotype.Component;

@Component("hospital")
public class Hospital {
	public Hospital() {
		System.out.println("Hospital Constructor running");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hospital";
	}

}
