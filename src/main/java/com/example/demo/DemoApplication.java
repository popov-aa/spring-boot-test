package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.service.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(DemoApplication.class, args);
		for (var name: applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}
		applicationContext.getBean(TestService.class);
	}

}
