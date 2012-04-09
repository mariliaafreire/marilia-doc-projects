/*
* generated by Xtext
*/
grammar InternalExpDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.project.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.project.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.project.services.ExpDSLGrammarAccess;

}

@parser::members {

 	private ExpDSLGrammarAccess grammarAccess;
 	
    public InternalExpDSLParser(TokenStream input, ExpDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected ExpDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getElementsExperimentElementParserRuleCall_0()); 
	    }
		lv_elements_0_0=ruleExperimentElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_0_0, 
        		"ExperimentElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleExperimentElement
entryRuleExperimentElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExperimentElementRule()); }
	 iv_ruleExperimentElement=ruleExperimentElement 
	 { $current=$iv_ruleExperimentElement.current; } 
	 EOF 
;

// Rule ExperimentElement
ruleExperimentElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='Process' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExperimentElementAccess().getProcessKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExperimentElementAccess().getProcessProcessParserRuleCall_0_1_0()); 
	    }
		lv_process_1_0=ruleProcess		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExperimentElementRule());
	        }
       		add(
       			$current, 
       			"process",
        		lv_process_1_0, 
        		"Process");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_2='end' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExperimentElementAccess().getEndKeyword_0_2());
    }
)(	otherlv_3='Experimental Plan' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExperimentElementAccess().getExperimentsExperimentalPlanParserRuleCall_1_1_0()); 
	    }
		lv_experiments_4_0=ruleExperimentalPlan		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExperimentElementRule());
	        }
       		add(
       			$current, 
       			"experiments",
        		lv_experiments_4_0, 
        		"ExperimentalPlan");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?(	otherlv_5='General Questions' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getExperimentElementAccess().getGeneralQuestionsKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExperimentElementAccess().getQuestionQuestionParserRuleCall_2_1_0()); 
	    }
		lv_question_6_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExperimentElementRule());
	        }
       		add(
       			$current, 
       			"question",
        		lv_question_6_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRuleProcess
entryRuleProcess returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProcessRule()); }
	 iv_ruleProcess=ruleProcess 
	 { $current=$iv_ruleProcess.current; } 
	 EOF 
;

// Rule Process
ruleProcess returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_name_0_0=RULE_STRING
		{
			newLeafNode(lv_name_0_0, grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProcessRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"STRING");
	    }

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProcessAccess().getActivitiesActivityParserRuleCall_0_2_0()); 
	    }
		lv_activities_2_0=ruleActivity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProcessRule());
	        }
       		add(
       			$current, 
       			"activities",
        		lv_activities_2_0, 
        		"Activity");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_0_3());
    }
)(	otherlv_4='metrics' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getMetricsKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProcessAccess().getMetricsMetricsParserRuleCall_1_1_0()); 
	    }
		lv_metrics_5_0=ruleMetrics		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProcessRule());
	        }
       		add(
       			$current, 
       			"metrics",
        		lv_metrics_5_0, 
        		"Metrics");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='end' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getEndKeyword_1_2());
    }
)?(	otherlv_7='Specific Questions' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getSpecificQuestionsKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProcessAccess().getQuestionQuestionParserRuleCall_2_1_0()); 
	    }
		lv_question_8_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProcessRule());
	        }
       		add(
       			$current, 
       			"question",
        		lv_question_8_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9='end' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getEndKeyword_2_2());
    }
)?)
;





// Entry rule entryRuleActivity
entryRuleActivity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActivityRule()); }
	 iv_ruleActivity=ruleActivity 
	 { $current=$iv_ruleActivity.current; } 
	 EOF 
;

// Rule Activity
ruleActivity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Activity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
    }
(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)(
(
		lv_next_3_0=RULE_ID
		{
			newLeafNode(lv_next_3_0, grammarAccess.getActivityAccess().getNextIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"next",
        		lv_next_3_0, 
        		"ID");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getRoleRoleParserRuleCall_4_0()); 
	    }
		lv_role_4_0=ruleRole		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		add(
       			$current, 
       			"role",
        		lv_role_4_0, 
        		"Role");
	        afterParserOrEnumRuleCall();
	    }

)
)*(	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getTasksTaskParserRuleCall_5_1_0()); 
	    }
		lv_tasks_6_0=ruleTask		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		add(
       			$current, 
       			"tasks",
        		lv_tasks_6_0, 
        		"Task");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_2());
    }
)?)
;





// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	 iv_ruleTask=ruleTask 
	 { $current=$iv_ruleTask.current; } 
	 EOF 
;

// Rule Task
ruleTask returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Task' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTaskRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRoleRule()); }
	 iv_ruleRole=ruleRole 
	 { $current=$iv_ruleRole.current; } 
	 EOF 
;

// Rule Role
ruleRole returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Role' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRoleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleExperimentalPlan
entryRuleExperimentalPlan returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExperimentalPlanRule()); }
	 iv_ruleExperimentalPlan=ruleExperimentalPlan 
	 { $current=$iv_ruleExperimentalPlan.current; } 
	 EOF 
;

// Rule ExperimentalPlan
ruleExperimentalPlan returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Design' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExperimentalPlanAccess().getDesignKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getExperimentalPlanAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExperimentalPlanRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='type' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExperimentalPlanAccess().getTypeKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_3_0()); 
	    }
		lv_type_3_0=ruleDesignType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"DesignType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_5_0()); 
	    }
		lv_factor_5_0=ruleFactor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
	        }
       		add(
       			$current, 
       			"factor",
        		lv_factor_5_0, 
        		"Factor");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleFactor
entryRuleFactor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFactorRule()); }
	 iv_ruleFactor=ruleFactor 
	 { $current=$iv_ruleFactor.current; } 
	 EOF 
;

// Rule Factor
ruleFactor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Factor' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getFactorKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFactorAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFactorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_3_0()); 
	    }
		lv_level_3_0=ruleLevels		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFactorRule());
	        }
       		add(
       			$current, 
       			"level",
        		lv_level_3_0, 
        		"Levels");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleLevels
entryRuleLevels returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLevelsRule()); }
	 iv_ruleLevels=ruleLevels 
	 { $current=$iv_ruleLevels.current; } 
	 EOF 
;

// Rule Levels
ruleLevels returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Level' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLevelsAccess().getLevelKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getLevelsAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLevelsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleMetrics
entryRuleMetrics returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMetricsRule()); }
	 iv_ruleMetrics=ruleMetrics 
	 { $current=$iv_ruleMetrics.current; } 
	 EOF 
;

// Rule Metrics
ruleMetrics returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMetricsAccess().getActivityMetricParserRuleCall_0()); 
    }
    this_ActivityMetric_0=ruleActivityMetric
    { 
        $current = $this_ActivityMetric_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMetricsAccess().getTaskMetricParserRuleCall_1()); 
    }
    this_TaskMetric_1=ruleTaskMetric
    { 
        $current = $this_TaskMetric_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleActivityMetric
entryRuleActivityMetric returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActivityMetricRule()); }
	 iv_ruleActivityMetric=ruleActivityMetric 
	 { $current=$iv_ruleActivityMetric.current; } 
	 EOF 
;

// Rule ActivityMetric
ruleActivityMetric returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Metric' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getActivityMetricAccess().getMetricKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getActivityMetricAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='relates' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getActivityMetricAccess().getRelatesKeyword_2());
    }
(
(
		lv_processName_3_0=RULE_STRING
		{
			newLeafNode(lv_processName_3_0, grammarAccess.getActivityMetricAccess().getProcessNameSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityMetricRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"processName",
        		lv_processName_3_0, 
        		"STRING");
	    }

)
)*	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getActivityMetricAccess().getLeftCurlyBracketKeyword_4());
    }
(	otherlv_5='description' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getActivityMetricAccess().getDescriptionKeyword_5_0());
    }
(
(
		lv_description_6_0=RULE_STRING
		{
			newLeafNode(lv_description_6_0, grammarAccess.getActivityMetricAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_6_0, 
        		"STRING");
	    }

)
))(	otherlv_7='type' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getActivityMetricAccess().getTypeKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityMetricAccess().getTypeMetricTypeEnumRuleCall_6_1_0()); 
	    }
		lv_type_8_0=ruleMetricType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityMetricRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_8_0, 
        		"MetricType");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_9='form' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getActivityMetricAccess().getFormKeyword_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityMetricAccess().getFormColectTypeEnumRuleCall_7_1_0()); 
	    }
		lv_form_10_0=ruleColectType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityMetricRule());
	        }
       		set(
       			$current, 
       			"form",
        		lv_form_10_0, 
        		"ColectType");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_11='id' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getActivityMetricAccess().getIdKeyword_8_0());
    }
(
(
		lv_id_12_0=RULE_STRING
		{
			newLeafNode(lv_id_12_0, grammarAccess.getActivityMetricAccess().getIdSTRINGTerminalRuleCall_8_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_12_0, 
        		"STRING");
	    }

)
))(	otherlv_13='unit' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getActivityMetricAccess().getUnitKeyword_9_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityMetricAccess().getUnitMetricUnitEnumRuleCall_9_1_0()); 
	    }
		lv_unit_14_0=ruleMetricUnit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityMetricRule());
	        }
       		set(
       			$current, 
       			"unit",
        		lv_unit_14_0, 
        		"MetricUnit");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_15='activityBegin' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getActivityMetricAccess().getActivityBeginKeyword_10_0());
    }
(
(
		lv_activityBegin_16_0=RULE_STRING
		{
			newLeafNode(lv_activityBegin_16_0, grammarAccess.getActivityMetricAccess().getActivityBeginSTRINGTerminalRuleCall_10_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"activityBegin",
        		lv_activityBegin_16_0, 
        		"STRING");
	    }

)
))(	otherlv_17='activityEnd' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getActivityMetricAccess().getActivityEndKeyword_11_0());
    }
(
(
		lv_activityEnd_18_0=RULE_STRING
		{
			newLeafNode(lv_activityEnd_18_0, grammarAccess.getActivityMetricAccess().getActivityEndSTRINGTerminalRuleCall_11_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"activityEnd",
        		lv_activityEnd_18_0, 
        		"STRING");
	    }

)
))	otherlv_19='}' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getActivityMetricAccess().getRightCurlyBracketKeyword_12());
    }
)
;





// Entry rule entryRuleTaskMetric
entryRuleTaskMetric returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTaskMetricRule()); }
	 iv_ruleTaskMetric=ruleTaskMetric 
	 { $current=$iv_ruleTaskMetric.current; } 
	 EOF 
;

// Rule TaskMetric
ruleTaskMetric returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Metric' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTaskMetricAccess().getMetricKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTaskMetricAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTaskMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='relates' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTaskMetricAccess().getRelatesKeyword_2());
    }
(
(
		lv_processName_3_0=RULE_STRING
		{
			newLeafNode(lv_processName_3_0, grammarAccess.getTaskMetricAccess().getProcessNameSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTaskMetricRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"processName",
        		lv_processName_3_0, 
        		"STRING");
	    }

)
)*	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTaskMetricAccess().getLeftCurlyBracketKeyword_4());
    }
(	otherlv_5='description' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTaskMetricAccess().getDescriptionKeyword_5_0());
    }
(
(
		lv_description_6_0=RULE_STRING
		{
			newLeafNode(lv_description_6_0, grammarAccess.getTaskMetricAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTaskMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_6_0, 
        		"STRING");
	    }

)
))(	otherlv_7='type' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTaskMetricAccess().getTypeKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTaskMetricAccess().getTypeMetricTypeEnumRuleCall_6_1_0()); 
	    }
		lv_type_8_0=ruleMetricType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTaskMetricRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_8_0, 
        		"MetricType");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_9='form' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getTaskMetricAccess().getFormKeyword_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTaskMetricAccess().getFormColectTypeEnumRuleCall_7_1_0()); 
	    }
		lv_form_10_0=ruleColectType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTaskMetricRule());
	        }
       		set(
       			$current, 
       			"form",
        		lv_form_10_0, 
        		"ColectType");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_11='id' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getTaskMetricAccess().getIdKeyword_8_0());
    }
(
(
		lv_id_12_0=RULE_STRING
		{
			newLeafNode(lv_id_12_0, grammarAccess.getTaskMetricAccess().getIdSTRINGTerminalRuleCall_8_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTaskMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_12_0, 
        		"STRING");
	    }

)
))(	otherlv_13='unit' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getTaskMetricAccess().getUnitKeyword_9_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTaskMetricAccess().getUnitMetricUnitEnumRuleCall_9_1_0()); 
	    }
		lv_unit_14_0=ruleMetricUnit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTaskMetricRule());
	        }
       		set(
       			$current, 
       			"unit",
        		lv_unit_14_0, 
        		"MetricUnit");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_15='activities' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getTaskMetricAccess().getActivitiesKeyword_10_0());
    }
(
(
		lv_activities_16_0=RULE_STRING
		{
			newLeafNode(lv_activities_16_0, grammarAccess.getTaskMetricAccess().getActivitiesSTRINGTerminalRuleCall_10_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTaskMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"activities",
        		lv_activities_16_0, 
        		"STRING");
	    }

)
))	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getTaskMetricAccess().getRightCurlyBracketKeyword_11());
    }
)
;







// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Question' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='description' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getDescriptionKeyword_3_0());
    }
(
(
		lv_description_4_0=RULE_STRING
		{
			newLeafNode(lv_description_4_0, grammarAccess.getQuestionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_4_0, 
        		"STRING");
	    }

)
))(	otherlv_5='type' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getTypeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_4_1_0()); 
	    }
		lv_type_6_0=ruleAnswerType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_6_0, 
        		"AnswerType");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_7='id' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getIdKeyword_5_0());
    }
(
(
		lv_id_8_0=RULE_ID
		{
			newLeafNode(lv_id_8_0, grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_8_0, 
        		"ID");
	    }

)
))(	otherlv_9='required' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getQuestionAccess().getRequiredKeyword_6_0());
    }
(
(
		lv_req_10_0=RULE_INT
		{
			newLeafNode(lv_req_10_0, grammarAccess.getQuestionAccess().getReqINTTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"req",
        		lv_req_10_0, 
        		"INT");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_7_0()); 
	    }
		lv_alternatives_11_0=ruleAlternatives		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionRule());
	        }
       		add(
       			$current, 
       			"alternatives",
        		lv_alternatives_11_0, 
        		"Alternatives");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleAlternatives
entryRuleAlternatives returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAlternativesRule()); }
	 iv_ruleAlternatives=ruleAlternatives 
	 { $current=$iv_ruleAlternatives.current; } 
	 EOF 
;

// Rule Alternatives
ruleAlternatives returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_description_0_0=RULE_STRING
		{
			newLeafNode(lv_description_0_0, grammarAccess.getAlternativesAccess().getDescriptionSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAlternativesRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_0_0, 
        		"STRING");
	    }

)
)
;





// Rule DesignType
ruleDesignType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='CRD \u2013 Completely Randomized Design' 
	{
        $current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='RCBD \u2013 Randomized Complete Block Design' 
	{
        $current = grammarAccess.getDesignTypeAccess().getRCDBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCDBEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='LS \u2013 Latin Square' 
	{
        $current = grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 
    }
));



// Rule AnswerType
ruleAnswerType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='ComboBox' 
	{
        $current = grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='CheckBoxes' 
	{
        $current = grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='OptionButtons' 
	{
        $current = grammarAccess.getAnswerTypeAccess().getOptionButtonsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getAnswerTypeAccess().getOptionButtonsEnumLiteralDeclaration_2()); 
    }
));



// Rule MetricType
ruleMetricType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='hardData' 
	{
        $current = grammarAccess.getMetricTypeAccess().getHardDataEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getHardDataEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='softData' 
	{
        $current = grammarAccess.getMetricTypeAccess().getSoftDataEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMetricTypeAccess().getSoftDataEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='normalizedData' 
	{
        $current = grammarAccess.getMetricTypeAccess().getNormalizedDataEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMetricTypeAccess().getNormalizedDataEnumLiteralDeclaration_2()); 
    }
));



// Rule ColectType
ruleColectType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='continuous' 
	{
        $current = grammarAccess.getColectTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getColectTypeAccess().getContinuousEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='intercalated' 
	{
        $current = grammarAccess.getColectTypeAccess().getIntercalatedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getColectTypeAccess().getIntercalatedEnumLiteralDeclaration_1()); 
    }
));



// Rule MetricUnit
ruleMetricUnit returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='minutes' 
	{
        $current = grammarAccess.getMetricUnitAccess().getMinutesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMetricUnitAccess().getMinutesEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='uc' 
	{
        $current = grammarAccess.getMetricUnitAccess().getUcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMetricUnitAccess().getUcEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

