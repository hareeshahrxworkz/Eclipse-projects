package com.xworkz.springInit.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("actor")
public class Actor {
	
	private String name;
	private String langauge;
	private int age;
	public Actor(@Value("RaviTeja") String name, @Value("Kannada") String langauge, @Value("25") int age) {
		super();
		this.name = name;
		this.langauge = langauge;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getLangauge() {
		return langauge;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
