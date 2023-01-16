package com.xworkz.bunk.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bunk.Fuel;
import com.xworkz.bunk.bean.Browser;
import com.xworkz.bunk.bean.Deisel;
import com.xworkz.bunk.bean.Petrol;
import com.xworkz.bunk.bean.PetrolBunk;
import com.xworkz.bunk.bean.Provider;
import com.xworkz.bunk.configuration.BunkConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BunkConfiguration.class);

		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

//	PetrolBunk bunk=applicationContext.getBean(PetrolBunk.class);
//	bunk.purchase();

	
		
		Browser browser=applicationContext.getBean("fireBox",Browser.class);
		browser.browse();
		System.out.println("================================================///////////////////////////");
		Browser browser1=applicationContext.getBean("chrome",Browser.class);
		browser1.browse();

	}

}
