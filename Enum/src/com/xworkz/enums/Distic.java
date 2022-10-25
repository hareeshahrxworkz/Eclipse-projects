package com.xworkz.enums;

public class Distic {
	
	
	public String country;
	public String states;
	public EnumClass [] distic=EnumClass.values();
	public EnumClass val=EnumClass.BANGLORE;

	public int noOfDistic;

	
	public Distic (String country,String states ,int noOfDistic ) 
	{
		this.country=country;
		this.states=states;
		this.noOfDistic=noOfDistic;
	} 
	
	
	public void  display()
	{
		
		System.out.println(this.country);
		System.out.println(this.states);
		System.out.println(this.noOfDistic);
		for (int i = 0; i < distic.length; i++) {
			
			System.out.println(distic[i]);

		}
		
		System.out.println(this.val.value);
		}


		
	
	

}
