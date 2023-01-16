package com.xworkz.bunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser {
	@Autowired
	@Qualifier("airtel")
	Provider provider;

	public FireBox() {
		System.out.println("Creating FireBox Implementation");
	}

	@Override
	public void browse() {

		System.out.println("Browesr implemented by FireBox");
		provider.connect();
	}

}
