package com.xworkz.bunk.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

	public Jio() {
		System.out.println("creating jio provider");
	}

	@Override
	public void connect() {
		System.out.println("Jio Implemented by Provider");
	}

}
