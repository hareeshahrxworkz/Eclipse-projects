package com.xworkz.abstracts.thing.boot;

import com.xworkz.abstracts.thing.Atm;
import com.xworkz.abstracts.thing.SbiAtm;

public class AtmRunner {
public static void main(String[] args) {
	Atm atm=new SbiAtm();
atm.balence();
atm.withDrawel();
}	

		

}
