package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import javax.print.attribute.standard.Finishings;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDto;
import com.xworkz.pizza.services.PizzaServiceimpl;
import com.xworkz.pizza.services.PizzaServices;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaDto dto=new PizzaDto(null, null, null, null, null, null, null, false, 0, null, null);
		dto.setName("Vigge Pizza");
		dto.setCompany("pizza Hut");
		dto.setChese(true);
		dto.setType("Veg");
		dto.setSize(PizzaSize.BIGER);
		dto.setFlavour("Vegiterion");
		dto.setPrice(270);
		dto.setCreatedBy("System");
		dto.setCreatedDate(LocalDateTime.now());
		dto.setUpdatedBy("Omkar");
		dto.setUpdatedDate(LocalDateTime.now());
		PizzaServices pizzaServices=new PizzaServiceimpl();
boolean finalOut=pizzaServices.pizzaServices(dto);
System.out.println(finalOut);

	}

}
