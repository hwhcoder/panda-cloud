package com.yukong.panda.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务端
 * 本工程比较简单，没有业务逻辑
 */
@EnableEurekaServer
@SpringBootApplication
public class PandaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandaServerApplication.class, args);
    }
}
