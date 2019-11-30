package com.vs.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:META-INF/spring/spring-ws-boot-config.xml"})
public class SpringBootApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationRunner.class, args);

    }
}
