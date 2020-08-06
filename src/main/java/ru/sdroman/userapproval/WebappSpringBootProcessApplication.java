package ru.sdroman.userapproval;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class WebappSpringBootProcessApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebappSpringBootProcessApplication.class, args);
    }
}
