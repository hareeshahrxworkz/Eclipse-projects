package com.xworkz.inheritance.casting.things.boot;

import com.xworkz.inheritance.casting.things.child.Officicels;
import com.xworkz.inheritance.casting.things.parent.BatchularParty;

public class BatchularPartyRunner {
	public static void main(String[] args) {
		
		System.out.println("BatchularPartyRunner main naditha ede");
		BatchularParty party=new Officicels("Singls", "Banglore", 50);
		System.out.println(party.partyType);
		System.out.println(party.location);
		System.out.println(party.no_Of_Officels);


		
	}
	


}
