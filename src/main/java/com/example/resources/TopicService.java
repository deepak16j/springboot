package com.example.resources;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private Topics topic;
    public Topics getTopic(){
        topic = new Topics("Algo","12","Algorithm related");
        return topic;
    }
}
