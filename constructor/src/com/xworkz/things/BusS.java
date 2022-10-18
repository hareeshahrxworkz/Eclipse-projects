package com.xworkz.things;

public class BusS {
	
	public String busDepo;
	public String deponame;
	public String depoManager;
	public String depoLocation;
	public String pass;
	public int noOfMechanic ;
	
	public String [] busColor;
	public String [] busNo;
	public String [] busNameType;
	public String depotLocation[];
	
	public BusS(String busDepo,String [] busColor,String deponame,String [] busNo,String depoManager,String depoLocation,String [] busNameType,String pass,String depotLocation[],int noOfMechanic) {
		this.busDepo=busDepo;
		this.depoLocation=depoLocation;
		this.deponame=deponame;
		this.depoManager=depoManager;
		this.pass=pass;
		this.noOfMechanic=noOfMechanic;
		this.busColor=busColor;
		this.busNo=busNo;
		this.busNameType=busNameType;
		this.depotLocation=depotLocation;

		
		
		
	}
	
	public void display()
	{
		
		System.out.println(System.lineSeparator());
		System.out.println("Printing naditha ede bus du");
		
		System.out.println(this.busDepo);
		System.out.println(this.depoLocation);
		System.out.println(this.deponame);
		System.out.println(this.depoManager);
		System.out.println(this.pass);
		System.out.println(this.noOfMechanic);

		System.out.println(System.lineSeparator());
		System.out.println("busNo Printing naditha ede ");
		
		
		for (int i = 0; i < busNo.length; i++) {
			
			System.out.println(busNo[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("Printing naditha ede ");
		
		
		for (int i = 0; i < busColor.length; i++) {
			
			System.out.println(busColor[i]);
			
		}

		System.out.println(System.lineSeparator());
		System.out.println("busNameType Printing naditha ede ");
		
		
		for (int i = 0; i < busNameType.length; i++) {
			
			System.out.println(busNameType[i]);
			
		}

		System.out.println(System.lineSeparator());
		System.out.println("Printing naditha ede ");
		
		
		for (int i = 0; i < depotLocation.length; i++) {
			
			System.out.println(depotLocation[i]);
			
		}


	}
	
}
