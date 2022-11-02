package com.xworkz.encapsuletion.packages.thing;

public class GodUsage {

	God god;
	public void godUsage(God god)
	{
		god.setGod("Male", "Stick", "Pavarvati", "Bandi", "hegh", "Shiva", "Banglore", 10, true, false);
		System.out.println(god.getGender());
		System.out.println(god.getWeapon());
		System.out.println(god.getWifeName());
		System.out.println(god.getVechicalName());
		System.out.println(god.getPower());
		System.out.println(god.getFamoustemple());
		System.out.println(god.getLocation());
		System.out.println(god.isPowerfull());
		System.out.println(god.isSingle());

		
		
	}
	
	
}
