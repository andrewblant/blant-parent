package com.blant.admin.service.impl;

import com.blant.admin.entity.User;
import com.blant.admin.mapper.UserMapper;
import com.blant.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author blant
 * @create 2018/1/22 10:24
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  public User getUser(String name){
    User user = new User();
    user.setUsername(name);
    return userMapper.selectOne(user);
  }
}
