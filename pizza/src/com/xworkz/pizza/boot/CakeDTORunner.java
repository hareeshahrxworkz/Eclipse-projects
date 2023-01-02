package com.xworkz.pizza.boot;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.pizza.dto.CakeDTO;

public class CakeDTORunner {
	
public static void main(String[] args) {
	
	CakeDTO cakeDTO=new CakeDTO("Venilla", "Circle", 200D);
	CakeDTO cakeDTO1=new CakeDTO("Choclate", "Square", 200D);
	CakeDTO cakeDTO2=new CakeDTO("Ice", "Hart", 200D);
	CakeDTO cakeDTO3=new CakeDTO("Badam", "Rechangle", 200D);
	
List<CakeDTO> cakeDTOs=new LinkedList();
	cakeDTOs.add(cakeDTO);
	cakeDTOs.add(cakeDTO2);
	cakeDTOs.add(cakeDTO3);
	cakeDTOs.add(cakeDTO1);
	
	ListIterator<CakeDTO> iterator=cakeDTOs.listIterator();
	while (iterator.hasPrevious()) {
		CakeDTO cakeDTO4 = iterator.previous();
		System.out.println(cakeDTO4);
		
	}
	
	


	
}
}


