package com.ymt.mall.tiny.nosql.mongodb.repository;

import com.ymt.mall.tiny.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 会员商品浏览历史Repository
 *
 * @author yangmingtian
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {

    /**
     * 描述: 根据会员id按时间倒序获取浏览记录
     *
     * @param memberId memberId
     * @return {@link List< MemberReadHistory>}
     * @author yangmingtian
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
