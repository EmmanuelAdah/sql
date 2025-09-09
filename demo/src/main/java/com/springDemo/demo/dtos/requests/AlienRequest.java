package com.springDemo.demo.dtos.requests;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AlienRequest {
    @Id
    private int id;
    private String name;
    private String tech;
}
