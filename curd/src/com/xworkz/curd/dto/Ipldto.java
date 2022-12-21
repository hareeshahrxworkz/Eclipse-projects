package com.xworkz.curd.dto;

public class Ipldto extends AbstractIpldto {

	private String teamName;
	private  String captionName;
	private  boolean onowerAlive;
	private Integer purse;
	private  int wins;
	private  int defeats;
	
	public Ipldto() {
		System.out.println("calling argumnets in a Ipldto");
	}

	@Override
	public String toString() {
		return "Ipldto [teamName=" + teamName + ", captionName=" + captionName + ", onowerAlive=" + onowerAlive
				+ ", purse=" + purse + ", wins=" + wins + ", defeats=" + defeats + "]";
	}

	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptionName() {
		return captionName;
	}

	public void setCaptionName(String captionName) {
		this.captionName = captionName;
	}

	public boolean isOnowerAlive() {
		return onowerAlive;
	}

	public void setOnowerAlive(boolean onowerAlive) {
		this.onowerAlive = onowerAlive;
	}

	public Integer getPurse() {
		return purse;
	}

	public void setPurse(Integer purse) {
		this.purse = purse;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	
	

}
