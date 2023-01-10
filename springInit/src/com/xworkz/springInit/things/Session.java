package com.xworkz.springInit.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("session")
public class Session {
	private String name;
	private String duration;
	private String startingMonth;

	public Session() {
		System.out.println("Sesion Constructor Running");
	}

	@Value("Java")
	public void setName(String name) {
		this.name = name;
	}

	@Value("2 Hour")
	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Value("august")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

	public String getName() {
		return name;
	}

	public String getDuration() {
		return duration;
	}

	public String getStartingMonth() {

		Session session = new Session();
		session.setName("SQl");
		session.setDuration("3Hours");
		session.setStartingMonth("may");
		return startingMonth;
	}

}
