package com.ymt.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by @author yangmingtian on 2020/1/19
 */
@Configuration
@MapperScan({"com.ymt.mall.tiny.mbg.mapper", "com.ymt.mall.tiny.dao"})
public class MyBatisConfig {
}
