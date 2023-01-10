package com.xworkz.springProject.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springProject.configuaration.SpringConfiguaration;
import com.xworkz.springProject.things.Hospital;
import com.xworkz.springProject.things.Temple;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		String[] name = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(name));

		String ref = applicationContext.getBean("getTempleName", String.class);
		System.out.println(ref.toString());

		String refOfGodName = applicationContext.getBean("getGodName", String.class);
		System.out.println(refOfGodName.toString());

		String refGetFrindName = applicationContext.getBean("getFrindName", String.class);
		System.out.println(refGetFrindName.toString());

		String refGetThing = applicationContext.getBean("getThing", String.class);
		System.out.println(refGetThing.toString());

		String refGetPlace = applicationContext.getBean("getPlace", String.class);
		System.out.println(refGetPlace.toString());

		boolean refisDrinkHalkoHal = applicationContext.getBean("isDrinkHalkoHal", boolean.class);
		System.out.println(refisDrinkHalkoHal);

		boolean refisMale = applicationContext.getBean("getTempleName", boolean.class);
		System.out.println(refisMale);

		boolean refisFestival = applicationContext.getBean("isFestival", boolean.class);
		System.out.println(refisFestival);

		boolean refisCommit = applicationContext.getBean("isCommit", boolean.class);
		System.out.println(refisCommit);

		boolean refisXworkz = applicationContext.getBean("isXworkz", boolean.class);
		System.out.println(refisXworkz);

		Double refgetprice = applicationContext.getBean("getprice", Double.class);
		System.out.println(refgetprice.toString());

		Double refgetSize = applicationContext.getBean("getSize", Double.class);
		System.out.println(ref.toString());

		Double getlength = applicationContext.getBean("getlength", Double.class);
		System.out.println(getlength);

		Double refgetWidth = applicationContext.getBean("getWidth", Double.class);
		System.out.println(refgetWidth.toString());

		Double refgethight = applicationContext.getBean("gethight", Double.class);
		System.out.println(refgethight.toString());



	}

}
