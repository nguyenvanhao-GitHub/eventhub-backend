package com.eventhub.api.controller;

import com.eventhub.api.common.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/health")
    public ResponseEntity<ApiResponse<Map<String, Object>>> healthCheck() {
        Map<String, Object> status = Map.of(
                "service", "EventHub API",
                "status", "UP",
                "version", "0.0.1-SNAPSHOT"
        );
        return ResponseEntity.ok(ApiResponse.success("EventHub Service is healthy", status));
    }
}
