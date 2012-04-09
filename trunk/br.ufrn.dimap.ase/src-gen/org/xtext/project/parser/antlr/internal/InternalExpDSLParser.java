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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'end'", "'Experimental Plan'", "'General Questions'", "'{'", "'}'", "'metrics'", "'Specific Questions'", "'Activity'", "'Task'", "'Role'", "'Design'", "'type'", "'Factor'", "'Level'", "'Metric'", "'relates'", "'description'", "'form'", "'id'", "'unit'", "'activityBegin'", "'activityEnd'", "'activities'", "'Question'", "'required'", "'CRD \\u2013 Completely Randomized Design'", "'RCBD \\u2013 Randomized Complete Block Design'", "'LS \\u2013 Latin Square'", "'ComboBox'", "'CheckBoxes'", "'OptionButtons'", "'hardData'", "'softData'", "'normalizedData'", "'continuous'", "'intercalated'", "'minutes'", "'uc'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalExpDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleExperimentElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:80:28: ( ( (lv_elements_0_0= ruleExperimentElement ) )* )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:81:1: ( (lv_elements_0_0= ruleExperimentElement ) )*
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:81:1: ( (lv_elements_0_0= ruleExperimentElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:82:1: (lv_elements_0_0= ruleExperimentElement )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:82:1: (lv_elements_0_0= ruleExperimentElement )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:83:3: lv_elements_0_0= ruleExperimentElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsExperimentElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExperimentElement_in_ruleModel130);
            	    lv_elements_0_0=ruleExperimentElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"ExperimentElement");
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


    // $ANTLR start "entryRuleExperimentElement"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:107:1: entryRuleExperimentElement returns [EObject current=null] : iv_ruleExperimentElement= ruleExperimentElement EOF ;
    public final EObject entryRuleExperimentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentElement = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:108:2: (iv_ruleExperimentElement= ruleExperimentElement EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:109:2: iv_ruleExperimentElement= ruleExperimentElement EOF
            {
             newCompositeNode(grammarAccess.getExperimentElementRule()); 
            pushFollow(FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement166);
            iv_ruleExperimentElement=ruleExperimentElement();

            state._fsp--;

             current =iv_ruleExperimentElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentElement176); 

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
    // $ANTLR end "entryRuleExperimentElement"


    // $ANTLR start "ruleExperimentElement"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:116:1: ruleExperimentElement returns [EObject current=null] : ( (otherlv_0= 'Process' ( (lv_process_1_0= ruleProcess ) )* otherlv_2= 'end' ) (otherlv_3= 'Experimental Plan' ( (lv_experiments_4_0= ruleExperimentalPlan ) )* )? (otherlv_5= 'General Questions' ( (lv_question_6_0= ruleQuestion ) )* )? ) ;
    public final EObject ruleExperimentElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_process_1_0 = null;

        EObject lv_experiments_4_0 = null;

        EObject lv_question_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:119:28: ( ( (otherlv_0= 'Process' ( (lv_process_1_0= ruleProcess ) )* otherlv_2= 'end' ) (otherlv_3= 'Experimental Plan' ( (lv_experiments_4_0= ruleExperimentalPlan ) )* )? (otherlv_5= 'General Questions' ( (lv_question_6_0= ruleQuestion ) )* )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:1: ( (otherlv_0= 'Process' ( (lv_process_1_0= ruleProcess ) )* otherlv_2= 'end' ) (otherlv_3= 'Experimental Plan' ( (lv_experiments_4_0= ruleExperimentalPlan ) )* )? (otherlv_5= 'General Questions' ( (lv_question_6_0= ruleQuestion ) )* )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:1: ( (otherlv_0= 'Process' ( (lv_process_1_0= ruleProcess ) )* otherlv_2= 'end' ) (otherlv_3= 'Experimental Plan' ( (lv_experiments_4_0= ruleExperimentalPlan ) )* )? (otherlv_5= 'General Questions' ( (lv_question_6_0= ruleQuestion ) )* )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:2: (otherlv_0= 'Process' ( (lv_process_1_0= ruleProcess ) )* otherlv_2= 'end' ) (otherlv_3= 'Experimental Plan' ( (lv_experiments_4_0= ruleExperimentalPlan ) )* )? (otherlv_5= 'General Questions' ( (lv_question_6_0= ruleQuestion ) )* )?
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:2: (otherlv_0= 'Process' ( (lv_process_1_0= ruleProcess ) )* otherlv_2= 'end' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:4: otherlv_0= 'Process' ( (lv_process_1_0= ruleProcess ) )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleExperimentElement214); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentElementAccess().getProcessKeyword_0_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:124:1: ( (lv_process_1_0= ruleProcess ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:125:1: (lv_process_1_0= ruleProcess )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:125:1: (lv_process_1_0= ruleProcess )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:126:3: lv_process_1_0= ruleProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getProcessProcessParserRuleCall_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcess_in_ruleExperimentElement235);
            	    lv_process_1_0=ruleProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"process",
            	            		lv_process_1_0, 
            	            		"Process");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExperimentElement248); 

                	newLeafNode(otherlv_2, grammarAccess.getExperimentElementAccess().getEndKeyword_0_2());
                

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:146:2: (otherlv_3= 'Experimental Plan' ( (lv_experiments_4_0= ruleExperimentalPlan ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:146:4: otherlv_3= 'Experimental Plan' ( (lv_experiments_4_0= ruleExperimentalPlan ) )*
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleExperimentElement262); 

                        	newLeafNode(otherlv_3, grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:150:1: ( (lv_experiments_4_0= ruleExperimentalPlan ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:151:1: (lv_experiments_4_0= ruleExperimentalPlan )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:151:1: (lv_experiments_4_0= ruleExperimentalPlan )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:152:3: lv_experiments_4_0= ruleExperimentalPlan
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getExperimentsExperimentalPlanParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement283);
                    	    lv_experiments_4_0=ruleExperimentalPlan();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"experiments",
                    	            		lv_experiments_4_0, 
                    	            		"ExperimentalPlan");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:168:5: (otherlv_5= 'General Questions' ( (lv_question_6_0= ruleQuestion ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:168:7: otherlv_5= 'General Questions' ( (lv_question_6_0= ruleQuestion ) )*
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleExperimentElement299); 

                        	newLeafNode(otherlv_5, grammarAccess.getExperimentElementAccess().getGeneralQuestionsKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:172:1: ( (lv_question_6_0= ruleQuestion ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==35) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:173:1: (lv_question_6_0= ruleQuestion )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:173:1: (lv_question_6_0= ruleQuestion )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:174:3: lv_question_6_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getQuestionQuestionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQuestion_in_ruleExperimentElement320);
                    	    lv_question_6_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"question",
                    	            		lv_question_6_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


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
    // $ANTLR end "ruleExperimentElement"


    // $ANTLR start "entryRuleProcess"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:198:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:199:2: (iv_ruleProcess= ruleProcess EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:200:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess359);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess369); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:207:1: ruleProcess returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= '}' ) (otherlv_4= 'metrics' ( (lv_metrics_5_0= ruleMetrics ) )* otherlv_6= 'end' )? (otherlv_7= 'Specific Questions' ( (lv_question_8_0= ruleQuestion ) )* otherlv_9= 'end' )? ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_activities_2_0 = null;

        EObject lv_metrics_5_0 = null;

        EObject lv_question_8_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:210:28: ( ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= '}' ) (otherlv_4= 'metrics' ( (lv_metrics_5_0= ruleMetrics ) )* otherlv_6= 'end' )? (otherlv_7= 'Specific Questions' ( (lv_question_8_0= ruleQuestion ) )* otherlv_9= 'end' )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:211:1: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= '}' ) (otherlv_4= 'metrics' ( (lv_metrics_5_0= ruleMetrics ) )* otherlv_6= 'end' )? (otherlv_7= 'Specific Questions' ( (lv_question_8_0= ruleQuestion ) )* otherlv_9= 'end' )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:211:1: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= '}' ) (otherlv_4= 'metrics' ( (lv_metrics_5_0= ruleMetrics ) )* otherlv_6= 'end' )? (otherlv_7= 'Specific Questions' ( (lv_question_8_0= ruleQuestion ) )* otherlv_9= 'end' )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:211:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= '}' ) (otherlv_4= 'metrics' ( (lv_metrics_5_0= ruleMetrics ) )* otherlv_6= 'end' )? (otherlv_7= 'Specific Questions' ( (lv_question_8_0= ruleQuestion ) )* otherlv_9= 'end' )?
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:211:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:211:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= '}'
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:211:3: ( (lv_name_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:212:1: (lv_name_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:212:1: (lv_name_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:213:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcess412); 

            			newLeafNode(lv_name_0_0, grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_0_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleProcess429); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_0_1());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:233:1: ( (lv_activities_2_0= ruleActivity ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:234:1: (lv_activities_2_0= ruleActivity )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:234:1: (lv_activities_2_0= ruleActivity )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:235:3: lv_activities_2_0= ruleActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getActivitiesActivityParserRuleCall_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleProcess450);
            	    lv_activities_2_0=ruleActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_2_0, 
            	            		"Activity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleProcess463); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_0_3());
                

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:255:2: (otherlv_4= 'metrics' ( (lv_metrics_5_0= ruleMetrics ) )* otherlv_6= 'end' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:255:4: otherlv_4= 'metrics' ( (lv_metrics_5_0= ruleMetrics ) )* otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleProcess477); 

                        	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getMetricsKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:259:1: ( (lv_metrics_5_0= ruleMetrics ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==26) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:260:1: (lv_metrics_5_0= ruleMetrics )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:260:1: (lv_metrics_5_0= ruleMetrics )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:261:3: lv_metrics_5_0= ruleMetrics
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getMetricsMetricsParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetrics_in_ruleProcess498);
                    	    lv_metrics_5_0=ruleMetrics();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"metrics",
                    	            		lv_metrics_5_0, 
                    	            		"Metrics");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleProcess511); 

                        	newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:281:3: (otherlv_7= 'Specific Questions' ( (lv_question_8_0= ruleQuestion ) )* otherlv_9= 'end' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:281:5: otherlv_7= 'Specific Questions' ( (lv_question_8_0= ruleQuestion ) )* otherlv_9= 'end'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleProcess526); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getSpecificQuestionsKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:285:1: ( (lv_question_8_0= ruleQuestion ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==35) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:286:1: (lv_question_8_0= ruleQuestion )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:286:1: (lv_question_8_0= ruleQuestion )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:287:3: lv_question_8_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getQuestionQuestionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQuestion_in_ruleProcess547);
                    	    lv_question_8_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"question",
                    	            		lv_question_8_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleProcess560); 

                        	newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getEndKeyword_2_2());
                        

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleActivity"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:315:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:316:2: (iv_ruleActivity= ruleActivity EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:317:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity598);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity608); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:324:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_next_3_0= RULE_ID ) )? ( (lv_role_4_0= ruleRole ) )* (otherlv_5= '{' ( (lv_tasks_6_0= ruleTask ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_name_2_0=null;
        Token lv_next_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_role_4_0 = null;

        EObject lv_tasks_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:327:28: ( (otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_next_3_0= RULE_ID ) )? ( (lv_role_4_0= ruleRole ) )* (otherlv_5= '{' ( (lv_tasks_6_0= ruleTask ) )* otherlv_7= '}' )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:328:1: (otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_next_3_0= RULE_ID ) )? ( (lv_role_4_0= ruleRole ) )* (otherlv_5= '{' ( (lv_tasks_6_0= ruleTask ) )* otherlv_7= '}' )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:328:1: (otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_next_3_0= RULE_ID ) )? ( (lv_role_4_0= ruleRole ) )* (otherlv_5= '{' ( (lv_tasks_6_0= ruleTask ) )* otherlv_7= '}' )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:328:3: otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_next_3_0= RULE_ID ) )? ( (lv_role_4_0= ruleRole ) )* (otherlv_5= '{' ( (lv_tasks_6_0= ruleTask ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleActivity645); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:332:1: ( (lv_id_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:333:1: (lv_id_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:333:1: (lv_id_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:334:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity662); 

            			newLeafNode(lv_id_1_0, grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:350:2: ( (lv_name_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:351:1: (lv_name_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:351:1: (lv_name_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:352:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity684); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:368:2: ( (lv_next_3_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:369:1: (lv_next_3_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:369:1: (lv_next_3_0= RULE_ID )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:370:3: lv_next_3_0= RULE_ID
                    {
                    lv_next_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity706); 

                    			newLeafNode(lv_next_3_0, grammarAccess.getActivityAccess().getNextIDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"next",
                            		lv_next_3_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:386:3: ( (lv_role_4_0= ruleRole ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:387:1: (lv_role_4_0= ruleRole )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:387:1: (lv_role_4_0= ruleRole )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:388:3: lv_role_4_0= ruleRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityAccess().getRoleRoleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRole_in_ruleActivity733);
            	    lv_role_4_0=ruleRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"role",
            	            		lv_role_4_0, 
            	            		"Role");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:404:3: (otherlv_5= '{' ( (lv_tasks_6_0= ruleTask ) )* otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:404:5: otherlv_5= '{' ( (lv_tasks_6_0= ruleTask ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleActivity747); 

                        	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:408:1: ( (lv_tasks_6_0= ruleTask ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==20) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:409:1: (lv_tasks_6_0= ruleTask )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:409:1: (lv_tasks_6_0= ruleTask )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:410:3: lv_tasks_6_0= ruleTask
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTasksTaskParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTask_in_ruleActivity768);
                    	    lv_tasks_6_0=ruleTask();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tasks",
                    	            		lv_tasks_6_0, 
                    	            		"Task");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleActivity781); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_2());
                        

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleTask"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:438:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:439:2: (iv_ruleTask= ruleTask EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:440:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask819);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask829); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:447:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:450:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:451:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:451:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:451:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleTask866); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:455:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:456:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:456:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:457:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask883); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleRole"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:481:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:482:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:483:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole924);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole934); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:490:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:493:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:494:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:494:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:494:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRole971); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:498:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:499:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:499:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:500:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRole988); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleExperimentalPlan"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:524:1: entryRuleExperimentalPlan returns [EObject current=null] : iv_ruleExperimentalPlan= ruleExperimentalPlan EOF ;
    public final EObject entryRuleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentalPlan = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:525:2: (iv_ruleExperimentalPlan= ruleExperimentalPlan EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:526:2: iv_ruleExperimentalPlan= ruleExperimentalPlan EOF
            {
             newCompositeNode(grammarAccess.getExperimentalPlanRule()); 
            pushFollow(FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan1029);
            iv_ruleExperimentalPlan=ruleExperimentalPlan();

            state._fsp--;

             current =iv_ruleExperimentalPlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentalPlan1039); 

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
    // $ANTLR end "entryRuleExperimentalPlan"


    // $ANTLR start "ruleExperimentalPlan"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:533:1: ruleExperimentalPlan returns [EObject current=null] : (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_factor_5_0= ruleFactor ) )* otherlv_6= '}' ) ;
    public final EObject ruleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_factor_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:536:28: ( (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_factor_5_0= ruleFactor ) )* otherlv_6= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:537:1: (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_factor_5_0= ruleFactor ) )* otherlv_6= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:537:1: (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_factor_5_0= ruleFactor ) )* otherlv_6= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:537:3: otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_factor_5_0= ruleFactor ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleExperimentalPlan1076); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentalPlanAccess().getDesignKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:541:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:542:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:542:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:543:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExperimentalPlan1093); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExperimentalPlanAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentalPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleExperimentalPlan1110); 

                	newLeafNode(otherlv_2, grammarAccess.getExperimentalPlanAccess().getTypeKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:563:1: ( (lv_type_3_0= ruleDesignType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:564:1: (lv_type_3_0= ruleDesignType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:564:1: (lv_type_3_0= ruleDesignType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:565:3: lv_type_3_0= ruleDesignType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignType_in_ruleExperimentalPlan1131);
            lv_type_3_0=ruleDesignType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"DesignType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalPlan1143); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:585:1: ( (lv_factor_5_0= ruleFactor ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:586:1: (lv_factor_5_0= ruleFactor )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:586:1: (lv_factor_5_0= ruleFactor )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:587:3: lv_factor_5_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleExperimentalPlan1164);
            	    lv_factor_5_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factor",
            	            		lv_factor_5_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan1177); 

                	newLeafNode(otherlv_6, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleExperimentalPlan"


    // $ANTLR start "entryRuleFactor"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:615:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:616:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:617:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1213);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1223); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:624:1: ruleFactor returns [EObject current=null] : (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleLevels ) )* otherlv_4= '}' ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_level_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:627:28: ( (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleLevels ) )* otherlv_4= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:628:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleLevels ) )* otherlv_4= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:628:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleLevels ) )* otherlv_4= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:628:3: otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleLevels ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleFactor1260); 

                	newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getFactorKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:632:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:633:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:633:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:634:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFactor1277); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFactorAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFactorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFactor1294); 

                	newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:654:1: ( (lv_level_3_0= ruleLevels ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:655:1: (lv_level_3_0= ruleLevels )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:655:1: (lv_level_3_0= ruleLevels )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:656:3: lv_level_3_0= ruleLevels
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLevels_in_ruleFactor1315);
            	    lv_level_3_0=ruleLevels();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"level",
            	            		lv_level_3_0, 
            	            		"Levels");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFactor1328); 

                	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleLevels"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:684:1: entryRuleLevels returns [EObject current=null] : iv_ruleLevels= ruleLevels EOF ;
    public final EObject entryRuleLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevels = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:685:2: (iv_ruleLevels= ruleLevels EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:686:2: iv_ruleLevels= ruleLevels EOF
            {
             newCompositeNode(grammarAccess.getLevelsRule()); 
            pushFollow(FOLLOW_ruleLevels_in_entryRuleLevels1364);
            iv_ruleLevels=ruleLevels();

            state._fsp--;

             current =iv_ruleLevels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevels1374); 

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
    // $ANTLR end "entryRuleLevels"


    // $ANTLR start "ruleLevels"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:693:1: ruleLevels returns [EObject current=null] : (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:696:28: ( (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:697:1: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:697:1: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:697:3: otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleLevels1411); 

                	newLeafNode(otherlv_0, grammarAccess.getLevelsAccess().getLevelKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:701:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:702:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:702:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:703:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLevels1428); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLevelsAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLevelsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleLevels"


    // $ANTLR start "entryRuleMetrics"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:727:1: entryRuleMetrics returns [EObject current=null] : iv_ruleMetrics= ruleMetrics EOF ;
    public final EObject entryRuleMetrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrics = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:728:2: (iv_ruleMetrics= ruleMetrics EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:729:2: iv_ruleMetrics= ruleMetrics EOF
            {
             newCompositeNode(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_ruleMetrics_in_entryRuleMetrics1469);
            iv_ruleMetrics=ruleMetrics();

            state._fsp--;

             current =iv_ruleMetrics; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetrics1479); 

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
    // $ANTLR end "entryRuleMetrics"


    // $ANTLR start "ruleMetrics"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:736:1: ruleMetrics returns [EObject current=null] : (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric ) ;
    public final EObject ruleMetrics() throws RecognitionException {
        EObject current = null;

        EObject this_ActivityMetric_0 = null;

        EObject this_TaskMetric_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:739:28: ( (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:740:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:740:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:741:5: this_ActivityMetric_0= ruleActivityMetric
                    {
                     
                            newCompositeNode(grammarAccess.getMetricsAccess().getActivityMetricParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivityMetric_in_ruleMetrics1526);
                    this_ActivityMetric_0=ruleActivityMetric();

                    state._fsp--;

                     
                            current = this_ActivityMetric_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:751:5: this_TaskMetric_1= ruleTaskMetric
                    {
                     
                            newCompositeNode(grammarAccess.getMetricsAccess().getTaskMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTaskMetric_in_ruleMetrics1553);
                    this_TaskMetric_1=ruleTaskMetric();

                    state._fsp--;

                     
                            current = this_TaskMetric_1; 
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
    // $ANTLR end "ruleMetrics"


    // $ANTLR start "entryRuleActivityMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:767:1: entryRuleActivityMetric returns [EObject current=null] : iv_ruleActivityMetric= ruleActivityMetric EOF ;
    public final EObject entryRuleActivityMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityMetric = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:768:2: (iv_ruleActivityMetric= ruleActivityMetric EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:769:2: iv_ruleActivityMetric= ruleActivityMetric EOF
            {
             newCompositeNode(grammarAccess.getActivityMetricRule()); 
            pushFollow(FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric1588);
            iv_ruleActivityMetric=ruleActivityMetric();

            state._fsp--;

             current =iv_ruleActivityMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityMetric1598); 

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
    // $ANTLR end "entryRuleActivityMetric"


    // $ANTLR start "ruleActivityMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:776:1: ruleActivityMetric returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activityBegin' ( (lv_activityBegin_16_0= RULE_STRING ) ) ) (otherlv_17= 'activityEnd' ( (lv_activityEnd_18_0= RULE_STRING ) ) ) otherlv_19= '}' ) ;
    public final EObject ruleActivityMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_processName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_id_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_activityBegin_16_0=null;
        Token otherlv_17=null;
        Token lv_activityEnd_18_0=null;
        Token otherlv_19=null;
        Enumerator lv_type_8_0 = null;

        Enumerator lv_form_10_0 = null;

        Enumerator lv_unit_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:779:28: ( (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activityBegin' ( (lv_activityBegin_16_0= RULE_STRING ) ) ) (otherlv_17= 'activityEnd' ( (lv_activityEnd_18_0= RULE_STRING ) ) ) otherlv_19= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:780:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activityBegin' ( (lv_activityBegin_16_0= RULE_STRING ) ) ) (otherlv_17= 'activityEnd' ( (lv_activityEnd_18_0= RULE_STRING ) ) ) otherlv_19= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:780:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activityBegin' ( (lv_activityBegin_16_0= RULE_STRING ) ) ) (otherlv_17= 'activityEnd' ( (lv_activityEnd_18_0= RULE_STRING ) ) ) otherlv_19= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:780:3: otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activityBegin' ( (lv_activityBegin_16_0= RULE_STRING ) ) ) (otherlv_17= 'activityEnd' ( (lv_activityEnd_18_0= RULE_STRING ) ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleActivityMetric1635); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityMetricAccess().getMetricKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:784:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:785:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:785:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:786:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1652); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActivityMetricAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleActivityMetric1669); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityMetricAccess().getRelatesKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:806:1: ( (lv_processName_3_0= RULE_STRING ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:807:1: (lv_processName_3_0= RULE_STRING )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:807:1: (lv_processName_3_0= RULE_STRING )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:808:3: lv_processName_3_0= RULE_STRING
            	    {
            	    lv_processName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1686); 

            	    			newLeafNode(lv_processName_3_0, grammarAccess.getActivityMetricAccess().getProcessNameSTRINGTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"processName",
            	            		lv_processName_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleActivityMetric1704); 

                	newLeafNode(otherlv_4, grammarAccess.getActivityMetricAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:828:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:828:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleActivityMetric1717); 

                	newLeafNode(otherlv_5, grammarAccess.getActivityMetricAccess().getDescriptionKeyword_5_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:832:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:833:1: (lv_description_6_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:833:1: (lv_description_6_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:834:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1734); 

            			newLeafNode(lv_description_6_0, grammarAccess.getActivityMetricAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:850:3: (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:850:5: otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) )
            {
            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleActivityMetric1753); 

                	newLeafNode(otherlv_7, grammarAccess.getActivityMetricAccess().getTypeKeyword_6_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:854:1: ( (lv_type_8_0= ruleMetricType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:855:1: (lv_type_8_0= ruleMetricType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:855:1: (lv_type_8_0= ruleMetricType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:856:3: lv_type_8_0= ruleMetricType
            {
             
            	        newCompositeNode(grammarAccess.getActivityMetricAccess().getTypeMetricTypeEnumRuleCall_6_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMetricType_in_ruleActivityMetric1774);
            lv_type_8_0=ruleMetricType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityMetricRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"MetricType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:872:3: (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:872:5: otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleActivityMetric1788); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityMetricAccess().getFormKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:876:1: ( (lv_form_10_0= ruleColectType ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:877:1: (lv_form_10_0= ruleColectType )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:877:1: (lv_form_10_0= ruleColectType )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:878:3: lv_form_10_0= ruleColectType
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityMetricAccess().getFormColectTypeEnumRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColectType_in_ruleActivityMetric1809);
                    lv_form_10_0=ruleColectType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"form",
                            		lv_form_10_0, 
                            		"ColectType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:894:4: (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:894:6: otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) )
            {
            otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleActivityMetric1824); 

                	newLeafNode(otherlv_11, grammarAccess.getActivityMetricAccess().getIdKeyword_8_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:898:1: ( (lv_id_12_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:899:1: (lv_id_12_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:899:1: (lv_id_12_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:900:3: lv_id_12_0= RULE_STRING
            {
            lv_id_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1841); 

            			newLeafNode(lv_id_12_0, grammarAccess.getActivityMetricAccess().getIdSTRINGTerminalRuleCall_8_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_12_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:916:3: (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:916:5: otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) )
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleActivityMetric1860); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityMetricAccess().getUnitKeyword_9_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:920:1: ( (lv_unit_14_0= ruleMetricUnit ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:921:1: (lv_unit_14_0= ruleMetricUnit )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:921:1: (lv_unit_14_0= ruleMetricUnit )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:922:3: lv_unit_14_0= ruleMetricUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityMetricAccess().getUnitMetricUnitEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricUnit_in_ruleActivityMetric1881);
                    lv_unit_14_0=ruleMetricUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_14_0, 
                            		"MetricUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:938:4: (otherlv_15= 'activityBegin' ( (lv_activityBegin_16_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:938:6: otherlv_15= 'activityBegin' ( (lv_activityBegin_16_0= RULE_STRING ) )
            {
            otherlv_15=(Token)match(input,32,FOLLOW_32_in_ruleActivityMetric1896); 

                	newLeafNode(otherlv_15, grammarAccess.getActivityMetricAccess().getActivityBeginKeyword_10_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:942:1: ( (lv_activityBegin_16_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:943:1: (lv_activityBegin_16_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:943:1: (lv_activityBegin_16_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:944:3: lv_activityBegin_16_0= RULE_STRING
            {
            lv_activityBegin_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1913); 

            			newLeafNode(lv_activityBegin_16_0, grammarAccess.getActivityMetricAccess().getActivityBeginSTRINGTerminalRuleCall_10_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activityBegin",
                    		lv_activityBegin_16_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:960:3: (otherlv_17= 'activityEnd' ( (lv_activityEnd_18_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:960:5: otherlv_17= 'activityEnd' ( (lv_activityEnd_18_0= RULE_STRING ) )
            {
            otherlv_17=(Token)match(input,33,FOLLOW_33_in_ruleActivityMetric1932); 

                	newLeafNode(otherlv_17, grammarAccess.getActivityMetricAccess().getActivityEndKeyword_11_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:964:1: ( (lv_activityEnd_18_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:965:1: (lv_activityEnd_18_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:965:1: (lv_activityEnd_18_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:966:3: lv_activityEnd_18_0= RULE_STRING
            {
            lv_activityEnd_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1949); 

            			newLeafNode(lv_activityEnd_18_0, grammarAccess.getActivityMetricAccess().getActivityEndSTRINGTerminalRuleCall_11_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activityEnd",
                    		lv_activityEnd_18_0, 
                    		"STRING");
            	    

            }


            }


            }

            otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleActivityMetric1967); 

                	newLeafNode(otherlv_19, grammarAccess.getActivityMetricAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleActivityMetric"


    // $ANTLR start "entryRuleTaskMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:994:1: entryRuleTaskMetric returns [EObject current=null] : iv_ruleTaskMetric= ruleTaskMetric EOF ;
    public final EObject entryRuleTaskMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskMetric = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:995:2: (iv_ruleTaskMetric= ruleTaskMetric EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:996:2: iv_ruleTaskMetric= ruleTaskMetric EOF
            {
             newCompositeNode(grammarAccess.getTaskMetricRule()); 
            pushFollow(FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric2003);
            iv_ruleTaskMetric=ruleTaskMetric();

            state._fsp--;

             current =iv_ruleTaskMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskMetric2013); 

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
    // $ANTLR end "entryRuleTaskMetric"


    // $ANTLR start "ruleTaskMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1003:1: ruleTaskMetric returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activities' ( (lv_activities_16_0= RULE_STRING ) ) ) otherlv_17= '}' ) ;
    public final EObject ruleTaskMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_processName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_id_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_activities_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_type_8_0 = null;

        Enumerator lv_form_10_0 = null;

        Enumerator lv_unit_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1006:28: ( (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activities' ( (lv_activities_16_0= RULE_STRING ) ) ) otherlv_17= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1007:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activities' ( (lv_activities_16_0= RULE_STRING ) ) ) otherlv_17= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1007:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activities' ( (lv_activities_16_0= RULE_STRING ) ) ) otherlv_17= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1007:3: otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (lv_processName_3_0= RULE_STRING ) )* otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) ) (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) ) (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )? (otherlv_15= 'activities' ( (lv_activities_16_0= RULE_STRING ) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTaskMetric2050); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskMetricAccess().getMetricKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1011:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1012:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1012:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1013:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2067); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskMetricAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTaskMetric2084); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskMetricAccess().getRelatesKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1033:1: ( (lv_processName_3_0= RULE_STRING ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1034:1: (lv_processName_3_0= RULE_STRING )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1034:1: (lv_processName_3_0= RULE_STRING )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1035:3: lv_processName_3_0= RULE_STRING
            	    {
            	    lv_processName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2101); 

            	    			newLeafNode(lv_processName_3_0, grammarAccess.getTaskMetricAccess().getProcessNameSTRINGTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"processName",
            	            		lv_processName_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTaskMetric2119); 

                	newLeafNode(otherlv_4, grammarAccess.getTaskMetricAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1055:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1055:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleTaskMetric2132); 

                	newLeafNode(otherlv_5, grammarAccess.getTaskMetricAccess().getDescriptionKeyword_5_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1059:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1060:1: (lv_description_6_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1060:1: (lv_description_6_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1061:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2149); 

            			newLeafNode(lv_description_6_0, grammarAccess.getTaskMetricAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1077:3: (otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1077:5: otherlv_7= 'type' ( (lv_type_8_0= ruleMetricType ) )
            {
            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleTaskMetric2168); 

                	newLeafNode(otherlv_7, grammarAccess.getTaskMetricAccess().getTypeKeyword_6_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1081:1: ( (lv_type_8_0= ruleMetricType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1082:1: (lv_type_8_0= ruleMetricType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1082:1: (lv_type_8_0= ruleMetricType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1083:3: lv_type_8_0= ruleMetricType
            {
             
            	        newCompositeNode(grammarAccess.getTaskMetricAccess().getTypeMetricTypeEnumRuleCall_6_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMetricType_in_ruleTaskMetric2189);
            lv_type_8_0=ruleMetricType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskMetricRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"MetricType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1099:3: (otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1099:5: otherlv_9= 'form' ( (lv_form_10_0= ruleColectType ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleTaskMetric2203); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskMetricAccess().getFormKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1103:1: ( (lv_form_10_0= ruleColectType ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1104:1: (lv_form_10_0= ruleColectType )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1104:1: (lv_form_10_0= ruleColectType )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1105:3: lv_form_10_0= ruleColectType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskMetricAccess().getFormColectTypeEnumRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColectType_in_ruleTaskMetric2224);
                    lv_form_10_0=ruleColectType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"form",
                            		lv_form_10_0, 
                            		"ColectType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1121:4: (otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1121:6: otherlv_11= 'id' ( (lv_id_12_0= RULE_STRING ) )
            {
            otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleTaskMetric2239); 

                	newLeafNode(otherlv_11, grammarAccess.getTaskMetricAccess().getIdKeyword_8_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1125:1: ( (lv_id_12_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1126:1: (lv_id_12_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1126:1: (lv_id_12_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1127:3: lv_id_12_0= RULE_STRING
            {
            lv_id_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2256); 

            			newLeafNode(lv_id_12_0, grammarAccess.getTaskMetricAccess().getIdSTRINGTerminalRuleCall_8_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_12_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1143:3: (otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1143:5: otherlv_13= 'unit' ( (lv_unit_14_0= ruleMetricUnit ) )
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleTaskMetric2275); 

                        	newLeafNode(otherlv_13, grammarAccess.getTaskMetricAccess().getUnitKeyword_9_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1147:1: ( (lv_unit_14_0= ruleMetricUnit ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1148:1: (lv_unit_14_0= ruleMetricUnit )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1148:1: (lv_unit_14_0= ruleMetricUnit )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1149:3: lv_unit_14_0= ruleMetricUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskMetricAccess().getUnitMetricUnitEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricUnit_in_ruleTaskMetric2296);
                    lv_unit_14_0=ruleMetricUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_14_0, 
                            		"MetricUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1165:4: (otherlv_15= 'activities' ( (lv_activities_16_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1165:6: otherlv_15= 'activities' ( (lv_activities_16_0= RULE_STRING ) )
            {
            otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleTaskMetric2311); 

                	newLeafNode(otherlv_15, grammarAccess.getTaskMetricAccess().getActivitiesKeyword_10_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1169:1: ( (lv_activities_16_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1170:1: (lv_activities_16_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1170:1: (lv_activities_16_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1171:3: lv_activities_16_0= RULE_STRING
            {
            lv_activities_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2328); 

            			newLeafNode(lv_activities_16_0, grammarAccess.getTaskMetricAccess().getActivitiesSTRINGTerminalRuleCall_10_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activities",
                    		lv_activities_16_0, 
                    		"STRING");
            	    

            }


            }


            }

            otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleTaskMetric2346); 

                	newLeafNode(otherlv_17, grammarAccess.getTaskMetricAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleTaskMetric"


    // $ANTLR start "entryRuleQuestion"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1201:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1202:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1203:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion2384);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion2394); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1210:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_id_8_0=null;
        Token otherlv_9=null;
        Token lv_req_10_0=null;
        Token otherlv_12=null;
        Enumerator lv_type_6_0 = null;

        EObject lv_alternatives_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1213:28: ( (otherlv_0= 'Question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1214:1: (otherlv_0= 'Question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1214:1: (otherlv_0= 'Question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1214:3: otherlv_0= 'Question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleQuestion2431); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1218:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1219:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1219:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1220:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion2448); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleQuestion2465); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1240:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1240:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
            {
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleQuestion2478); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getDescriptionKeyword_3_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1244:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1245:1: (lv_description_4_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1245:1: (lv_description_4_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1246:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion2495); 

            			newLeafNode(lv_description_4_0, grammarAccess.getQuestionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1262:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1262:5: otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) )
            {
            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleQuestion2514); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getTypeKeyword_4_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1266:1: ( (lv_type_6_0= ruleAnswerType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1267:1: (lv_type_6_0= ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1267:1: (lv_type_6_0= ruleAnswerType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1268:3: lv_type_6_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_4_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion2535);
            lv_type_6_0=ruleAnswerType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"AnswerType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1284:3: (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1284:5: otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) )
            {
            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleQuestion2549); 

                	newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getIdKeyword_5_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1288:1: ( (lv_id_8_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1289:1: (lv_id_8_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1289:1: (lv_id_8_0= RULE_ID )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1290:3: lv_id_8_0= RULE_ID
            {
            lv_id_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion2566); 

            			newLeafNode(lv_id_8_0, grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_5_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_8_0, 
                    		"ID");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1306:3: (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1306:5: otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleQuestion2585); 

                        	newLeafNode(otherlv_9, grammarAccess.getQuestionAccess().getRequiredKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1310:1: ( (lv_req_10_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1311:1: (lv_req_10_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1311:1: (lv_req_10_0= RULE_INT )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1312:3: lv_req_10_0= RULE_INT
                    {
                    lv_req_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuestion2602); 

                    			newLeafNode(lv_req_10_0, grammarAccess.getQuestionAccess().getReqINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"req",
                            		lv_req_10_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1328:4: ( (lv_alternatives_11_0= ruleAlternatives ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1329:1: (lv_alternatives_11_0= ruleAlternatives )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1329:1: (lv_alternatives_11_0= ruleAlternatives )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1330:3: lv_alternatives_11_0= ruleAlternatives
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAlternatives_in_ruleQuestion2630);
            	    lv_alternatives_11_0=ruleAlternatives();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alternatives",
            	            		lv_alternatives_11_0, 
            	            		"Alternatives");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleQuestion2643); 

                	newLeafNode(otherlv_12, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAlternatives"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1358:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1359:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1360:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives2679);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives2689); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1367:1: ruleAlternatives returns [EObject current=null] : ( (lv_description_0_0= RULE_STRING ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1370:28: ( ( (lv_description_0_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1371:1: ( (lv_description_0_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1371:1: ( (lv_description_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1372:1: (lv_description_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1372:1: (lv_description_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1373:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternatives2730); 

            			newLeafNode(lv_description_0_0, grammarAccess.getAlternativesAccess().getDescriptionSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "ruleDesignType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1397:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' ) | (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' ) | (enumLiteral_2= 'LS \\u2013 Latin Square' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1399:28: ( ( (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' ) | (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' ) | (enumLiteral_2= 'LS \\u2013 Latin Square' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1400:1: ( (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' ) | (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' ) | (enumLiteral_2= 'LS \\u2013 Latin Square' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1400:1: ( (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' ) | (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' ) | (enumLiteral_2= 'LS \\u2013 Latin Square' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt27=1;
                }
                break;
            case 38:
                {
                alt27=2;
                }
                break;
            case 39:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1400:2: (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1400:2: (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1400:4: enumLiteral_0= 'CRD \\u2013 Completely Randomized Design'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleDesignType2784); 

                            current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1406:6: (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1406:6: (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1406:8: enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleDesignType2801); 

                            current = grammarAccess.getDesignTypeAccess().getRCDBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCDBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1412:6: (enumLiteral_2= 'LS \\u2013 Latin Square' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1412:6: (enumLiteral_2= 'LS \\u2013 Latin Square' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1412:8: enumLiteral_2= 'LS \\u2013 Latin Square'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleDesignType2818); 

                            current = grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleDesignType"


    // $ANTLR start "ruleAnswerType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1422:1: ruleAnswerType returns [Enumerator current=null] : ( (enumLiteral_0= 'ComboBox' ) | (enumLiteral_1= 'CheckBoxes' ) | (enumLiteral_2= 'OptionButtons' ) ) ;
    public final Enumerator ruleAnswerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1424:28: ( ( (enumLiteral_0= 'ComboBox' ) | (enumLiteral_1= 'CheckBoxes' ) | (enumLiteral_2= 'OptionButtons' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1425:1: ( (enumLiteral_0= 'ComboBox' ) | (enumLiteral_1= 'CheckBoxes' ) | (enumLiteral_2= 'OptionButtons' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1425:1: ( (enumLiteral_0= 'ComboBox' ) | (enumLiteral_1= 'CheckBoxes' ) | (enumLiteral_2= 'OptionButtons' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt28=1;
                }
                break;
            case 41:
                {
                alt28=2;
                }
                break;
            case 42:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1425:2: (enumLiteral_0= 'ComboBox' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1425:2: (enumLiteral_0= 'ComboBox' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1425:4: enumLiteral_0= 'ComboBox'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleAnswerType2863); 

                            current = grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1431:6: (enumLiteral_1= 'CheckBoxes' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1431:6: (enumLiteral_1= 'CheckBoxes' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1431:8: enumLiteral_1= 'CheckBoxes'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleAnswerType2880); 

                            current = grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1437:6: (enumLiteral_2= 'OptionButtons' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1437:6: (enumLiteral_2= 'OptionButtons' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1437:8: enumLiteral_2= 'OptionButtons'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleAnswerType2897); 

                            current = grammarAccess.getAnswerTypeAccess().getOptionButtonsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnswerTypeAccess().getOptionButtonsEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleAnswerType"


    // $ANTLR start "ruleMetricType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1447:1: ruleMetricType returns [Enumerator current=null] : ( (enumLiteral_0= 'hardData' ) | (enumLiteral_1= 'softData' ) | (enumLiteral_2= 'normalizedData' ) ) ;
    public final Enumerator ruleMetricType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1449:28: ( ( (enumLiteral_0= 'hardData' ) | (enumLiteral_1= 'softData' ) | (enumLiteral_2= 'normalizedData' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1450:1: ( (enumLiteral_0= 'hardData' ) | (enumLiteral_1= 'softData' ) | (enumLiteral_2= 'normalizedData' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1450:1: ( (enumLiteral_0= 'hardData' ) | (enumLiteral_1= 'softData' ) | (enumLiteral_2= 'normalizedData' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt29=1;
                }
                break;
            case 44:
                {
                alt29=2;
                }
                break;
            case 45:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1450:2: (enumLiteral_0= 'hardData' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1450:2: (enumLiteral_0= 'hardData' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1450:4: enumLiteral_0= 'hardData'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleMetricType2942); 

                            current = grammarAccess.getMetricTypeAccess().getHardDataEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getHardDataEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1456:6: (enumLiteral_1= 'softData' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1456:6: (enumLiteral_1= 'softData' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1456:8: enumLiteral_1= 'softData'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleMetricType2959); 

                            current = grammarAccess.getMetricTypeAccess().getSoftDataEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMetricTypeAccess().getSoftDataEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1462:6: (enumLiteral_2= 'normalizedData' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1462:6: (enumLiteral_2= 'normalizedData' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1462:8: enumLiteral_2= 'normalizedData'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleMetricType2976); 

                            current = grammarAccess.getMetricTypeAccess().getNormalizedDataEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMetricTypeAccess().getNormalizedDataEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleMetricType"


    // $ANTLR start "ruleColectType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1472:1: ruleColectType returns [Enumerator current=null] : ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) ) ;
    public final Enumerator ruleColectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1474:28: ( ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1475:1: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1475:1: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            else if ( (LA30_0==47) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1475:2: (enumLiteral_0= 'continuous' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1475:2: (enumLiteral_0= 'continuous' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1475:4: enumLiteral_0= 'continuous'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleColectType3021); 

                            current = grammarAccess.getColectTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColectTypeAccess().getContinuousEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1481:6: (enumLiteral_1= 'intercalated' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1481:6: (enumLiteral_1= 'intercalated' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1481:8: enumLiteral_1= 'intercalated'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleColectType3038); 

                            current = grammarAccess.getColectTypeAccess().getIntercalatedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColectTypeAccess().getIntercalatedEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleColectType"


    // $ANTLR start "ruleMetricUnit"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1491:1: ruleMetricUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) ) ;
    public final Enumerator ruleMetricUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1493:28: ( ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1494:1: ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1494:1: ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            else if ( (LA31_0==49) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1494:2: (enumLiteral_0= 'minutes' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1494:2: (enumLiteral_0= 'minutes' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1494:4: enumLiteral_0= 'minutes'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleMetricUnit3083); 

                            current = grammarAccess.getMetricUnitAccess().getMinutesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetricUnitAccess().getMinutesEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1500:6: (enumLiteral_1= 'uc' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1500:6: (enumLiteral_1= 'uc' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1500:8: enumLiteral_1= 'uc'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleMetricUnit3100); 

                            current = grammarAccess.getMetricUnitAccess().getUcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMetricUnitAccess().getUcEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleMetricUnit"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\26\uffff";
    static final String DFA18_eofS =
        "\26\uffff";
    static final String DFA18_minS =
        "\1\32\1\4\1\33\2\4\1\34\1\4\1\27\1\53\3\35\1\56\1\4\2\36\1\37\1"+
        "\60\2\uffff\2\40";
    static final String DFA18_maxS =
        "\1\32\1\4\1\33\2\17\1\34\1\4\1\27\1\55\3\36\1\57\1\4\2\36\1\42"+
        "\1\61\2\uffff\2\42";
    static final String DFA18_acceptS =
        "\22\uffff\1\2\1\1\2\uffff";
    static final String DFA18_specialS =
        "\26\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\12\uffff\1\5",
            "\1\4\12\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\1\12\1\13",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\16\1\17",
            "\1\20",
            "\1\15",
            "\1\15",
            "\1\21\1\23\1\uffff\1\22",
            "\1\24\1\25",
            "",
            "",
            "\1\23\1\uffff\1\22",
            "\1\23\1\uffff\1\22"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "740:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExperimentElement214 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleExperimentElement235 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleExperimentElement248 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_ruleExperimentElement262 = new BitSet(new long[]{0x0000000000404002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement283 = new BitSet(new long[]{0x0000000000404002L});
    public static final BitSet FOLLOW_14_in_ruleExperimentElement299 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleExperimentElement320 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcess412 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcess429 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleProcess450 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleProcess463 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleProcess477 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_ruleMetrics_in_ruleProcess498 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_12_in_ruleProcess511 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleProcess526 = new BitSet(new long[]{0x0000000800001000L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleProcess547 = new BitSet(new long[]{0x0000000800001000L});
    public static final BitSet FOLLOW_12_in_ruleProcess560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleActivity645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity684 = new BitSet(new long[]{0x0000000000208022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity706 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleActivity733 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_15_in_ruleActivity747 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleActivity768 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleActivity781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTask866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRole971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRole988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentalPlan1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleExperimentalPlan1076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentalPlan1093 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExperimentalPlan1110 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleExperimentalPlan1131 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExperimentalPlan1143 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExperimentalPlan1164 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFactor1260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFactor1277 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFactor1294 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleFactor1315 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_16_in_ruleFactor1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevels_in_entryRuleLevels1364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevels1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLevels1411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLevels1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetrics_in_entryRuleMetrics1469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetrics1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_ruleMetrics1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_ruleMetrics1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityMetric1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleActivityMetric1635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1652 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleActivityMetric1669 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1686 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleActivityMetric1704 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleActivityMetric1717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1734 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActivityMetric1753 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_ruleMetricType_in_ruleActivityMetric1774 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleActivityMetric1788 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleColectType_in_ruleActivityMetric1809 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleActivityMetric1824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1841 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleActivityMetric1860 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ruleMetricUnit_in_ruleActivityMetric1881 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleActivityMetric1896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1913 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleActivityMetric1932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1949 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActivityMetric1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric2003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskMetric2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTaskMetric2050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2067 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTaskMetric2084 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2101 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleTaskMetric2119 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTaskMetric2132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2149 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTaskMetric2168 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_ruleMetricType_in_ruleTaskMetric2189 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleTaskMetric2203 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleColectType_in_ruleTaskMetric2224 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTaskMetric2239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2256 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleTaskMetric2275 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ruleMetricUnit_in_ruleTaskMetric2296 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTaskMetric2311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTaskMetric2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion2384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleQuestion2431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion2448 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuestion2465 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleQuestion2478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion2495 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQuestion2514 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion2535 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQuestion2549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion2566 = new BitSet(new long[]{0x0000001000010010L});
    public static final BitSet FOLLOW_36_in_ruleQuestion2585 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuestion2602 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleQuestion2630 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleQuestion2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives2679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternatives2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDesignType2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDesignType2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDesignType2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAnswerType2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnswerType2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAnswerType2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMetricType2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMetricType2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMetricType2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleColectType3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleColectType3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMetricUnit3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMetricUnit3100 = new BitSet(new long[]{0x0000000000000002L});

}