package com.example.hosting.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hosting.model.User;

@RestController
@RequestMapping("/api/v1/cities")
public class UserController {
	private static  List<User> COUNTRIES =List.of(
			new User("USA","washngtn",339996890),
    	new User("chna","bgjng",339986890),
	    new User("IND","ND",379996890)
	    );
		
		   
		   
		   
		

	@GetMapping
	public String getCountries(){
		

		System.out.println(COUNTRIES);
		return "api running";
	}

}
