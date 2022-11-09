package com.xworkz.inheritance.object.parent;

public class PoliticalParty {
	public String partyName;
	public String state;

	public PoliticalParty(String partyName, String state) {
		this.partyName = partyName;
		this.state = state;
	}

	public void display() {
		System.out.println(this.partyName);
		System.out.println(this.state);

	}

}
