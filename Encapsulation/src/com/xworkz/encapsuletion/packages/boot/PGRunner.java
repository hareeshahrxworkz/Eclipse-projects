package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.*;

public class PGRunner {

	public static void main(String[] args) {
		
		Pg pg= new Pg();
		PgUsage usage=new PgUsage();
		usage.pgUsage(pg);
		System.out.println(pg.getPgOwnerName());
		System.out.println(pg.getPGName());
		System.out.println(pg.getnOfPeople());
		System.out.println(pg.getFoodTimings());
		System.out.println(pg.getStartingYear());
		System.out.println(pg.getRent());
		System.out.println(pg.getLocation());
		System.out.println(pg.getState());
		System.out.println(pg.getCountry());
		System.out.println(pg.getFoodTimings());
	}
	
}
