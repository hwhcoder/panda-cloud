package com.yukong.panda.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 本工程比较简单，没有业务逻辑
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class PandaConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandaConfigServerApplication.class, args);
    }
}
