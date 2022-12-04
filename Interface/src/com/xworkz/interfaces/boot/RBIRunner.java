package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.followers.BankManage;
import com.xworkz.interfaces.followers.RBIRule;

public class RBIRunner {
	public static void main(String[] args) {
		RBIRule rbiRule=new RBIRule();
		BankManage bankManage=new BankManage(rbiRule);
		bankManage.chickingRule();
	}

}
