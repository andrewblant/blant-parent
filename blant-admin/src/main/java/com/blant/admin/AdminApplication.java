package com.blant.admin;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * ${DESCRIPTION}
 *
 * @author blant
 * @create 2018/1/22 16:55
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.blant.admin.feign")
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class AdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(AdminApplication.class, args);
  }
}
