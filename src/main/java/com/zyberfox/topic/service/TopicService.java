package topic.service;

import org.springframework.stereotype.Service;
import topic.model.Topic;
import topic.repository.TopicRepository;

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

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();

        topicRepository.findAll().forEach(topics::add);

        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, course);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
