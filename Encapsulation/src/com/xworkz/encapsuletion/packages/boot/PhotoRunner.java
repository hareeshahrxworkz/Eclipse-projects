package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.*;

public class PhotoRunner {

	public static void main(String[] args) {
		
		Photo photo =new Photo();
		PhotoUse use=new PhotoUse();
		use.usephoto(photo);
		
		System.out.println(photo.getBrand());
		System.out.println(photo.getColour());
		System.out.println(photo.getShape());
		System.out.println(photo.getBrand());
		System.out.println(photo.getMountingType());
		System.out.println(photo.getPrice());
		System.out.println(photo.getSize());
		System.out.println(photo.getQuantity());
		System.out.println(photo.isDamage());
		System.out.println(photo.isQuality());
	}
	
}
