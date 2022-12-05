package com.xworkz.interfaces.followers;

public abstract class Person extends Object {
	
	public String name;
	private int age;
	private long contactNo;
	private String Address;
	private String State;
	
	
	
	public Person(String name, int age, long contactNo, String address, String state) {
		super();
		this.name = name;
		this.age = age;
		this.contactNo = contactNo;
		Address = address;
		State = state;
	}

	

	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public long getContactNo() {
		return contactNo;
	}



	public String getAddress() {
		return Address;
	}



	public String getState() {
		return State;
	}



	abstract public void eat();
	

	abstract public void sleep();

	
}
