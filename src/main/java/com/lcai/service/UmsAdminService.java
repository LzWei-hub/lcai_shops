package com.lcai.service;

import com.lcai.domain.AdminUserDetails;
import com.lcai.domain.UmsResource;

import java.util.List;

/**
 * @auther LzWei
 * @description 后台用户管理Service
 * @date 2025/4/3
 * @github https://github.com/LzWei-hub
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取用户信息
     */
    AdminUserDetails getAdminByUsername(String username);

    /**
     * 获取所以权限列表
     */
    List<UmsResource> getResourceList();

    /**
     * 用户名密码登录
     */
    String login(String username, String password);
}
