package com.czetsuyatech.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Naming {

    public static void main(String[] args) {
        SpringApplication.run(Naming.class, args);
    }

}
