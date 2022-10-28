package com.xworkz.enums.things;

public class Name {
	public String firstname;
	public String lastname;
	public String middlename;
	
	
	
	
	public Name(String firstname, String lastname, String middlename) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
	}




	public void dis()
	{
		
		System.out.println("name naditha ede");
		System.out.println(this.firstname);
		System.out.println(this.lastname);
		System.out.println(this.middlename);
	}

}
