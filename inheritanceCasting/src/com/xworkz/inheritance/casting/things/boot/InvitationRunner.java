package com.xworkz.inheritance.casting.things.boot;

import com.xworkz.inheritance.casting.things.child.Birthday;
import com.xworkz.inheritance.casting.things.parent.Invitation;

public class InvitationRunner {

	public static void main(String[] args) {
		System.out.println("Main Naditha ede");
		Invitation inv = new Birthday("Birthday", "RED", 1000);
		System.out.println(inv.invitiontype);
		System.out.println(inv.color);
		System.out.println(inv.no_Of_Copies);

	}

}
