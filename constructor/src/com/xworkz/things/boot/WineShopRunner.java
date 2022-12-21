package com.xworkz.things.boot;

import com.xworkz.things.WineShop;

public class WineShopRunner {

	public static void main(String[] args) {
		String [] harddrink={"MagicMovent","IB","OldMunk","RAJA","OT"};
		 Integer [] price= {200,400,250,260,580};
		 String [] winetype= {"Hard Drink","SoftDring","CoolDrinks"};
		  String [] wineColor= {"White","brown","black","purple"};
		 String [] softDrink= {"kingfisher","bakadi","Tubarong"}; 
		 
		 
	
		 
//		 WineShop work=new WineShop(9900776425L,harddrink,price,"Shivajinagar","124565",winetype,"bottles image",wineColor,softDrink);
		 WineShop work=new WineShop(9900775088L, harddrink, price, "shivaju nagar", "01ka2845", winetype, "bottels logo", wineColor, softDrink);
		work.display();
	}
	
	

}
