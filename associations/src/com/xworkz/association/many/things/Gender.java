package com.xworkz.association.many.things;

public enum Gender {

	MALE ("Male"), FEMALE("Female"), TRANS("Transgender");
	
	
	
	public String name;
	private Gender(String name) {
		this.name=name;
	}
}
