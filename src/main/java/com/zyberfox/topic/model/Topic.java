package com.zyberfox.topic.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    public Topic(){}

    public Topic(String spring, String framework, String description) {
        super();
        this.id = spring;
        this.name = framework;
        this.description = description;
    }


}
