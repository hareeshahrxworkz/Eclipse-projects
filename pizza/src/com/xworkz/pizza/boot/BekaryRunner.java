package com.xworkz.pizza.boot;


import com.xworkz.pizza.dto.BekaryDTO;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.BekaryRepository;
import com.xworkz.pizza.repository.BekaryRepositoryImp;
import com.xworkz.pizza.services.BekarySerivice;
import com.xworkz.pizza.services.BekaryServiceImpl;

public class BekaryRunner {

	public static void main(String[] args) {

		System.out.println("Bekary Runner Main Running Sucessfully");

		BekaryDTO dto = new BekaryDTO("Yatisha Bekary", "Yatisha", "Sira", 8548924356L);
		BekaryDTO dto1 = new BekaryDTO("Snehajeevi bekary", "Ramesha", "Huliyar", 9900775088L);
		BekaryDTO dto2 = new BekaryDTO("Balaji", "Dinesha", "Tumkur", 8975643123L);
		BekaryDTO dto3 = new BekaryDTO("Ayyappa Bekary", "Satish", "Sira", 9980302514L);
		BekaryDTO dto4 = new BekaryDTO("Lakshmi Bekary", "Beera", "Rajajinagar", 889754875L);

		BekaryRepository bekaryRepository = new BekaryRepositoryImp();

		BekarySerivice bekarySerivice = new BekaryServiceImpl(bekaryRepository);
		
		

		try {
			boolean store1=bekarySerivice.validAndStore(dto);
			System.out.println(store1);
			boolean store2=bekarySerivice.validAndStore(dto1);
			System.out.println(store2);
			boolean store3=bekarySerivice.validAndStore(dto2);
			System.out.println(store3);
			boolean store4=bekarySerivice.validAndStore(dto3);
			System.out.println(store4);
			boolean store5=bekarySerivice.validAndStore(dto4);
			System.out.println(store5);



		} catch (DataInvalidException e) {
			System.err.println(e.getMessage());
		}

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
