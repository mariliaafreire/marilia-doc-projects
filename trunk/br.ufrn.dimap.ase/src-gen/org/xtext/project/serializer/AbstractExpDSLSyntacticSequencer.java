package org.xtext.project.serializer;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.project.services.ExpDSLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractExpDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExpDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExperimentElement_ExperimentalPlanKeyword_1_0_q;
	protected AbstractElementAlias match_Process___MetricsKeyword_1_0_EndKeyword_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExpDSLGrammarAccess) access;
		match_ExperimentElement_ExperimentalPlanKeyword_1_0_q = new TokenAlias(true, false, grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_1_0());
		match_Process___MetricsKeyword_1_0_EndKeyword_1_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getProcessAccess().getMetricsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getProcessAccess().getEndKeyword_1_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_ExperimentElement_ExperimentalPlanKeyword_1_0_q.equals(transition.getAmbiguousSyntax()))
			emit_ExperimentElement_ExperimentalPlanKeyword_1_0_q(semanticObject, transition, fromNode, toNode);
		else if(match_Process___MetricsKeyword_1_0_EndKeyword_1_2__q.equals(transition.getAmbiguousSyntax()))
			emit_Process___MetricsKeyword_1_0_EndKeyword_1_2__q(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     'Experimental Plan'?
	 */
	protected void emit_ExperimentElement_ExperimentalPlanKeyword_1_0_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('metrics' 'end')?
	 */
	protected void emit_Process___MetricsKeyword_1_0_EndKeyword_1_2__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
