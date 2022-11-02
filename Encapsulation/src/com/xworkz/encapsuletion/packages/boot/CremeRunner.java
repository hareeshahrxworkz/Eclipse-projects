package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.Creme;
import com.xworkz.encapsuletion.packages.thing.CremeUse;

public class CremeRunner {
	public static void main(String[] args) {

		Creme creme = new Creme();
		CremeUse use = new CremeUse();
		use.useCreme(creme);
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
