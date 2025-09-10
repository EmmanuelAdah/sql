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
//        createTable();
        String sql = "INSERT INTO aliens (id, name, techStack) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, alien.getId(), alien.getName(), alien.getTechStack());
    }

    public List<Alien> findAll() {
        String sql = "SELECT * FROM alien.aliens";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Alien alien = new Alien();
            alien.setId(rs.getInt("id"));
            alien.setName(rs.getString("name"));
            alien.setTechStack(rs.getString("techStack"));
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

    public String deleteById(int id) {
        String sql = "DELETE FROM aliens  WHERE id = ?";
        jdbcTemplate.update(sql, id);
        return String.format("Alien with ID: %d deleted successfully...", id);
    }

    public String deleteByName(String name) {
        String sql = "DELETE FROM aliens  WHERE name = ?";
        jdbcTemplate.update(sql, name);
        return String.format("%s was deleted successfully...", name);
    }

    @NotNull
    private RowMapper<Alien> getAlien(String sql) {
        RowMapper<Alien> rowMapper = (rs, rowNumber) -> {
            Alien alien = new Alien();
            alien.setId(rs.getInt("id"));
            alien.setName(rs.getString("name"));
            alien.setTechStack(rs.getString("techStack"));
            return alien;
        };
        return rowMapper;
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS aliens (" +
                "id SERIAL PRIMARY KEY, " +
                "name VARCHAR(50) NOT NULL, " +
                "techStack VARCHAR(100) NOT NULL" +
                ")";
        jdbcTemplate.execute(sql);
    }
}

