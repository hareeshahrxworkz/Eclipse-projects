package com.xworkz.bunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.bunk.Fuel;

//@Component

public class Petrol implements Fuel {
	@Autowired

	public Petrol() {
		System.out.println("Petrol constructor is running");
	}

	@Override
	public void consume() {
		
		System.out.println("Consume is Petrol");

	}

}
