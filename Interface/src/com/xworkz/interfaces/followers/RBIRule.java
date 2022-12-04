package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.RBI;

public class RBIRule implements RBI {

	@Override
	public String banksNames() {
		System.out.println("Bank Rule Running sucess");
		return "SBI";
	}

	@Override
	public int bankAccounts() {
		System.out.println("Bank account running");
		return 20;
	}

}
