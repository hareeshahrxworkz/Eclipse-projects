package com.xworkz.validation.boot;

import java.time.LocalDate;

import com.xworkz.validation.dto.TeroriristDTO;
import com.xworkz.validation.services.TeroristServiceImpl;
import com.xworkz.validation.services.TerorstServices;

public class Runner {
	public static void main(String[] args) {

		TeroriristDTO dto=new TeroriristDTO("Mohan", 10, "India", true, true, LocalDate.now());
		TerorstServices services=new TeroristServiceImpl();
		System.out.println(services.validatingDTO(dto));

		
		
	}

}
