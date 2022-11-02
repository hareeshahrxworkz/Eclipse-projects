package com.xworkz.encapsuletion.packages.thing;

public class God {
	private String name = "Shiva";
	String gender;
	String weapon;
	String wifeName;
	String vechicalName;
	String power;
	String Famoustemple;
	String location;
	int avataras;
	boolean powerfull;
	boolean single;
 void	setGod(String gender, String weapon, String wifeName, String vechicalName, String power, String famoustemple,
			String location, int avataras, boolean powerfull, boolean single) {
		this.gender = gender;
		this.weapon = weapon;
		this.wifeName = wifeName;
		this.vechicalName = vechicalName;
		this.power = power;
		Famoustemple = famoustemple;
		this.location = location;
		this.avataras = avataras;
		this.powerfull = powerfull;
		this.single = single;
		
	}
public String getGender() {
	return gender;
}
public String getWeapon() {
	return weapon;
}
public String getWifeName() {
	return wifeName;
}
public String getVechicalName() {
	return vechicalName;
}
public String getPower() {
	return power;
}
public String getFamoustemple() {
	return Famoustemple;
}
public String getLocation() {
	return location;
}
public int getAvataras() {
	return avataras;
}
public boolean isPowerfull() {
	return powerfull;
}
public boolean isSingle() {
	return single;
}

}
	
	


