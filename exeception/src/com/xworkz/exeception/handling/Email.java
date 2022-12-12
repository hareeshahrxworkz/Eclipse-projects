package com.xworkz.exeception.handling;

public interface Email {
	
	public boolean Email(String email);
	
	default int count(int position)
	{
		return position;
	}

}
