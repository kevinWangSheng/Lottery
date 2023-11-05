package com.kevin.domain.award.repository;


import com.baomidou.mybatisplus.extension.service.IService;
import com.kevin.lottery.infrastructure.po.Award;

/**
* @author wang sheng hui
* @description 针对表【award(奖品配置)】的数据库操作Service
* @createDate 2023-11-04 16:39:22
*/
public interface AwardRepository extends IService<Award> {

    Award getByAwardId(String awardId);

    // TODO 对分库分表中的用户中奖纪录操作
}