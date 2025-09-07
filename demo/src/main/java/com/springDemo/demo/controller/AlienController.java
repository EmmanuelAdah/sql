package com.springDemo.demo.controller;

import com.springDemo.demo.dtos.requests.AlienRequest;
import com.springDemo.demo.dtos.response.AlienResponse;
import com.springDemo.demo.models.Alien;
import com.springDemo.demo.services.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {
     private final AlienService alienService;

    @Autowired
    public AlienController(AlienService alienService) {
        this.alienService = alienService;
    }

    @PostMapping
    public AlienResponse addAlien(@RequestBody AlienRequest alienRequest){
        return alienService.saveAlien(alienRequest);
    }

    @GetMapping
    public List<Alien> findAllAlien() {
        return alienService.findAll();
    }

    @DeleteMapping
    public String deleteAll(){
        return alienService.deleteAll();
    }
}
