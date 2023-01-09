package com.xworkz.spring.boot;

import java.awt.TrayIcon.MessageType;

import javax.lang.model.AnnotatedConstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.xworkz.spring.configure.SpringConfiguaration;
import com.xworkz.spring.things.Application;
import com.xworkz.spring.things.Area;
import com.xworkz.spring.things.Bus;
import com.xworkz.spring.things.Choclate;
import com.xworkz.spring.things.Circle;
import com.xworkz.spring.things.City;
import com.xworkz.spring.things.Cycle;
import com.xworkz.spring.things.Fish;
import com.xworkz.spring.things.Girl;
import com.xworkz.spring.things.God;
import com.xworkz.spring.things.Mall;
import com.xworkz.spring.things.Mask;
import com.xworkz.spring.things.Milk;
import com.xworkz.spring.things.Park;
import com.xworkz.spring.things.Patient;
import com.xworkz.spring.things.Road;
import com.xworkz.spring.things.Temple;

public class BhasyamCircleRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
We
		Circle ref = applicationContext.getBean(Circle.class);
		System.out.println(ref.toString());
		System.out.println(System.lineSeparator());
		Road ref1 = applicationContext.getBean(Road.class);
		System.out.println(ref1);

		System.out.println(System.lineSeparator());
		Choclate ref2 = applicationContext.getBean(Choclate.class);
		System.out.println(ref2);

		System.out.println(System.lineSeparator());
		Bus ref3 = applicationContext.getBean(Bus.class);
		System.out.println(ref3);

		System.out.println(System.lineSeparator());
		Cycle ref4 = applicationContext.getBean(Cycle.class);
		System.out.println(ref4);

		System.out.println(System.lineSeparator());
		Girl ref5 = applicationContext.getBean(Girl.class);
		System.out.println(ref5);

		System.out.println(System.lineSeparator());
		Milk ref6 = applicationContext.getBean(Milk.class);
		System.out.println(ref6);

		System.out.println(System.lineSeparator());
		Mask ref7 = applicationContext.getBean(Mask.class);
		System.out.println(ref7);

		System.out.println(System.lineSeparator());
		Patient ref8 = applicationContext.getBean(Patient.class);
		System.out.println(ref8);

		System.out.println(System.lineSeparator());
		Area ref9 = applicationContext.getBean(Area.class);
		System.out.println(ref9);

		System.out.println(System.lineSeparator());
		City ref10 = applicationContext.getBean(City.class);
		System.out.println(ref10);

		System.out.println(System.lineSeparator());
		Fish ref11 = applicationContext.getBean(Fish.class);
		System.out.println(ref11);

		System.out.println(System.lineSeparator());
		Temple ref12 = applicationContext.getBean(Temple.class);
		System.out.println(ref12);

		System.out.println(System.lineSeparator());
		God ref13 = applicationContext.getBean(God.class);
		System.out.println(ref13);

		System.out.println(System.lineSeparator());
		Park ref14 = applicationContext.getBean(Park.class);
		System.out.println(ref14);

		System.out.println(System.lineSeparator());
		Mall ref15 = applicationContext.getBean(Mall.class);
		System.out.println(ref14);
		System.out.println(System.lineSeparator());
		Application ref16 = applicationContext.getBean(Application.class);
		System.out.println(ref16);

	}

}
