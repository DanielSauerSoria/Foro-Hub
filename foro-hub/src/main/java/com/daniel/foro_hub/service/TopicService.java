package com.daniel.foro_hub.service;

import com.daniel.foro_hub.exception.DuplicateResourceException;
import com.daniel.foro_hub.exception.ResourceNotFoundException;
import com.daniel.foro_hub.model.Topic;
import com.daniel.foro_hub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopicById(Long id) {
        return topicRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found with id " + id));
    }

    public Topic createTopic(Topic topic) {
        // Validations
        if (topicRepository.findByTitleAndMessage(topic.getTitle(), topic.getMessage()).isPresent()) {
            throw new DuplicateResourceException("Topic with same title and message already exists");
        }
        topic.setCreationDate(LocalDateTime.now());
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Long id, Topic topicDetails) {
        Topic topic = topicRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found with id " + id));

        topic.setTitle(topicDetails.getTitle());
        topic.setMessage(topicDetails.getMessage());
        topic.setStatus(topicDetails.getStatus());
        topic.setAuthor(topicDetails.getAuthor());
        topic.setCourse(topicDetails.getCourse());

        return topicRepository.save(topic);
    }

    public void deleteTopic(Long id) {
        Topic topic = topicRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found with id " + id));

        topicRepository.delete(topic);
    }
}
