package com.lcai.dto;

import lombok.Data;

/**
 * @auther LzWei
 * @description 生成订单时传入的参数
 * @date 2025/4/3
 * @github https://github.com/LzWei-hub
 */
@Data
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}
