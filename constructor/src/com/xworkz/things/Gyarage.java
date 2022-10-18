package com.xworkz.things;

public class Gyarage {
	public String gyarageName;
	public long conatatNo;
	public double licenceAmount;
	public int licenceNo;
	public String gyarageOwnerName;
	public boolean serviceAvailable;
	
	public String[] accories;
	public int [] membersalarys;
	public String [] oilName;
	public double oilPrice [];
	
	
	public Gyarage( String gyarageName, String[] accories,long conatatNo,int [] membersalarys,double licenceAmount,String [] oilName,int licenceNo,String gyarageOwnerName, double oilPrice [],boolean serviceAvailable) {
		this.gyarageName=gyarageName;
		this.conatatNo=conatatNo;
		this.licenceAmount=licenceAmount;
		this.gyarageOwnerName=gyarageOwnerName;
		this.licenceNo=licenceNo;
		this.serviceAvailable=serviceAvailable;
		this.accories=accories;
		this.membersalarys=membersalarys;
		this.oilName=oilName;
		this.oilPrice=oilPrice;

		
	}
	public void display()
	{
		System.out.println("Gyarage Printing naditha ede");
		System.out.println(this.gyarageName);
		
		System.out.println(this.conatatNo);
		System.out.println(this.licenceAmount);
		System.out.println(this.gyarageOwnerName);
		System.out.println(this.licenceNo);
		System.out.println(this.serviceAvailable);

	
	System.out.println(System.lineSeparator());
	System.out.println("accories Printing naditha ede");
	for (int i = 0; i < accories.length; i++) {
		System.out.println(accories[i]);
		
	}
	
	System.out.println(System.lineSeparator());
	System.out.println("oilPrice Printing naditha ede");
	for (int i = 0; i < oilPrice.length; i++) {
		System.out.println(oilPrice[i]);
		
	}
	System.out.println(System.lineSeparator());
	System.out.println("membersalarys Printing naditha ede");
	for (int i = 0; i < membersalarys.length; i++) {
		System.out.println(membersalarys[i]);
		
	}
	System.out.println(System.lineSeparator());
	System.out.println("oilName printing  naditha ede");
	for (int i = 0; i < oilName.length; i++) {
		System.out.println(oilName[i]);
		
	}
	}
}
