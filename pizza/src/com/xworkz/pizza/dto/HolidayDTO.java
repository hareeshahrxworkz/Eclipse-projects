package com.xworkz.pizza.dto;

public class HolidayDTO {

	private String Name;
	private String dayName;
	private String special;

	public HolidayDTO() {
	}

	public HolidayDTO(String name, String dayName, String special) {
		super();
		Name = name;
		this.dayName = dayName;
		this.special = special;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if (obj instanceof HolidayDTO) {
				System.out.println("Equals is Cheacking ");
				HolidayDTO holidayDTO=(HolidayDTO)obj;
				if(this.special.equals(holidayDTO.getSpecial()))
				{
					System.out.println("Cheacking Sucessfully ");
					return true;
				}

			
			}}
		
		return false;
	}

	@Override
	public String toString() {
		return "HolidayDTO [Name=" + Name + ", dayName=" + dayName + ", special=" + special + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

}
