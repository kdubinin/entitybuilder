package com.iwolt.entitybuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.iwolt.entitybuilder.repo")
@EntityScan("com.iwolt.entitybuilder.model")
@SpringBootApplication
public class EntitybuilderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EntitybuilderApplication.class, args);
    }

}
