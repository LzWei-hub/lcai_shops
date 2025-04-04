package com.lcai.service;

import com.lcai.common.api.CommonResult;
import com.lcai.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @auther LzWei
 * @description 前台订单管理Service
 * @date 2025/4/3
 * @github https://github.com/LzWei-hub
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
