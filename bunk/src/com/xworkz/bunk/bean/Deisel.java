package com.xworkz.bunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.bunk.Fuel;
//@Component
public class Deisel implements Fuel {
	

	public Deisel() {
		System.out.println("Deisel constructor running");
	}

	@Override
	public void consume() {
		System.out.println("Consume is desial");

	}

}
