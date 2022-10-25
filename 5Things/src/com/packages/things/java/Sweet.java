package com.packages.things.java;

public class Sweet {

	static final String  BRAND="Sweet AND Joy";
	public Constant constant;
	public String storeName="Manjunath Bekary";
	public long contactNo;
	public String address;
	
	
	public Sweet(Constant constant, long contactNo) {
		this.constant = constant;
		this.contactNo=contactNo;
	}
	
	
	
	public void display()
	{
		
		System.out.println(BRAND);
		System.out.println(this.constant);
		System.out.println(this.storeName);
		System.out.println(this.contactNo);
		System.out.println(this.address);
	}
	
	
	
	
	
	
	
	
	
}
