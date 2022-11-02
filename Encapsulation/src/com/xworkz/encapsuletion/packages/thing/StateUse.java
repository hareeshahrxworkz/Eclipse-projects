package com.xworkz.encapsuletion.packages.thing;

public class StateUse {

	State state;
	public void stateUse(State state)
	{
		state.setState("Karnataka","Banglore", 25, "basavaraju", 2, 5, 1, false, 2, true,"ganga");
		
		System.out.println(state.getBestPlaces());
		System.out.println(state.getCaptial());
		System.out.println(state.getCmName());
		System.out.println(state.getFamousRiver());
		System.out.println(state.getFamousTemples());
		System.out.println(state.getNoOfDC());
		System.out.println(state.getNoOfDist());
		System.out.println(state.getNoOfForests());
		System.out.println(state.getNoOfForests());
		System.out.println(state.isGoodState());
		System.out.println(state.isHasFlag());


	}
	
}
