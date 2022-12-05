package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.followers.Person;
import com.xworkz.interfaces.followers.Vijayalakshmi;

public class KarnatakaRTORunner {

	public static void main(String[] args) {

		System.out.println("Main naditha ede ");
		
		
		Vijayalakshmi vijayalakshmi = new Vijayalakshmi("Om", 10, 9900778524L, "Banglore", "Karnataka");
		System.out.println(vijayalakshmi.getName());
		System.out.println(vijayalakshmi.getAge());
		System.out.println(vijayalakshmi.getContactNo());
		System.out.println(vijayalakshmi.getState());
		System.out.println(vijayalakshmi.getAddress());
		vijayalakshmi.completeProgran();
		vijayalakshmi.eat();
		vijayalakshmi.ExecuteProgram();
		vijayalakshmi.gst();
		vijayalakshmi.vat();
		vijayalakshmi.paidTax();
		vijayalakshmi.sleep();
		vijayalakshmi.Training();
		vijayalakshmi.uploadTask();
		

	}

}
