package com.xworkz.interfaces.followers;

public class Hospital {
	
	Doctor doctor ;
	
	public Hospital(Doctor doctor) {
		this.doctor=doctor;
	}
	public void CheckRules()
	{
		if(doctor!=null)
		{
			System.out.println("Doctor null check sucessfully ");
			
				double entry=doctor.entryPrice();
				boolean follow=doctor.followingRules();
			
				
			if(entry>5 && follow==false)
			{
				System.out.println("Rules  check Sucessfully ");
			}
			else {
				System.err.println(" Hospital  Not Following Rules ");
			}
			
			
		}
	}

}
