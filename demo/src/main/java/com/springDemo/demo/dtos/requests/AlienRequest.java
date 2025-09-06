package com.springDemo.demo.dtos.requests;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AlienRequest {
    private int id;
    private String name;
    private String tech;
}
