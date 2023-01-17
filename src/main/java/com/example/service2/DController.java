package com.example.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableDiscoveryClient
public class DController {
    @Autowired
    DService discoveryService;

    @GetMapping(value = "/services")
    public List<String> services() {
        return discoveryService.getServices();
    }

}