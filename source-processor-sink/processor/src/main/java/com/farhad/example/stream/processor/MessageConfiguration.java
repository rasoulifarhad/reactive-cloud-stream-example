package com.farhad.example.stream.processor;//package com.canmogol.stream.writer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.function.Function;


@Configuration
@Slf4j
public class MessageConfiguration {

    @Bean
    public Function<Flux<Alert>, Flux<Integration>> messagesProcessor() {
        return (alertFlux) -> alertFlux
                .map(content -> new Integration("Create message for alert: " + content));
    }

}
