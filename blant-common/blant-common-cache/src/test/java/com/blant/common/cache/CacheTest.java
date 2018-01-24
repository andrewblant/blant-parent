package com.blant.common.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * test run
 */
@SpringBootApplication
@EnableAceCache
public class CacheTest {

  public static void main(String args[]) {
    SpringApplication.run(CacheTest.class, args);
  }

}
