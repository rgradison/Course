package com.zyberfox.course.model;

import com.zyberfox.topic.model.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
@Entity
@Data
public class Course {
    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name="topic_id")
    private Topic topic;

    public Course(){}

    public Course(String spring, String framework, String description, String topicId) {
        this.id = spring;
        this.name = framework;
        this.description = description;
        this.topic= new Topic(topicId,"","");
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Course;
    }

}
