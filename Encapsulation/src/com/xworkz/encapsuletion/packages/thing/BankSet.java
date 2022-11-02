package com.xworkz.encapsuletion.packages.thing;

public class BankSet {
	Bank bank;
	public void setBanks(Bank bank)
	{
	
	 bank.setBank("Nandan","10:30 to 4:00", "Offline", 6, 1200, 2000, "Rajajinagra", "Karnataka", "india", 50000);
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
