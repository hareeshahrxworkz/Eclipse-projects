package com.xworkz.encapsuletion.packages.thing;

public class Bank {

	private String bankName = "State Bank of India";

	String ManagerName;
	String ServiceTime;
	String ServiceType;
	int NoofworkingDays;
	int NoofCustomers;
	int NoofVisitors;
	String Address;
	String State;
	String Country;
	 int NoofCounters;

	public void setBank(String managerName, String serviceTime, String serviceType, int noofworkingDays, int noofCustomers,
			int noofVisitors, String address, String state, String country, int noofCounters) {
		ManagerName = managerName;
		ServiceTime = serviceTime;
		ServiceType = serviceType;
		NoofworkingDays = noofworkingDays;
		NoofCustomers = noofCustomers;
		NoofVisitors = noofVisitors;
		Address = address;
		State = state;
		Country = country;
		NoofCounters = noofCounters;
	}

	public String getManagerName() {
		return this.ManagerName;
	}

	public String getServiceTime() {
		return this.ServiceTime;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public int getNoofworkingDays() {
		return this.NoofworkingDays;
	}

	public int getNoofCustomers() {
		return this.NoofCustomers;
	}

	public int getNoofVisitors() {
		return this.NoofVisitors;
	}

	public String getAddress() {
		return this.Address;
	}

	public String getState() {
		return this.State;
	}

	public String getCountry() {
		return this.Country;
	}

	public int getNoofCounters() {
		return this.NoofCounters;
	}

	public void display() {

		System.out.println(this.bankName);
		System.out.println(this.ManagerName);
		System.out.println(this.ServiceTime);
		System.out.println(this.ServiceType);
		System.out.println(this.NoofworkingDays);
		System.out.println(this.NoofCustomers);
		System.out.println(this.NoofVisitors);
		System.out.println(this.Address);
		System.out.println(this.State);
		System.out.println(this.Country);
		System.out.println(this.getNoofCounters());
		System.out.println(NoofCounters);

	}

}
