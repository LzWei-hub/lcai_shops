package com.lcai.service;

import com.lcai.common.api.CommonResult;

/**
 * @auther LzWei
 * @description 会员管理Service
 * @date 2025/4/3
 * @github https://github.com/LzWei-hub
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
