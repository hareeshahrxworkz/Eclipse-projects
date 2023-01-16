package com.xworkz.bunk.bean;

import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {

	public Chrome() {
		System.out.println("Chrome is creating");
	}

	@Override
	public void browse() {
		System.out.println("Browser is implemented by chrome");
	}

}
