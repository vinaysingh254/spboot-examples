package com.vs.ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@RestController
public class HelloWorldController {
@GetMapping(path = "/ping", produces = "text/plain")
    public String ping() throws UnknownHostException {
        return "Server up. Date: " + LocalDateTime.now() + " Hostname: " + InetAddress.getLocalHost().getHostName();
    }

    @GetMapping
    public String sayHello() {
        return "Hello from spring boot!";
    }

}
