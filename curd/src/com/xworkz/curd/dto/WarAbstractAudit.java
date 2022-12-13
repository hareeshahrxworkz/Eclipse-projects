package com.xworkz.curd.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class WarAbstractAudit implements Serializable {
	private String name;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String startedBy;
	private String startedWith;
	private String ownBy;
	private int noOfDeths;
	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", ownBy=" + ownBy + ", noOfDeths=" + noOfDeths + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	public String getStartedBy() {
		return startedBy;
	}
	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}
	public String getStartedWith() {
		return startedWith;
	}
	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}
	public String getOwnBy() {
		return ownBy;
	}
	public void setOwnBy(String ownBy) {
		this.ownBy = ownBy;
	}
	public int getNoOfDeths() {
		return noOfDeths;
	}
	public void setNoOfDeths(int noOfDeths) {
		this.noOfDeths = noOfDeths;
	}
	
	
	
	

}
