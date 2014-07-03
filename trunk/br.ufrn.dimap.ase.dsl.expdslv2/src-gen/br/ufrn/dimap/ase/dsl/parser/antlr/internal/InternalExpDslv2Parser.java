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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Experiment'", "'Experimental Plan'", "'Questionnaires'", "'.'", "'Goals'", "'{'", "'}'", "'DesignOfExperiment'", "'='", "'Statistical Analysis Technique'", "':'", "'Internal Replication '", "'('", "')'", "'Parameter'", "'Dependent Variable'", "'Factor'", "'isDesiredVariation'", "'True'", "'False'", "'Process'", "'to'", "'Role'", "'Task'", "'description'", "'var'", "'artefacts'", "'quest'", "'type'", "'Metric'", "'relates'", "'taskBegin'", "'taskEnd'", "'collectedData'", "'artefact'", "'Questionnaire'", "'};'", "'required'", "'Alternatives'", "'Option'", "'=='", "'<>'", "'!='", "'>'", "'<'", "'>='", "'<='", "'null_'", "'alternative'", "'CRD - Completely Randomized Design'", "'RCBD - Randomized Complete Block Design'", "'LS - Latin Square'", "'Other'", "'Chi-2'", "'Binomial Test'", "'t-test'", "'F-test'", "'McNemar Test'", "'Mann-Whitney'", "'Paired t-test'", "'Wilcoxon'", "'Sign test'", "'ANOVA'", "'Kruskal-Wallis'", "'Others'", "'Participant'", "'Researcher'", "'input'", "'output'", "'inoutput'", "'number'", "'text'", "'Pre'", "'Post'", "'Text'", "'ParagraphText'", "'MultipleChoice'", "'SingleChoice'", "'Scale'", "'Grid'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
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
    public static final int T__90=90;
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
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:116:1: ruleExperimentElement returns [EObject current=null] : (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Experimental Plan' ( (lv_experiments_3_0= ruleExperimentalPlan ) )* ) ( (lv_process_4_0= ruleProcess ) )* ( (lv_metrics_5_0= ruleMetrics ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) ;
    public final EObject ruleExperimentElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_experiments_3_0 = null;

        EObject lv_process_4_0 = null;

        EObject lv_metrics_5_0 = null;

        EObject lv_questionnaire_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:119:28: ( (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Experimental Plan' ( (lv_experiments_3_0= ruleExperimentalPlan ) )* ) ( (lv_process_4_0= ruleProcess ) )* ( (lv_metrics_5_0= ruleMetrics ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Experimental Plan' ( (lv_experiments_3_0= ruleExperimentalPlan ) )* ) ( (lv_process_4_0= ruleProcess ) )* ( (lv_metrics_5_0= ruleMetrics ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Experimental Plan' ( (lv_experiments_3_0= ruleExperimentalPlan ) )* ) ( (lv_process_4_0= ruleProcess ) )* ( (lv_metrics_5_0= ruleMetrics ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:120:3: otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Experimental Plan' ( (lv_experiments_3_0= ruleExperimentalPlan ) )* ) ( (lv_process_4_0= ruleProcess ) )* ( (lv_metrics_5_0= ruleMetrics ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:142:2: (otherlv_2= 'Experimental Plan' ( (lv_experiments_3_0= ruleExperimentalPlan ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:142:4: otherlv_2= 'Experimental Plan' ( (lv_experiments_3_0= ruleExperimentalPlan ) )*
            {
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExperimentElement248); 

                	newLeafNode(otherlv_2, grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_2_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:146:1: ( (lv_experiments_3_0= ruleExperimentalPlan ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:147:1: (lv_experiments_3_0= ruleExperimentalPlan )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:147:1: (lv_experiments_3_0= ruleExperimentalPlan )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:148:3: lv_experiments_3_0= ruleExperimentalPlan
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getExperimentsExperimentalPlanParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement269);
            	    lv_experiments_3_0=ruleExperimentalPlan();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"experiments",
            	            		lv_experiments_3_0, 
            	            		"ExperimentalPlan");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:164:4: ( (lv_process_4_0= ruleProcess ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:165:1: (lv_process_4_0= ruleProcess )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:165:1: (lv_process_4_0= ruleProcess )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:166:3: lv_process_4_0= ruleProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getProcessProcessParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcess_in_ruleExperimentElement292);
            	    lv_process_4_0=ruleProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"process",
            	            		lv_process_4_0, 
            	            		"Process");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:182:3: ( (lv_metrics_5_0= ruleMetrics ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:183:1: (lv_metrics_5_0= ruleMetrics )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:183:1: (lv_metrics_5_0= ruleMetrics )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:184:3: lv_metrics_5_0= ruleMetrics
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getMetricsMetricsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetrics_in_ruleExperimentElement314);
            	    lv_metrics_5_0=ruleMetrics();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
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
            	    break loop4;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:200:3: (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:200:5: otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleExperimentElement328); 

                        	newLeafNode(otherlv_6, grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:204:1: ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==46) ) {
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:230:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:231:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:232:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName389);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName400); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:239:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:242:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:243:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName440); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:250:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:251:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName459); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName474); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExperimentalPlan"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:271:1: entryRuleExperimentalPlan returns [EObject current=null] : iv_ruleExperimentalPlan= ruleExperimentalPlan EOF ;
    public final EObject entryRuleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentalPlan = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:272:2: (iv_ruleExperimentalPlan= ruleExperimentalPlan EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:273:2: iv_ruleExperimentalPlan= ruleExperimentalPlan EOF
            {
             newCompositeNode(grammarAccess.getExperimentalPlanRule()); 
            pushFollow(FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan521);
            iv_ruleExperimentalPlan=ruleExperimentalPlan();

            state._fsp--;

             current =iv_ruleExperimentalPlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentalPlan531); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:280:1: ruleExperimentalPlan returns [EObject current=null] : (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'DesignOfExperiment' otherlv_5= '=' ( (lv_type_6_0= ruleDesignType ) ) otherlv_7= '{' ( (lv_parameter_8_0= ruleParameter ) )* ( (lv_dependentVariable_9_0= ruleDependentVariable ) )* ( (lv_factor_10_0= ruleFactor ) )* otherlv_11= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_13= ':' ( (lv_Technique_14_0= ruleAnalysisTechiqueType ) )* )* otherlv_15= 'Internal Replication ' ( (lv_internalReplication_16_0= RULE_INT ) ) otherlv_17= '}' ) ;
    public final EObject ruleExperimentalPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_internalReplication_16_0=null;
        Token otherlv_17=null;
        EObject lv_goal_2_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_parameter_8_0 = null;

        EObject lv_dependentVariable_9_0 = null;

        EObject lv_factor_10_0 = null;

        Enumerator lv_Technique_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:283:28: ( (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'DesignOfExperiment' otherlv_5= '=' ( (lv_type_6_0= ruleDesignType ) ) otherlv_7= '{' ( (lv_parameter_8_0= ruleParameter ) )* ( (lv_dependentVariable_9_0= ruleDependentVariable ) )* ( (lv_factor_10_0= ruleFactor ) )* otherlv_11= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_13= ':' ( (lv_Technique_14_0= ruleAnalysisTechiqueType ) )* )* otherlv_15= 'Internal Replication ' ( (lv_internalReplication_16_0= RULE_INT ) ) otherlv_17= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:284:1: (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'DesignOfExperiment' otherlv_5= '=' ( (lv_type_6_0= ruleDesignType ) ) otherlv_7= '{' ( (lv_parameter_8_0= ruleParameter ) )* ( (lv_dependentVariable_9_0= ruleDependentVariable ) )* ( (lv_factor_10_0= ruleFactor ) )* otherlv_11= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_13= ':' ( (lv_Technique_14_0= ruleAnalysisTechiqueType ) )* )* otherlv_15= 'Internal Replication ' ( (lv_internalReplication_16_0= RULE_INT ) ) otherlv_17= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:284:1: (otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'DesignOfExperiment' otherlv_5= '=' ( (lv_type_6_0= ruleDesignType ) ) otherlv_7= '{' ( (lv_parameter_8_0= ruleParameter ) )* ( (lv_dependentVariable_9_0= ruleDependentVariable ) )* ( (lv_factor_10_0= ruleFactor ) )* otherlv_11= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_13= ':' ( (lv_Technique_14_0= ruleAnalysisTechiqueType ) )* )* otherlv_15= 'Internal Replication ' ( (lv_internalReplication_16_0= RULE_INT ) ) otherlv_17= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:284:3: otherlv_0= 'Goals' otherlv_1= '{' ( (lv_goal_2_0= ruleGoal ) )* otherlv_3= '}' otherlv_4= 'DesignOfExperiment' otherlv_5= '=' ( (lv_type_6_0= ruleDesignType ) ) otherlv_7= '{' ( (lv_parameter_8_0= ruleParameter ) )* ( (lv_dependentVariable_9_0= ruleDependentVariable ) )* ( (lv_factor_10_0= ruleFactor ) )* otherlv_11= 'Statistical Analysis Technique' ( ( ( ruleQualifiedName ) )* otherlv_13= ':' ( (lv_Technique_14_0= ruleAnalysisTechiqueType ) )* )* otherlv_15= 'Internal Replication ' ( (lv_internalReplication_16_0= RULE_INT ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalPlan568); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentalPlanAccess().getGoalsKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan580); 

                	newLeafNode(otherlv_1, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:292:1: ( (lv_goal_2_0= ruleGoal ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:293:1: (lv_goal_2_0= ruleGoal )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:293:1: (lv_goal_2_0= ruleGoal )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:294:3: lv_goal_2_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getGoalGoalParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleExperimentalPlan601);
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
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalPlan614); 

                	newLeafNode(otherlv_3, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleExperimentalPlan626); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentalPlanAccess().getDesignOfExperimentKeyword_4());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleExperimentalPlan638); 

                	newLeafNode(otherlv_5, grammarAccess.getExperimentalPlanAccess().getEqualsSignKeyword_5());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:322:1: ( (lv_type_6_0= ruleDesignType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:323:1: (lv_type_6_0= ruleDesignType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:323:1: (lv_type_6_0= ruleDesignType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:324:3: lv_type_6_0= ruleDesignType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignType_in_ruleExperimentalPlan659);
            lv_type_6_0=ruleDesignType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"DesignType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalPlan671); 

                	newLeafNode(otherlv_7, grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_7());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:344:1: ( (lv_parameter_8_0= ruleParameter ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:345:1: (lv_parameter_8_0= ruleParameter )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:345:1: (lv_parameter_8_0= ruleParameter )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:346:3: lv_parameter_8_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getParameterParameterParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleExperimentalPlan692);
            	    lv_parameter_8_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameter",
            	            		lv_parameter_8_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:362:3: ( (lv_dependentVariable_9_0= ruleDependentVariable ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:363:1: (lv_dependentVariable_9_0= ruleDependentVariable )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:363:1: (lv_dependentVariable_9_0= ruleDependentVariable )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:364:3: lv_dependentVariable_9_0= ruleDependentVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getDependentVariableDependentVariableParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependentVariable_in_ruleExperimentalPlan714);
            	    lv_dependentVariable_9_0=ruleDependentVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependentVariable",
            	            		lv_dependentVariable_9_0, 
            	            		"DependentVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:380:3: ( (lv_factor_10_0= ruleFactor ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:381:1: (lv_factor_10_0= ruleFactor )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:381:1: (lv_factor_10_0= ruleFactor )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:382:3: lv_factor_10_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleExperimentalPlan736);
            	    lv_factor_10_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factor",
            	            		lv_factor_10_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleExperimentalPlan749); 

                	newLeafNode(otherlv_11, grammarAccess.getExperimentalPlanAccess().getStatisticalAnalysisTechniqueKeyword_11());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:402:1: ( ( ( ruleQualifiedName ) )* otherlv_13= ':' ( (lv_Technique_14_0= ruleAnalysisTechiqueType ) )* )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:402:2: ( ( ruleQualifiedName ) )* otherlv_13= ':' ( (lv_Technique_14_0= ruleAnalysisTechiqueType ) )*
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:402:2: ( ( ruleQualifiedName ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==RULE_ID) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:403:1: ( ruleQualifiedName )
            	    	    {
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:403:1: ( ruleQualifiedName )
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:404:3: ruleQualifiedName
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getExperimentalPlanRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTohypothesesHypothesesCrossReference_12_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleExperimentalPlan773);
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

            	    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleExperimentalPlan786); 

            	        	newLeafNode(otherlv_13, grammarAccess.getExperimentalPlanAccess().getColonKeyword_12_1());
            	        
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:421:1: ( (lv_Technique_14_0= ruleAnalysisTechiqueType ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( ((LA13_0>=64 && LA13_0<=75)) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:422:1: (lv_Technique_14_0= ruleAnalysisTechiqueType )
            	    	    {
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:422:1: (lv_Technique_14_0= ruleAnalysisTechiqueType )
            	    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:423:3: lv_Technique_14_0= ruleAnalysisTechiqueType
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getExperimentalPlanAccess().getTechniqueAnalysisTechiqueTypeEnumRuleCall_12_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAnalysisTechiqueType_in_ruleExperimentalPlan807);
            	    	    lv_Technique_14_0=ruleAnalysisTechiqueType();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getExperimentalPlanRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"Technique",
            	    	            		lv_Technique_14_0, 
            	    	            		"AnalysisTechiqueType");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleExperimentalPlan822); 

                	newLeafNode(otherlv_15, grammarAccess.getExperimentalPlanAccess().getInternalReplicationKeyword_13());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:443:1: ( (lv_internalReplication_16_0= RULE_INT ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:444:1: (lv_internalReplication_16_0= RULE_INT )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:444:1: (lv_internalReplication_16_0= RULE_INT )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:445:3: lv_internalReplication_16_0= RULE_INT
            {
            lv_internalReplication_16_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExperimentalPlan839); 

            			newLeafNode(lv_internalReplication_16_0, grammarAccess.getExperimentalPlanAccess().getInternalReplicationINTTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentalPlanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"internalReplication",
                    		lv_internalReplication_16_0, 
                    		"INT");
            	    

            }


            }

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalPlan856); 

                	newLeafNode(otherlv_17, grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:473:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:474:2: (iv_ruleGoal= ruleGoal EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:475:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal892);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal902); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:482:1: ruleGoal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_hypotheses_3_0= ruleHypotheses ) )* otherlv_4= '}' ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_hypotheses_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:485:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_hypotheses_3_0= ruleHypotheses ) )* otherlv_4= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:486:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_hypotheses_3_0= ruleHypotheses ) )* otherlv_4= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:486:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_hypotheses_3_0= ruleHypotheses ) )* otherlv_4= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:486:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_hypotheses_3_0= ruleHypotheses ) )* otherlv_4= '}'
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:486:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:487:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:487:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:488:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal944); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:504:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:505:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:505:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:506:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal966); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleGoal983); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:526:1: ( (lv_hypotheses_3_0= ruleHypotheses ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:527:1: (lv_hypotheses_3_0= ruleHypotheses )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:527:1: (lv_hypotheses_3_0= ruleHypotheses )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:528:3: lv_hypotheses_3_0= ruleHypotheses
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getHypothesesHypothesesParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHypotheses_in_ruleGoal1004);
            	    lv_hypotheses_3_0=ruleHypotheses();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hypotheses",
            	            		lv_hypotheses_3_0, 
            	            		"Hypotheses");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGoal1017); 

                	newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:556:1: entryRuleHypotheses returns [EObject current=null] : iv_ruleHypotheses= ruleHypotheses EOF ;
    public final EObject entryRuleHypotheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHypotheses = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:557:2: (iv_ruleHypotheses= ruleHypotheses EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:558:2: iv_ruleHypotheses= ruleHypotheses EOF
            {
             newCompositeNode(grammarAccess.getHypothesesRule()); 
            pushFollow(FOLLOW_ruleHypotheses_in_entryRuleHypotheses1053);
            iv_ruleHypotheses=ruleHypotheses();

            state._fsp--;

             current =iv_ruleHypotheses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHypotheses1063); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:565:1: ruleHypotheses returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleHypothesisType ) ) ( ( ruleQualifiedName ) ) otherlv_4= '(' ( ( ruleQualifiedName ) )* otherlv_6= ')' ( (lv_operator_7_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_9= '(' ( ( ruleQualifiedName ) )* otherlv_11= ')' ) | ( ( (lv_name_12_0= RULE_ID ) ) otherlv_13= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_15_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_17= ')' ) ) ;
    public final EObject ruleHypotheses() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Enumerator lv_type_2_0 = null;

        Enumerator lv_operator_7_0 = null;

        Enumerator lv_relation_15_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:568:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleHypothesisType ) ) ( ( ruleQualifiedName ) ) otherlv_4= '(' ( ( ruleQualifiedName ) )* otherlv_6= ')' ( (lv_operator_7_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_9= '(' ( ( ruleQualifiedName ) )* otherlv_11= ')' ) | ( ( (lv_name_12_0= RULE_ID ) ) otherlv_13= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_15_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_17= ')' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:569:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleHypothesisType ) ) ( ( ruleQualifiedName ) ) otherlv_4= '(' ( ( ruleQualifiedName ) )* otherlv_6= ')' ( (lv_operator_7_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_9= '(' ( ( ruleQualifiedName ) )* otherlv_11= ')' ) | ( ( (lv_name_12_0= RULE_ID ) ) otherlv_13= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_15_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_17= ')' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:569:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleHypothesisType ) ) ( ( ruleQualifiedName ) ) otherlv_4= '(' ( ( ruleQualifiedName ) )* otherlv_6= ')' ( (lv_operator_7_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_9= '(' ( ( ruleQualifiedName ) )* otherlv_11= ')' ) | ( ( (lv_name_12_0= RULE_ID ) ) otherlv_13= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_15_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_17= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_STRING||(LA20_1>=58 && LA20_1<=59)) ) {
                    alt20=1;
                }
                else if ( (LA20_1==23) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:569:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleHypothesisType ) ) ( ( ruleQualifiedName ) ) otherlv_4= '(' ( ( ruleQualifiedName ) )* otherlv_6= ')' ( (lv_operator_7_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_9= '(' ( ( ruleQualifiedName ) )* otherlv_11= ')' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:569:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleHypothesisType ) ) ( ( ruleQualifiedName ) ) otherlv_4= '(' ( ( ruleQualifiedName ) )* otherlv_6= ')' ( (lv_operator_7_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_9= '(' ( ( ruleQualifiedName ) )* otherlv_11= ')' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:569:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleHypothesisType ) ) ( ( ruleQualifiedName ) ) otherlv_4= '(' ( ( ruleQualifiedName ) )* otherlv_6= ')' ( (lv_operator_7_0= ruleOperatorType ) ) ( ( ruleQualifiedName ) ) otherlv_9= '(' ( ( ruleQualifiedName ) )* otherlv_11= ')'
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:569:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:570:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:570:1: (lv_name_0_0= RULE_ID )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:571:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHypotheses1106); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getHypothesesAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

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

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:587:2: ( (lv_description_1_0= RULE_STRING ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_STRING) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:588:1: (lv_description_1_0= RULE_STRING )
                            {
                            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:588:1: (lv_description_1_0= RULE_STRING )
                            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:589:3: lv_description_1_0= RULE_STRING
                            {
                            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHypotheses1128); 

                            			newLeafNode(lv_description_1_0, grammarAccess.getHypothesesAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0()); 
                            		

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
                            break;

                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:605:3: ( (lv_type_2_0= ruleHypothesisType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:606:1: (lv_type_2_0= ruleHypothesisType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:606:1: (lv_type_2_0= ruleHypothesisType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:607:3: lv_type_2_0= ruleHypothesisType
                    {
                     
                    	        newCompositeNode(grammarAccess.getHypothesesAccess().getTypeHypothesisTypeEnumRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHypothesisType_in_ruleHypotheses1155);
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

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:623:2: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:624:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:624:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:625:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getHypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleHypotheses1178);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleHypotheses1190); 

                        	newLeafNode(otherlv_4, grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_0_4());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:642:1: ( ( ruleQualifiedName ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:643:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:643:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:644:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getHypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesesAccess().getLevelsLevelsCrossReference_0_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleHypotheses1213);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleHypotheses1226); 

                        	newLeafNode(otherlv_6, grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_0_6());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:661:1: ( (lv_operator_7_0= ruleOperatorType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:662:1: (lv_operator_7_0= ruleOperatorType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:662:1: (lv_operator_7_0= ruleOperatorType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:663:3: lv_operator_7_0= ruleOperatorType
                    {
                     
                    	        newCompositeNode(grammarAccess.getHypothesesAccess().getOperatorOperatorTypeEnumRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperatorType_in_ruleHypotheses1247);
                    lv_operator_7_0=ruleOperatorType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHypothesesRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_7_0, 
                            		"OperatorType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:679:2: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:680:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:680:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:681:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getHypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_0_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleHypotheses1270);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleHypotheses1282); 

                        	newLeafNode(otherlv_9, grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_0_9());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:698:1: ( ( ruleQualifiedName ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:699:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:699:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:700:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getHypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesesAccess().getLevelsLevelsCrossReference_0_10_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleHypotheses1305);
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

                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleHypotheses1318); 

                        	newLeafNode(otherlv_11, grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_0_11());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:718:6: ( ( (lv_name_12_0= RULE_ID ) ) otherlv_13= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_15_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_17= ')' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:718:6: ( ( (lv_name_12_0= RULE_ID ) ) otherlv_13= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_15_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_17= ')' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:718:7: ( (lv_name_12_0= RULE_ID ) ) otherlv_13= '(' ( ( ruleQualifiedName ) ) ( (lv_relation_15_0= ruleRelationType ) ) ( ( ruleQualifiedName ) )* otherlv_17= ')'
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:718:7: ( (lv_name_12_0= RULE_ID ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:719:1: (lv_name_12_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:719:1: (lv_name_12_0= RULE_ID )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:720:3: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHypotheses1343); 

                    			newLeafNode(lv_name_12_0, grammarAccess.getHypothesesAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHypothesesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_12_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleHypotheses1360); 

                        	newLeafNode(otherlv_13, grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:740:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:741:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:741:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:742:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getHypothesesRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleHypotheses1383);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:755:2: ( (lv_relation_15_0= ruleRelationType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:756:1: (lv_relation_15_0= ruleRelationType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:756:1: (lv_relation_15_0= ruleRelationType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:757:3: lv_relation_15_0= ruleRelationType
                    {
                     
                    	        newCompositeNode(grammarAccess.getHypothesesAccess().getRelationRelationTypeEnumRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationType_in_ruleHypotheses1404);
                    lv_relation_15_0=ruleRelationType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHypothesesRule());
                    	        }
                           		set(
                           			current, 
                           			"relation",
                            		lv_relation_15_0, 
                            		"RelationType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:773:2: ( ( ruleQualifiedName ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:774:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:774:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:775:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getHypothesesRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getHypothesesAccess().getFactorFactorCrossReference_1_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleHypotheses1427);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleHypotheses1440); 

                        	newLeafNode(otherlv_17, grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_1_5());
                        

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
    // $ANTLR end "ruleHypotheses"


    // $ANTLR start "entryRuleParameter"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:800:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:801:2: (iv_ruleParameter= ruleParameter EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:802:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1477);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1487); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:809:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:812:28: ( (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:813:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:813:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:813:3: otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleParameter1524); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:817:1: ( (lv_variable_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:818:1: (lv_variable_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:818:1: (lv_variable_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:819:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1541); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleParameter1558); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:839:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:840:1: (lv_value_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:840:1: (lv_value_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:841:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter1575); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:865:1: entryRuleDependentVariable returns [EObject current=null] : iv_ruleDependentVariable= ruleDependentVariable EOF ;
    public final EObject entryRuleDependentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependentVariable = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:866:2: (iv_ruleDependentVariable= ruleDependentVariable EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:867:2: iv_ruleDependentVariable= ruleDependentVariable EOF
            {
             newCompositeNode(grammarAccess.getDependentVariableRule()); 
            pushFollow(FOLLOW_ruleDependentVariable_in_entryRuleDependentVariable1616);
            iv_ruleDependentVariable=ruleDependentVariable();

            state._fsp--;

             current =iv_ruleDependentVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependentVariable1626); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:874:1: ruleDependentVariable returns [EObject current=null] : (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* ) ;
    public final EObject ruleDependentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:877:28: ( (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:878:1: (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:878:1: (otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:878:3: otherlv_0= 'Dependent Variable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDependentVariable1663); 

                	newLeafNode(otherlv_0, grammarAccess.getDependentVariableAccess().getDependentVariableKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:882:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:883:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:883:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:884:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependentVariable1680); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:900:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:901:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:901:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:902:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependentVariable1702); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:918:2: ( ( ruleQualifiedName ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:919:1: ( ruleQualifiedName )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:919:1: ( ruleQualifiedName )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:920:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependentVariableRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDependentVariableAccess().getMetricsMetricsCrossReference_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependentVariable1730);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleDependentVariable"


    // $ANTLR start "entryRuleFactor"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:941:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:942:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:943:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1767);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1777); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:950:1: ruleFactor returns [EObject current=null] : (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:953:28: ( (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:954:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:954:1: (otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:954:3: otherlv_0= 'Factor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'isDesiredVariation' ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) ) (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleFactor1814); 

                	newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getFactorKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:958:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:959:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:959:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:960:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactor1831); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleFactor1848); 

                	newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getIsDesiredVariationKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:980:1: ( ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:981:1: ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:981:1: ( (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:982:1: (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:982:1: (lv_isDesiredVariation_3_1= 'True' | lv_isDesiredVariation_3_2= 'False' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:983:3: lv_isDesiredVariation_3_1= 'True'
                    {
                    lv_isDesiredVariation_3_1=(Token)match(input,29,FOLLOW_29_in_ruleFactor1868); 

                            newLeafNode(lv_isDesiredVariation_3_1, grammarAccess.getFactorAccess().getIsDesiredVariationTrueKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "isDesiredVariation", lv_isDesiredVariation_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:995:8: lv_isDesiredVariation_3_2= 'False'
                    {
                    lv_isDesiredVariation_3_2=(Token)match(input,30,FOLLOW_30_in_ruleFactor1897); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1010:2: (otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1010:4: otherlv_4= '{' ( (lv_level_5_0= ruleLevels ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFactor1926); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1014:1: ( (lv_level_5_0= ruleLevels ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1015:1: (lv_level_5_0= ruleLevels )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1015:1: (lv_level_5_0= ruleLevels )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1016:3: lv_level_5_0= ruleLevels
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLevels_in_ruleFactor1947);
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleFactor1960); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1044:1: entryRuleLevels returns [EObject current=null] : iv_ruleLevels= ruleLevels EOF ;
    public final EObject entryRuleLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevels = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1045:2: (iv_ruleLevels= ruleLevels EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1046:2: iv_ruleLevels= ruleLevels EOF
            {
             newCompositeNode(grammarAccess.getLevelsRule()); 
            pushFollow(FOLLOW_ruleLevels_in_entryRuleLevels1998);
            iv_ruleLevels=ruleLevels();

            state._fsp--;

             current =iv_ruleLevels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevels2008); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1053:1: ruleLevels returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLevels() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1056:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1057:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1057:1: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1058:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1058:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1059:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLevels2049); 

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


    // $ANTLR start "entryRuleProcess"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1083:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1084:2: (iv_ruleProcess= ruleProcess EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1085:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess2089);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess2099); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1092:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Enumerator lv_role_6_0 = null;

        EObject lv_task_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1095:28: ( (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1096:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1096:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1096:3: otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleProcess2136); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1100:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1101:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1101:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1102:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess2153); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1118:2: (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1118:4: otherlv_2= 'to' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleProcess2171); 

                        	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getToKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1122:1: ( ( ruleQualifiedName ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1123:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1123:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1124:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProcessRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getTreatmentLevelsCrossReference_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProcess2194);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleProcess2209); 

                	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1141:1: (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1141:3: otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )*
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleProcess2222); 

                        	newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getRoleKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1145:1: ( (lv_role_6_0= ruleRoleType ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=76 && LA27_0<=77)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1146:1: (lv_role_6_0= ruleRoleType )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1146:1: (lv_role_6_0= ruleRoleType )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1147:3: lv_role_6_0= ruleRoleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getRoleRoleTypeEnumRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoleType_in_ruleProcess2243);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1163:5: ( (lv_task_7_0= ruleTask ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1164:1: (lv_task_7_0= ruleTask )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1164:1: (lv_task_7_0= ruleTask )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1165:3: lv_task_7_0= ruleTask
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getTaskTaskParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTask_in_ruleProcess2267);
            	    lv_task_7_0=ruleTask();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"task",
            	            		lv_task_7_0, 
            	            		"Task");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleProcess2280); 

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


    // $ANTLR start "entryRuleTask"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1193:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1194:2: (iv_ruleTask= ruleTask EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1195:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask2316);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask2326); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1202:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_11= 'artefacts' ( (lv_artefacts_12_0= ruleArtefact ) )* )? (otherlv_13= 'quest' ( ( ruleQualifiedName ) )* )? otherlv_15= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_role_7_0 = null;

        EObject lv_artefacts_12_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1205:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_11= 'artefacts' ( (lv_artefacts_12_0= ruleArtefact ) )* )? (otherlv_13= 'quest' ( ( ruleQualifiedName ) )* )? otherlv_15= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1206:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_11= 'artefacts' ( (lv_artefacts_12_0= ruleArtefact ) )* )? (otherlv_13= 'quest' ( ( ruleQualifiedName ) )* )? otherlv_15= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1206:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_11= 'artefacts' ( (lv_artefacts_12_0= ruleArtefact ) )* )? (otherlv_13= 'quest' ( ( ruleQualifiedName ) )* )? otherlv_15= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1206:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'var' ( ( ruleQualifiedName ) )* )? (otherlv_11= 'artefacts' ( (lv_artefacts_12_0= ruleArtefact ) )* )? (otherlv_13= 'quest' ( ( ruleQualifiedName ) )* )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTask2363); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1210:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1211:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1211:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1212:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask2380); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleTask2397); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1232:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1233:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1233:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1234:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask2414); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1250:2: (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1250:4: otherlv_4= 'to' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleTask2432); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getToKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1254:1: ( ( ruleQualifiedName ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1255:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1255:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1256:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getNextTaskCrossReference_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask2455);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1269:5: (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1269:7: otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )*
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleTask2471); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRoleKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1273:1: ( (lv_role_7_0= ruleRoleType ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=76 && LA32_0<=77)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1274:1: (lv_role_7_0= ruleRoleType )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1274:1: (lv_role_7_0= ruleRoleType )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1275:3: lv_role_7_0= ruleRoleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getRoleRoleTypeEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoleType_in_ruleTask2492);
                    	    lv_role_7_0=ruleRoleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTask2507); 

                	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1295:1: (otherlv_9= 'var' ( ( ruleQualifiedName ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1295:3: otherlv_9= 'var' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleTask2520); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getVarKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1299:1: ( ( ruleQualifiedName ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1300:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1300:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1301:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getCollectDataCollectedDataCrossReference_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask2543);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1314:5: (otherlv_11= 'artefacts' ( (lv_artefacts_12_0= ruleArtefact ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1314:7: otherlv_11= 'artefacts' ( (lv_artefacts_12_0= ruleArtefact ) )*
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleTask2559); 

                        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getArtefactsKeyword_8_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1318:1: ( (lv_artefacts_12_0= ruleArtefact ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1319:1: (lv_artefacts_12_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1319:1: (lv_artefacts_12_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1320:3: lv_artefacts_12_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getArtefactsArtefactParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleTask2580);
                    	    lv_artefacts_12_0=ruleArtefact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"artefacts",
                    	            		lv_artefacts_12_0, 
                    	            		"Artefact");
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1336:5: (otherlv_13= 'quest' ( ( ruleQualifiedName ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1336:7: otherlv_13= 'quest' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_13=(Token)match(input,38,FOLLOW_38_in_ruleTask2596); 

                        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getQuestKeyword_9_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1340:1: ( ( ruleQualifiedName ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1341:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1341:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1342:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getQuestionnaireQuestionnaireCrossReference_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask2619);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleTask2634); 

                	newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1367:1: entryRuleArtefact returns [EObject current=null] : iv_ruleArtefact= ruleArtefact EOF ;
    public final EObject entryRuleArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefact = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1368:2: (iv_ruleArtefact= ruleArtefact EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1369:2: iv_ruleArtefact= ruleArtefact EOF
            {
             newCompositeNode(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_ruleArtefact_in_entryRuleArtefact2670);
            iv_ruleArtefact=ruleArtefact();

            state._fsp--;

             current =iv_ruleArtefact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefact2680); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1376:1: ruleArtefact returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) ;
    public final EObject ruleArtefact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1379:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1380:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1380:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1380:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1380:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1381:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1381:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1382:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArtefact2722); 

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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleArtefact2739); 

                	newLeafNode(otherlv_1, grammarAccess.getArtefactAccess().getDescriptionKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1402:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1403:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1403:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1404:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefact2756); 

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

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleArtefact2773); 

                	newLeafNode(otherlv_3, grammarAccess.getArtefactAccess().getTypeKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1424:1: ( (lv_type_4_0= ruleArtefactType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1425:1: (lv_type_4_0= ruleArtefactType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1425:1: (lv_type_4_0= ruleArtefactType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1426:3: lv_type_4_0= ruleArtefactType
            {
             
            	        newCompositeNode(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleArtefactType_in_ruleArtefact2794);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1450:1: entryRuleMetrics returns [EObject current=null] : iv_ruleMetrics= ruleMetrics EOF ;
    public final EObject entryRuleMetrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrics = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1451:2: (iv_ruleMetrics= ruleMetrics EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1452:2: iv_ruleMetrics= ruleMetrics EOF
            {
             newCompositeNode(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_ruleMetrics_in_entryRuleMetrics2830);
            iv_ruleMetrics=ruleMetrics();

            state._fsp--;

             current =iv_ruleMetrics; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetrics2840); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1459:1: ruleMetrics returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1462:28: ( (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1463:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1463:1: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1463:3: otherlv_0= 'Metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) ) ( (lv_detail_7_0= ruleDetail ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleMetrics2877); 

                	newLeafNode(otherlv_0, grammarAccess.getMetricsAccess().getMetricKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1467:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1468:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1468:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1469:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetrics2894); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleMetrics2911); 

                	newLeafNode(otherlv_2, grammarAccess.getMetricsAccess().getRelatesKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1489:1: ( (otherlv_3= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1490:1: (otherlv_3= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1490:1: (otherlv_3= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1491:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricsRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetrics2931); 

            		newLeafNode(otherlv_3, grammarAccess.getMetricsAccess().getRelatesToProcessCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMetrics2943); 

                	newLeafNode(otherlv_4, grammarAccess.getMetricsAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1506:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1506:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleMetrics2956); 

                	newLeafNode(otherlv_5, grammarAccess.getMetricsAccess().getDescriptionKeyword_5_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1510:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1511:1: (lv_description_6_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1511:1: (lv_description_6_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1512:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetrics2973); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1528:3: ( (lv_detail_7_0= ruleDetail ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1529:1: (lv_detail_7_0= ruleDetail )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1529:1: (lv_detail_7_0= ruleDetail )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1530:3: lv_detail_7_0= ruleDetail
            {
             
            	        newCompositeNode(grammarAccess.getMetricsAccess().getDetailDetailParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDetail_in_ruleMetrics3000);
            lv_detail_7_0=ruleDetail();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetricsRule());
            	        }
                   		set(
                   			current, 
                   			"detail",
                    		lv_detail_7_0, 
                    		"Detail");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleMetrics3012); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1558:1: entryRuleDetail returns [EObject current=null] : iv_ruleDetail= ruleDetail EOF ;
    public final EObject entryRuleDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetail = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1559:2: (iv_ruleDetail= ruleDetail EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1560:2: iv_ruleDetail= ruleDetail EOF
            {
             newCompositeNode(grammarAccess.getDetailRule()); 
            pushFollow(FOLLOW_ruleDetail_in_entryRuleDetail3048);
            iv_ruleDetail=ruleDetail();

            state._fsp--;

             current =iv_ruleDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetail3058); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1567:1: ruleDetail returns [EObject current=null] : (this_TaskMetric_0= ruleTaskMetric | this_DataMetric_1= ruleDataMetric ) ;
    public final EObject ruleDetail() throws RecognitionException {
        EObject current = null;

        EObject this_TaskMetric_0 = null;

        EObject this_DataMetric_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1570:28: ( (this_TaskMetric_0= ruleTaskMetric | this_DataMetric_1= ruleDataMetric ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1571:1: (this_TaskMetric_0= ruleTaskMetric | this_DataMetric_1= ruleDataMetric )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1571:1: (this_TaskMetric_0= ruleTaskMetric | this_DataMetric_1= ruleDataMetric )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            else if ( (LA40_0==EOF||LA40_0==17||LA40_0==38||(LA40_0>=44 && LA40_0<=45)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1572:5: this_TaskMetric_0= ruleTaskMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getTaskMetricParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTaskMetric_in_ruleDetail3105);
                    this_TaskMetric_0=ruleTaskMetric();

                    state._fsp--;

                     
                            current = this_TaskMetric_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1582:5: this_DataMetric_1= ruleDataMetric
                    {
                     
                            newCompositeNode(grammarAccess.getDetailAccess().getDataMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataMetric_in_ruleDetail3132);
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


    // $ANTLR start "entryRuleTaskMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1598:1: entryRuleTaskMetric returns [EObject current=null] : iv_ruleTaskMetric= ruleTaskMetric EOF ;
    public final EObject entryRuleTaskMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1599:2: (iv_ruleTaskMetric= ruleTaskMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1600:2: iv_ruleTaskMetric= ruleTaskMetric EOF
            {
             newCompositeNode(grammarAccess.getTaskMetricRule()); 
            pushFollow(FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric3167);
            iv_ruleTaskMetric=ruleTaskMetric();

            state._fsp--;

             current =iv_ruleTaskMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskMetric3177); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1607:1: ruleTaskMetric returns [EObject current=null] : ( () (otherlv_1= 'taskBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'taskEnd' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleTaskMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1610:28: ( ( () (otherlv_1= 'taskBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'taskEnd' ( ( ruleQualifiedName ) ) )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1611:1: ( () (otherlv_1= 'taskBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'taskEnd' ( ( ruleQualifiedName ) ) )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1611:1: ( () (otherlv_1= 'taskBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'taskEnd' ( ( ruleQualifiedName ) ) )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1611:2: () (otherlv_1= 'taskBegin' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'taskEnd' ( ( ruleQualifiedName ) ) )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1611:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1612:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTaskMetricAccess().getTaskMetricAction_0(),
                        current);
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1617:2: (otherlv_1= 'taskBegin' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1617:4: otherlv_1= 'taskBegin' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleTaskMetric3224); 

                	newLeafNode(otherlv_1, grammarAccess.getTaskMetricAccess().getTaskBeginKeyword_1_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1621:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1622:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1622:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1623:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskMetricRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTaskMetricAccess().getTaskBeginTaskCrossReference_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTaskMetric3247);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1636:3: (otherlv_3= 'taskEnd' ( ( ruleQualifiedName ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1636:5: otherlv_3= 'taskEnd' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleTaskMetric3261); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskMetricAccess().getTaskEndKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1640:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1641:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1641:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1642:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskMetricRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTaskMetricAccess().getTaskEndTaskCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTaskMetric3284);
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
    // $ANTLR end "ruleTaskMetric"


    // $ANTLR start "entryRuleDataMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1663:1: entryRuleDataMetric returns [EObject current=null] : iv_ruleDataMetric= ruleDataMetric EOF ;
    public final EObject entryRuleDataMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1664:2: (iv_ruleDataMetric= ruleDataMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1665:2: iv_ruleDataMetric= ruleDataMetric EOF
            {
             newCompositeNode(grammarAccess.getDataMetricRule()); 
            pushFollow(FOLLOW_ruleDataMetric_in_entryRuleDataMetric3322);
            iv_ruleDataMetric=ruleDataMetric();

            state._fsp--;

             current =iv_ruleDataMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataMetric3332); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1672:1: ruleDataMetric returns [EObject current=null] : ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1675:28: ( ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1676:1: ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1676:1: ( () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1676:2: () (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )? (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )? (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1676:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1677:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataMetricAccess().getDataMetricAction_0(),
                        current);
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1682:2: (otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1682:4: otherlv_1= 'collectedData' ( (lv_collectedData_2_0= ruleCollectedData ) )* otherlv_3= ':' ( (lv_dataType_4_0= ruleDataType ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDataMetric3379); 

                        	newLeafNode(otherlv_1, grammarAccess.getDataMetricAccess().getCollectedDataKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1686:1: ( (lv_collectedData_2_0= ruleCollectedData ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1687:1: (lv_collectedData_2_0= ruleCollectedData )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1687:1: (lv_collectedData_2_0= ruleCollectedData )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1688:3: lv_collectedData_2_0= ruleCollectedData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getCollectedDataCollectedDataParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCollectedData_in_ruleDataMetric3400);
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
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleDataMetric3413); 

                        	newLeafNode(otherlv_3, grammarAccess.getDataMetricAccess().getColonKeyword_1_2());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1708:1: ( (lv_dataType_4_0= ruleDataType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1709:1: (lv_dataType_4_0= ruleDataType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1709:1: (lv_dataType_4_0= ruleDataType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1710:3: lv_dataType_4_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataMetricAccess().getDataTypeDataTypeEnumRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleDataMetric3434);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1726:4: (otherlv_5= 'artefact' ( ( ruleQualifiedName ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1726:6: otherlv_5= 'artefact' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleDataMetric3449); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataMetricAccess().getArtefactKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1730:1: ( ( ruleQualifiedName ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_ID) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1731:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1731:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1732:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDataMetricRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getArtefactsArtefactCrossReference_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataMetric3472);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1745:5: (otherlv_7= 'quest' ( ( ruleQualifiedName ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1745:7: otherlv_7= 'quest' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleDataMetric3488); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataMetricAccess().getQuestKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1749:1: ( ( ruleQualifiedName ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_ID) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1750:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1750:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1751:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDataMetricRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataMetricAccess().getQuestionnairesQuestionnaireCrossReference_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataMetric3511);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1772:1: entryRuleCollectedData returns [EObject current=null] : iv_ruleCollectedData= ruleCollectedData EOF ;
    public final EObject entryRuleCollectedData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectedData = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1773:2: (iv_ruleCollectedData= ruleCollectedData EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1774:2: iv_ruleCollectedData= ruleCollectedData EOF
            {
             newCompositeNode(grammarAccess.getCollectedDataRule()); 
            pushFollow(FOLLOW_ruleCollectedData_in_entryRuleCollectedData3550);
            iv_ruleCollectedData=ruleCollectedData();

            state._fsp--;

             current =iv_ruleCollectedData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectedData3560); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1781:1: ruleCollectedData returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCollectedData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1784:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1785:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1785:1: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1786:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1786:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1787:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectedData3601); 

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


    // $ANTLR start "entryRuleQuestionnaire"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1811:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1812:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1813:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire3641);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire3651); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1820:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1823:28: ( (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1824:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1824:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1824:3: otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleQuestionnaire3688); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1828:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1829:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1829:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1830:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire3705); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1846:2: (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1846:4: otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleQuestionnaire3723); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1850:1: ( (otherlv_3= RULE_ID ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_ID) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1851:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1851:1: (otherlv_3= RULE_ID )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1852:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQuestionnaireRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire3743); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getRelatesToProcessCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1863:5: (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1863:7: otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleQuestionnaire3759); 

                        	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getTypeKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1867:1: ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1868:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1868:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1869:3: lv_questionnaireType_5_0= ruleQuestionnaireType
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeQuestionnaireTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire3780);
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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleQuestionnaire3794); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1889:1: ( (lv_question_7_0= ruleQuestion ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1890:1: (lv_question_7_0= ruleQuestion )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1890:1: (lv_question_7_0= ruleQuestion )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1891:3: lv_question_7_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleQuestionnaire3815);
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
            	    break loop51;
                }
            } while (true);

            otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleQuestionnaire3828); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1919:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1920:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1921:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion3864);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion3874); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1928:1: ruleQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1931:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1932:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1932:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1932:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}'
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1932:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1933:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1933:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1934:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion3916); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleQuestion3933); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1954:1: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1954:3: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleQuestion3946); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getDescriptionKeyword_2_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1958:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1959:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1959:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1960:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion3963); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1976:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1976:5: otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) )
            {
            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleQuestion3982); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getTypeKeyword_3_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1980:1: ( (lv_type_5_0= ruleAnswerType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1981:1: (lv_type_5_0= ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1981:1: (lv_type_5_0= ruleAnswerType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1982:3: lv_type_5_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion4003);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1998:3: (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:1998:5: otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleQuestion4017); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRequiredKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2002:1: ( (lv_req_7_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2003:1: (lv_req_7_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2003:1: (lv_req_7_0= RULE_INT )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2004:3: lv_req_7_0= RULE_INT
                    {
                    lv_req_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuestion4034); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2020:4: (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2020:6: otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleQuestion4054); 

                        	newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2024:1: ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==50) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2025:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2025:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2026:3: lv_alternatives_9_0= ruleAlternatives
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAlternatives_in_ruleQuestion4075);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleQuestion4090); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2054:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2055:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2056:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives4126);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives4136); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2063:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2066:28: ( (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2067:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2067:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2067:3: otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleAlternatives4173); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getOptionKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2071:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2072:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2072:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2073:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternatives4190); 

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


    // $ANTLR start "ruleRelationType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2097:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2099:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2100:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2100:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                alt55=1;
            }
            else if ( (LA55_0==52) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2100:2: (enumLiteral_0= '==' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2100:2: (enumLiteral_0= '==' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2100:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleRelationType4245); 

                            current = grammarAccess.getRelationTypeAccess().getIsRelatedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getIsRelatedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2106:6: (enumLiteral_1= '<>' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2106:6: (enumLiteral_1= '<>' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2106:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleRelationType4262); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2116:1: ruleOperatorType returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2118:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2119:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2119:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt56=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt56=1;
                }
                break;
            case 53:
                {
                alt56=2;
                }
                break;
            case 54:
                {
                alt56=3;
                }
                break;
            case 55:
                {
                alt56=4;
                }
                break;
            case 56:
                {
                alt56=5;
                }
                break;
            case 57:
                {
                alt56=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2119:2: (enumLiteral_0= '=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2119:2: (enumLiteral_0= '=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2119:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleOperatorType4307); 

                            current = grammarAccess.getOperatorTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2125:6: (enumLiteral_1= '!=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2125:6: (enumLiteral_1= '!=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2125:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleOperatorType4324); 

                            current = grammarAccess.getOperatorTypeAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorTypeAccess().getDifferentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2131:6: (enumLiteral_2= '>' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2131:6: (enumLiteral_2= '>' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2131:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleOperatorType4341); 

                            current = grammarAccess.getOperatorTypeAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorTypeAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2137:6: (enumLiteral_3= '<' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2137:6: (enumLiteral_3= '<' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2137:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_ruleOperatorType4358); 

                            current = grammarAccess.getOperatorTypeAccess().getLessEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorTypeAccess().getLessEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2143:6: (enumLiteral_4= '>=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2143:6: (enumLiteral_4= '>=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2143:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_56_in_ruleOperatorType4375); 

                            current = grammarAccess.getOperatorTypeAccess().getMoreEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorTypeAccess().getMoreEqualEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2149:6: (enumLiteral_5= '<=' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2149:6: (enumLiteral_5= '<=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2149:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_57_in_ruleOperatorType4392); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2159:1: ruleHypothesisType returns [Enumerator current=null] : ( (enumLiteral_0= 'null_' ) | (enumLiteral_1= 'alternative' ) ) ;
    public final Enumerator ruleHypothesisType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2161:28: ( ( (enumLiteral_0= 'null_' ) | (enumLiteral_1= 'alternative' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2162:1: ( (enumLiteral_0= 'null_' ) | (enumLiteral_1= 'alternative' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2162:1: ( (enumLiteral_0= 'null_' ) | (enumLiteral_1= 'alternative' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            else if ( (LA57_0==59) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2162:2: (enumLiteral_0= 'null_' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2162:2: (enumLiteral_0= 'null_' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2162:4: enumLiteral_0= 'null_'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleHypothesisType4437); 

                            current = grammarAccess.getHypothesisTypeAccess().getNull_EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHypothesisTypeAccess().getNull_EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2168:6: (enumLiteral_1= 'alternative' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2168:6: (enumLiteral_1= 'alternative' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2168:8: enumLiteral_1= 'alternative'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleHypothesisType4454); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2178:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2180:28: ( ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2181:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2181:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt58=1;
                }
                break;
            case 61:
                {
                alt58=2;
                }
                break;
            case 62:
                {
                alt58=3;
                }
                break;
            case 63:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2181:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2181:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2181:4: enumLiteral_0= 'CRD - Completely Randomized Design'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleDesignType4499); 

                            current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2187:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2187:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2187:8: enumLiteral_1= 'RCBD - Randomized Complete Block Design'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleDesignType4516); 

                            current = grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2193:6: (enumLiteral_2= 'LS - Latin Square' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2193:6: (enumLiteral_2= 'LS - Latin Square' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2193:8: enumLiteral_2= 'LS - Latin Square'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleDesignType4533); 

                            current = grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2199:6: (enumLiteral_3= 'Other' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2199:6: (enumLiteral_3= 'Other' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2199:8: enumLiteral_3= 'Other'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_63_in_ruleDesignType4550); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2209:1: ruleAnalysisTechiqueType returns [Enumerator current=null] : ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'McNemar Test' ) | (enumLiteral_5= 'Mann-Whitney' ) | (enumLiteral_6= 'Paired t-test' ) | (enumLiteral_7= 'Wilcoxon' ) | (enumLiteral_8= 'Sign test' ) | (enumLiteral_9= 'ANOVA' ) | (enumLiteral_10= 'Kruskal-Wallis' ) | (enumLiteral_11= 'Others' ) ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2211:28: ( ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'McNemar Test' ) | (enumLiteral_5= 'Mann-Whitney' ) | (enumLiteral_6= 'Paired t-test' ) | (enumLiteral_7= 'Wilcoxon' ) | (enumLiteral_8= 'Sign test' ) | (enumLiteral_9= 'ANOVA' ) | (enumLiteral_10= 'Kruskal-Wallis' ) | (enumLiteral_11= 'Others' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2212:1: ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'McNemar Test' ) | (enumLiteral_5= 'Mann-Whitney' ) | (enumLiteral_6= 'Paired t-test' ) | (enumLiteral_7= 'Wilcoxon' ) | (enumLiteral_8= 'Sign test' ) | (enumLiteral_9= 'ANOVA' ) | (enumLiteral_10= 'Kruskal-Wallis' ) | (enumLiteral_11= 'Others' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2212:1: ( (enumLiteral_0= 'Chi-2' ) | (enumLiteral_1= 'Binomial Test' ) | (enumLiteral_2= 't-test' ) | (enumLiteral_3= 'F-test' ) | (enumLiteral_4= 'McNemar Test' ) | (enumLiteral_5= 'Mann-Whitney' ) | (enumLiteral_6= 'Paired t-test' ) | (enumLiteral_7= 'Wilcoxon' ) | (enumLiteral_8= 'Sign test' ) | (enumLiteral_9= 'ANOVA' ) | (enumLiteral_10= 'Kruskal-Wallis' ) | (enumLiteral_11= 'Others' ) )
            int alt59=12;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt59=1;
                }
                break;
            case 65:
                {
                alt59=2;
                }
                break;
            case 66:
                {
                alt59=3;
                }
                break;
            case 67:
                {
                alt59=4;
                }
                break;
            case 68:
                {
                alt59=5;
                }
                break;
            case 69:
                {
                alt59=6;
                }
                break;
            case 70:
                {
                alt59=7;
                }
                break;
            case 71:
                {
                alt59=8;
                }
                break;
            case 72:
                {
                alt59=9;
                }
                break;
            case 73:
                {
                alt59=10;
                }
                break;
            case 74:
                {
                alt59=11;
                }
                break;
            case 75:
                {
                alt59=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2212:2: (enumLiteral_0= 'Chi-2' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2212:2: (enumLiteral_0= 'Chi-2' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2212:4: enumLiteral_0= 'Chi-2'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleAnalysisTechiqueType4595); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getChi2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnalysisTechiqueTypeAccess().getChi2EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2218:6: (enumLiteral_1= 'Binomial Test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2218:6: (enumLiteral_1= 'Binomial Test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2218:8: enumLiteral_1= 'Binomial Test'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleAnalysisTechiqueType4612); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getBinomialTestEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnalysisTechiqueTypeAccess().getBinomialTestEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2224:6: (enumLiteral_2= 't-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2224:6: (enumLiteral_2= 't-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2224:8: enumLiteral_2= 't-test'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleAnalysisTechiqueType4629); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getTTestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnalysisTechiqueTypeAccess().getTTestEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2230:6: (enumLiteral_3= 'F-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2230:6: (enumLiteral_3= 'F-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2230:8: enumLiteral_3= 'F-test'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_67_in_ruleAnalysisTechiqueType4646); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getFTestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnalysisTechiqueTypeAccess().getFTestEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2236:6: (enumLiteral_4= 'McNemar Test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2236:6: (enumLiteral_4= 'McNemar Test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2236:8: enumLiteral_4= 'McNemar Test'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_68_in_ruleAnalysisTechiqueType4663); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getMcNemarTestEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnalysisTechiqueTypeAccess().getMcNemarTestEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2242:6: (enumLiteral_5= 'Mann-Whitney' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2242:6: (enumLiteral_5= 'Mann-Whitney' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2242:8: enumLiteral_5= 'Mann-Whitney'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_69_in_ruleAnalysisTechiqueType4680); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getMannWhitneyEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnalysisTechiqueTypeAccess().getMannWhitneyEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2248:6: (enumLiteral_6= 'Paired t-test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2248:6: (enumLiteral_6= 'Paired t-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2248:8: enumLiteral_6= 'Paired t-test'
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_70_in_ruleAnalysisTechiqueType4697); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getPairedEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getAnalysisTechiqueTypeAccess().getPairedEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2254:6: (enumLiteral_7= 'Wilcoxon' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2254:6: (enumLiteral_7= 'Wilcoxon' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2254:8: enumLiteral_7= 'Wilcoxon'
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_71_in_ruleAnalysisTechiqueType4714); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getWilcoxonEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getAnalysisTechiqueTypeAccess().getWilcoxonEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2260:6: (enumLiteral_8= 'Sign test' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2260:6: (enumLiteral_8= 'Sign test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2260:8: enumLiteral_8= 'Sign test'
                    {
                    enumLiteral_8=(Token)match(input,72,FOLLOW_72_in_ruleAnalysisTechiqueType4731); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getSignTestEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getAnalysisTechiqueTypeAccess().getSignTestEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2266:6: (enumLiteral_9= 'ANOVA' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2266:6: (enumLiteral_9= 'ANOVA' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2266:8: enumLiteral_9= 'ANOVA'
                    {
                    enumLiteral_9=(Token)match(input,73,FOLLOW_73_in_ruleAnalysisTechiqueType4748); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getAnovaEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getAnalysisTechiqueTypeAccess().getAnovaEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2272:6: (enumLiteral_10= 'Kruskal-Wallis' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2272:6: (enumLiteral_10= 'Kruskal-Wallis' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2272:8: enumLiteral_10= 'Kruskal-Wallis'
                    {
                    enumLiteral_10=(Token)match(input,74,FOLLOW_74_in_ruleAnalysisTechiqueType4765); 

                            current = grammarAccess.getAnalysisTechiqueTypeAccess().getKruskalWallisEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getAnalysisTechiqueTypeAccess().getKruskalWallisEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2278:6: (enumLiteral_11= 'Others' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2278:6: (enumLiteral_11= 'Others' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2278:8: enumLiteral_11= 'Others'
                    {
                    enumLiteral_11=(Token)match(input,75,FOLLOW_75_in_ruleAnalysisTechiqueType4782); 

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


    // $ANTLR start "ruleRoleType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2288:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2290:28: ( ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2291:1: ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2291:1: ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==76) ) {
                alt60=1;
            }
            else if ( (LA60_0==77) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2291:2: (enumLiteral_0= 'Participant' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2291:2: (enumLiteral_0= 'Participant' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2291:4: enumLiteral_0= 'Participant'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleRoleType4827); 

                            current = grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2297:6: (enumLiteral_1= 'Researcher' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2297:6: (enumLiteral_1= 'Researcher' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2297:8: enumLiteral_1= 'Researcher'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleRoleType4844); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2307:1: ruleArtefactType returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) ;
    public final Enumerator ruleArtefactType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2309:28: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2310:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2310:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt61=1;
                }
                break;
            case 79:
                {
                alt61=2;
                }
                break;
            case 80:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2310:2: (enumLiteral_0= 'input' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2310:2: (enumLiteral_0= 'input' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2310:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_78_in_ruleArtefactType4889); 

                            current = grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2316:6: (enumLiteral_1= 'output' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2316:6: (enumLiteral_1= 'output' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2316:8: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_79_in_ruleArtefactType4906); 

                            current = grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2322:6: (enumLiteral_2= 'inoutput' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2322:6: (enumLiteral_2= 'inoutput' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2322:8: enumLiteral_2= 'inoutput'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_80_in_ruleArtefactType4923); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2332:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2334:28: ( ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2335:1: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2335:1: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'text' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==81) ) {
                alt62=1;
            }
            else if ( (LA62_0==82) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2335:2: (enumLiteral_0= 'number' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2335:2: (enumLiteral_0= 'number' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2335:4: enumLiteral_0= 'number'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleDataType4968); 

                            current = grammarAccess.getDataTypeAccess().getNumEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNumEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2341:6: (enumLiteral_1= 'text' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2341:6: (enumLiteral_1= 'text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2341:8: enumLiteral_1= 'text'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleDataType4985); 

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


    // $ANTLR start "ruleQuestionnaireType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2351:1: ruleQuestionnaireType returns [Enumerator current=null] : ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) ) ;
    public final Enumerator ruleQuestionnaireType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2353:28: ( ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2354:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2354:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==83) ) {
                alt63=1;
            }
            else if ( (LA63_0==84) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2354:2: (enumLiteral_0= 'Pre' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2354:2: (enumLiteral_0= 'Pre' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2354:4: enumLiteral_0= 'Pre'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleQuestionnaireType5030); 

                            current = grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2360:6: (enumLiteral_1= 'Post' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2360:6: (enumLiteral_1= 'Post' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2360:8: enumLiteral_1= 'Post'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleQuestionnaireType5047); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2370:1: ruleAnswerType returns [Enumerator current=null] : ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) ) ;
    public final Enumerator ruleAnswerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2372:28: ( ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2373:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2373:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) )
            int alt64=6;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt64=1;
                }
                break;
            case 86:
                {
                alt64=2;
                }
                break;
            case 87:
                {
                alt64=3;
                }
                break;
            case 88:
                {
                alt64=4;
                }
                break;
            case 89:
                {
                alt64=5;
                }
                break;
            case 90:
                {
                alt64=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2373:2: (enumLiteral_0= 'Text' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2373:2: (enumLiteral_0= 'Text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2373:4: enumLiteral_0= 'Text'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleAnswerType5092); 

                            current = grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2379:6: (enumLiteral_1= 'ParagraphText' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2379:6: (enumLiteral_1= 'ParagraphText' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2379:8: enumLiteral_1= 'ParagraphText'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleAnswerType5109); 

                            current = grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2385:6: (enumLiteral_2= 'MultipleChoice' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2385:6: (enumLiteral_2= 'MultipleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2385:8: enumLiteral_2= 'MultipleChoice'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_87_in_ruleAnswerType5126); 

                            current = grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2391:6: (enumLiteral_3= 'SingleChoice' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2391:6: (enumLiteral_3= 'SingleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2391:8: enumLiteral_3= 'SingleChoice'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_88_in_ruleAnswerType5143); 

                            current = grammarAccess.getAnswerTypeAccess().getSingleChoiceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnswerTypeAccess().getSingleChoiceEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2397:6: (enumLiteral_4= 'Scale' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2397:6: (enumLiteral_4= 'Scale' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2397:8: enumLiteral_4= 'Scale'
                    {
                    enumLiteral_4=(Token)match(input,89,FOLLOW_89_in_ruleAnswerType5160); 

                            current = grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2403:6: (enumLiteral_5= 'Grid' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2403:6: (enumLiteral_5= 'Grid' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpDslv2.g:2403:8: enumLiteral_5= 'Grid'
                    {
                    enumLiteral_5=(Token)match(input,90,FOLLOW_90_in_ruleAnswerType5177); 

                            current = grammarAccess.getAnswerTypeAccess().getGridEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnswerTypeAccess().getGridEnumLiteralDeclaration_5()); 
                        

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentElement230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExperimentElement248 = new BitSet(new long[]{0x000001008000A002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_ruleExperimentElement269 = new BitSet(new long[]{0x000001008000A002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleExperimentElement292 = new BitSet(new long[]{0x0000010080002002L});
    public static final BitSet FOLLOW_ruleMetrics_in_ruleExperimentElement314 = new BitSet(new long[]{0x0000010000002002L});
    public static final BitSet FOLLOW_13_in_ruleExperimentElement328 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_ruleExperimentElement349 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName440 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName474 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentalPlan531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleExperimentalPlan568 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan580 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleExperimentalPlan601 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalPlan614 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExperimentalPlan626 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExperimentalPlan638 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleExperimentalPlan659 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalPlan671 = new BitSet(new long[]{0x000000000E100000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExperimentalPlan692 = new BitSet(new long[]{0x000000000E100000L});
    public static final BitSet FOLLOW_ruleDependentVariable_in_ruleExperimentalPlan714 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExperimentalPlan736 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_20_in_ruleExperimentalPlan749 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleExperimentalPlan773 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleExperimentalPlan786 = new BitSet(new long[]{0x0000000000600020L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_ruleAnalysisTechiqueType_in_ruleExperimentalPlan807 = new BitSet(new long[]{0x0000000000600020L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_22_in_ruleExperimentalPlan822 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExperimentalPlan839 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalPlan856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal966 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGoal983 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleHypotheses_in_ruleGoal1004 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleGoal1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypotheses_in_entryRuleHypotheses1053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHypotheses1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHypotheses1106 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHypotheses1128 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_ruleHypothesisType_in_ruleHypotheses1155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHypotheses1178 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleHypotheses1190 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHypotheses1213 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleHypotheses1226 = new BitSet(new long[]{0x03E0000000080000L});
    public static final BitSet FOLLOW_ruleOperatorType_in_ruleHypotheses1247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHypotheses1270 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleHypotheses1282 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHypotheses1305 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleHypotheses1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHypotheses1343 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleHypotheses1360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHypotheses1383 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleHypotheses1404 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHypotheses1427 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleHypotheses1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleParameter1524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1541 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleParameter1558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependentVariable_in_entryRuleDependentVariable1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependentVariable1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDependentVariable1663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependentVariable1680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependentVariable1702 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependentVariable1730 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFactor1814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactor1831 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFactor1848 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleFactor1868 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_30_in_ruleFactor1897 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleFactor1926 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleLevels_in_ruleFactor1947 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleFactor1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevels_in_entryRuleLevels1998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevels2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLevels2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess2089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleProcess2136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess2153 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleProcess2171 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProcess2194 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleProcess2209 = new BitSet(new long[]{0x0000000600020000L});
    public static final BitSet FOLLOW_33_in_ruleProcess2222 = new BitSet(new long[]{0x0000000400020000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleRoleType_in_ruleProcess2243 = new BitSet(new long[]{0x0000000400020000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleProcess2267 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleProcess2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask2316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTask2363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask2380 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTask2397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask2414 = new BitSet(new long[]{0x0000000300010000L});
    public static final BitSet FOLLOW_32_in_ruleTask2432 = new BitSet(new long[]{0x0000000200010020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask2455 = new BitSet(new long[]{0x0000000200010020L});
    public static final BitSet FOLLOW_33_in_ruleTask2471 = new BitSet(new long[]{0x0000000000010000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleRoleType_in_ruleTask2492 = new BitSet(new long[]{0x0000000000010000L,0x0000000000003000L});
    public static final BitSet FOLLOW_16_in_ruleTask2507 = new BitSet(new long[]{0x0000007000020000L});
    public static final BitSet FOLLOW_36_in_ruleTask2520 = new BitSet(new long[]{0x0000006000020020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask2543 = new BitSet(new long[]{0x0000006000020020L});
    public static final BitSet FOLLOW_37_in_ruleTask2559 = new BitSet(new long[]{0x0000004000020020L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleTask2580 = new BitSet(new long[]{0x0000004000020020L});
    public static final BitSet FOLLOW_38_in_ruleTask2596 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask2619 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleTask2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefact_in_entryRuleArtefact2670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefact2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArtefact2722 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleArtefact2739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefact2756 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleArtefact2773 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_ruleArtefactType_in_ruleArtefact2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetrics_in_entryRuleMetrics2830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetrics2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMetrics2877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetrics2894 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMetrics2911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetrics2931 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMetrics2943 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMetrics2956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetrics2973 = new BitSet(new long[]{0x0000344000000000L});
    public static final BitSet FOLLOW_ruleDetail_in_ruleMetrics3000 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMetrics3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetail_in_entryRuleDetail3048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetail3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_ruleDetail3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataMetric_in_ruleDetail3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric3167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskMetric3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTaskMetric3224 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTaskMetric3247 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleTaskMetric3261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTaskMetric3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataMetric_in_entryRuleDataMetric3322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataMetric3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDataMetric3379 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_ruleCollectedData_in_ruleDataMetric3400 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleDataMetric3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataMetric3434 = new BitSet(new long[]{0x0000204000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataMetric3449 = new BitSet(new long[]{0x0000004000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataMetric3472 = new BitSet(new long[]{0x0000004000000022L});
    public static final BitSet FOLLOW_38_in_ruleDataMetric3488 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataMetric3511 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleCollectedData_in_entryRuleCollectedData3550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectedData3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectedData3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire3641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleQuestionnaire3688 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire3705 = new BitSet(new long[]{0x0000028000010000L});
    public static final BitSet FOLLOW_41_in_ruleQuestionnaire3723 = new BitSet(new long[]{0x0000008000010020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire3743 = new BitSet(new long[]{0x0000008000010020L});
    public static final BitSet FOLLOW_39_in_ruleQuestionnaire3759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire3780 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestionnaire3794 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionnaire3815 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_47_in_ruleQuestionnaire3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion3864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion3916 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestion3933 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleQuestion3946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion3963 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleQuestion3982 = new BitSet(new long[]{0x0000000000000000L,0x0000000007E00000L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion4003 = new BitSet(new long[]{0x0003000000020000L});
    public static final BitSet FOLLOW_48_in_ruleQuestion4017 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuestion4034 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_49_in_ruleQuestion4054 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleQuestion4075 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuestion4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives4126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAlternatives4173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternatives4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleRelationType4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleRelationType4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOperatorType4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOperatorType4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOperatorType4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOperatorType4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOperatorType4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOperatorType4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleHypothesisType4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleHypothesisType4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDesignType4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDesignType4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDesignType4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDesignType4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAnalysisTechiqueType4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAnalysisTechiqueType4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAnalysisTechiqueType4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAnalysisTechiqueType4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAnalysisTechiqueType4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAnalysisTechiqueType4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAnalysisTechiqueType4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAnalysisTechiqueType4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAnalysisTechiqueType4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAnalysisTechiqueType4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAnalysisTechiqueType4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAnalysisTechiqueType4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleRoleType4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleRoleType4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleArtefactType4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleArtefactType4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleArtefactType4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDataType4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDataType4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleQuestionnaireType5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleQuestionnaireType5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAnswerType5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAnswerType5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAnswerType5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAnswerType5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAnswerType5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleAnswerType5177 = new BitSet(new long[]{0x0000000000000002L});

}