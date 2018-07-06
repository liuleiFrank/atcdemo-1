package com.example.demo.ll;

import lombok.NonNull;

public class NonNullExample {
	
	private String name;
	
	public NonNullExample(@NonNull Person person) {
		
		this.name=person.getName();
	}
}
