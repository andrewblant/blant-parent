package com.blant.common.cache.api;

import com.blant.common.cache.entity.CacheBean;
import java.util.List;

/**
 * 缓存API
 * <p/>
 * 解决问题：
 *
 * @author blant
 * @version 1.0
 * @date 2017年5月4日
 * @since 1.7
 */
public interface CacheAPI {
    /**
     * 传入key获取缓存json，需要用fastjson转换为对象
     *
     * @param key
     * @return
     * @author blant
     * @date 2017年5月12日
     */
    public String get(String key);

    /**
     * 保存缓存
     *
     * @param key
     * @param value
     * @param expireMin
     * @author blant
     * @date 2017年5月12日
     */
    public void set(String key, Object value, int expireMin);

    /**
     * 保存缓存
     *
     * @param key
     * @param value
     * @param expireMin
     * @param desc
     * @author blant
     * @date 2017年5月12日
     */
    public void set(String key, Object value, int expireMin, String desc);

    /**
     * 移除单个缓存
     *
     * @param key
     * @return
     * @author blant
     * @date 2017年5月12日
     */
    public Long remove(String key);

    /**
     * 移除多个缓存
     *
     * @param keys
     * @return
     * @author blant
     * @date 2017年5月12日
     */
    public Long remove(String... keys);

    /**
     * 按前缀移除缓存
     *
     * @param pre
     * @return
     * @author blant
     * @date 2017年5月12日
     */
    public Long removeByPre(String pre);

    /**
     * 通过前缀获取缓存信息
     *
     * @param pre
     * @return
     * @author blant
     * @date 2017年5月12日
     */
    public List<CacheBean> getCacheBeanByPre(String pre);

    /**
     * 获取所有缓存对象信息
     *
     * @return
     * @author blant
     * @date 2017年5月12日
     */
    public List<CacheBean> listAll();

    /**
     * 是否启用缓存
     *
     * @return
     * @author blant
     * @date 2017年5月12日
     */
    public boolean isEnabled();

    /**
     * 加入系统标志缓存
     *
     * @param key
     * @return
     * @author blant
     * @date 2017年5月12日
     */
    public String addSys(String key);
}
