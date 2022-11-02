package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.*;

public class GodRunner {

	public static void main(String[] args) {
		God god=new God();
		GodUsage use=new GodUsage();
		use.godUsage(god);
		System.out.println(god.getGender());
		System.out.println(god.getWeapon());
		System.out.println(god.getWifeName());
		System.out.println(god.getVechicalName());
		System.out.println(god.getPower());
		System.out.println(god.getFamoustemple());
		System.out.println(god.getLocation());
		System.out.println(god.isPowerfull());
		System.out.println(god.isSingle());
	}

}
