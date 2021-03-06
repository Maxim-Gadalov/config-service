package com.mhadalau.ecosystem.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigServiceApplicationStarter {

    public static void main(String...args){
        SpringApplication.run(ConfigServiceApplicationStarter.class, args);
    }
}
