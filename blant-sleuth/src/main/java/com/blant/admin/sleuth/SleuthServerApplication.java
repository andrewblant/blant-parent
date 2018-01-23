package com.blant.admin.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * ${DESCRIPTION}
 *
 * @author blant
 * @create 2018/1/23 12:14
 */
@SpringBootApplication
@EnableZipkinServer
public class SleuthServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SleuthServerApplication.class, args);
  }
}
