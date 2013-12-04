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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Experiment'", "'Experimental Plan'", "'Questionnaires'", "'Process'", "'{'", "'}'", "'.'", "'Activity'", "'description'", "'to'", "'var'", "'artefacts'", "'quest'", "'Task'", "'Role'", "'type'", "'Metric'", "'relates'", "'activityBegin'", "'activityEnd'", "'tasks'", "'collectedData'", "':'", "'artefact'", "'Goals'", "'Hypotheses'", "'DesignOfExperiment'", "'='", "'Statistical Analysis analysis'", "'Internal Replication '", "'from'", "'('", "')'", "'Parameter'", "'Dependent Variable'", "'Factor'", "'isDesiredVariation'", "'True'", "'False'", "'Level'", "'Link'", "'Questionnaire'", "'};'", "'required'", "'Alternatives'", "'Option'", "'input'", "'output'", "'inoutput'", "'number'", "'text'", "'=='", "'<>'", "'!='", "'>'", "'<'", "'>='", "'<='", "'null'", "'alternative'", "'CRD - Completely Randomized Design'", "'RCBD - Randomized Complete Block Design'", "'LS - Latin Square'", "'Other'", "'Chi-2'", "'Binomial Test'", "'t-test'", "'F-test'", "'Mann-Whitney'", "'Paired t-test'", "'Wilcoxon'", "'Sign test'", "'ANOVA'", "'Kruskal-Wallis'", "'Others'", "'Pre'", "'Pos'", "'Text'", "'ParagraphText'", "'MultipleChoice'", "'ComboBox'", "'CheckBoxes'", "'Scale'", "'Grid'"
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:116:1: ruleExperimentElement returns [EObject current=null] : (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:119:28: ( (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:3: otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_process_2_0= ruleProcess ) )* ( (lv_metrics_3_0= ruleMetrics ) )* (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )? (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:178:3: (otherlv_4= 'Experimental Plan' ( (lv_experiments_5_0= ruleExperimentalPlan ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
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
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:200:5: (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:200:7: otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleExperimentElement329); 

                        	newLeafNode(otherlv_6, grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:204:1: ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==52) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:205:1: (lv_questionnaire_7_0= ruleQuestionnaire )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:205:1: (lv_questionnaire_7_0= ruleQuestionnaire )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:206:3: lv_questionnaire_7_0= ruleQuestionnaire
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:230:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:231:2: (iv_ruleProcess= ruleProcess EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:232:2: iv_ruleProcess= ruleProcess EOF
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:239:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role_3_0= ruleRole ) )? ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_role_3_0 = null;

        EObject lv_activities_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:242:28: ( (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role_3_0= ruleRole ) )? ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role_3_0= ruleRole ) )? ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role_3_0= ruleRole ) )? ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:3: otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role_3_0= ruleRole ) )? ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProcess436); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:247:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:248:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:248:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:249:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess453); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProcess470); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:269:1: ( (lv_role_3_0= ruleRole ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:270:1: (lv_role_3_0= ruleRole )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:270:1: (lv_role_3_0= ruleRole )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:271:3: lv_role_3_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessAccess().getRoleRoleParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRole_in_ruleProcess491);
                    lv_role_3_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	        }
                           		add(
                           			current, 
                           			"role",
                            		lv_role_3_0, 
                            		"Role");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:287:3: ( (lv_activities_4_0= ruleActivity ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:288:1: (lv_activities_4_0= ruleActivity )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:288:1: (lv_activities_4_0= ruleActivity )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:289:3: lv_activities_4_0= ruleActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getActivitiesActivityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleProcess513);
            	    lv_activities_4_0=ruleActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_4_0, 
            	            		"Activity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleProcess526); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:317:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:318:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:319:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName563);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName574); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:326:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:329:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:330:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:330:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:330:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName614); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:337:1: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:338:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName633); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName648); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "entryRuleActivity"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:358:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:359:2: (iv_ruleActivity= ruleActivity EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:360:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity695);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity705); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:367:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? ( (lv_role_6_0= ruleRole ) )? (otherlv_7= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_13= '{' ( (lv_tasks_14_0= ruleTask ) )* otherlv_15= '}' )? ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_role_6_0 = null;

        EObject lv_artefacts_10_0 = null;

        EObject lv_tasks_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:370:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? ( (lv_role_6_0= ruleRole ) )? (otherlv_7= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_13= '{' ( (lv_tasks_14_0= ruleTask ) )* otherlv_15= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:371:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? ( (lv_role_6_0= ruleRole ) )? (otherlv_7= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_13= '{' ( (lv_tasks_14_0= ruleTask ) )* otherlv_15= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:371:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? ( (lv_role_6_0= ruleRole ) )? (otherlv_7= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_13= '{' ( (lv_tasks_14_0= ruleTask ) )* otherlv_15= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:371:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? ( (lv_role_6_0= ruleRole ) )? (otherlv_7= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'quest' ( ( ruleQualifiedName ) )* )? (otherlv_13= '{' ( (lv_tasks_14_0= ruleTask ) )* otherlv_15= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleActivity742); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:375:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:376:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:376:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:377:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity759); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleActivity776); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:397:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:398:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:398:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:399:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity793); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:415:2: (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:415:4: otherlv_4= 'to' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleActivity811); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getToKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:419:1: ( ( ruleQualifiedName ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:420:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:420:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:421:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getNextActivityCrossReference_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity834);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:434:5: ( (lv_role_6_0= ruleRole ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:435:1: (lv_role_6_0= ruleRole )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:435:1: (lv_role_6_0= ruleRole )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:436:3: lv_role_6_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getRoleRoleParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRole_in_ruleActivity858);
                    lv_role_6_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:452:3: (otherlv_7= 'var' ( ( ruleQualifiedName ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:452:5: otherlv_7= 'var' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleActivity872); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getVarKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:456:1: ( ( ruleQualifiedName ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:457:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:457:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:458:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getCollectDataCollectedDataCrossReference_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity895);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:471:5: (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:471:7: otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )*
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleActivity911); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getArtefactsKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:475:1: ( (lv_artefacts_10_0= ruleArtefact ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:476:1: (lv_artefacts_10_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:476:1: (lv_artefacts_10_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:477:3: lv_artefacts_10_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getArtefactsArtefactParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleActivity932);
                    	    lv_artefacts_10_0=ruleArtefact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"artefacts",
                    	            		lv_artefacts_10_0, 
                    	            		"Artefact");
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:493:5: (otherlv_11= 'quest' ( ( ruleQualifiedName ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:493:7: otherlv_11= 'quest' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleActivity948); 

                        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getQuestKeyword_8_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:497:1: ( ( ruleQualifiedName ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:498:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:498:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:499:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getQuestionnaireQuestionnaireCrossReference_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity971);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:512:5: (otherlv_13= '{' ( (lv_tasks_14_0= ruleTask ) )* otherlv_15= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:512:7: otherlv_13= '{' ( (lv_tasks_14_0= ruleTask ) )* otherlv_15= '}'
                    {
                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleActivity987); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:516:1: ( (lv_tasks_14_0= ruleTask ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==24) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:517:1: (lv_tasks_14_0= ruleTask )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:517:1: (lv_tasks_14_0= ruleTask )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:518:3: lv_tasks_14_0= ruleTask
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTasksTaskParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTask_in_ruleActivity1008);
                    	    lv_tasks_14_0=ruleTask();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tasks",
                    	            		lv_tasks_14_0, 
                    	            		"Task");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleActivity1021); 

                        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_2());
                        

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:546:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:547:2: (iv_ruleTask= ruleTask EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:548:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask1059);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask1069); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:555:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:558:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:559:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:559:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:559:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )? (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTask1106); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:563:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:564:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:564:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:565:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1123); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTask1140); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:585:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:586:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:586:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:587:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask1157); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:603:2: (otherlv_4= 'var' ( ( ruleQualifiedName ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:603:4: otherlv_4= 'var' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTask1175); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getVarKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:607:1: ( ( ruleQualifiedName ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:608:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:608:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:609:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getVarCollectedDataCrossReference_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask1198);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:622:5: (otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:622:7: otherlv_6= 'artefacts' ( (lv_artefacts_7_0= ruleArtefact ) )*
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleTask1214); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getArtefactsKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:626:1: ( (lv_artefacts_7_0= ruleArtefact ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:627:1: (lv_artefacts_7_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:627:1: (lv_artefacts_7_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:628:3: lv_artefacts_7_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getArtefactsArtefactParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleTask1235);
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:644:5: (otherlv_8= 'quest' ( ( ruleQualifiedName ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:644:7: otherlv_8= 'quest' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleTask1251); 

                        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getQuestKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:648:1: ( ( ruleQualifiedName ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:649:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:649:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:650:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getQuestionnaireQuestionnaireCrossReference_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask1274);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:671:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:672:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:673:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1313);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1323); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:680:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:683:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:684:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:684:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:684:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRole1360); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:688:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:689:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:689:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:690:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRole1377); 

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


    // $ANTLR start "entryRuleArtefact"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:714:1: entryRuleArtefact returns [EObject current=null] : iv_ruleArtefact= ruleArtefact EOF ;
    public final EObject entryRuleArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefact = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:715:2: (iv_ruleArtefact= ruleArtefact EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:716:2: iv_ruleArtefact= ruleArtefact EOF
            {
             newCompositeNode(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_ruleArtefact_in_entryRuleArtefact1418);
            iv_ruleArtefact=ruleArtefact();

            state._fsp--;

             current =iv_ruleArtefact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefact1428); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:723:1: ruleArtefact returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) ;
    public final EObject ruleArtefact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:726:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:727:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:727:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:727:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:727:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:728:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:728:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:729:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArtefact1470); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleArtefact1487); 

                	newLeafNode(otherlv_1, grammarAccess.getArtefactAccess().getDescriptionKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:749:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:750:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:750:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:751:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefact1504); 

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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleArtefact1521); 

                	newLeafNode(otherlv_3, grammarAccess.getArtefactAccess().getTypeKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:771:1: ( (lv_type_4_0= ruleArtefactType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:772:1: (lv_type_4_0= ruleArtefactType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:772:1: (lv_type_4_0= ruleArtefactType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:773:3: lv_type_4_0= ruleArtefactType
            {
             
            	        newCompositeNode(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleArtefactType_in_ruleArtefact1542);
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


    // $ANTLR start "entryRuleMetrics"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:797:1: entryRuleMetrics returns [EObject current=null] : iv_ruleMetrics= ruleMetrics EOF ;
    public final EObject entryRuleMetrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrics = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:798:2: (iv_ruleMetrics= ruleMetrics EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:799:2: iv_ruleMetrics= ruleMetrics EOF
            {
             newCompositeNode(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_ruleMetrics_in_entryRuleMetrics1578);
            iv_ruleMetrics=ruleMetrics();

            state._fsp--;

             current =iv_ruleMetrics; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetrics1588); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:806:1: ruleMetrics returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:809:28: ( (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:810:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:810:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:810:3: otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMetrics1625); 

                	newLeafNode(otherlv_0, grammarAccess.getMetricsAccess().getMetricKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:814:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:815:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:815:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:816:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetrics1642); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleMetrics1659); 

                	newLeafNode(otherlv_2, grammarAccess.getMetricsAccess().getRelatesKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:836:1: ( (otherlv_3= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:837:1: (otherlv_3= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:837:1: (otherlv_3= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:838:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricsRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetrics1679); 

            		newLeafNode(otherlv_3, grammarAccess.getMetricsAccess().getRelatesToProcessCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleMetrics1691); 

                	newLeafNode(otherlv_4, grammarAccess.getMetricsAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:853:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:853:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleMetrics1704); 

                	newLeafNode(otherlv_5, grammarAccess.getMetricsAccess().getDescriptionKeyword_5_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:857:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:858:1: (lv_description_6_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:858:1: (lv_description_6_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:859:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetrics1721); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:875:3: ( (lv_detail_7_0= ruleDetail ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:876:1: (lv_detail_7_0= ruleDetail )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:876:1: (lv_detail_7_0= ruleDetail )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:877:3: lv_detail_7_0= ruleDetail
            {
             
            	        newCompositeNode(grammarAccess.getMetricsAccess().getDetailDetailParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDetail_in_ruleMetrics1748);
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

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleMetrics1760); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:905:1: entryRuleDetail returns [EObject current=null] : iv_ruleDetail= ruleDetail EOF ;
    public final EObject entryRuleDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetail = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:906:2: (iv_ruleDetail= ruleDetail EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:907:2: iv_ruleDetail= ruleDetail EOF
            {
             newCompositeNode(grammarAccess.getDetailRule()); 
            pushFollow(FOLLOW_ruleDetail_in_entryRuleDetail1796);
            iv_ruleDetail=ruleDetail();

            state._fsp--;

             current =iv_ruleDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetail1806); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:914:1: ruleDetail returns [EObject current=null] : (this_TimeMetric_0= ruleTimeMetric | this_DataMetric_1= ruleDataMetric ) ;
    public final EObject ruleDetail() throws RecognitionException {
        EObject current = null;

        EObject this_TimeMetric_0 = null;

        EObject this_DataMetric_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:917:28: ( (this_TimeMetric_0= ruleTimeMetric | this_DataMetric_1= ruleDataMetric ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:918:1: (this_TimeMetric_0= ruleTimeMetric | this_DataMetric_1= ruleDataMetric )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:918:1: (this_TimeMetric_0= ruleTimeMetric | this_DataMetric_1= ruleDataMetric )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29||LA28_0==31) ) {
                alt28=1;
            }
            else if ( (LA28_0==EOF||LA28_0==16||LA28_0==23||LA28_0==32||LA28_0==34) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:919:5: this_TimeMetric_0= ruleTimeMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getTimeMetricParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTimeMetric_in_ruleDetail1853);
                    this_TimeMetric_0=ruleTimeMetric();

                    state._fsp--;

                     
                            current = this_TimeMetric_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:929:5: this_DataMetric_1= ruleDataMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getDataMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataMetric_in_ruleDetail1880);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:945:1: entryRuleTimeMetric returns [EObject current=null] : iv_ruleTimeMetric= ruleTimeMetric EOF ;
    public final EObject entryRuleTimeMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:946:2: (iv_ruleTimeMetric= ruleTimeMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:947:2: iv_ruleTimeMetric= ruleTimeMetric EOF
            {
             newCompositeNode(grammarAccess.getTimeMetricRule()); 
            pushFollow(FOLLOW_ruleTimeMetric_in_entryRuleTimeMetric1915);
            iv_ruleTimeMetric=ruleTimeMetric();

            state._fsp--;

             current =iv_ruleTimeMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeMetric1925); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:954:1: ruleTimeMetric returns [EObject current=null] : (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric ) ;
    public final EObject ruleTimeMetric() throws RecognitionException {
        EObject current = null;

        EObject this_ActivityMetric_0 = null;

        EObject this_TaskMetric_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:957:28: ( (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:958:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:958:1: (this_ActivityMetric_0= ruleActivityMetric | this_TaskMetric_1= ruleTaskMetric )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            else if ( (LA29_0==31) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:959:5: this_ActivityMetric_0= ruleActivityMetric
                    {
                     
                            newCompositeNode(grammarAccess.getTimeMetricAccess().getActivityMetricParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivityMetric_in_ruleTimeMetric1972);
                    this_ActivityMetric_0=ruleActivityMetric();

                    state._fsp--;

                     
                            current = this_ActivityMetric_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:969:5: this_TaskMetric_1= ruleTaskMetric
                    {
                     
                            newCompositeNode(grammarAccess.getTimeMetricAccess().getTaskMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTaskMetric_in_ruleTimeMetric1999);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:985:1: entryRuleActivityMetric returns [EObject current=null] : iv_ruleActivityMetric= ruleActivityMetric EOF ;
    public final EObject entryRuleActivityMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:986:2: (iv_ruleActivityMetric= ruleActivityMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:987:2: iv_ruleActivityMetric= ruleActivityMetric EOF
            {
             newCompositeNode(grammarAccess.getActivityMetricRule()); 
            pushFollow(FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric2034);
            iv_ruleActivityMetric=ruleActivityMetric();

            state._fsp--;

             current =iv_ruleActivityMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityMetric2044); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:994:1: ruleActivityMetric returns [EObject current=null] : ( () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleActivityMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:997:28: ( ( () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:998:1: ( () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:998:1: ( () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:998:2: () (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:998:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:999:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActivityMetricAccess().getActivityMetricAction_0(),
                        current);
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1004:2: (otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1004:4: otherlv_1= 'activityBegin' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleActivityMetric2091); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityMetricAccess().getActivityBeginKeyword_1_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1008:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1009:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1009:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1010:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityMetricRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getActivityMetricAccess().getActivityBeginActivityCrossReference_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityMetric2114);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1023:3: (otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1023:5: otherlv_3= 'activityEnd' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleActivityMetric2128); 

                        	newLeafNode(otherlv_3, grammarAccess.getActivityMetricAccess().getActivityEndKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1027:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1028:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1028:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1029:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityMetricRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityMetricAccess().getActivityEndActivityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityMetric2151);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1050:1: entryRuleTaskMetric returns [EObject current=null] : iv_ruleTaskMetric= ruleTaskMetric EOF ;
    public final EObject entryRuleTaskMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1051:2: (iv_ruleTaskMetric= ruleTaskMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1052:2: iv_ruleTaskMetric= ruleTaskMetric EOF
            {
             newCompositeNode(grammarAccess.getTaskMetricRule()); 
            pushFollow(FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric2189);
            iv_ruleTaskMetric=ruleTaskMetric();

            state._fsp--;

             current =iv_ruleTaskMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskMetric2199); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1059:1: ruleTaskMetric returns [EObject current=null] : ( () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )* ) ;
    public final EObject ruleTaskMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1062:28: ( ( () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1063:1: ( () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1063:1: ( () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1063:2: () otherlv_1= 'tasks' ( ( ruleQualifiedName ) )*
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1063:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1064:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTaskMetricAccess().getTaskMetricAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTaskMetric2245); 

                	newLeafNode(otherlv_1, grammarAccess.getTaskMetricAccess().getTasksKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1073:1: ( ( ruleQualifiedName ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1074:1: ( ruleQualifiedName )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1074:1: ( ruleQualifiedName )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1075:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTaskMetricAccess().getTasksTaskCrossReference_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTaskMetric2268);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1096:1: entryRuleDataMetric returns [EObject current=null] : iv_ruleDataMetric= ruleDataMetric EOF ;
    public final EObject entryRuleDataMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1097:2: (iv_ruleDataMetric= ruleDataMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1098:2: iv_ruleDataMetric= ruleDataMetric EOF
            {
             newCompositeNode(grammarAccess.getDataMetricRule()); 
            pushFollow(FOLLOW_ruleDataMetric_in_entryRuleDataMetric2305);
            iv_ruleDataMetric=ruleDataMetric();

            state._fsp--;

             current =iv_ruleDataMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataMetric2315); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1105:1: ruleDataMetric returns [EObject current=null] : ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1108:28: ( ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1109:1: ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1109:1: ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1109:2: () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1109:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1110:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataMetricAccess().getDataMetricAction_0(),
                        current);
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1115:2: (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1115:4: otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDataMetric2362); 

                        	newLeafNode(otherlv_1, grammarAccess.getDataMetricAccess().getCollectedDataKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1119:1: ( (lv_collectedData_2_0= ruleCollectedData ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1120:1: (lv_collectedData_2_0= ruleCollectedData )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1120:1: (lv_collectedData_2_0= ruleCollectedData )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1121:3: lv_collectedData_2_0= ruleCollectedData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getCollectedDataCollectedDataParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCollectedData_in_ruleDataMetric2383);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleDataMetric2396); 

                        	newLeafNode(otherlv_3, grammarAccess.getDataMetricAccess().getColonKeyword_1_2());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1141:1: ( (lv_dataType_4_0= ruleDataType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1142:1: (lv_dataType_4_0= ruleDataType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1142:1: (lv_dataType_4_0= ruleDataType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1143:3: lv_dataType_4_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataMetricAccess().getDataTypeDataTypeEnumRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleDataMetric2417);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1159:4: (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1159:6: otherlv_5= 'artefact' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleDataMetric2432); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataMetricAccess().getArtefactKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1163:1: ( ( ruleQualifiedName ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1164:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1164:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1165:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDataMetricRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getArtefactsArtefactCrossReference_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataMetric2455);
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
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1178:5: (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1178:7: otherlv_7= 'quest' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleDataMetric2471); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataMetricAccess().getQuestKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1182:1: ( ( ruleQualifiedName ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1183:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1183:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1184:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDataMetricRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getQuestionnairesQuestionnaireCrossReference_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataMetric2494);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1205:1: entryRuleCollectedData returns [EObject current=null] : iv_ruleCollectedData= ruleCollectedData EOF ;
    public final EObject entryRuleCollectedData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectedData = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1206:2: (iv_ruleCollectedData= ruleCollectedData EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1207:2: iv_ruleCollectedData= ruleCollectedData EOF
            {
             newCompositeNode(grammarAccess.getCollectedDataRule()); 
            pushFollow(FOLLOW_ruleCollectedData_in_entryRuleCollectedData2533);
            iv_ruleCollectedData=ruleCollectedData();

            state._fsp--;

             current =iv_ruleCollectedData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectedData2543); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1214:1: ruleCollectedData returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCollectedData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1217:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1218:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1218:1: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1219:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1219:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1220:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectedData2584); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1244:1: entryRuleExperimentalPlan returns [EObject current=null] : iv_ruleExperimentalPlan= ruleExperimentalPlan EOF ;
    public final EObject entryRuleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentalPlan = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1245:2: (iv_ruleExperimentalPlan= ruleExperimentalPlan EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1246:2: iv_ruleExperimentalPlan= ruleExperimentalPlan EOF
            {
             newCompositeNode(grammarAccess.getExperimentalPlanRule()); 
            pushFollow(FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan2624);
            iv_ruleExperimentalPlan=ruleExperimentalPlan();

            state._fsp--;

             current =iv_ruleExperimentalPlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentalPlan2634); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1253:1: ruleExperimentalPlan returns [EObject current=null] : (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis analysis' otherlv_16= '=' ( (lv_Technique_17_0= ruleAnalysisTechiqueType ) )* otherlv_18= 'Internal Replication ' ( (lv_internalReplication_19_0= RULE_INT ) ) ( (lv_link_20_0= ruleLink ) )* otherlv_21= '}' ) ;
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_internalReplication_19_0=null;
        Token otherlv_21=null;
        EObject lv_goal_2_0 = null;

        EObject lv_hypotheses_6_0 = null;

        Enumerator lv_type_10_0 = null;

        EObject lv_parameter_12_0 = null;

        EObject lv_dependentVariable_13_0 = null;

        EObject lv_factor_14_0 = null;

        Enumerator lv_Technique_17_0 = null;

        EObject lv_link_20_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1256:28: ( (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis analysis' otherlv_16= '=' ( (lv_Technique_17_0= ruleAnalysisTechiqueType ) )* otherlv_18= 'Internal Replication ' ( (lv_internalReplication_19_0= RULE_INT ) ) ( (lv_link_20_0= ruleLink ) )* otherlv_21= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1257:1: (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis analysis' otherlv_16= '=' ( (lv_Technique_17_0= ruleAnalysisTechiqueType ) )* otherlv_18= 'Internal Replication ' ( (lv_internalReplication_19_0= RULE_INT ) ) ( (lv_link_20_0= ruleLink ) )* otherlv_21= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1257:1: (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis analysis' otherlv_16= '=' ( (lv_Technique_17_0= ruleAnalysisTechiqueType ) )* otherlv_18= 'Internal Replication ' ( (lv_internalReplication_19_0= RULE_INT ) ) ( (lv_link_20_0= ruleLink ) )* otherlv_21= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1257:3: otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'Hypotheses' otherlv_5= '{' ( (lv_hypotheses_6_0= ruleHypotheses ) )* otherlv_7= '}' otherlv_8= 'DesignOfExperiment' otherlv_9= '=' ( (lv_type_10_0= ruleDesignType ) ) otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) )* ( (lv_dependentVariable_13_0= ruleDependentVariable ) )* ( (lv_factor_14_0= ruleFactor ) )* otherlv_15= 'Statistical Analysis analysis' otherlv_16= '=' ( (lv_Technique_17_0= ruleAnalysisTechiqueType ) )* otherlv_18= 'Internal Replication ' ( (lv_internalReplication_19_0= RULE_INT ) ) ( (lv_link_20_0= ruleLink ) )* otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleExperimentalPlan2671); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentalPlanAccess().getGoalsKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalPlan2683); 

                	newLeafNode(otherlv_1, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1265:1: ( (lv_goal_2_0= ruleGoal ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1266:1: (lv_goal_2_0= ruleGoal )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1266:1: (lv_goal_2_0= ruleGoal )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1267:3: lv_goal_2_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getGoalGoalParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleExperimentalPlan2704);
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
            	    break loop38;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan2717); 

                	newLeafNode(otherlv_3, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleExperimentalPlan2729); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentalPlanAccess().getHypothesesKeyword_4());
                
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalPlan2741); 

                	newLeafNode(otherlv_5, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_5());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1295:1: ( (lv_hypotheses_6_0= ruleHypotheses ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1296:1: (lv_hypotheses_6_0= ruleHypotheses )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1296:1: (lv_hypotheses_6_0= ruleHypotheses )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1297:3: lv_hypotheses_6_0= ruleHypotheses
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getHypothesesHypothesesParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHypotheses_in_ruleExperimentalPlan2762);
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
            	    break loop39;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan2775); 

                	newLeafNode(otherlv_7, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleExperimentalPlan2787); 

                	newLeafNode(otherlv_8, grammarAccess.getExperimentalPlanAccess().getDesignOfExperimentKeyword_8());
                
            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleExperimentalPlan2799); 

                	newLeafNode(otherlv_9, grammarAccess.getExperimentalPlanAccess().getEqualsSignKeyword_9());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1325:1: ( (lv_type_10_0= ruleDesignType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1326:1: (lv_type_10_0= ruleDesignType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1326:1: (lv_type_10_0= ruleDesignType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1327:3: lv_type_10_0= ruleDesignType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignType_in_ruleExperimentalPlan2820);
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

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalPlan2832); 

                	newLeafNode(otherlv_11, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_11());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1347:1: ( (lv_parameter_12_0= ruleParameter ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==44) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1348:1: (lv_parameter_12_0= ruleParameter )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1348:1: (lv_parameter_12_0= ruleParameter )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1349:3: lv_parameter_12_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getParameterParameterParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleExperimentalPlan2853);
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
            	    break loop40;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1365:3: ( (lv_dependentVariable_13_0= ruleDependentVariable ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==45) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1366:1: (lv_dependentVariable_13_0= ruleDependentVariable )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1366:1: (lv_dependentVariable_13_0= ruleDependentVariable )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1367:3: lv_dependentVariable_13_0= ruleDependentVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getDependentVariableDependentVariableParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependentVariable_in_ruleExperimentalPlan2875);
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
            	    break loop41;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1383:3: ( (lv_factor_14_0= ruleFactor ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==46) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1384:1: (lv_factor_14_0= ruleFactor )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1384:1: (lv_factor_14_0= ruleFactor )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1385:3: lv_factor_14_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleExperimentalPlan2897);
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
            	    break loop42;
                }
            } while (true);

            otherlv_15=(Token)match(input,39,FOLLOW_39_in_ruleExperimentalPlan2910); 

                	newLeafNode(otherlv_15, grammarAccess.getExperimentalPlanAccess().getStatisticalAnalysisAnalysisKeyword_15());
                
            otherlv_16=(Token)match(input,38,FOLLOW_38_in_ruleExperimentalPlan2922); 

                	newLeafNode(otherlv_16, grammarAccess.getExperimentalPlanAccess().getEqualsSignKeyword_16());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1409:1: ( (lv_Technique_17_0= ruleAnalysisTechiqueType ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=75 && LA43_0<=85)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1410:1: (lv_Technique_17_0= ruleAnalysisTechiqueType )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1410:1: (lv_Technique_17_0= ruleAnalysisTechiqueType )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1411:3: lv_Technique_17_0= ruleAnalysisTechiqueType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTechniqueAnalysisTechiqueTypeEnumRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnalysisTechiqueType_in_ruleExperimentalPlan2943);
            	    lv_Technique_17_0=ruleAnalysisTechiqueType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Technique",
            	            		lv_Technique_17_0, 
            	            		"AnalysisTechiqueType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_18=(Token)match(input,40,FOLLOW_40_in_ruleExperimentalPlan2956); 

                	newLeafNode(otherlv_18, grammarAccess.getExperimentalPlanAccess().getInternalReplicationKeyword_18());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1431:1: ( (lv_internalReplication_19_0= RULE_INT ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1432:1: (lv_internalReplication_19_0= RULE_INT )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1432:1: (lv_internalReplication_19_0= RULE_INT )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1433:3: lv_internalReplication_19_0= RULE_INT
            {
            lv_internalReplication_19_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExperimentalPlan2973); 

            			newLeafNode(lv_internalReplication_19_0, grammarAccess.getExperimentalPlanAccess().getInternalReplicationINTTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentalPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"internalReplication",
                    		lv_internalReplication_19_0, 
                    		"INT");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1449:2: ( (lv_link_20_0= ruleLink ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==51) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1450:1: (lv_link_20_0= ruleLink )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1450:1: (lv_link_20_0= ruleLink )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1451:3: lv_link_20_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getLinkLinkParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleExperimentalPlan2999);
            	    lv_link_20_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"link",
            	            		lv_link_20_0, 
            	            		"Link");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan3012); 

                	newLeafNode(otherlv_21, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_21());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1479:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1480:2: (iv_ruleGoal= ruleGoal EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1481:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal3048);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal3058); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1488:1: ruleGoal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1491:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1492:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1492:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1492:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1492:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1493:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1493:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1494:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3100); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1510:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1511:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1511:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1512:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3122); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1536:1: entryRuleHypotheses returns [EObject current=null] : iv_ruleHypotheses= ruleHypotheses EOF ;
    public final EObject entryRuleHypotheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHypotheses = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1537:2: (iv_ruleHypotheses= ruleHypotheses EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1538:2: iv_ruleHypotheses= ruleHypotheses EOF
            {
             newCompositeNode(grammarAccess.getHypothesesRule()); 
            pushFollow(FOLLOW_ruleHypotheses_in_entryRuleHypotheses3163);
            iv_ruleHypotheses=ruleHypotheses();

            state._fsp--;

             current =iv_ruleHypotheses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHypotheses3173); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1545:1: ruleHypotheses returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1548:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1549:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1549:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1549:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleHypothesisType ) ) otherlv_3= 'from' ( ( ruleQualifiedName ) ) (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1549:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1550:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1550:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1551:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHypotheses3215); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1567:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1568:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1568:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1569:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHypotheses3237); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1585:2: ( (lv_type_2_0= ruleHypothesisType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1586:1: (lv_type_2_0= ruleHypothesisType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1586:1: (lv_type_2_0= ruleHypothesisType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1587:3: lv_type_2_0= ruleHypothesisType
            {
             
            	        newCompositeNode(grammarAccess.getHypothesesAccess().getTypeHypothesisTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleHypothesisType_in_ruleHypotheses3263);
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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleHypotheses3275); 

                	newLeafNode(otherlv_3, grammarAccess.getHypothesesAccess().getFromKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1607:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1608:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1608:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1609:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getHypothesesRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getHypothesesAccess().getFromGoalGoalCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleHypotheses3298);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1622:2: (otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==15) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1622:4: otherlv_5= '{' ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleHypotheses3311); 

                        	newLeafNode(otherlv_5, grammarAccess.getHypothesesAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1626:1: ( (lv_subhypotheses_6_0= ruleSubhypotheses ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1627:1: (lv_subhypotheses_6_0= ruleSubhypotheses )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1627:1: (lv_subhypotheses_6_0= ruleSubhypotheses )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1628:3: lv_subhypotheses_6_0= ruleSubhypotheses
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesesAccess().getSubhypothesesSubhypothesesParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubhypotheses_in_ruleHypotheses3332);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleHypotheses3345); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1656:1: entryRuleSubhypotheses returns [EObject current=null] : iv_ruleSubhypotheses= ruleSubhypotheses EOF ;
    public final EObject entryRuleSubhypotheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubhypotheses = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1657:2: (iv_ruleSubhypotheses= ruleSubhypotheses EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1658:2: iv_ruleSubhypotheses= ruleSubhypotheses EOF
            {
             newCompositeNode(grammarAccess.getSubhypothesesRule()); 
            pushFollow(FOLLOW_ruleSubhypotheses_in_entryRuleSubhypotheses3383);
            iv_ruleSubhypotheses=ruleSubhypotheses();

            state._fsp--;

             current =iv_ruleSubhypotheses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubhypotheses3393); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1665:1: ruleSubhypotheses returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' ) ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1668:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1669:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1669:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==RULE_ID) ) {
                    alt50=1;
                }
                else if ( (LA50_1==42) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1669:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1669:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1669:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleQualifiedName ) )* otherlv_4= ')' ( (lv_operator_5_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( ruleQualifiedName ) )* otherlv_9= ')'
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1669:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1670:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1670:1: (lv_name_0_0= RULE_ID )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1671:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubhypotheses3436); 

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

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1687:2: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1688:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1688:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1689:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getDependentVariableDependentVariableCrossReference_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3464);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleSubhypotheses3476); 

                        	newLeafNode(otherlv_2, grammarAccess.getSubhypothesesAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1706:1: ( ( ruleQualifiedName ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1707:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1707:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1708:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getLevelsLevelsCrossReference_0_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3499);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleSubhypotheses3512); 

                        	newLeafNode(otherlv_4, grammarAccess.getSubhypothesesAccess().getRightParenthesisKeyword_0_4());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1725:1: ( (lv_operator_5_0= ruleOperatorType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1726:1: (lv_operator_5_0= ruleOperatorType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1726:1: (lv_operator_5_0= ruleOperatorType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1727:3: lv_operator_5_0= ruleOperatorType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getOperatorOperatorTypeEnumRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperatorType_in_ruleSubhypotheses3533);
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

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1743:2: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1744:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1744:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1745:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getDependentVariableDependentVariableCrossReference_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3556);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleSubhypotheses3568); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubhypothesesAccess().getLeftParenthesisKeyword_0_7());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1762:1: ( ( ruleQualifiedName ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_ID) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1763:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1763:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1764:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getLevelsLevelsCrossReference_0_8_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3591);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleSubhypotheses3604); 

                        	newLeafNode(otherlv_9, grammarAccess.getSubhypothesesAccess().getRightParenthesisKeyword_0_9());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1782:6: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1782:6: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1782:7: ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_13_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_15= ')'
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1782:7: ( (lv_name_10_0= RULE_ID ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1783:1: (lv_name_10_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1783:1: (lv_name_10_0= RULE_ID )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1784:3: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubhypotheses3629); 

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

                    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleSubhypotheses3646); 

                        	newLeafNode(otherlv_11, grammarAccess.getSubhypothesesAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1804:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1805:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1805:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1806:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getDependentVariableDependentVariableCrossReference_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3669);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1819:2: ( (lv_relation_13_0= ruleRelationType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1820:1: (lv_relation_13_0= ruleRelationType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1820:1: (lv_relation_13_0= ruleRelationType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1821:3: lv_relation_13_0= ruleRelationType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getRelationRelationTypeEnumRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationType_in_ruleSubhypotheses3690);
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

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1837:2: ( ( ruleQualifiedName ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1838:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1838:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1839:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSubhypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSubhypothesesAccess().getFactorFactorCrossReference_1_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3713);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,43,FOLLOW_43_in_ruleSubhypotheses3726); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1864:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1865:2: (iv_ruleParameter= ruleParameter EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1866:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3763);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3773); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1873:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1876:28: ( (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1877:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1877:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1877:3: otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleParameter3810); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1881:1: ( (lv_variable_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1882:1: (lv_variable_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1882:1: (lv_variable_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1883:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3827); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleParameter3844); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1903:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1904:1: (lv_value_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1904:1: (lv_value_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1905:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter3861); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1929:1: entryRuleDependentVariable returns [EObject current=null] : iv_ruleDependentVariable= ruleDependentVariable EOF ;
    public final EObject entryRuleDependentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependentVariable = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1930:2: (iv_ruleDependentVariable= ruleDependentVariable EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1931:2: iv_ruleDependentVariable= ruleDependentVariable EOF
            {
             newCompositeNode(grammarAccess.getDependentVariableRule()); 
            pushFollow(FOLLOW_ruleDependentVariable_in_entryRuleDependentVariable3902);
            iv_ruleDependentVariable=ruleDependentVariable();

            state._fsp--;

             current =iv_ruleDependentVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependentVariable3912); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1938:1: ruleDependentVariable returns [EObject current=null] : (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* ) ;
    public final EObject ruleDependentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1941:28: ( (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1942:1: (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1942:1: (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1942:3: otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleDependentVariable3949); 

                	newLeafNode(otherlv_0, grammarAccess.getDependentVariableAccess().getDependentVariableKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1946:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1947:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1947:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1948:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependentVariable3966); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1964:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1965:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1965:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1966:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependentVariable3988); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1982:2: ( ( ruleQualifiedName ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1983:1: ( ruleQualifiedName )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1983:1: ( ruleQualifiedName )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1984:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependentVariableRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDependentVariableAccess().getMetricsMetricsCrossReference_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependentVariable4016);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2005:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2006:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2007:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor4053);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor4063); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2014:1: ruleFactor returns [EObject current=null] : (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2017:28: ( (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2018:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2018:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2018:3: otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleFactor4100); 

                	newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getFactorKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2022:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2023:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2023:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2024:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactor4117); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleFactor4134); 

                	newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getIsDesiredVariationKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2044:1: ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2045:1: ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2045:1: ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2046:1: (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2046:1: (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            else if ( (LA52_0==49) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2047:3: lv_isDesiredVariation_3_1= 'True'
                    {
                    lv_isDesiredVariation_3_1=(Token)match(input,48,FOLLOW_48_in_ruleFactor4154); 

                            newLeafNode(lv_isDesiredVariation_3_1, grammarAccess.getFactorAccess().getIsDesiredVariationTrueKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "isDesiredVariation", lv_isDesiredVariation_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2059:8: lv_isDesiredVariation_3_2= 'False'
                    {
                    lv_isDesiredVariation_3_2=(Token)match(input,49,FOLLOW_49_in_ruleFactor4183); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2074:2: (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==15) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2074:4: otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFactor4212); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2078:1: ( (lv_level_5_0= ruleLevels ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==50) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2079:1: (lv_level_5_0= ruleLevels )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2079:1: (lv_level_5_0= ruleLevels )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2080:3: lv_level_5_0= ruleLevels
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLevels_in_ruleFactor4233);
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFactor4246); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2108:1: entryRuleLevels returns [EObject current=null] : iv_ruleLevels= ruleLevels EOF ;
    public final EObject entryRuleLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevels = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2109:2: (iv_ruleLevels= ruleLevels EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2110:2: iv_ruleLevels= ruleLevels EOF
            {
             newCompositeNode(grammarAccess.getLevelsRule()); 
            pushFollow(FOLLOW_ruleLevels_in_entryRuleLevels4284);
            iv_ruleLevels=ruleLevels();

            state._fsp--;

             current =iv_ruleLevels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevels4294); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2117:1: ruleLevels returns [EObject current=null] : (otherlv_0= 'Level' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2120:28: ( (otherlv_0= 'Level' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2121:1: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2121:1: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2121:3: otherlv_0= 'Level' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleLevels4331); 

                	newLeafNode(otherlv_0, grammarAccess.getLevelsAccess().getLevelKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2125:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2126:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2126:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2127:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLevels4348); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLevelsAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLevelsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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


    // $ANTLR start "entryRuleLink"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2151:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2152:2: (iv_ruleLink= ruleLink EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2153:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink4389);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink4399); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2160:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) )* ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2163:28: ( (otherlv_0= 'Link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2164:1: (otherlv_0= 'Link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2164:1: (otherlv_0= 'Link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2164:3: otherlv_0= 'Link' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleLink4436); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2168:1: ( (otherlv_1= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2169:1: (otherlv_1= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2169:1: (otherlv_1= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2170:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink4456); 

            		newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getProcedureProcessCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleLink4468); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getToKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2185:1: ( ( ruleQualifiedName ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2186:1: ( ruleQualifiedName )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2186:1: ( ruleQualifiedName )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2187:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getTreatmentLevelsCrossReference_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink4491);
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleQuestionnaire"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2208:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2209:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2210:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire4528);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire4538); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2217:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2220:28: ( (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2221:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2221:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2221:3: otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleQuestionnaire4575); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2225:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2226:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2226:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2227:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire4592); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2243:2: (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==28) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2243:4: otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleQuestionnaire4610); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2247:1: ( (otherlv_3= RULE_ID ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_ID) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2248:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2248:1: (otherlv_3= RULE_ID )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2249:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQuestionnaireRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire4630); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getRelatesToProcessCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2260:5: (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==26) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2260:7: otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleQuestionnaire4646); 

                        	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getTypeKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2264:1: ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2265:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2265:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2266:3: lv_questionnaireType_5_0= ruleQuestionnaireType
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeQuestionnaireTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire4667);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleQuestionnaire4681); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2286:1: ( (lv_question_7_0= ruleQuestion ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2287:1: (lv_question_7_0= ruleQuestion )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2287:1: (lv_question_7_0= ruleQuestion )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2288:3: lv_question_7_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleQuestionnaire4702);
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
            	    break loop59;
                }
            } while (true);

            otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleQuestionnaire4715); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2316:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2317:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2318:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion4751);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion4761); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2325:1: ruleQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2328:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2329:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2329:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2329:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}'
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2329:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2330:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2330:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2331:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion4803); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleQuestion4820); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2351:1: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2351:3: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQuestion4833); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getDescriptionKeyword_2_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2355:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2356:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2356:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2357:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion4850); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2373:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2373:5: otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) )
            {
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleQuestion4869); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getTypeKeyword_3_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2377:1: ( (lv_type_5_0= ruleAnswerType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2378:1: (lv_type_5_0= ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2378:1: (lv_type_5_0= ruleAnswerType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2379:3: lv_type_5_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion4890);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2395:3: (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==54) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2395:5: otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleQuestion4904); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRequiredKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2399:1: ( (lv_req_7_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2400:1: (lv_req_7_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2400:1: (lv_req_7_0= RULE_INT )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2401:3: lv_req_7_0= RULE_INT
                    {
                    lv_req_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuestion4921); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2417:4: (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==55) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2417:6: otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    {
                    otherlv_8=(Token)match(input,55,FOLLOW_55_in_ruleQuestion4941); 

                        	newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2421:1: ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==56) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2422:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2422:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2423:3: lv_alternatives_9_0= ruleAlternatives
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAlternatives_in_ruleQuestion4962);
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
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleQuestion4977); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2451:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2452:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2453:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives5013);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives5023); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2460:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2463:28: ( (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2464:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2464:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2464:3: otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleAlternatives5060); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getOptionKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2468:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2469:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2469:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2470:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternatives5077); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2494:1: ruleArtefactType returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) ;
    public final Enumerator ruleArtefactType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2496:28: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2497:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2497:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt63=1;
                }
                break;
            case 58:
                {
                alt63=2;
                }
                break;
            case 59:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2497:2: (enumLiteral_0= 'input' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2497:2: (enumLiteral_0= 'input' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2497:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleArtefactType5132); 

                            current = grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2503:6: (enumLiteral_1= 'output' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2503:6: (enumLiteral_1= 'output' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2503:8: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleArtefactType5149); 

                            current = grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2509:6: (enumLiteral_2= 'inoutput' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2509:6: (enumLiteral_2= 'inoutput' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2509:8: enumLiteral_2= 'inoutput'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleArtefactType5166); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2519:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2521:28: ( ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2522:1: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2522:1: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==60) ) {
                alt64=1;
            }
            else if ( (LA64_0==61) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2522:2: (enumLiteral_0= 'number' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2522:2: (enumLiteral_0= 'number' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2522:4: enumLiteral_0= 'number'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleDataType5211); 

                            current = grammarAccess.getDataTypeAccess().getNumEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNumEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2528:6: (enumLiteral_1= 'text' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2528:6: (enumLiteral_1= 'text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2528:8: enumLiteral_1= 'text'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleDataType5228); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2538:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2540:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2541:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2541:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62) ) {
                alt65=1;
            }
            else if ( (LA65_0==63) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2541:2: (enumLiteral_0= '==' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2541:2: (enumLiteral_0= '==' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2541:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleRelationType5273); 

                            current = grammarAccess.getRelationTypeAccess().getIsRelatedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getIsRelatedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2547:6: (enumLiteral_1= '<>' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2547:6: (enumLiteral_1= '<>' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2547:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleRelationType5290); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2557:1: ruleOperatorType returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2559:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2560:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2560:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt66=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt66=1;
                }
                break;
            case 64:
                {
                alt66=2;
                }
                break;
            case 65:
                {
                alt66=3;
                }
                break;
            case 66:
                {
                alt66=4;
                }
                break;
            case 67:
                {
                alt66=5;
                }
                break;
            case 68:
                {
                alt66=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2560:2: (enumLiteral_0= '=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2560:2: (enumLiteral_0= '=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2560:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleOperatorType5335); 

                            current = grammarAccess.getOperatorTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2566:6: (enumLiteral_1= '!=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2566:6: (enumLiteral_1= '!=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2566:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleOperatorType5352); 

                            current = grammarAccess.getOperatorTypeAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorTypeAccess().getDifferentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2572:6: (enumLiteral_2= '>' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2572:6: (enumLiteral_2= '>' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2572:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleOperatorType5369); 

                            current = grammarAccess.getOperatorTypeAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorTypeAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2578:6: (enumLiteral_3= '<' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2578:6: (enumLiteral_3= '<' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2578:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleOperatorType5386); 

                            current = grammarAccess.getOperatorTypeAccess().getLessEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorTypeAccess().getLessEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2584:6: (enumLiteral_4= '>=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2584:6: (enumLiteral_4= '>=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2584:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleOperatorType5403); 

                            current = grammarAccess.getOperatorTypeAccess().getMoreEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorTypeAccess().getMoreEqualEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2590:6: (enumLiteral_5= '<=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2590:6: (enumLiteral_5= '<=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2590:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_68_in_ruleOperatorType5420); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2600:1: ruleHypothesisType returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'alternative' ) ) ;
    public final Enumerator ruleHypothesisType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2602:28: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'alternative' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2603:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'alternative' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2603:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'alternative' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==69) ) {
                alt67=1;
            }
            else if ( (LA67_0==70) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2603:2: (enumLiteral_0= 'null' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2603:2: (enumLiteral_0= 'null' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2603:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleHypothesisType5465); 

                            current = grammarAccess.getHypothesisTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHypothesisTypeAccess().getNullEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2609:6: (enumLiteral_1= 'alternative' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2609:6: (enumLiteral_1= 'alternative' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2609:8: enumLiteral_1= 'alternative'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleHypothesisType5482); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2619:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2621:28: ( ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2622:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2622:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt68=1;
                }
                break;
            case 72:
                {
                alt68=2;
                }
                break;
            case 73:
                {
                alt68=3;
                }
                break;
            case 74:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2622:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2622:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2622:4: enumLiteral_0= 'CRD - Completely Randomized Design'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_71_in_ruleDesignType5527); 

                            current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2628:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2628:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2628:8: enumLiteral_1= 'RCBD - Randomized Complete Block Design'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleDesignType5544); 

                            current = grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2634:6: (enumLiteral_2= 'LS - Latin Square' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2634:6: (enumLiteral_2= 'LS - Latin Square' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2634:8: enumLiteral_2= 'LS - Latin Square'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_73_in_ruleDesignType5561); 

                            current = grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2640:6: (enumLiteral_3= 'Other' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2640:6: (enumLiteral_3= 'Other' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2640:8: enumLiteral_3= 'Other'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_74_in_ruleDesignType5578); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2650:1: ruleAnalysisTechiqueType returns [Enumerator current=null] : ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'Mann-Whitney' ) | (enumLiteral_5= 'Paired t-test' ) | (enumLiteral_6= 'Wilcoxon' ) | (enumLiteral_7= 'Sign test' ) | (enumLiteral_8= 'ANOVA' ) | (enumLiteral_9= 'Kruskal-Wallis' ) | (enumLiteral_10= 'Others' ) ) ;
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

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2652:28: ( ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'Mann-Whitney' ) | (enumLiteral_5= 'Paired t-test' ) | (enumLiteral_6= 'Wilcoxon' ) | (enumLiteral_7= 'Sign test' ) | (enumLiteral_8= 'ANOVA' ) | (enumLiteral_9= 'Kruskal-Wallis' ) | (enumLiteral_10= 'Others' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2653:1: ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'Mann-Whitney' ) | (enumLiteral_5= 'Paired t-test' ) | (enumLiteral_6= 'Wilcoxon' ) | (enumLiteral_7= 'Sign test' ) | (enumLiteral_8= 'ANOVA' ) | (enumLiteral_9= 'Kruskal-Wallis' ) | (enumLiteral_10= 'Others' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2653:1: ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'Mann-Whitney' ) | (enumLiteral_5= 'Paired t-test' ) | (enumLiteral_6= 'Wilcoxon' ) | (enumLiteral_7= 'Sign test' ) | (enumLiteral_8= 'ANOVA' ) | (enumLiteral_9= 'Kruskal-Wallis' ) | (enumLiteral_10= 'Others' ) )
            int alt69=11;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt69=1;
                }
                break;
            case 76:
                {
                alt69=2;
                }
                break;
            case 77:
                {
                alt69=3;
                }
                break;
            case 78:
                {
                alt69=4;
                }
                break;
            case 79:
                {
                alt69=5;
                }
                break;
            case 80:
                {
                alt69=6;
                }
                break;
            case 81:
                {
                alt69=7;
                }
                break;
            case 82:
                {
                alt69=8;
                }
                break;
            case 83:
                {
                alt69=9;
                }
                break;
            case 84:
                {
                alt69=10;
                }
                break;
            case 85:
                {
                alt69=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2653:2: (enumLiteral_0= 'Chi-2' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2653:2: (enumLiteral_0= 'Chi-2' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2653:4: enumLiteral_0= 'Chi-2'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleAnalysisTechiqueType5623); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getChi2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnalysisTechiqueTypeAccess().getChi2EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2659:6: (enumLiteral_1= 'Binomial Test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2659:6: (enumLiteral_1= 'Binomial Test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2659:8: enumLiteral_1= 'Binomial Test'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleAnalysisTechiqueType5640); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getBinomialTestEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnalysisTechiqueTypeAccess().getBinomialTestEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2665:6: (enumLiteral_2= 't-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2665:6: (enumLiteral_2= 't-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2665:8: enumLiteral_2= 't-test'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleAnalysisTechiqueType5657); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getTTestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnalysisTechiqueTypeAccess().getTTestEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2671:6: (enumLiteral_3= 'F-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2671:6: (enumLiteral_3= 'F-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2671:8: enumLiteral_3= 'F-test'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleAnalysisTechiqueType5674); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getFTestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnalysisTechiqueTypeAccess().getFTestEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2677:6: (enumLiteral_4= 'Mann-Whitney' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2677:6: (enumLiteral_4= 'Mann-Whitney' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2677:8: enumLiteral_4= 'Mann-Whitney'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_79_in_ruleAnalysisTechiqueType5691); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getMannWhitneyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnalysisTechiqueTypeAccess().getMannWhitneyEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2683:6: (enumLiteral_5= 'Paired t-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2683:6: (enumLiteral_5= 'Paired t-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2683:8: enumLiteral_5= 'Paired t-test'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_80_in_ruleAnalysisTechiqueType5708); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getPairedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnalysisTechiqueTypeAccess().getPairedEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2689:6: (enumLiteral_6= 'Wilcoxon' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2689:6: (enumLiteral_6= 'Wilcoxon' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2689:8: enumLiteral_6= 'Wilcoxon'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_81_in_ruleAnalysisTechiqueType5725); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getWilcoxonEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getAnalysisTechiqueTypeAccess().getWilcoxonEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2695:6: (enumLiteral_7= 'Sign test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2695:6: (enumLiteral_7= 'Sign test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2695:8: enumLiteral_7= 'Sign test'
                    {
                    enumLiteral_7=(Token)match(input,82,FOLLOW_82_in_ruleAnalysisTechiqueType5742); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getSignTestEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getAnalysisTechiqueTypeAccess().getSignTestEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2701:6: (enumLiteral_8= 'ANOVA' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2701:6: (enumLiteral_8= 'ANOVA' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2701:8: enumLiteral_8= 'ANOVA'
                    {
                    enumLiteral_8=(Token)match(input,83,FOLLOW_83_in_ruleAnalysisTechiqueType5759); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getAnovaEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getAnalysisTechiqueTypeAccess().getAnovaEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2707:6: (enumLiteral_9= 'Kruskal-Wallis' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2707:6: (enumLiteral_9= 'Kruskal-Wallis' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2707:8: enumLiteral_9= 'Kruskal-Wallis'
                    {
                    enumLiteral_9=(Token)match(input,84,FOLLOW_84_in_ruleAnalysisTechiqueType5776); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getKruskalWallisEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getAnalysisTechiqueTypeAccess().getKruskalWallisEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2713:6: (enumLiteral_10= 'Others' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2713:6: (enumLiteral_10= 'Others' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2713:8: enumLiteral_10= 'Others'
                    {
                    enumLiteral_10=(Token)match(input,85,FOLLOW_85_in_ruleAnalysisTechiqueType5793); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getOthersEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getAnalysisTechiqueTypeAccess().getOthersEnumLiteralDeclaration_10()); 
                        

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2723:1: ruleQuestionnaireType returns [Enumerator current=null] : ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Pos' ) ) ;
    public final Enumerator ruleQuestionnaireType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2725:28: ( ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Pos' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2726:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Pos' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2726:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Pos' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==86) ) {
                alt70=1;
            }
            else if ( (LA70_0==87) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2726:2: (enumLiteral_0= 'Pre' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2726:2: (enumLiteral_0= 'Pre' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2726:4: enumLiteral_0= 'Pre'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleQuestionnaireType5838); 

                            current = grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2732:6: (enumLiteral_1= 'Pos' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2732:6: (enumLiteral_1= 'Pos' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2732:8: enumLiteral_1= 'Pos'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleQuestionnaireType5855); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2742:1: ruleAnswerType returns [Enumerator current=null] : ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2744:28: ( ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2745:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2745:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'ComboBox' ) | (enumLiteral_4= 'CheckBoxes' ) | (enumLiteral_5= 'Scale' ) | (enumLiteral_6= 'Grid' ) )
            int alt71=7;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt71=1;
                }
                break;
            case 89:
                {
                alt71=2;
                }
                break;
            case 90:
                {
                alt71=3;
                }
                break;
            case 91:
                {
                alt71=4;
                }
                break;
            case 92:
                {
                alt71=5;
                }
                break;
            case 93:
                {
                alt71=6;
                }
                break;
            case 94:
                {
                alt71=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2745:2: (enumLiteral_0= 'Text' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2745:2: (enumLiteral_0= 'Text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2745:4: enumLiteral_0= 'Text'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleAnswerType5900); 

                            current = grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2751:6: (enumLiteral_1= 'ParagraphText' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2751:6: (enumLiteral_1= 'ParagraphText' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2751:8: enumLiteral_1= 'ParagraphText'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleAnswerType5917); 

                            current = grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2757:6: (enumLiteral_2= 'MultipleChoice' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2757:6: (enumLiteral_2= 'MultipleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2757:8: enumLiteral_2= 'MultipleChoice'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleAnswerType5934); 

                            current = grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2763:6: (enumLiteral_3= 'ComboBox' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2763:6: (enumLiteral_3= 'ComboBox' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2763:8: enumLiteral_3= 'ComboBox'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_91_in_ruleAnswerType5951); 

                            current = grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnswerTypeAccess().getComboBoxEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2769:6: (enumLiteral_4= 'CheckBoxes' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2769:6: (enumLiteral_4= 'CheckBoxes' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2769:8: enumLiteral_4= 'CheckBoxes'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_92_in_ruleAnswerType5968); 

                            current = grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnswerTypeAccess().getCheckBoxesEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2775:6: (enumLiteral_5= 'Scale' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2775:6: (enumLiteral_5= 'Scale' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2775:8: enumLiteral_5= 'Scale'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_93_in_ruleAnswerType5985); 

                            current = grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2781:6: (enumLiteral_6= 'Grid' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2781:6: (enumLiteral_6= 'Grid' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2781:8: enumLiteral_6= 'Grid'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_94_in_ruleAnswerType6002); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentElement230 = new BitSet(new long[]{0x0000000008007002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleExperimentElement256 = new BitSet(new long[]{0x0000000008007002L});
    public static final BitSet FOLLOW_ruleMetrics_in_ruleExperimentElement278 = new BitSet(new long[]{0x0000000008003002L});
    public static final BitSet FOLLOW_12_in_ruleExperimentElement292 = new BitSet(new long[]{0x0000000800002002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement313 = new BitSet(new long[]{0x0000000800002002L});
    public static final BitSet FOLLOW_13_in_ruleExperimentElement329 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_ruleExperimentElement350 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProcess436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcess470 = new BitSet(new long[]{0x0000000002050000L});
    public static final BitSet FOLLOW_ruleRole_in_ruleProcess491 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleProcess513 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleProcess526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName614 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName648 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleActivity742 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity759 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActivity776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity793 = new BitSet(new long[]{0x0000000002F08002L});
    public static final BitSet FOLLOW_20_in_ruleActivity811 = new BitSet(new long[]{0x0000000002E08022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity834 = new BitSet(new long[]{0x0000000002E08022L});
    public static final BitSet FOLLOW_ruleRole_in_ruleActivity858 = new BitSet(new long[]{0x0000000000E08002L});
    public static final BitSet FOLLOW_21_in_ruleActivity872 = new BitSet(new long[]{0x0000000000C08022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity895 = new BitSet(new long[]{0x0000000000C08022L});
    public static final BitSet FOLLOW_22_in_ruleActivity911 = new BitSet(new long[]{0x0000000000808022L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleActivity932 = new BitSet(new long[]{0x0000000000808022L});
    public static final BitSet FOLLOW_23_in_ruleActivity948 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity971 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_15_in_ruleActivity987 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleActivity1008 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_16_in_ruleActivity1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask1059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTask1106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1123 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask1157 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_21_in_ruleTask1175 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask1198 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_22_in_ruleTask1214 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleTask1235 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_23_in_ruleTask1251 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask1274 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRole1360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRole1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefact_in_entryRuleArtefact1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefact1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArtefact1470 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleArtefact1487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefact1504 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleArtefact1521 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_ruleArtefactType_in_ruleArtefact1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetrics_in_entryRuleMetrics1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetrics1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMetrics1625 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetrics1642 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMetrics1659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetrics1679 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetrics1691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetrics1704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetrics1721 = new BitSet(new long[]{0x00000005A0800000L});
    public static final BitSet FOLLOW_ruleDetail_in_ruleMetrics1748 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMetrics1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetail_in_entryRuleDetail1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetail1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeMetric_in_ruleDetail1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataMetric_in_ruleDetail1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeMetric_in_entryRuleTimeMetric1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeMetric1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_ruleTimeMetric1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_ruleTimeMetric1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityMetric_in_entryRuleActivityMetric2034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityMetric2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleActivityMetric2091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityMetric2114 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleActivityMetric2128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityMetric2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric2189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskMetric2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTaskMetric2245 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTaskMetric2268 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleDataMetric_in_entryRuleDataMetric2305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataMetric2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataMetric2362 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_ruleCollectedData_in_ruleDataMetric2383 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_33_in_ruleDataMetric2396 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataMetric2417 = new BitSet(new long[]{0x0000000400800002L});
    public static final BitSet FOLLOW_34_in_ruleDataMetric2432 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataMetric2455 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_23_in_ruleDataMetric2471 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataMetric2494 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleCollectedData_in_entryRuleCollectedData2533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectedData2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectedData2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan2624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentalPlan2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExperimentalPlan2671 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExperimentalPlan2683 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleExperimentalPlan2704 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan2717 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExperimentalPlan2729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExperimentalPlan2741 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleHypotheses_in_ruleExperimentalPlan2762 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan2775 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleExperimentalPlan2787 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExperimentalPlan2799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleExperimentalPlan2820 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExperimentalPlan2832 = new BitSet(new long[]{0x0000708000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExperimentalPlan2853 = new BitSet(new long[]{0x0000708000000000L});
    public static final BitSet FOLLOW_ruleDependentVariable_in_ruleExperimentalPlan2875 = new BitSet(new long[]{0x0000608000000000L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExperimentalPlan2897 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_39_in_ruleExperimentalPlan2910 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExperimentalPlan2922 = new BitSet(new long[]{0x0000010000000000L,0x00000000003FF800L});
    public static final BitSet FOLLOW_ruleAnalysisTechiqueType_in_ruleExperimentalPlan2943 = new BitSet(new long[]{0x0000010000000000L,0x00000000003FF800L});
    public static final BitSet FOLLOW_40_in_ruleExperimentalPlan2956 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExperimentalPlan2973 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_ruleLink_in_ruleExperimentalPlan2999 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal3048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypotheses_in_entryRuleHypotheses3163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHypotheses3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHypotheses3215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHypotheses3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleHypothesisType_in_ruleHypotheses3263 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleHypotheses3275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHypotheses3298 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleHypotheses3311 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleSubhypotheses_in_ruleHypotheses3332 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleHypotheses3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubhypotheses_in_entryRuleSubhypotheses3383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubhypotheses3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubhypotheses3436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3464 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSubhypotheses3476 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3499 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_43_in_ruleSubhypotheses3512 = new BitSet(new long[]{0x0000004000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleOperatorType_in_ruleSubhypotheses3533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3556 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSubhypotheses3568 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3591 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_43_in_ruleSubhypotheses3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubhypotheses3629 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSubhypotheses3646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3669 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleSubhypotheses3690 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubhypotheses3713 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_43_in_ruleSubhypotheses3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleParameter3810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3827 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleParameter3844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependentVariable_in_entryRuleDependentVariable3902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependentVariable3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDependentVariable3949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependentVariable3966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependentVariable3988 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependentVariable4016 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor4053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFactor4100 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactor4117 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleFactor4134 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_ruleFactor4154 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_49_in_ruleFactor4183 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFactor4212 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleFactor4233 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFactor4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevels_in_entryRuleLevels4284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevels4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLevels4331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLevels4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink4389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLink4436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink4456 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLink4468 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink4491 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire4528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleQuestionnaire4575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire4592 = new BitSet(new long[]{0x0000000014008000L});
    public static final BitSet FOLLOW_28_in_ruleQuestionnaire4610 = new BitSet(new long[]{0x0000000004008020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire4630 = new BitSet(new long[]{0x0000000004008020L});
    public static final BitSet FOLLOW_26_in_ruleQuestionnaire4646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire4667 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuestionnaire4681 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionnaire4702 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_53_in_ruleQuestionnaire4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion4751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion4803 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuestion4820 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuestion4833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion4850 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleQuestion4869 = new BitSet(new long[]{0x0000000000000000L,0x000000007F000000L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion4890 = new BitSet(new long[]{0x00C0000000010000L});
    public static final BitSet FOLLOW_54_in_ruleQuestion4904 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuestion4921 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_55_in_ruleQuestion4941 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleQuestion4962 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestion4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives5013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAlternatives5060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternatives5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleArtefactType5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleArtefactType5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleArtefactType5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDataType5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDataType5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRelationType5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRelationType5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperatorType5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOperatorType5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperatorType5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperatorType5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperatorType5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperatorType5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleHypothesisType5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleHypothesisType5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDesignType5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDesignType5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDesignType5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDesignType5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAnalysisTechiqueType5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAnalysisTechiqueType5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAnalysisTechiqueType5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAnalysisTechiqueType5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAnalysisTechiqueType5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAnalysisTechiqueType5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAnalysisTechiqueType5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAnalysisTechiqueType5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAnalysisTechiqueType5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAnalysisTechiqueType5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAnalysisTechiqueType5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleQuestionnaireType5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleQuestionnaireType5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAnswerType5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAnswerType5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleAnswerType5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAnswerType5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleAnswerType5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleAnswerType5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleAnswerType6002 = new BitSet(new long[]{0x0000000000000002L});

}