package com.springDemo.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "aliens")
public class Alien {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "tech", length = 50)
    private String tech;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}