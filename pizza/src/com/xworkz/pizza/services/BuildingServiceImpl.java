package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {
	private BuildingRepository buildingRepository;

	public BuildingServiceImpl(BuildingRepository buildingRepository) {
		super();
		this.buildingRepository = buildingRepository;
	}

	@Override
	public boolean validateAndsaving(BuildingDTO dto) throws DataInvalidException {

		String name = dto.getName();
		int flore = dto.getFlore();
		int no = dto.getNo();
		String type = dto.getType();
		boolean parking = dto.isParking();
		boolean lift = dto.isLift();

		boolean nameValid = false;
		boolean floreValid = false;
		boolean noValid = false;
		boolean typeValid = false;
		boolean liftValid = false;
		boolean parkingValid = false;

		if (name != null && name.length() >= 4 && name.length() <= 25) {
			System.out.println("Name Is a Valid ");
			nameValid = true;

		} else {
			System.err.println("Name Is Not Valid Plese Wait Exception will be come");
		}

		if (type != null && type.length() >= 4 && type.length() <= 25) {
			System.out.println("Type Is a Valid ");
			typeValid = true;

		} else {
			System.err.println("Type Is Not Valid Plese Wait Exception will be come");
		}

		if (no >= 2 ) {
			System.out.println("No Is a Valid ");
			noValid = true;

		} else {
			System.err.println("NO Is Not Valid Plese Wait Exception will be come");
		}
		if (flore >= 2 && flore <= 10) {
			System.out.println("flore Is a Valid ");
			floreValid = true;

		} else {
			System.err.println("flore  Is Not Valid Plese Wait Exception will be come");
		}
		if (lift != false) {
			System.out.println("lift Is a Valid ");
			liftValid = true;

		} else {
			System.err.println("lift Is Not Valid Plese Wait Exception will be come");
		}

		if (parking != false) {
			System.out.println("parking Is a Valid ");
			parkingValid = true;

		} else {
			System.err.println("Parking Is Not Valid Plese Wait Exception will be come");
		}
		if (parkingValid && nameValid && liftValid && noValid && floreValid && typeValid) {
			System.out.println("Valid Data Cheacking is Saving Progress");
			boolean save=buildingRepository.saveData(dto);
			System.out.println("Data Save Sucessfully   :"+save);
			return save;
			
					
		}
		throw new DataInvalidException("Data invalid Exception .................");

	}

}
