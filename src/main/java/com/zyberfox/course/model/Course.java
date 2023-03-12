package com.zyberfox.course.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@Data
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    public Topic(){}

    public Topic(String spring, String framework, String description) {
        this.id = spring;
        this.name = framework;
        this.description = description;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Topic;
    }

}
