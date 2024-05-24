package com.example.hosting.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	public User(String string, String string2, int i) {
		name=string;
		capital=string2;
		population =i;
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String capital;
	private int population;
	


}
