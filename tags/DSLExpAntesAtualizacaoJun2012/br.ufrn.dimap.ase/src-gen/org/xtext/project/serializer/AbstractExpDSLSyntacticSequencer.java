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
	protected AbstractElementAlias match_Activity_InKeyword_2_0_q;
	protected AbstractElementAlias match_Activity_OutKeyword_3_0_q;
	protected AbstractElementAlias match_Activity___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q;
	protected AbstractElementAlias match_ExperimentElement_ExperimentalPlanKeyword_4_0_q;
	protected AbstractElementAlias match_ExperimentElement_GeneralQuestionsKeyword_5_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExpDSLGrammarAccess) access;
		match_Activity_InKeyword_2_0_q = new TokenAlias(true, false, grammarAccess.getActivityAccess().getInKeyword_2_0());
		match_Activity_OutKeyword_3_0_q = new TokenAlias(true, false, grammarAccess.getActivityAccess().getOutKeyword_3_0());
		match_Activity___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7_2()));
		match_ExperimentElement_ExperimentalPlanKeyword_4_0_q = new TokenAlias(true, false, grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_4_0());
		match_ExperimentElement_GeneralQuestionsKeyword_5_0_q = new TokenAlias(true, false, grammarAccess.getExperimentElementAccess().getGeneralQuestionsKeyword_5_0());
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
			if(match_Activity_InKeyword_2_0_q.equals(syntax))
				emit_Activity_InKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Activity_OutKeyword_3_0_q.equals(syntax))
				emit_Activity_OutKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Activity___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q.equals(syntax))
				emit_Activity___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentElement_ExperimentalPlanKeyword_4_0_q.equals(syntax))
				emit_ExperimentElement_ExperimentalPlanKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentElement_GeneralQuestionsKeyword_5_0_q.equals(syntax))
				emit_ExperimentElement_GeneralQuestionsKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'in'?
	 */
	protected void emit_Activity_InKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'out'?
	 */
	protected void emit_Activity_OutKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Activity___LeftCurlyBracketKeyword_7_0_RightCurlyBracketKeyword_7_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'General Questions'?
	 */
	protected void emit_ExperimentElement_GeneralQuestionsKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
