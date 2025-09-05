package com.springDemo.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Scope;

@Data
@Entity
@Scope("prototype")
public class Alien {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    private String name;
    private String tech;

    @Override
    public String toString() {
        return "Alien{" +
                ", id=" + id + '\'' +
                ", name='" + name +
                ", tech='" + tech + '\'' +
                '}';
    }

}


