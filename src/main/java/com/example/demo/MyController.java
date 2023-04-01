package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
	private MyComponent myComponent;

	
	public MyController(@Lazy MyComponent myComponent) {
		this.myComponent = myComponent;
	}
	
	/*
	 * Burada Lazt annotation'u ile damgalanan MyComponent class'ı her ne zaman ihtiyaç duyulursa o zaman ioc'ye bir objesi eklenecek
	 * Burada yapılan işlemde ise şuna karar verildi: 
	 * Eğer kullanıcı bu end point'i isterse bu objeyi iste 
	 * Eğer bu obje ioc'de yoksa bir tane oluştur!
	 */
	@GetMapping(path = "/names")
	public String getComponentName() {
		return myComponent.getName();
	}
	
}
