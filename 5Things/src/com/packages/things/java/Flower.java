package com.packages.things.java;



public class Flower {
	 public enum FlowerName{
			
			ROSE,LOTUS,JASMINE,SUNFLOUR,TULIP;
			
			
		}

	public static String  FlowerCompany=" Roses are Red";
	public FlowerName flower=FlowerName.SUNFLOUR;
	public String address;
	public long contactNo=9900775088L;
	public double price;
	
	
	
	public Flower(String address, double price,FlowerName flower) {
		super();
		this.address = address;
		this.price = price;
		this.flower = flower;

	}
	
	
	public void  dipslay(){
		
		System.out.println(FlowerCompany);
		System.out.println(this.flower);
		System.out.println(this.address);
		System.out.println(this.contactNo);
		System.out.println(this.price);

		
	}
			

}
