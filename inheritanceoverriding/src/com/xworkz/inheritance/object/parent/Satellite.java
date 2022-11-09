package com.xworkz.inheritance.object.parent;

public class Satellite {
	public String sattleliteArea;
	public String branch;

	public Satellite(String sattleliteArea, String branch) {
		super();
		this.sattleliteArea = sattleliteArea;
		this.branch = branch;
	}

	public void display() {
		System.out.println(this.sattleliteArea);
		System.out.println(this.branch);

	}

}
