package br.ufrn.dimap.ase.dsl.parser.antlr.internal; 

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
import br.ufrn.dimap.ase.dsl.services.ExpDslv2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpDslv2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Experiment'", "'Experimental Plan'", "'Questionnaires'", "'Process'", "'to'", "'{'", "'Role'", "'}'", "'Activity'", "'description'", "'var'", "'artefacts'", "'quest'", "'Task'", "'type'", "'.'", "'Metric'", "'relates'", "'activityBegin'", "'activityEnd'", "'tasks'", "'collectedData'", "':'", "'artefact'", "'Goals'", "'Hypotheses'", "'DesignOfExperiment'", "'='", "'Statistical Analysis Technique'", "'Internal Replication '", "'from'", "'('", "')'", "'Parameter'", "'Dependent Variable'", "'Factor'", "'isDesiredVariation'", "'True'", "'False'", "'Questionnaire'", "'};'", "'required'", "'Alternatives'", "'Option'", "'Participant'", "'Researcher'", "'input'", "'output'", "'inoutput'", "'number'", "'text'", "'=='", "'<>'", "'!='", "'>'", "'<'", "'>='", "'<='", "'null'", "'alternative'", "'CRD - Completely Randomized Design'", "'RCBD - Randomized Complete Block Design'", "'LS - Latin Square'", "'Other'", "'Chi-2'", "'Binomial Test'", "'t-test'", "'F-test'", "'McNemar Test'", "'Mann-Whitney'", "'Paired t-test'", "'Wilcoxon'", "'Sign test'", "'ANOVA'", "'Kruskal-Wallis'", "'Others'", "'Pre'", "'Post'", "'Text'", "'ParagraphText'", "'MultipleChoice'", "'ComboBox'", "'CheckBoxes'", "'Scale'", "'Grid'"
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
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
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
    public static final int T__30=30;
    public static final int T__31=31;
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


        public InternalExpDslv2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpDslv2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpDslv2Parser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g"; }



     	private ExpDslv2GrammarAccess grammarAccess;
     	
        public InternalExpDslv2Parser(TokenStream input, ExpDslv2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExpDslv2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleExperimentElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:80:28: ( ( (lv_elements_0_0= ruleExperimentElement ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:81:1: ( (lv_elements_0_0= ruleExperimentElement ) )*
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:81:1: ( (lv_elements_0_0= ruleExperimentElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:82:1: (lv_elements_0_0= ruleExperimentElement )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:82:1: (lv_elements_0_0= ruleExperimentElement )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:83:3: lv_elements_0_0= ruleExperimentElement
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:107:1: entryRuleExperimentElement returns [EObject current=null] : iv_ruleExperimentElement= ruleExperimentElement EOF ;
    public final EObject entryRuleExperimentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentElement = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:108:2: (iv_ruleExperimentElement= ruleExperimentElement EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:109:2: iv_ruleExperimentElement= ruleExperimentElement EOF
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:116:1: ruleExperimentElement returns [EObject current=null] : (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* ) (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:119:28: ( (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* ) (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* ) (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* ) (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:3: otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* ) (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleExperimentElement213); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentElementAccess().getExperimentKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:124:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:125:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:125:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:126:3: lv_name_1_0= RULE_STRING
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:142:2: ( (lv_process_2_0= ruleProcess ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:143:1: (lv_process_2_0= ruleProcess )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:143:1: (lv_process_2_0= ruleProcess )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:144:3: lv_process_2_0= ruleProcess
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:160:3: ( (lv_metrics_3_0= ruleMetrics ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:161:1: (lv_metrics_3_0= ruleMetrics )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:161:1: (lv_metrics_3_0= ruleMetrics )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:162:3: lv_metrics_3_0= ruleMetrics
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:178:3: (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:178:5: otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )*
            {
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleExperimentElement292); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_4_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:182:1: ( (lv_experiments_5_0= ruleExperimentalPlan ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:183:1: (lv_experiments_5_0= ruleExperimentalPlan )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:183:1: (lv_experiments_5_0= ruleExperimentalPlan )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:184:3: lv_experiments_5_0= ruleExperimentalPlan
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:200:4: (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:200:6: otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleExperimentElement328); 

                        	newLeafNode(otherlv_6, grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:204:1: ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==50) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:205:1: (lv_questionnaire_7_0= ruleQuestionnaire )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:205:1: (lv_questionnaire_7_0= ruleQuestionnaire )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:206:3: lv_questionnaire_7_0= ruleQuestionnaire
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getQuestionnaireQuestionnaireParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQuestionnaire_in_ruleExperimentElement349);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:230:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:231:2: (iv_ruleProcess= ruleProcess EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:232:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess388);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess398); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:239:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_activities_7_0= ruleActivity ) )* otherlv_8= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Enumerator lv_role_6_0 = null;

        EObject lv_activities_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:242:28: ( (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_activities_7_0= ruleActivity ) )* otherlv_8= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_activities_7_0= ruleActivity ) )* otherlv_8= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_activities_7_0= ruleActivity ) )* otherlv_8= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:3: otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_activities_7_0= ruleActivity ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProcess435); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:247:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:248:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:248:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:249:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess452); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:265:2: (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:265:4: otherlv_2= 'to' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProcess470); 

                        	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getToKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:269:1: ( ( ruleQualifiedName ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:270:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:270:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:271:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProcessRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getTreatmentLevelsCrossReference_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProcess493);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleProcess508); 

                	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:288:1: (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:288:3: otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )*
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleProcess521); 

                        	newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getRoleKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:292:1: ( (lv_role_6_0= ruleRoleType ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=55 && LA9_0<=56)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:293:1: (lv_role_6_0= ruleRoleType )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:293:1: (lv_role_6_0= ruleRoleType )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:294:3: lv_role_6_0= ruleRoleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getRoleRoleTypeEnumRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoleType_in_ruleProcess542);
                    	    lv_role_6_0=ruleRoleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"role",
                    	            		lv_role_6_0, 
                    	            		"RoleType");
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:310:5: ( (lv_activities_7_0= ruleActivity ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:311:1: (lv_activities_7_0= ruleActivity )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:311:1: (lv_activities_7_0= ruleActivity )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:312:3: lv_activities_7_0= ruleActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getActivitiesActivityParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleProcess566);
            	    lv_activities_7_0=ruleActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_7_0, 
            	            		"Activity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleProcess579); 

                	newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:340:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:341:2: (iv_ruleActivity= ruleActivity EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:342:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity615);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity625); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:349:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? (otherlv_8= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_10= 'artefacts' ( (lv_artefacts_11_0= ruleArtefact ) )* )? (otherlv_12= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_14= '{' ( (lv_tasks_15_0= ruleTask ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Enumerator lv_role_7_0 = null;

        EObject lv_artefacts_11_0 = null;

        EObject lv_tasks_15_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:352:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? (otherlv_8= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_10= 'artefacts' ( (lv_artefacts_11_0= ruleArtefact ) )* )? (otherlv_12= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_14= '{' ( (lv_tasks_15_0= ruleTask ) )* otherlv_16= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:353:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? (otherlv_8= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_10= 'artefacts' ( (lv_artefacts_11_0= ruleArtefact ) )* )? (otherlv_12= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_14= '{' ( (lv_tasks_15_0= ruleTask ) )* otherlv_16= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:353:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? (otherlv_8= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_10= 'artefacts' ( (lv_artefacts_11_0= ruleArtefact ) )* )? (otherlv_12= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_14= '{' ( (lv_tasks_15_0= ruleTask ) )* otherlv_16= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:353:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? (otherlv_8= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_10= 'artefacts' ( (lv_artefacts_11_0= ruleArtefact ) )* )? (otherlv_12= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_14= '{' ( (lv_tasks_15_0= ruleTask ) )* otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleActivity662); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:357:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:358:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:358:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:359:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity679); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleActivity696); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:379:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:380:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:380:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:381:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity713); 

            			newLeafNode(lv_description_3_0, grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:397:2: (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:397:4: otherlv_4= 'to' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleActivity731); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getToKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:401:1: ( ( ruleQualifiedName ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:402:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:402:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:403:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getNextActivityCrossReference_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity754);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:416:5: (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:416:7: otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )*
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleActivity770); 

                        	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getRoleKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:420:1: ( (lv_role_7_0= ruleRoleType ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=55 && LA14_0<=56)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:421:1: (lv_role_7_0= ruleRoleType )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:421:1: (lv_role_7_0= ruleRoleType )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:422:3: lv_role_7_0= ruleRoleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getRoleRoleTypeEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoleType_in_ruleActivity791);
                    	    lv_role_7_0=ruleRoleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"role",
                    	            		lv_role_7_0, 
                    	            		"RoleType");
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:438:5: (otherlv_8= 'var' ( ( ruleQualifiedName ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:438:7: otherlv_8= 'var' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleActivity807); 

                        	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getVarKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:442:1: ( ( ruleQualifiedName ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:443:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:443:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:444:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getCollectDataCollectedDataCrossReference_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity830);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:457:5: (otherlv_10= 'artefacts' ( (lv_artefacts_11_0= ruleArtefact ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:457:7: otherlv_10= 'artefacts' ( (lv_artefacts_11_0= ruleArtefact ) )*
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleActivity846); 

                        	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getArtefactsKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:461:1: ( (lv_artefacts_11_0= ruleArtefact ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:462:1: (lv_artefacts_11_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:462:1: (lv_artefacts_11_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:463:3: lv_artefacts_11_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getArtefactsArtefactParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleActivity867);
                    	    lv_artefacts_11_0=ruleArtefact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"artefacts",
                    	            		lv_artefacts_11_0, 
                    	            		"Artefact");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:479:5: (otherlv_12= 'quest' ( ( ruleQualifiedName ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:479:7: otherlv_12= 'quest' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleActivity883); 

                        	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getQuestKeyword_8_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:483:1: ( ( ruleQualifiedName ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:484:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:484:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:485:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getQuestionnaireQuestionnaireCrossReference_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity906);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:498:5: (otherlv_14= '{' ( (lv_tasks_15_0= ruleTask ) )* otherlv_16= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:498:7: otherlv_14= '{' ( (lv_tasks_15_0= ruleTask ) )* otherlv_16= '}'
                    {
                    otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleActivity922); 

                        	newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:502:1: ( (lv_tasks_15_0= ruleTask ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==24) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:503:1: (lv_tasks_15_0= ruleTask )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:503:1: (lv_tasks_15_0= ruleTask )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:504:3: lv_tasks_15_0= ruleTask
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTasksTaskParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTask_in_ruleActivity943);
                    	    lv_tasks_15_0=ruleTask();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tasks",
                    	            		lv_tasks_15_0, 
                    	            		"Task");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleActivity956); 

                        	newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_2());
                        

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:532:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:533:2: (iv_ruleTask= ruleTask EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:534:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask994);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask1004); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:541:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_artefacts_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:544:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:545:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:545:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:545:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTask1041); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:549:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:550:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:550:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:551:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1058); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTask1075); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:571:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:572:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:572:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:573:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask1092); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:589:2: (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:589:4: otherlv_4= 'var' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTask1110); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getVarKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:593:1: ( ( ruleQualifiedName ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:594:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:594:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:595:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getVarCollectedDataCrossReference_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask1133);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:608:5: (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:608:7: otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )*
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleTask1149); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getArtefactsKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:612:1: ( (lv_artefacts_7_0= ruleArtefact ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:613:1: (lv_artefacts_7_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:613:1: (lv_artefacts_7_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:614:3: lv_artefacts_7_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getArtefactsArtefactParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleTask1170);
                    	    lv_artefacts_7_0=ruleArtefact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"artefacts",
                    	            		lv_artefacts_7_0, 
                    	            		"Artefact");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:630:5: (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:630:7: otherlv_8= 'quest' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleTask1186); 

                        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getQuestKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:634:1: ( ( ruleQualifiedName ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:635:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:635:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:636:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getQuestionnaireQuestionnaireCrossReference_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask1209);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleArtefact"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:657:1: entryRuleArtefact returns [EObject current=null] : iv_ruleArtefact= ruleArtefact EOF ;
    public final EObject entryRuleArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefact = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:658:2: (iv_ruleArtefact= ruleArtefact EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:659:2: iv_ruleArtefact= ruleArtefact EOF
            {
             newCompositeNode(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_ruleArtefact_in_entryRuleArtefact1248);
            iv_ruleArtefact=ruleArtefact();

            state._fsp--;

             current =iv_ruleArtefact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefact1258); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:666:1: ruleArtefact returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) ;
    public final EObject ruleArtefact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:669:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:670:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:670:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:670:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:670:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:671:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:671:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:672:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArtefact1300); 

            			newLeafNode(lv_name_0_0, grammarAccess.getArtefactAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleArtefact1317); 

                	newLeafNode(otherlv_1, grammarAccess.getArtefactAccess().getDescriptionKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:692:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:693:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:693:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:694:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefact1334); 

            			newLeafNode(lv_description_2_0, grammarAccess.getArtefactAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtefactRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleArtefact1351); 

                	newLeafNode(otherlv_3, grammarAccess.getArtefactAccess().getTypeKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:714:1: ( (lv_type_4_0= ruleArtefactType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:715:1: (lv_type_4_0= ruleArtefactType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:715:1: (lv_type_4_0= ruleArtefactType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:716:3: lv_type_4_0= ruleArtefactType
            {
             
            	        newCompositeNode(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleArtefactType_in_ruleArtefact1372);
            lv_type_4_0=ruleArtefactType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArtefactRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"ArtefactType");
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
    // $ANTLR end "ruleArtefact"


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:740:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:741:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:742:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1409);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1420); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:749:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:752:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:753:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:753:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:753:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1460); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:760:1: (kw= '.' this_ID_2= RULE_ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:761:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedName1479); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1494); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleMetrics"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:781:1: entryRuleMetrics returns [EObject current=null] : iv_ruleMetrics= ruleMetrics EOF ;
    public final EObject entryRuleMetrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrics = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:782:2: (iv_ruleMetrics= ruleMetrics EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:783:2: iv_ruleMetrics= ruleMetrics EOF
            {
             newCompositeNode(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_ruleMetrics_in_entryRuleMetrics1541);
            iv_ruleMetrics=ruleMetrics();

            state._fsp--;

             current =iv_ruleMetrics; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetrics1551); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:790:1: ruleMetrics returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' ) ;
    public final EObject ruleMetrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_8=null;
        EObject lv_detail_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:793:28: ( (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:794:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:794:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:794:3: otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMetrics1588); 

                	newLeafNode(otherlv_0, grammarAccess.getMetricsAccess().getMetricKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:798:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:799:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:799:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:800:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetrics1605); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMetricsAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleMetrics1622); 

                	newLeafNode(otherlv_2, grammarAccess.getMetricsAccess().getRelatesKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:820:1: ( (otherlv_3= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:821:1: (otherlv_3= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:821:1: (otherlv_3= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:822:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricsRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetrics1642); 

            		newLeafNode(otherlv_3, grammarAccess.getMetricsAccess().getRelatesToProcessCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMetrics1654); 

                	newLeafNode(otherlv_4, grammarAccess.getMetricsAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:837:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:837:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleMetrics1667); 

                	newLeafNode(otherlv_5, grammarAccess.getMetricsAccess().getDescriptionKeyword_5_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:841:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:842:1: (lv_description_6_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:842:1: (lv_description_6_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:843:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetrics1684); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:859:3: ( (lv_detail_7_0= ruleDetail ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:860:1: (lv_detail_7_0= ruleDetail )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:860:1: (lv_detail_7_0= ruleDetail )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:861:3: lv_detail_7_0= ruleDetail
            {
             
            	        newCompositeNode(grammarAccess.getMetricsAccess().getDetailDetailParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDetail_in_ruleMetrics1711);
            lv_detail_7_0=ruleDetail();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetricsRule());
            	        }
                   		add(
                   			current, 
                   			"detail",
                    		lv_detail_7_0, 
                    		"Detail");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleMetrics1723); 

                	newLeafNode(otherlv_8, grammarAccess.getMetricsAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:889:1: entryRuleDetail returns [EObject current=null] : iv_ruleDetail= ruleDetail EOF ;
    public final EObject entryRuleDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetail = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:890:2: (iv_ruleDetail= ruleDetail EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:891:2: iv_ruleDetail= ruleDetail EOF
            {
             newCompositeNode(grammarAccess.getDetailRule()); 
            pushFollow(FOLLOW_ruleDetail_in_entryRuleDetail1759);
            iv_ruleDetail=ruleDetail();

            state._fsp--;

             current =iv_ruleDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetail1769); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:898:1: ruleDetail returns [EObject current=null] : (this_TimeMetric_0= ruleTimeMetric | this_DataMetric_1= ruleDataMetric ) ;
    public final EObject ruleDetail() throws RecognitionException {
        EObject current = null;

        EObject this_TimeMetric_0 = null;

        EObject this_DataMetric_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:901:28: ( (this_TimeMetric_0= ruleTimeMetric | this_DataMetric_1= ruleDataMetric ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:902:1: (this_TimeMetric_0= ruleTimeMetric | this_DataMetric_1= ruleDataMetric )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:902:1: (this_TimeMetric_0= ruleTimeMetric | this_DataMetric_1= ruleDataMetric )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29||LA31_0==31) ) {
                alt31=1;
            }
            else if ( (LA31_0==EOF||LA31_0==18||LA31_0==23||LA31_0==32||LA31_0==34) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:903:5: this_TimeMetric_0= ruleTimeMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getTimeMetricParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTimeMetric_in_ruleDetail1816);
                    this_TimeMetric_0=ruleTimeMetric();

                    state._fsp--;

                     
                            current = this_TimeMetric_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:913:5: this_DataMetric_1= ruleDataMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getDataMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataMetric_in_ruleDetail1843);
                    this_DataMetric_1=ruleDataMetric();

                    state._fsp--;

                     
                            current = this_DataMetric_1; 
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


    // $ANTLR start "entryRuleTimeMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:929:1: entryRuleTimeMetric returns [EObject current=null] : iv_ruleTimeMetric= ruleTimeMetric EOF ;
    public final EObject entryRuleTimeMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:930:2: (iv_ruleTimeMetric= ruleTimeMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:931:2: iv_ruleTimeMetric= ruleTimeMetric EOF
            {
             newCompositeNode(grammarAccess.getTimeMetricRule()); 
            pushFollow(FOLLOW_ruleTimeMetric_in_entryRuleTimeMetric1878);
            iv_ruleTimeMetric=ruleTimeMetric();

            state._fsp--;

             current =iv_ruleTimeMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeMetric1888); 

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
    // $ANTLR end "entryRuleTimeMetric"


    // $ANTLR start "ruleTimeMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:938:1: ruleTimeMetric returns [EObject current=null] : (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric ) ;
    public final EObject ruleTimeMetric() throws RecognitionException {
        EObject current = null;

        EObject this_ActivityMetric_0 = null;

        EObject this_TaskMetric_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:941:28: ( (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:942:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:942:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            else if ( (LA32_0==31) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:943:5: this_ActivityMetric_0= ruleActivityMetric
                    {
                     
                            newCompositeNode(grammarAccess.getTimeMetricAccess().getActivityMetricParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivityMetric_in_ruleTimeMetric1935);
                    this_ActivityMetric_0=ruleActivityMetric();

                    state._fsp--;

                     
                            current = this_ActivityMetric_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:953:5: this_TaskMetric_1= ruleTaskMetric
                    {
                     
                            newCompositeNode(grammarAccess.getTimeMetricAccess().getTaskMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTaskMetric_in_ruleTimeMetric1962);
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
    // $ANTLR end "ruleTimeMetric"


    // $ANTLR start "entryRuleActivityMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:969:1: entryRuleActivityMetric returns [EObject current=null] : iv_ruleActivityMetric= ruleActivityMetric EOF ;
    public final EObject entryRuleActivityMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:970:2: (iv_ruleActivityMetric= ruleActivityMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:971:2: iv_ruleActivityMetric= ruleActivityMetric EOF
            {
             newCompositeNode(grammarAccess.getActivityMetricRule()); 
            pushFollow(FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric1997);
            iv_ruleActivityMetric=ruleActivityMetric();

            state._fsp--;

             current =iv_ruleActivityMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityMetric2007); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:978:1: ruleActivityMetric returns [EObject current=null] : ( () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleActivityMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:981:28: ( ( () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:982:1: ( () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:982:1: ( () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:982:2: () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:982:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:983:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActivityMetricAccess().getActivityMetricAction_0(),
                        current);
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:988:2: (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:988:4: otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleActivityMetric2054); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityMetricAccess().getActivityBeginKeyword_1_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:992:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:993:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:993:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:994:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getActivityMetricAccess().getActivityBeginActivityCrossReference_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityMetric2077);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1007:3: (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1007:5: otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleActivityMetric2091); 

                        	newLeafNode(otherlv_3, grammarAccess.getActivityMetricAccess().getActivityEndKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1011:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1012:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1012:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1013:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityMetricRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityMetricAccess().getActivityEndActivityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityMetric2114);
                    ruleQualifiedName();

                    state._fsp--;

                     
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
    // $ANTLR end "ruleActivityMetric"


    // $ANTLR start "entryRuleTaskMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1034:1: entryRuleTaskMetric returns [EObject current=null] : iv_ruleTaskMetric= ruleTaskMetric EOF ;
    public final EObject entryRuleTaskMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1035:2: (iv_ruleTaskMetric= ruleTaskMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1036:2: iv_ruleTaskMetric= ruleTaskMetric EOF
            {
             newCompositeNode(grammarAccess.getTaskMetricRule()); 
            pushFollow(FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric2152);
            iv_ruleTaskMetric=ruleTaskMetric();

            state._fsp--;

             current =iv_ruleTaskMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskMetric2162); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1043:1: ruleTaskMetric returns [EObject current=null] : ( () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )* ) ;
    public final EObject ruleTaskMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1046:28: ( ( () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1047:1: ( () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1047:1: ( () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1047:2: () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )*
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1047:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1048:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTaskMetricAccess().getTaskMetricAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTaskMetric2208); 

                	newLeafNode(otherlv_1, grammarAccess.getTaskMetricAccess().getTasksKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1057:1: ( ( ruleQualifiedName ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1058:1: ( ruleQualifiedName )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1058:1: ( ruleQualifiedName )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1059:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTaskMetricAccess().getTasksTaskCrossReference_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTaskMetric2231);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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


    // $ANTLR start "entryRuleDataMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1080:1: entryRuleDataMetric returns [EObject current=null] : iv_ruleDataMetric= ruleDataMetric EOF ;
    public final EObject entryRuleDataMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1081:2: (iv_ruleDataMetric= ruleDataMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1082:2: iv_ruleDataMetric= ruleDataMetric EOF
            {
             newCompositeNode(grammarAccess.getDataMetricRule()); 
            pushFollow(FOLLOW_ruleDataMetric_in_entryRuleDataMetric2268);
            iv_ruleDataMetric=ruleDataMetric();

            state._fsp--;

             current =iv_ruleDataMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataMetric2278); 

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
    // $ANTLR end "entryRuleDataMetric"


    // $ANTLR start "ruleDataMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1089:1: ruleDataMetric returns [EObject current=null] : ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? ) ;
    public final EObject ruleDataMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_collectedData_2_0 = null;

        Enumerator lv_dataType_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1092:28: ( ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1093:1: ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1093:1: ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1093:2: () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1093:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1094:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataMetricAccess().getDataMetricAction_0(),
                        current);
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1099:2: (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1099:4: otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDataMetric2325); 

                        	newLeafNode(otherlv_1, grammarAccess.getDataMetricAccess().getCollectedDataKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1103:1: ( (lv_collectedData_2_0= ruleCollectedData ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1104:1: (lv_collectedData_2_0= ruleCollectedData )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1104:1: (lv_collectedData_2_0= ruleCollectedData )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1105:3: lv_collectedData_2_0= ruleCollectedData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getCollectedDataCollectedDataParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCollectedData_in_ruleDataMetric2346);
                    	    lv_collectedData_2_0=ruleCollectedData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataMetricRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"collectedData",
                    	            		lv_collectedData_2_0, 
                    	            		"CollectedData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleDataMetric2359); 

                        	newLeafNode(otherlv_3, grammarAccess.getDataMetricAccess().getColonKeyword_1_2());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1125:1: ( (lv_dataType_4_0= ruleDataType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1126:1: (lv_dataType_4_0= ruleDataType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1126:1: (lv_dataType_4_0= ruleDataType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1127:3: lv_dataType_4_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataMetricAccess().getDataTypeDataTypeEnumRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleDataMetric2380);
                    lv_dataType_4_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataMetricRule());
                    	        }
                           		add(
                           			current, 
                           			"dataType",
                            		lv_dataType_4_0, 
                            		"DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1143:4: (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1143:6: otherlv_5= 'artefact' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleDataMetric2395); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataMetricAccess().getArtefactKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1147:1: ( ( ruleQualifiedName ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1148:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1148:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1149:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDataMetricRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getArtefactsArtefactCrossReference_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataMetric2418);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1162:5: (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1162:7: otherlv_7= 'quest' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleDataMetric2434); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataMetricAccess().getQuestKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1166:1: ( ( ruleQualifiedName ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1167:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1167:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1168:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDataMetricRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getQuestionnairesQuestionnaireCrossReference_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataMetric2457);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
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
    // $ANTLR end "ruleDataMetric"


    // $ANTLR start "entryRuleCollectedData"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1189:1: entryRuleCollectedData returns [EObject current=null] : iv_ruleCollectedData= ruleCollectedData EOF ;
    public final EObject entryRuleCollectedData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectedData = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1190:2: (iv_ruleCollectedData= ruleCollectedData EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1191:2: iv_ruleCollectedData= ruleCollectedData EOF
            {
             newCompositeNode(grammarAccess.getCollectedDataRule()); 
            pushFollow(FOLLOW_ruleCollectedData_in_entryRuleCollectedData2496);
            iv_ruleCollectedData=ruleCollectedData();

            state._fsp--;

             current =iv_ruleCollectedData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectedData2506); 

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
    // $ANTLR end "entryRuleCollectedData"


    // $ANTLR start "ruleCollectedData"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1198:1: ruleCollectedData returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCollectedData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1201:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1202:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1202:1: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1203:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1203:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1204:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectedData2547); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCollectedDataAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectedDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleCollectedData"


    // $ANTLR start "entryRuleExperimentalPlan"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1228:1: entryRuleExperimentalPlan returns [EObject current=null] : iv_ruleExperimentalPlan= ruleExperimentalPlan EOF ;
    public final EObject entryRuleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentalPlan = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1229:2: (iv_ruleExperimentalPlan= ruleExperimentalPlan EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1230:2: iv_ruleExperimentalPlan= ruleExperimentalPlan EOF
            {
             newCompositeNode(grammarAccess.getExperimentalPlanRule()); 
            pushFollow(FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan2587);
            iv_ruleExperimentalPlan=ruleExperimentalPlan();

            state._fsp--;

             current =iv_ruleExperimentalPlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentalPlan2597); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1237:1: ruleExperimentalPlan returns [EObject current=null] : (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_17= ':' ( (lv_Technique_18_0= ruleAnalysisTechiqueType ) )* )* otherlv_19= 'Internal Replication ' ( (lv_internalReplication_20_0= RULE_INT ) ) otherlv_21= '}' ) ;
    public final EObject ruleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_internalReplication_20_0=null;
        Token otherlv_21=null;
        EObject lv_goal_2_0 = null;

        EObject lv_hypotheses_6_0 = null;

        Enumerator lv_type_10_0 = null;

        EObject lv_parameter_12_0 = null;

        EObject lv_dependentVariable_13_0 = null;

        EObject lv_factor_14_0 = null;

        Enumerator lv_Technique_18_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1240:28: ( (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_17= ':' ( (lv_Technique_18_0= ruleAnalysisTechiqueType ) )* )* otherlv_19= 'Internal Replication ' ( (lv_internalReplication_20_0= RULE_INT ) ) otherlv_21= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1241:1: (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_17= ':' ( (lv_Technique_18_0= ruleAnalysisTechiqueType ) )* )* otherlv_19= 'Internal Replication ' ( (lv_internalReplication_20_0= RULE_INT ) ) otherlv_21= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1241:1: (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_17= ':' ( (lv_Technique_18_0= ruleAnalysisTechiqueType ) )* )* otherlv_19= 'Internal Replication ' ( (lv_internalReplication_20_0= RULE_INT ) ) otherlv_21= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1241:3: otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_17= ':' ( (lv_Technique_18_0= ruleAnalysisTechiqueType ) )* )* otherlv_19= 'Internal Replication ' ( (lv_internalReplication_20_0= RULE_INT ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleExperimentalPlan2634); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentalPlanAccess().getGoalsKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan2646); 

                	newLeafNode(otherlv_1, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1249:1: ( (lv_goal_2_0= ruleGoal ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1250:1: (lv_goal_2_0= ruleGoal )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1250:1: (lv_goal_2_0= ruleGoal )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1251:3: lv_goal_2_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getGoalGoalParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleExperimentalPlan2667);
            	    lv_goal_2_0=ruleGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goal",
            	            		lv_goal_2_0, 
            	            		"Goal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleExperimentalPlan2680); 

                	newLeafNode(otherlv_3, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleExperimentalPlan2692); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentalPlanAccess().getHypothesesKeyword_4());
                
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan2704); 

                	newLeafNode(otherlv_5, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_5());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1279:1: ( (lv_hypotheses_6_0= ruleHypotheses ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1280:1: (lv_hypotheses_6_0= ruleHypotheses )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1280:1: (lv_hypotheses_6_0= ruleHypotheses )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1281:3: lv_hypotheses_6_0= ruleHypotheses
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getHypothesesHypothesesParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHypotheses_in_ruleExperimentalPlan2725);
            	    lv_hypotheses_6_0=ruleHypotheses();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hypotheses",
            	            		lv_hypotheses_6_0, 
            	            		"Hypotheses");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleExperimentalPlan2738); 

                	newLeafNode(otherlv_7, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleExperimentalPlan2750); 

                	newLeafNode(otherlv_8, grammarAccess.getExperimentalPlanAccess().getDesignOfExperimentKeyword_8());
                
            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleExperimentalPlan2762); 

                	newLeafNode(otherlv_9, grammarAccess.getExperimentalPlanAccess().getEqualsSignKeyword_9());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1309:1: ( (lv_type_10_0= ruleDesignType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1310:1: (lv_type_10_0= ruleDesignType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1310:1: (lv_type_10_0= ruleDesignType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1311:3: lv_type_10_0= ruleDesignType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignType_in_ruleExperimentalPlan2783);
            lv_type_10_0=ruleDesignType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_10_0, 
                    		"DesignType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan2795); 

                	newLeafNode(otherlv_11, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_11());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1331:1: ( (lv_parameter_12_0= ruleParameter ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==44) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1332:1: (lv_parameter_12_0= ruleParameter )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1332:1: (lv_parameter_12_0= ruleParameter )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1333:3: lv_parameter_12_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getParameterParameterParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleExperimentalPlan2816);
            	    lv_parameter_12_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameter",
            	            		lv_parameter_12_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1349:3: ( (lv_dependentVariable_13_0= ruleDependentVariable ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==45) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1350:1: (lv_dependentVariable_13_0= ruleDependentVariable )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1350:1: (lv_dependentVariable_13_0= ruleDependentVariable )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1351:3: lv_dependentVariable_13_0= ruleDependentVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getDependentVariableDependentVariableParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependentVariable_in_ruleExperimentalPlan2838);
            	    lv_dependentVariable_13_0=ruleDependentVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependentVariable",
            	            		lv_dependentVariable_13_0, 
            	            		"DependentVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1367:3: ( (lv_factor_14_0= ruleFactor ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==46) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1368:1: (lv_factor_14_0= ruleFactor )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1368:1: (lv_factor_14_0= ruleFactor )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1369:3: lv_factor_14_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleExperimentalPlan2860);
            	    lv_factor_14_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factor",
            	            		lv_factor_14_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_15=(Token)match(input,39,FOLLOW_39_in_ruleExperimentalPlan2873); 

                	newLeafNode(otherlv_15, grammarAccess.getExperimentalPlanAccess().getStatisticalAnalysisTechniqueKeyword_15());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1389:1: ( ( ( ruleQualifiedName ) )* otherlv_17= ':' ( (lv_Technique_18_0= ruleAnalysisTechiqueType ) )* )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID||LA48_0==33) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1389:2: ( ( ruleQualifiedName ) )* otherlv_17= ':' ( (lv_Technique_18_0= ruleAnalysisTechiqueType ) )*
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1389:2: ( ( ruleQualifiedName ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==RULE_ID) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1390:1: ( ruleQualifiedName )
            	    	    {
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1390:1: ( ruleQualifiedName )
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1391:3: ruleQualifiedName
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getExperimentalPlanRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTosubhypothesesSubhypothesesCrossReference_16_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleExperimentalPlan2897);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,33,FOLLOW_33_in_ruleExperimentalPlan2910); 

            	        	newLeafNode(otherlv_17, grammarAccess.getExperimentalPlanAccess().getColonKeyword_16_1());
            	        
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1408:1: ( (lv_Technique_18_0= ruleAnalysisTechiqueType ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( ((LA47_0>=75 && LA47_0<=86)) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1409:1: (lv_Technique_18_0= ruleAnalysisTechiqueType )
            	    	    {
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1409:1: (lv_Technique_18_0= ruleAnalysisTechiqueType )
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1410:3: lv_Technique_18_0= ruleAnalysisTechiqueType
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTechniqueAnalysisTechiqueTypeEnumRuleCall_16_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAnalysisTechiqueType_in_ruleExperimentalPlan2931);
            	    	    lv_Technique_18_0=ruleAnalysisTechiqueType();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"Technique",
            	    	            		lv_Technique_18_0, 
            	    	            		"AnalysisTechiqueType");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_19=(Token)match(input,40,FOLLOW_40_in_ruleExperimentalPlan2946); 

                	newLeafNode(otherlv_19, grammarAccess.getExperimentalPlanAccess().getInternalReplicationKeyword_17());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1430:1: ( (lv_internalReplication_20_0= RULE_INT ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1431:1: (lv_internalReplication_20_0= RULE_INT )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1431:1: (lv_internalReplication_20_0= RULE_INT )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1432:3: lv_internalReplication_20_0= RULE_INT
            {
            lv_internalReplication_20_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExperimentalPlan2963); 

            			newLeafNode(lv_internalReplication_20_0, grammarAccess.getExperimentalPlanAccess().getInternalReplicationINTTerminalRuleCall_18_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentalPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"internalReplication",
                    		lv_internalReplication_20_0, 
                    		"INT");
            	    

            }


            }

            otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleExperimentalPlan2980); 

                	newLeafNode(otherlv_21, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_19());
                

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


    // $ANTLR start "entryRuleGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1460:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1461:2: (iv_ruleGoal= ruleGoal EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1462:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal3016);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal3026); 

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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1469:1: ruleGoal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1472:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1473:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1473:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1473:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1473:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1474:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1474:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1475:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3068); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1491:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1492:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1492:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1493:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3090); 

            			newLeafNode(lv_description_1_0, grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleHypotheses"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1517:1: entryRuleHypotheses returns [EObject current=null] : iv_ruleHypotheses= ruleHypotheses EOF ;
    public final EObject entryRuleHypotheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHypotheses = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1518:2: (iv_ruleHypotheses= ruleHypotheses EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1519:2: iv_ruleHypotheses= ruleHypotheses EOF
            {
             newCompositeNode(grammarAccess.getHypothesesRule()); 
            pushFollow(FOLLOW_ruleHypotheses_in_entryRuleHypotheses3131);
            iv_ruleHypotheses=ruleHypotheses();

            state._fsp--;

             current =iv_ruleHypotheses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHypotheses3141); 

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
    // $ANTLR end "entryRuleHypotheses"


    // $ANTLR start "ruleHypotheses"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1526:1: ruleHypotheses returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleHypotheses() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_subhypotheses_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1529:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1530:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1530:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1530:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1530:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1531:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1531:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1532:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHypotheses3183); 

            			newLeafNode(lv_name_0_0, grammarAccess.getHypothesesAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHypothesesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1548:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1549:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1549:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1550:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHypotheses3205); 

            			newLeafNode(lv_description_1_0, grammarAccess.getHypothesesAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHypothesesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1566:2: ( (lv_type_2_0= ruleHypothesisType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1567:1: (lv_type_2_0= ruleHypothesisType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1567:1: (lv_type_2_0= ruleHypothesisType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1568:3: lv_type_2_0= ruleHypothesisType
            {
             
            	        newCompositeNode(grammarAccess.getHypothesesAccess().getTypeHypothesisTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleHypothesisType_in_ruleHypotheses3231);
            lv_type_2_0=ruleHypothesisType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHypothesesRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"HypothesisType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleHypotheses3243); 

                	newLeafNode(otherlv_3, grammarAccess.getHypothesesAccess().getFromKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1588:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1589:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1589:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1590:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getHypothesesRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getHypothesesAccess().getFromGoalGoalCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleHypotheses3266);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1603:2: (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==16) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1603:4: otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleHypotheses3279); 

                        	newLeafNode(otherlv_5, grammarAccess.getHypothesesAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1607:1: ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1608:1: (lv_subhypotheses_6_0= ruleSubhypotheses )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1608:1: (lv_subhypotheses_6_0= ruleSubhypotheses )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1609:3: lv_subhypotheses_6_0= ruleSubhypotheses
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesesAccess().getSubhypothesesSubhypothesesParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubhypotheses_in_ruleHypotheses3300);
                    	    lv_subhypotheses_6_0=ruleSubhypotheses();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHypothesesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subhypotheses",
                    	            		lv_subhypotheses_6_0, 
                    	            		"Subhypotheses");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleHypotheses3313); 

                        	newLeafNode(otherlv_7, grammarAccess.getHypothesesAccess().getRightCurlyBracketKeyword_5_2());
                        

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
    // $ANTLR end "ruleHypotheses"


    // $ANTLR start "entryRuleSubhypotheses"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1637:1: entryRuleSubhypotheses returns [EObject current=null] : iv_ruleSubhypotheses= ruleSubhypotheses EOF ;
    public final EObject entryRuleSubhypotheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubhypotheses = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1638:2: (iv_ruleSubhypotheses= ruleSubhypotheses EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1639:2: iv_ruleSubhypotheses= ruleSubhypotheses EOF
            {
             newCompositeNode(grammarAccess.getSubhypothesesRule()); 
            pushFollow(FOLLOW_ruleSubhypotheses_in_entryRuleSubhypotheses3351);
            iv_ruleSubhypotheses=ruleSubhypotheses();

            state._fsp--;

             current =iv_ruleSubhypotheses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubhypotheses3361); 

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
    // $ANTLR end "entryRuleSubhypotheses"


    // $ANTLR start "ruleSubhypotheses"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1646:1: ruleSubhypotheses returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' ) ) ;
    public final EObject ruleSubhypotheses() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Enumerator lv_operator_5_0 = null;

        Enumerator lv_relation_13_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1649:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1650:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1650:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID) ) {
                    alt54=1;
                }
                else if ( (LA54_1==42) ) {
                    alt54=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1650:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1650:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1650:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')'
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1650:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1651:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1651:1: (lv_name_0_0= RULE_ID )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1652:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubhypotheses3404); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getSubhypothesesAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1668:2: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1669:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1669:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1670:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getDependentVariableDependentVariableCrossReference_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3432);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleSubhypotheses3444); 

                        	newLeafNode(otherlv_2, grammarAccess.getSubhypothesesAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1687:1: ( ( ruleQualifiedName ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1688:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1688:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1689:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getLevelsLevelsCrossReference_0_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3467);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleSubhypotheses3480); 

                        	newLeafNode(otherlv_4, grammarAccess.getSubhypothesesAccess().getRightParenthesisKeyword_0_4());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1706:1: ( (lv_operator_5_0= ruleOperatorType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1707:1: (lv_operator_5_0= ruleOperatorType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1707:1: (lv_operator_5_0= ruleOperatorType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1708:3: lv_operator_5_0= ruleOperatorType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getOperatorOperatorTypeEnumRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperatorType_in_ruleSubhypotheses3501);
                    lv_operator_5_0=ruleOperatorType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubhypothesesRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_5_0, 
                            		"OperatorType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1724:2: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1725:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1725:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1726:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getDependentVariableDependentVariableCrossReference_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3524);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleSubhypotheses3536); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubhypothesesAccess().getLeftParenthesisKeyword_0_7());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1743:1: ( ( ruleQualifiedName ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==RULE_ID) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1744:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1744:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1745:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getLevelsLevelsCrossReference_0_8_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3559);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleSubhypotheses3572); 

                        	newLeafNode(otherlv_9, grammarAccess.getSubhypothesesAccess().getRightParenthesisKeyword_0_9());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1763:6: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1763:6: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1763:7: ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')'
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1763:7: ( (lv_name_10_0= RULE_ID ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1764:1: (lv_name_10_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1764:1: (lv_name_10_0= RULE_ID )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1765:3: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubhypotheses3597); 

                    			newLeafNode(lv_name_10_0, grammarAccess.getSubhypothesesAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_10_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleSubhypotheses3614); 

                        	newLeafNode(otherlv_11, grammarAccess.getSubhypothesesAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1785:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1786:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1786:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1787:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getDependentVariableDependentVariableCrossReference_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3637);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1800:2: ( (lv_relation_13_0= ruleRelationType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1801:1: (lv_relation_13_0= ruleRelationType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1801:1: (lv_relation_13_0= ruleRelationType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1802:3: lv_relation_13_0= ruleRelationType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getRelationRelationTypeEnumRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationType_in_ruleSubhypotheses3658);
                    lv_relation_13_0=ruleRelationType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubhypothesesRule());
                    	        }
                           		set(
                           			current, 
                           			"relation",
                            		lv_relation_13_0, 
                            		"RelationType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1818:2: ( ( ruleQualifiedName ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1819:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1819:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1820:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getFactorFactorCrossReference_1_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3681);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,43,FOLLOW_43_in_ruleSubhypotheses3694); 

                        	newLeafNode(otherlv_15, grammarAccess.getSubhypothesesAccess().getRightParenthesisKeyword_1_5());
                        

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
    // $ANTLR end "ruleSubhypotheses"


    // $ANTLR start "entryRuleParameter"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1845:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1846:2: (iv_ruleParameter= ruleParameter EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1847:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3731);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3741); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1854:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1857:28: ( (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1858:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1858:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1858:3: otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleParameter3778); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1862:1: ( (lv_variable_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1863:1: (lv_variable_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1863:1: (lv_variable_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1864:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3795); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getParameterAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleParameter3812); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1884:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1885:1: (lv_value_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1885:1: (lv_value_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1886:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter3829); 

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


    // $ANTLR start "entryRuleDependentVariable"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1910:1: entryRuleDependentVariable returns [EObject current=null] : iv_ruleDependentVariable= ruleDependentVariable EOF ;
    public final EObject entryRuleDependentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependentVariable = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1911:2: (iv_ruleDependentVariable= ruleDependentVariable EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1912:2: iv_ruleDependentVariable= ruleDependentVariable EOF
            {
             newCompositeNode(grammarAccess.getDependentVariableRule()); 
            pushFollow(FOLLOW_ruleDependentVariable_in_entryRuleDependentVariable3870);
            iv_ruleDependentVariable=ruleDependentVariable();

            state._fsp--;

             current =iv_ruleDependentVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependentVariable3880); 

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
    // $ANTLR end "entryRuleDependentVariable"


    // $ANTLR start "ruleDependentVariable"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1919:1: ruleDependentVariable returns [EObject current=null] : (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* ) ;
    public final EObject ruleDependentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1922:28: ( (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1923:1: (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1923:1: (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1923:3: otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleDependentVariable3917); 

                	newLeafNode(otherlv_0, grammarAccess.getDependentVariableAccess().getDependentVariableKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1927:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1928:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1928:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1929:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependentVariable3934); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDependentVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDependentVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1945:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1946:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1946:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1947:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependentVariable3956); 

            			newLeafNode(lv_description_2_0, grammarAccess.getDependentVariableAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDependentVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1963:2: ( ( ruleQualifiedName ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1964:1: ( ruleQualifiedName )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1964:1: ( ruleQualifiedName )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1965:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependentVariableRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDependentVariableAccess().getMetricsMetricsCrossReference_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependentVariable3984);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleDependentVariable"


    // $ANTLR start "entryRuleFactor"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1986:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1987:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1988:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor4021);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor4031); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1995:1: ruleFactor returns [EObject current=null] : (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isDesiredVariation_3_1=null;
        Token lv_isDesiredVariation_3_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_level_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1998:28: ( (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1999:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1999:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1999:3: otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleFactor4068); 

                	newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getFactorKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2003:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2004:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2004:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2005:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactor4085); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFactorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFactorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleFactor4102); 

                	newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getIsDesiredVariationKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2025:1: ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2026:1: ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2026:1: ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2027:1: (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2027:1: (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==48) ) {
                alt56=1;
            }
            else if ( (LA56_0==49) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2028:3: lv_isDesiredVariation_3_1= 'True'
                    {
                    lv_isDesiredVariation_3_1=(Token)match(input,48,FOLLOW_48_in_ruleFactor4122); 

                            newLeafNode(lv_isDesiredVariation_3_1, grammarAccess.getFactorAccess().getIsDesiredVariationTrueKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "isDesiredVariation", lv_isDesiredVariation_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2040:8: lv_isDesiredVariation_3_2= 'False'
                    {
                    lv_isDesiredVariation_3_2=(Token)match(input,49,FOLLOW_49_in_ruleFactor4151); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2055:2: (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==16) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2055:4: otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFactor4180); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2059:1: ( (lv_level_5_0= ruleLevels ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_ID) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2060:1: (lv_level_5_0= ruleLevels )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2060:1: (lv_level_5_0= ruleLevels )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2061:3: lv_level_5_0= ruleLevels
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLevels_in_ruleFactor4201);
                    	    lv_level_5_0=ruleLevels();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"level",
                    	            		lv_level_5_0, 
                    	            		"Levels");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleFactor4214); 

                        	newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_4_2());
                        

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleLevels"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2089:1: entryRuleLevels returns [EObject current=null] : iv_ruleLevels= ruleLevels EOF ;
    public final EObject entryRuleLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevels = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2090:2: (iv_ruleLevels= ruleLevels EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2091:2: iv_ruleLevels= ruleLevels EOF
            {
             newCompositeNode(grammarAccess.getLevelsRule()); 
            pushFollow(FOLLOW_ruleLevels_in_entryRuleLevels4252);
            iv_ruleLevels=ruleLevels();

            state._fsp--;

             current =iv_ruleLevels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevels4262); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2098:1: ruleLevels returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLevels() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2101:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2102:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2102:1: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2103:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2103:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2104:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLevels4303); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLevelsAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLevelsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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


    // $ANTLR start "entryRuleQuestionnaire"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2128:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2129:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2130:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire4343);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire4353); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2137:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2140:28: ( (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2141:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2141:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2141:3: otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleQuestionnaire4390); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2145:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2146:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2146:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2147:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire4407); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2163:2: (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==28) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2163:4: otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleQuestionnaire4425); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2167:1: ( (otherlv_3= RULE_ID ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2168:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2168:1: (otherlv_3= RULE_ID )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2169:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQuestionnaireRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire4445); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getRelatesToProcessCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2180:5: (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==25) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2180:7: otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleQuestionnaire4461); 

                        	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getTypeKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2184:1: ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2185:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2185:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2186:3: lv_questionnaireType_5_0= ruleQuestionnaireType
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeQuestionnaireTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire4482);
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleQuestionnaire4496); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2206:1: ( (lv_question_7_0= ruleQuestion ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2207:1: (lv_question_7_0= ruleQuestion )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2207:1: (lv_question_7_0= ruleQuestion )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2208:3: lv_question_7_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleQuestionnaire4517);
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
            	    break loop62;
                }
            } while (true);

            otherlv_8=(Token)match(input,51,FOLLOW_51_in_ruleQuestionnaire4530); 

                	newLeafNode(otherlv_8, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketSemicolonKeyword_6());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2236:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2237:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2238:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion4566);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion4576); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2245:1: ruleQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2248:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2249:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2249:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2249:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}'
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2249:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2250:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2250:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2251:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion4618); 

            			newLeafNode(lv_name_0_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleQuestion4635); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2271:1: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2271:3: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleQuestion4648); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getDescriptionKeyword_2_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2275:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2276:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2276:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2277:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion4665); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2293:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2293:5: otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) )
            {
            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleQuestion4684); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getTypeKeyword_3_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2297:1: ( (lv_type_5_0= ruleAnswerType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2298:1: (lv_type_5_0= ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2298:1: (lv_type_5_0= ruleAnswerType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2299:3: lv_type_5_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion4705);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2315:3: (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==52) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2315:5: otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleQuestion4719); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRequiredKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2319:1: ( (lv_req_7_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2320:1: (lv_req_7_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2320:1: (lv_req_7_0= RULE_INT )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2321:3: lv_req_7_0= RULE_INT
                    {
                    lv_req_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuestion4736); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2337:4: (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==53) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2337:6: otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleQuestion4756); 

                        	newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2341:1: ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==54) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2342:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2342:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2343:3: lv_alternatives_9_0= ruleAlternatives
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAlternatives_in_ruleQuestion4777);
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
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleQuestion4792); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2371:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2372:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2373:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives4828);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives4838); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2380:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2383:28: ( (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2384:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2384:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2384:3: otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleAlternatives4875); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getOptionKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2388:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2389:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2389:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2390:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternatives4892); 

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


    // $ANTLR start "ruleRoleType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2414:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2416:28: ( ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2417:1: ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2417:1: ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==55) ) {
                alt66=1;
            }
            else if ( (LA66_0==56) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2417:2: (enumLiteral_0= 'Participant' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2417:2: (enumLiteral_0= 'Participant' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2417:4: enumLiteral_0= 'Participant'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleRoleType4947); 

                            current = grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2423:6: (enumLiteral_1= 'Researcher' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2423:6: (enumLiteral_1= 'Researcher' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2423:8: enumLiteral_1= 'Researcher'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleRoleType4964); 

                            current = grammarAccess.getRoleTypeAccess().getResearcherEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoleTypeAccess().getResearcherEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleRoleType"


    // $ANTLR start "ruleArtefactType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2433:1: ruleArtefactType returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) ;
    public final Enumerator ruleArtefactType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2435:28: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2436:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2436:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt67=1;
                }
                break;
            case 58:
                {
                alt67=2;
                }
                break;
            case 59:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2436:2: (enumLiteral_0= 'input' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2436:2: (enumLiteral_0= 'input' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2436:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleArtefactType5009); 

                            current = grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2442:6: (enumLiteral_1= 'output' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2442:6: (enumLiteral_1= 'output' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2442:8: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleArtefactType5026); 

                            current = grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2448:6: (enumLiteral_2= 'inoutput' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2448:6: (enumLiteral_2= 'inoutput' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2448:8: enumLiteral_2= 'inoutput'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleArtefactType5043); 

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


    // $ANTLR start "ruleDataType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2458:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2460:28: ( ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2461:1: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2461:1: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==60) ) {
                alt68=1;
            }
            else if ( (LA68_0==61) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2461:2: (enumLiteral_0= 'number' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2461:2: (enumLiteral_0= 'number' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2461:4: enumLiteral_0= 'number'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleDataType5088); 

                            current = grammarAccess.getDataTypeAccess().getNumEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNumEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2467:6: (enumLiteral_1= 'text' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2467:6: (enumLiteral_1= 'text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2467:8: enumLiteral_1= 'text'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleDataType5105); 

                            current = grammarAccess.getDataTypeAccess().getTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getTextEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleRelationType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2477:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2479:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2480:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2480:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==62) ) {
                alt69=1;
            }
            else if ( (LA69_0==63) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2480:2: (enumLiteral_0= '==' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2480:2: (enumLiteral_0= '==' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2480:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleRelationType5150); 

                            current = grammarAccess.getRelationTypeAccess().getIsRelatedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getIsRelatedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2486:6: (enumLiteral_1= '<>' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2486:6: (enumLiteral_1= '<>' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2486:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleRelationType5167); 

                            current = grammarAccess.getRelationTypeAccess().getIsNotRelatedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getIsNotRelatedEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "ruleOperatorType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2496:1: ruleOperatorType returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
    public final Enumerator ruleOperatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2498:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2499:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2499:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt70=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt70=1;
                }
                break;
            case 64:
                {
                alt70=2;
                }
                break;
            case 65:
                {
                alt70=3;
                }
                break;
            case 66:
                {
                alt70=4;
                }
                break;
            case 67:
                {
                alt70=5;
                }
                break;
            case 68:
                {
                alt70=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2499:2: (enumLiteral_0= '=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2499:2: (enumLiteral_0= '=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2499:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleOperatorType5212); 

                            current = grammarAccess.getOperatorTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2505:6: (enumLiteral_1= '!=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2505:6: (enumLiteral_1= '!=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2505:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleOperatorType5229); 

                            current = grammarAccess.getOperatorTypeAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorTypeAccess().getDifferentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2511:6: (enumLiteral_2= '>' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2511:6: (enumLiteral_2= '>' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2511:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleOperatorType5246); 

                            current = grammarAccess.getOperatorTypeAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorTypeAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2517:6: (enumLiteral_3= '<' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2517:6: (enumLiteral_3= '<' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2517:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleOperatorType5263); 

                            current = grammarAccess.getOperatorTypeAccess().getLessEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorTypeAccess().getLessEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2523:6: (enumLiteral_4= '>=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2523:6: (enumLiteral_4= '>=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2523:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleOperatorType5280); 

                            current = grammarAccess.getOperatorTypeAccess().getMoreEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorTypeAccess().getMoreEqualEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2529:6: (enumLiteral_5= '<=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2529:6: (enumLiteral_5= '<=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2529:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_68_in_ruleOperatorType5297); 

                            current = grammarAccess.getOperatorTypeAccess().getLessEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOperatorTypeAccess().getLessEqualEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleOperatorType"


    // $ANTLR start "ruleHypothesisType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2539:1: ruleHypothesisType returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'alternative' ) ) ;
    public final Enumerator ruleHypothesisType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2541:28: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'alternative' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2542:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'alternative' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2542:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'alternative' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==69) ) {
                alt71=1;
            }
            else if ( (LA71_0==70) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2542:2: (enumLiteral_0= 'null' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2542:2: (enumLiteral_0= 'null' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2542:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleHypothesisType5342); 

                            current = grammarAccess.getHypothesisTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHypothesisTypeAccess().getNullEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2548:6: (enumLiteral_1= 'alternative' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2548:6: (enumLiteral_1= 'alternative' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2548:8: enumLiteral_1= 'alternative'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleHypothesisType5359); 

                            current = grammarAccess.getHypothesisTypeAccess().getAlternativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHypothesisTypeAccess().getAlternativeEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleHypothesisType"


    // $ANTLR start "ruleDesignType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2558:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2560:28: ( ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2561:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2561:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt72=1;
                }
                break;
            case 72:
                {
                alt72=2;
                }
                break;
            case 73:
                {
                alt72=3;
                }
                break;
            case 74:
                {
                alt72=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2561:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2561:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2561:4: enumLiteral_0= 'CRD - Completely Randomized Design'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_71_in_ruleDesignType5404); 

                            current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2567:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2567:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2567:8: enumLiteral_1= 'RCBD - Randomized Complete Block Design'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleDesignType5421); 

                            current = grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2573:6: (enumLiteral_2= 'LS - Latin Square' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2573:6: (enumLiteral_2= 'LS - Latin Square' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2573:8: enumLiteral_2= 'LS - Latin Square'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_73_in_ruleDesignType5438); 

                            current = grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2579:6: (enumLiteral_3= 'Other' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2579:6: (enumLiteral_3= 'Other' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2579:8: enumLiteral_3= 'Other'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_74_in_ruleDesignType5455); 

                            current = grammarAccess.getDesignTypeAccess().getOtherEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDesignTypeAccess().getOtherEnumLiteralDeclaration_3()); 
                        

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


    // $ANTLR start "ruleAnalysisTechiqueType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2589:1: ruleAnalysisTechiqueType returns [Enumerator current=null] : ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'McNemar Test' ) | (enumLiteral_5= 'Mann-Whitney' ) | (enumLiteral_6= 'Paired t-test' ) | (enumLiteral_7= 'Wilcoxon' ) | (enumLiteral_8= 'Sign test' ) | (enumLiteral_9= 'ANOVA' ) | (enumLiteral_10= 'Kruskal-Wallis' ) | (enumLiteral_11= 'Others' ) ) ;
    public final Enumerator ruleAnalysisTechiqueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2591:28: ( ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'McNemar Test' ) | (enumLiteral_5= 'Mann-Whitney' ) | (enumLiteral_6= 'Paired t-test' ) | (enumLiteral_7= 'Wilcoxon' ) | (enumLiteral_8= 'Sign test' ) | (enumLiteral_9= 'ANOVA' ) | (enumLiteral_10= 'Kruskal-Wallis' ) | (enumLiteral_11= 'Others' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2592:1: ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'McNemar Test' ) | (enumLiteral_5= 'Mann-Whitney' ) | (enumLiteral_6= 'Paired t-test' ) | (enumLiteral_7= 'Wilcoxon' ) | (enumLiteral_8= 'Sign test' ) | (enumLiteral_9= 'ANOVA' ) | (enumLiteral_10= 'Kruskal-Wallis' ) | (enumLiteral_11= 'Others' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2592:1: ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'McNemar Test' ) | (enumLiteral_5= 'Mann-Whitney' ) | (enumLiteral_6= 'Paired t-test' ) | (enumLiteral_7= 'Wilcoxon' ) | (enumLiteral_8= 'Sign test' ) | (enumLiteral_9= 'ANOVA' ) | (enumLiteral_10= 'Kruskal-Wallis' ) | (enumLiteral_11= 'Others' ) )
            int alt73=12;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt73=1;
                }
                break;
            case 76:
                {
                alt73=2;
                }
                break;
            case 77:
                {
                alt73=3;
                }
                break;
            case 78:
                {
                alt73=4;
                }
                break;
            case 79:
                {
                alt73=5;
                }
                break;
            case 80:
                {
                alt73=6;
                }
                break;
            case 81:
                {
                alt73=7;
                }
                break;
            case 82:
                {
                alt73=8;
                }
                break;
            case 83:
                {
                alt73=9;
                }
                break;
            case 84:
                {
                alt73=10;
                }
                break;
            case 85:
                {
                alt73=11;
                }
                break;
            case 86:
                {
                alt73=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2592:2: (enumLiteral_0= 'Chi-2' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2592:2: (enumLiteral_0= 'Chi-2' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2592:4: enumLiteral_0= 'Chi-2'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleAnalysisTechiqueType5500); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getChi2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnalysisTechiqueTypeAccess().getChi2EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2598:6: (enumLiteral_1= 'Binomial Test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2598:6: (enumLiteral_1= 'Binomial Test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2598:8: enumLiteral_1= 'Binomial Test'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleAnalysisTechiqueType5517); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getBinomialTestEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnalysisTechiqueTypeAccess().getBinomialTestEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2604:6: (enumLiteral_2= 't-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2604:6: (enumLiteral_2= 't-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2604:8: enumLiteral_2= 't-test'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleAnalysisTechiqueType5534); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getTTestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnalysisTechiqueTypeAccess().getTTestEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2610:6: (enumLiteral_3= 'F-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2610:6: (enumLiteral_3= 'F-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2610:8: enumLiteral_3= 'F-test'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleAnalysisTechiqueType5551); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getFTestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnalysisTechiqueTypeAccess().getFTestEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2616:6: (enumLiteral_4= 'McNemar Test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2616:6: (enumLiteral_4= 'McNemar Test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2616:8: enumLiteral_4= 'McNemar Test'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_79_in_ruleAnalysisTechiqueType5568); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getMcNemarTestEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnalysisTechiqueTypeAccess().getMcNemarTestEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2622:6: (enumLiteral_5= 'Mann-Whitney' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2622:6: (enumLiteral_5= 'Mann-Whitney' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2622:8: enumLiteral_5= 'Mann-Whitney'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_80_in_ruleAnalysisTechiqueType5585); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getMannWhitneyEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnalysisTechiqueTypeAccess().getMannWhitneyEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2628:6: (enumLiteral_6= 'Paired t-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2628:6: (enumLiteral_6= 'Paired t-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2628:8: enumLiteral_6= 'Paired t-test'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_81_in_ruleAnalysisTechiqueType5602); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getPairedEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getAnalysisTechiqueTypeAccess().getPairedEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2634:6: (enumLiteral_7= 'Wilcoxon' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2634:6: (enumLiteral_7= 'Wilcoxon' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2634:8: enumLiteral_7= 'Wilcoxon'
                    {
                    enumLiteral_7=(Token)match(input,82,FOLLOW_82_in_ruleAnalysisTechiqueType5619); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getWilcoxonEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getAnalysisTechiqueTypeAccess().getWilcoxonEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2640:6: (enumLiteral_8= 'Sign test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2640:6: (enumLiteral_8= 'Sign test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2640:8: enumLiteral_8= 'Sign test'
                    {
                    enumLiteral_8=(Token)match(input,83,FOLLOW_83_in_ruleAnalysisTechiqueType5636); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getSignTestEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getAnalysisTechiqueTypeAccess().getSignTestEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2646:6: (enumLiteral_9= 'ANOVA' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2646:6: (enumLiteral_9= 'ANOVA' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2646:8: enumLiteral_9= 'ANOVA'
                    {
                    enumLiteral_9=(Token)match(input,84,FOLLOW_84_in_ruleAnalysisTechiqueType5653); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getAnovaEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getAnalysisTechiqueTypeAccess().getAnovaEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2652:6: (enumLiteral_10= 'Kruskal-Wallis' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2652:6: (enumLiteral_10= 'Kruskal-Wallis' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2652:8: enumLiteral_10= 'Kruskal-Wallis'
                    {
                    enumLiteral_10=(Token)match(input,85,FOLLOW_85_in_ruleAnalysisTechiqueType5670); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getKruskalWallisEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getAnalysisTechiqueTypeAccess().getKruskalWallisEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2658:6: (enumLiteral_11= 'Others' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2658:6: (enumLiteral_11= 'Others' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2658:8: enumLiteral_11= 'Others'
                    {
                    enumLiteral_11=(Token)match(input,86,FOLLOW_86_in_ruleAnalysisTechiqueType5687); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getOthersEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getAnalysisTechiqueTypeAccess().getOthersEnumLiteralDeclaration_11()); 
                        

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
    // $ANTLR end "ruleAnalysisTechiqueType"


    // $ANTLR start "ruleQuestionnaireType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2668:1: ruleQuestionnaireType returns [Enumerator current=null] : ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) ) ;
    public final Enumerator ruleQuestionnaireType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2670:28: ( ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2671:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2671:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==87) ) {
                alt74=1;
            }
            else if ( (LA74_0==88) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2671:2: (enumLiteral_0= 'Pre' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2671:2: (enumLiteral_0= 'Pre' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2671:4: enumLiteral_0= 'Pre'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleQuestionnaireType5732); 

                            current = grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2677:6: (enumLiteral_1= 'Post' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2677:6: (enumLiteral_1= 'Post' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2677:8: enumLiteral_1= 'Post'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleQuestionnaireType5749); 

                            current = grammarAccess.getQuestionnaireTypeAccess().getPostEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQuestionnaireTypeAccess().getPostEnumLiteralDeclaration_1()); 
                        

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2687:1: ruleAnswerType returns [Enumerator current=null] : ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2689:28: ( ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2690:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2690:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) )
            int alt75=7;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt75=1;
                }
                break;
            case 90:
                {
                alt75=2;
                }
                break;
            case 91:
                {
                alt75=3;
                }
                break;
            case 92:
                {
                alt75=4;
                }
                break;
            case 93:
                {
                alt75=5;
                }
                break;
            case 94:
                {
                alt75=6;
                }
                break;
            case 95:
                {
                alt75=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2690:2: (enumLiteral_0= 'Text' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2690:2: (enumLiteral_0= 'Text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2690:4: enumLiteral_0= 'Text'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleAnswerType5794); 

                            current = grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2696:6: (enumLiteral_1= 'ParagraphText' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2696:6: (enumLiteral_1= 'ParagraphText' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2696:8: enumLiteral_1= 'ParagraphText'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleAnswerType5811); 

                            current = grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2702:6: (enumLiteral_2= 'MultipleChoice' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2702:6: (enumLiteral_2= 'MultipleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2702:8: enumLiteral_2= 'MultipleChoice'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleAnswerType5828); 

                            current = grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2708:6: (enumLiteral_3= 'ComboBox' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2708:6: (enumLiteral_3= 'ComboBox' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2708:8: enumLiteral_3= 'ComboBox'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_92_in_ruleAnswerType5845); 

                            current = grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2714:6: (enumLiteral_4= 'CheckBoxes' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2714:6: (enumLiteral_4= 'CheckBoxes' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2714:8: enumLiteral_4= 'CheckBoxes'
                    {
                    enumLiteral_4=(Token)match(input,93,FOLLOW_93_in_ruleAnswerType5862); 

                            current = grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2720:6: (enumLiteral_5= 'Scale' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2720:6: (enumLiteral_5= 'Scale' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2720:8: enumLiteral_5= 'Scale'
                    {
                    enumLiteral_5=(Token)match(input,94,FOLLOW_94_in_ruleAnswerType5879); 

                            current = grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2726:6: (enumLiteral_6= 'Grid' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2726:6: (enumLiteral_6= 'Grid' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2726:8: enumLiteral_6= 'Grid'
                    {
                    enumLiteral_6=(Token)match(input,95,FOLLOW_95_in_ruleAnswerType5896); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentElement230 = new BitSet(new long[]{0x0000000008005000L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleExperimentElement256 = new BitSet(new long[]{0x0000000008005000L});
    public static final BitSet FOLLOW_ruleMetrics_in_ruleExperimentElement278 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_12_in_ruleExperimentElement292 = new BitSet(new long[]{0x0000000800002002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement313 = new BitSet(new long[]{0x0000000800002002L});
    public static final BitSet FOLLOW_13_in_ruleExperimentElement328 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_ruleExperimentElement349 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProcess435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess452 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleProcess470 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProcess493 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleProcess508 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleProcess521 = new BitSet(new long[]{0x01800000000C0000L});
    public static final BitSet FOLLOW_ruleRoleType_in_ruleProcess542 = new BitSet(new long[]{0x01800000000C0000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleProcess566 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleProcess579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleActivity662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity679 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActivity696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity713 = new BitSet(new long[]{0x0000000000E38002L});
    public static final BitSet FOLLOW_15_in_ruleActivity731 = new BitSet(new long[]{0x0000000000E30022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity754 = new BitSet(new long[]{0x0000000000E30022L});
    public static final BitSet FOLLOW_17_in_ruleActivity770 = new BitSet(new long[]{0x0180000000E10002L});
    public static final BitSet FOLLOW_ruleRoleType_in_ruleActivity791 = new BitSet(new long[]{0x0180000000E10002L});
    public static final BitSet FOLLOW_21_in_ruleActivity807 = new BitSet(new long[]{0x0000000000C10022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity830 = new BitSet(new long[]{0x0000000000C10022L});
    public static final BitSet FOLLOW_22_in_ruleActivity846 = new BitSet(new long[]{0x0000000000810022L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleActivity867 = new BitSet(new long[]{0x0000000000810022L});
    public static final BitSet FOLLOW_23_in_ruleActivity883 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity906 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_16_in_ruleActivity922 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleActivity943 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18_in_ruleActivity956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTask1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1058 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTask1075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask1092 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_21_in_ruleTask1110 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask1133 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_22_in_ruleTask1149 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleTask1170 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_23_in_ruleTask1186 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask1209 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleArtefact_in_entryRuleArtefact1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefact1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArtefact1300 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArtefact1317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefact1334 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArtefact1351 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_ruleArtefactType_in_ruleArtefact1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1460 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedName1479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1494 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleMetrics_in_entryRuleMetrics1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetrics1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMetrics1588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetrics1605 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMetrics1622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetrics1642 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMetrics1654 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMetrics1667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetrics1684 = new BitSet(new long[]{0x00000005A0800000L});
    public static final BitSet FOLLOW_ruleDetail_in_ruleMetrics1711 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMetrics1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetail_in_entryRuleDetail1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetail1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeMetric_in_ruleDetail1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataMetric_in_ruleDetail1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeMetric_in_entryRuleTimeMetric1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeMetric1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_ruleTimeMetric1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_ruleTimeMetric1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric1997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityMetric2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleActivityMetric2054 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityMetric2077 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleActivityMetric2091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityMetric2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric2152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskMetric2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTaskMetric2208 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTaskMetric2231 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleDataMetric_in_entryRuleDataMetric2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataMetric2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataMetric2325 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_ruleCollectedData_in_ruleDataMetric2346 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_33_in_ruleDataMetric2359 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataMetric2380 = new BitSet(new long[]{0x0000000400800002L});
    public static final BitSet FOLLOW_34_in_ruleDataMetric2395 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataMetric2418 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_23_in_ruleDataMetric2434 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataMetric2457 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleCollectedData_in_entryRuleCollectedData2496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectedData2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectedData2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan2587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentalPlan2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExperimentalPlan2634 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan2646 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleExperimentalPlan2667 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleExperimentalPlan2680 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExperimentalPlan2692 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan2704 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleHypotheses_in_ruleExperimentalPlan2725 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleExperimentalPlan2738 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleExperimentalPlan2750 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExperimentalPlan2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleExperimentalPlan2783 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan2795 = new BitSet(new long[]{0x0000708000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExperimentalPlan2816 = new BitSet(new long[]{0x0000708000000000L});
    public static final BitSet FOLLOW_ruleDependentVariable_in_ruleExperimentalPlan2838 = new BitSet(new long[]{0x0000608000000000L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExperimentalPlan2860 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_39_in_ruleExperimentalPlan2873 = new BitSet(new long[]{0x0000010200000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleExperimentalPlan2897 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_33_in_ruleExperimentalPlan2910 = new BitSet(new long[]{0x0000010200000020L,0x00000000007FF800L});
    public static final BitSet FOLLOW_ruleAnalysisTechiqueType_in_ruleExperimentalPlan2931 = new BitSet(new long[]{0x0000010200000020L,0x00000000007FF800L});
    public static final BitSet FOLLOW_40_in_ruleExperimentalPlan2946 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExperimentalPlan2963 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExperimentalPlan2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal3016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypotheses_in_entryRuleHypotheses3131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHypotheses3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHypotheses3183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHypotheses3205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleHypothesisType_in_ruleHypotheses3231 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleHypotheses3243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHypotheses3266 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleHypotheses3279 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleSubhypotheses_in_ruleHypotheses3300 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleHypotheses3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubhypotheses_in_entryRuleSubhypotheses3351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubhypotheses3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubhypotheses3404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3432 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSubhypotheses3444 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3467 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_43_in_ruleSubhypotheses3480 = new BitSet(new long[]{0x0000004000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleOperatorType_in_ruleSubhypotheses3501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3524 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSubhypotheses3536 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3559 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_43_in_ruleSubhypotheses3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubhypotheses3597 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSubhypotheses3614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3637 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleSubhypotheses3658 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3681 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_43_in_ruleSubhypotheses3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleParameter3778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3795 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleParameter3812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependentVariable_in_entryRuleDependentVariable3870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependentVariable3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDependentVariable3917 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependentVariable3934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependentVariable3956 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependentVariable3984 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor4021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFactor4068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactor4085 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleFactor4102 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_ruleFactor4122 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_49_in_ruleFactor4151 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleFactor4180 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleFactor4201 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleFactor4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevels_in_entryRuleLevels4252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevels4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLevels4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire4343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleQuestionnaire4390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire4407 = new BitSet(new long[]{0x0000000012010000L});
    public static final BitSet FOLLOW_28_in_ruleQuestionnaire4425 = new BitSet(new long[]{0x0000000002010020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire4445 = new BitSet(new long[]{0x0000000002010020L});
    public static final BitSet FOLLOW_25_in_ruleQuestionnaire4461 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire4482 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestionnaire4496 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionnaire4517 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_51_in_ruleQuestionnaire4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion4566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion4618 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestion4635 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQuestion4648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion4665 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQuestion4684 = new BitSet(new long[]{0x0000000000000000L,0x00000000FE000000L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion4705 = new BitSet(new long[]{0x0030000000040000L});
    public static final BitSet FOLLOW_52_in_ruleQuestion4719 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuestion4736 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_53_in_ruleQuestion4756 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleQuestion4777 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQuestion4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives4828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlternatives4875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternatives4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRoleType4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRoleType4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleArtefactType5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleArtefactType5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleArtefactType5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDataType5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDataType5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRelationType5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRelationType5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperatorType5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOperatorType5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperatorType5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperatorType5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperatorType5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperatorType5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleHypothesisType5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleHypothesisType5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDesignType5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDesignType5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDesignType5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDesignType5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAnalysisTechiqueType5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAnalysisTechiqueType5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAnalysisTechiqueType5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAnalysisTechiqueType5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAnalysisTechiqueType5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAnalysisTechiqueType5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAnalysisTechiqueType5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAnalysisTechiqueType5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAnalysisTechiqueType5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAnalysisTechiqueType5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAnalysisTechiqueType5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAnalysisTechiqueType5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleQuestionnaireType5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleQuestionnaireType5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAnswerType5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleAnswerType5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAnswerType5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleAnswerType5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleAnswerType5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleAnswerType5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleAnswerType5896 = new BitSet(new long[]{0x0000000000000002L});

}