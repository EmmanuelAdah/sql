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

    @PostMapping("/alien")
    public AlienResponse addAlien(@RequestBody AlienRequest alienRequest){
        return alienService.saveAlien(alienRequest);
    }

    @GetMapping("/get_by_id")
    public AlienResponse findAlienById(@RequestParam int id){
        return alienService.findByAlienId(id);
    }

    @GetMapping("/get_by_name")
    public AlienResponse findAlienByName(@RequestParam String name){
        return alienService.findByAlienName(name);
    }

    @GetMapping("/aliens")
    public List<Alien> findAllAlien() {
        return alienService.findAll();
    }

    @DeleteMapping("/delete/aliens")
    public String deleteAll(){
        return alienService.deleteAll();
    }

    @DeleteMapping("/delete_by_id")
    public String deleteAlienById(@RequestParam int id){
        return alienService.deleteById(id);
    }

    @DeleteMapping("/delete_by_name")
    public String deleteByName(@RequestBody String name){
        return alienService.deleteByName(name);
    }
}
