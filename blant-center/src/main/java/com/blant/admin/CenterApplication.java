package com.blant.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @author blant
 * @create 2018/1/18 13:32
 */
@EnableEurekaServer
@SpringBootApplication
public class CenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class, args);
    }
}
