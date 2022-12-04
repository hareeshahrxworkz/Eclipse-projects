package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.BMRCLMetro;

public class BmrclRule implements BMRCLMetro {

	@Override
	public boolean driver() {
		System.out.println("Bmrcl Metro running");
		return false;
	}

	@Override
	public int noOfStaff() {
		System.out.println("No of Staff running ");
		return 20;
	}

}
