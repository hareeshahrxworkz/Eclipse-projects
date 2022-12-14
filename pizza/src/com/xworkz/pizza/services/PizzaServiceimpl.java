package com.xworkz.pizza.services;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDto;

public class PizzaServiceimpl implements PizzaServices {

	@Override
	public boolean pizzaServices(PizzaDto dto) {
		String name = dto.getName();
		String company = dto.getCompany();
		PizzaSize size = dto.getSize();
		boolean chese = dto.isChese();
		double price = dto.getPrice();
		String flavour = dto.getFlavour();
		String type = dto.getType();
		boolean nameValidate = false;
		boolean CompanyValidate = false;
		boolean sizeValid = false;
		boolean cheseValidate = false;
		boolean priceValidate = false;
		boolean flavaurValidate = false;
		boolean typeValidate = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Pizza name Valid Formte" + name);
			nameValidate= true;

		} else {
			System.err.println("Pizza name IN Valid Formte" + name);

		}

		if (company != null && company.length() >= 3 && company.length() <= 50) {
			System.out.println("Pizza Company is valid dto    :" + company);
			 CompanyValidate = true;

		} else {
			System.err.println("Pizza Company is IN valid dto    :" + company);

		}

		if (size != null && size.equals(size)) {
			System.out.println("Pizza Size is valid dto    :" + size);
			sizeValid = true;
		} else {
			System.err.println("Pizza Size  is In valid dto    :" + size);

		}
		if (chese != false) {
			System.out.println("Pizza Chese is valid dto    :" + chese);
			 cheseValidate = true;

		} else {
			System.err.println("Pizza Cheese is  IN valid dto    :" + chese);

		}

		if (price >= 250 && price <= 12000) {
			System.out.println("Pizza Price is valid dto    :" + price);
			 priceValidate = true;

		} else {
			System.err.println("Pizza Price  is IN valid dto    :" + price);

		}

		if (flavour != null && flavour.length() >= 5 && flavour.length() <= 20) {
			System.out.println("Pizza flavour is Valid dto  :" + flavour);
			 flavaurValidate = true;

		} else {
			System.err.println("Pizza Flavour is IN  valid dto    :" + flavour);

		}
		if (type != null && type.length() >= 3 && type.length() <= 50) {

			System.out.println("Pizza type is valid dto    :" + type);
			 typeValidate = true;

		} else {
			System.err.println("Pizza Type is IN valid dto    :" + type);

		}
		if (nameValidate && CompanyValidate && cheseValidate && priceValidate &&sizeValid && flavaurValidate && typeValidate==true)

		{
			System.out.println("Entered Dto is Valid Detiles");
			return true;
		}
		System.err.println("Entered Dto  NOT is Valid Detiles");

		return false;

	}

}
