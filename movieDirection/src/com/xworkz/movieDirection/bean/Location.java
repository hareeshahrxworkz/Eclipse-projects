package com.xworkz.movieDirection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	@Autowired
	private Area area;

	public Location() {
		System.out.println("Running Constructor Location");

	}

	public void location()

	{
		System.out.println("Location================================================");
		System.out.println("area hash code is  : " + area.hashCode());
	}
}
