package com.xworkz.autowiredconstructor.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scripting.groovy.GroovyObjectCustomizer;

import com.xworkz.autowiredconstructor.beans.Engine;
import com.xworkz.autowiredconstructor.beans.Gost;
import com.xworkz.autowiredconstructor.beans.NewsPaper;
import com.xworkz.autowiredconstructor.beans.Snake;
import com.xworkz.autowiredconstructor.confiuration.AutoWiredConfiguration;

public class AutowiredRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoWiredConfiguration.class);
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		NewsPaper newsPaper = applicationContext.getBean(NewsPaper.class);
		System.out.println(newsPaper.toString());

		Engine engine = applicationContext.getBean(Engine.class);
		System.out.println(engine.toString());
		
		Snake snake=applicationContext.getBean(Snake.class);
		System.out.println(snake.toString());
		
		
		Gost gost=applicationContext.getBean(Gost.class);
		System.out.println(gost.toString());
		

	}

}
