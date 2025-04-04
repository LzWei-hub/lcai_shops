package com.lcai.nosql.mongodb.repository;


import com.lcai.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @auther LzWei
 * @description 会员商品浏览历史Repository
 * @date 2025/4/2
 * @github https://github.com/LzWei-hub
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {
    /**
     * 根据会员id按时间倒序获取浏览记录
     * @param memberId 会员id
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
