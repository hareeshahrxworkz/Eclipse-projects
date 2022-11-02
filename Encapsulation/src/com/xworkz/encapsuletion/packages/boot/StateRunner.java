package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.State;
import com.xworkz.encapsuletion.packages.thing.StateUse;

public class StateRunner {

	public static void main(String[] args) {
		State state=new State();
		StateUse user=new StateUse();
		user.stateUse(state);
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
