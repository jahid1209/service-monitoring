package com.example.servicemonitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    @GetMapping("/endpoint-one")
    public String endPoint1() {
        return "<h2 style='color:red' align='center'>Metrics for endpoint-one</h2>";

    }

    @GetMapping("/endpoint-two")
    public String endPoint2() {
        return "<h2 style='color:green' align='center'>Metrics for endpoint-two</h2>";
    }
}
