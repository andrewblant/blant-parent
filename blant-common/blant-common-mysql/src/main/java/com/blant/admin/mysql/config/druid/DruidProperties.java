package com.blant.admin.mysql.config.druid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * druid properties
 *
 * @author blant
 * @create 2018/1/18 15:19
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "spring.datasource")
public class DruidProperties {

  private String driveClassName;
  private String url;
  private String username;
  private String password;
  private String filters;
  private String maxActive;
  private String initialSize;
  private String maxWait;
  private String minIdle;
  private String timeBetweenEvictionRunsMillis;
  private String minEvictableIdleTimeMillis;
  private String validationQuery;
  private String testWhileIdle;
  private String testOnBorrow;
  private String testOnReturn;
  private String poolPreparedStatements;
  private String maxOpenPreparedStatements;


}
