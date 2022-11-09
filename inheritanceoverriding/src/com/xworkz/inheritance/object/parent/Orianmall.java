package com.xworkz.inheritance.object.parent;

public class Orianmall {

	public String mallName;
	public int NoofVisitors;
	public Orianmall(String mallName, int noofVisitors) {
		super();
		this.mallName = mallName;
		this.NoofVisitors = noofVisitors;
	}
	
	public void display()
	{
		
		System.out.println(this.mallName);
		System.out.println(this.NoofVisitors);
	}
	
	
	
}
