package com.xworkz.association.many.things;

public class Name {
	public String oldName;
	public String newName;
	public String futurename;

	public Name(String oldName, String newName, String futurename) {
		super();
		this.oldName = oldName;
		this.newName = newName;
		this.futurename = futurename;
	}
	
	
	public void display()
	{
		System.out.println(this.oldName);
		System.out.println(this.newName);
		System.out.println(this.futurename);

	}

}
