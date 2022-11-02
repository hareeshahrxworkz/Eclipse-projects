package com.xworkz.encapsuletion.packages.thing;

public class CremeUse {
	Creme creme;
	public void useCreme(Creme creme)
	{
		creme.setCreme("iceCreme", 10, 20,"Mahesh", "Eating", "white", 20, false, true, false, 2);
		System.out.println(creme.getBrand());
		System.out.println(creme.getColor());
		System.out.println(creme.getGrams());
		System.out.println(creme.getOwner());
		System.out.println(creme.getPrice());
		System.out.println(creme.getPurpose());
		System.out.println(creme.getQuality());
		System.out.println(creme.getQuantity());
		System.out.println(creme.isGelly());
		System.out.println(creme.isPimple());
		System.out.println(creme.isWhite());


		
	}
}
