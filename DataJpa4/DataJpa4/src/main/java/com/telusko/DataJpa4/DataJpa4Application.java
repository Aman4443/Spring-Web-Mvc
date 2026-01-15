package com.telusko.DataJpa4;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.DataJpa4.model.Vaccine;
import com.telusko.DataJpa4.service.IVaccineService;


@SpringBootApplication
public class DataJpa4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpa4Application.class, args);
		
		IVaccineService service = container.getBean(IVaccineService.class);
		
//		Vaccine vac = service.searchVaccineById(3);
//		System.out.println(vac);
//		System.out.println("***************************");
//		Vaccine v1=new Vaccine("Sputnik", "Russian", 35454.4);
//		service.searchVaccinesByVaccine(v1).forEach(v->System.out.println(v));
//		System.out.println("*******************************");
//     	List<Integer>ids=Arrays.asList(2,3,4);
//		service.searchVaccinesByIds(ids).forEach(v->System.out.println(v));
		List<Integer>ids=Arrays.asList(1,2);
//		String status=service.removevaccinesByIds(ids);
//		System.out.println(status);
		
		String status=service.removevaccinesByIdsCrud(ids);
		System.out.println(status);
	
	}

}
