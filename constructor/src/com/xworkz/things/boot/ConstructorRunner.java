package com.xworkz.things.boot;
import com.xworkz.things.*;

public class ConstructorRunner {

	public static void main(String[] args) {
		
		Bus ref1=new Bus();
		
		System.out.println(ref1.no);
		System.out.println(ref1.starting);
		System.out.println(ref1.destination);
		
		System.out.println("\n");
		
		ref1.no="KA 01 MP 0421";
		ref1.starting="Banglore";
		ref1.destination="Chitradurga";
		
		System.out.println(ref1.no);
		System.out.println(ref1.starting);
		System.out.println(ref1.destination);
		
		System.out.println("\n");
		//After updating Values Multiple copies
		System.out.println("After updating Values using same constructor");
		ref1.no="KA 05 BH 9638";
		ref1.starting="Davanagere";
		ref1.destination="Belagam";
		
		System.out.println(ref1.no);
		System.out.println(ref1.starting);
		System.out.println(ref1.destination);
		
		System.out.println("===================================================");
		
		DistrictCollector values=new DistrictCollector();
		System.out.println(values.name);
		System.out.println(values.age);
		System.out.println(values.district);
		System.out.println(values.batchNo);
		
		
		System.out.println("\n");
		values.name="V Shanker";
		values.age=28;
		values.district="Banglore Rural";
		values.batchNo=2018;
		System.out.println(values.name);
		System.out.println(values.age);
		System.out.println(values.district);
		System.out.println(values.batchNo);
		System.out.println("\n");
		
		values.name="B Ramu";
		values.age=46;
		values.district="Chamarajanagar";
		values.batchNo=2013;
		System.out.println(values.name);
		System.out.println(values.age);
		System.out.println(values.district);
		System.out.println(values.batchNo);
		
		System.out.println("===================================================");
		
		Chocolate values1=new Chocolate();
		System.out.println(values1.name);
		System.out.println(values1.brand);
		System.out.println(values1.price);
		System.out.println(values1.flaver);
		
		
		System.out.println("\n");
		values1.name="kachamango";
		values1.brand="Kachamango";
		values1.price=1;
		values1.flaver="Mango";
		System.out.println(values1.name);
		System.out.println(values1.brand);
		System.out.println(values1.price);
		System.out.println(values1.flaver);
		System.out.println("\n");
		
		values1.name="Copico";
		values1.brand="copy";
		values1.price=2;
		values1.flaver="cofee";
		System.out.println(values1.name);
		System.out.println(values1.brand);
		System.out.println(values1.price);
		System.out.println(values1.flaver);
		
System.out.println("===================================================");
		
		Song  values2 = new Song();
		System.out.println(values2.name);
		System.out.println(values2.langauge);
		System.out.println(values2.singer);
		System.out.println(values2.lyrics);
		System.out.println(values2.type);
		
		
		System.out.println("\n");
		values2.name="Singara Siriye";
		values2.langauge="Kannada";
		values2.singer="Vijay Prakash ";
		values2.lyrics="Subtitle";
		values2.type="Romentic";
		System.out.println(values2.name);
		System.out.println(values2.langauge);
		System.out.println(values2.singer);
		System.out.println(values2.lyrics);
		System.out.println(values2.type);
		System.out.println("\n");
		
		values2.name="Havadru Kachhabrada";
		values2.langauge="Kannada";
		values2.singer="Jaggesh";
		values2.lyrics="No Subtitle";
		values2.type="Entertinment";
		
		System.out.println(values2.name);
		System.out.println(values2.langauge);
		System.out.println(values2.singer);
		System.out.println(values2.lyrics);
		System.out.println(values2.type);
		
		System.out.println("===================================================");
		
		Developer ref2=new Developer();
		System.out.println(ref2.name);
		System.out.println(ref2.education);
		System.out.println(ref2.experience);
		System.out.println(ref2.salary);
		System.out.println(ref2.company);
		
		
		System.out.println("\n");
		ref2.name="Monohar";
		ref2.education="Bachular Engineering";
		ref2.experience="4+ Years";
		ref2.salary=7.5;
		ref2.company="Cognizant";
		
		
		System.out.println(ref2.name);
		System.out.println(ref2.education);
		System.out.println(ref2.experience);
		System.out.println(ref2.salary);
		System.out.println(ref2.company);
		System.out.println("\n");
		
		ref2.name="Gopinath ";
		ref2.education="MTech";
		ref2.experience="7+ years";
		ref2.salary=12.5;
		ref2.company="Wipro";
		System.out.println(ref2.name);
		System.out.println(ref2.education);
		System.out.println(ref2.experience);
		System.out.println(ref2.salary);
		System.out.println(ref2.company);
		
		
	}
	
	

}
