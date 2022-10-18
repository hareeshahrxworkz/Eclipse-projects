package com.xworkz.things.boot;

import com.xworkz.things.Malls;

public class MallsRunner {

	public static void main(String[] args) {
		 String [] IstFlore= {"Showcase","Entry","Chakup","direction"};
		 String [] IIFlore= {"cloths","books","whatch","bedstore","furniture"};
		 String [] IIIFlore= {"mobileShope","LaptopShope","Theator","giftcente","tv"};
		 String [] IVFlore= {"kfc","donzo","Zomato","iceCreame"};
		 String [] VFlore= {"Child Game","Massge","Cargame","hairdreser"};
		
		 Malls mall=new Malls("orayan", IstFlore, "Chandru", IIFlore, "Banglore", IIIFlore, 5, IVFlore, "Suma", VFlore);
		 mall.display();
		 
	}

}
