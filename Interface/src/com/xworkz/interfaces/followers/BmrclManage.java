package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.BMRCLMetro;

public class BmrclManage {

	BmrclRule bmrclRule;
	
	
	
	public BmrclManage(BmrclRule bmrclRule) {
		this.bmrclRule = bmrclRule;
	}



	public void CheckRule()
	{
		System.err.println("Rule cheaking Naditha ede ");
		if(bmrclRule!=null)
		{
			System.out.println("BMRCL Rule null cheack sucessfully");
			boolean driver=bmrclRule.driver();
			int staff=bmrclRule.noOfStaff();
			if(driver==false&& staff>10)
			{
				System.out.println("staff and people following rules");
			}
			else
			{
				System.err.println("staff and people following rules");
			}
			
		}		{
			
		}
	}
	
}
