package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.BekaryDTO;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.exeception.SizeExceedException;
import com.xworkz.pizza.repository.BekaryRepository;

public class BekaryServiceImpl implements BekarySerivice {
	private BekaryRepository repository;

	public BekaryServiceImpl(BekaryRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validAndStore(BekaryDTO dto) throws DataInvalidException {
		String name = dto.getName();
		String location = dto.getLocation();
		String owner = dto.getOwnerName();
		long contactNo = dto.getContactNo();

		boolean nameValid = false;
		boolean locationValid = false;
		boolean ownerValid = false;
		boolean contactNoValid = false;

		if (name != null && name.length() >= 3 && name.length() < 20) {
			System.out.println("Name is valid");
			nameValid = true;
		} else {
			System.err.println("Entered Name is not valid please wait exception it will comming ");
		}

		if (location != null && location.length() >= 3 && location.length() < 20) {
			System.out.println("location is valid");
			locationValid = true;

		} else {
			System.err.println("Entered location is not valid please wait exception it will comming ");
		}

		if (owner != null && owner.length() >= 3 && owner.length() < 20) {
			System.out.println("Owner Name is valid");
			ownerValid = true;

		} else {
			System.err.println("Entered Owner Name is not valid please wait exception it will comming ");
		}
		if (contactNo >6) {
			System.out.println("Contact No is Valid ");
			contactNoValid = true;
		} else {
			System.err.println("Entered Contact No is not valid please wait exception it will comming ");
		}
		if (nameValid && contactNoValid && ownerValid && locationValid) {
			System.out.println("validte sucessfull Data ");
			boolean save = repository.store(dto);
			System.out.println("Storing  sucessfull Data   :" +save);

			return save;

		}
		throw new DataInvalidException("You Enterd In Valid Data ");

	}

}
