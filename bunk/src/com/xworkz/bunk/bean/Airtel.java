package com.xworkz.bunk.bean;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {

	public Airtel() {

		System.out.println("Creating Airtel Providers");
	}

	@Override
	public void connect() {
		System.out.println("Airtel Implements provider");
	}

}
