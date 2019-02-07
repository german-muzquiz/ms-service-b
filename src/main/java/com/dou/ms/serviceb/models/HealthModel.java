package com.dou.ms.serviceb.models;

public class HealthModel {

    private String service;
    private String version;
    private String environment;

    public HealthModel() {
    }

    public HealthModel(String service, String version, String environment) {
        this.service = service;
        this.version = version;
        this.environment = environment;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
