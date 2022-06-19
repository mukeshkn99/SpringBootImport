package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.pet;

@Service
public class Petservice {
	
	public pet getall() {
		String geturl="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets";
	    RestTemplate rt=new RestTemplate();
	    ResponseEntity<pet[]> response=rt.getForEntity(geturl, pet[].class);
	     pet[] p=response.getBody();
	     for(pet pe:p) {
	    	 System.out.println(pe);
	     }
		return null;
	}
	
	public pet getid(Integer petid) {
		String get="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets/{petid}";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<pet> res=rt.getForEntity(get, pet.class,petid);
		System.out.println(res.getBody());
		return res.getBody();
	}
	public void add() {
		String addurl="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets";
		RestTemplate rt=new RestTemplate();
		pet p=new pet();
		p.setPetid(3);
		p.setType("cat");
		p.setPrice(12.000);
		
		ResponseEntity<String> res=rt.postForEntity(addurl, p, String.class);
		System.out.println(res.getBody());
	}
	

}
