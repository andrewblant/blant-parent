package com.blant.admin.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author blant
 * @create 2018/1/18 13:32
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class MonitorApplication {
  public static void main(String[] args) {
    SpringApplication.run(MonitorApplication.class, args);
  }
}
