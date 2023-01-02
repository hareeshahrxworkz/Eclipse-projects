package com.xworkz.encapsuletion.packages.thing;

public class PhotoUse {

	Photo photo;
	public void usephoto(Photo photo)
	{
		photo.setPhoto('U', true, 10, 200, "Red", "Squar", "circle", 2, "nion", false);
		
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
