package com.rules.management.dao;

import com.rules.management.entity.RuleEntity;

import java.util.List;

/**
 * RulesDao Interface
 *
 * @author zeyuhuang
 * @date 2018/7/31
 */
public interface RuleDao {


    /**
     * get all rules
     *
     * @param projectId 项目ID
     * @return List<RuleEntity> 规则实体表
     */
    List<RuleEntity> getAllRulesByProjectId(String projectId);

    /**
     * get rule by ruleName
     *
     * @param ruleId 规则id
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
     * removes rule
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
     * add one to count
     *
     * @param ruleId 规则名称
     */
    void addOneCount(String ruleId);


    /**
     * update working state by ruleName
     *
     * @param ruleId  规则名称
     * @param isWorking 工作状态
     */
    void updateWorking(String ruleId, boolean isWorking);


}
