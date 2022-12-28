package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.pizza.dto.Color;
import com.xworkz.pizza.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		System.out.println("Sanitizer Main Rinning Sucessfully");
		SanitizerDTO dto=new SanitizerDTO(101, "Sterillium", 128D, Color.BLUE);
		SanitizerDTO dto1=new SanitizerDTO(102, "Savlon", 300D, Color.BROUN);
		SanitizerDTO dto2=new SanitizerDTO(103, "Dettol", 10D, Color.GOLD);
		SanitizerDTO dto3=new SanitizerDTO(104, "Lifebuoy", 100D, Color.BLUE);
		SanitizerDTO dto4=new SanitizerDTO(105, "Godrej ", 98D, Color.GREEN);
		SanitizerDTO dto5=new SanitizerDTO(106, "Dabur", 56D, Color.RED);
		SanitizerDTO dto6=new SanitizerDTO(107, "Multani ", 19D, Color.YELLOW);
		SanitizerDTO dto7=new SanitizerDTO(108, "Corvil ", 25D, Color.BLUE);
		SanitizerDTO dto8=new SanitizerDTO(109, "Trust", 93D, Color.GOLD);
		SanitizerDTO dto9=new SanitizerDTO(110, "DCM Shriram", 74D, Color.GREEN);

		Collection<SanitizerDTO> collection=new ArrayList<SanitizerDTO>();
		
		collection.add(dto1);
		collection.add(dto2);		
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto);
		
		Iterator<SanitizerDTO> iterator=collection.iterator();
		while (iterator.hasNext()) {
			SanitizerDTO element = iterator.next();
			
			if (element.equals(5D)) {
				System.out.println("Greter than 5    :"+element);
			}
			
			else if (element.equals(null)) {
				System.out.println("Sanitizer is null   :"+element);
				
			}
			else if (element.getColor().equals("GREEN")||element.getColor().equals("REd")||element.getColor().equals("Blue")) 
			{
			System.out.println("Element Colore is  "+element+" Removed " );	
			}
			else if (element!=null) {
				System.out.println("The Sanitizer brand is  :" +element.getBrand()+"Sanitizer Price is  :"+element.getPrice());
				
			}
			
			
			
			
	}
		
		
		
	}

}
