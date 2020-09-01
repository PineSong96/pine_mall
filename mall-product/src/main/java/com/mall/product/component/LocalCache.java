package com.mall.product.component;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @vlog: My code, I understand
 * @desc: 本地二级缓存
 * @author: pine
 * @createDate: 2020/8/25
 * @version: 1.0
 */
@Component
public class LocalCache<T> {

    private Cache<String, T> localCache = null;

    @PostConstruct
    private void init() {
        localCache = CacheBuilder.newBuilder()
                //设置本地缓存容器的初始容量
                .initialCapacity(10)
                //设置本地缓存的最大容量
                .maximumSize(500)
                //设置写缓存后多少秒过期
                .expireAfterWrite(60, TimeUnit.SECONDS).build();
    }

    public void setLocalCache(String key, T object) {
        localCache.put(key, object);
    }

    public T get(String key) {
        return localCache.getIfPresent(key);
    }
}
