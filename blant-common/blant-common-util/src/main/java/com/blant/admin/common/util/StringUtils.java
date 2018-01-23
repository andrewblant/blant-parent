package com.blant.admin.common.util;

/**
 * 字符串工具类
 *
 * @author blant
 * @create 2018/1/18 15:42
 */
public class StringUtils {

    /**
     * 判断是否为null或者为空
     *
     * @param cs 参数
     * @return
     */
    public static boolean isNotBlank(CharSequence cs){
        return org.apache.commons.lang3.StringUtils.isNotBlank(cs);
    }
}
