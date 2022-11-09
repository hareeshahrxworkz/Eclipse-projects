package com.xworkz.inheritance.object.child;

import com.xworkz.inheritance.object.parent.Director;

public class Prasanth extends Director {
	
	public String movieName;

	public Prasanth(String directorName, String production) {
		super(directorName, production);
	}

	public Prasanth(String directorName, String production, String movieName) {
		this(directorName, production);
		this.movieName = movieName;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.movieName);
	}
	
	
	

}
