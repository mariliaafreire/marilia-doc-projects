package br.ufrn.dimap.ase.dsl.serializer;

import br.ufrn.dimap.ase.dsl.services.Expdslv3GrammarAccess;
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
public class AbstractExpdslv3SyntacticSequencer extends AbstractSyntacticSequencer {

	protected Expdslv3GrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExperimentElement_QuestionnairesKeyword_6_0_q;
	protected AbstractElementAlias match_ExperimentalDesign___AuthorshipKeyword_0_0_LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3__q;
	protected AbstractElementAlias match_ExperimentalDesign___ContextKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q;
	protected AbstractElementAlias match_ExperimentalDesign___KeywordsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q;
	protected AbstractElementAlias match_ExperimentalDesign___ResearchHypothesesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_ExperimentalDesign___ResearchQuestionsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_ExperimentalDesign___VariablesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_Process_RoleKeyword_4_0_q;
	protected AbstractElementAlias match_Process_ToKeyword_2_0_q;
	protected AbstractElementAlias match_Question_AlternativesKeyword_5_0_q;
	protected AbstractElementAlias match_Questionnaire_RelatesKeyword_2_0_q;
	protected AbstractElementAlias match_Task_ArtefactsKeyword_7_0_q;
	protected AbstractElementAlias match_Task_MetricsKeyword_8_0_q;
	protected AbstractElementAlias match_Task_RoleKeyword_5_0_q;
	protected AbstractElementAlias match_Task_ToKeyword_4_0_q;
	protected AbstractElementAlias match_Variable___RangeKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Expdslv3GrammarAccess) access;
		match_ExperimentElement_QuestionnairesKeyword_6_0_q = new TokenAlias(true, false, grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_6_0());
		match_ExperimentalDesign___AuthorshipKeyword_0_0_LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getAuthorshipKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_0_3()));
		match_ExperimentalDesign___ContextKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getContextKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_10_3()));
		match_ExperimentalDesign___KeywordsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getKeywordsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_2_3()));
		match_ExperimentalDesign___ResearchHypothesesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getResearchHypothesesKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_5_3()));
		match_ExperimentalDesign___ResearchQuestionsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getResearchQuestionsKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_4_3()));
		match_ExperimentalDesign___VariablesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getVariablesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_6_3()));
		match_Process_RoleKeyword_4_0_q = new TokenAlias(true, false, grammarAccess.getProcessAccess().getRoleKeyword_4_0());
		match_Process_ToKeyword_2_0_q = new TokenAlias(true, false, grammarAccess.getProcessAccess().getToKeyword_2_0());
		match_Question_AlternativesKeyword_5_0_q = new TokenAlias(true, false, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
		match_Questionnaire_RelatesKeyword_2_0_q = new TokenAlias(true, false, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
		match_Task_ArtefactsKeyword_7_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getArtefactsKeyword_7_0());
		match_Task_MetricsKeyword_8_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getMetricsKeyword_8_0());
		match_Task_RoleKeyword_5_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getRoleKeyword_5_0());
		match_Task_ToKeyword_4_0_q = new TokenAlias(true, false, grammarAccess.getTaskAccess().getToKeyword_4_0());
		match_Variable___RangeKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getVariableAccess().getRangeKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_3_3()));
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
			if(match_ExperimentElement_QuestionnairesKeyword_6_0_q.equals(syntax))
				emit_ExperimentElement_QuestionnairesKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentalDesign___AuthorshipKeyword_0_0_LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3__q.equals(syntax))
				emit_ExperimentalDesign___AuthorshipKeyword_0_0_LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentalDesign___ContextKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q.equals(syntax))
				emit_ExperimentalDesign___ContextKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentalDesign___KeywordsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q.equals(syntax))
				emit_ExperimentalDesign___KeywordsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentalDesign___ResearchHypothesesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_ExperimentalDesign___ResearchHypothesesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentalDesign___ResearchQuestionsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_ExperimentalDesign___ResearchQuestionsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExperimentalDesign___VariablesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_ExperimentalDesign___VariablesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Process_RoleKeyword_4_0_q.equals(syntax))
				emit_Process_RoleKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Process_ToKeyword_2_0_q.equals(syntax))
				emit_Process_ToKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Question_AlternativesKeyword_5_0_q.equals(syntax))
				emit_Question_AlternativesKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Questionnaire_RelatesKeyword_2_0_q.equals(syntax))
				emit_Questionnaire_RelatesKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_ArtefactsKeyword_7_0_q.equals(syntax))
				emit_Task_ArtefactsKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_MetricsKeyword_8_0_q.equals(syntax))
				emit_Task_MetricsKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_RoleKeyword_5_0_q.equals(syntax))
				emit_Task_RoleKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_ToKeyword_4_0_q.equals(syntax))
				emit_Task_ToKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Variable___RangeKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_Variable___RangeKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'Questionnaires'?
	 */
	protected void emit_ExperimentElement_QuestionnairesKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Authorship' '{' '}')?
	 */
	protected void emit_ExperimentalDesign___AuthorshipKeyword_0_0_LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Context' '{' '}')?
	 */
	protected void emit_ExperimentalDesign___ContextKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Keywords' '{' '}')?
	 */
	protected void emit_ExperimentalDesign___KeywordsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Research Hypotheses' '{' '}')?
	 */
	protected void emit_ExperimentalDesign___ResearchHypothesesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Research Questions' '{' '}')?
	 */
	protected void emit_ExperimentalDesign___ResearchQuestionsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Variables' '{' '}')?
	 */
	protected void emit_ExperimentalDesign___VariablesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Task_ArtefactsKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'metrics'?
	 */
	protected void emit_Task_MetricsKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('Range' '{' '}')?
	 */
	protected void emit_Variable___RangeKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
