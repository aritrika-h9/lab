package com.example.event_service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EventController {

    @GetMapping("/event")
    public String getEvents() {
        return """
                Available events

                1. Python
                2. Java
                3. Web Development
                """;
    }

    @PostMapping("/register")
    public String registerStudent(@RequestBody Student students) {
        return """
                name=%s
                email=%s
                event=%s
                college=%s
                """.formatted(
                students.getName(),
                students.getEmail(),
                students.getEvent(),
                students.getCollege()
        );
    }
}