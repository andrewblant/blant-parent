package com.blant.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * UserServerApplication
 *
 * @author blant
 * @create 2018/1/22 10:40
 */
@SpringBootApplication
@EnableEurekaClient
public class UserServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserServerApplication.class, args);
  }
}
