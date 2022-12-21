package com.xworkz.association.thing;

public class Weapon {
	

	
	public String name;
	public String use;
	public Integer weight;
	
	public Weapon(String name, String use, Integer weight) {
		this.name = name;
		this.use = use;
		this.weight = weight;
	}



	public void showoff()
	{
		System.out.println("Weopn printing nadithaede sir");
		
		System.out.println(this.name);
		System.out.println(this.use);
		System.out.println(this.weight);

		
		
		
	}

}
