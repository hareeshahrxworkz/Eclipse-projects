package com.xworkz.validation.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import com.xworkz.validation.dto.TeroriristDTO;

public class TeroristServiceImpl implements TerorstServices {

	@Override
	public boolean validatingDTO(TeroriristDTO dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<TeroriristDTO>> violations = factory.getValidator().validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("error is there");
			violations.forEach(e->System.out.println(e.getMessage()));
			return false;
		}

		return true;
	}

}
