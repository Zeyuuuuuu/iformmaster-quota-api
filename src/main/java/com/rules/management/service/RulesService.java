package com.rules.management.service;

import com.rules.management.entity.RuleEntity;

import java.util.List;


/**
 * RulesService Interface
 *
 * @author zeyuhuang
 * @date 2018/7/31
 */
public interface RulesService {

    /**
     * get all rules
     *
     * @param projectId 项目id
     * @return List<RulesEntity> 规则实体表
     */
    List<RuleEntity> getAllRulesByProjectId(String projectId);

    /**
     * get rule by id
     *
     * @param ruleId
     * @return RuleEntity 规则实体
     */
    RuleEntity getRule(String ruleId);

    /**
     * 创建新规则
     *
     * @param ruleEntity 规则实体
     */
    void createRule(RuleEntity ruleEntity);

    /**
     * remove rule by ruleName
     *
     * @param ruleId 规则名称
     */
    void removeRule(String ruleId);

    /**
     * 更改规则的 ruleName,Type,details,count置0
     *
     * @param ruleEntity 规则实体
     */
    void updateRule(RuleEntity ruleEntity);

    /**
     * add one to count by ruleName
     *
     * @param ruleId 规则id
     */
    void addOneCount(String ruleId);


    /**
     * update working state by ruleName
     *
     * @param ruleId  规则id
     * @param isWorking 工作状态
     */
    void updateWorking(String ruleId, boolean isWorking);

}
