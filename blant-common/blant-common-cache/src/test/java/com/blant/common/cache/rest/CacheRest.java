package com.blant.common.cache.rest;

import com.blant.common.cache.entity.User;
import com.blant.common.cache.service.ICacheManager;
import com.blant.common.cache.service.TestService;
import java.util.List;

import com.blant.common.cache.utils.TreeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blant.common.cache.service.ICacheManager;
import com.blant.common.cache.vo.CacheTree;

@Controller
@RequestMapping("cache")
public class CacheRest {

  @Autowired
  private ICacheManager cacheManager;

  @Autowired
  private TestService testService;

  @RequestMapping("/list")
  @ResponseBody
  public List<CacheTree> listAll() {
    return TreeUtils.buildTree(cacheManager.getAll());
  }

  @RequestMapping(path = "/pre/{pre:.*}", method = RequestMethod.GET)
  @ResponseBody
  public List<CacheTree> listPre(@PathVariable("pre") String pre) {
    return TreeUtils.buildTree(cacheManager.getByPre(pre));
  }

  @RequestMapping(path = "/{key:.*}", method = RequestMethod.GET)
  @ResponseBody
  public String get(@PathVariable("key") String key) {
    return cacheManager.get(key);
  }

  @RequestMapping(path = "/remove", method = {RequestMethod.DELETE})
  @ResponseBody
  public void removeAll() {
    cacheManager.removeAll();
  }

  @RequestMapping(path = "/pre/{pre:.*}", method = {RequestMethod.DELETE})
  @ResponseBody
  public void removePre(@PathVariable("pre") String pre) {
    cacheManager.removeByPre(pre);
  }

  @RequestMapping(path = "/{key:.*}", method = RequestMethod.DELETE)
  @ResponseBody
  public void removeKey(@PathVariable("key") String key) {
    cacheManager.remove(key);
  }

  @RequestMapping(path = "/{key:.*}", method = RequestMethod.PUT)
  @ResponseBody
  public void updateTime(@PathVariable("key") String key, int hour) {
    cacheManager.update(key, hour);
  }

  @RequestMapping("")
  public String index() {
    return "/static/cache/index.html";
  }

  @RequestMapping(path = "/test/{name}", method = RequestMethod.GET)
  @ResponseBody
  public User test(@PathVariable("name") String name) {
    return testService.getUser(name);
  }
}
