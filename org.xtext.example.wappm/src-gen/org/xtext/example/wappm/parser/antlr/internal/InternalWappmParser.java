package org.xtext.example.wappm.parser.antlr.internal;

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
import org.xtext.example.wappm.services.WappmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWappmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'webapp'", "'{'", "'}'", "'hypertext'", "'static'", "'path'", "'links'", "','", "'detail'", "'uses'", "'index'", "'link'", "'page'", "'content'", "'class'", "'uniqueIdentifier'", "'attr'", "':'", "'/'", "'String'", "'Integer'", "'Float'", "'Double'", "'Boolean'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWappmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWappmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWappmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWappm.g"; }



     	private WappmGrammarAccess grammarAccess;

        public InternalWappmParser(TokenStream input, WappmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WebModel";
       	}

       	@Override
       	protected WappmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWebModel"
    // InternalWappm.g:65:1: entryRuleWebModel returns [EObject current=null] : iv_ruleWebModel= ruleWebModel EOF ;
    public final EObject entryRuleWebModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebModel = null;


        try {
            // InternalWappm.g:65:49: (iv_ruleWebModel= ruleWebModel EOF )
            // InternalWappm.g:66:2: iv_ruleWebModel= ruleWebModel EOF
            {
             newCompositeNode(grammarAccess.getWebModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebModel=ruleWebModel();

            state._fsp--;

             current =iv_ruleWebModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebModel"


    // $ANTLR start "ruleWebModel"
    // InternalWappm.g:72:1: ruleWebModel returns [EObject current=null] : (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}' ) ;
    public final EObject ruleWebModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_hypertext_3_0 = null;

        EObject lv_content_4_0 = null;



        	enterRule();

        try {
            // InternalWappm.g:78:2: ( (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}' ) )
            // InternalWappm.g:79:2: (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}' )
            {
            // InternalWappm.g:79:2: (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}' )
            // InternalWappm.g:80:3: otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWebModelAccess().getWebappKeyword_0());
            		
            // InternalWappm.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWappm.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWappm.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalWappm.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWebModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWebModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWebModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWappm.g:106:3: ( (lv_hypertext_3_0= ruleHypertextLayer ) )
            // InternalWappm.g:107:4: (lv_hypertext_3_0= ruleHypertextLayer )
            {
            // InternalWappm.g:107:4: (lv_hypertext_3_0= ruleHypertextLayer )
            // InternalWappm.g:108:5: lv_hypertext_3_0= ruleHypertextLayer
            {

            					newCompositeNode(grammarAccess.getWebModelAccess().getHypertextHypertextLayerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_hypertext_3_0=ruleHypertextLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWebModelRule());
            					}
            					set(
            						current,
            						"hypertext",
            						lv_hypertext_3_0,
            						"org.xtext.example.wappm.Wappm.HypertextLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWappm.g:125:3: ( (lv_content_4_0= ruleContentLayer ) )
            // InternalWappm.g:126:4: (lv_content_4_0= ruleContentLayer )
            {
            // InternalWappm.g:126:4: (lv_content_4_0= ruleContentLayer )
            // InternalWappm.g:127:5: lv_content_4_0= ruleContentLayer
            {

            					newCompositeNode(grammarAccess.getWebModelAccess().getContentContentLayerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_content_4_0=ruleContentLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWebModelRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_4_0,
            						"org.xtext.example.wappm.Wappm.ContentLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWebModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebModel"


    // $ANTLR start "entryRuleHypertextLayer"
    // InternalWappm.g:152:1: entryRuleHypertextLayer returns [EObject current=null] : iv_ruleHypertextLayer= ruleHypertextLayer EOF ;
    public final EObject entryRuleHypertextLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHypertextLayer = null;


        try {
            // InternalWappm.g:152:55: (iv_ruleHypertextLayer= ruleHypertextLayer EOF )
            // InternalWappm.g:153:2: iv_ruleHypertextLayer= ruleHypertextLayer EOF
            {
             newCompositeNode(grammarAccess.getHypertextLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHypertextLayer=ruleHypertextLayer();

            state._fsp--;

             current =iv_ruleHypertextLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHypertextLayer"


    // $ANTLR start "ruleHypertextLayer"
    // InternalWappm.g:159:1: ruleHypertextLayer returns [EObject current=null] : (otherlv_0= 'hypertext' ( (lv_hyperName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pages_3_0= rulePage ) )+ otherlv_4= '}' ) ;
    public final EObject ruleHypertextLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hyperName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pages_3_0 = null;



        	enterRule();

        try {
            // InternalWappm.g:165:2: ( (otherlv_0= 'hypertext' ( (lv_hyperName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pages_3_0= rulePage ) )+ otherlv_4= '}' ) )
            // InternalWappm.g:166:2: (otherlv_0= 'hypertext' ( (lv_hyperName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pages_3_0= rulePage ) )+ otherlv_4= '}' )
            {
            // InternalWappm.g:166:2: (otherlv_0= 'hypertext' ( (lv_hyperName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pages_3_0= rulePage ) )+ otherlv_4= '}' )
            // InternalWappm.g:167:3: otherlv_0= 'hypertext' ( (lv_hyperName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pages_3_0= rulePage ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHypertextLayerAccess().getHypertextKeyword_0());
            		
            // InternalWappm.g:171:3: ( (lv_hyperName_1_0= RULE_ID ) )
            // InternalWappm.g:172:4: (lv_hyperName_1_0= RULE_ID )
            {
            // InternalWappm.g:172:4: (lv_hyperName_1_0= RULE_ID )
            // InternalWappm.g:173:5: lv_hyperName_1_0= RULE_ID
            {
            lv_hyperName_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_hyperName_1_0, grammarAccess.getHypertextLayerAccess().getHyperNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHypertextLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hyperName",
            						lv_hyperName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getHypertextLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWappm.g:193:3: ( (lv_pages_3_0= rulePage ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==19||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWappm.g:194:4: (lv_pages_3_0= rulePage )
            	    {
            	    // InternalWappm.g:194:4: (lv_pages_3_0= rulePage )
            	    // InternalWappm.g:195:5: lv_pages_3_0= rulePage
            	    {

            	    					newCompositeNode(grammarAccess.getHypertextLayerAccess().getPagesPageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_pages_3_0=rulePage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHypertextLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pages",
            	    						lv_pages_3_0,
            	    						"org.xtext.example.wappm.Wappm.Page");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHypertextLayerAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHypertextLayer"


    // $ANTLR start "entryRulePage"
    // InternalWappm.g:220:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalWappm.g:220:45: (iv_rulePage= rulePage EOF )
            // InternalWappm.g:221:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalWappm.g:227:1: rulePage returns [EObject current=null] : (this_StaticPage_0= ruleStaticPage | this_DynamicPage_1= ruleDynamicPage ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        EObject this_StaticPage_0 = null;

        EObject this_DynamicPage_1 = null;



        	enterRule();

        try {
            // InternalWappm.g:233:2: ( (this_StaticPage_0= ruleStaticPage | this_DynamicPage_1= ruleDynamicPage ) )
            // InternalWappm.g:234:2: (this_StaticPage_0= ruleStaticPage | this_DynamicPage_1= ruleDynamicPage )
            {
            // InternalWappm.g:234:2: (this_StaticPage_0= ruleStaticPage | this_DynamicPage_1= ruleDynamicPage )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==19||LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWappm.g:235:3: this_StaticPage_0= ruleStaticPage
                    {

                    			newCompositeNode(grammarAccess.getPageAccess().getStaticPageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticPage_0=ruleStaticPage();

                    state._fsp--;


                    			current = this_StaticPage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWappm.g:244:3: this_DynamicPage_1= ruleDynamicPage
                    {

                    			newCompositeNode(grammarAccess.getPageAccess().getDynamicPageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DynamicPage_1=ruleDynamicPage();

                    state._fsp--;


                    			current = this_DynamicPage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleStaticPage"
    // InternalWappm.g:256:1: entryRuleStaticPage returns [EObject current=null] : iv_ruleStaticPage= ruleStaticPage EOF ;
    public final EObject entryRuleStaticPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticPage = null;


        try {
            // InternalWappm.g:256:51: (iv_ruleStaticPage= ruleStaticPage EOF )
            // InternalWappm.g:257:2: iv_ruleStaticPage= ruleStaticPage EOF
            {
             newCompositeNode(grammarAccess.getStaticPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticPage=ruleStaticPage();

            state._fsp--;

             current =iv_ruleStaticPage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticPage"


    // $ANTLR start "ruleStaticPage"
    // InternalWappm.g:263:1: ruleStaticPage returns [EObject current=null] : (otherlv_0= 'static' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleURL ) ) (otherlv_5= 'links' otherlv_6= '{' ( (lv_links_7_0= ruleLink ) ) (otherlv_8= ',' ( (lv_links_9_0= ruleLink ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleStaticPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_path_4_0 = null;

        EObject lv_links_7_0 = null;

        EObject lv_links_9_0 = null;



        	enterRule();

        try {
            // InternalWappm.g:269:2: ( (otherlv_0= 'static' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleURL ) ) (otherlv_5= 'links' otherlv_6= '{' ( (lv_links_7_0= ruleLink ) ) (otherlv_8= ',' ( (lv_links_9_0= ruleLink ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalWappm.g:270:2: (otherlv_0= 'static' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleURL ) ) (otherlv_5= 'links' otherlv_6= '{' ( (lv_links_7_0= ruleLink ) ) (otherlv_8= ',' ( (lv_links_9_0= ruleLink ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalWappm.g:270:2: (otherlv_0= 'static' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleURL ) ) (otherlv_5= 'links' otherlv_6= '{' ( (lv_links_7_0= ruleLink ) ) (otherlv_8= ',' ( (lv_links_9_0= ruleLink ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalWappm.g:271:3: otherlv_0= 'static' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleURL ) ) (otherlv_5= 'links' otherlv_6= '{' ( (lv_links_7_0= ruleLink ) ) (otherlv_8= ',' ( (lv_links_9_0= ruleLink ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStaticPageAccess().getStaticKeyword_0());
            		
            // InternalWappm.g:275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWappm.g:276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWappm.g:276:4: (lv_name_1_0= RULE_ID )
            // InternalWappm.g:277:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStaticPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getStaticPageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getStaticPageAccess().getPathKeyword_3());
            		
            // InternalWappm.g:301:3: ( (lv_path_4_0= ruleURL ) )
            // InternalWappm.g:302:4: (lv_path_4_0= ruleURL )
            {
            // InternalWappm.g:302:4: (lv_path_4_0= ruleURL )
            // InternalWappm.g:303:5: lv_path_4_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getStaticPageAccess().getPathURLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_path_4_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaticPageRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.xtext.example.wappm.Wappm.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWappm.g:320:3: (otherlv_5= 'links' otherlv_6= '{' ( (lv_links_7_0= ruleLink ) ) (otherlv_8= ',' ( (lv_links_9_0= ruleLink ) ) )* otherlv_10= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWappm.g:321:4: otherlv_5= 'links' otherlv_6= '{' ( (lv_links_7_0= ruleLink ) ) (otherlv_8= ',' ( (lv_links_9_0= ruleLink ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getStaticPageAccess().getLinksKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getStaticPageAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalWappm.g:329:4: ( (lv_links_7_0= ruleLink ) )
                    // InternalWappm.g:330:5: (lv_links_7_0= ruleLink )
                    {
                    // InternalWappm.g:330:5: (lv_links_7_0= ruleLink )
                    // InternalWappm.g:331:6: lv_links_7_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getStaticPageAccess().getLinksLinkParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_links_7_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaticPageRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_7_0,
                    							"org.xtext.example.wappm.Wappm.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWappm.g:348:4: (otherlv_8= ',' ( (lv_links_9_0= ruleLink ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalWappm.g:349:5: otherlv_8= ',' ( (lv_links_9_0= ruleLink ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStaticPageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalWappm.g:353:5: ( (lv_links_9_0= ruleLink ) )
                    	    // InternalWappm.g:354:6: (lv_links_9_0= ruleLink )
                    	    {
                    	    // InternalWappm.g:354:6: (lv_links_9_0= ruleLink )
                    	    // InternalWappm.g:355:7: lv_links_9_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getStaticPageAccess().getLinksLinkParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_links_9_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStaticPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_9_0,
                    	    								"org.xtext.example.wappm.Wappm.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getStaticPageAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getStaticPageAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticPage"


    // $ANTLR start "entryRuleDynamicPage"
    // InternalWappm.g:386:1: entryRuleDynamicPage returns [EObject current=null] : iv_ruleDynamicPage= ruleDynamicPage EOF ;
    public final EObject entryRuleDynamicPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicPage = null;


        try {
            // InternalWappm.g:386:52: (iv_ruleDynamicPage= ruleDynamicPage EOF )
            // InternalWappm.g:387:2: iv_ruleDynamicPage= ruleDynamicPage EOF
            {
             newCompositeNode(grammarAccess.getDynamicPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicPage=ruleDynamicPage();

            state._fsp--;

             current =iv_ruleDynamicPage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicPage"


    // $ANTLR start "ruleDynamicPage"
    // InternalWappm.g:393:1: ruleDynamicPage returns [EObject current=null] : (this_IndexPage_0= ruleIndexPage | this_DetailPage_1= ruleDetailPage ) ;
    public final EObject ruleDynamicPage() throws RecognitionException {
        EObject current = null;

        EObject this_IndexPage_0 = null;

        EObject this_DetailPage_1 = null;



        	enterRule();

        try {
            // InternalWappm.g:399:2: ( (this_IndexPage_0= ruleIndexPage | this_DetailPage_1= ruleDetailPage ) )
            // InternalWappm.g:400:2: (this_IndexPage_0= ruleIndexPage | this_DetailPage_1= ruleDetailPage )
            {
            // InternalWappm.g:400:2: (this_IndexPage_0= ruleIndexPage | this_DetailPage_1= ruleDetailPage )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWappm.g:401:3: this_IndexPage_0= ruleIndexPage
                    {

                    			newCompositeNode(grammarAccess.getDynamicPageAccess().getIndexPageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndexPage_0=ruleIndexPage();

                    state._fsp--;


                    			current = this_IndexPage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWappm.g:410:3: this_DetailPage_1= ruleDetailPage
                    {

                    			newCompositeNode(grammarAccess.getDynamicPageAccess().getDetailPageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DetailPage_1=ruleDetailPage();

                    state._fsp--;


                    			current = this_DetailPage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicPage"


    // $ANTLR start "entryRuleDetailPage"
    // InternalWappm.g:422:1: entryRuleDetailPage returns [EObject current=null] : iv_ruleDetailPage= ruleDetailPage EOF ;
    public final EObject entryRuleDetailPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailPage = null;


        try {
            // InternalWappm.g:422:51: (iv_ruleDetailPage= ruleDetailPage EOF )
            // InternalWappm.g:423:2: iv_ruleDetailPage= ruleDetailPage EOF
            {
             newCompositeNode(grammarAccess.getDetailPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetailPage=ruleDetailPage();

            state._fsp--;

             current =iv_ruleDetailPage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDetailPage"


    // $ANTLR start "ruleDetailPage"
    // InternalWappm.g:429:1: ruleDetailPage returns [EObject current=null] : (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleDetailPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_path_6_0 = null;

        EObject lv_links_9_0 = null;

        EObject lv_links_11_0 = null;



        	enterRule();

        try {
            // InternalWappm.g:435:2: ( (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalWappm.g:436:2: (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalWappm.g:436:2: (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalWappm.g:437:3: otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDetailPageAccess().getDetailKeyword_0());
            		
            // InternalWappm.g:441:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWappm.g:442:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWappm.g:442:4: (lv_name_1_0= RULE_ID )
            // InternalWappm.g:443:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDetailPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetailPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDetailPageAccess().getUsesKeyword_2());
            		
            // InternalWappm.g:463:3: ( (otherlv_3= RULE_ID ) )
            // InternalWappm.g:464:4: (otherlv_3= RULE_ID )
            {
            // InternalWappm.g:464:4: (otherlv_3= RULE_ID )
            // InternalWappm.g:465:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetailPageRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getDetailPageAccess().getDisplayedClassWebClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDetailPageAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDetailPageAccess().getPathKeyword_5());
            		
            // InternalWappm.g:484:3: ( (lv_path_6_0= ruleURL ) )
            // InternalWappm.g:485:4: (lv_path_6_0= ruleURL )
            {
            // InternalWappm.g:485:4: (lv_path_6_0= ruleURL )
            // InternalWappm.g:486:5: lv_path_6_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getDetailPageAccess().getPathURLParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_path_6_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDetailPageRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_6_0,
            						"org.xtext.example.wappm.Wappm.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWappm.g:503:3: (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWappm.g:504:4: otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getDetailPageAccess().getLinksKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getDetailPageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalWappm.g:512:4: ( (lv_links_9_0= ruleLink ) )
                    // InternalWappm.g:513:5: (lv_links_9_0= ruleLink )
                    {
                    // InternalWappm.g:513:5: (lv_links_9_0= ruleLink )
                    // InternalWappm.g:514:6: lv_links_9_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getDetailPageAccess().getLinksLinkParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_links_9_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDetailPageRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_9_0,
                    							"org.xtext.example.wappm.Wappm.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWappm.g:531:4: (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalWappm.g:532:5: otherlv_10= ',' ( (lv_links_11_0= ruleLink ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDetailPageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalWappm.g:536:5: ( (lv_links_11_0= ruleLink ) )
                    	    // InternalWappm.g:537:6: (lv_links_11_0= ruleLink )
                    	    {
                    	    // InternalWappm.g:537:6: (lv_links_11_0= ruleLink )
                    	    // InternalWappm.g:538:7: lv_links_11_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getDetailPageAccess().getLinksLinkParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_links_11_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDetailPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_11_0,
                    	    								"org.xtext.example.wappm.Wappm.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getDetailPageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDetailPageAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDetailPage"


    // $ANTLR start "entryRuleIndexPage"
    // InternalWappm.g:569:1: entryRuleIndexPage returns [EObject current=null] : iv_ruleIndexPage= ruleIndexPage EOF ;
    public final EObject entryRuleIndexPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexPage = null;


        try {
            // InternalWappm.g:569:50: (iv_ruleIndexPage= ruleIndexPage EOF )
            // InternalWappm.g:570:2: iv_ruleIndexPage= ruleIndexPage EOF
            {
             newCompositeNode(grammarAccess.getIndexPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexPage=ruleIndexPage();

            state._fsp--;

             current =iv_ruleIndexPage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexPage"


    // $ANTLR start "ruleIndexPage"
    // InternalWappm.g:576:1: ruleIndexPage returns [EObject current=null] : (otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleIndexPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_path_6_0 = null;

        EObject lv_links_9_0 = null;

        EObject lv_links_11_0 = null;



        	enterRule();

        try {
            // InternalWappm.g:582:2: ( (otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalWappm.g:583:2: (otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalWappm.g:583:2: (otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalWappm.g:584:3: otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'path' ( (lv_path_6_0= ruleURL ) ) (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexPageAccess().getIndexKeyword_0());
            		
            // InternalWappm.g:588:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWappm.g:589:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWappm.g:589:4: (lv_name_1_0= RULE_ID )
            // InternalWappm.g:590:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndexPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexPageAccess().getUsesKeyword_2());
            		
            // InternalWappm.g:610:3: ( (otherlv_3= RULE_ID ) )
            // InternalWappm.g:611:4: (otherlv_3= RULE_ID )
            {
            // InternalWappm.g:611:4: (otherlv_3= RULE_ID )
            // InternalWappm.g:612:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexPageRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getIndexPageAccess().getDisplayedClassWebClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexPageAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexPageAccess().getPathKeyword_5());
            		
            // InternalWappm.g:631:3: ( (lv_path_6_0= ruleURL ) )
            // InternalWappm.g:632:4: (lv_path_6_0= ruleURL )
            {
            // InternalWappm.g:632:4: (lv_path_6_0= ruleURL )
            // InternalWappm.g:633:5: lv_path_6_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getIndexPageAccess().getPathURLParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_path_6_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexPageRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_6_0,
            						"org.xtext.example.wappm.Wappm.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWappm.g:650:3: (otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWappm.g:651:4: otherlv_7= 'links' otherlv_8= '{' ( (lv_links_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getIndexPageAccess().getLinksKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getIndexPageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalWappm.g:659:4: ( (lv_links_9_0= ruleLink ) )
                    // InternalWappm.g:660:5: (lv_links_9_0= ruleLink )
                    {
                    // InternalWappm.g:660:5: (lv_links_9_0= ruleLink )
                    // InternalWappm.g:661:6: lv_links_9_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getIndexPageAccess().getLinksLinkParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_links_9_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexPageRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_9_0,
                    							"org.xtext.example.wappm.Wappm.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWappm.g:678:4: (otherlv_10= ',' ( (lv_links_11_0= ruleLink ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalWappm.g:679:5: otherlv_10= ',' ( (lv_links_11_0= ruleLink ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getIndexPageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalWappm.g:683:5: ( (lv_links_11_0= ruleLink ) )
                    	    // InternalWappm.g:684:6: (lv_links_11_0= ruleLink )
                    	    {
                    	    // InternalWappm.g:684:6: (lv_links_11_0= ruleLink )
                    	    // InternalWappm.g:685:7: lv_links_11_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndexPageAccess().getLinksLinkParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_links_11_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndexPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_11_0,
                    	    								"org.xtext.example.wappm.Wappm.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getIndexPageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getIndexPageAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexPage"


    // $ANTLR start "entryRuleLink"
    // InternalWappm.g:716:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalWappm.g:716:45: (iv_ruleLink= ruleLink EOF )
            // InternalWappm.g:717:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalWappm.g:723:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' otherlv_1= '{' otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalWappm.g:729:2: ( (otherlv_0= 'link' otherlv_1= '{' otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalWappm.g:730:2: (otherlv_0= 'link' otherlv_1= '{' otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalWappm.g:730:2: (otherlv_0= 'link' otherlv_1= '{' otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // InternalWappm.g:731:3: otherlv_0= 'link' otherlv_1= '{' otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getPageKeyword_2());
            		
            // InternalWappm.g:743:3: ( (otherlv_3= RULE_ID ) )
            // InternalWappm.g:744:4: (otherlv_3= RULE_ID )
            {
            // InternalWappm.g:744:4: (otherlv_3= RULE_ID )
            // InternalWappm.g:745:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getPagePageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleContentLayer"
    // InternalWappm.g:764:1: entryRuleContentLayer returns [EObject current=null] : iv_ruleContentLayer= ruleContentLayer EOF ;
    public final EObject entryRuleContentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentLayer = null;


        try {
            // InternalWappm.g:764:53: (iv_ruleContentLayer= ruleContentLayer EOF )
            // InternalWappm.g:765:2: iv_ruleContentLayer= ruleContentLayer EOF
            {
             newCompositeNode(grammarAccess.getContentLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentLayer=ruleContentLayer();

            state._fsp--;

             current =iv_ruleContentLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentLayer"


    // $ANTLR start "ruleContentLayer"
    // InternalWappm.g:771:1: ruleContentLayer returns [EObject current=null] : (otherlv_0= 'content' ( (lv_contentName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleWebClass ) )+ otherlv_4= '}' ) ;
    public final EObject ruleContentLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_contentName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_classes_3_0 = null;



        	enterRule();

        try {
            // InternalWappm.g:777:2: ( (otherlv_0= 'content' ( (lv_contentName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleWebClass ) )+ otherlv_4= '}' ) )
            // InternalWappm.g:778:2: (otherlv_0= 'content' ( (lv_contentName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleWebClass ) )+ otherlv_4= '}' )
            {
            // InternalWappm.g:778:2: (otherlv_0= 'content' ( (lv_contentName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleWebClass ) )+ otherlv_4= '}' )
            // InternalWappm.g:779:3: otherlv_0= 'content' ( (lv_contentName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleWebClass ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContentLayerAccess().getContentKeyword_0());
            		
            // InternalWappm.g:783:3: ( (lv_contentName_1_0= RULE_ID ) )
            // InternalWappm.g:784:4: (lv_contentName_1_0= RULE_ID )
            {
            // InternalWappm.g:784:4: (lv_contentName_1_0= RULE_ID )
            // InternalWappm.g:785:5: lv_contentName_1_0= RULE_ID
            {
            lv_contentName_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_contentName_1_0, grammarAccess.getContentLayerAccess().getContentNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contentName",
            						lv_contentName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getContentLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWappm.g:805:3: ( (lv_classes_3_0= ruleWebClass ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWappm.g:806:4: (lv_classes_3_0= ruleWebClass )
            	    {
            	    // InternalWappm.g:806:4: (lv_classes_3_0= ruleWebClass )
            	    // InternalWappm.g:807:5: lv_classes_3_0= ruleWebClass
            	    {

            	    					newCompositeNode(grammarAccess.getContentLayerAccess().getClassesWebClassParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_classes_3_0=ruleWebClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContentLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_3_0,
            	    						"org.xtext.example.wappm.Wappm.WebClass");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getContentLayerAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentLayer"


    // $ANTLR start "entryRuleWebClass"
    // InternalWappm.g:832:1: entryRuleWebClass returns [EObject current=null] : iv_ruleWebClass= ruleWebClass EOF ;
    public final EObject entryRuleWebClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebClass = null;


        try {
            // InternalWappm.g:832:49: (iv_ruleWebClass= ruleWebClass EOF )
            // InternalWappm.g:833:2: iv_ruleWebClass= ruleWebClass EOF
            {
             newCompositeNode(grammarAccess.getWebClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebClass=ruleWebClass();

            state._fsp--;

             current =iv_ruleWebClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebClass"


    // $ANTLR start "ruleWebClass"
    // InternalWappm.g:839:1: ruleWebClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= 'uniqueIdentifier' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleWebClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalWappm.g:845:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= 'uniqueIdentifier' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalWappm.g:846:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= 'uniqueIdentifier' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalWappm.g:846:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= 'uniqueIdentifier' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalWappm.g:847:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= 'uniqueIdentifier' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWebClassAccess().getClassKeyword_0());
            		
            // InternalWappm.g:851:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWappm.g:852:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWappm.g:852:4: (lv_name_1_0= RULE_ID )
            // InternalWappm.g:853:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWebClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWebClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getWebClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWappm.g:873:3: ( (lv_attributes_3_0= ruleAttribute ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWappm.g:874:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalWappm.g:874:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalWappm.g:875:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getWebClassAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWebClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.example.wappm.Wappm.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWebClassAccess().getUniqueIdentifierKeyword_4());
            		
            // InternalWappm.g:896:3: ( (otherlv_5= RULE_ID ) )
            // InternalWappm.g:897:4: (otherlv_5= RULE_ID )
            {
            // InternalWappm.g:897:4: (otherlv_5= RULE_ID )
            // InternalWappm.g:898:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWebClassRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getWebClassAccess().getUniqueIdentifierAttributeCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWebClassAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalWappm.g:917:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalWappm.g:917:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalWappm.g:918:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalWappm.g:924:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAppTypes ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalWappm.g:930:2: ( (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAppTypes ) ) ) )
            // InternalWappm.g:931:2: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAppTypes ) ) )
            {
            // InternalWappm.g:931:2: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAppTypes ) ) )
            // InternalWappm.g:932:3: otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAppTypes ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttrKeyword_0());
            		
            // InternalWappm.g:936:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWappm.g:937:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWappm.g:937:4: (lv_name_1_0= RULE_ID )
            // InternalWappm.g:938:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalWappm.g:958:3: ( (lv_type_3_0= ruleAppTypes ) )
            // InternalWappm.g:959:4: (lv_type_3_0= ruleAppTypes )
            {
            // InternalWappm.g:959:4: (lv_type_3_0= ruleAppTypes )
            // InternalWappm.g:960:5: lv_type_3_0= ruleAppTypes
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAppTypesEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleAppTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.wappm.Wappm.AppTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleURL"
    // InternalWappm.g:981:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // InternalWappm.g:981:43: (iv_ruleURL= ruleURL EOF )
            // InternalWappm.g:982:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalWappm.g:988:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' (this_ID_1= RULE_ID kw= '/' )* ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalWappm.g:994:2: ( (kw= '/' (this_ID_1= RULE_ID kw= '/' )* ) )
            // InternalWappm.g:995:2: (kw= '/' (this_ID_1= RULE_ID kw= '/' )* )
            {
            // InternalWappm.g:995:2: (kw= '/' (this_ID_1= RULE_ID kw= '/' )* )
            // InternalWappm.g:996:3: kw= '/' (this_ID_1= RULE_ID kw= '/' )*
            {
            kw=(Token)match(input,29,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_0());
            		
            // InternalWappm.g:1001:3: (this_ID_1= RULE_ID kw= '/' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWappm.g:1002:4: this_ID_1= RULE_ID kw= '/'
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getURLAccess().getIDTerminalRuleCall_1_0());
            	    			
            	    kw=(Token)match(input,29,FOLLOW_23); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "ruleAppTypes"
    // InternalWappm.g:1019:1: ruleAppTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Boolean' ) ) ;
    public final Enumerator ruleAppTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalWappm.g:1025:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Boolean' ) ) )
            // InternalWappm.g:1026:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Boolean' ) )
            {
            // InternalWappm.g:1026:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Boolean' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            case 34:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalWappm.g:1027:3: (enumLiteral_0= 'String' )
                    {
                    // InternalWappm.g:1027:3: (enumLiteral_0= 'String' )
                    // InternalWappm.g:1028:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getAppTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAppTypesAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWappm.g:1035:3: (enumLiteral_1= 'Integer' )
                    {
                    // InternalWappm.g:1035:3: (enumLiteral_1= 'Integer' )
                    // InternalWappm.g:1036:4: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getAppTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAppTypesAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWappm.g:1043:3: (enumLiteral_2= 'Float' )
                    {
                    // InternalWappm.g:1043:3: (enumLiteral_2= 'Float' )
                    // InternalWappm.g:1044:4: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getAppTypesAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAppTypesAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWappm.g:1051:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalWappm.g:1051:3: (enumLiteral_3= 'Double' )
                    // InternalWappm.g:1052:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getAppTypesAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAppTypesAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWappm.g:1059:3: (enumLiteral_4= 'Boolean' )
                    {
                    // InternalWappm.g:1059:3: (enumLiteral_4= 'Boolean' )
                    // InternalWappm.g:1060:4: enumLiteral_4= 'Boolean'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getAppTypesAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAppTypesAccess().getBooleanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000288000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000028A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});

}