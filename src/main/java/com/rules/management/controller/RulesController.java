package com.rules.management.controller;

import com.rules.management.entity.RuleEntity;
import com.rules.management.service.RulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RulesController Class
 *
 * @author zeyuhuang
 * @date 2018/8/1
 */

@RestController
@RequestMapping("/rules")
@CrossOrigin(origins = "*", maxAge = 3600)
public class RulesController {

    private RulesService rulesService;

    @Autowired
    public void setRulesService(RulesService rulesService) {
        this.rulesService = rulesService;
    }


    @GetMapping("/allRules")
    public List<RuleEntity> getAllRulesByProjectId(@RequestParam("projectId") String projectId) {

        System.out.println(rulesService.getAllRulesByProjectId(projectId));
        return rulesService.getAllRulesByProjectId(projectId);
    }

    @GetMapping("/rule")
    public RuleEntity getRule(@RequestParam("ruleId") String ruleId) {
        return rulesService.getRule(ruleId);
    }

    @PostMapping("/rule")
    public String createOrUpdateRule(@RequestParam("projectId") String projectId,
                                     @RequestParam("ruleId") String ruleId,
                                     @RequestParam("ruleType") String ruleType,
                                     @RequestParam("ruleTypeId") String ruleTypeId,

                                     @RequestParam("createTime") String createTime,

                                     @RequestParam("ruleName") String ruleName,
                                     @RequestParam("detail") String details,
                                     @RequestParam("isAuto") boolean isAuto) {
        RuleEntity ruleEntity = new RuleEntity();
        ruleEntity.setProjectId(projectId);
        ruleEntity.setRuleId(ruleId);
        ruleEntity.setRuleType(ruleType);
        ruleEntity.setRuleTypeId(ruleTypeId);

        ruleEntity.setCreateTime(createTime);

        ruleEntity.setRuleName(ruleName);
        ruleEntity.setDetails(details);
        ruleEntity.setAuto(isAuto);

        if (null == rulesService.getRule(ruleId)) {
            rulesService.createRule(ruleEntity);
            return "create successfully";

        } else {
            rulesService.updateRule(ruleEntity);
            return "update successfully";
        }
    }

    @PostMapping("/ruleDeletion")
    public String removeRule(@RequestParam("ruleId") String ruleId){
        if (null == rulesService.getRule(ruleId)) {
            return "rule does not exist";
        } else {
            rulesService.removeRule(ruleId);
            return "success";
        }
    }

    @PostMapping("/count")
    public String addCount(@RequestParam("ruleId") String ruleId) {
        if (null == rulesService.getRule(ruleId)) {
            return "rule does not exist";
        } else {
            rulesService.addOneCount(ruleId);
            return "success";
        }
    }

    @PostMapping("/workingState")
    public String setWorking(@RequestParam("ruleId") String ruleId,
                             @RequestParam("workingState") boolean isWorking) {
        System.out.println(ruleId);
        if (null == rulesService.getRule(ruleId)) {
            return "rule does not exist";
        } else {
            rulesService.updateWorking(ruleId, isWorking);
            return "success";
        }
    }


}
