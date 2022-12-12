package com.xworkz.exeception.handling;

public class Emails implements Email {

	public String[] Emails=new String[10];
	
	public int position=0;

	@Override
	public boolean Email(String email) {
		Emails[position]=email;
		position++;
		
		
return false;
	}
	public void display()
	{	
		for (int i=0;i<Emails.length;i++)
		{
		System.out.println("Array elements are   :"+Emails[i]);
		}
		
		count(position);
}
	
	


}
