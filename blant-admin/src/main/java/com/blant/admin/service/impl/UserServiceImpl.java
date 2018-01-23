package com.blant.admin.service.impl;

import com.blant.admin.entity.User;
import com.blant.admin.feign.UserFeign;
import com.blant.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author blant
 * @create 2018/1/22 16:46
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserFeign userFeign;

  public User getUser(String name) {
    return userFeign.getUser(name);
  }
}
