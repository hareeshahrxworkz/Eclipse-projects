package com.xworkz.springProject.things;

import org.springframework.stereotype.Component;

@Component("nammaMetro")
public class NammaMetro {
	public NammaMetro() {
		System.out.println("Namma Metro component Running");
	}
	@Override
	public String toString() {
		return "Namma Metro";
	}

}
