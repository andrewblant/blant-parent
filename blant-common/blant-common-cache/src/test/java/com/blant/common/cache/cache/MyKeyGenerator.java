package com.blant.common.cache.cache;

import com.blant.common.cache.constants.CacheScope;
import com.blant.common.cache.parser.IKeyGenerator;
import com.blant.common.cache.parser.IUserKeyGenerator;

/**
 * ${DESCRIPTION}
 *
 * @author blant
 * @create 2017-05-22 14:05
 */
public class MyKeyGenerator extends IKeyGenerator {
    @Override
    public IUserKeyGenerator getUserKeyGenerator() {
        return null;
    }

    @Override
    public String buildKey(String key, CacheScope scope, Class<?>[] parameterTypes, Object[] arguments) {
        return "myKey_"+arguments[0];
    }
}
