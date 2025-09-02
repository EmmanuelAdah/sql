package com.springDemo.demo;

import com.springDemo.demo.models.Alien;
import com.springDemo.demo.repository.AlienRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String... args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Alien alien = context.getBean(Alien.class);
		alien.setId(1);
		alien.setName("Emma");
		alien.setTech("Java, Python");

		AlienRepository repo = context.getBean(AlienRepository.class);
		repo.saveAlien(alien);

		System.out.println(repo.findAll());
	}
}
