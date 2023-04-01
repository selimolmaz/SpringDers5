package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyComponent {
	public MyComponent() {
		System.out.println("My Component Bean Initialized!");
	}
	
	public String getName() {
		return "My Component";
	}
}
