package com.xworkz.inheritance.object.child;

import com.xworkz.inheritance.object.parent.Satellite;

public class Moon extends Satellite{
	public String area;

	public Moon(String sattleliteArea, String branch) {
		super(sattleliteArea, branch);
	}

	public Moon(String sattleliteArea, String branch, String area) {
		this(sattleliteArea, branch);
		this.area = area;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.area);
	}
	
	
	

}
