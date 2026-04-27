package com.vermouth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vermouth.entity.VoucherOrder;
import com.vermouth.mapper.VoucherOrderMapper;
import com.vermouth.service.IVoucherOrderService;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class VoucherOrderServiceImpl extends ServiceImpl<VoucherOrderMapper, VoucherOrder> implements IVoucherOrderService {

}
