package com.dou.ms.serviceb.controllers;

import com.dou.ms.serviceb.models.HealthModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/health")
public class HealthController {

    @Value("${service.name}")
    private String service;
    @Value("${service.version}")
    private String version;
    @Value("${service.environment}")
    private String environment;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public HealthModel getHealth() {
        return new HealthModel(service, version, environment);
    }
}
