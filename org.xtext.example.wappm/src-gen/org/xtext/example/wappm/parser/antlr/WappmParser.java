/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.wappm.parser.antlr.internal.InternalWappmParser;
import org.xtext.example.wappm.services.WappmGrammarAccess;

public class WappmParser extends AbstractAntlrParser {

	@Inject
	private WappmGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalWappmParser createParser(XtextTokenStream stream) {
		return new InternalWappmParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "WebModel";
	}

	public WappmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WappmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
