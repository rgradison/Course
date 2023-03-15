package com.zyberfox.topic.controller;

import org.springframework.web.bind.annotation.*;
import com.zyberfox.topic.model.Topic;
import com.zyberfox.topic.service.TopicService;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    private TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }
    @RequestMapping("/topics")
    public List<Topic> allTopics() {
        return topicService.getAllTopics();
    }
    //Not recommended
    //OR @RequestMapping("/topics/{foo}") then public Topic getTopic(@PathVariable("foo") String id) {
    // return topicService.getTopic(id);
    //}
    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id,topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
