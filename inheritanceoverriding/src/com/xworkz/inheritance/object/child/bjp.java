package com.xworkz.inheritance.object.child;

import com.xworkz.inheritance.object.parent.PoliticalParty;

public class bjp extends PoliticalParty {
	public String head;

	public bjp(String partyName, String state) {
		super(partyName, state);
	}

	public bjp(String partyName, String state, String head) {
		this(partyName, state);
		this.head = head;
	}

	public void display() {//over loading

		super.display();
		System.out.println(this.head);

	}

}
