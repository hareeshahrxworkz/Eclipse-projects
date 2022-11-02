package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.Restorent;
import com.xworkz.encapsuletion.packages.thing.SettingRestorent;

public class RestorentRunner {

	public static void main(String[] args) {
		
		SettingRestorent set=new SettingRestorent();
		Restorent restorent=new Restorent();
		restorent.display();
		set.settingRestorent(restorent);
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
