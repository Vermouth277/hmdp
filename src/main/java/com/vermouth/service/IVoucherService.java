package com.vermouth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vermouth.dto.Result;
import com.vermouth.entity.Voucher;

/**
 *  服务类
 */
public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
