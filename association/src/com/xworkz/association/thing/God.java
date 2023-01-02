package com.xworkz.association.thing;


public class God {
	
	public String name;
	public String gender;
	public String mainPower;
	public Weapon weapon=new Weapon("trident", "extermination", 5);
	
	
	
	
	public God(String name, String gender, String mainPower) {
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}




	public void Showoff()
	{
		System.out.println("God printing naditha ede gothha ");
		System.out.println(this.gender);
		System.out.println(this.mainPower);

		this.weapon.showoff();
	}

}
