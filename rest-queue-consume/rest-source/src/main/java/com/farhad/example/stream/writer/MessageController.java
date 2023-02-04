package com.farhad.example.stream.writer;

import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
@AllArgsConstructor
public class MessageController {

    private final StreamBridge streamBridge;

    @PostMapping
    public boolean saveMessage(@RequestBody final Message message) {
        return streamBridge.send("messages", message);
    }

}