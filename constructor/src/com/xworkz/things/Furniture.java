package com.xworkz.things;

public class Furniture {

	public String shopName;
	public String ownerName;
	public String shopNo;
	public String shopAdress;
	public int noOfWorkers;
	public boolean running;
	
	public String  [] shoplocations= {"Banglore","Chitradurga","Hosadurga","Mysore","Chikkamagaluru"};
	public String [] shopeWorkerName= {"nagaraj","Bhuvanesh","Rajanna","Bhadrinath","Manjunath"};
	public int [] shopeWorkerId= {100,200,3001,4001,5001};
	public String []  furniturs= {"Chair","Table","Beer","Cobod"};
	public String []  accerices= {"Iron Sheet","Welding machine","Current","Gascutter","lath"};
	
	
	public Furniture( String shopName,String [] shopeWorkerName,String ownerName,int [] shopeWorkerId,String shopNo,String shopAdress,String []  furniturs, int noOfWorkers,String []  accerices,boolean running,String  [] shoplocations) {
 
	this.shopName=shopName;
	this.ownerName=ownerName;
	this.shopNo=shopNo;
	this.shopAdress=shopAdress;
	this.noOfWorkers=noOfWorkers;
	this.running=running;
	this.shopeWorkerName=shopeWorkerName;
	this.shoplocations=shoplocations;
	this.furniturs=furniturs;
	this.shopeWorkerId=shopeWorkerId;
	this.accerices=accerices;

	
	
	}
	public void display()
	{
		
		System.out.println(System.lineSeparator());
		System.out.println("Printing naditha ede bus du");
		
		System.out.println(this.shopName);
		System.out.println(this.ownerName);
		System.out.println(this.shopNo);
		System.out.println(this.shopAdress);
		System.out.println(this.running);
		System.out.println(this.noOfWorkers);

		System.out.println(System.lineSeparator());
		System.out.println("furniturs Printing naditha ede ");
		
		
		for (int i = 0; i < furniturs.length; i++) {
			
			System.out.println(furniturs[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("accerices Printing naditha ede ");
		
		
		for (int i = 0; i < accerices.length; i++) {
			
			System.out.println(accerices[i]);
			
		}

		System.out.println(System.lineSeparator());
		System.out.println("furniturs Printing naditha ede ");
		
		
		for (int i = 0; i < furniturs.length; i++) {
			
			System.out.println(furniturs[i]);
			
		}

		System.out.println(System.lineSeparator());
		System.out.println("shoplocations Printing naditha ede ");
		
		
		for (int i = 0; i < shoplocations.length; i++) {
			
			System.out.println(shoplocations[i]);
			
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("shoplocations Printing naditha ede ");
		
		
		for (int i = 0; i < shoplocations.length; i++) {
			
			System.out.println(shoplocations[i]);
			
		}

	}
}
