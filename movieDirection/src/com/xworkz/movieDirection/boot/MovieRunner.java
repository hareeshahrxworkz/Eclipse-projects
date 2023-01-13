package com.xworkz.movieDirection.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.movieDirection.bean.Assistant;
import com.xworkz.movieDirection.bean.Battery;
import com.xworkz.movieDirection.bean.Camara;
import com.xworkz.movieDirection.bean.CamaraMan;
import com.xworkz.movieDirection.bean.Company;
import com.xworkz.movieDirection.bean.Director;
import com.xworkz.movieDirection.bean.Exprience;
import com.xworkz.movieDirection.bean.Location;
import com.xworkz.movieDirection.bean.Movie;
import com.xworkz.movieDirection.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);

		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

		Movie movie = applicationContext.getBean(Movie.class);
		movie.Moviedisplay();
		Director director = applicationContext.getBean(Director.class);
		director.director();
		Exprience exprience = applicationContext.getBean(Exprience.class);
		exprience.Experience();

		CamaraMan camaraMan = applicationContext.getBean(CamaraMan.class);
		camaraMan.camaraMan();
		Camara camara = applicationContext.getBean(Camara.class);
		camara.LensComara();
		Assistant assistant = applicationContext.getBean(Assistant.class);
		assistant.companuy();
		Company company = applicationContext.getBean(Company.class);
		company.company();
		Location location = applicationContext.getBean(Location.class);
		location.location();

	}

}
