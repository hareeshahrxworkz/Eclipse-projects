package com.xworkz.soldgier.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldgier.configuration.SpringConfiguration;
import com.xworkz.soldgier.dto.FirstAidDTO;
import com.xworkz.soldgier.dto.MissalDTO;
import com.xworkz.soldgier.dto.ResortDTO;
import com.xworkz.soldgier.repositories.FirstAidrRepository;
import com.xworkz.soldgier.services.FirstAidServices;
import com.xworkz.soldgier.services.MissalServices;
import com.xworkz.soldgier.services.ResortServices;

public class FirstAidRunner {
	public FirstAidRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidServices services = applicationContext.getBean(FirstAidServices.class);
		boolean result = services.validateAndSave(new FirstAidDTO());
		System.out.println(result);
		System.out.println(System.lineSeparator());
		System.out.println("Mizzal Runner running --------------------------------------------");
		MissalServices missalServices = applicationContext.getBean(MissalServices.class);
		boolean save = missalServices.validateAndSave(new MissalDTO());
		System.out.println(save);
		System.out.println(System.lineSeparator());
		System.out.println("Resort Runner running --------------------------------------------");

		ResortServices resortServices = applicationContext.getBean(ResortServices.class);
		boolean done = resortServices.saveAndValidate(new ResortDTO());
		System.out.println(done);
		
		
		int count=1;
		while(count<=15)
		{
			System.out.println(count %2==1 ?"####":"*****************");
			
			count++;
		}
		
		
		int x=0;
		System.out.println(x=x+1);
		
		ArrayList arrayList=new ArrayList();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add(1,"d");
System.out.println(arrayList);	}

}
