package com.example.resources;

public class Topics {
    private String topicName;
    private String topicId;
    private String desc;

    public Topics(String topicName, String topicId, String desc) {
        this.topicName = topicName;
        this.topicId = topicId;
        this.desc = desc;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getDesc() {
        return desc;
    }
}
