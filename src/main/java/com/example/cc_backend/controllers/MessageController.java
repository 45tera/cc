package com.example.cc_backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cc_backend.entities.Message;

@RestController
public class MessageController {

    @RequestMapping("/hello")
    public Message getMessage() {
        return new Message("Hello from the MessageController!");
    }
}
