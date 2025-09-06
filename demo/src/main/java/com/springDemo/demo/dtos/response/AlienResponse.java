package com.springDemo.demo.dtos.response;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AlienResponse {
    private int id;
    private String name;
    private String tech;
}
