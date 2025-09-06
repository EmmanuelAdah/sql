package com.springDemo.demo.utils;

import com.springDemo.demo.dtos.requests.AlienRequest;
import com.springDemo.demo.dtos.response.AlienResponse;
import com.springDemo.demo.models.Alien;

public class Mapper {

    public static Alien map(AlienRequest alienRequest) {
        Alien alien = new Alien();
        alien.setId(alienRequest.getId());
        alien.setName(alienRequest.getName());
        alien.setTech(alienRequest.getTech());
        return alien;
    }

    public static AlienResponse map(Alien alien) {
        AlienResponse alienResponse = new AlienResponse();
        alienResponse.setId(alien.getId());
        alienResponse.setName(alien.getName());
        alienResponse.setTech(alien.getTech());
        return alienResponse;
    }
}
