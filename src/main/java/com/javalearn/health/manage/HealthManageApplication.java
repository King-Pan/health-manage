package com.javalearn.health.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;


@SpringBootApplication
public class HealthManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthManageApplication.class, args);
    }
}
