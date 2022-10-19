package com.xworkz.things;

public class Medical {
	
	public String name;
	public String ownerName;
	public String adress;
	public boolean Running;
	public int rent;
	
	public String[] tabletname;
	public String[] shopeLocations;
	public String[] noOfWorkerName;
	public int[] prices;
	public String[] hospitalContact;


	public Medical(String name,String[] shopeLocations,String ownerName,String[] noOfWorkerName,String adress,int[] prices,boolean Running,String[] hospitalContact,int rent,String[] tabletname)
	{
this.name=name;
this.ownerName=ownerName;
this.adress=adress;
this.Running=Running;
this.rent=rent;
this.tabletname=tabletname;
this.shopeLocations=shopeLocations;
this.noOfWorkerName=noOfWorkerName;
this.prices=prices;
this.hospitalContact=hospitalContact;


	
	
	}
	public void display()
	{
		
		System.out.println(System.lineSeparator());
		System.out.println("Printing naditha ede bus du");
		
		System.out.println(this.name);
		System.out.println(this.ownerName);
		System.out.println(this.adress);
		System.out.println(this.Running);
		System.out.println(this.rent);

		System.out.println(System.lineSeparator());
		System.out.println("tabletname Printing naditha ede ");
		
		
		for (int i = 0; i < tabletname.length; i++) {
			
			System.out.println(tabletname[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("shopeLocations Printing naditha ede ");
		
		
		for (int i = 0; i < shopeLocations.length; i++) {
			
			System.out.println(shopeLocations[i]);
			
		}

		System.out.println(System.lineSeparator());
		System.out.println("noOfWorkerName Printing naditha ede ");
		
		
		for (int i = 0; i < noOfWorkerName.length; i++) {
			
			System.out.println(noOfWorkerName[i]);
			
		}

		System.out.println(System.lineSeparator());
		System.out.println("prices Printing naditha ede ");
		
		
		for (int i = 0; i < prices.length; i++) {
			
			System.out.println(prices[i]);
			
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("hospitalContact Printing naditha ede ");
		
		
		for (int i = 0; i < hospitalContact.length; i++) {
			
			System.out.println(hospitalContact[i]);
			
		}
		}
	

}
