package com.xworkz.things;

public class Malls {
	public String mallName;
	public String ownerName;;
	public String  location;
	public int noOfFlore;
	public String ownerWifeName;
	
	public String [] IstFlore;
	public String [] IIFlore;
	public String [] IIIFlore;
	public String [] IVFlore;
	public String [] VFlore;
	
	
	public Malls(String mallName,String [] IstFlore,String ownerName,String [] IIFlore,String  location,String [] IIIFlore,int noOfFlore,String [] IVFlore,String ownerWifeName,String [] VFlore) {

	this.mallName=mallName;
	this.ownerName=ownerName;
	this.location=location;
	this.noOfFlore=noOfFlore;
	this.ownerWifeName=ownerWifeName;
	this.IstFlore=IstFlore;
	this.IIFlore=IIFlore;
	this.IIIFlore=IIIFlore;
	this.IVFlore=IVFlore;
	this.VFlore=VFlore;

	
	
	}
	
	public void display()
	{
		
		System.out.println(System.lineSeparator());
		System.out.println("Printing naditha ede Mall du");	
		System.out.println(mallName);
		System.out.println(this.ownerName);
		System.out.println(this.location);
		System.out.println(this.noOfFlore);
		System.out.println(this.ownerWifeName);

		System.out.println(System.lineSeparator());
		System.out.println("IstFlore Printing naditha ede ");	

		for (int i = 0; i < IstFlore.length; i++) {
			System.out.println(IstFlore[i]);
			
		}

		System.out.println(System.lineSeparator());
		System.out.println("IIFlore Printing naditha ede ");	

		for (int i = 0; i < IIFlore.length; i++) {
			System.out.println(IIFlore[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("IIIFlore Printing naditha ede ");	

		for (int i = 0; i < IIIFlore.length; i++) {
			System.out.println(IIIFlore[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("VFlore Printing naditha ede ");	

		for (int i = 0; i < VFlore.length; i++) {
			System.out.println(VFlore[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("IVFlore Printing naditha ede ");	

		for (int i = 0; i < IVFlore.length; i++) {
			System.out.println(IVFlore[i]);
			
		}
	}

}
