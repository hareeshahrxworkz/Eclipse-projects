package com.xworkz.things;

public class Passport {
	public int no;
	public String name;
	public String expDate;
	public String country;
	public String issueDate;
	
	public Passport(int no)
	{
		
		this.no=no;
		
	}
	public Passport(int no,String name)
	{
		
		this.no=no;
		this.name=name;
		
	}
	public Passport(int no, String name,String expDate)
	{
		
		this.no=no;
		this.name=name;
		this.expDate=expDate;
		
	}
	public Passport(String name)
	{
		
		this.name=name;
		
	}
	public Passport(String name,String expDate)
	{
		
		this.name=name;
		this.expDate=expDate;
		
	}
	public Passport(int no,String expDate,String name,String country)
	{
		
		this.no=no;
		this.expDate=expDate;
		this.name=name;
		this.country=country;
		
		
		
	}
	public Passport(String expDate,String name,String country)
	{
		
		this.expDate=expDate;
		this.name=name;
		this.country=country;
		
		
	}
	public Passport(int no,String name,String expDate,String country,String issueDate)
	{
		
		this.no=no;
		this.name=name;
		this.expDate=expDate;
		this.country=country;
		this.issueDate=issueDate;
		
		
	}

}
