package com.blant.admin.mysql.config.mybatis;

import com.github.pagehelper.PageHelper;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * mybatis
 *
 * @author blant
 * @create 2018/1/18 15:16
 */
@Configuration
@EnableConfigurationProperties(MybatisProperties.class)
public class MybatisConfiguration {

  @Autowired
  private MybatisProperties properties;

  @Bean(name = "sqlSessionFactory")
  public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    if (StringUtils.isNotBlank(this.properties.getTypeAliasesPackage())) {
      bean.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
    }
    //分页插件
    PageHelper pageHelper = new PageHelper();
    Properties properties = new Properties();
    properties.setProperty("reasonable", "true");
    properties.setProperty("supportMethodsArguments", "true");
    properties.setProperty("returnPageInfo", "check");
    properties.setProperty("params", "count=countSql");
    pageHelper.setProperties(properties);
    //添加XML目录
    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    Interceptor[] plugins = new Interceptor[]{pageHelper};
    bean.setPlugins(plugins);
    try {
      bean.setMapperLocations(resolver.getResources(this.properties.getXmlLocation()));
      return bean.getObject();
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  @Bean
  public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
    return new SqlSessionTemplate(sqlSessionFactory);
  }

  @Bean
  public DataSourceTransactionManager transactionManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }
}
