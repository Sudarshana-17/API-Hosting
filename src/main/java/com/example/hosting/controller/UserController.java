package com.example.hosting.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/cities")
public class UserController {
	 @GetMapping
	    public String getAllUsers() {
	        return "Returning all users";
	    }

}
