package org.xtext.project.serializer;

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
import org.xtext.project.services.ExpDSLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractExpDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExpDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Activity___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q;
	protected AbstractElementAlias match_ExperimentElement_ExperimentalPlanKeyword_4_0_q;
	protected AbstractElementAlias match_ExperimentElement_QuestionnairesKeyword_5_0_q;
	protected AbstractElementAlias match_Question_AlternativesKeyword_5_0_q;
	protected AbstractElementAlias match_Questionnaire_RelatesKeyword_2_0_q;
	protected AbstractElementAlias match_Task_ArtefactsKeyword_4_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExpDSLGrammarAccess) access;
		match_Activity___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_2()));
		match_ExperimentElement_ExperimentalPlanKeyword_4_0_q = new TokenAlias(true, false, grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_4_0());
		match_ExperimentElement_QuestionnairesKeyword_5_0_q = new TokenAlias(true, false, grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_5_0());
		match_Question_AlternativesKeyword_5_0_q = new TokenAlias(true, false, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
		match_Questionnaire_RelatesKeyword_2_0_q = new TokenAlias(true, false, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
		match_Task_ArtefactsKeyword_4_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getArtefactsKeyword_4_0());
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
			if(match_Activity___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q.equals(syntax))
				emit_Activity___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentElement_ExperimentalPlanKeyword_4_0_q.equals(syntax))
				emit_ExperimentElement_ExperimentalPlanKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentElement_QuestionnairesKeyword_5_0_q.equals(syntax))
				emit_ExperimentElement_QuestionnairesKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Question_AlternativesKeyword_5_0_q.equals(syntax))
				emit_Question_AlternativesKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Questionnaire_RelatesKeyword_2_0_q.equals(syntax))
				emit_Questionnaire_RelatesKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_ArtefactsKeyword_4_0_q.equals(syntax))
				emit_Task_ArtefactsKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Activity___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Experimental Plan'?
	 */
	protected void emit_ExperimentElement_ExperimentalPlanKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Task_ArtefactsKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
