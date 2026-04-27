package com.vermouth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vermouth.entity.Shop;
import com.vermouth.mapper.ShopMapper;
import com.vermouth.service.IShopService;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements IShopService {

}
