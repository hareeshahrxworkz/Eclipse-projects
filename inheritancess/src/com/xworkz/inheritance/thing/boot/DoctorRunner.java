package com.xworkz.inheritance.thing.boot;

import com.xworkz.inheritance.thing.Child.*;
import com.xworkz.inheritance.thing.parent.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {

		Doctor dentist = new Dentist();

		System.out.println("Dentist naditha ede");
		System.out.println(dentist.name);
		System.out.println(dentist.specilist);
		System.out.println(dentist.gender);
		Dentist dentist1 = (Dentist) dentist;
		System.out.println("Aftre casting");
		System.out.println(dentist1.dentistName);
		System.out.println(dentist1.age);

		Doctor ent = new Ent();
		System.out.println("Enat Nadithaede");
		System.out.println(ent.name);
		System.out.println(ent.specilist);
		System.out.println(ent.gender);
		System.out.println("After Enat Nadithaede");
		Ent enta = (Ent) ent;
		System.out.println(enta.contactNo);
		System.out.println(enta.Ent);
		
		Doctor cardiologist=new Cardiologist();
		System.out.println("Dentist naditha ede");
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.specilist);
		System.out.println(cardiologist.gender);
		System.out.println("After casting naditha ede");
		Cardiologist cardiologist1=(Cardiologist)cardiologist;
		System.out.println(cardiologist1.week);
		System.out.println(cardiologist1.cardiologist);

		}

}
