package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.Bank;
import com.xworkz.encapsuletion.packages.thing.BankSet;

public class BankRunner {
	public static void main(String[] args) {
		BankSet bankset = new BankSet();
		Bank bank = new Bank();
		bankset.setBanks(bank);
		bank.display();
		System.out.println(bank.getManagerName());
		System.out.println(bank.getServiceTime());
		System.out.println(bank.getServiceType());
		System.out.println(bank.getNoofworkingDays());
		System.out.println(bank.getNoofCustomers());
		System.out.println(bank.getNoofVisitors());
		System.out.println(bank.getAddress());
		System.out.println(bank.getState());
		System.out.println(bank.getCountry());
		System.out.println(bank.getNoofCounters());

	}

}
