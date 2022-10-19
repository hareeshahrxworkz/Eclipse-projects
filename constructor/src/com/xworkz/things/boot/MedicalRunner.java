package com.xworkz.things.boot;

import com.xworkz.things.Medical;

public class MedicalRunner {

	public static void main(String[] args) {

		 String[] tabletname= {"dolo650","lipitor","simtom","zenro"};
		 String[] shopeLocations= {"Banglore","Mysore","Manglore","Kolor","Rajajinagar"};
		 String[] noOfWorkerName= {"Najaraj","Bindu","gouri"};
		 int[] prices= {100,200,35,10,8,90};
		 String[] hospitalContact= {"Monoj Hospital","GouriClinic","Nagaraj Clinic"};
		
		 
		 Medical medical=new Medical("Suparsha Medical", shopeLocations, "Omkar", noOfWorkerName, "Banglore", prices, false, hospitalContact, 16000, tabletname);
		 
		 medical.display();
	}
	
	

}
