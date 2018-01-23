package com.blant.admin.mysql.config.mybatis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * mybatis
 *
 * @author blant
 * @create 2018/1/18 16:07
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "mybatis")
public class MybatisProperties {

  private String xmlLocation;
  private String typeAliasesPackage;
}
