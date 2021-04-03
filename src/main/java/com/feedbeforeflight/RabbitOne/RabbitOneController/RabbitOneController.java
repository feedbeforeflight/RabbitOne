package com.feedbeforeflight.RabbitOne.RabbitOneController;

import com.feedbeforeflight.RabbitOne.Status.Status;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RabbitOneController {

    private static final String template = "Service status is %s";
    private final AtomicLong counter = new AtomicLong();

    @Value("${app.version}")
    private String version;
    public String getVersion() {
        return version;
    }

    @RequestMapping("/status")
    public Status status(@RequestParam(value="name", required = false, defaultValue = "All is OK") String name){
        return new Status(counter.incrementAndGet(), String.format(template, name), version);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Controller started with version: " + version);
    }
}
