package com.xworkz.exeception.boot;

import com.xworkz.exeception.handling.Email;
import com.xworkz.exeception.handling.Emails;

public class EmailRunner {
	public static void main(String[] args) throws ArrayException {
		
		Emails emails=new Emails();
		emails.Email("Name");
		emails.Email("CHnadu");
		emails.Email("Manu");
		emails.Email("Name");
		emails.Email("hARSHI");
		emails.Email("Govinda");
		emails.Email("Akshay");
		emails.Email("Dharna");
		emails.Email("Darani");
		emails.Email("Drusti");
//		emails.Email("Drusti");

		emails.display();
		throw new ArrayException();
		
	}

	
	
}
