package com.xworkz.association.many.things;

public class Presedent {
	
	public String name;
	public int tenture=2;
	public Gender gender;
	
	public Presedent( String name) {
			this.name=name;
	
	}
	
	public void setGender(Gender gender)
	{
		this.gender=gender;
	}
	
	public void display()
	{
		System.out.println("Presedent naditha ede");
		
		
		System.out.println(this.name);
		System.out.println(this.tenture);

			
			
			if(gender!=null)
			{
				System.out.println(this.gender);
			}
	}

}
