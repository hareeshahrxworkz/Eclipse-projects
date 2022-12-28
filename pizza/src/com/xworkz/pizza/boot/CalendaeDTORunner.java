package com.xworkz.pizza.boot;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.pizza.dto.CalenderDTO;

public class CalendaeDTORunner {
	public static void main(String[] args) {
		System.out.println("Calender Runner Running");
		CalenderDTO calenderDTO = new CalenderDTO(2013, "Gouri", 365);
		CalenderDTO calenderDTO1 = new CalenderDTO(2015, "Ganesha", 365);
		CalenderDTO calenderDTO2 = new CalenderDTO(2016, "Hindhi", 366);
		CalenderDTO calenderDTO3 = new CalenderDTO(2014, "Roman", 365);
		CalenderDTO calenderDTO4 = new CalenderDTO(2018, "Mayan", 366);

		Collection<CalenderDTO> calenderDTOs = new ArrayList<CalenderDTO>();
		calenderDTOs.add(calenderDTO4);
		calenderDTOs.add(calenderDTO3);
		calenderDTOs.add(calenderDTO2);
		calenderDTOs.add(calenderDTO1);
		calenderDTOs.add(calenderDTO4);
		boolean cheak=calenderDTO.equals(calenderDTO1);
		System.out.println(cheak);

	}

}
