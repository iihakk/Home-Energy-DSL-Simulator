package org.homeenergy.parser.antlr.internal;

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
import org.homeenergy.services.HemDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHemDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_TIME_LIT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'appliance'", "':'", "';'", "'rule'", "'when'", "'then'", "'else'", "'turn'", "'on'", "'off'", "'set'", "'to'", "'or'", "'and'", "'('", "')'", "'time'", "'='", "'between'", "'price'", "'occupancy'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'HVAC'", "'WaterHeater'", "'Washer'", "'Dryer'", "'Light'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_TIME_LIT=6;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=5;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalHemDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHemDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHemDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHemDsl.g"; }



     	private HemDslGrammarAccess grammarAccess;

        public InternalHemDslParser(TokenStream input, HemDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HemDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHemDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHemDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalHemDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHemDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:78:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalHemDsl.g:79:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalHemDsl.g:79:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHemDsl.g:80:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalHemDsl.g:80:3: (lv_elements_0_0= ruleElement )
            	    // InternalHemDsl.g:81:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.homeenergy.HemDsl.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalHemDsl.g:101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalHemDsl.g:101:48: (iv_ruleElement= ruleElement EOF )
            // InternalHemDsl.g:102:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalHemDsl.g:108:1: ruleElement returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_Rule_1= ruleRule ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject this_Rule_1 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:114:2: ( (this_Declaration_0= ruleDeclaration | this_Rule_1= ruleRule ) )
            // InternalHemDsl.g:115:2: (this_Declaration_0= ruleDeclaration | this_Rule_1= ruleRule )
            {
            // InternalHemDsl.g:115:2: (this_Declaration_0= ruleDeclaration | this_Rule_1= ruleRule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHemDsl.g:116:3: this_Declaration_0= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHemDsl.g:125:3: this_Rule_1= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_1=ruleRule();

                    state._fsp--;


                    			current = this_Rule_1;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDeclaration"
    // InternalHemDsl.g:137:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalHemDsl.g:137:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalHemDsl.g:138:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalHemDsl.g:144:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'appliance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleApplianceType ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:150:2: ( (otherlv_0= 'appliance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleApplianceType ) ) otherlv_4= ';' ) )
            // InternalHemDsl.g:151:2: (otherlv_0= 'appliance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleApplianceType ) ) otherlv_4= ';' )
            {
            // InternalHemDsl.g:151:2: (otherlv_0= 'appliance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleApplianceType ) ) otherlv_4= ';' )
            // InternalHemDsl.g:152:3: otherlv_0= 'appliance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleApplianceType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getApplianceKeyword_0());
            		
            // InternalHemDsl.g:156:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHemDsl.g:157:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHemDsl.g:157:4: (lv_name_1_0= RULE_ID )
            // InternalHemDsl.g:158:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getColonKeyword_2());
            		
            // InternalHemDsl.g:178:3: ( (lv_type_3_0= ruleApplianceType ) )
            // InternalHemDsl.g:179:4: (lv_type_3_0= ruleApplianceType )
            {
            // InternalHemDsl.g:179:4: (lv_type_3_0= ruleApplianceType )
            // InternalHemDsl.g:180:5: lv_type_3_0= ruleApplianceType
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getTypeApplianceTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_3_0=ruleApplianceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.homeenergy.HemDsl.ApplianceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleRule"
    // InternalHemDsl.g:205:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalHemDsl.g:205:45: (iv_ruleRule= ruleRule EOF )
            // InternalHemDsl.g:206:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalHemDsl.g:212:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_condition_3_0= ruleExpr ) ) otherlv_4= 'then' ( (lv_thenAction_5_0= ruleAction ) ) (otherlv_6= 'else' ( (lv_elseAction_7_0= ruleAction ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_condition_3_0 = null;

        EObject lv_thenAction_5_0 = null;

        EObject lv_elseAction_7_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:218:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_condition_3_0= ruleExpr ) ) otherlv_4= 'then' ( (lv_thenAction_5_0= ruleAction ) ) (otherlv_6= 'else' ( (lv_elseAction_7_0= ruleAction ) ) )? otherlv_8= ';' ) )
            // InternalHemDsl.g:219:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_condition_3_0= ruleExpr ) ) otherlv_4= 'then' ( (lv_thenAction_5_0= ruleAction ) ) (otherlv_6= 'else' ( (lv_elseAction_7_0= ruleAction ) ) )? otherlv_8= ';' )
            {
            // InternalHemDsl.g:219:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_condition_3_0= ruleExpr ) ) otherlv_4= 'then' ( (lv_thenAction_5_0= ruleAction ) ) (otherlv_6= 'else' ( (lv_elseAction_7_0= ruleAction ) ) )? otherlv_8= ';' )
            // InternalHemDsl.g:220:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_condition_3_0= ruleExpr ) ) otherlv_4= 'then' ( (lv_thenAction_5_0= ruleAction ) ) (otherlv_6= 'else' ( (lv_elseAction_7_0= ruleAction ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalHemDsl.g:224:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHemDsl.g:225:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHemDsl.g:225:4: (lv_name_1_0= RULE_ID )
            // InternalHemDsl.g:226:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getWhenKeyword_2());
            		
            // InternalHemDsl.g:246:3: ( (lv_condition_3_0= ruleExpr ) )
            // InternalHemDsl.g:247:4: (lv_condition_3_0= ruleExpr )
            {
            // InternalHemDsl.g:247:4: (lv_condition_3_0= ruleExpr )
            // InternalHemDsl.g:248:5: lv_condition_3_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionExprParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_condition_3_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"org.homeenergy.HemDsl.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getThenKeyword_4());
            		
            // InternalHemDsl.g:269:3: ( (lv_thenAction_5_0= ruleAction ) )
            // InternalHemDsl.g:270:4: (lv_thenAction_5_0= ruleAction )
            {
            // InternalHemDsl.g:270:4: (lv_thenAction_5_0= ruleAction )
            // InternalHemDsl.g:271:5: lv_thenAction_5_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getThenActionActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_thenAction_5_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"thenAction",
            						lv_thenAction_5_0,
            						"org.homeenergy.HemDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHemDsl.g:288:3: (otherlv_6= 'else' ( (lv_elseAction_7_0= ruleAction ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHemDsl.g:289:4: otherlv_6= 'else' ( (lv_elseAction_7_0= ruleAction ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getElseKeyword_6_0());
                    			
                    // InternalHemDsl.g:293:4: ( (lv_elseAction_7_0= ruleAction ) )
                    // InternalHemDsl.g:294:5: (lv_elseAction_7_0= ruleAction )
                    {
                    // InternalHemDsl.g:294:5: (lv_elseAction_7_0= ruleAction )
                    // InternalHemDsl.g:295:6: lv_elseAction_7_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getElseActionActionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elseAction_7_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"elseAction",
                    							lv_elseAction_7_0,
                    							"org.homeenergy.HemDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAction"
    // InternalHemDsl.g:321:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalHemDsl.g:321:47: (iv_ruleAction= ruleAction EOF )
            // InternalHemDsl.g:322:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalHemDsl.g:328:1: ruleAction returns [EObject current=null] : (this_TurnAction_0= ruleTurnAction | this_SetAction_1= ruleSetAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_TurnAction_0 = null;

        EObject this_SetAction_1 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:334:2: ( (this_TurnAction_0= ruleTurnAction | this_SetAction_1= ruleSetAction ) )
            // InternalHemDsl.g:335:2: (this_TurnAction_0= ruleTurnAction | this_SetAction_1= ruleSetAction )
            {
            // InternalHemDsl.g:335:2: (this_TurnAction_0= ruleTurnAction | this_SetAction_1= ruleSetAction )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHemDsl.g:336:3: this_TurnAction_0= ruleTurnAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTurnActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnAction_0=ruleTurnAction();

                    state._fsp--;


                    			current = this_TurnAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHemDsl.g:345:3: this_SetAction_1= ruleSetAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSetActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetAction_1=ruleSetAction();

                    state._fsp--;


                    			current = this_SetAction_1;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTurnAction"
    // InternalHemDsl.g:357:1: entryRuleTurnAction returns [EObject current=null] : iv_ruleTurnAction= ruleTurnAction EOF ;
    public final EObject entryRuleTurnAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnAction = null;


        try {
            // InternalHemDsl.g:357:51: (iv_ruleTurnAction= ruleTurnAction EOF )
            // InternalHemDsl.g:358:2: iv_ruleTurnAction= ruleTurnAction EOF
            {
             newCompositeNode(grammarAccess.getTurnActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnAction=ruleTurnAction();

            state._fsp--;

             current =iv_ruleTurnAction; 
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
    // $ANTLR end "entryRuleTurnAction"


    // $ANTLR start "ruleTurnAction"
    // InternalHemDsl.g:364:1: ruleTurnAction returns [EObject current=null] : (otherlv_0= 'turn' ( (otherlv_1= RULE_ID ) ) ( ( (lv_action_2_1= 'on' | lv_action_2_2= 'off' ) ) ) ) ;
    public final EObject ruleTurnAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_action_2_1=null;
        Token lv_action_2_2=null;


        	enterRule();

        try {
            // InternalHemDsl.g:370:2: ( (otherlv_0= 'turn' ( (otherlv_1= RULE_ID ) ) ( ( (lv_action_2_1= 'on' | lv_action_2_2= 'off' ) ) ) ) )
            // InternalHemDsl.g:371:2: (otherlv_0= 'turn' ( (otherlv_1= RULE_ID ) ) ( ( (lv_action_2_1= 'on' | lv_action_2_2= 'off' ) ) ) )
            {
            // InternalHemDsl.g:371:2: (otherlv_0= 'turn' ( (otherlv_1= RULE_ID ) ) ( ( (lv_action_2_1= 'on' | lv_action_2_2= 'off' ) ) ) )
            // InternalHemDsl.g:372:3: otherlv_0= 'turn' ( (otherlv_1= RULE_ID ) ) ( ( (lv_action_2_1= 'on' | lv_action_2_2= 'off' ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnActionAccess().getTurnKeyword_0());
            		
            // InternalHemDsl.g:376:3: ( (otherlv_1= RULE_ID ) )
            // InternalHemDsl.g:377:4: (otherlv_1= RULE_ID )
            {
            // InternalHemDsl.g:377:4: (otherlv_1= RULE_ID )
            // InternalHemDsl.g:378:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnActionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getTurnActionAccess().getApplianceDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalHemDsl.g:389:3: ( ( (lv_action_2_1= 'on' | lv_action_2_2= 'off' ) ) )
            // InternalHemDsl.g:390:4: ( (lv_action_2_1= 'on' | lv_action_2_2= 'off' ) )
            {
            // InternalHemDsl.g:390:4: ( (lv_action_2_1= 'on' | lv_action_2_2= 'off' ) )
            // InternalHemDsl.g:391:5: (lv_action_2_1= 'on' | lv_action_2_2= 'off' )
            {
            // InternalHemDsl.g:391:5: (lv_action_2_1= 'on' | lv_action_2_2= 'off' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHemDsl.g:392:6: lv_action_2_1= 'on'
                    {
                    lv_action_2_1=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_action_2_1, grammarAccess.getTurnActionAccess().getActionOnKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTurnActionRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHemDsl.g:403:6: lv_action_2_2= 'off'
                    {
                    lv_action_2_2=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_action_2_2, grammarAccess.getTurnActionAccess().getActionOffKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTurnActionRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_2_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleTurnAction"


    // $ANTLR start "entryRuleSetAction"
    // InternalHemDsl.g:420:1: entryRuleSetAction returns [EObject current=null] : iv_ruleSetAction= ruleSetAction EOF ;
    public final EObject entryRuleSetAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAction = null;


        try {
            // InternalHemDsl.g:420:50: (iv_ruleSetAction= ruleSetAction EOF )
            // InternalHemDsl.g:421:2: iv_ruleSetAction= ruleSetAction EOF
            {
             newCompositeNode(grammarAccess.getSetActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetAction=ruleSetAction();

            state._fsp--;

             current =iv_ruleSetAction; 
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
    // $ANTLR end "entryRuleSetAction"


    // $ANTLR start "ruleSetAction"
    // InternalHemDsl.g:427:1: ruleSetAction returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleSetAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalHemDsl.g:433:2: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_NUMBER ) ) ) )
            // InternalHemDsl.g:434:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_NUMBER ) ) )
            {
            // InternalHemDsl.g:434:2: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_NUMBER ) ) )
            // InternalHemDsl.g:435:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_NUMBER ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSetActionAccess().getSetKeyword_0());
            		
            // InternalHemDsl.g:439:3: ( (otherlv_1= RULE_ID ) )
            // InternalHemDsl.g:440:4: (otherlv_1= RULE_ID )
            {
            // InternalHemDsl.g:440:4: (otherlv_1= RULE_ID )
            // InternalHemDsl.g:441:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetActionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getSetActionAccess().getApplianceDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSetActionAccess().getToKeyword_2());
            		
            // InternalHemDsl.g:456:3: ( (lv_value_3_0= RULE_NUMBER ) )
            // InternalHemDsl.g:457:4: (lv_value_3_0= RULE_NUMBER )
            {
            // InternalHemDsl.g:457:4: (lv_value_3_0= RULE_NUMBER )
            // InternalHemDsl.g:458:5: lv_value_3_0= RULE_NUMBER
            {
            lv_value_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getSetActionAccess().getValueNUMBERTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.homeenergy.HemDsl.NUMBER");
            				

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
    // $ANTLR end "ruleSetAction"


    // $ANTLR start "entryRuleExpr"
    // InternalHemDsl.g:478:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalHemDsl.g:478:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalHemDsl.g:479:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalHemDsl.g:485:1: ruleExpr returns [EObject current=null] : ( (lv_orExpr_0_0= ruleOrExpr ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_orExpr_0_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:491:2: ( ( (lv_orExpr_0_0= ruleOrExpr ) ) )
            // InternalHemDsl.g:492:2: ( (lv_orExpr_0_0= ruleOrExpr ) )
            {
            // InternalHemDsl.g:492:2: ( (lv_orExpr_0_0= ruleOrExpr ) )
            // InternalHemDsl.g:493:3: (lv_orExpr_0_0= ruleOrExpr )
            {
            // InternalHemDsl.g:493:3: (lv_orExpr_0_0= ruleOrExpr )
            // InternalHemDsl.g:494:4: lv_orExpr_0_0= ruleOrExpr
            {

            				newCompositeNode(grammarAccess.getExprAccess().getOrExprOrExprParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_orExpr_0_0=ruleOrExpr();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExprRule());
            				}
            				set(
            					current,
            					"orExpr",
            					lv_orExpr_0_0,
            					"org.homeenergy.HemDsl.OrExpr");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalHemDsl.g:514:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalHemDsl.g:514:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalHemDsl.g:515:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalHemDsl.g:521:1: ruleOrExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:527:2: ( ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpr ) ) )* ) )
            // InternalHemDsl.g:528:2: ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpr ) ) )* )
            {
            // InternalHemDsl.g:528:2: ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpr ) ) )* )
            // InternalHemDsl.g:529:3: ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpr ) ) )*
            {
            // InternalHemDsl.g:529:3: ( (lv_left_0_0= ruleAndExpr ) )
            // InternalHemDsl.g:530:4: (lv_left_0_0= ruleAndExpr )
            {
            // InternalHemDsl.g:530:4: (lv_left_0_0= ruleAndExpr )
            // InternalHemDsl.g:531:5: lv_left_0_0= ruleAndExpr
            {

            					newCompositeNode(grammarAccess.getOrExprAccess().getLeftAndExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_left_0_0=ruleAndExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrExprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.homeenergy.HemDsl.AndExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHemDsl.g:548:3: (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHemDsl.g:549:4: otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrExprAccess().getOrKeyword_1_0());
            	    			
            	    // InternalHemDsl.g:553:4: ( (lv_right_2_0= ruleAndExpr ) )
            	    // InternalHemDsl.g:554:5: (lv_right_2_0= ruleAndExpr )
            	    {
            	    // InternalHemDsl.g:554:5: (lv_right_2_0= ruleAndExpr )
            	    // InternalHemDsl.g:555:6: lv_right_2_0= ruleAndExpr
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_2_0=ruleAndExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_2_0,
            	    							"org.homeenergy.HemDsl.AndExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalHemDsl.g:577:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalHemDsl.g:577:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalHemDsl.g:578:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalHemDsl.g:584:1: ruleAndExpr returns [EObject current=null] : ( ( (lv_left_0_0= rulePrim ) ) (otherlv_1= 'and' ( (lv_right_2_0= rulePrim ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:590:2: ( ( ( (lv_left_0_0= rulePrim ) ) (otherlv_1= 'and' ( (lv_right_2_0= rulePrim ) ) )* ) )
            // InternalHemDsl.g:591:2: ( ( (lv_left_0_0= rulePrim ) ) (otherlv_1= 'and' ( (lv_right_2_0= rulePrim ) ) )* )
            {
            // InternalHemDsl.g:591:2: ( ( (lv_left_0_0= rulePrim ) ) (otherlv_1= 'and' ( (lv_right_2_0= rulePrim ) ) )* )
            // InternalHemDsl.g:592:3: ( (lv_left_0_0= rulePrim ) ) (otherlv_1= 'and' ( (lv_right_2_0= rulePrim ) ) )*
            {
            // InternalHemDsl.g:592:3: ( (lv_left_0_0= rulePrim ) )
            // InternalHemDsl.g:593:4: (lv_left_0_0= rulePrim )
            {
            // InternalHemDsl.g:593:4: (lv_left_0_0= rulePrim )
            // InternalHemDsl.g:594:5: lv_left_0_0= rulePrim
            {

            					newCompositeNode(grammarAccess.getAndExprAccess().getLeftPrimParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_left_0_0=rulePrim();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndExprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.homeenergy.HemDsl.Prim");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHemDsl.g:611:3: (otherlv_1= 'and' ( (lv_right_2_0= rulePrim ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHemDsl.g:612:4: otherlv_1= 'and' ( (lv_right_2_0= rulePrim ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndExprAccess().getAndKeyword_1_0());
            	    			
            	    // InternalHemDsl.g:616:4: ( (lv_right_2_0= rulePrim ) )
            	    // InternalHemDsl.g:617:5: (lv_right_2_0= rulePrim )
            	    {
            	    // InternalHemDsl.g:617:5: (lv_right_2_0= rulePrim )
            	    // InternalHemDsl.g:618:6: lv_right_2_0= rulePrim
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getRightPrimParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_2_0=rulePrim();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_2_0,
            	    							"org.homeenergy.HemDsl.Prim");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRulePrim"
    // InternalHemDsl.g:640:1: entryRulePrim returns [EObject current=null] : iv_rulePrim= rulePrim EOF ;
    public final EObject entryRulePrim() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrim = null;


        try {
            // InternalHemDsl.g:640:45: (iv_rulePrim= rulePrim EOF )
            // InternalHemDsl.g:641:2: iv_rulePrim= rulePrim EOF
            {
             newCompositeNode(grammarAccess.getPrimRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrim=rulePrim();

            state._fsp--;

             current =iv_rulePrim; 
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
    // $ANTLR end "entryRulePrim"


    // $ANTLR start "rulePrim"
    // InternalHemDsl.g:647:1: rulePrim returns [EObject current=null] : ( ( (lv_timeCond_0_0= ruleTimeCond ) ) | ( (lv_priceCond_1_0= rulePriceCond ) ) | ( (lv_occCond_2_0= ruleOccCond ) ) | (otherlv_3= '(' ( (lv_subExpr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrim() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_timeCond_0_0 = null;

        EObject lv_priceCond_1_0 = null;

        EObject lv_occCond_2_0 = null;

        EObject lv_subExpr_4_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:653:2: ( ( ( (lv_timeCond_0_0= ruleTimeCond ) ) | ( (lv_priceCond_1_0= rulePriceCond ) ) | ( (lv_occCond_2_0= ruleOccCond ) ) | (otherlv_3= '(' ( (lv_subExpr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) )
            // InternalHemDsl.g:654:2: ( ( (lv_timeCond_0_0= ruleTimeCond ) ) | ( (lv_priceCond_1_0= rulePriceCond ) ) | ( (lv_occCond_2_0= ruleOccCond ) ) | (otherlv_3= '(' ( (lv_subExpr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            {
            // InternalHemDsl.g:654:2: ( ( (lv_timeCond_0_0= ruleTimeCond ) ) | ( (lv_priceCond_1_0= rulePriceCond ) ) | ( (lv_occCond_2_0= ruleOccCond ) ) | (otherlv_3= '(' ( (lv_subExpr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHemDsl.g:655:3: ( (lv_timeCond_0_0= ruleTimeCond ) )
                    {
                    // InternalHemDsl.g:655:3: ( (lv_timeCond_0_0= ruleTimeCond ) )
                    // InternalHemDsl.g:656:4: (lv_timeCond_0_0= ruleTimeCond )
                    {
                    // InternalHemDsl.g:656:4: (lv_timeCond_0_0= ruleTimeCond )
                    // InternalHemDsl.g:657:5: lv_timeCond_0_0= ruleTimeCond
                    {

                    					newCompositeNode(grammarAccess.getPrimAccess().getTimeCondTimeCondParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_timeCond_0_0=ruleTimeCond();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimRule());
                    					}
                    					set(
                    						current,
                    						"timeCond",
                    						lv_timeCond_0_0,
                    						"org.homeenergy.HemDsl.TimeCond");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHemDsl.g:675:3: ( (lv_priceCond_1_0= rulePriceCond ) )
                    {
                    // InternalHemDsl.g:675:3: ( (lv_priceCond_1_0= rulePriceCond ) )
                    // InternalHemDsl.g:676:4: (lv_priceCond_1_0= rulePriceCond )
                    {
                    // InternalHemDsl.g:676:4: (lv_priceCond_1_0= rulePriceCond )
                    // InternalHemDsl.g:677:5: lv_priceCond_1_0= rulePriceCond
                    {

                    					newCompositeNode(grammarAccess.getPrimAccess().getPriceCondPriceCondParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_priceCond_1_0=rulePriceCond();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimRule());
                    					}
                    					set(
                    						current,
                    						"priceCond",
                    						lv_priceCond_1_0,
                    						"org.homeenergy.HemDsl.PriceCond");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHemDsl.g:695:3: ( (lv_occCond_2_0= ruleOccCond ) )
                    {
                    // InternalHemDsl.g:695:3: ( (lv_occCond_2_0= ruleOccCond ) )
                    // InternalHemDsl.g:696:4: (lv_occCond_2_0= ruleOccCond )
                    {
                    // InternalHemDsl.g:696:4: (lv_occCond_2_0= ruleOccCond )
                    // InternalHemDsl.g:697:5: lv_occCond_2_0= ruleOccCond
                    {

                    					newCompositeNode(grammarAccess.getPrimAccess().getOccCondOccCondParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_occCond_2_0=ruleOccCond();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimRule());
                    					}
                    					set(
                    						current,
                    						"occCond",
                    						lv_occCond_2_0,
                    						"org.homeenergy.HemDsl.OccCond");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalHemDsl.g:715:3: (otherlv_3= '(' ( (lv_subExpr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    {
                    // InternalHemDsl.g:715:3: (otherlv_3= '(' ( (lv_subExpr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    // InternalHemDsl.g:716:4: otherlv_3= '(' ( (lv_subExpr_4_0= ruleExpr ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalHemDsl.g:720:4: ( (lv_subExpr_4_0= ruleExpr ) )
                    // InternalHemDsl.g:721:5: (lv_subExpr_4_0= ruleExpr )
                    {
                    // InternalHemDsl.g:721:5: (lv_subExpr_4_0= ruleExpr )
                    // InternalHemDsl.g:722:6: lv_subExpr_4_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getPrimAccess().getSubExprExprParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_subExpr_4_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimRule());
                    						}
                    						set(
                    							current,
                    							"subExpr",
                    							lv_subExpr_4_0,
                    							"org.homeenergy.HemDsl.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "rulePrim"


    // $ANTLR start "entryRuleTimeCond"
    // InternalHemDsl.g:748:1: entryRuleTimeCond returns [EObject current=null] : iv_ruleTimeCond= ruleTimeCond EOF ;
    public final EObject entryRuleTimeCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeCond = null;


        try {
            // InternalHemDsl.g:748:49: (iv_ruleTimeCond= ruleTimeCond EOF )
            // InternalHemDsl.g:749:2: iv_ruleTimeCond= ruleTimeCond EOF
            {
             newCompositeNode(grammarAccess.getTimeCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeCond=ruleTimeCond();

            state._fsp--;

             current =iv_ruleTimeCond; 
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
    // $ANTLR end "entryRuleTimeCond"


    // $ANTLR start "ruleTimeCond"
    // InternalHemDsl.g:755:1: ruleTimeCond returns [EObject current=null] : (otherlv_0= 'time' ( (otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) ) ) | (otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) ) ) ) ) ;
    public final EObject ruleTimeCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;
        Token lv_start_4_0=null;
        Token otherlv_5=null;
        Token lv_end_6_0=null;


        	enterRule();

        try {
            // InternalHemDsl.g:761:2: ( (otherlv_0= 'time' ( (otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) ) ) | (otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) ) ) ) ) )
            // InternalHemDsl.g:762:2: (otherlv_0= 'time' ( (otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) ) ) | (otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) ) ) ) )
            {
            // InternalHemDsl.g:762:2: (otherlv_0= 'time' ( (otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) ) ) | (otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) ) ) ) )
            // InternalHemDsl.g:763:3: otherlv_0= 'time' ( (otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) ) ) | (otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeCondAccess().getTimeKeyword_0());
            		
            // InternalHemDsl.g:767:3: ( (otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) ) ) | (otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHemDsl.g:768:4: (otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) ) )
                    {
                    // InternalHemDsl.g:768:4: (otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) ) )
                    // InternalHemDsl.g:769:5: otherlv_1= '=' ( (lv_time_2_0= RULE_TIME_LIT ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_20); 

                    					newLeafNode(otherlv_1, grammarAccess.getTimeCondAccess().getEqualsSignKeyword_1_0_0());
                    				
                    // InternalHemDsl.g:773:5: ( (lv_time_2_0= RULE_TIME_LIT ) )
                    // InternalHemDsl.g:774:6: (lv_time_2_0= RULE_TIME_LIT )
                    {
                    // InternalHemDsl.g:774:6: (lv_time_2_0= RULE_TIME_LIT )
                    // InternalHemDsl.g:775:7: lv_time_2_0= RULE_TIME_LIT
                    {
                    lv_time_2_0=(Token)match(input,RULE_TIME_LIT,FOLLOW_2); 

                    							newLeafNode(lv_time_2_0, grammarAccess.getTimeCondAccess().getTimeTIME_LITTerminalRuleCall_1_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTimeCondRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"time",
                    								lv_time_2_0,
                    								"org.homeenergy.HemDsl.TIME_LIT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHemDsl.g:793:4: (otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) ) )
                    {
                    // InternalHemDsl.g:793:4: (otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) ) )
                    // InternalHemDsl.g:794:5: otherlv_3= 'between' ( (lv_start_4_0= RULE_TIME_LIT ) ) otherlv_5= 'to' ( (lv_end_6_0= RULE_TIME_LIT ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_20); 

                    					newLeafNode(otherlv_3, grammarAccess.getTimeCondAccess().getBetweenKeyword_1_1_0());
                    				
                    // InternalHemDsl.g:798:5: ( (lv_start_4_0= RULE_TIME_LIT ) )
                    // InternalHemDsl.g:799:6: (lv_start_4_0= RULE_TIME_LIT )
                    {
                    // InternalHemDsl.g:799:6: (lv_start_4_0= RULE_TIME_LIT )
                    // InternalHemDsl.g:800:7: lv_start_4_0= RULE_TIME_LIT
                    {
                    lv_start_4_0=(Token)match(input,RULE_TIME_LIT,FOLLOW_14); 

                    							newLeafNode(lv_start_4_0, grammarAccess.getTimeCondAccess().getStartTIME_LITTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTimeCondRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"start",
                    								lv_start_4_0,
                    								"org.homeenergy.HemDsl.TIME_LIT");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_20); 

                    					newLeafNode(otherlv_5, grammarAccess.getTimeCondAccess().getToKeyword_1_1_2());
                    				
                    // InternalHemDsl.g:820:5: ( (lv_end_6_0= RULE_TIME_LIT ) )
                    // InternalHemDsl.g:821:6: (lv_end_6_0= RULE_TIME_LIT )
                    {
                    // InternalHemDsl.g:821:6: (lv_end_6_0= RULE_TIME_LIT )
                    // InternalHemDsl.g:822:7: lv_end_6_0= RULE_TIME_LIT
                    {
                    lv_end_6_0=(Token)match(input,RULE_TIME_LIT,FOLLOW_2); 

                    							newLeafNode(lv_end_6_0, grammarAccess.getTimeCondAccess().getEndTIME_LITTerminalRuleCall_1_1_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTimeCondRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"end",
                    								lv_end_6_0,
                    								"org.homeenergy.HemDsl.TIME_LIT");
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTimeCond"


    // $ANTLR start "entryRulePriceCond"
    // InternalHemDsl.g:844:1: entryRulePriceCond returns [EObject current=null] : iv_rulePriceCond= rulePriceCond EOF ;
    public final EObject entryRulePriceCond() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriceCond = null;


        try {
            // InternalHemDsl.g:844:50: (iv_rulePriceCond= rulePriceCond EOF )
            // InternalHemDsl.g:845:2: iv_rulePriceCond= rulePriceCond EOF
            {
             newCompositeNode(grammarAccess.getPriceCondRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePriceCond=rulePriceCond();

            state._fsp--;

             current =iv_rulePriceCond; 
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
    // $ANTLR end "entryRulePriceCond"


    // $ANTLR start "rulePriceCond"
    // InternalHemDsl.g:851:1: rulePriceCond returns [EObject current=null] : (otherlv_0= 'price' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_NUMBER ) ) ) ;
    public final EObject rulePriceCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:857:2: ( (otherlv_0= 'price' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_NUMBER ) ) ) )
            // InternalHemDsl.g:858:2: (otherlv_0= 'price' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )
            {
            // InternalHemDsl.g:858:2: (otherlv_0= 'price' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )
            // InternalHemDsl.g:859:3: otherlv_0= 'price' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_NUMBER ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getPriceCondAccess().getPriceKeyword_0());
            		
            // InternalHemDsl.g:863:3: ( (lv_op_1_0= ruleRelOp ) )
            // InternalHemDsl.g:864:4: (lv_op_1_0= ruleRelOp )
            {
            // InternalHemDsl.g:864:4: (lv_op_1_0= ruleRelOp )
            // InternalHemDsl.g:865:5: lv_op_1_0= ruleRelOp
            {

            					newCompositeNode(grammarAccess.getPriceCondAccess().getOpRelOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_op_1_0=ruleRelOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPriceCondRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.homeenergy.HemDsl.RelOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHemDsl.g:882:3: ( (lv_value_2_0= RULE_NUMBER ) )
            // InternalHemDsl.g:883:4: (lv_value_2_0= RULE_NUMBER )
            {
            // InternalHemDsl.g:883:4: (lv_value_2_0= RULE_NUMBER )
            // InternalHemDsl.g:884:5: lv_value_2_0= RULE_NUMBER
            {
            lv_value_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getPriceCondAccess().getValueNUMBERTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPriceCondRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.homeenergy.HemDsl.NUMBER");
            				

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
    // $ANTLR end "rulePriceCond"


    // $ANTLR start "entryRuleOccCond"
    // InternalHemDsl.g:904:1: entryRuleOccCond returns [EObject current=null] : iv_ruleOccCond= ruleOccCond EOF ;
    public final EObject entryRuleOccCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccCond = null;


        try {
            // InternalHemDsl.g:904:48: (iv_ruleOccCond= ruleOccCond EOF )
            // InternalHemDsl.g:905:2: iv_ruleOccCond= ruleOccCond EOF
            {
             newCompositeNode(grammarAccess.getOccCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccCond=ruleOccCond();

            state._fsp--;

             current =iv_ruleOccCond; 
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
    // $ANTLR end "entryRuleOccCond"


    // $ANTLR start "ruleOccCond"
    // InternalHemDsl.g:911:1: ruleOccCond returns [EObject current=null] : (otherlv_0= 'occupancy' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleOccCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalHemDsl.g:917:2: ( (otherlv_0= 'occupancy' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalHemDsl.g:918:2: (otherlv_0= 'occupancy' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalHemDsl.g:918:2: (otherlv_0= 'occupancy' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalHemDsl.g:919:3: otherlv_0= 'occupancy' ( (lv_op_1_0= ruleRelOp ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getOccCondAccess().getOccupancyKeyword_0());
            		
            // InternalHemDsl.g:923:3: ( (lv_op_1_0= ruleRelOp ) )
            // InternalHemDsl.g:924:4: (lv_op_1_0= ruleRelOp )
            {
            // InternalHemDsl.g:924:4: (lv_op_1_0= ruleRelOp )
            // InternalHemDsl.g:925:5: lv_op_1_0= ruleRelOp
            {

            					newCompositeNode(grammarAccess.getOccCondAccess().getOpRelOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_op_1_0=ruleRelOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOccCondRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.homeenergy.HemDsl.RelOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHemDsl.g:942:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalHemDsl.g:943:4: (lv_value_2_0= RULE_INT )
            {
            // InternalHemDsl.g:943:4: (lv_value_2_0= RULE_INT )
            // InternalHemDsl.g:944:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getOccCondAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOccCondRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleOccCond"


    // $ANTLR start "entryRuleRelOp"
    // InternalHemDsl.g:964:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // InternalHemDsl.g:964:45: (iv_ruleRelOp= ruleRelOp EOF )
            // InternalHemDsl.g:965:2: iv_ruleRelOp= ruleRelOp EOF
            {
             newCompositeNode(grammarAccess.getRelOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelOp=ruleRelOp();

            state._fsp--;

             current =iv_ruleRelOp.getText(); 
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
    // $ANTLR end "entryRuleRelOp"


    // $ANTLR start "ruleRelOp"
    // InternalHemDsl.g:971:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHemDsl.g:977:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) )
            // InternalHemDsl.g:978:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' )
            {
            // InternalHemDsl.g:978:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt10=1;
                }
                break;
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            case 39:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHemDsl.g:979:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHemDsl.g:985:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHemDsl.g:991:3: kw= '>='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHemDsl.g:997:3: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalHemDsl.g:1003:3: kw= '=='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getEqualsSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalHemDsl.g:1009:3: kw= '!='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getExclamationMarkEqualsSignKeyword_5());
                    		

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
    // $ANTLR end "ruleRelOp"


    // $ANTLR start "ruleApplianceType"
    // InternalHemDsl.g:1018:1: ruleApplianceType returns [Enumerator current=null] : ( (enumLiteral_0= 'HVAC' ) | (enumLiteral_1= 'WaterHeater' ) | (enumLiteral_2= 'Washer' ) | (enumLiteral_3= 'Dryer' ) | (enumLiteral_4= 'Light' ) ) ;
    public final Enumerator ruleApplianceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHemDsl.g:1024:2: ( ( (enumLiteral_0= 'HVAC' ) | (enumLiteral_1= 'WaterHeater' ) | (enumLiteral_2= 'Washer' ) | (enumLiteral_3= 'Dryer' ) | (enumLiteral_4= 'Light' ) ) )
            // InternalHemDsl.g:1025:2: ( (enumLiteral_0= 'HVAC' ) | (enumLiteral_1= 'WaterHeater' ) | (enumLiteral_2= 'Washer' ) | (enumLiteral_3= 'Dryer' ) | (enumLiteral_4= 'Light' ) )
            {
            // InternalHemDsl.g:1025:2: ( (enumLiteral_0= 'HVAC' ) | (enumLiteral_1= 'WaterHeater' ) | (enumLiteral_2= 'Washer' ) | (enumLiteral_3= 'Dryer' ) | (enumLiteral_4= 'Light' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalHemDsl.g:1026:3: (enumLiteral_0= 'HVAC' )
                    {
                    // InternalHemDsl.g:1026:3: (enumLiteral_0= 'HVAC' )
                    // InternalHemDsl.g:1027:4: enumLiteral_0= 'HVAC'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getApplianceTypeAccess().getHVACEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getApplianceTypeAccess().getHVACEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHemDsl.g:1034:3: (enumLiteral_1= 'WaterHeater' )
                    {
                    // InternalHemDsl.g:1034:3: (enumLiteral_1= 'WaterHeater' )
                    // InternalHemDsl.g:1035:4: enumLiteral_1= 'WaterHeater'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getApplianceTypeAccess().getWaterHeaterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getApplianceTypeAccess().getWaterHeaterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHemDsl.g:1042:3: (enumLiteral_2= 'Washer' )
                    {
                    // InternalHemDsl.g:1042:3: (enumLiteral_2= 'Washer' )
                    // InternalHemDsl.g:1043:4: enumLiteral_2= 'Washer'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getApplianceTypeAccess().getWasherEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getApplianceTypeAccess().getWasherEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHemDsl.g:1050:3: (enumLiteral_3= 'Dryer' )
                    {
                    // InternalHemDsl.g:1050:3: (enumLiteral_3= 'Dryer' )
                    // InternalHemDsl.g:1051:4: enumLiteral_3= 'Dryer'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getApplianceTypeAccess().getDryerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getApplianceTypeAccess().getDryerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHemDsl.g:1058:3: (enumLiteral_4= 'Light' )
                    {
                    // InternalHemDsl.g:1058:3: (enumLiteral_4= 'Light' )
                    // InternalHemDsl.g:1059:4: enumLiteral_4= 'Light'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getApplianceTypeAccess().getLightEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getApplianceTypeAccess().getLightEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleApplianceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000328000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});

}