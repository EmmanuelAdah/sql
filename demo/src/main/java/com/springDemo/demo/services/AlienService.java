package com.springDemo.demo.services;

import com.springDemo.demo.dtos.requests.AlienRequest;
import com.springDemo.demo.dtos.response.AlienResponse;
import com.springDemo.demo.models.Alien;
import com.springDemo.demo.repositories.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import static com.springDemo.demo.utils.Mapper.map;

@Service
public class AlienService {
    private final AlienRepository alienRepository;

    @Autowired
    public AlienService(AlienRepository alienRepository) {
        this.alienRepository = alienRepository;
    }

    public AlienResponse saveAlien(@RequestBody AlienRequest alienRequest) {
        Alien alien = map(alienRequest);
        alienRepository.saveAlien(alien);
        return map(alien);
    }

    public List<Alien> findAll() {
        return alienRepository.findAll();
    }

    public String deleteAll() {
        return alienRepository.deleteAll();
    }
}
