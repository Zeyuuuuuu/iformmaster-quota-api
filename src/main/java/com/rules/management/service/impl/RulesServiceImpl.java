package com.rules.management.service.impl;

import com.rules.management.dao.RuleDao;
import com.rules.management.entity.RuleEntity;
import com.rules.management.service.RulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * RulesServiceImpl class
 *
 * @author zeyuhuang
 * @date 2018/7/31
 */
@Service("rulesService")
public class RulesServiceImpl implements RulesService {

    private final RuleDao ruleDao;

    @Autowired
    public RulesServiceImpl(RuleDao ruleDao) {
        this.ruleDao = ruleDao;
    }

    @Override
    public List<RuleEntity> getAllRulesByProjectId(String projectId) {
        return ruleDao.getAllRulesByProjectId(projectId);
    }

    @Override
    public RuleEntity getRule(String ruleId) {
        return ruleDao.getRule(ruleId);
    }

    @Override
    public void createRule(RuleEntity ruleEntity) {
        ruleDao.createRule(ruleEntity);
    }

    @Override
    public void removeRule(String ruleId) {
        ruleDao.removeRule(ruleId);
    }

    @Override
    public void updateRule(RuleEntity ruleEntity) {
        ruleDao.updateRule(ruleEntity);
    }

    @Override
    public void addOneCount(String ruleId) {
        ruleDao.addOneCount(ruleId);
    }

    @Override
    public void updateWorking(String ruleId, boolean isWorking) {
        ruleDao.updateWorking(ruleId, isWorking);
    }

}
