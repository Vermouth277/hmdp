package com.vermouth.utils;

import jakarta.annotation.Resource;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

@Component
public class BloomFilterUtil {

    @Resource
    private RedissonClient  redissonClient;

    /**
     * 初始化布隆过滤器
     * @param key 过滤器名称
     * @param expectedInsertions 预计插入多少数据
     * @param falseProbability 误判率 0.01=1%
     */
    public <T> void init(String key, long expectedInsertions, double falseProbability ) {
        RBloomFilter<T>  bloomFilter = redissonClient.getBloomFilter(key);
        bloomFilter.tryInit(expectedInsertions, falseProbability);
    }

    /**
     * 添加元素
     * @param key 过滤器名称
     * @param value 插入的元素
     * @param <T>
     */
    public <T> void add(String key, T value) {
        RBloomFilter<T>  bloomFilter = redissonClient.getBloomFilter(key);
        bloomFilter.add(value);
    }

    /**
     * 判断是否存在
     * @param key
     * @param value
     * @return false = 一定不存在  true = 可能存在
     * @param <T>
     */
    public <T> boolean contains(String key, T value) {
        RBloomFilter<T>  bloomFilter = redissonClient.getBloomFilter(key);
        return bloomFilter.contains(value);
    }
}
