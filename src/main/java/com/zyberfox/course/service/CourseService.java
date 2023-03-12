package com.zyberfox.course.service;

import com.zyberfox.course.repository.TopicRepository;
import com.zyberfox.course.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

      TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {

        this.topicRepository = topicRepository;
    }

    /*private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring", "Framework", "Description"),
            new Topic("Java", "Core", "Description"),
            new Topic("Javascript", "Javascript", "Description"))
    );*/

    public List<Course> getAllTopics() {
        List<Course> topics = new ArrayList<>();

        topicRepository.findAll().forEach(topics::add);

        return topics;
    }

    public Optional<Course> getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Course course) {
        topicRepository.save(course);
    }

    public void updateTopic(String id, Course course) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, course);
//                return;
//            }
//        }
        topicRepository.save(course);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
