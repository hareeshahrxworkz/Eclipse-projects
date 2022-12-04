package com.xworkz.interfaces.followers;

public class BankManage {
	RBIRule rbiRule;

	public BankManage(RBIRule rbiRule) {
		this.rbiRule = rbiRule;
	}
	
	public void chickingRule()
	{
		if(rbiRule!=null)
		{
			System.out.println("Rbi chicking in null");
			int account=rbiRule.bankAccounts();
			String name=rbiRule.banksNames();
			if (account>10&&name=="SBI") {
				System.out.println("Rule following in bank");
			}
		}
	}

}
