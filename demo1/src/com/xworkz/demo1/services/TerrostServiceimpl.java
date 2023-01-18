package com.xworkz.demo1.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.demo1.dto.TerrorDTO;

public class TerrostServiceimpl implements TerrostService{

	@Override
	public boolean validators(TerrorDTO dto) {

		 ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		 Validator validator=factory.getValidator();
		  Set<ConstraintViolation<TerrorDTO>> violations= validator.validate(dto);
		  if (!violations.isEmpty()) {
			  System.out.println("error is there");
			  violations.forEach(e->System.out.println(e.getMessage()));
			
		}
		
		
		return false;
	}

}
