package com.ymt.mall.tiny.service;

import com.ymt.mall.tiny.common.api.CommonResult;

/**
 * Created by @author yangmingtian on 2020/1/20
 */
public interface UmsMemberService {

    CommonResult generatorAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone,String authCode);
}
