package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.Vichal;
import com.xworkz.encapsuletion.packages.thing.VichalUsing;

public class VichalRunner {

	public static void main(String[] args) {
		Vichal vichal=new Vichal();
				VichalUsing vichalUsing=new VichalUsing();
				vichalUsing.vichalusage(vichal);
		System.out.println(vichal.getOwnerName());
		System.out.println(vichal.getNofVichals());
		System.out.println(vichal.getDelivery());
		System.out.println(vichal.getNofVisitors());
		System.out.println(vichal.getPrice());
		System.out.println(vichal.getContactNo());
		System.out.println(vichal.getState());
		System.out.println(vichal.getLocation());
		System.out.println(vichal.getCountry());
	}
}
