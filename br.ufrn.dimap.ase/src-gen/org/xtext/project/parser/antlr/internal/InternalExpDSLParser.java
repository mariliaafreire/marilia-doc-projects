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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Experiment'", "'Experimental Plan'", "'Questionnaires'", "'Process'", "'{'", "'}'", "'Activity'", "'Task'", "'description'", "'artefacts'", "';'", "'Role'", "'artefact'", "'type'", "'Metric'", "'relates'", "'form'", "'unit'", "'activityBegin'", "'activityEnd'", "'tasks'", "'Design'", "'Internal Replication '", "'Parameter'", "'='", "'Factor'", "'isDesiredVariation'", "'True'", "'False'", "'Level'", "'Link'", "'to'", "'Questionnaire'", "'};'", "'required'", "'Alternatives'", "'Option'", "'input'", "'output'", "'inoutput'", "'continuous'", "'intercalated'", "'minutes'", "'uc'", "'CRD - Completely Randomized Design'", "'RCBD - Randomized Complete Block Design'", "'LS - Latin Square'", "'Pre'", "'Pos'", "'Text'", "'Paragraph Text'", "'Multiple Choice'", "'ComboBox'", "'CheckBoxes'", "'Scale'", "'Grid'"
    };
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:116:1: ruleExperimentElement returns [EObject current=null] : (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) ;
    public final EObject ruleExperimentElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_process_2_0 = null;

        EObject lv_metrics_3_0 = null;

        EObject lv_experiments_5_0 = null;

        EObject lv_questionnaire_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:119:28: ( (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:120:3: otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
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

                if ( (LA3_0==25) ) {
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

                        if ( (LA4_0==32) ) {
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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:200:5: (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:200:7: otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleExperimentElement329); 

                        	newLeafNode(otherlv_6, grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:204:1: ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==43) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:205:1: (lv_questionnaire_7_0= ruleQuestionnaire )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:205:1: (lv_questionnaire_7_0= ruleQuestionnaire )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:206:3: lv_questionnaire_7_0= ruleQuestionnaire
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getQuestionnaireQuestionnaireParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQuestionnaire_in_ruleExperimentElement350);
                    	    lv_questionnaire_7_0=ruleQuestionnaire();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"questionnaire",
                    	            		lv_questionnaire_7_0, 
                    	            		"Questionnaire");
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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:239:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_activities_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:242:28: ( (otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* otherlv_4= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:243:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* otherlv_4= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:243:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* otherlv_4= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:243:3: otherlv_0= 'Process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* otherlv_4= '}'
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProcess470); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:269:1: ( (lv_activities_3_0= ruleActivity ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:270:1: (lv_activities_3_0= ruleActivity )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:270:1: (lv_activities_3_0= ruleActivity )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:271:3: lv_activities_3_0= ruleActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getActivitiesActivityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleProcess491);
            	    lv_activities_3_0=ruleActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_3_0, 
            	            		"Activity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleProcess504); 

                	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:299:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:300:2: (iv_ruleActivity= ruleActivity EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:301:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity540);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity550); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:308:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (otherlv_3= RULE_STRING ) )? ( (lv_artefacts_4_0= ruleArtefact ) )? ( (lv_role_5_0= ruleRole ) )? (otherlv_6= '{' ( (lv_tasks_7_0= ruleTask ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_artefacts_4_0 = null;

        EObject lv_role_5_0 = null;

        EObject lv_tasks_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:311:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (otherlv_3= RULE_STRING ) )? ( (lv_artefacts_4_0= ruleArtefact ) )? ( (lv_role_5_0= ruleRole ) )? (otherlv_6= '{' ( (lv_tasks_7_0= ruleTask ) )* otherlv_8= '}' )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:312:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (otherlv_3= RULE_STRING ) )? ( (lv_artefacts_4_0= ruleArtefact ) )? ( (lv_role_5_0= ruleRole ) )? (otherlv_6= '{' ( (lv_tasks_7_0= ruleTask ) )* otherlv_8= '}' )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:312:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (otherlv_3= RULE_STRING ) )? ( (lv_artefacts_4_0= ruleArtefact ) )? ( (lv_role_5_0= ruleRole ) )? (otherlv_6= '{' ( (lv_tasks_7_0= ruleTask ) )* otherlv_8= '}' )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:312:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (otherlv_3= RULE_STRING ) )? ( (lv_artefacts_4_0= ruleArtefact ) )? ( (lv_role_5_0= ruleRole ) )? (otherlv_6= '{' ( (lv_tasks_7_0= ruleTask ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleActivity587); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:316:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:317:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:317:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:318:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity604); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:334:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:335:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:335:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:336:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity626); 

            			newLeafNode(lv_description_2_0, grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:352:2: ( (otherlv_3= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:353:1: (otherlv_3= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:353:1: (otherlv_3= RULE_STRING )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:354:3: otherlv_3= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity651); 

                    		newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getNextActivityCrossReference_3_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:365:3: ( (lv_artefacts_4_0= ruleArtefact ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:366:1: (lv_artefacts_4_0= ruleArtefact )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:366:1: (lv_artefacts_4_0= ruleArtefact )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:367:3: lv_artefacts_4_0= ruleArtefact
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getArtefactsArtefactParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArtefact_in_ruleActivity673);
                    lv_artefacts_4_0=ruleArtefact();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"artefacts",
                            		lv_artefacts_4_0, 
                            		"Artefact");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:383:3: ( (lv_role_5_0= ruleRole ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:384:1: (lv_role_5_0= ruleRole )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:384:1: (lv_role_5_0= ruleRole )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:385:3: lv_role_5_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getRoleRoleParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRole_in_ruleActivity695);
                    lv_role_5_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"role",
                            		lv_role_5_0, 
                            		"Role");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:401:3: (otherlv_6= '{' ( (lv_tasks_7_0= ruleTask ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:401:5: otherlv_6= '{' ( (lv_tasks_7_0= ruleTask ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleActivity709); 

                        	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:405:1: ( (lv_tasks_7_0= ruleTask ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:406:1: (lv_tasks_7_0= ruleTask )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:406:1: (lv_tasks_7_0= ruleTask )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:407:3: lv_tasks_7_0= ruleTask
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTasksTaskParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTask_in_ruleActivity730);
                    	    lv_tasks_7_0=ruleTask();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tasks",
                    	            		lv_tasks_7_0, 
                    	            		"Task");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleActivity743); 

                        	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_2());
                        

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:435:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:436:2: (iv_ruleTask= ruleTask EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:437:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask781);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask791); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:444:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'artefacts' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_role_6_0= ruleRole ) )? otherlv_7= ';' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_artefacts_5_0 = null;

        EObject lv_role_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:447:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'artefacts' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_role_6_0= ruleRole ) )? otherlv_7= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:448:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'artefacts' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_role_6_0= ruleRole ) )? otherlv_7= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:448:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'artefacts' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_role_6_0= ruleRole ) )? otherlv_7= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:448:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'artefacts' ( (lv_artefacts_5_0= ruleArtefact ) )* )? ( (lv_role_6_0= ruleRole ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTask828); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:452:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:453:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:453:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:454:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask845); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTask862); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:474:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:475:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:475:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:476:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask879); 

            			newLeafNode(lv_description_3_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:492:2: (otherlv_4= 'artefacts' ( (lv_artefacts_5_0= ruleArtefact ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:492:4: otherlv_4= 'artefacts' ( (lv_artefacts_5_0= ruleArtefact ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTask897); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getArtefactsKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:496:1: ( (lv_artefacts_5_0= ruleArtefact ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==23) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:497:1: (lv_artefacts_5_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:497:1: (lv_artefacts_5_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:498:3: lv_artefacts_5_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getArtefactsArtefactParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleTask918);
                    	    lv_artefacts_5_0=ruleArtefact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:514:5: ( (lv_role_6_0= ruleRole ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:515:1: (lv_role_6_0= ruleRole )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:515:1: (lv_role_6_0= ruleRole )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:516:3: lv_role_6_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskAccess().getRoleRoleParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRole_in_ruleTask942);
                    lv_role_6_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	        }
                           		add(
                           			current, 
                           			"role",
                            		lv_role_6_0, 
                            		"Role");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleTask955); 

                	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSemicolonKeyword_6());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:544:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:545:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:546:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole991);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1001); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:553:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:556:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:557:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:557:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:557:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRole1038); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:561:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:562:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:562:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:563:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRole1055); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleRole1072); 

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


    // $ANTLR start "entryRuleArtefact"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:591:1: entryRuleArtefact returns [EObject current=null] : iv_ruleArtefact= ruleArtefact EOF ;
    public final EObject entryRuleArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefact = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:592:2: (iv_ruleArtefact= ruleArtefact EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:593:2: iv_ruleArtefact= ruleArtefact EOF
            {
             newCompositeNode(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_ruleArtefact_in_entryRuleArtefact1108);
            iv_ruleArtefact=ruleArtefact();

            state._fsp--;

             current =iv_ruleArtefact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefact1118); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:600:1: ruleArtefact returns [EObject current=null] : (otherlv_0= 'artefact' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleArtefactType ) ) otherlv_6= ';' ) ;
    public final EObject ruleArtefact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:603:28: ( (otherlv_0= 'artefact' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleArtefactType ) ) otherlv_6= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:604:1: (otherlv_0= 'artefact' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleArtefactType ) ) otherlv_6= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:604:1: (otherlv_0= 'artefact' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleArtefactType ) ) otherlv_6= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:604:3: otherlv_0= 'artefact' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleArtefactType ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleArtefact1155); 

                	newLeafNode(otherlv_0, grammarAccess.getArtefactAccess().getArtefactKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:608:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:609:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:609:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:610:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefact1172); 

            			newLeafNode(lv_name_1_0, grammarAccess.getArtefactAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleArtefact1189); 

                	newLeafNode(otherlv_2, grammarAccess.getArtefactAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:630:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:631:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:631:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:632:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefact1206); 

            			newLeafNode(lv_description_3_0, grammarAccess.getArtefactAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleArtefact1223); 

                	newLeafNode(otherlv_4, grammarAccess.getArtefactAccess().getTypeKeyword_4());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:652:1: ( (lv_type_5_0= ruleArtefactType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:653:1: (lv_type_5_0= ruleArtefactType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:653:1: (lv_type_5_0= ruleArtefactType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:654:3: lv_type_5_0= ruleArtefactType
            {
             
            	        newCompositeNode(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleArtefactType_in_ruleArtefact1244);
            lv_type_5_0=ruleArtefactType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArtefactRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"ArtefactType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleArtefact1256); 

                	newLeafNode(otherlv_6, grammarAccess.getArtefactAccess().getSemicolonKeyword_6());
                

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


    // $ANTLR start "entryRuleMetrics"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:682:1: entryRuleMetrics returns [EObject current=null] : iv_ruleMetrics= ruleMetrics EOF ;
    public final EObject entryRuleMetrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrics = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:683:2: (iv_ruleMetrics= ruleMetrics EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:684:2: iv_ruleMetrics= ruleMetrics EOF
            {
             newCompositeNode(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_ruleMetrics_in_entryRuleMetrics1292);
            iv_ruleMetrics=ruleMetrics();

            state._fsp--;

             current =iv_ruleMetrics; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetrics1302); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:691:1: ruleMetrics returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? ( (lv_detail_11_0= ruleDetail ) ) otherlv_12= '}' ) ;
    public final EObject ruleMetrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Enumerator lv_form_8_0 = null;

        Enumerator lv_unit_10_0 = null;

        EObject lv_detail_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:694:28: ( (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? ( (lv_detail_11_0= ruleDetail ) ) otherlv_12= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:695:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? ( (lv_detail_11_0= ruleDetail ) ) otherlv_12= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:695:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? ( (lv_detail_11_0= ruleDetail ) ) otherlv_12= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:695:3: otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )? ( (lv_detail_11_0= ruleDetail ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleMetrics1339); 

                	newLeafNode(otherlv_0, grammarAccess.getMetricsAccess().getMetricKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:699:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:700:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:700:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:701:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetrics1356); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMetricsAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleMetrics1373); 

                	newLeafNode(otherlv_2, grammarAccess.getMetricsAccess().getRelatesKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:721:1: ( (otherlv_3= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:722:1: (otherlv_3= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:722:1: (otherlv_3= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:723:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricsRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetrics1393); 

            		newLeafNode(otherlv_3, grammarAccess.getMetricsAccess().getRelatesToProcessCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleMetrics1405); 

                	newLeafNode(otherlv_4, grammarAccess.getMetricsAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:738:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:738:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleMetrics1418); 

                	newLeafNode(otherlv_5, grammarAccess.getMetricsAccess().getDescriptionKeyword_5_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:742:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:743:1: (lv_description_6_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:743:1: (lv_description_6_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:744:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetrics1435); 

            			newLeafNode(lv_description_6_0, grammarAccess.getMetricsAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:760:3: (otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:760:5: otherlv_7= 'form' ( (lv_form_8_0= ruleColectType ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleMetrics1454); 

                        	newLeafNode(otherlv_7, grammarAccess.getMetricsAccess().getFormKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:764:1: ( (lv_form_8_0= ruleColectType ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:765:1: (lv_form_8_0= ruleColectType )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:765:1: (lv_form_8_0= ruleColectType )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:766:3: lv_form_8_0= ruleColectType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetricsAccess().getFormColectTypeEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColectType_in_ruleMetrics1475);
                    lv_form_8_0=ruleColectType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetricsRule());
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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:782:4: (otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:782:6: otherlv_9= 'unit' ( (lv_unit_10_0= ruleMetricUnit ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleMetrics1490); 

                        	newLeafNode(otherlv_9, grammarAccess.getMetricsAccess().getUnitKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:786:1: ( (lv_unit_10_0= ruleMetricUnit ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:787:1: (lv_unit_10_0= ruleMetricUnit )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:787:1: (lv_unit_10_0= ruleMetricUnit )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:788:3: lv_unit_10_0= ruleMetricUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetricsAccess().getUnitMetricUnitEnumRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricUnit_in_ruleMetrics1511);
                    lv_unit_10_0=ruleMetricUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetricsRule());
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

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:804:4: ( (lv_detail_11_0= ruleDetail ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:805:1: (lv_detail_11_0= ruleDetail )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:805:1: (lv_detail_11_0= ruleDetail )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:806:3: lv_detail_11_0= ruleDetail
            {
             
            	        newCompositeNode(grammarAccess.getMetricsAccess().getDetailDetailParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleDetail_in_ruleMetrics1534);
            lv_detail_11_0=ruleDetail();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetricsRule());
            	        }
                   		add(
                   			current, 
                   			"detail",
                    		lv_detail_11_0, 
                    		"Detail");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleMetrics1546); 

                	newLeafNode(otherlv_12, grammarAccess.getMetricsAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleDetail"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:834:1: entryRuleDetail returns [EObject current=null] : iv_ruleDetail= ruleDetail EOF ;
    public final EObject entryRuleDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetail = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:835:2: (iv_ruleDetail= ruleDetail EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:836:2: iv_ruleDetail= ruleDetail EOF
            {
             newCompositeNode(grammarAccess.getDetailRule()); 
            pushFollow(FOLLOW_ruleDetail_in_entryRuleDetail1582);
            iv_ruleDetail=ruleDetail();

            state._fsp--;

             current =iv_ruleDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetail1592); 

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
    // $ANTLR end "entryRuleDetail"


    // $ANTLR start "ruleDetail"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:843:1: ruleDetail returns [EObject current=null] : (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric | this_ArtefactMetric_2= ruleArtefactMetric ) ;
    public final EObject ruleDetail() throws RecognitionException {
        EObject current = null;

        EObject this_ActivityMetric_0 = null;

        EObject this_TaskMetric_1 = null;

        EObject this_ArtefactMetric_2 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:846:28: ( (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric | this_ArtefactMetric_2= ruleArtefactMetric ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:847:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric | this_ArtefactMetric_2= ruleArtefactMetric )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:847:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric | this_ArtefactMetric_2= ruleArtefactMetric )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt19=1;
                }
                break;
            case 31:
                {
                alt19=2;
                }
                break;
            case 20:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:848:5: this_ActivityMetric_0= ruleActivityMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getActivityMetricParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivityMetric_in_ruleDetail1639);
                    this_ActivityMetric_0=ruleActivityMetric();

                    state._fsp--;

                     
                            current = this_ActivityMetric_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:858:5: this_TaskMetric_1= ruleTaskMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getTaskMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTaskMetric_in_ruleDetail1666);
                    this_TaskMetric_1=ruleTaskMetric();

                    state._fsp--;

                     
                            current = this_TaskMetric_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:868:5: this_ArtefactMetric_2= ruleArtefactMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getArtefactMetricParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleArtefactMetric_in_ruleDetail1693);
                    this_ArtefactMetric_2=ruleArtefactMetric();

                    state._fsp--;

                     
                            current = this_ArtefactMetric_2; 
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
    // $ANTLR end "ruleDetail"


    // $ANTLR start "entryRuleActivityMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:884:1: entryRuleActivityMetric returns [EObject current=null] : iv_ruleActivityMetric= ruleActivityMetric EOF ;
    public final EObject entryRuleActivityMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityMetric = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:885:2: (iv_ruleActivityMetric= ruleActivityMetric EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:886:2: iv_ruleActivityMetric= ruleActivityMetric EOF
            {
             newCompositeNode(grammarAccess.getActivityMetricRule()); 
            pushFollow(FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric1728);
            iv_ruleActivityMetric=ruleActivityMetric();

            state._fsp--;

             current =iv_ruleActivityMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityMetric1738); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:893:1: ruleActivityMetric returns [EObject current=null] : ( (otherlv_0= 'activityBegin' ( (otherlv_1= RULE_STRING ) ) ) (otherlv_2= 'activityEnd' ( (otherlv_3= RULE_STRING ) ) )? ) ;
    public final EObject ruleActivityMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:896:28: ( ( (otherlv_0= 'activityBegin' ( (otherlv_1= RULE_STRING ) ) ) (otherlv_2= 'activityEnd' ( (otherlv_3= RULE_STRING ) ) )? ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:897:1: ( (otherlv_0= 'activityBegin' ( (otherlv_1= RULE_STRING ) ) ) (otherlv_2= 'activityEnd' ( (otherlv_3= RULE_STRING ) ) )? )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:897:1: ( (otherlv_0= 'activityBegin' ( (otherlv_1= RULE_STRING ) ) ) (otherlv_2= 'activityEnd' ( (otherlv_3= RULE_STRING ) ) )? )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:897:2: (otherlv_0= 'activityBegin' ( (otherlv_1= RULE_STRING ) ) ) (otherlv_2= 'activityEnd' ( (otherlv_3= RULE_STRING ) ) )?
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:897:2: (otherlv_0= 'activityBegin' ( (otherlv_1= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:897:4: otherlv_0= 'activityBegin' ( (otherlv_1= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleActivityMetric1776); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityMetricAccess().getActivityBeginKeyword_0_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:901:1: ( (otherlv_1= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:902:1: (otherlv_1= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:902:1: (otherlv_1= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:903:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1796); 

            		newLeafNode(otherlv_1, grammarAccess.getActivityMetricAccess().getActivityBeginActivityCrossReference_0_1_0()); 
            	

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:914:3: (otherlv_2= 'activityEnd' ( (otherlv_3= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:914:5: otherlv_2= 'activityEnd' ( (otherlv_3= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleActivityMetric1810); 

                        	newLeafNode(otherlv_2, grammarAccess.getActivityMetricAccess().getActivityEndKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:918:1: ( (otherlv_3= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:919:1: (otherlv_3= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:919:1: (otherlv_3= RULE_STRING )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:920:3: otherlv_3= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityMetricRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityMetric1830); 

                    		newLeafNode(otherlv_3, grammarAccess.getActivityMetricAccess().getActivityEndActivityCrossReference_1_1_0()); 
                    	

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
    // $ANTLR end "ruleActivityMetric"


    // $ANTLR start "entryRuleTaskMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:939:1: entryRuleTaskMetric returns [EObject current=null] : iv_ruleTaskMetric= ruleTaskMetric EOF ;
    public final EObject entryRuleTaskMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskMetric = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:940:2: (iv_ruleTaskMetric= ruleTaskMetric EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:941:2: iv_ruleTaskMetric= ruleTaskMetric EOF
            {
             newCompositeNode(grammarAccess.getTaskMetricRule()); 
            pushFollow(FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric1868);
            iv_ruleTaskMetric=ruleTaskMetric();

            state._fsp--;

             current =iv_ruleTaskMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskMetric1878); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:948:1: ruleTaskMetric returns [EObject current=null] : (otherlv_0= 'tasks' ( (otherlv_1= RULE_STRING ) )* ) ;
    public final EObject ruleTaskMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:951:28: ( (otherlv_0= 'tasks' ( (otherlv_1= RULE_STRING ) )* ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:952:1: (otherlv_0= 'tasks' ( (otherlv_1= RULE_STRING ) )* )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:952:1: (otherlv_0= 'tasks' ( (otherlv_1= RULE_STRING ) )* )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:952:3: otherlv_0= 'tasks' ( (otherlv_1= RULE_STRING ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTaskMetric1915); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskMetricAccess().getTasksKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:956:1: ( (otherlv_1= RULE_STRING ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:957:1: (otherlv_1= RULE_STRING )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:957:1: (otherlv_1= RULE_STRING )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:958:3: otherlv_1= RULE_STRING
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	    	        }
            	            
            	    otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskMetric1935); 

            	    		newLeafNode(otherlv_1, grammarAccess.getTaskMetricAccess().getTasksTaskCrossReference_1_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleTaskMetric"


    // $ANTLR start "entryRuleArtefactMetric"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:977:1: entryRuleArtefactMetric returns [EObject current=null] : iv_ruleArtefactMetric= ruleArtefactMetric EOF ;
    public final EObject entryRuleArtefactMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefactMetric = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:978:2: (iv_ruleArtefactMetric= ruleArtefactMetric EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:979:2: iv_ruleArtefactMetric= ruleArtefactMetric EOF
            {
             newCompositeNode(grammarAccess.getArtefactMetricRule()); 
            pushFollow(FOLLOW_ruleArtefactMetric_in_entryRuleArtefactMetric1972);
            iv_ruleArtefactMetric=ruleArtefactMetric();

            state._fsp--;

             current =iv_ruleArtefactMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefactMetric1982); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:986:1: ruleArtefactMetric returns [EObject current=null] : (otherlv_0= 'artefacts' ( (lv_name_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_STRING ) )* ) ;
    public final EObject ruleArtefactMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:989:28: ( (otherlv_0= 'artefacts' ( (lv_name_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_STRING ) )* ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:990:1: (otherlv_0= 'artefacts' ( (lv_name_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_STRING ) )* )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:990:1: (otherlv_0= 'artefacts' ( (lv_name_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_STRING ) )* )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:990:3: otherlv_0= 'artefacts' ( (lv_name_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_STRING ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleArtefactMetric2019); 

                	newLeafNode(otherlv_0, grammarAccess.getArtefactMetricAccess().getArtefactsKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:994:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:995:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:995:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:996:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefactMetric2036); 

            			newLeafNode(lv_name_1_0, grammarAccess.getArtefactMetricAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1012:2: ( (otherlv_2= RULE_STRING ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1013:1: (otherlv_2= RULE_STRING )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1013:1: (otherlv_2= RULE_STRING )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1014:3: otherlv_2= RULE_STRING
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getArtefactMetricRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefactMetric2061); 

            	    		newLeafNode(otherlv_2, grammarAccess.getArtefactMetricAccess().getArtefactsArtefactCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleArtefactMetric"


    // $ANTLR start "entryRuleExperimentalPlan"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1033:1: entryRuleExperimentalPlan returns [EObject current=null] : iv_ruleExperimentalPlan= ruleExperimentalPlan EOF ;
    public final EObject entryRuleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentalPlan = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1034:2: (iv_ruleExperimentalPlan= ruleExperimentalPlan EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1035:2: iv_ruleExperimentalPlan= ruleExperimentalPlan EOF
            {
             newCompositeNode(grammarAccess.getExperimentalPlanRule()); 
            pushFollow(FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan2098);
            iv_ruleExperimentalPlan=ruleExperimentalPlan();

            state._fsp--;

             current =iv_ruleExperimentalPlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentalPlan2108); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1042:1: ruleExperimentalPlan returns [EObject current=null] : (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) )* ( (lv_factor_6_0= ruleFactor ) )* otherlv_7= 'Internal Replication ' ( (lv_internalReplication_8_0= RULE_INT ) ) ( (lv_link_9_0= ruleLink ) )* otherlv_10= '}' ) ;
    public final EObject ruleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_internalReplication_8_0=null;
        Token otherlv_10=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_parameter_5_0 = null;

        EObject lv_factor_6_0 = null;

        EObject lv_link_9_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1045:28: ( (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) )* ( (lv_factor_6_0= ruleFactor ) )* otherlv_7= 'Internal Replication ' ( (lv_internalReplication_8_0= RULE_INT ) ) ( (lv_link_9_0= ruleLink ) )* otherlv_10= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1046:1: (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) )* ( (lv_factor_6_0= ruleFactor ) )* otherlv_7= 'Internal Replication ' ( (lv_internalReplication_8_0= RULE_INT ) ) ( (lv_link_9_0= ruleLink ) )* otherlv_10= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1046:1: (otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) )* ( (lv_factor_6_0= ruleFactor ) )* otherlv_7= 'Internal Replication ' ( (lv_internalReplication_8_0= RULE_INT ) ) ( (lv_link_9_0= ruleLink ) )* otherlv_10= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1046:3: otherlv_0= 'Design' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleDesignType ) ) otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) )* ( (lv_factor_6_0= ruleFactor ) )* otherlv_7= 'Internal Replication ' ( (lv_internalReplication_8_0= RULE_INT ) ) ( (lv_link_9_0= ruleLink ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleExperimentalPlan2145); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentalPlanAccess().getDesignKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1050:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1051:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1051:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1052:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExperimentalPlan2162); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleExperimentalPlan2179); 

                	newLeafNode(otherlv_2, grammarAccess.getExperimentalPlanAccess().getTypeKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1072:1: ( (lv_type_3_0= ruleDesignType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1073:1: (lv_type_3_0= ruleDesignType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1073:1: (lv_type_3_0= ruleDesignType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1074:3: lv_type_3_0= ruleDesignType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignType_in_ruleExperimentalPlan2200);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalPlan2212); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1094:1: ( (lv_parameter_5_0= ruleParameter ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1095:1: (lv_parameter_5_0= ruleParameter )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1095:1: (lv_parameter_5_0= ruleParameter )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1096:3: lv_parameter_5_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getParameterParameterParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleExperimentalPlan2233);
            	    lv_parameter_5_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameter",
            	            		lv_parameter_5_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1112:3: ( (lv_factor_6_0= ruleFactor ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1113:1: (lv_factor_6_0= ruleFactor )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1113:1: (lv_factor_6_0= ruleFactor )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1114:3: lv_factor_6_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleExperimentalPlan2255);
            	    lv_factor_6_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factor",
            	            		lv_factor_6_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleExperimentalPlan2268); 

                	newLeafNode(otherlv_7, grammarAccess.getExperimentalPlanAccess().getInternalReplicationKeyword_7());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1134:1: ( (lv_internalReplication_8_0= RULE_INT ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1135:1: (lv_internalReplication_8_0= RULE_INT )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1135:1: (lv_internalReplication_8_0= RULE_INT )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1136:3: lv_internalReplication_8_0= RULE_INT
            {
            lv_internalReplication_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExperimentalPlan2285); 

            			newLeafNode(lv_internalReplication_8_0, grammarAccess.getExperimentalPlanAccess().getInternalReplicationINTTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentalPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"internalReplication",
                    		lv_internalReplication_8_0, 
                    		"INT");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1152:2: ( (lv_link_9_0= ruleLink ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1153:1: (lv_link_9_0= ruleLink )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1153:1: (lv_link_9_0= ruleLink )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1154:3: lv_link_9_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getLinkLinkParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleExperimentalPlan2311);
            	    lv_link_9_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"link",
            	            		lv_link_9_0, 
            	            		"Link");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan2324); 

                	newLeafNode(otherlv_10, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleParameter"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1182:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1183:2: (iv_ruleParameter= ruleParameter EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1184:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2360);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2370); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1191:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1194:28: ( (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1195:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1195:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1195:3: otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleParameter2407); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1199:1: ( (lv_variable_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1200:1: (lv_variable_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1200:1: (lv_variable_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1201:3: lv_variable_1_0= RULE_STRING
            {
            lv_variable_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter2424); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getParameterAccess().getVariableSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleParameter2441); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1221:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1222:1: (lv_value_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1222:1: (lv_value_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1223:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter2458); 

            			newLeafNode(lv_value_3_0, grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFactor"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1247:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1248:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1249:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor2499);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor2509); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1256:1: ruleFactor returns [EObject current=null] : (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) ( (lv_level_4_0= ruleLevels ) )* otherlv_5= ';' ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isDesiredVariation_3_1=null;
        Token lv_isDesiredVariation_3_2=null;
        Token otherlv_5=null;
        EObject lv_level_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1259:28: ( (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) ( (lv_level_4_0= ruleLevels ) )* otherlv_5= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1260:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) ( (lv_level_4_0= ruleLevels ) )* otherlv_5= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1260:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) ( (lv_level_4_0= ruleLevels ) )* otherlv_5= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1260:3: otherlv_0= 'Factor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) ( (lv_level_4_0= ruleLevels ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFactor2546); 

                	newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getFactorKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1264:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1265:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1265:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1266:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFactor2563); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleFactor2580); 

                	newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getIsDesiredVariationKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1286:1: ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1287:1: ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1287:1: ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1288:1: (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1288:1: (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            else if ( (LA26_0==39) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1289:3: lv_isDesiredVariation_3_1= 'True'
                    {
                    lv_isDesiredVariation_3_1=(Token)match(input,38,FOLLOW_38_in_ruleFactor2600); 

                            newLeafNode(lv_isDesiredVariation_3_1, grammarAccess.getFactorAccess().getIsDesiredVariationTrueKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "isDesiredVariation", lv_isDesiredVariation_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1301:8: lv_isDesiredVariation_3_2= 'False'
                    {
                    lv_isDesiredVariation_3_2=(Token)match(input,39,FOLLOW_39_in_ruleFactor2629); 

                            newLeafNode(lv_isDesiredVariation_3_2, grammarAccess.getFactorAccess().getIsDesiredVariationFalseKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "isDesiredVariation", lv_isDesiredVariation_3_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1316:2: ( (lv_level_4_0= ruleLevels ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1317:1: (lv_level_4_0= ruleLevels )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1317:1: (lv_level_4_0= ruleLevels )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1318:3: lv_level_4_0= ruleLevels
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLevels_in_ruleFactor2666);
            	    lv_level_4_0=ruleLevels();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"level",
            	            		lv_level_4_0, 
            	            		"Levels");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFactor2679); 

                	newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getSemicolonKeyword_5());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1346:1: entryRuleLevels returns [EObject current=null] : iv_ruleLevels= ruleLevels EOF ;
    public final EObject entryRuleLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevels = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1347:2: (iv_ruleLevels= ruleLevels EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1348:2: iv_ruleLevels= ruleLevels EOF
            {
             newCompositeNode(grammarAccess.getLevelsRule()); 
            pushFollow(FOLLOW_ruleLevels_in_entryRuleLevels2715);
            iv_ruleLevels=ruleLevels();

            state._fsp--;

             current =iv_ruleLevels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevels2725); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1355:1: ruleLevels returns [EObject current=null] : (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1358:28: ( (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1359:1: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1359:1: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1359:3: otherlv_0= 'Level' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleLevels2762); 

                	newLeafNode(otherlv_0, grammarAccess.getLevelsAccess().getLevelKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1363:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1364:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1364:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1365:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLevels2779); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleLevels2796); 

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


    // $ANTLR start "entryRuleLink"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1393:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1394:2: (iv_ruleLink= ruleLink EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1395:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink2832);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink2842); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1402:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'to' ( (otherlv_3= RULE_STRING ) )* ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1405:28: ( (otherlv_0= 'Link' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'to' ( (otherlv_3= RULE_STRING ) )* ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1406:1: (otherlv_0= 'Link' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'to' ( (otherlv_3= RULE_STRING ) )* )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1406:1: (otherlv_0= 'Link' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'to' ( (otherlv_3= RULE_STRING ) )* )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1406:3: otherlv_0= 'Link' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'to' ( (otherlv_3= RULE_STRING ) )*
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleLink2879); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1410:1: ( (otherlv_1= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1411:1: (otherlv_1= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1411:1: (otherlv_1= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1412:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink2899); 

            		newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getProcedureProcessCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleLink2911); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getToKeyword_2());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1427:1: ( (otherlv_3= RULE_STRING ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1428:1: (otherlv_3= RULE_STRING )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1428:1: (otherlv_3= RULE_STRING )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1429:3: otherlv_3= RULE_STRING
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLinkRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink2931); 

            	    		newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getTreatmentLevelsCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleQuestionnaire"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1448:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1449:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1450:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire2968);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire2978); 

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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1457:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) )* )? otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_questionnaireType_5_0 = null;

        EObject lv_question_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1460:28: ( (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) )* )? otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1461:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) )* )? otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1461:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) )* )? otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1461:3: otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) )* )? otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleQuestionnaire3015); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1465:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1466:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1466:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1467:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionnaire3032); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1483:2: (otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1483:4: otherlv_2= 'relates' ( (otherlv_3= RULE_STRING ) )*
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleQuestionnaire3050); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1487:1: ( (otherlv_3= RULE_STRING ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_STRING) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1488:1: (otherlv_3= RULE_STRING )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1488:1: (otherlv_3= RULE_STRING )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1489:3: otherlv_3= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQuestionnaireRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionnaire3070); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getRelatesToProcessCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleQuestionnaire3085); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getTypeKeyword_3());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1504:1: ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1505:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1505:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1506:3: lv_questionnaireType_5_0= ruleQuestionnaireType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeQuestionnaireTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire3106);
            lv_questionnaireType_5_0=ruleQuestionnaireType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	        }
                   		set(
                   			current, 
                   			"questionnaireType",
                    		lv_questionnaireType_5_0, 
                    		"QuestionnaireType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleQuestionnaire3118); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_5());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1526:1: ( (lv_question_7_0= ruleQuestion ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1527:1: (lv_question_7_0= ruleQuestion )
            	    {
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1527:1: (lv_question_7_0= ruleQuestion )
            	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1528:3: lv_question_7_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleQuestionnaire3139);
            	    lv_question_7_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
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
            	    break loop31;
                }
            } while (true);

            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleQuestionnaire3152); 

                	newLeafNode(otherlv_8, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleQuestion"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1556:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1557:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1558:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion3188);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion3198); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1565:1: ruleQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_req_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_5_0 = null;

        EObject lv_alternatives_9_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1568:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1569:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1569:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1569:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}'
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1569:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1570:1: (lv_name_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1570:1: (lv_name_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1571:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion3240); 

            			newLeafNode(lv_name_0_0, grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleQuestion3257); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1591:1: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1591:3: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQuestion3270); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getDescriptionKeyword_2_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1595:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1596:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1596:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1597:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion3287); 

            			newLeafNode(lv_description_3_0, grammarAccess.getQuestionAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1613:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1613:5: otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) )
            {
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleQuestion3306); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getTypeKeyword_3_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1617:1: ( (lv_type_5_0= ruleAnswerType ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1618:1: (lv_type_5_0= ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1618:1: (lv_type_5_0= ruleAnswerType )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1619:3: lv_type_5_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion3327);
            lv_type_5_0=ruleAnswerType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"AnswerType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1635:3: (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1635:5: otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleQuestion3341); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRequiredKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1639:1: ( (lv_req_7_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1640:1: (lv_req_7_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1640:1: (lv_req_7_0= RULE_INT )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1641:3: lv_req_7_0= RULE_INT
                    {
                    lv_req_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuestion3358); 

                    			newLeafNode(lv_req_7_0, grammarAccess.getQuestionAccess().getReqINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"req",
                            		lv_req_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1657:4: (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1657:6: otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleQuestion3378); 

                        	newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1661:1: ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==47) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1662:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    {
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1662:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1663:3: lv_alternatives_9_0= ruleAlternatives
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAlternatives_in_ruleQuestion3399);
                    	    lv_alternatives_9_0=ruleAlternatives();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"alternatives",
                    	            		lv_alternatives_9_0, 
                    	            		"Alternatives");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleQuestion3414); 

                	newLeafNode(otherlv_10, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1691:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1692:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1693:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives3450);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives3460); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1700:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1703:28: ( (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1704:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1704:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1704:3: otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleAlternatives3497); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getOptionKeyword_0());
                
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1708:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1709:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1709:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1710:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternatives3514); 

            			newLeafNode(lv_description_1_0, grammarAccess.getAlternativesAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "ruleArtefactType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1734:1: ruleArtefactType returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) ;
    public final Enumerator ruleArtefactType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1736:28: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1737:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1737:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt35=1;
                }
                break;
            case 49:
                {
                alt35=2;
                }
                break;
            case 50:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1737:2: (enumLiteral_0= 'input' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1737:2: (enumLiteral_0= 'input' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1737:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleArtefactType3569); 

                            current = grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1743:6: (enumLiteral_1= 'output' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1743:6: (enumLiteral_1= 'output' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1743:8: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleArtefactType3586); 

                            current = grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1749:6: (enumLiteral_2= 'inoutput' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1749:6: (enumLiteral_2= 'inoutput' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1749:8: enumLiteral_2= 'inoutput'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleArtefactType3603); 

                            current = grammarAccess.getArtefactTypeAccess().getInout_EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArtefactTypeAccess().getInout_EnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleArtefactType"


    // $ANTLR start "ruleColectType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1759:1: ruleColectType returns [Enumerator current=null] : ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) ) ;
    public final Enumerator ruleColectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1761:28: ( ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1762:1: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1762:1: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'intercalated' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            else if ( (LA36_0==52) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1762:2: (enumLiteral_0= 'continuous' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1762:2: (enumLiteral_0= 'continuous' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1762:4: enumLiteral_0= 'continuous'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleColectType3648); 

                            current = grammarAccess.getColectTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColectTypeAccess().getContinuousEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1768:6: (enumLiteral_1= 'intercalated' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1768:6: (enumLiteral_1= 'intercalated' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1768:8: enumLiteral_1= 'intercalated'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleColectType3665); 

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
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1778:1: ruleMetricUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) ) ;
    public final Enumerator ruleMetricUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1780:28: ( ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1781:1: ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1781:1: ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'uc' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            else if ( (LA37_0==54) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1781:2: (enumLiteral_0= 'minutes' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1781:2: (enumLiteral_0= 'minutes' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1781:4: enumLiteral_0= 'minutes'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleMetricUnit3710); 

                            current = grammarAccess.getMetricUnitAccess().getMinutesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetricUnitAccess().getMinutesEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1787:6: (enumLiteral_1= 'uc' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1787:6: (enumLiteral_1= 'uc' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1787:8: enumLiteral_1= 'uc'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleMetricUnit3727); 

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


    // $ANTLR start "ruleDesignType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1797:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1799:28: ( ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1800:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1800:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt38=1;
                }
                break;
            case 56:
                {
                alt38=2;
                }
                break;
            case 57:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1800:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1800:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1800:4: enumLiteral_0= 'CRD - Completely Randomized Design'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleDesignType3772); 

                            current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1806:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1806:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1806:8: enumLiteral_1= 'RCBD - Randomized Complete Block Design'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleDesignType3789); 

                            current = grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1812:6: (enumLiteral_2= 'LS - Latin Square' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1812:6: (enumLiteral_2= 'LS - Latin Square' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1812:8: enumLiteral_2= 'LS - Latin Square'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleDesignType3806); 

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


    // $ANTLR start "ruleQuestionnaireType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1822:1: ruleQuestionnaireType returns [Enumerator current=null] : ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Pos' ) ) ;
    public final Enumerator ruleQuestionnaireType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1824:28: ( ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Pos' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1825:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Pos' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1825:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Pos' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==58) ) {
                alt39=1;
            }
            else if ( (LA39_0==59) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1825:2: (enumLiteral_0= 'Pre' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1825:2: (enumLiteral_0= 'Pre' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1825:4: enumLiteral_0= 'Pre'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleQuestionnaireType3851); 

                            current = grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1831:6: (enumLiteral_1= 'Pos' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1831:6: (enumLiteral_1= 'Pos' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1831:8: enumLiteral_1= 'Pos'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleQuestionnaireType3868); 

                            current = grammarAccess.getQuestionnaireTypeAccess().getPosEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQuestionnaireTypeAccess().getPosEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleQuestionnaireType"


    // $ANTLR start "ruleAnswerType"
    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1841:1: ruleAnswerType returns [Enumerator current=null] : ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Paragraph Text' ) | (enumLiteral_2= 'Multiple Choice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) ) ;
    public final Enumerator ruleAnswerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1843:28: ( ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Paragraph Text' ) | (enumLiteral_2= 'Multiple Choice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) ) )
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1844:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Paragraph Text' ) | (enumLiteral_2= 'Multiple Choice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) )
            {
            // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1844:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'Paragraph Text' ) | (enumLiteral_2= 'Multiple Choice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) )
            int alt40=7;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt40=1;
                }
                break;
            case 61:
                {
                alt40=2;
                }
                break;
            case 62:
                {
                alt40=3;
                }
                break;
            case 63:
                {
                alt40=4;
                }
                break;
            case 64:
                {
                alt40=5;
                }
                break;
            case 65:
                {
                alt40=6;
                }
                break;
            case 66:
                {
                alt40=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1844:2: (enumLiteral_0= 'Text' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1844:2: (enumLiteral_0= 'Text' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1844:4: enumLiteral_0= 'Text'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleAnswerType3913); 

                            current = grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1850:6: (enumLiteral_1= 'Paragraph Text' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1850:6: (enumLiteral_1= 'Paragraph Text' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1850:8: enumLiteral_1= 'Paragraph Text'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleAnswerType3930); 

                            current = grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1856:6: (enumLiteral_2= 'Multiple Choice' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1856:6: (enumLiteral_2= 'Multiple Choice' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1856:8: enumLiteral_2= 'Multiple Choice'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleAnswerType3947); 

                            current = grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1862:6: (enumLiteral_3= 'ComboBox' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1862:6: (enumLiteral_3= 'ComboBox' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1862:8: enumLiteral_3= 'ComboBox'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_63_in_ruleAnswerType3964); 

                            current = grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1868:6: (enumLiteral_4= 'CheckBoxes' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1868:6: (enumLiteral_4= 'CheckBoxes' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1868:8: enumLiteral_4= 'CheckBoxes'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_64_in_ruleAnswerType3981); 

                            current = grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1874:6: (enumLiteral_5= 'Scale' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1874:6: (enumLiteral_5= 'Scale' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1874:8: enumLiteral_5= 'Scale'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_65_in_ruleAnswerType3998); 

                            current = grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1880:6: (enumLiteral_6= 'Grid' )
                    {
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1880:6: (enumLiteral_6= 'Grid' )
                    // ../br.ufrn.dimap.ase/src-gen/org/xtext/project/parser/antlr/internal/InternalExpDSL.g:1880:8: enumLiteral_6= 'Grid'
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_66_in_ruleAnswerType4015); 

                            current = grammarAccess.getAnswerTypeAccess().getGridEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getAnswerTypeAccess().getGridEnumLiteralDeclaration_6()); 
                        

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExperimentElement213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentElement230 = new BitSet(new long[]{0x0000000002007002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleExperimentElement256 = new BitSet(new long[]{0x0000000002007002L});
    public static final BitSet FOLLOW_ruleMetrics_in_ruleExperimentElement278 = new BitSet(new long[]{0x0000000002003002L});
    public static final BitSet FOLLOW_12_in_ruleExperimentElement292 = new BitSet(new long[]{0x0000000100002002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement313 = new BitSet(new long[]{0x0000000100002002L});
    public static final BitSet FOLLOW_13_in_ruleExperimentElement329 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_ruleExperimentElement350 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProcess436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcess453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcess470 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleProcess491 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleProcess504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleActivity587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity626 = new BitSet(new long[]{0x0000000000C08012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity651 = new BitSet(new long[]{0x0000000000C08002L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleActivity673 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleActivity695 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleActivity709 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleActivity730 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleActivity743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTask828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask879 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_ruleTask897 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleTask918 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleRole_in_ruleTask942 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTask955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRole1038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRole1055 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRole1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefact_in_entryRuleArtefact1108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefact1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleArtefact1155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefact1172 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleArtefact1189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefact1206 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleArtefact1223 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_ruleArtefactType_in_ruleArtefact1244 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArtefact1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetrics_in_entryRuleMetrics1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetrics1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMetrics1339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetrics1356 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMetrics1373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetrics1393 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetrics1405 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetrics1418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetrics1435 = new BitSet(new long[]{0x00000000B8100000L});
    public static final BitSet FOLLOW_27_in_ruleMetrics1454 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleColectType_in_ruleMetrics1475 = new BitSet(new long[]{0x00000000B8100000L});
    public static final BitSet FOLLOW_28_in_ruleMetrics1490 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_ruleMetricUnit_in_ruleMetrics1511 = new BitSet(new long[]{0x00000000B8100000L});
    public static final BitSet FOLLOW_ruleDetail_in_ruleMetrics1534 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMetrics1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetail_in_entryRuleDetail1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetail1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_ruleDetail1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_ruleDetail1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefactMetric_in_ruleDetail1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityMetric1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleActivityMetric1776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1796 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleActivityMetric1810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityMetric1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskMetric1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTaskMetric1915 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskMetric1935 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArtefactMetric_in_entryRuleArtefactMetric1972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefactMetric1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArtefactMetric2019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefactMetric2036 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefactMetric2061 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan2098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentalPlan2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleExperimentalPlan2145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentalPlan2162 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExperimentalPlan2179 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleExperimentalPlan2200 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExperimentalPlan2212 = new BitSet(new long[]{0x0000001600000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExperimentalPlan2233 = new BitSet(new long[]{0x0000001600000000L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExperimentalPlan2255 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_ruleExperimentalPlan2268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExperimentalPlan2285 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_ruleLink_in_ruleExperimentalPlan2311 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleParameter2407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter2424 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleParameter2441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor2499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFactor2546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFactor2563 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFactor2580 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleFactor2600 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_39_in_ruleFactor2629 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleFactor2666 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_21_in_ruleFactor2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevels_in_entryRuleLevels2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevels2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLevels2762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLevels2779 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLevels2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink2832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLink2879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink2899 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleLink2911 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink2931 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire2968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleQuestionnaire3015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionnaire3032 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleQuestionnaire3050 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionnaire3070 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleQuestionnaire3085 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire3106 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuestionnaire3118 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionnaire3139 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_44_in_ruleQuestionnaire3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion3188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion3240 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuestion3257 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuestion3270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion3287 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuestion3306 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion3327 = new BitSet(new long[]{0x0000600000010000L});
    public static final BitSet FOLLOW_45_in_ruleQuestion3341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuestion3358 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_46_in_ruleQuestion3378 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleQuestion3399 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestion3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives3450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAlternatives3497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternatives3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleArtefactType3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleArtefactType3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleArtefactType3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleColectType3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleColectType3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMetricUnit3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMetricUnit3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDesignType3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDesignType3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDesignType3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleQuestionnaireType3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleQuestionnaireType3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAnswerType3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAnswerType3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAnswerType3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAnswerType3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAnswerType3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAnswerType3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAnswerType4015 = new BitSet(new long[]{0x0000000000000002L});

}