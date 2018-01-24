package com.blant.common.cache.service.impl;

import com.blant.common.cache.annotation.Cache;
import com.blant.common.cache.entity.User;
import com.blant.common.cache.service.TestService;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author blant
 * @create 2018/1/24 14:51
 */
@Log4j
@Service
public class TestServiceImpl implements TestService{

  @Cache(key = "user{1}")
  @Override
  public User getUser(String name) {
    User user = new User();
    user.setName(name);
    user.setAge(100);
    user.setAccount("10");
    log.info(user.toString());
    return user;
  }
}
