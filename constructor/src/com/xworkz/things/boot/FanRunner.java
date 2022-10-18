package com.xworkz.things.boot;

import com.xworkz.things.Fan;

public class FanRunner {
	public static void main(String[] args) {
	
		
		 String fanBrand [] = {"Bajaj","Usha","Butterfly","Mandra","orient","Vgaurd"};
		 String [] fanColors= {"brown","Red","White","blue","block"};
	 String [] Manufacturer= {"Banglore","Mysore","hydarabad"};
	 String [] countryOrigin= {"made in INdia","Made in china","made in Japan"};
		
	 
	 Fan fan=new Fan("Bharat Electronics", fanBrand, 1200, fanColors, 5, Manufacturer, 8, countryOrigin, true);
	 
	 fan.display();
	 
	}
	

}
