package com.xworkz.springInit.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springInit.configuration.SpringConfiguration;
import com.xworkz.springInit.things.Actor;
import com.xworkz.springInit.things.Rocket;
import com.xworkz.springInit.things.Session;

public class TotalRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		Rocket rocket = applicationContext.getBean("rocket", Rocket.class);
		System.out.println(rocket.toString());
		System.out.println(rocket.getCountry());
		System.out.println(rocket.getName());
		System.out.println(rocket.getBudget());

		System.out.println(System.lineSeparator());
		Rocket rocket1 = applicationContext.getBean("information", Rocket.class);
		System.out.println(rocket.toString());
		System.out.println(rocket1.getCountry());
		System.out.println(rocket1.getName());
		System.out.println(rocket1.getBudget());

		Actor actor1 = applicationContext.getBean("actor", Actor.class);
		System.out.println(actor1);
		System.out.println(actor1.getName());
		System.out.println(actor1.getLangauge());
		System.out.println(actor1.getAge());

		Actor actor = applicationContext.getBean("getActoInfo", Actor.class);
		System.out.println(actor);
		System.out.println(actor.getName());
		System.out.println(actor.getLangauge());
		System.out.println(actor.getAge());

		Session session = applicationContext.getBean("session", Session.class);
		System.out.println(session);
		System.out.println(session.getName());
		System.out.println(session.getDuration());
		System.out.println(session.getStartingMonth());

		Session session1 = applicationContext.getBean("getSessionInformation", Session.class);
		System.out.println(session1);
		System.out.println(session1.getName());
		System.out.println(session1.getDuration());
		System.out.println(session1.getStartingMonth());

	}

}
