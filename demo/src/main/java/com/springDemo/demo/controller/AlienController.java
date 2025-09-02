package com.springDemo.demo.controller;

import com.springDemo.demo.models.Alien;
import com.springDemo.demo.repository.AlienRepository;
import org.springframework.stereotype.Component;

@Component
public class AlienController {
     private AlienRepository repo;

    public void addAlien(Alien alien){
        repo.saveAlien(alien);
    }
}
