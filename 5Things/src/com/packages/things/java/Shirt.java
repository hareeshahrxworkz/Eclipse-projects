package com.packages.things.java;

public class Shirt {
	
	public enum ShirtBrand{
		
		F20,ADIDAS,ARROW,AJJIO,CELIO;
		
	}
	
	public final String companyName="Biba";
	public ShirtBrand brand;
	public String address;
	public Integer price =500;
	public long contacuNo;
	public void setShirt(ShirtBrand brand, String address, Integer price) {
		this.brand = brand;
		this.address = address;
		this.price = price;
	}
	
	public void display() {
		System.out.println(this.companyName);
		System.out.println(this.brand);
		System.out.println(this.address);
		System.out.println(this.price);
		System.out.println(this.contacuNo);

		
		
	}
	
	
	
	

}
