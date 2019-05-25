package com.example.demo;

import com.example.resources.TopicService;
import com.example.resources.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topics> topics(){
        return Arrays.asList(new Topics("Algo","12","Algorithm related"),
                new Topics("Architec","13","difhdkuf"),
                new Topics("Compiler","14","bvhsdivsdiok"));
    }

    @GetMapping("/hello")
    public Topics hello(){
       return topicService.getTopic();
    }
}
