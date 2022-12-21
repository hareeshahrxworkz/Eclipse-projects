package com.xworkz.things;

public class GyarageRunner {

	public static void main(String[] args) {
		 String[] accories={"spaner","oil","grease"};
		 int [] membersalarys= {10000,20000,15000,8000};
		 String [] oilName= {"sevo","gulf","shell","sevsal"};
		 Integer oilPrice []= {2500,1300,1800,2450};
	
		 Gyarage gyarage= new Gyarage("Mallikarjina Service Center", accories, 7022532279L, membersalarys, 15000, oilName, 659823, "Manjunath", oilPrice, true);
		 gyarage.display();
	}

}
