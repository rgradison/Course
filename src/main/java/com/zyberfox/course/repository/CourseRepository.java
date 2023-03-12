package com.zyberfox.course.repository;

import com.zyberfox.course.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Course,String>{
}
