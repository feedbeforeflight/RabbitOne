package com.feedbeforeflight.RabbitOne.Status;

import org.springframework.beans.factory.annotation.Value;

public class Status {

    private long id;
    private String content;
    private String version;

    public Status(long id, String content, String version){
        this.id = id;
        this.content = content;
        this.version = version;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

}
