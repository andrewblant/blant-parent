package com.blant.common.cache.annotation;

import com.blant.common.cache.constants.CacheScope;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.blant.common.cache.parser.ICacheResultParser;
import com.blant.common.cache.parser.IKeyGenerator;
import com.blant.common.cache.parser.impl.DefaultKeyGenerator;
import com.blant.common.cache.parser.impl.DefaultResultParser;

/**
 * 开启缓存
 * <p/>
 * 解决问题：
 *
 * @author blant
 * @version 1.0
 * @date 2017年5月4日
 * @since 1.7
 */
@Retention(RetentionPolicy.RUNTIME)
// 在运行时可以获取
@Target(value = {ElementType.METHOD, ElementType.TYPE})
// 作用到类，方法，接口上等
public @interface Cache {

  /**
   * 缓存key menu_{0.id}{1}_type
   *
   * @author blant
   * @date 2017年5月3日
   */
  String key() default "";

  /**
   * 作用域
   *
   * @author blant
   * @date 2017年5月3日
   */
  CacheScope scope() default CacheScope.application;

  /**
   * 过期时间
   *
   * @author blant
   * @date 2017年5月3日
   */
  int expire() default 720;

  /**
   * 返回类型
   *
   * @author blant
   * @date 2017年5月4日
   */
  Class[] result() default Object.class;

  /**
   * 返回结果解析类
   */
  Class<? extends ICacheResultParser> parser() default DefaultResultParser.class;

  /**
   * 键值解析类
   */
  Class<? extends IKeyGenerator> generator() default DefaultKeyGenerator.class;
}
