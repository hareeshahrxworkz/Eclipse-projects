package com.xworkz.things.boot;

import com.xworkz.things.*;
	public class AllRunner {
		
	public static void main(String[] args) {
		
		Fish fish=new Fish("Raghu", "BoneLess");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.height);
		System.out.println(fish.weight);
		Fish fish1=new Fish("Raghu", 200);
		System.out.println(fish1.name);
		System.out.println(fish1.type);
		System.out.println(fish1.price);
		System.out.println(fish1.height);
		System.out.println(fish1.weight);

		Fish fish2=new Fish(800, 5);
		System.out.println(fish2.name);
		System.out.println(fish2.type);
		System.out.println(fish2.price);
		System.out.println(fish2.height);
		System.out.println(fish2.weight);

		Fish fish3=new Fish(5,1.5,"Raghu");
		System.out.println(fish3.name);
		System.out.println(fish3.type);
		System.out.println(fish3.price);
		System.out.println(fish3.height);
		System.out.println(fish3.weight);

		Fish fish4=new Fish("Raghu",200, "BoneLess");
		System.out.println(fish4.name);
		System.out.println(fish4.type);
		System.out.println(fish4.price);
		System.out.println(fish4.height);
		System.out.println(fish4.weight);

		Fish fish5=new Fish(200 ,"Raghu", "BoneLess");
		System.out.println(fish5.name);
		System.out.println(fish5.type);
		System.out.println(fish5.price);
		System.out.println(fish5.height);
		System.out.println(fish5.weight);
		
		System.out.println(System.lineSeparator());


		Boat boat=new Boat("vishwas");
		
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		
		Boat boat1=new Boat("vishwas" ,"red");
		
		System.out.println(boat1.name);
		System.out.println(boat1.color);
		System.out.println(boat1.companyName);
		System.out.println(boat1.type);
		System.out.println(boat1.owner);
		
		Boat boat2=new Boat("shamsundar"," Farrier Marine","vishwas");
		
		System.out.println(boat2.name);
		System.out.println(boat2.color);
		System.out.println(boat2.companyName);
		System.out.println(boat2.type);
		System.out.println(boat2.owner);
		
		
		Boat boat3=new Boat("vishwas","L");
		
		System.out.println(boat3.name);
		System.out.println(boat3.color);
		System.out.println(boat3.companyName);
		System.out.println(boat3.type);
		System.out.println(boat3.owner);
		
		Boat boat4=new Boat("Gururaja","m","vishwas");
		
		System.out.println(boat4.name);
		System.out.println(boat4.color);
		System.out.println(boat4.companyName);
		System.out.println(boat4.type);
		System.out.println(boat4.owner);
		
		
		Boat boat5=new Boat("s","vishwas");
		
		System.out.println(boat5.name);
		System.out.println(boat5.color);
		System.out.println(boat5.companyName);
		System.out.println(boat5.type);
		System.out.println(boat5.owner);
		
		
		Boat boat6=new Boat("Gururaja",'M',"vishwas","Blue");
		
		System.out.println(boat6.name);
		System.out.println(boat6.color);
		System.out.println(boat6.companyName);
		System.out.println(boat6.type);
		System.out.println(boat6.owner);
		
			Boat boat7=new Boat("Manjunath","vishwas","L");
		
		System.out.println(boat7.name);
		System.out.println(boat7.color);
		System.out.println(boat7.companyName);
		System.out.println(boat7.type);
		System.out.println(boat7.owner);
		
		System.out.println(System.lineSeparator());
		
		Bread bread=new Bread("M");
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		Bread bread1=new Bread("M",200);
		System.out.println(bread1.type);
		System.out.println(bread1.shape);
		System.out.println(bread1.price);
		System.out.println(bread1.quantity);
		System.out.println(bread1.companyName);

		Bread bread2=new Bread('M',100.2,"Square");
		System.out.println(bread2.type);
		System.out.println(bread2.shape);
		System.out.println(bread2.price);
		System.out.println(bread2.quantity);
		System.out.println(bread2.companyName);

		Bread bread3=new Bread("tringle");
		System.out.println(bread3.type);
		System.out.println(bread3.shape);
		System.out.println(bread3.price);
		System.out.println(bread3.quantity);
		System.out.println(bread3.companyName);


		Bread bread4=new Bread("800");
		System.out.println(bread4.type);
		System.out.println(bread4.shape);
		System.out.println(bread4.price);
		System.out.println(bread4.quantity);
		System.out.println(bread4.companyName);
		
		Bread bread5=new Bread(5);
		System.out.println(bread5.type);
		System.out.println(bread5.shape);
		System.out.println(bread5.price);
		System.out.println(bread5.quantity);
		System.out.println(bread5.companyName);
		
		Bread bread6=new Bread("M");
		System.out.println(bread6.type);
		System.out.println(bread6.shape);
		System.out.println(bread6.price);
		System.out.println(bread6.quantity);
		System.out.println(bread6.companyName);
		
		Bread bread7=new Bread("Bread Manufaturer",2);
		System.out.println(bread7.type);
		System.out.println(bread7.shape);
		System.out.println(bread7.price);
		System.out.println(bread7.quantity);
		System.out.println(bread7.companyName);
		
		
		System.out.println(System.lineSeparator());
		
		Passport passport=new Passport(1);
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expDate);
		System.out.println(passport.country);
		System.out.println(passport.issueDate);

		Passport passport1=new Passport(1,"hareesha");
		System.out.println(passport1.no);
		System.out.println(passport1.name);
		System.out.println(passport1.expDate);
		System.out.println(passport1.country);
		System.out.println(passport1.issueDate);
		
		Passport passport2=new Passport(1,"manohar","21-05-2022");
		System.out.println(passport2.no);
		System.out.println(passport2.name);
		System.out.println(passport2.expDate);
		System.out.println(passport2.country);
		System.out.println(passport2.issueDate);
		
		Passport passport3=new Passport("gurukumar","26-26-2021");
		System.out.println(passport3.no);
		System.out.println(passport3.name);
		System.out.println(passport3.expDate);
		System.out.println(passport3.country);
		System.out.println(passport3.issueDate);
		
		
		Passport passport4=new Passport(1,"21-06-2020","Manjunath","india");
		System.out.println(passport4.no);
		System.out.println(passport4.name);
		System.out.println(passport4.expDate);
		System.out.println(passport4.country);
		System.out.println(passport4.issueDate);
		
		Passport passport5=new Passport("12-5-2018","Bhavya","ashia");
		System.out.println(passport5.no);
		System.out.println(passport5.name);
		System.out.println(passport5.expDate);
		System.out.println(passport5.country);
		System.out.println(passport5.issueDate);
		
		Passport passport6=new Passport(1,"raju","12-08-2025","china","15-2026");
		System.out.println(passport6.no);
		System.out.println(passport6.name);
		System.out.println(passport6.expDate);
		System.out.println(passport6.country);
		System.out.println(passport6.issueDate);
		
		
		
		
		
		
		
	}
	}
	
	


	
	

	

	

	
	

