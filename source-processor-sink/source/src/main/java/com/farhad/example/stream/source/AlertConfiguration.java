package com.farhad.example.stream.source;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.function.Supplier;

@Configuration
@Slf4j
public class AlertConfiguration {

    @Bean
    public Supplier<Flux<Alert>> alertSource() {
        return () -> Flux
                .interval(Duration.ofSeconds(5))
                .map(value -> new Alert("New Alert " + value));
    }

}
