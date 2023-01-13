package com.xworkz.movieDirection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Skill {

	public Skill() {
		System.out.println("Running Skill Constructor");

	}

	public void skill() {
		System.out.println("Skill =====================================================");
	}

}
