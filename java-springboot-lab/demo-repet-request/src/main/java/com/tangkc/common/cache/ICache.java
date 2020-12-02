package com.tangkc.common.cache;

/**
 * 缓存接口
 */
public interface ICache {
    String get(String key);
    boolean containsKey(String key);
    void put(String key, String value);
    void put(String key, String value,Long expireTime);
    void delete(String key);
}
