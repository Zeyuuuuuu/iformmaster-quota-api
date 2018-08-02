package com.rules.management.dao.impl;

import com.rules.management.dao.RuleDao;
import com.rules.management.entity.RuleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * RulesDaoImpl class
 *
 * @author zeyuhuang
 * @date 2018/7/31
 */
@Component
public class RuleDaoImpl implements RuleDao {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public RuleDaoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<RuleEntity> getAllRulesByProjectId(String projectId) {
        Query query = new Query(Criteria.where("projectId").is(projectId));
        return mongoTemplate.find(query,RuleEntity.class,"rules_collection");
    }

    @Override
    public RuleEntity getRule(String ruleId) {
        Query query = new Query(Criteria.where("ruleId").is(ruleId));
        return mongoTemplate.findOne(query, RuleEntity.class,"rules_collection");
    }

    @Override
    public void createRule(RuleEntity ruleEntity) {
        mongoTemplate.save(ruleEntity,"rules_collection");
    }

    @Override
    public void removeRule(String ruleId) {
        mongoTemplate.remove(getRule(ruleId),"rules_collection");
    }

    @Override
    public void updateRule(RuleEntity ruleEntity) {
        Query query = new Query(Criteria.where("ruleId").is(ruleEntity.getRuleId()));
        Update update = new Update();
        update.set("ruleName", ruleEntity.getRuleName());
        update.set("details", ruleEntity.getDetails());
        update.set("createTime", ruleEntity.getCreateTime());
        update.set("count", 0);
        update.set("isWorking", false);
        mongoTemplate.updateFirst(query, update, RuleEntity.class,"rules_collection");
    }

    @Override
    public void addOneCount(String ruleId) {
        Query query = new Query(Criteria.where("ruleId").is(ruleId));
        Update update = new Update();
        update.set("count", getRule(ruleId).getCount() +1);
        mongoTemplate.updateFirst(query, update, RuleEntity.class,"rules_collection");
    }

    @Override
    public void updateWorking(String ruleId, boolean isWorking) {
        Query query = new Query(Criteria.where("ruleId").is(ruleId));
        Update update = new Update();
        update.set("isWorking", isWorking);
        mongoTemplate.updateFirst(query, update, RuleEntity.class,"rules_collection");
    }

}
