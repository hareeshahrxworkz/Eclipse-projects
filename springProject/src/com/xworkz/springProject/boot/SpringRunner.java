package com.xworkz.springProject.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springProject.configuaration.SpringConfiguaration;
import com.xworkz.springProject.things.Temple;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		String [] name= applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(name));
		

		 Temple ref=  applicationContext.getBean("getGodName", Temple.class);
		 System.out.println(ref.hashCode());
	}

}
