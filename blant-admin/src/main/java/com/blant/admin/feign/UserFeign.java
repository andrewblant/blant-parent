package com.blant.admin.feign;

import com.blant.admin.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * userFeign
 *
 * @author blant
 * @create 2018/1/22 10:18
 */
@FeignClient(value = "${user.serviceId}", configuration = {})
public interface UserFeign {

  @RequestMapping(value = "/getUser")
  User getUser(@RequestParam(value = "name") String name);
}


