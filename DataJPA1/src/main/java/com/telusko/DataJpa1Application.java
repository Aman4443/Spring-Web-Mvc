package com.telusko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.model.Vaccine;
import com.telusko.service.IVaccineService;

@SpringBootApplication
public class DataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpa1Application.class, args);
	
	    IVaccineService service = container.getBean(IVaccineService.class);
//	    
	    String msg=service.registerVaccineInfo(new Vaccine("CoVaxin", "BharatBio", 45454.4));
	    System.out.println(msg);
	    
	    List<Vaccine> vaccines=new ArrayList<>();
	    vaccines.add(new Vaccine("CovidShield", "AstraZenica", 545454.4));
	    vaccines.add(new Vaccine("SpikeVax", "Moderna", 45454.4));
	    vaccines.add(new Vaccine("Janssen", "Johnson", 4554.4));
	    vaccines.add(new Vaccine("Sputnik", "Russian", 466454.4));
	    
	    service.registerMultipleVaccines(vaccines).forEach(v->System.out.println(v));
	    
	    long count=service.count();
	    System.out.println("The Count of vaccine info is "+ count);
	    
	    int id=4;
	    boolean status=service.checkAvailability(4);
	    if(status)
	    	System.out.println("vaccine is available for the given id "+ id);
	    else
	    	System.out.println("vaccine is unavailable for the given id " +id);
	    
	    
	    List<Integer> ids=Arrays.asList(2,3,4);
	    
	    service.fetchallVaccinesInfo().forEach(v->System.out.println(v));
	    
	    service.fetchALlVaccinesBasedOnIds(ids).forEach(v1->System.out.println(v1));
	    
	
	}

}
