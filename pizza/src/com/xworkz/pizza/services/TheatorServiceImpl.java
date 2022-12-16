package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.TheatorDto;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.TheatorRepository;

public class TheatorServiceImpl implements TheatorService {

	private TheatorRepository repository;

	public TheatorServiceImpl(TheatorRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndSaveData(TheatorDto dto) throws DataInvalidException {

		String name = dto.getName();
		String brand = dto.getBrand();
		int seats = dto.getSeats();
		int id = dto.getId();
		boolean nameValid = false;
		boolean brandValid = false;
		boolean idValid = false;
		boolean seatsValid = false;
		if (name != null && name.length() >= 3 && name.length() <= 25) {
			System.out.println("Name is valid  and Continue  process    :" + name);
			nameValid = true;
		} else {
			System.err.println("name is  in valid please Wait Exception is comming soon ");
		}
		if (brand != null && brand.length() >= 3 && brand.length() <= 25) {
			System.out.println("Brand is valid  and Continue  process    :" + name);
			brandValid = true;
		} else {
			System.err.println("Brand is  in valid please Wait Exception is comming soon ");
		}
		if (id >= 2) {
			System.out.println("Idis valid  and Continue  process    :" + name);
			idValid = true;
		} else {
			System.err.println("id is  in valid please Wait Exception is comming soon ");
		}

		if (seats > 3 && seats <= 700) {
			System.out.println("Seats is valid  and Continue  process    :" + name);
			seatsValid = true;
		} else {
			System.err.println("Seats is  in valid please Wait Exception is comming soon ");
		}

		if (seatsValid && nameValid && idValid && brandValid) {
			System.out.println("Your data is Validating Please Wait Saving in Progress  ");
			boolean save=repository.save(dto);
			System.out.println("Data is Saved Sucessfully  :"+ save);
			return save;

		}
		throw new DataInvalidException("You are Entered data is in valid Please Valid Data it is get  DataValid Exception ");

	}

}
