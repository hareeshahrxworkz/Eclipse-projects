package com.xworkz.movieDirection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	private Capacity capacity;
	public Battery() {
		System.out.println("running constructor Battery");
	}

	public void Batterycapacity() {
		System.out.println("Capacity hash code is   : " + capacity.hashCode());

	}

}
