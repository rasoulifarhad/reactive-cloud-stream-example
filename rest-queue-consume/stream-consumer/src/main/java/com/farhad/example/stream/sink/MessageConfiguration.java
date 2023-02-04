package com.farhad.example.stream.sink;//package com.canmogol.stream.writer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class MessageConfiguration {

    @Bean
    public Consumer<Message> messagesConsumer() {
        return (message) -> log.info("Message content: " + message.getContent());
    }

}
