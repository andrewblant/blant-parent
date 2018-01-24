package com.blant.common.cache.service;

import com.blant.common.cache.entity.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ace on 2017/5/21.
 */
public interface UserService {

  User get(String account);

  List<User> getLlist();

  Set<User> getSet();

  Map<String, User> getMap();

  void save(User user);

  User get(int age);
}
