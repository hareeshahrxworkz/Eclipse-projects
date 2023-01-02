package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

import com.xworkz.pizza.dto.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {
		System.out.println("Holiday Runner Running Sucessfully");
		HolidayDTO dto=new HolidayDTO("Sankarnti", "Sunday", "Olige");
		HolidayDTO dto1=new HolidayDTO("Ayudha pooja", "Monday", "Chikan");
		HolidayDTO dto2=new HolidayDTO("deepavali", "Saturday", "Olige");
		HolidayDTO dto3=new HolidayDTO("Dasarsa", "Wednesday", "Mattan");
		HolidayDTO dto4=new HolidayDTO("Shivaratri", "thursday", "Olige");
		
		Collection<HolidayDTO>   collection=new TreeSet();

		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);

		boolean cheacking = collection.contains(dto2);
		System.out.println(cheacking);

	}

}
