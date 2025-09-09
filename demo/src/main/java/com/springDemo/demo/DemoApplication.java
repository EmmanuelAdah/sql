package com.springDemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String... args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//		AlienController controller = context.getBean(AlienController.class);
//		System.out.println(controller.deleteAll());
//
//		AlienRequest alienRequest = context.getBean(AlienRequest.class);
//		alienRequest.setId(1);
//		alienRequest.setName("Emma");
//		alienRequest.setTech("Java, Python");
//
//		controller.addAlien(alienRequest);
//
//		AlienController controller1 = context.getBean(AlienController.class);
//		AlienRequest alienRequest1 = new AlienRequest();
//		alienRequest1.setId(2);
//		alienRequest1.setName("James");
//		alienRequest1.setTech("Java, JavaScript, Python");
//		controller1.addAlien(alienRequest1);

//		System.out.println(controller.findAllAlien());
	}
}
