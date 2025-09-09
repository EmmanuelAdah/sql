package com.springDemo.demo.repositories;

import com.springDemo.demo.models.Alien;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AlienRepository  {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate template){
        this.jdbcTemplate = template;
    }

    public void saveAlien(Alien alien) {
        String sql = "INSERT INTO aliens (id, name, tech) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, alien.getId(), alien.getName(), alien.getTech());
    }

    public List<Alien> findAll() {
        String sql = "SELECT * FROM alien.aliens";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Alien alien = new Alien();
            alien.setId(rs.getInt("id"));
            alien.setName(rs.getString("name"));
            alien.setTech(rs.getString("tech"));
            return alien;
        });
    }

    public String deleteAll() {
        String sql = "DELETE FROM aliens";
        jdbcTemplate.update(sql);
        return "Aliens deleted successfully...";
    }

    public Alien findById(int id) {
        String sql = "SELECT * FROM aliens  WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, getAlien(sql), id);
    }

    public Alien findByName(String name) {
        String sql = "SELECT * FROM aliens  WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, getAlien(sql), name);
    }

    @NotNull
    private RowMapper<Alien> getAlien(String sql) {
        RowMapper<Alien> rowMapper = (rs, rowNumber) -> {
            Alien alien = new Alien();
            alien.setId(rs.getInt("id"));
            alien.setName(rs.getString("name"));
            alien.setTech(rs.getString("tech"));
            return alien;
        };
        return rowMapper;
    }
}

