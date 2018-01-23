package com.blant.admin.rest;

import com.blant.admin.entity.User;
import com.blant.admin.service.UserService;
import org.junit.runners.Parameterized.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author blant
 * @create 2018/1/22 10:23
 */
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/getUser")
  @ResponseBody
  public User getUser(@RequestParam String name){
    return userService.getUser(name);
  }
}
