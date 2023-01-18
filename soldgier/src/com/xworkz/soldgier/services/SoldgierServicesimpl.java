package com.xworkz.soldgier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Repository;

import com.xworkz.soldgier.dto.SoldierDTO;
import com.xworkz.soldgier.repositories.SoldgierRepository;

public class SoldgierServicesimpl implements SoldgierServices {
	SoldgierRepository repository;

	public SoldgierServicesimpl() {
		System.out.println("SoldgierServices constructor running");
	}

	public void setRepository(SoldgierRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {

		System.out.println("Validate and save is running");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<SoldierDTO>> violations = factory.getValidator().validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("error is validation");
			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;

		}

		else {
			System.out.println("Saving is running now");
			boolean save = repository.save(dto);
			return save;

		}

	}

}
