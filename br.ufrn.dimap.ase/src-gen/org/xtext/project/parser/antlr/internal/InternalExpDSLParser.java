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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Experiment'", "'Experimental Plan'", "'General Questions'", "'Process'", "';'", "'Activity'", "'in'", "'out'", "'{'", "'}'", "'Task'", "'Role'", "'Design'", "'type'", "'Factor'", "'Level'", "'A'", "'T'", "'Art'", "'relates'", "'description'", "'form'", "'id'", "'unit'", "'activityBegin'", "'activityEnd'", "'activities'", "'Q.'", "'required'", "'CRD \\u2013 Completely Randomized Design'", "'RCBD \\u2013 Randomized Complete Block Design'", "'LS \\u2013 Latin Square'", "'ComboBox'", "'CheckBoxes'", "'OptionButtons'", "'hardData'", "'softData'", "'normalizedData'", "'continuous'", "'intercalated'", "'minutes'", "'uc'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
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
    public static final int RULE_STRING=4;
    public static final int T__32=32;
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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:116:1: ruleExperimentElement returns [EObject current=null] : (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'General Questions' ( (lv_question_7_0= ruleQuestion ) )* )? ) ;
    public final EObject ruleExperimentElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_process_2_0 = null;

        EObject lv_metrics_3_0 = null;

        EObject lv_experiments_5_0 = null;

        EObject lv_question_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:119:28: ( (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'General Questions' ( (lv_question_7_0= ruleQuestion ) )* )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'General Questions' ( (lv_question_7_0= ruleQuestion ) )* )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'General Questions' ( (lv_question_7_0= ruleQuestion ) )* )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:3: otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'General Questions' ( (lv_question_7_0= ruleQuestion ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleExperimentElement213); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentElementAccess().getExperimentKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:124:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:125:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:125:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:126:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExperimentElement230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExperimentElementAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:142:2: ( (lv_process_2_0= ruleProcess ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:143:1: (lv_process_2_0= ruleProcess )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:143:1: (lv_process_2_0= ruleProcess )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:144:3: lv_process_2_0= ruleProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getProcessProcessParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcess_in_ruleExperimentElement256);
            	    lv_process_2_0=ruleProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"process",
            	            		lv_process_2_0, 
            	            		"Process");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:160:3: ( (lv_metrics_3_0= ruleMetrics ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:161:1: (lv_metrics_3_0= ruleMetrics )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:161:1: (lv_metrics_3_0= ruleMetrics )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:162:3: lv_metrics_3_0= ruleMetrics
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getMetricsMetricsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetrics_in_ruleExperimentElement278);
            	    lv_metrics_3_0=ruleMetrics();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metrics",
            	            		lv_metrics_3_0, 
            	            		"Metrics");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:178:3: (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:178:5: otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )*
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleExperimentElement292); 

                        	newLeafNode(otherlv_4, grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:182:1: ( (lv_experiments_5_0= ruleExperimentalPlan ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:183:1: (lv_experiments_5_0= ruleExperimentalPlan )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:183:1: (lv_experiments_5_0= ruleExperimentalPlan )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:184:3: lv_experiments_5_0= ruleExperimentalPlan
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getExperimentsExperimentalPlanParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement313);
                    	    lv_experiments_5_0=ruleExperimentalPlan();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"experiments",
                    	            		lv_experiments_5_0, 
                    	            		"ExperimentalPlan");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:200:5: (otherlv_6= 'General Questions' ( (lv_question_7_0= ruleQuestion ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:200:7: otherlv_6= 'General Questions' ( (lv_question_7_0= ruleQuestion ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleExperimentElement329); 

                        	newLeafNode(otherlv_6, grammarAccess.getExperimentElementAccess().getGeneralQuestionsKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:204:1: ( (lv_question_7_0= ruleQuestion ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==38) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:205:1: (lv_question_7_0= ruleQuestion )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:205:1: (lv_question_7_0= ruleQuestion )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:206:3: lv_question_7_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getQuestionQuestionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQuestion_in_ruleExperimentElement350);
                    	    lv_question_7_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"question",
                    	            		lv_question_7_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:230:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:231:2: (iv_ruleProcess= ruleProcess EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:232:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess389);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess399); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:239:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= ';' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_activities_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:242:28: ( (otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:243:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:243:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:243:3: otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_activities_2_0= ruleActivity ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProcess436); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:247:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:248:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:248:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:249:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcess453); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:265:2: ( (lv_activities_2_0= ruleActivity ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:266:1: (lv_activities_2_0= ruleActivity )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:266:1: (lv_activities_2_0= ruleActivity )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:267:3: lv_activities_2_0= ruleActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getActivitiesActivityParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleProcess479);
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
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleProcess492); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getSemicolonKeyword_3());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:295:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:296:2: (iv_ruleActivity= ruleActivity EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:297:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity528);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity538); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:304:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (lv_artefacts_3_0= ruleArtefact ) )* )? (otherlv_4= 'out' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_name_6_0= RULE_STRING ) ) ( (lv_next_7_0= RULE_ID ) )? ( (lv_role_8_0= ruleRole ) )* (otherlv_9= '{' ( (lv_tasks_10_0= ruleTask ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        Token lv_next_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_artefacts_3_0 = null;

        EObject lv_artefacts_5_0 = null;

        EObject lv_role_8_0 = null;

        EObject lv_tasks_10_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:307:28: ( (otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (lv_artefacts_3_0= ruleArtefact ) )* )? (otherlv_4= 'out' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_name_6_0= RULE_STRING ) ) ( (lv_next_7_0= RULE_ID ) )? ( (lv_role_8_0= ruleRole ) )* (otherlv_9= '{' ( (lv_tasks_10_0= ruleTask ) )* otherlv_11= '}' )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:308:1: (otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (lv_artefacts_3_0= ruleArtefact ) )* )? (otherlv_4= 'out' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_name_6_0= RULE_STRING ) ) ( (lv_next_7_0= RULE_ID ) )? ( (lv_role_8_0= ruleRole ) )* (otherlv_9= '{' ( (lv_tasks_10_0= ruleTask ) )* otherlv_11= '}' )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:308:1: (otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (lv_artefacts_3_0= ruleArtefact ) )* )? (otherlv_4= 'out' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_name_6_0= RULE_STRING ) ) ( (lv_next_7_0= RULE_ID ) )? ( (lv_role_8_0= ruleRole ) )* (otherlv_9= '{' ( (lv_tasks_10_0= ruleTask ) )* otherlv_11= '}' )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:308:3: otherlv_0= 'Activity' ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (lv_artefacts_3_0= ruleArtefact ) )* )? (otherlv_4= 'out' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_name_6_0= RULE_STRING ) ) ( (lv_next_7_0= RULE_ID ) )? ( (lv_role_8_0= ruleRole ) )* (otherlv_9= '{' ( (lv_tasks_10_0= ruleTask ) )* otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleActivity575); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:312:1: ( (lv_id_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:313:1: (lv_id_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:313:1: (lv_id_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:314:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity592); 

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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:330:2: (otherlv_2= 'in' ( (lv_artefacts_3_0= ruleArtefact ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:330:4: otherlv_2= 'in' ( (lv_artefacts_3_0= ruleArtefact ) )*
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleActivity610); 

                        	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getInKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:334:1: ( (lv_artefacts_3_0= ruleArtefact ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_STRING) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==RULE_STRING||LA9_2==18) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:335:1: (lv_artefacts_3_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:335:1: (lv_artefacts_3_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:336:3: lv_artefacts_3_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getArtefactsArtefactParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleActivity631);
                    	    lv_artefacts_3_0=ruleArtefact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"artefacts",
                    	            		lv_artefacts_3_0, 
                    	            		"Artefact");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:352:5: (otherlv_4= 'out' ( (lv_artefacts_5_0= ruleArtefact ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:352:7: otherlv_4= 'out' ( (lv_artefacts_5_0= ruleArtefact ) )*
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleActivity647); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getOutKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:356:1: ( (lv_artefacts_5_0= ruleArtefact ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_STRING) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==RULE_STRING) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:357:1: (lv_artefacts_5_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:357:1: (lv_artefacts_5_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:358:3: lv_artefacts_5_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getArtefactsArtefactParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleActivity668);
                    	    lv_artefacts_5_0=ruleArtefact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"artefacts",
                    	            		lv_artefacts_5_0, 
                    	            		"Artefact");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:374:5: ( (lv_name_6_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:375:1: (lv_name_6_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:375:1: (lv_name_6_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:376:3: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity688); 

            			newLeafNode(lv_name_6_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:392:2: ( (lv_next_7_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:393:1: (lv_next_7_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:393:1: (lv_next_7_0= RULE_ID )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:394:3: lv_next_7_0= RULE_ID
                    {
                    lv_next_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity710); 

                    			newLeafNode(lv_next_7_0, grammarAccess.getActivityAccess().getNextIDTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"next",
                            		lv_next_7_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:410:3: ( (lv_role_8_0= ruleRole ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:411:1: (lv_role_8_0= ruleRole )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:411:1: (lv_role_8_0= ruleRole )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:412:3: lv_role_8_0= ruleRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityAccess().getRoleRoleParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRole_in_ruleActivity737);
            	    lv_role_8_0=ruleRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"role",
            	            		lv_role_8_0, 
            	            		"Role");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:428:3: (otherlv_9= '{' ( (lv_tasks_10_0= ruleTask ) )* otherlv_11= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:428:5: otherlv_9= '{' ( (lv_tasks_10_0= ruleTask ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleActivity751); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:432:1: ( (lv_tasks_10_0= ruleTask ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:433:1: (lv_tasks_10_0= ruleTask )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:433:1: (lv_tasks_10_0= ruleTask )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:434:3: lv_tasks_10_0= ruleTask
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTasksTaskParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTask_in_ruleActivity772);
                    	    lv_tasks_10_0=ruleTask();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tasks",
                    	            		lv_tasks_10_0, 
                    	            		"Task");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleActivity785); 

                        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7_2());
                        

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


    // $ANTLR start "entryRuleArtefact"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:462:1: entryRuleArtefact returns [EObject current=null] : iv_ruleArtefact= ruleArtefact EOF ;
    public final EObject entryRuleArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefact = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:463:2: (iv_ruleArtefact= ruleArtefact EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:464:2: iv_ruleArtefact= ruleArtefact EOF
            {
             newCompositeNode(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_ruleArtefact_in_entryRuleArtefact823);
            iv_ruleArtefact=ruleArtefact();

            state._fsp--;

             current =iv_ruleArtefact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefact833); 

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
    // $ANTLR end "entryRuleArtefact"


    // $ANTLR start "ruleArtefact"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:471:1: ruleArtefact returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleArtefact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:474:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:475:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:475:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:476:1: (lv_name_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:476:1: (lv_name_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:477:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefact874); 

            			newLeafNode(lv_name_0_0, grammarAccess.getArtefactAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
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
    // $ANTLR end "ruleArtefact"


    // $ANTLR start "entryRuleTask"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:501:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:502:2: (iv_ruleTask= ruleTask EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:503:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask914);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask924); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:510:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:513:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:514:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:514:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:514:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTask961); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:518:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:519:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:519:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:520:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask978); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTask995); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getSemicolonKeyword_2());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:548:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:549:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:550:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1031);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1041); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:557:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:560:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:561:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:561:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:561:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRole1078); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:565:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:566:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:566:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:567:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRole1095); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRole1112); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getSemicolonKeyword_2());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:595:1: entryRuleExperimentalPlan returns [EObject current=null] : iv_ruleExperimentalPlan= ruleExperimentalPlan EOF ;
    public final EObject entryRuleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentalPlan = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:596:2: (iv_ruleExperimentalPlan= ruleExperimentalPlan EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:597:2: iv_ruleExperimentalPlan= ruleExperimentalPlan EOF
            {
             newCompositeNode(grammarAccess.getExperimentalPlanRule()); 
            pushFollow(FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan1148);
            iv_ruleExperimentalPlan=ruleExperimentalPlan();

            state._fsp--;

             current =iv_ruleExperimentalPlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentalPlan1158); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:604:1: ruleExperimentalPlan returns [EObject current=null] : (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) ( (lv_factor_4_0= ruleFactor ) )* otherlv_5= ';' ) ;
    public final EObject ruleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_factor_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:607:28: ( (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) ( (lv_factor_4_0= ruleFactor ) )* otherlv_5= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:608:1: (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) ( (lv_factor_4_0= ruleFactor ) )* otherlv_5= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:608:1: (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) ( (lv_factor_4_0= ruleFactor ) )* otherlv_5= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:608:3: otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) ( (lv_factor_4_0= ruleFactor ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleExperimentalPlan1195); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentalPlanAccess().getDesignKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:612:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:613:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:613:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:614:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExperimentalPlan1212); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleExperimentalPlan1229); 

                	newLeafNode(otherlv_2, grammarAccess.getExperimentalPlanAccess().getTypeKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:634:1: ( (lv_type_3_0= ruleDesignType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:635:1: (lv_type_3_0= ruleDesignType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:635:1: (lv_type_3_0= ruleDesignType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:636:3: lv_type_3_0= ruleDesignType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignType_in_ruleExperimentalPlan1250);
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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:652:2: ( (lv_factor_4_0= ruleFactor ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:653:1: (lv_factor_4_0= ruleFactor )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:653:1: (lv_factor_4_0= ruleFactor )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:654:3: lv_factor_4_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleExperimentalPlan1271);
            	    lv_factor_4_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factor",
            	            		lv_factor_4_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalPlan1284); 

                	newLeafNode(otherlv_5, grammarAccess.getExperimentalPlanAccess().getSemicolonKeyword_5());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:682:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:683:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:684:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1320);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1330); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:691:1: ruleFactor returns [EObject current=null] : (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_level_2_0= ruleLevels ) )* otherlv_3= ';' ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_level_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:694:28: ( (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_level_2_0= ruleLevels ) )* otherlv_3= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:695:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_level_2_0= ruleLevels ) )* otherlv_3= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:695:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_level_2_0= ruleLevels ) )* otherlv_3= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:695:3: otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_level_2_0= ruleLevels ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFactor1367); 

                	newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getFactorKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:699:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:700:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:700:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:701:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFactor1384); 

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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:717:2: ( (lv_level_2_0= ruleLevels ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:718:1: (lv_level_2_0= ruleLevels )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:718:1: (lv_level_2_0= ruleLevels )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:719:3: lv_level_2_0= ruleLevels
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLevels_in_ruleFactor1410);
            	    lv_level_2_0=ruleLevels();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"level",
            	            		lv_level_2_0, 
            	            		"Levels");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFactor1423); 

                	newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSemicolonKeyword_3());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:747:1: entryRuleLevels returns [EObject current=null] : iv_ruleLevels= ruleLevels EOF ;
    public final EObject entryRuleLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevels = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:748:2: (iv_ruleLevels= ruleLevels EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:749:2: iv_ruleLevels= ruleLevels EOF
            {
             newCompositeNode(grammarAccess.getLevelsRule()); 
            pushFollow(FOLLOW_ruleLevels_in_entryRuleLevels1459);
            iv_ruleLevels=ruleLevels();

            state._fsp--;

             current =iv_ruleLevels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevels1469); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:756:1: ruleLevels returns [EObject current=null] : (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:759:28: ( (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:760:1: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:760:1: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:760:3: otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLevels1506); 

                	newLeafNode(otherlv_0, grammarAccess.getLevelsAccess().getLevelKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:764:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:765:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:765:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:766:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLevels1523); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLevels1540); 

                	newLeafNode(otherlv_2, grammarAccess.getLevelsAccess().getSemicolonKeyword_2());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:794:1: entryRuleMetrics returns [EObject current=null] : iv_ruleMetrics= ruleMetrics EOF ;
    public final EObject entryRuleMetrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrics = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:795:2: (iv_ruleMetrics= ruleMetrics EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:796:2: iv_ruleMetrics= ruleMetrics EOF
            {
             newCompositeNode(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_ruleMetrics_in_entryRuleMetrics1576);
            iv_ruleMetrics=ruleMetrics();

            state._fsp--;

             current =iv_ruleMetrics; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetrics1586); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:803:1: ruleMetrics returns [EObject current=null] : ( (otherlv_0= 'A' ( (lv_activityMetric_1_0= ruleActivityMetric ) )* ) (otherlv_2= 'T' ( (lv_taskMetric_3_0= ruleTaskMetric ) )* )? (otherlv_4= 'Art' ( (lv_artefactMetric_5_0= ruleArtefactMetric ) )* )? ) ;
    public final EObject ruleMetrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_activityMetric_1_0 = null;

        EObject lv_taskMetric_3_0 = null;

        EObject lv_artefactMetric_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:806:28: ( ( (otherlv_0= 'A' ( (lv_activityMetric_1_0= ruleActivityMetric ) )* ) (otherlv_2= 'T' ( (lv_taskMetric_3_0= ruleTaskMetric ) )* )? (otherlv_4= 'Art' ( (lv_artefactMetric_5_0= ruleArtefactMetric ) )* )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:807:1: ( (otherlv_0= 'A' ( (lv_activityMetric_1_0= ruleActivityMetric ) )* ) (otherlv_2= 'T' ( (lv_taskMetric_3_0= ruleTaskMetric ) )* )? (otherlv_4= 'Art' ( (lv_artefactMetric_5_0= ruleArtefactMetric ) )* )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:807:1: ( (otherlv_0= 'A' ( (lv_activityMetric_1_0= ruleActivityMetric ) )* ) (otherlv_2= 'T' ( (lv_taskMetric_3_0= ruleTaskMetric ) )* )? (otherlv_4= 'Art' ( (lv_artefactMetric_5_0= ruleArtefactMetric ) )* )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:807:2: (otherlv_0= 'A' ( (lv_activityMetric_1_0= ruleActivityMetric ) )* ) (otherlv_2= 'T' ( (lv_taskMetric_3_0= ruleTaskMetric ) )* )? (otherlv_4= 'Art' ( (lv_artefactMetric_5_0= ruleArtefactMetric ) )* )?
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:807:2: (otherlv_0= 'A' ( (lv_activityMetric_1_0= ruleActivityMetric ) )* )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:807:4: otherlv_0= 'A' ( (lv_activityMetric_1_0= ruleActivityMetric ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMetrics1624); 

                	newLeafNode(otherlv_0, grammarAccess.getMetricsAccess().getAKeyword_0_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:811:1: ( (lv_activityMetric_1_0= ruleActivityMetric ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:812:1: (lv_activityMetric_1_0= ruleActivityMetric )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:812:1: (lv_activityMetric_1_0= ruleActivityMetric )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:813:3: lv_activityMetric_1_0= ruleActivityMetric
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetricsAccess().getActivityMetricActivityMetricParserRuleCall_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityMetric_in_ruleMetrics1645);
            	    lv_activityMetric_1_0=ruleActivityMetric();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetricsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activityMetric",
            	            		lv_activityMetric_1_0, 
            	            		"ActivityMetric");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:829:4: (otherlv_2= 'T' ( (lv_taskMetric_3_0= ruleTaskMetric ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:829:6: otherlv_2= 'T' ( (lv_taskMetric_3_0= ruleTaskMetric ) )*
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleMetrics1660); 

                        	newLeafNode(otherlv_2, grammarAccess.getMetricsAccess().getTKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:833:1: ( (lv_taskMetric_3_0= ruleTaskMetric ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_STRING) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:834:1: (lv_taskMetric_3_0= ruleTaskMetric )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:834:1: (lv_taskMetric_3_0= ruleTaskMetric )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:835:3: lv_taskMetric_3_0= ruleTaskMetric
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMetricsAccess().getTaskMetricTaskMetricParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTaskMetric_in_ruleMetrics1681);
                    	    lv_taskMetric_3_0=ruleTaskMetric();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMetricsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"taskMetric",
                    	            		lv_taskMetric_3_0, 
                    	            		"TaskMetric");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:851:5: (otherlv_4= 'Art' ( (lv_artefactMetric_5_0= ruleArtefactMetric ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:851:7: otherlv_4= 'Art' ( (lv_artefactMetric_5_0= ruleArtefactMetric ) )*
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleMetrics1697); 

                        	newLeafNode(otherlv_4, grammarAccess.getMetricsAccess().getArtKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:855:1: ( (lv_artefactMetric_5_0= ruleArtefactMetric ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_STRING) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:856:1: (lv_artefactMetric_5_0= ruleArtefactMetric )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:856:1: (lv_artefactMetric_5_0= ruleArtefactMetric )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:857:3: lv_artefactMetric_5_0= ruleArtefactMetric
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMetricsAccess().getArtefactMetricArtefactMetricParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefactMetric_in_ruleMetrics1718);
                    	    lv_artefactMetric_5_0=ruleArtefactMetric();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMetricsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"artefactMetric",
                    	            		lv_artefactMetric_5_0, 
                    	            		"ArtefactMetric");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
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
    // $ANTLR end "ruleMetrics"


    // $ANTLR start "entryRuleActivityMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:881:1: entryRuleActivityMetric returns [EObject current=null] : iv_ruleActivityMetric= ruleActivityMetric EOF ;
    public final EObject entryRuleActivityMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityMetric = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:882:2: (iv_ruleActivityMetric= ruleActivityMetric EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:883:2: iv_ruleActivityMetric= ruleActivityMetric EOF
            {
             newCompositeNode(grammarAccess.getActivityMetricRule()); 
            pushFollow(FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric1757);
            iv_ruleActivityMetric=ruleActivityMetric();

            state._fsp--;

             current =iv_ruleActivityMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityMetric1767); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:890:1: ruleActivityMetric returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activityBegin' ( (lv_activityBegin_14_0= RULE_STRING ) ) ) (otherlv_15= 'activityEnd' ( (lv_activityEnd_16_0= RULE_STRING ) ) ) otherlv_17= ';' ) ;
    public final EObject ruleActivityMetric() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_activityBegin_14_0=null;
        Token otherlv_15=null;
        Token lv_activityEnd_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_type_6_0 = null;

        Enumerator lv_form_8_0 = null;

        Enumerator lv_unit_12_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:893:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activityBegin' ( (lv_activityBegin_14_0= RULE_STRING ) ) ) (otherlv_15= 'activityEnd' ( (lv_activityEnd_16_0= RULE_STRING ) ) ) otherlv_17= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:894:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activityBegin' ( (lv_activityBegin_14_0= RULE_STRING ) ) ) (otherlv_15= 'activityEnd' ( (lv_activityEnd_16_0= RULE_STRING ) ) ) otherlv_17= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:894:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activityBegin' ( (lv_activityBegin_14_0= RULE_STRING ) ) ) (otherlv_15= 'activityEnd' ( (lv_activityEnd_16_0= RULE_STRING ) ) ) otherlv_17= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:894:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activityBegin' ( (lv_activityBegin_14_0= RULE_STRING ) ) ) (otherlv_15= 'activityEnd' ( (lv_activityEnd_16_0= RULE_STRING ) ) ) otherlv_17= ';'
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:894:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:895:1: (lv_name_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:895:1: (lv_name_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:896:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1809); 

            			newLeafNode(lv_name_0_0, grammarAccess.getActivityMetricAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleActivityMetric1826); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityMetricAccess().getRelatesKeyword_1());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:916:1: ( (otherlv_2= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:917:1: (otherlv_2= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:917:1: (otherlv_2= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:918:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1846); 

            		newLeafNode(otherlv_2, grammarAccess.getActivityMetricAccess().getRelatesToProcessCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:929:2: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:929:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
            {
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleActivityMetric1859); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityMetricAccess().getDescriptionKeyword_3_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:933:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:934:1: (lv_description_4_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:934:1: (lv_description_4_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:935:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1876); 

            			newLeafNode(lv_description_4_0, grammarAccess.getActivityMetricAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:951:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:951:5: otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) )
            {
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleActivityMetric1895); 

                	newLeafNode(otherlv_5, grammarAccess.getActivityMetricAccess().getTypeKeyword_4_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:955:1: ( (lv_type_6_0= ruleMetricType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:956:1: (lv_type_6_0= ruleMetricType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:956:1: (lv_type_6_0= ruleMetricType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:957:3: lv_type_6_0= ruleMetricType
            {
             
            	        newCompositeNode(grammarAccess.getActivityMetricAccess().getTypeMetricTypeEnumRuleCall_4_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMetricType_in_ruleActivityMetric1916);
            lv_type_6_0=ruleMetricType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityMetricRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"MetricType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:973:3: (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:973:5: otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleActivityMetric1930); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityMetricAccess().getFormKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:977:1: ( (lv_form_8_0= ruleColectType ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:978:1: (lv_form_8_0= ruleColectType )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:978:1: (lv_form_8_0= ruleColectType )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:979:3: lv_form_8_0= ruleColectType
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityMetricAccess().getFormColectTypeEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColectType_in_ruleActivityMetric1951);
                    lv_form_8_0=ruleColectType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"form",
                            		lv_form_8_0, 
                            		"ColectType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:995:4: (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:995:6: otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) )
            {
            otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleActivityMetric1966); 

                	newLeafNode(otherlv_9, grammarAccess.getActivityMetricAccess().getIdKeyword_6_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:999:1: ( (lv_id_10_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1000:1: (lv_id_10_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1000:1: (lv_id_10_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1001:3: lv_id_10_0= RULE_STRING
            {
            lv_id_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1983); 

            			newLeafNode(lv_id_10_0, grammarAccess.getActivityMetricAccess().getIdSTRINGTerminalRuleCall_6_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_10_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1017:3: (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1017:5: otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) )
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleActivityMetric2002); 

                        	newLeafNode(otherlv_11, grammarAccess.getActivityMetricAccess().getUnitKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1021:1: ( (lv_unit_12_0= ruleMetricUnit ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1022:1: (lv_unit_12_0= ruleMetricUnit )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1022:1: (lv_unit_12_0= ruleMetricUnit )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1023:3: lv_unit_12_0= ruleMetricUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityMetricAccess().getUnitMetricUnitEnumRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricUnit_in_ruleActivityMetric2023);
                    lv_unit_12_0=ruleMetricUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_12_0, 
                            		"MetricUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1039:4: (otherlv_13= 'activityBegin' ( (lv_activityBegin_14_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1039:6: otherlv_13= 'activityBegin' ( (lv_activityBegin_14_0= RULE_STRING ) )
            {
            otherlv_13=(Token)match(input,35,FOLLOW_35_in_ruleActivityMetric2038); 

                	newLeafNode(otherlv_13, grammarAccess.getActivityMetricAccess().getActivityBeginKeyword_8_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1043:1: ( (lv_activityBegin_14_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1044:1: (lv_activityBegin_14_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1044:1: (lv_activityBegin_14_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1045:3: lv_activityBegin_14_0= RULE_STRING
            {
            lv_activityBegin_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric2055); 

            			newLeafNode(lv_activityBegin_14_0, grammarAccess.getActivityMetricAccess().getActivityBeginSTRINGTerminalRuleCall_8_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activityBegin",
                    		lv_activityBegin_14_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1061:3: (otherlv_15= 'activityEnd' ( (lv_activityEnd_16_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1061:5: otherlv_15= 'activityEnd' ( (lv_activityEnd_16_0= RULE_STRING ) )
            {
            otherlv_15=(Token)match(input,36,FOLLOW_36_in_ruleActivityMetric2074); 

                	newLeafNode(otherlv_15, grammarAccess.getActivityMetricAccess().getActivityEndKeyword_9_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1065:1: ( (lv_activityEnd_16_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1066:1: (lv_activityEnd_16_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1066:1: (lv_activityEnd_16_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1067:3: lv_activityEnd_16_0= RULE_STRING
            {
            lv_activityEnd_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric2091); 

            			newLeafNode(lv_activityEnd_16_0, grammarAccess.getActivityMetricAccess().getActivityEndSTRINGTerminalRuleCall_9_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activityEnd",
                    		lv_activityEnd_16_0, 
                    		"STRING");
            	    

            }


            }


            }

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleActivityMetric2109); 

                	newLeafNode(otherlv_17, grammarAccess.getActivityMetricAccess().getSemicolonKeyword_10());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1095:1: entryRuleTaskMetric returns [EObject current=null] : iv_ruleTaskMetric= ruleTaskMetric EOF ;
    public final EObject entryRuleTaskMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskMetric = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1096:2: (iv_ruleTaskMetric= ruleTaskMetric EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1097:2: iv_ruleTaskMetric= ruleTaskMetric EOF
            {
             newCompositeNode(grammarAccess.getTaskMetricRule()); 
            pushFollow(FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric2145);
            iv_ruleTaskMetric=ruleTaskMetric();

            state._fsp--;

             current =iv_ruleTaskMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskMetric2155); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1104:1: ruleTaskMetric returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activities' ( (lv_activities_14_0= RULE_STRING ) ) ) otherlv_15= ';' ) ;
    public final EObject ruleTaskMetric() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_activities_14_0=null;
        Token otherlv_15=null;
        Enumerator lv_type_6_0 = null;

        Enumerator lv_form_8_0 = null;

        Enumerator lv_unit_12_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1107:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activities' ( (lv_activities_14_0= RULE_STRING ) ) ) otherlv_15= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1108:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activities' ( (lv_activities_14_0= RULE_STRING ) ) ) otherlv_15= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1108:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activities' ( (lv_activities_14_0= RULE_STRING ) ) ) otherlv_15= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1108:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) ) (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )? (otherlv_13= 'activities' ( (lv_activities_14_0= RULE_STRING ) ) ) otherlv_15= ';'
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1108:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1109:1: (lv_name_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1109:1: (lv_name_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1110:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2197); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTaskMetricAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleTaskMetric2214); 

                	newLeafNode(otherlv_1, grammarAccess.getTaskMetricAccess().getRelatesKeyword_1());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1130:1: ( (otherlv_2= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1131:1: (otherlv_2= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1131:1: (otherlv_2= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1132:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2234); 

            		newLeafNode(otherlv_2, grammarAccess.getTaskMetricAccess().getRelatesToProcessCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1143:2: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1143:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
            {
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleTaskMetric2247); 

                	newLeafNode(otherlv_3, grammarAccess.getTaskMetricAccess().getDescriptionKeyword_3_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1147:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1148:1: (lv_description_4_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1148:1: (lv_description_4_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1149:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2264); 

            			newLeafNode(lv_description_4_0, grammarAccess.getTaskMetricAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1165:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1165:5: otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) )
            {
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleTaskMetric2283); 

                	newLeafNode(otherlv_5, grammarAccess.getTaskMetricAccess().getTypeKeyword_4_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1169:1: ( (lv_type_6_0= ruleMetricType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1170:1: (lv_type_6_0= ruleMetricType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1170:1: (lv_type_6_0= ruleMetricType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1171:3: lv_type_6_0= ruleMetricType
            {
             
            	        newCompositeNode(grammarAccess.getTaskMetricAccess().getTypeMetricTypeEnumRuleCall_4_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMetricType_in_ruleTaskMetric2304);
            lv_type_6_0=ruleMetricType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskMetricRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"MetricType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1187:3: (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1187:5: otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleTaskMetric2318); 

                        	newLeafNode(otherlv_7, grammarAccess.getTaskMetricAccess().getFormKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1191:1: ( (lv_form_8_0= ruleColectType ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1192:1: (lv_form_8_0= ruleColectType )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1192:1: (lv_form_8_0= ruleColectType )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1193:3: lv_form_8_0= ruleColectType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskMetricAccess().getFormColectTypeEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColectType_in_ruleTaskMetric2339);
                    lv_form_8_0=ruleColectType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"form",
                            		lv_form_8_0, 
                            		"ColectType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1209:4: (otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1209:6: otherlv_9= 'id' ( (lv_id_10_0= RULE_STRING ) )
            {
            otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleTaskMetric2354); 

                	newLeafNode(otherlv_9, grammarAccess.getTaskMetricAccess().getIdKeyword_6_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1213:1: ( (lv_id_10_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1214:1: (lv_id_10_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1214:1: (lv_id_10_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1215:3: lv_id_10_0= RULE_STRING
            {
            lv_id_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2371); 

            			newLeafNode(lv_id_10_0, grammarAccess.getTaskMetricAccess().getIdSTRINGTerminalRuleCall_6_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_10_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1231:3: (otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1231:5: otherlv_11= 'unit' ( (lv_unit_12_0= ruleMetricUnit ) )
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleTaskMetric2390); 

                        	newLeafNode(otherlv_11, grammarAccess.getTaskMetricAccess().getUnitKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1235:1: ( (lv_unit_12_0= ruleMetricUnit ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1236:1: (lv_unit_12_0= ruleMetricUnit )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1236:1: (lv_unit_12_0= ruleMetricUnit )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1237:3: lv_unit_12_0= ruleMetricUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskMetricAccess().getUnitMetricUnitEnumRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricUnit_in_ruleTaskMetric2411);
                    lv_unit_12_0=ruleMetricUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_12_0, 
                            		"MetricUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1253:4: (otherlv_13= 'activities' ( (lv_activities_14_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1253:6: otherlv_13= 'activities' ( (lv_activities_14_0= RULE_STRING ) )
            {
            otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleTaskMetric2426); 

                	newLeafNode(otherlv_13, grammarAccess.getTaskMetricAccess().getActivitiesKeyword_8_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1257:1: ( (lv_activities_14_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1258:1: (lv_activities_14_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1258:1: (lv_activities_14_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1259:3: lv_activities_14_0= RULE_STRING
            {
            lv_activities_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric2443); 

            			newLeafNode(lv_activities_14_0, grammarAccess.getTaskMetricAccess().getActivitiesSTRINGTerminalRuleCall_8_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activities",
                    		lv_activities_14_0, 
                    		"STRING");
            	    

            }


            }


            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleTaskMetric2461); 

                	newLeafNode(otherlv_15, grammarAccess.getTaskMetricAccess().getSemicolonKeyword_9());
                

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


    // $ANTLR start "entryRuleArtefactMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1287:1: entryRuleArtefactMetric returns [EObject current=null] : iv_ruleArtefactMetric= ruleArtefactMetric EOF ;
    public final EObject entryRuleArtefactMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefactMetric = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1288:2: (iv_ruleArtefactMetric= ruleArtefactMetric EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1289:2: iv_ruleArtefactMetric= ruleArtefactMetric EOF
            {
             newCompositeNode(grammarAccess.getArtefactMetricRule()); 
            pushFollow(FOLLOW_ruleArtefactMetric_in_entryRuleArtefactMetric2497);
            iv_ruleArtefactMetric=ruleArtefactMetric();

            state._fsp--;

             current =iv_ruleArtefactMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefactMetric2507); 

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
    // $ANTLR end "entryRuleArtefactMetric"


    // $ANTLR start "ruleArtefactMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1296:1: ruleArtefactMetric returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_STRING ) ) ) (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? ) ;
    public final EObject ruleArtefactMetric() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_id_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_type_6_0 = null;

        Enumerator lv_unit_10_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1299:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_STRING ) ) ) (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1300:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_STRING ) ) ) (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1300:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_STRING ) ) ) (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1300:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'relates' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_STRING ) ) ) (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )?
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1300:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1301:1: (lv_name_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1301:1: (lv_name_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1302:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefactMetric2549); 

            			newLeafNode(lv_name_0_0, grammarAccess.getArtefactMetricAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleArtefactMetric2566); 

                	newLeafNode(otherlv_1, grammarAccess.getArtefactMetricAccess().getRelatesKeyword_1());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1322:1: ( (otherlv_2= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1323:1: (otherlv_2= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1323:1: (otherlv_2= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1324:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactMetricRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefactMetric2586); 

            		newLeafNode(otherlv_2, grammarAccess.getArtefactMetricAccess().getRelatesToArtefactCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1335:2: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1335:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
            {
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleArtefactMetric2599); 

                	newLeafNode(otherlv_3, grammarAccess.getArtefactMetricAccess().getDescriptionKeyword_3_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1339:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1340:1: (lv_description_4_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1340:1: (lv_description_4_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1341:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefactMetric2616); 

            			newLeafNode(lv_description_4_0, grammarAccess.getArtefactMetricAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1357:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1357:5: otherlv_5= 'type' ( (lv_type_6_0= ruleMetricType ) )
            {
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleArtefactMetric2635); 

                	newLeafNode(otherlv_5, grammarAccess.getArtefactMetricAccess().getTypeKeyword_4_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1361:1: ( (lv_type_6_0= ruleMetricType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1362:1: (lv_type_6_0= ruleMetricType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1362:1: (lv_type_6_0= ruleMetricType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1363:3: lv_type_6_0= ruleMetricType
            {
             
            	        newCompositeNode(grammarAccess.getArtefactMetricAccess().getTypeMetricTypeEnumRuleCall_4_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMetricType_in_ruleArtefactMetric2656);
            lv_type_6_0=ruleMetricType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArtefactMetricRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"MetricType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1379:3: (otherlv_7= 'id' ( (lv_id_8_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1379:5: otherlv_7= 'id' ( (lv_id_8_0= RULE_STRING ) )
            {
            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleArtefactMetric2670); 

                	newLeafNode(otherlv_7, grammarAccess.getArtefactMetricAccess().getIdKeyword_5_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1383:1: ( (lv_id_8_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1384:1: (lv_id_8_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1384:1: (lv_id_8_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1385:3: lv_id_8_0= RULE_STRING
            {
            lv_id_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefactMetric2687); 

            			newLeafNode(lv_id_8_0, grammarAccess.getArtefactMetricAccess().getIdSTRINGTerminalRuleCall_5_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_8_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1401:3: (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1401:5: otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) )
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleArtefactMetric2706); 

                        	newLeafNode(otherlv_9, grammarAccess.getArtefactMetricAccess().getUnitKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1405:1: ( (lv_unit_10_0= ruleMetricUnit ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1406:1: (lv_unit_10_0= ruleMetricUnit )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1406:1: (lv_unit_10_0= ruleMetricUnit )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1407:3: lv_unit_10_0= ruleMetricUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getArtefactMetricAccess().getUnitMetricUnitEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricUnit_in_ruleArtefactMetric2727);
                    lv_unit_10_0=ruleMetricUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArtefactMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_10_0, 
                            		"MetricUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleArtefactMetric"


    // $ANTLR start "entryRuleQuestion"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1433:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1434:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1435:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion2767);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion2777); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1442:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Q.' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}' ) ;
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
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1445:28: ( (otherlv_0= 'Q.' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1446:1: (otherlv_0= 'Q.' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1446:1: (otherlv_0= 'Q.' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1446:3: otherlv_0= 'Q.' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) ) (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) ) (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )? ( (lv_alternatives_11_0= ruleAlternatives ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleQuestion2814); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1450:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1451:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1451:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1452:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion2831); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQuestion2848); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1472:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1472:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
            {
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleQuestion2861); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getDescriptionKeyword_3_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1476:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1477:1: (lv_description_4_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1477:1: (lv_description_4_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1478:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion2878); 

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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1494:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1494:5: otherlv_5= 'type' ( (lv_type_6_0= ruleAnswerType ) )
            {
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleQuestion2897); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getTypeKeyword_4_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1498:1: ( (lv_type_6_0= ruleAnswerType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1499:1: (lv_type_6_0= ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1499:1: (lv_type_6_0= ruleAnswerType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1500:3: lv_type_6_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_4_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion2918);
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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1516:3: (otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1516:5: otherlv_7= 'id' ( (lv_id_8_0= RULE_ID ) )
            {
            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleQuestion2932); 

                	newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getIdKeyword_5_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1520:1: ( (lv_id_8_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1521:1: (lv_id_8_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1521:1: (lv_id_8_0= RULE_ID )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1522:3: lv_id_8_0= RULE_ID
            {
            lv_id_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion2949); 

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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1538:3: (otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1538:5: otherlv_9= 'required' ( (lv_req_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleQuestion2968); 

                        	newLeafNode(otherlv_9, grammarAccess.getQuestionAccess().getRequiredKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1542:1: ( (lv_req_10_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1543:1: (lv_req_10_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1543:1: (lv_req_10_0= RULE_INT )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1544:3: lv_req_10_0= RULE_INT
                    {
                    lv_req_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuestion2985); 

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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1560:4: ( (lv_alternatives_11_0= ruleAlternatives ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1561:1: (lv_alternatives_11_0= ruleAlternatives )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1561:1: (lv_alternatives_11_0= ruleAlternatives )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1562:3: lv_alternatives_11_0= ruleAlternatives
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAlternatives_in_ruleQuestion3013);
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
            	    break loop30;
                }
            } while (true);

            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleQuestion3026); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1590:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1591:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1592:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives3062);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives3072); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1599:1: ruleAlternatives returns [EObject current=null] : ( (lv_description_0_0= RULE_STRING ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1602:28: ( ( (lv_description_0_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1603:1: ( (lv_description_0_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1603:1: ( (lv_description_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1604:1: (lv_description_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1604:1: (lv_description_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1605:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternatives3113); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1629:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' ) | (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' ) | (enumLiteral_2= 'LS \\u2013 Latin Square' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1631:28: ( ( (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' ) | (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' ) | (enumLiteral_2= 'LS \\u2013 Latin Square' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1632:1: ( (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' ) | (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' ) | (enumLiteral_2= 'LS \\u2013 Latin Square' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1632:1: ( (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' ) | (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' ) | (enumLiteral_2= 'LS \\u2013 Latin Square' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt31=1;
                }
                break;
            case 41:
                {
                alt31=2;
                }
                break;
            case 42:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1632:2: (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1632:2: (enumLiteral_0= 'CRD \\u2013 Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1632:4: enumLiteral_0= 'CRD \\u2013 Completely Randomized Design'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleDesignType3167); 

                            current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1638:6: (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1638:6: (enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1638:8: enumLiteral_1= 'RCBD \\u2013 Randomized Complete Block Design'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleDesignType3184); 

                            current = grammarAccess.getDesignTypeAccess().getRCDBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCDBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1644:6: (enumLiteral_2= 'LS \\u2013 Latin Square' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1644:6: (enumLiteral_2= 'LS \\u2013 Latin Square' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1644:8: enumLiteral_2= 'LS \\u2013 Latin Square'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleDesignType3201); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1654:1: ruleAnswerType returns [Enumerator current=null] : ( (enumLiteral_0= 'ComboBox' ) | (enumLiteral_1= 'CheckBoxes' ) | (enumLiteral_2= 'OptionButtons' ) ) ;
    public final Enumerator ruleAnswerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1656:28: ( ( (enumLiteral_0= 'ComboBox' ) | (enumLiteral_1= 'CheckBoxes' ) | (enumLiteral_2= 'OptionButtons' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1657:1: ( (enumLiteral_0= 'ComboBox' ) | (enumLiteral_1= 'CheckBoxes' ) | (enumLiteral_2= 'OptionButtons' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1657:1: ( (enumLiteral_0= 'ComboBox' ) | (enumLiteral_1= 'CheckBoxes' ) | (enumLiteral_2= 'OptionButtons' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt32=1;
                }
                break;
            case 44:
                {
                alt32=2;
                }
                break;
            case 45:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1657:2: (enumLiteral_0= 'ComboBox' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1657:2: (enumLiteral_0= 'ComboBox' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1657:4: enumLiteral_0= 'ComboBox'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleAnswerType3246); 

                            current = grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1663:6: (enumLiteral_1= 'CheckBoxes' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1663:6: (enumLiteral_1= 'CheckBoxes' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1663:8: enumLiteral_1= 'CheckBoxes'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleAnswerType3263); 

                            current = grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1669:6: (enumLiteral_2= 'OptionButtons' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1669:6: (enumLiteral_2= 'OptionButtons' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1669:8: enumLiteral_2= 'OptionButtons'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleAnswerType3280); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1679:1: ruleMetricType returns [Enumerator current=null] : ( (enumLiteral_0= 'hardData' ) | (enumLiteral_1= 'softData' ) | (enumLiteral_2= 'normalizedData' ) ) ;
    public final Enumerator ruleMetricType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1681:28: ( ( (enumLiteral_0= 'hardData' ) | (enumLiteral_1= 'softData' ) | (enumLiteral_2= 'normalizedData' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1682:1: ( (enumLiteral_0= 'hardData' ) | (enumLiteral_1= 'softData' ) | (enumLiteral_2= 'normalizedData' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1682:1: ( (enumLiteral_0= 'hardData' ) | (enumLiteral_1= 'softData' ) | (enumLiteral_2= 'normalizedData' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt33=1;
                }
                break;
            case 47:
                {
                alt33=2;
                }
                break;
            case 48:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1682:2: (enumLiteral_0= 'hardData' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1682:2: (enumLiteral_0= 'hardData' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1682:4: enumLiteral_0= 'hardData'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleMetricType3325); 

                            current = grammarAccess.getMetricTypeAccess().getHardDataEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getHardDataEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1688:6: (enumLiteral_1= 'softData' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1688:6: (enumLiteral_1= 'softData' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1688:8: enumLiteral_1= 'softData'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleMetricType3342); 

                            current = grammarAccess.getMetricTypeAccess().getSoftDataEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMetricTypeAccess().getSoftDataEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1694:6: (enumLiteral_2= 'normalizedData' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1694:6: (enumLiteral_2= 'normalizedData' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1694:8: enumLiteral_2= 'normalizedData'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleMetricType3359); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1704:1: ruleColectType returns [Enumerator current=null] : ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) ) ;
    public final Enumerator ruleColectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1706:28: ( ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1707:1: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1707:1: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            else if ( (LA34_0==50) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1707:2: (enumLiteral_0= 'continuous' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1707:2: (enumLiteral_0= 'continuous' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1707:4: enumLiteral_0= 'continuous'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleColectType3404); 

                            current = grammarAccess.getColectTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColectTypeAccess().getContinuousEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1713:6: (enumLiteral_1= 'intercalated' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1713:6: (enumLiteral_1= 'intercalated' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1713:8: enumLiteral_1= 'intercalated'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleColectType3421); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1723:1: ruleMetricUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) ) ;
    public final Enumerator ruleMetricUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1725:28: ( ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1726:1: ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1726:1: ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            else if ( (LA35_0==52) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1726:2: (enumLiteral_0= 'minutes' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1726:2: (enumLiteral_0= 'minutes' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1726:4: enumLiteral_0= 'minutes'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleMetricUnit3466); 

                            current = grammarAccess.getMetricUnitAccess().getMinutesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetricUnitAccess().getMinutesEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1732:6: (enumLiteral_1= 'uc' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1732:6: (enumLiteral_1= 'uc' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1732:8: enumLiteral_1= 'uc'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleMetricUnit3483); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExperimentElement213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentElement230 = new BitSet(new long[]{0x0000000008007002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleExperimentElement256 = new BitSet(new long[]{0x0000000008007002L});
    public static final BitSet FOLLOW_ruleMetrics_in_ruleExperimentElement278 = new BitSet(new long[]{0x0000000008003002L});
    public static final BitSet FOLLOW_12_in_ruleExperimentElement292 = new BitSet(new long[]{0x0000000000802002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement313 = new BitSet(new long[]{0x0000000000802002L});
    public static final BitSet FOLLOW_13_in_ruleExperimentElement329 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleExperimentElement350 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProcess436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcess453 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleProcess479 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleProcess492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleActivity575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity592 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_17_in_ruleActivity610 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleActivity631 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleActivity647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleActivity668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity688 = new BitSet(new long[]{0x0000000000480022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity710 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleActivity737 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_19_in_ruleActivity751 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleActivity772 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleActivity785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefact_in_entryRuleArtefact823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefact833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefact874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTask961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask978 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTask995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRole1078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRole1095 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRole1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentalPlan1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleExperimentalPlan1195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentalPlan1212 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExperimentalPlan1229 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleExperimentalPlan1250 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExperimentalPlan1271 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_15_in_ruleExperimentalPlan1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFactor1367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFactor1384 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleFactor1410 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleFactor1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevels_in_entryRuleLevels1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevels1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLevels1506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLevels1523 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLevels1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetrics_in_entryRuleMetrics1576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetrics1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMetrics1624 = new BitSet(new long[]{0x0000000030000012L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_ruleMetrics1645 = new BitSet(new long[]{0x0000000030000012L});
    public static final BitSet FOLLOW_28_in_ruleMetrics1660 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_ruleMetrics1681 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_29_in_ruleMetrics1697 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArtefactMetric_in_ruleMetrics1718 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityMetric1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1809 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleActivityMetric1826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1846 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleActivityMetric1859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1876 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActivityMetric1895 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_ruleMetricType_in_ruleActivityMetric1916 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleActivityMetric1930 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleColectType_in_ruleActivityMetric1951 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleActivityMetric1966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1983 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleActivityMetric2002 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleMetricUnit_in_ruleActivityMetric2023 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleActivityMetric2038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric2055 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleActivityMetric2074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric2091 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActivityMetric2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric2145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskMetric2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2197 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTaskMetric2214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2234 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTaskMetric2247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2264 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTaskMetric2283 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_ruleMetricType_in_ruleTaskMetric2304 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleTaskMetric2318 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleColectType_in_ruleTaskMetric2339 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTaskMetric2354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2371 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_34_in_ruleTaskMetric2390 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleMetricUnit_in_ruleTaskMetric2411 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTaskMetric2426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric2443 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTaskMetric2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefactMetric_in_entryRuleArtefactMetric2497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefactMetric2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefactMetric2549 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleArtefactMetric2566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefactMetric2586 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleArtefactMetric2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefactMetric2616 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleArtefactMetric2635 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_ruleMetricType_in_ruleArtefactMetric2656 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArtefactMetric2670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefactMetric2687 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleArtefactMetric2706 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleMetricUnit_in_ruleArtefactMetric2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion2767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleQuestion2814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion2831 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuestion2848 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleQuestion2861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion2878 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuestion2897 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion2918 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleQuestion2932 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion2949 = new BitSet(new long[]{0x0000008000100010L});
    public static final BitSet FOLLOW_39_in_ruleQuestion2968 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuestion2985 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleQuestion3013 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleQuestion3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternatives3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDesignType3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDesignType3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDesignType3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAnswerType3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAnswerType3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAnswerType3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMetricType3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMetricType3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMetricType3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleColectType3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleColectType3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMetricUnit3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMetricUnit3483 = new BitSet(new long[]{0x0000000000000002L});

}