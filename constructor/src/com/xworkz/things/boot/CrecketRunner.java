package com.xworkz.things.boot;

import com.xworkz.things.Crecket;

public class CrecketRunner {

	public static void main(String[] args) {
		 String playersName [] = {"RohitSharma","KL Rahul","surya kumar yadav","virat kohili","Sreyas Hayyar"};
		 String alroungPylayar []= {"Hardik pandya","aksharPatel","Kapil Dev","jadeja"};
		 String bolers[]= {"Bhuvanesh kumar","mahamd shami","Shardul takur","Chahal"};
		String weketkeepers[]= {"MS doni","Dinesh karthik","Rishabpanth"};
		 Integer salary[]= {1000000,230000,450000,40000,500000};
		 
		 Crecket crecket=new Crecket("Banglore", playersName, "Chinnaswami Stadioum", alroungPylayar, 3000, "Green", bolers, 1500, weketkeepers, true, salary);
		 crecket.display();
		 
	}

}
