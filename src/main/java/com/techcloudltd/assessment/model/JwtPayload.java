package com.techcloudltd.assessment.model;

public class JwtPayload {
    private String name;
    private String id;
    private String validated;

    public JwtPayload(String name, String id, String validated) {
        this.name = name;
        this.id = id;
        this.validated = validated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValidated() {
        return validated;
    }

    public void setValidated(String validated) {
        this.validated = validated;
    }

    @Override
    public String toString() {
        return "JwtPayload{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", validated='" + validated + '\'' +
                '}';
    }
}

