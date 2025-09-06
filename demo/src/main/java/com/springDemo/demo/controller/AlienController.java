package com.springDemo.demo.controller;

import com.springDemo.demo.dtos.requests.AlienRequest;
import com.springDemo.demo.dtos.response.AlienResponse;
import com.springDemo.demo.models.Alien;
import com.springDemo.demo.services.AlienService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AlienController {
     private AlienService alienService;

    public AlienResponse addAlien(AlienRequest alienRequest){
        return alienService.saveAlien(alienRequest);
    }

    public List<Alien> findAllAlien() {
        return alienService.findAll();
    }

    public String deleteAll(){
        return alienService.deleteAll();
    }
}
