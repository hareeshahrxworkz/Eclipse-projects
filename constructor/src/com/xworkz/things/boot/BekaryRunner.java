package com.xworkz.things.boot;

import com.xworkz.things.Bekary;

public class BekaryRunner {

	public static void main(String[] args) {

		String [] cool= {"Mango","Sprite","Cococola","Bindhu","FIZZ","MountandDu"};
		String [] iceCreame= {"coneIceCreame","Chokobar","Butterscratch","candy","CupIce"};
		 Integer [] cakePrice = {230,150,350,270,420,300};
		 String [] snacks= {"kara","Chekkali","kodbale","mysurepack"};
	String [] sweet= {"peda","Raskul","applecake","honicake"};
		 String [] biskete= {"pare-G","orio","happy happy","Goodday","Chaskamaska"};
		
		Bekary bekary =new Bekary("Banglore",9900775088L,"hart",iceCreame,cakePrice,"potato",cool,snacks,sweet,biskete);
		
		bekary.display();
	}

}
