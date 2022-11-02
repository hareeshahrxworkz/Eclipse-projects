package com.xworkz.encapsuletion.packages.thing;

public class State {

	private String Name = "Andhra Pradsh";
	String captial;
	int noOfDist;
	String cmName;
	int famousTemples;
	int bestPlaces;
	int noOfDC;
	boolean hasFlag;
	int noOfForests;
	boolean goodState;
	String famousRiver;
	void setState(String name, String captial, int noOfDist, String cmName, int famousTemples, int bestPlaces, int noOfDC,
			boolean hasFlag, int noOfForests, boolean goodState, String famousRiver) {
		Name = name;
		this.captial = captial;
		this.noOfDist = noOfDist;
		this.cmName = cmName;
		this.famousTemples = famousTemples;
		this.bestPlaces = bestPlaces;
		this.noOfDC = noOfDC;
		this.hasFlag = hasFlag;
		this.noOfForests = noOfForests;
		this.goodState = goodState;
		this.famousRiver = famousRiver;
	}
	public String getCaptial() {
		return captial;
	}
	public int getNoOfDist() {
		return noOfDist;
	}
	public String getCmName() {
		return cmName;
	}
	public int getFamousTemples() {
		return famousTemples;
	}
	public int getBestPlaces() {
		return bestPlaces;
	}
	public int getNoOfDC() {
		return noOfDC;
	}
	public boolean isHasFlag() {
		return hasFlag;
	}
	public int getNoOfForests() {
		return noOfForests;
	}
	public boolean isGoodState() {
		return goodState;
	}
	public String getFamousRiver() {
		return famousRiver;
	}
	
	
	
	
	
	
}
