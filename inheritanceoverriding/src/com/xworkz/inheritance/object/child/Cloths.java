package com.xworkz.inheritance.object.child;

import com.xworkz.inheritance.object.parent.Orianmall;

public class Cloths extends Orianmall {
	
	public String brand;

	
	public Cloths(String mallName, int noofVisitors) {
		super(mallName, noofVisitors);
	}


	public Cloths(String mallName, int noofVisitors, String brand) {
		this(mallName, noofVisitors);
		this.brand = brand;
	}

	public void display()
	{
		super.display();
		System.out.println(this.brand);
	}
	

	
	
	
	

}
