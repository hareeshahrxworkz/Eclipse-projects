package com.xworkz.bunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.bunk.Fuel;

//@Component
public class Shell implements PetrolBunk {
	@Autowired
	@Qualifier("petrol")
	Fuel fuel;
	
	public Shell() {
		System.out.println("Default constructor running petrol bunk");
	}

	@Override
	public void purchase() {
		System.out.println("Ruinning Purchase shell");
		fuel.consume();
	}

}
