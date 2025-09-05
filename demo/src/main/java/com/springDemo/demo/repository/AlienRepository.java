package com.springDemo.demo.repository;

import com.springDemo.demo.models.Alien;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Getter
@Repository
public class AlienRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate template){
        this.jdbcTemplate = template;
    }

    public void saveAlien(Alien alien) {
        String sql = "INSERT INTO alien (id, name, tech) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, alien.getId(), alien.getName(), alien.getTech());
    }

    public List<Alien> findAll() {
        String sql = "SELECT * FROM alien";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Alien alien = new Alien();
            alien.setId(rs.getInt("id"));
            alien.setName(rs.getString("name"));
            alien.setTech(rs.getString("tech"));
            return alien;
        });
    }
}

