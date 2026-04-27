package com.vermouth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vermouth.entity.ShopType;
import com.vermouth.mapper.ShopTypeMapper;
import com.vermouth.service.IShopTypeService;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {

}
