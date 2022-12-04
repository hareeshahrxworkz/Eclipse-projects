package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.followers.Doctor;
import com.xworkz.interfaces.followers.Hospital;

public class HospitalRulesRunner {

	public static void main(String[] args) {

		System.out.println("Main Running Sucessfully");
		
		Doctor doctor=new Doctor();
		Hospital hospital=new Hospital(doctor);
		hospital.CheckRules();
		
	}

}
