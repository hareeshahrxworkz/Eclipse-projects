package com.xworkz.inheritance.thing.boot;

import com.xworkz.inheritance.thing.Child.*;
import com.xworkz.inheritance.thing.parent.Jail;

public class JailRunner {

	public static void main(String[] args) {

		Jail jail = new TalukJail();
		System.out.println("TalukJail printing");

		System.out.println(jail.Jailtypes);
		System.out.println(jail.name);
		TalukJail taluk=(TalukJail)jail;
		System.out.println("After Casting jailtaluk");
		System.out.println(taluk.TalukJail);
		System.out.println(taluk.place);

		Jail jail1 = new CentralJail();
		System.out.println("CentralJail printing");

		System.out.println(jail1.Jailtypes);
		System.out.println(jail1.name);
		CentralJail central=(CentralJail)jail1;
		System.out.println("After Casting CentralJail");
		System.out.println(central.centralJail);
		System.out.println(central.central);
		
		Jail jail2 = new DisticJail();
		System.out.println("DisticJail printing");
		System.out.println(jail2.Jailtypes);
		System.out.println(jail2.name);
		DisticJail distic=(DisticJail)jail2;
		System.out.println("After Casting DisticJail");
		System.out.println(distic.distic);
		System.out.println(distic.DisticJail);

	}

}
