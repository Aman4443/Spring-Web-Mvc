package main;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Alien;

public class LaunchApp 
{
	public static void main(String[] args) throws JsonProcessingException
	{
		Alien a1=new Alien(1, "Dileep", "Pune");
		//System.out.println(a1);
		Alien a2=new Alien(2, "Vijay", "Pune");
		Alien a3=new Alien(3, "Manish", "Pune");
		
		List<Alien> aliens=Arrays.asList(a1,a2,a3);
		
		ObjectMapper mapper = new ObjectMapper();
	//	String json=mapper.writeValueAsString(a1);
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(aliens);
		System.out.println(json);
		
	}

}
