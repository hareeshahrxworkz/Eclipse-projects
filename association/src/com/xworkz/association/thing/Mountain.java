package com.xworkz.association.thing;



public class Mountain {
	
	public String name;
	public Locations location=new Locations("MUllayyanagiru", "Chikkamagaluru", "Karnataka", 577542, "India");
	public double height;
	public Temple temple=new Temple("Shiva Temple", "hindhu", 1200, 4500);
	
	
	
	public Mountain(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}



	public void showoff()
	{
		
		System.out.println("Mountaion naditha ede");
		
		System.out.println(this.name);
		System.out.println(this.height);
		this.location.showoff();
		this.temple.showoff();
		

	}
	
	
	

}
