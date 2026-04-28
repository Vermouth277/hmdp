package com.vermouth.utils;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.vermouth.entity.Shop;
import com.vermouth.service.IShopService;
import com.vermouth.service.impl.ShopServiceImpl;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.vermouth.utils.RedisConstants.BLOOM_SHOP_KEY;

@Component
@Slf4j
public class ShopBloomInit {

    @Resource
    private IShopService shopService;

    @Resource
    private BloomFilterUtil bloomFilterUtil;

    @PostConstruct
    public void initShopBloomFilter() {
        log.info("商品布隆过滤器初始化中......");

        bloomFilterUtil.init(BLOOM_SHOP_KEY, 10000L, 0.01);

        LambdaQueryWrapper<Shop> wrapper = new LambdaQueryWrapper<>();
        wrapper.select(Shop::getId);

        List<Shop> shops = shopService.list(wrapper);

        for (Shop shop : shops) {
            bloomFilterUtil.add(BLOOM_SHOP_KEY, shop.getId());
        }

        log.info("布隆过滤器加载完成，共{}个商铺", shops.size());
    }

}
