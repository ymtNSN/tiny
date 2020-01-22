package com.ymt.mall.tiny.service;

import com.ymt.mall.tiny.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * 会员浏览记录管理Service
 * Created by @author yangmingtian on 2020/1/22
 */
public interface MemberReadHistoryService {

    /**
     * 描述: 生成浏览记录
     *
     * @param memberReadHistory memberReadHistory
     * @return {@link int}
     * @author yangmingtian
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 描述: 批量删除浏览记录
     *
     * @param ids ids
     * @return {@link int}
     * @author yangmingtian
     */
    int delete(List<String> ids);

    /**
     * 描述: 获取用户浏览历史记录
     *
     * @param memberId memberId
     * @return {@link List< MemberReadHistory>}
     * @author yangmingtian
     */
    List<MemberReadHistory> list(Long memberId);
}
