package com.xworkz.person.association.thing;

public class Email {

	public String id;
	public String password;
	public long mobileNo;
	public Company company;

	public void setEmail(String id, String password, long mobileNo, Company company) {
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
		this.company = company;

	}

	public void display() {
		System.out.println(System.lineSeparator());
		System.out.println("email printing agtha ede");
		System.out.println(this.id);
		System.out.println(this.password);
		if (company != null) {

			this.company.display();
		}

	}

}
