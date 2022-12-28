package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.pizza.dto.PlacesDTO;

public class PlacesRunner {
	public static void main(String[] args) {
		System.out.println("Places Runner Still Running");
		PlacesDTO dto=new PlacesDTO("Mysore", "Chamundeshwari", 1000);
		PlacesDTO dto1=new PlacesDTO("Chitradurga", "Fort", 2000);
		PlacesDTO dto2=new PlacesDTO("Hampi", "HampiTemple", 1230);
		PlacesDTO dto3=new PlacesDTO("Belur", "Belur Temple", 2500);
		PlacesDTO dto4=new PlacesDTO("Dharmastala", "Manjuntha Temple", 1000);
		
		Collection<PlacesDTO> placesDTOs=new ArrayList<PlacesDTO>();
		placesDTOs.add(dto);
		placesDTOs.add(dto1);
		placesDTOs.add(dto2);
		placesDTOs.add(dto3);
		placesDTOs.add(dto4);
		boolean cheak=dto.equals(dto4);
		System.out.println(cheak);
		
	}

}
