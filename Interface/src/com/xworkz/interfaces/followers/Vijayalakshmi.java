package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.KarnatakaRTO;

public class Vijayalakshmi extends JavaTrinee implements KarnatakaRTO {
	
	
	Person person;

	public Vijayalakshmi(String name, int age, long contactNo, String address, String state) {
		super(name, age, contactNo, address, state);
	}
	
	
	
	@Override
	public boolean paidTax() {
		System.out.println("Paid tax Running");
		return false;
	}

	@Override
	public double gst() {
		System.out.println("Gst Running");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("vat Running");
		return 0;
	}
	
		
	

}
