package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.followers.BmrclManage;
import com.xworkz.interfaces.followers.BmrclRule;

public class BmrclRunner {

	public static void main(String[] args) {
		BmrclRule bmrclRule=new BmrclRule();
		BmrclManage bmrclManage=new BmrclManage(bmrclRule);
		bmrclManage.CheckRule();
		
	}

}
