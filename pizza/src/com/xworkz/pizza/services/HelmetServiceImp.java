package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.Color;
import com.xworkz.pizza.dto.HelmateType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmateRepository;

public class HelmetServiceImp implements HelmetService {
	private HelmateRepository helmetImp;

	public HelmetServiceImp(HelmateRepository helmetImp) {
		super();
		this.helmetImp = helmetImp;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {

		String name=dto.getName();
		Double price=dto.getPrice();
		HelmateType type=dto.getType();
		Color color=dto.getColor();
		boolean nameValid=false;
		boolean priceValid=false;
		boolean typeValid=false;
		boolean colorValid=false;
	if(name!=null && name.length()>=3&&name.length()<=20)
	{
		System.out.println("Name is Valid    :"+name);
		nameValid=true;
	}
	else {
		System.err.println("Name is  INValid    :"+name);
	}
	if(price!=null && price>=200&&price<=20000)
	{
		System.out.println("price is Valid    :"+price);
		priceValid=true;
	}
	else {
		System.err.println("price is  INValid    :"+price);
	}
	if(type!=null )
	{
		System.out.println("type is Valid    :"+type);
		typeValid=true;
	}
	else {
		System.err.println("type is  INValid    :"+type);
	}
	
	if(color!=null )
	{
		System.out.println("color is Valid    :"+color);
		colorValid=true;
	}
	else {
		System.err.println("color is  INValid    :"+color);
	}
	
	if(nameValid&&priceValid&&typeValid&&colorValid)
	{
		System.out.println("Is validate is done next Saving data   :");
		boolean save=helmetImp.createSaveData(dto);
		System.out.println("Helmet Detiles is Saved     :"+save);
		return save;
	}
		else {
			System.out.println("Is Not vali data  Not Saving data   :");

		}
		return false;
	}

}
