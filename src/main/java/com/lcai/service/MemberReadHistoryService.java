package com.lcai.service;


import com.lcai.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @auther LzWei
 * @description 会员浏览记录管理Service
 * @date 2025/4/3
 * @github https://github.com/LzWei-hub
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
