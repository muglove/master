package com.muglove.projcet.muglove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MugloveApplication {

    public static void main(String[] args) {
        SpringApplication.run(MugloveApplication.class, args);
    }

}
