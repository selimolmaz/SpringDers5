package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/*
 * Burada:
 * The dependencies of some of the beans in the application context form a cycle:

┌─────┐
|  firstService defined in file [/Users/selimolmaz/Desktop/spring/Lazy-2/bin/main/com/example/demo/FirstService.class]
↑     ↓
|  secondService defined in file [/Users/selimolmaz/Desktop/spring/Lazy-2/bin/main/com/example/demo/SecondService.class]
└─────┘
	şeklinde birbirini çağıran servisler hataya sebep oluyor. 
	Bunu engellemek için @Lazy annotation'u kullanacağız.  
 */
@Service
class FirstService {
	
	private SecondService secondService;

	public FirstService(@Lazy SecondService secondService) {
		this.secondService = secondService;
	}
	
	

}
