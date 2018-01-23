package com.blant.admin.mysql.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.blant.admin.common.util.StringUtils;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**X2
 * ${DESCRIPTION}
 *
 * @author blant
 * @create 2018/1/18 15:19
 */
@Configuration
@EnableConfigurationProperties(DruidProperties.class)
public class DruidConfiguration {

  @Autowired
  private DruidProperties druidProperties;

  @Bean
  public DataSource druidDataSource() {
    DruidDataSource druidDataSource = new DruidDataSource();
    druidDataSource.setUrl(this.druidProperties.getUrl());
    druidDataSource.setUsername(this.druidProperties.getUsername());
    druidDataSource.setPassword(this.druidProperties.getPassword());
    druidDataSource.setDriverClassName(
        StringUtils.isNotBlank(this.druidProperties.getDriveClassName()) ? this.druidProperties
            .getDriveClassName() : "com.mysql.jdbc.Driver");
    druidDataSource.setMaxActive(
        StringUtils.isNotBlank(this.druidProperties.getMaxActive()) ? Integer
            .parseInt(this.druidProperties.getMaxActive()) : 10);
    druidDataSource.setInitialSize(
        StringUtils.isNotBlank(this.druidProperties.getInitialSize()) ? Integer
            .parseInt(this.druidProperties.getInitialSize()) : 1);
    druidDataSource.setMaxWait(StringUtils.isNotBlank(this.druidProperties.getMaxWait()) ? Integer
        .parseInt(this.druidProperties.getMaxWait()) : 60000);
    druidDataSource.setMinIdle(StringUtils.isNotBlank(this.druidProperties.getMinIdle()) ? Integer
        .parseInt(this.druidProperties.getMinIdle()) : 3);
    druidDataSource.setTimeBetweenEvictionRunsMillis(
        StringUtils.isNotBlank(this.druidProperties.getTimeBetweenEvictionRunsMillis()) ?
            Integer.parseInt(this.druidProperties.getTimeBetweenEvictionRunsMillis()) : 60000);
    druidDataSource.setMinEvictableIdleTimeMillis(
        StringUtils.isNotBlank(this.druidProperties.getMinEvictableIdleTimeMillis()) ?
            Integer.parseInt(this.druidProperties.getMinEvictableIdleTimeMillis()) : 300000);
    druidDataSource.setValidationQuery(
        StringUtils.isNotBlank(this.druidProperties.getValidationQuery()) ? this.druidProperties
            .getValidationQuery() : "select 'x'");
    druidDataSource.setTestWhileIdle(
        StringUtils.isNotBlank(this.druidProperties.getTestWhileIdle()) ? Boolean
            .parseBoolean(this.druidProperties.getTestWhileIdle()) : true);
    druidDataSource.setTestOnBorrow(
        StringUtils.isNotBlank(this.druidProperties.getTestOnBorrow()) ? Boolean
            .parseBoolean(this.druidProperties.getTestOnBorrow()) : false);
    druidDataSource.setTestOnReturn(
        StringUtils.isNotBlank(this.druidProperties.getTestOnReturn()) ? Boolean
            .parseBoolean(this.druidProperties.getTestOnReturn()) : false);
    druidDataSource.setPoolPreparedStatements(
        StringUtils.isNotBlank(this.druidProperties.getPoolPreparedStatements()) ? Boolean
            .parseBoolean(this.druidProperties.getPoolPreparedStatements()) : true);
    druidDataSource.setMaxOpenPreparedStatements(
        StringUtils.isNotBlank(this.druidProperties.getMaxOpenPreparedStatements()) ? Integer
            .parseInt(this.druidProperties.getMaxOpenPreparedStatements()) : 20);

    try {
      druidDataSource.setFilters(
          StringUtils.isNotBlank(this.druidProperties.getFilters()) ? this.druidProperties
              .getFilters() : "stat, wall");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return druidDataSource;
  }
}
