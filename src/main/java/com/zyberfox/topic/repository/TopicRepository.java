package com.zyberfox.topic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.zyberfox.topic.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String>{
}
