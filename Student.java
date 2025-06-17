package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        // Get JdbcTemplate bean
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        // SQL query
        String query = "INSERT INTO Student(id, name, city) VALUES (?, ?, ?)";

        // Execute query
        int result = jdbcTemplate.update(query, 101, "Uttej", "Kanpur");

        // Output result
        System.out.println("Number of records inserted: " + result);
    }
}
