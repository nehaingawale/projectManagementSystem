package com.example.project_management_system.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController     //Handle the HTTP request
@RequestMapping("/api")  //It sets the base URL
public class HealthController {

    @GetMapping("/health")  //Get the request
    public ResponseEntity<Map<String,Object>> health() {
        Map<String,Object> m = new HashMap<>();
        m.put("status","UP"); // UP is standard health check convention
        m.put("timestamp", Instant.now().toString());  //Give the current time
        m.put("version","0.1.0");
        return ResponseEntity.ok(m);
    }
}
