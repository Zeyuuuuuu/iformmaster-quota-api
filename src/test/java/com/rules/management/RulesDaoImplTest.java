package com.rules.management;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rules.management.dao.RuleDao;
import com.rules.management.entity.RuleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ManagementApplication.class)
public class RulesDaoImplTest {
    @Autowired
    private RuleDao ruleDao;


//    @Test
//    public void getAllRulesByProjectId() {
//        List<RuleEntity> ruleEntityList = ruleDao.getAllRulesByProjectId("P861533112012782");
//
//        for (RuleEntity ruleEntity : ruleEntityList)
//            System.out.println(JSONObject.toJSONString(ruleEntity));
//    }
//
//    @Test
//    public void getRuleByRuleName() {
//        RuleEntity ruleEntity = ruleDao.getRuleByRuleName("甄别样本1", "P861533112012782");
//        System.out.println(ruleEntity.getRuleType());
//        System.out.println(JSONObject.toJSON(ruleEntity));
//    }
//
//    @Test
//    public void createRule() {
//        RuleEntity ruleEntity = new RuleEntity();
//        ruleEntity.setRuleName("甄别样本1");
//        ruleEntity.setRuleType("甄别样本");
//        ruleEntity.setCreateTime("2008/07/12");
//        ruleEntity.setCount(0);
//        ruleEntity.setWorking(false);
//        ruleDao.createRule(ruleEntity);
//
//
//        ruleEntity = new RuleEntity();
//        ruleEntity.setRuleName("配额已满1");
//        ruleEntity.setRuleType("溢出样本");
//        ruleEntity.setCreateTime("2008/07/01");
//        ruleEntity.setCount(0);
//        ruleEntity.setWorking(false);
//        ruleDao.createRule(ruleEntity);
//
//        ruleEntity = new RuleEntity();
//        ruleEntity.setRuleName("配额已满2");
//        ruleEntity.setRuleType("溢出样本");
//        ruleEntity.setCreateTime("2008/07/02");
//        ruleEntity.setCount(0);
//        ruleEntity.setWorking(false);
//        ruleDao.createRule(ruleEntity);
//
//        ruleEntity = new RuleEntity();
//        ruleEntity.setRuleName("配额已满3");
//        ruleEntity.setRuleType("溢出样本");
//        ruleEntity.setCreateTime("2008/07/03");
//        ruleEntity.setCount(0);
//        ruleEntity.setWorking(false);
//        ruleDao.createRule(ruleEntity);
//
//        ruleEntity = new RuleEntity();
//        ruleEntity.setRuleName("配额已满4");
//        ruleEntity.setRuleType("溢出样本");
//        ruleEntity.setCreateTime("2008/07/04");
//        ruleEntity.setCount(0);
//        ruleEntity.setWorking(false);
//        ruleDao.createRule(ruleEntity);
//
//        ruleEntity = new RuleEntity();
//        ruleEntity.setRuleName("配额已满5");
//        ruleEntity.setRuleType("溢出样本");
//        ruleEntity.setCreateTime("2008/07/05");
//        ruleEntity.setCount(0);
//        ruleEntity.setWorking(false);
//        ruleDao.createRule(ruleEntity);
//
//        ruleEntity = new RuleEntity();
//        ruleEntity.setRuleName("配额已满6");
//        ruleEntity.setRuleType("溢出样本");
//        ruleEntity.setCreateTime("2008/07/06");
//        ruleEntity.setCount(0);
//        ruleEntity.setWorking(false);
//
//        ruleDao.createRule(ruleEntity);
//    }
//
//
//    @Test
//    public void removeRule() {
//        ruleDao.removeRule("只会666", "P861533112012782");
//    }
//
//    @Test
//    public void updateRule() {
//
//        RuleEntity ruleEntity = new RuleEntity();
//        ruleEntity.setRuleName("乱鸡儿写");
//        ruleEntity.setRuleType("文本异常");
//        ruleEntity.setCreateTime("2018/08/01");
//        ruleEntity.setCount(0);
//        ruleEntity.setWorking(false);
//        ruleDao.updateRule("配额已满3", ruleEntity);
//    }
//
//    @Test
//    public void addOneCountById() {
//        ruleDao.addOneCountByRuleName("乱鸡儿写", "P861533112012782");
//    }
//
//    @Test
//    public void updateWorkingById() {
//        ruleDao.updateWorkingByRuleName("乱鸡儿写", true, "P861533112012782");
//    }
}
