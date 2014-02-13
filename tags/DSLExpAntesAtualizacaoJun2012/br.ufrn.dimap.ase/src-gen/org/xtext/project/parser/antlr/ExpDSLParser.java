/*
* generated by Xtext
*/
package org.xtext.project.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.project.services.ExpDSLGrammarAccess;

public class ExpDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ExpDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.project.parser.antlr.internal.InternalExpDSLParser createParser(XtextTokenStream stream) {
		return new org.xtext.project.parser.antlr.internal.InternalExpDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public ExpDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ExpDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}