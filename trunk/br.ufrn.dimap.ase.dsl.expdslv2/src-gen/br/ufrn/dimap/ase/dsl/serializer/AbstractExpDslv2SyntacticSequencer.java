package br.ufrn.dimap.ase.dsl.serializer;

import br.ufrn.dimap.ase.dsl.services.ExpDslv2GrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractExpDslv2SyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExpDslv2GrammarAccess grammarAccess;
	protected AbstractElementAlias match_DataMetric_ArtefactKeyword_2_0_q;
	protected AbstractElementAlias match_DataMetric_QuestKeyword_3_0_q;
	protected AbstractElementAlias match_ExperimentElement_QuestionnairesKeyword_5_0_q;
	protected AbstractElementAlias match_ExperimentalPlan_ColonKeyword_12_1_a;
	protected AbstractElementAlias match_ExperimentalPlan_ColonKeyword_12_1_p;
	protected AbstractElementAlias match_Factor___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_Process_RoleKeyword_4_0_q;
	protected AbstractElementAlias match_Process_ToKeyword_2_0_q;
	protected AbstractElementAlias match_Question_AlternativesKeyword_5_0_q;
	protected AbstractElementAlias match_Questionnaire_RelatesKeyword_2_0_q;
	protected AbstractElementAlias match_Task_ArtefactsKeyword_8_0_q;
	protected AbstractElementAlias match_Task_QuestKeyword_9_0_q;
	protected AbstractElementAlias match_Task_RoleKeyword_5_0_q;
	protected AbstractElementAlias match_Task_ToKeyword_4_0_q;
	protected AbstractElementAlias match_Task_VarKeyword_7_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExpDslv2GrammarAccess) access;
		match_DataMetric_ArtefactKeyword_2_0_q = new TokenAlias(true, false, grammarAccess.getDataMetricAccess().getArtefactKeyword_2_0());
		match_DataMetric_QuestKeyword_3_0_q = new TokenAlias(true, false, grammarAccess.getDataMetricAccess().getQuestKeyword_3_0());
		match_ExperimentElement_QuestionnairesKeyword_5_0_q = new TokenAlias(true, false, grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_5_0());
		match_ExperimentalPlan_ColonKeyword_12_1_a = new TokenAlias(true, true, grammarAccess.getExperimentalPlanAccess().getColonKeyword_12_1());
		match_ExperimentalPlan_ColonKeyword_12_1_p = new TokenAlias(false, true, grammarAccess.getExperimentalPlanAccess().getColonKeyword_12_1());
		match_Factor___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_4_2()));
		match_Process_RoleKeyword_4_0_q = new TokenAlias(true, false, grammarAccess.getProcessAccess().getRoleKeyword_4_0());
		match_Process_ToKeyword_2_0_q = new TokenAlias(true, false, grammarAccess.getProcessAccess().getToKeyword_2_0());
		match_Question_AlternativesKeyword_5_0_q = new TokenAlias(true, false, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
		match_Questionnaire_RelatesKeyword_2_0_q = new TokenAlias(true, false, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
		match_Task_ArtefactsKeyword_8_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getArtefactsKeyword_8_0());
		match_Task_QuestKeyword_9_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getQuestKeyword_9_0());
		match_Task_RoleKeyword_5_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getRoleKeyword_5_0());
		match_Task_ToKeyword_4_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getToKeyword_4_0());
		match_Task_VarKeyword_7_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getVarKeyword_7_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_DataMetric_ArtefactKeyword_2_0_q.equals(syntax))
				emit_DataMetric_ArtefactKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DataMetric_QuestKeyword_3_0_q.equals(syntax))
				emit_DataMetric_QuestKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentElement_QuestionnairesKeyword_5_0_q.equals(syntax))
				emit_ExperimentElement_QuestionnairesKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentalPlan_ColonKeyword_12_1_a.equals(syntax))
				emit_ExperimentalPlan_ColonKeyword_12_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentalPlan_ColonKeyword_12_1_p.equals(syntax))
				emit_ExperimentalPlan_ColonKeyword_12_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Factor___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_Factor___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Process_RoleKeyword_4_0_q.equals(syntax))
				emit_Process_RoleKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Process_ToKeyword_2_0_q.equals(syntax))
				emit_Process_ToKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Question_AlternativesKeyword_5_0_q.equals(syntax))
				emit_Question_AlternativesKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Questionnaire_RelatesKeyword_2_0_q.equals(syntax))
				emit_Questionnaire_RelatesKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_ArtefactsKeyword_8_0_q.equals(syntax))
				emit_Task_ArtefactsKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_QuestKeyword_9_0_q.equals(syntax))
				emit_Task_QuestKeyword_9_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_RoleKeyword_5_0_q.equals(syntax))
				emit_Task_RoleKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_ToKeyword_4_0_q.equals(syntax))
				emit_Task_ToKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_VarKeyword_7_0_q.equals(syntax))
				emit_Task_VarKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'artefact'?
	 */
	protected void emit_DataMetric_ArtefactKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'quest'?
	 */
	protected void emit_DataMetric_QuestKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Questionnaires'?
	 */
	protected void emit_ExperimentElement_QuestionnairesKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'*
	 */
	protected void emit_ExperimentalPlan_ColonKeyword_12_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'+
	 */
	protected void emit_ExperimentalPlan_ColonKeyword_12_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Factor___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Role'?
	 */
	protected void emit_Process_RoleKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Process_ToKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Alternatives'?
	 */
	protected void emit_Question_AlternativesKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'relates'?
	 */
	protected void emit_Questionnaire_RelatesKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'artefacts'?
	 */
	protected void emit_Task_ArtefactsKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'quest'?
	 */
	protected void emit_Task_QuestKeyword_9_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Role'?
	 */
	protected void emit_Task_RoleKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Task_ToKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'var'?
	 */
	protected void emit_Task_VarKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
