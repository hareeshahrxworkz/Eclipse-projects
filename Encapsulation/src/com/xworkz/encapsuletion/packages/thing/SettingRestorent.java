package com.xworkz.encapsuletion.packages.thing;

public class SettingRestorent {
	
	
	Restorent restorent;
	 
	public void settingRestorent(Restorent restorent)
	{
		
		
		restorent.setRestorent("Gandi", "Bear", "Banglore", "Ka012022212", 400, "karnataka", "india", "available", false, true);
				System.out.println(restorent.getOwnerName());
				System.out.println(restorent.getItems());
				System.out.println(restorent.getAdress());
				System.out.println(restorent.getLicenceNo());
				System.out.println(restorent.getPrice());
				System.out.println(restorent.getState());
				System.out.println(restorent.getCountry());
				System.out.println(restorent.getServiceType());
				System.out.println(restorent.getOwnerName());
				System.out.println(restorent.isAvailable());
				System.out.println(restorent.isRestorentAvailable());

		
		
	}
	
	
	
	

}
