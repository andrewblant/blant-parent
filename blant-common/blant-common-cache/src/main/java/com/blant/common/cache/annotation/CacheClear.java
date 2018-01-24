package com.blant.common.cache.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.blant.common.cache.parser.IKeyGenerator;
import com.blant.common.cache.parser.impl.DefaultKeyGenerator;

/**
 * 解决问题：
 *
 * @author blant
 * @version 1.0
 * @date 2017年5月4日
 * @since 1.7
 */
@Retention(RetentionPolicy.RUNTIME)//在运行时可以获取  
@Target(value = {ElementType.METHOD, ElementType.TYPE})//作用到类，方法，接口上等
public @interface CacheClear {

  /**
   * 缓存key的前缀
   *
   * @author blant
   * @date 2017年5月3日
   */
  String pre() default "";

  /**
   * 缓存key
   *
   * @author blant
   * @date 2017年5月3日
   */
  String key() default "";

  /**
   * 缓存keys
   *
   * @author blant
   * @date 2017年5月3日
   */
  String[] keys() default "";

  /**
   * 键值解析类
   */
  Class<? extends IKeyGenerator> generator() default DefaultKeyGenerator.class;
}
