package com.xworkz.person.association.thing;

public class Job {

	public Integer salary;
	public String role;
	public boolean bond;
	public Company company;

	public void setJob(Integer salary, String role, boolean bond, Company company) {
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}

	public void display() {
		System.out.println(System.lineSeparator());
		System.out.println("job printing nadithaede");
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		if (company != null) {

			this.company.display();
		}

	}

}
