package com.xworkz.association.thing;


public class Temple {
	
	
	public String name;
	public God god=new God("Shiva", "male", "allpower");
	public String mainPriest;
	public int noOfVisitors;
	public Integer collectionPerDay;
	
	
	
	public Temple(String name, String mainPriest, int noOfVisitors, Integer collectionPerDay) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitors = noOfVisitors;
		this.collectionPerDay = collectionPerDay;
	}



	public void showoff()
	{
		System.out.println("Temple printing naditide gothhenu");
		System.out.println(this.name);
		System.out.println(this.mainPriest);
		System.out.println(this.noOfVisitors);
		System.out.println(this.collectionPerDay);
		
		this.god.Showoff();

		
		
	}

}
