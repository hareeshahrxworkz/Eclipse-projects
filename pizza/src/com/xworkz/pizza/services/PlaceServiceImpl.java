package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.PlaceDTO;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService {

	PlaceRepository placeRepository;
	

	public PlaceServiceImpl(PlaceRepository placeRepository) {
		super();
		this.placeRepository = placeRepository;
	}


	@Override
	public boolean validateAndSave(PlaceDTO dto) throws DataInvalidException {

		String placeName = dto.getPlaceName();
		String famousTemple = dto.getFamousTemple();
		int distance = dto.getDistance();
		String placeType = dto.getPlaceType();
		String wether = dto.getWether();
		Boolean placeNameValid = false;
		Boolean famousTempleValid = false;
		Boolean distancValid = false;
		Boolean wetherValid = false;
		Boolean placeTypeValid = false;
		
		if (placeName!=null && placeName.length()>=3 &&placeName.length()<=25) {
			System.out.println("Place Name Valid");
			placeNameValid=true;

		}
		else {
			System.err.println("Place Name is Not Valid Please Wait Exception will be Come");
		}
		if (placeType!=null && placeType.length()>=3 &&placeType.length()<=25) {
			System.out.println("placeType  Valid");
			placeTypeValid=true;

		}
		else {
			System.err.println("placeType is Not Valid Please Wait Exception will be Come");
		}
		
		if (wether!=null && wether.length()>=3 &&wether.length()<=25) {
			System.out.println("wether  Valid");
			wetherValid=true;

		}
		else {
			System.err.println("wether is Not Valid Please Wait Exception will be Come");
		}
		if (famousTemple!=null && famousTemple.length()>=3 &&famousTemple.length()<=25) {
			System.out.println("famousTemple  Valid");
			famousTempleValid=true;
			
		}
		else {
			System.err.println("famousTemple is Not Valid Please Wait Exception will be Come");
		}
		
		if (distance>=20&& distance<=20000) {
			System.out.println("distance  Valid");
			distancValid=true;
			
		}
		else {
			System.err.println("distance is Not Valid Please Wait Exception will be Come");
		}
		if (placeNameValid&&placeTypeValid&&distancValid&&wetherValid&&famousTempleValid) {
			
			System.out.println("Validate Sucess Saving in prosess now");
			boolean save=placeRepository.save(dto);
			System.out.println("Saving Is Sucessfull   :"+save);
			return save;
		}
		
		throw new DataInvalidException("Your Data Is Invalid DataInvalidException .....");
		
	}
}
