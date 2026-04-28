package com.vermouth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vermouth.dto.Result;
import com.vermouth.entity.Shop;

/**
 *  服务类
 */
public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);
}
