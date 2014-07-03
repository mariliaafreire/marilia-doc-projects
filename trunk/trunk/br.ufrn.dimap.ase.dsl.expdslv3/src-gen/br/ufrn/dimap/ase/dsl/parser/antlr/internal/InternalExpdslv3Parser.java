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
import br.ufrn.dimap.ase.dsl.services.Expdslv3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpdslv3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Experiment'", "'Experimental Design'", "'Questionnaires'", "'.'", "'Authorship'", "'{'", "'}'", "'Abstract'", "'Keywords'", "'Goals'", "'Research Questions'", "'Research Hypotheses'", "'Variables'", "'Dependent Variables'", "'Factors'", "'DoE'", "'='", "'('", "')'", "'Context'", "'Internal Replication'", "'Background'", "'Objective'", "'Methods'", "'Results'", "'Limitations'", "'Conclusions'", "'Analyze'", "'for the purpose of'", "'with respect to their'", "'the point of view of the'", "'in the context of'", "'relates to'", "'Scale'", "'Range'", "'RQ'", "'RH'", "'column ='", "','", "'row ='", "'treatment ='", "'blockVariable ='", "'Process'", "'to'", "'Role'", "'Task'", "'description'", "'artefacts'", "'metrics'", "'type'", "'as'", "'Questionnaire'", "'relates'", "'};'", "'required'", "'Alternatives'", "'Option'", "'Numerical'", "'Ratio'", "'Ordinal'", "'Nominal'", "'CRD - Completely Randomized Design'", "'RCBD - Randomized Complete Block Design'", "'LS - Latin Square'", "'Other'", "'Participant'", "'Researcher'", "'input'", "'output'", "'inoutput'", "'auto-time'", "'Pre'", "'Post'", "'Text'", "'ParagraphText'", "'MultipleChoice'", "'SingleChoice'", "'Grid'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
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
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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


        public InternalExpdslv3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpdslv3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpdslv3Parser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g"; }



     	private Expdslv3GrammarAccess grammarAccess;
     	
        public InternalExpdslv3Parser(TokenStream input, Expdslv3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected Expdslv3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleExperimentElement ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:80:28: ( ( (lv_elements_0_0= ruleExperimentElement ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:81:1: ( (lv_elements_0_0= ruleExperimentElement ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:81:1: ( (lv_elements_0_0= ruleExperimentElement ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:82:1: (lv_elements_0_0= ruleExperimentElement )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:82:1: (lv_elements_0_0= ruleExperimentElement )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:83:3: lv_elements_0_0= ruleExperimentElement
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:107:1: entryRuleExperimentElement returns [EObject current=null] : iv_ruleExperimentElement= ruleExperimentElement EOF ;
    public final EObject entryRuleExperimentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentElement = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:108:2: (iv_ruleExperimentElement= ruleExperimentElement EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:109:2: iv_ruleExperimentElement= ruleExperimentElement EOF
            {
             newCompositeNode(grammarAccess.getExperimentElementRule()); 
            pushFollow(FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement165);
            iv_ruleExperimentElement=ruleExperimentElement();

            state._fsp--;

             current =iv_ruleExperimentElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentElement175); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:116:1: ruleExperimentElement returns [EObject current=null] : (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'Experimental Design' ( (lv_experiments_4_0= ruleExperimentalDesign ) ) ( (lv_process_5_0= ruleProcess ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) ;
    public final EObject ruleExperimentElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_experiments_4_0 = null;

        EObject lv_process_5_0 = null;

        EObject lv_questionnaire_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:119:28: ( (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'Experimental Design' ( (lv_experiments_4_0= ruleExperimentalDesign ) ) ( (lv_process_5_0= ruleProcess ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'Experimental Design' ( (lv_experiments_4_0= ruleExperimentalDesign ) ) ( (lv_process_5_0= ruleProcess ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:120:1: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'Experimental Design' ( (lv_experiments_4_0= ruleExperimentalDesign ) ) ( (lv_process_5_0= ruleProcess ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:120:3: otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'Experimental Design' ( (lv_experiments_4_0= ruleExperimentalDesign ) ) ( (lv_process_5_0= ruleProcess ) )* (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleExperimentElement212); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentElementAccess().getExperimentKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:125:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperimentElement229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExperimentElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:142:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:143:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:143:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:144:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExperimentElement251); 

            			newLeafNode(lv_description_2_0, grammarAccess.getExperimentElementAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleExperimentElement268); 

                	newLeafNode(otherlv_3, grammarAccess.getExperimentElementAccess().getExperimentalDesignKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:164:1: ( (lv_experiments_4_0= ruleExperimentalDesign ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:165:1: (lv_experiments_4_0= ruleExperimentalDesign )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:165:1: (lv_experiments_4_0= ruleExperimentalDesign )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:166:3: lv_experiments_4_0= ruleExperimentalDesign
            {
             
            	        newCompositeNode(grammarAccess.getExperimentElementAccess().getExperimentsExperimentalDesignParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExperimentalDesign_in_ruleExperimentElement289);
            lv_experiments_4_0=ruleExperimentalDesign();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
            	        }
                   		set(
                   			current, 
                   			"experiments",
                    		lv_experiments_4_0, 
                    		"ExperimentalDesign");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:182:2: ( (lv_process_5_0= ruleProcess ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==53) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:183:1: (lv_process_5_0= ruleProcess )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:183:1: (lv_process_5_0= ruleProcess )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:184:3: lv_process_5_0= ruleProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getProcessProcessParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcess_in_ruleExperimentElement310);
            	    lv_process_5_0=ruleProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"process",
            	            		lv_process_5_0, 
            	            		"Process");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:200:3: (otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:200:5: otherlv_6= 'Questionnaires' ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleExperimentElement324); 

                        	newLeafNode(otherlv_6, grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:204:1: ( (lv_questionnaire_7_0= ruleQuestionnaire ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==62) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:205:1: (lv_questionnaire_7_0= ruleQuestionnaire )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:205:1: (lv_questionnaire_7_0= ruleQuestionnaire )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:206:3: lv_questionnaire_7_0= ruleQuestionnaire
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentElementAccess().getQuestionnaireQuestionnaireParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQuestionnaire_in_ruleExperimentElement345);
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
                    	    break loop2;
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:230:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:231:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:232:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName385);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName396); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:239:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:242:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:243:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:243:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:243:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName436); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:250:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:251:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName455); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName470); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleExperimentalDesign"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:271:1: entryRuleExperimentalDesign returns [EObject current=null] : iv_ruleExperimentalDesign= ruleExperimentalDesign EOF ;
    public final EObject entryRuleExperimentalDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentalDesign = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:272:2: (iv_ruleExperimentalDesign= ruleExperimentalDesign EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:273:2: iv_ruleExperimentalDesign= ruleExperimentalDesign EOF
            {
             newCompositeNode(grammarAccess.getExperimentalDesignRule()); 
            pushFollow(FOLLOW_ruleExperimentalDesign_in_entryRuleExperimentalDesign517);
            iv_ruleExperimentalDesign=ruleExperimentalDesign();

            state._fsp--;

             current =iv_ruleExperimentalDesign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentalDesign527); 

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
    // $ANTLR end "entryRuleExperimentalDesign"


    // $ANTLR start "ruleExperimentalDesign"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:280:1: ruleExperimentalDesign returns [EObject current=null] : ( (otherlv_0= 'Authorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' otherlv_9= '{' ( (lv_keyword_10_0= ruleKeyword ) )* otherlv_11= '}' )? (otherlv_12= 'Goals' otherlv_13= '{' ( (lv_goal_14_0= ruleGoal ) )* otherlv_15= '}' ) (otherlv_16= 'Research Questions' otherlv_17= '{' ( (lv_researchQuestion_18_0= ruleResearchQuestion ) )* otherlv_19= '}' )? (otherlv_20= 'Research Hypotheses' otherlv_21= '{' ( (lv_researchHypothesis_22_0= ruleResearchHypothesis ) )* otherlv_23= '}' )? (otherlv_24= 'Variables' otherlv_25= '{' ( (lv_variable_26_0= ruleVariable ) )* otherlv_27= '}' )? (otherlv_28= 'Dependent Variables' otherlv_29= '{' ( (lv_depVar_30_0= ruleDepVariable ) )* otherlv_31= '}' ) (otherlv_32= 'Factors' otherlv_33= '{' ( (lv_factor_34_0= ruleFactor ) )* otherlv_35= '}' ) (otherlv_36= 'DoE' otherlv_37= '=' ( (lv_type_38_0= ruleDesignType ) ) otherlv_39= '(' ( (lv_doe_40_0= ruleDOE ) ) otherlv_41= ')' ) (otherlv_42= 'Context' otherlv_43= '{' ( (lv_parameter_44_0= ruleParameter ) )* otherlv_45= '}' )? (otherlv_46= 'Internal Replication' ( (lv_replication_47_0= RULE_INT ) ) )? ) ;
    public final EObject ruleExperimentalDesign() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token lv_replication_47_0=null;
        EObject lv_author_2_0 = null;

        EObject lv_abstract_6_0 = null;

        EObject lv_keyword_10_0 = null;

        EObject lv_goal_14_0 = null;

        EObject lv_researchQuestion_18_0 = null;

        EObject lv_researchHypothesis_22_0 = null;

        EObject lv_variable_26_0 = null;

        EObject lv_depVar_30_0 = null;

        EObject lv_factor_34_0 = null;

        Enumerator lv_type_38_0 = null;

        EObject lv_doe_40_0 = null;

        EObject lv_parameter_44_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:283:28: ( ( (otherlv_0= 'Authorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' otherlv_9= '{' ( (lv_keyword_10_0= ruleKeyword ) )* otherlv_11= '}' )? (otherlv_12= 'Goals' otherlv_13= '{' ( (lv_goal_14_0= ruleGoal ) )* otherlv_15= '}' ) (otherlv_16= 'Research Questions' otherlv_17= '{' ( (lv_researchQuestion_18_0= ruleResearchQuestion ) )* otherlv_19= '}' )? (otherlv_20= 'Research Hypotheses' otherlv_21= '{' ( (lv_researchHypothesis_22_0= ruleResearchHypothesis ) )* otherlv_23= '}' )? (otherlv_24= 'Variables' otherlv_25= '{' ( (lv_variable_26_0= ruleVariable ) )* otherlv_27= '}' )? (otherlv_28= 'Dependent Variables' otherlv_29= '{' ( (lv_depVar_30_0= ruleDepVariable ) )* otherlv_31= '}' ) (otherlv_32= 'Factors' otherlv_33= '{' ( (lv_factor_34_0= ruleFactor ) )* otherlv_35= '}' ) (otherlv_36= 'DoE' otherlv_37= '=' ( (lv_type_38_0= ruleDesignType ) ) otherlv_39= '(' ( (lv_doe_40_0= ruleDOE ) ) otherlv_41= ')' ) (otherlv_42= 'Context' otherlv_43= '{' ( (lv_parameter_44_0= ruleParameter ) )* otherlv_45= '}' )? (otherlv_46= 'Internal Replication' ( (lv_replication_47_0= RULE_INT ) ) )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:1: ( (otherlv_0= 'Authorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' otherlv_9= '{' ( (lv_keyword_10_0= ruleKeyword ) )* otherlv_11= '}' )? (otherlv_12= 'Goals' otherlv_13= '{' ( (lv_goal_14_0= ruleGoal ) )* otherlv_15= '}' ) (otherlv_16= 'Research Questions' otherlv_17= '{' ( (lv_researchQuestion_18_0= ruleResearchQuestion ) )* otherlv_19= '}' )? (otherlv_20= 'Research Hypotheses' otherlv_21= '{' ( (lv_researchHypothesis_22_0= ruleResearchHypothesis ) )* otherlv_23= '}' )? (otherlv_24= 'Variables' otherlv_25= '{' ( (lv_variable_26_0= ruleVariable ) )* otherlv_27= '}' )? (otherlv_28= 'Dependent Variables' otherlv_29= '{' ( (lv_depVar_30_0= ruleDepVariable ) )* otherlv_31= '}' ) (otherlv_32= 'Factors' otherlv_33= '{' ( (lv_factor_34_0= ruleFactor ) )* otherlv_35= '}' ) (otherlv_36= 'DoE' otherlv_37= '=' ( (lv_type_38_0= ruleDesignType ) ) otherlv_39= '(' ( (lv_doe_40_0= ruleDOE ) ) otherlv_41= ')' ) (otherlv_42= 'Context' otherlv_43= '{' ( (lv_parameter_44_0= ruleParameter ) )* otherlv_45= '}' )? (otherlv_46= 'Internal Replication' ( (lv_replication_47_0= RULE_INT ) ) )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:1: ( (otherlv_0= 'Authorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' otherlv_9= '{' ( (lv_keyword_10_0= ruleKeyword ) )* otherlv_11= '}' )? (otherlv_12= 'Goals' otherlv_13= '{' ( (lv_goal_14_0= ruleGoal ) )* otherlv_15= '}' ) (otherlv_16= 'Research Questions' otherlv_17= '{' ( (lv_researchQuestion_18_0= ruleResearchQuestion ) )* otherlv_19= '}' )? (otherlv_20= 'Research Hypotheses' otherlv_21= '{' ( (lv_researchHypothesis_22_0= ruleResearchHypothesis ) )* otherlv_23= '}' )? (otherlv_24= 'Variables' otherlv_25= '{' ( (lv_variable_26_0= ruleVariable ) )* otherlv_27= '}' )? (otherlv_28= 'Dependent Variables' otherlv_29= '{' ( (lv_depVar_30_0= ruleDepVariable ) )* otherlv_31= '}' ) (otherlv_32= 'Factors' otherlv_33= '{' ( (lv_factor_34_0= ruleFactor ) )* otherlv_35= '}' ) (otherlv_36= 'DoE' otherlv_37= '=' ( (lv_type_38_0= ruleDesignType ) ) otherlv_39= '(' ( (lv_doe_40_0= ruleDOE ) ) otherlv_41= ')' ) (otherlv_42= 'Context' otherlv_43= '{' ( (lv_parameter_44_0= ruleParameter ) )* otherlv_45= '}' )? (otherlv_46= 'Internal Replication' ( (lv_replication_47_0= RULE_INT ) ) )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:2: (otherlv_0= 'Authorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' otherlv_9= '{' ( (lv_keyword_10_0= ruleKeyword ) )* otherlv_11= '}' )? (otherlv_12= 'Goals' otherlv_13= '{' ( (lv_goal_14_0= ruleGoal ) )* otherlv_15= '}' ) (otherlv_16= 'Research Questions' otherlv_17= '{' ( (lv_researchQuestion_18_0= ruleResearchQuestion ) )* otherlv_19= '}' )? (otherlv_20= 'Research Hypotheses' otherlv_21= '{' ( (lv_researchHypothesis_22_0= ruleResearchHypothesis ) )* otherlv_23= '}' )? (otherlv_24= 'Variables' otherlv_25= '{' ( (lv_variable_26_0= ruleVariable ) )* otherlv_27= '}' )? (otherlv_28= 'Dependent Variables' otherlv_29= '{' ( (lv_depVar_30_0= ruleDepVariable ) )* otherlv_31= '}' ) (otherlv_32= 'Factors' otherlv_33= '{' ( (lv_factor_34_0= ruleFactor ) )* otherlv_35= '}' ) (otherlv_36= 'DoE' otherlv_37= '=' ( (lv_type_38_0= ruleDesignType ) ) otherlv_39= '(' ( (lv_doe_40_0= ruleDOE ) ) otherlv_41= ')' ) (otherlv_42= 'Context' otherlv_43= '{' ( (lv_parameter_44_0= ruleParameter ) )* otherlv_45= '}' )? (otherlv_46= 'Internal Replication' ( (lv_replication_47_0= RULE_INT ) ) )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:2: (otherlv_0= 'Authorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:4: otherlv_0= 'Authorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalDesign565); 

                        	newLeafNode(otherlv_0, grammarAccess.getExperimentalDesignAccess().getAuthorshipKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign577); 

                        	newLeafNode(otherlv_1, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:292:1: ( (lv_author_2_0= ruleAuthor ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:293:1: (lv_author_2_0= ruleAuthor )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:293:1: (lv_author_2_0= ruleAuthor )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:294:3: lv_author_2_0= ruleAuthor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getAuthorAuthorParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAuthor_in_ruleExperimentalDesign598);
                    	    lv_author_2_0=ruleAuthor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"author",
                    	            		lv_author_2_0, 
                    	            		"Author");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign611); 

                        	newLeafNode(otherlv_3, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_0_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:314:3: (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:314:5: otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleExperimentalDesign626); 

                        	newLeafNode(otherlv_4, grammarAccess.getExperimentalDesignAccess().getAbstractKeyword_1_0());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign638); 

                        	newLeafNode(otherlv_5, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_1_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:322:1: ( (lv_abstract_6_0= ruleAbstract ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:323:1: (lv_abstract_6_0= ruleAbstract )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:323:1: (lv_abstract_6_0= ruleAbstract )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:324:3: lv_abstract_6_0= ruleAbstract
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getAbstractAbstractParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstract_in_ruleExperimentalDesign659);
                    lv_abstract_6_0=ruleAbstract();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	        }
                           		set(
                           			current, 
                           			"abstract",
                            		lv_abstract_6_0, 
                            		"Abstract");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign671); 

                        	newLeafNode(otherlv_7, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:344:3: (otherlv_8= 'Keywords' otherlv_9= '{' ( (lv_keyword_10_0= ruleKeyword ) )* otherlv_11= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:344:5: otherlv_8= 'Keywords' otherlv_9= '{' ( (lv_keyword_10_0= ruleKeyword ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleExperimentalDesign686); 

                        	newLeafNode(otherlv_8, grammarAccess.getExperimentalDesignAccess().getKeywordsKeyword_2_0());
                        
                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign698); 

                        	newLeafNode(otherlv_9, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:352:1: ( (lv_keyword_10_0= ruleKeyword ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_STRING) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:353:1: (lv_keyword_10_0= ruleKeyword )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:353:1: (lv_keyword_10_0= ruleKeyword )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:354:3: lv_keyword_10_0= ruleKeyword
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getKeywordKeywordParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleKeyword_in_ruleExperimentalDesign719);
                    	    lv_keyword_10_0=ruleKeyword();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"keyword",
                    	            		lv_keyword_10_0, 
                    	            		"Keyword");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign732); 

                        	newLeafNode(otherlv_11, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:374:3: (otherlv_12= 'Goals' otherlv_13= '{' ( (lv_goal_14_0= ruleGoal ) )* otherlv_15= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:374:5: otherlv_12= 'Goals' otherlv_13= '{' ( (lv_goal_14_0= ruleGoal ) )* otherlv_15= '}'
            {
            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleExperimentalDesign747); 

                	newLeafNode(otherlv_12, grammarAccess.getExperimentalDesignAccess().getGoalsKeyword_3_0());
                
            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign759); 

                	newLeafNode(otherlv_13, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_3_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:382:1: ( (lv_goal_14_0= ruleGoal ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:383:1: (lv_goal_14_0= ruleGoal )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:383:1: (lv_goal_14_0= ruleGoal )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:384:3: lv_goal_14_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getGoalGoalParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleExperimentalDesign780);
            	    lv_goal_14_0=ruleGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goal",
            	            		lv_goal_14_0, 
            	            		"Goal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign793); 

                	newLeafNode(otherlv_15, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_3_3());
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:404:2: (otherlv_16= 'Research Questions' otherlv_17= '{' ( (lv_researchQuestion_18_0= ruleResearchQuestion ) )* otherlv_19= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:404:4: otherlv_16= 'Research Questions' otherlv_17= '{' ( (lv_researchQuestion_18_0= ruleResearchQuestion ) )* otherlv_19= '}'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleExperimentalDesign807); 

                        	newLeafNode(otherlv_16, grammarAccess.getExperimentalDesignAccess().getResearchQuestionsKeyword_4_0());
                        
                    otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign819); 

                        	newLeafNode(otherlv_17, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:412:1: ( (lv_researchQuestion_18_0= ruleResearchQuestion ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:413:1: (lv_researchQuestion_18_0= ruleResearchQuestion )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:413:1: (lv_researchQuestion_18_0= ruleResearchQuestion )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:414:3: lv_researchQuestion_18_0= ruleResearchQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getResearchQuestionResearchQuestionParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResearchQuestion_in_ruleExperimentalDesign840);
                    	    lv_researchQuestion_18_0=ruleResearchQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"researchQuestion",
                    	            		lv_researchQuestion_18_0, 
                    	            		"ResearchQuestion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign853); 

                        	newLeafNode(otherlv_19, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:434:3: (otherlv_20= 'Research Hypotheses' otherlv_21= '{' ( (lv_researchHypothesis_22_0= ruleResearchHypothesis ) )* otherlv_23= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:434:5: otherlv_20= 'Research Hypotheses' otherlv_21= '{' ( (lv_researchHypothesis_22_0= ruleResearchHypothesis ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,22,FOLLOW_22_in_ruleExperimentalDesign868); 

                        	newLeafNode(otherlv_20, grammarAccess.getExperimentalDesignAccess().getResearchHypothesesKeyword_5_0());
                        
                    otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign880); 

                        	newLeafNode(otherlv_21, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:442:1: ( (lv_researchHypothesis_22_0= ruleResearchHypothesis ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:443:1: (lv_researchHypothesis_22_0= ruleResearchHypothesis )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:443:1: (lv_researchHypothesis_22_0= ruleResearchHypothesis )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:444:3: lv_researchHypothesis_22_0= ruleResearchHypothesis
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getResearchHypothesisResearchHypothesisParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResearchHypothesis_in_ruleExperimentalDesign901);
                    	    lv_researchHypothesis_22_0=ruleResearchHypothesis();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"researchHypothesis",
                    	            		lv_researchHypothesis_22_0, 
                    	            		"ResearchHypothesis");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign914); 

                        	newLeafNode(otherlv_23, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:464:3: (otherlv_24= 'Variables' otherlv_25= '{' ( (lv_variable_26_0= ruleVariable ) )* otherlv_27= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:464:5: otherlv_24= 'Variables' otherlv_25= '{' ( (lv_variable_26_0= ruleVariable ) )* otherlv_27= '}'
                    {
                    otherlv_24=(Token)match(input,23,FOLLOW_23_in_ruleExperimentalDesign929); 

                        	newLeafNode(otherlv_24, grammarAccess.getExperimentalDesignAccess().getVariablesKeyword_6_0());
                        
                    otherlv_25=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign941); 

                        	newLeafNode(otherlv_25, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:472:1: ( (lv_variable_26_0= ruleVariable ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:473:1: (lv_variable_26_0= ruleVariable )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:473:1: (lv_variable_26_0= ruleVariable )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:474:3: lv_variable_26_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getVariableVariableParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleExperimentalDesign962);
                    	    lv_variable_26_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variable",
                    	            		lv_variable_26_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign975); 

                        	newLeafNode(otherlv_27, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:494:3: (otherlv_28= 'Dependent Variables' otherlv_29= '{' ( (lv_depVar_30_0= ruleDepVariable ) )* otherlv_31= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:494:5: otherlv_28= 'Dependent Variables' otherlv_29= '{' ( (lv_depVar_30_0= ruleDepVariable ) )* otherlv_31= '}'
            {
            otherlv_28=(Token)match(input,24,FOLLOW_24_in_ruleExperimentalDesign990); 

                	newLeafNode(otherlv_28, grammarAccess.getExperimentalDesignAccess().getDependentVariablesKeyword_7_0());
                
            otherlv_29=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign1002); 

                	newLeafNode(otherlv_29, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_7_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:502:1: ( (lv_depVar_30_0= ruleDepVariable ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:503:1: (lv_depVar_30_0= ruleDepVariable )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:503:1: (lv_depVar_30_0= ruleDepVariable )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:504:3: lv_depVar_30_0= ruleDepVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getDepVarDepVariableParserRuleCall_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDepVariable_in_ruleExperimentalDesign1023);
            	    lv_depVar_30_0=ruleDepVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"depVar",
            	            		lv_depVar_30_0, 
            	            		"DepVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_31=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign1036); 

                	newLeafNode(otherlv_31, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_7_3());
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:524:2: (otherlv_32= 'Factors' otherlv_33= '{' ( (lv_factor_34_0= ruleFactor ) )* otherlv_35= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:524:4: otherlv_32= 'Factors' otherlv_33= '{' ( (lv_factor_34_0= ruleFactor ) )* otherlv_35= '}'
            {
            otherlv_32=(Token)match(input,25,FOLLOW_25_in_ruleExperimentalDesign1050); 

                	newLeafNode(otherlv_32, grammarAccess.getExperimentalDesignAccess().getFactorsKeyword_8_0());
                
            otherlv_33=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign1062); 

                	newLeafNode(otherlv_33, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_8_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:532:1: ( (lv_factor_34_0= ruleFactor ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:533:1: (lv_factor_34_0= ruleFactor )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:533:1: (lv_factor_34_0= ruleFactor )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:534:3: lv_factor_34_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getFactorFactorParserRuleCall_8_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleExperimentalDesign1083);
            	    lv_factor_34_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factor",
            	            		lv_factor_34_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_35=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign1096); 

                	newLeafNode(otherlv_35, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_8_3());
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:554:2: (otherlv_36= 'DoE' otherlv_37= '=' ( (lv_type_38_0= ruleDesignType ) ) otherlv_39= '(' ( (lv_doe_40_0= ruleDOE ) ) otherlv_41= ')' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:554:4: otherlv_36= 'DoE' otherlv_37= '=' ( (lv_type_38_0= ruleDesignType ) ) otherlv_39= '(' ( (lv_doe_40_0= ruleDOE ) ) otherlv_41= ')'
            {
            otherlv_36=(Token)match(input,26,FOLLOW_26_in_ruleExperimentalDesign1110); 

                	newLeafNode(otherlv_36, grammarAccess.getExperimentalDesignAccess().getDoEKeyword_9_0());
                
            otherlv_37=(Token)match(input,27,FOLLOW_27_in_ruleExperimentalDesign1122); 

                	newLeafNode(otherlv_37, grammarAccess.getExperimentalDesignAccess().getEqualsSignKeyword_9_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:562:1: ( (lv_type_38_0= ruleDesignType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:563:1: (lv_type_38_0= ruleDesignType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:563:1: (lv_type_38_0= ruleDesignType )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:564:3: lv_type_38_0= ruleDesignType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getTypeDesignTypeEnumRuleCall_9_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignType_in_ruleExperimentalDesign1143);
            lv_type_38_0=ruleDesignType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_38_0, 
                    		"DesignType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_39=(Token)match(input,28,FOLLOW_28_in_ruleExperimentalDesign1155); 

                	newLeafNode(otherlv_39, grammarAccess.getExperimentalDesignAccess().getLeftParenthesisKeyword_9_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:584:1: ( (lv_doe_40_0= ruleDOE ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:585:1: (lv_doe_40_0= ruleDOE )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:585:1: (lv_doe_40_0= ruleDOE )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:586:3: lv_doe_40_0= ruleDOE
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getDoeDOEParserRuleCall_9_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDOE_in_ruleExperimentalDesign1176);
            lv_doe_40_0=ruleDOE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	        }
                   		set(
                   			current, 
                   			"doe",
                    		lv_doe_40_0, 
                    		"DOE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_41=(Token)match(input,29,FOLLOW_29_in_ruleExperimentalDesign1188); 

                	newLeafNode(otherlv_41, grammarAccess.getExperimentalDesignAccess().getRightParenthesisKeyword_9_5());
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:606:2: (otherlv_42= 'Context' otherlv_43= '{' ( (lv_parameter_44_0= ruleParameter ) )* otherlv_45= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:606:4: otherlv_42= 'Context' otherlv_43= '{' ( (lv_parameter_44_0= ruleParameter ) )* otherlv_45= '}'
                    {
                    otherlv_42=(Token)match(input,30,FOLLOW_30_in_ruleExperimentalDesign1202); 

                        	newLeafNode(otherlv_42, grammarAccess.getExperimentalDesignAccess().getContextKeyword_10_0());
                        
                    otherlv_43=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign1214); 

                        	newLeafNode(otherlv_43, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:614:1: ( (lv_parameter_44_0= ruleParameter ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:615:1: (lv_parameter_44_0= ruleParameter )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:615:1: (lv_parameter_44_0= ruleParameter )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:616:3: lv_parameter_44_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getParameterParameterParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleExperimentalDesign1235);
                    	    lv_parameter_44_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameter",
                    	            		lv_parameter_44_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign1248); 

                        	newLeafNode(otherlv_45, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_10_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:636:3: (otherlv_46= 'Internal Replication' ( (lv_replication_47_0= RULE_INT ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:636:5: otherlv_46= 'Internal Replication' ( (lv_replication_47_0= RULE_INT ) )
                    {
                    otherlv_46=(Token)match(input,31,FOLLOW_31_in_ruleExperimentalDesign1263); 

                        	newLeafNode(otherlv_46, grammarAccess.getExperimentalDesignAccess().getInternalReplicationKeyword_11_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:640:1: ( (lv_replication_47_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:641:1: (lv_replication_47_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:641:1: (lv_replication_47_0= RULE_INT )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:642:3: lv_replication_47_0= RULE_INT
                    {
                    lv_replication_47_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExperimentalDesign1280); 

                    			newLeafNode(lv_replication_47_0, grammarAccess.getExperimentalDesignAccess().getReplicationINTTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentalDesignRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"replication",
                            		lv_replication_47_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleExperimentalDesign"


    // $ANTLR start "entryRuleAuthor"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:666:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:667:2: (iv_ruleAuthor= ruleAuthor EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:668:2: iv_ruleAuthor= ruleAuthor EOF
            {
             newCompositeNode(grammarAccess.getAuthorRule()); 
            pushFollow(FOLLOW_ruleAuthor_in_entryRuleAuthor1323);
            iv_ruleAuthor=ruleAuthor();

            state._fsp--;

             current =iv_ruleAuthor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthor1333); 

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
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:675:1: ruleAuthor returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:678:28: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:679:1: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:679:1: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:679:2: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:679:2: ( (lv_identifier_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:680:1: (lv_identifier_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:680:1: (lv_identifier_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:681:3: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAuthor1375); 

            			newLeafNode(lv_identifier_0_0, grammarAccess.getAuthorAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAuthorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:697:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:698:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:698:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:699:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAuthor1397); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAuthorAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAuthorRule());
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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleAbstract"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:723:1: entryRuleAbstract returns [EObject current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final EObject entryRuleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstract = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:724:2: (iv_ruleAbstract= ruleAbstract EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:725:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract1438);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract1448); 

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
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:732:1: ruleAbstract returns [EObject current=null] : (this_SimpleAbstract_0= ruleSimpleAbstract | this_StructuredAbstract_1= ruleStructuredAbstract ) ;
    public final EObject ruleAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAbstract_0 = null;

        EObject this_StructuredAbstract_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:735:28: ( (this_SimpleAbstract_0= ruleSimpleAbstract | this_StructuredAbstract_1= ruleStructuredAbstract ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:736:1: (this_SimpleAbstract_0= ruleSimpleAbstract | this_StructuredAbstract_1= ruleStructuredAbstract )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:736:1: (this_SimpleAbstract_0= ruleSimpleAbstract | this_StructuredAbstract_1= ruleStructuredAbstract )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==EOF||LA22_0==17||(LA22_0>=32 && LA22_0<=37)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:737:5: this_SimpleAbstract_0= ruleSimpleAbstract
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getSimpleAbstractParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleAbstract_in_ruleAbstract1495);
                    this_SimpleAbstract_0=ruleSimpleAbstract();

                    state._fsp--;

                     
                            current = this_SimpleAbstract_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:747:5: this_StructuredAbstract_1= ruleStructuredAbstract
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getStructuredAbstractParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStructuredAbstract_in_ruleAbstract1522);
                    this_StructuredAbstract_1=ruleStructuredAbstract();

                    state._fsp--;

                     
                            current = this_StructuredAbstract_1; 
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
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleSimpleAbstract"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:763:1: entryRuleSimpleAbstract returns [EObject current=null] : iv_ruleSimpleAbstract= ruleSimpleAbstract EOF ;
    public final EObject entryRuleSimpleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAbstract = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:764:2: (iv_ruleSimpleAbstract= ruleSimpleAbstract EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:765:2: iv_ruleSimpleAbstract= ruleSimpleAbstract EOF
            {
             newCompositeNode(grammarAccess.getSimpleAbstractRule()); 
            pushFollow(FOLLOW_ruleSimpleAbstract_in_entryRuleSimpleAbstract1557);
            iv_ruleSimpleAbstract=ruleSimpleAbstract();

            state._fsp--;

             current =iv_ruleSimpleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAbstract1567); 

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
    // $ANTLR end "entryRuleSimpleAbstract"


    // $ANTLR start "ruleSimpleAbstract"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:772:1: ruleSimpleAbstract returns [EObject current=null] : ( (lv_description_0_0= RULE_STRING ) ) ;
    public final EObject ruleSimpleAbstract() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:775:28: ( ( (lv_description_0_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:776:1: ( (lv_description_0_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:776:1: ( (lv_description_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:777:1: (lv_description_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:777:1: (lv_description_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:778:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleAbstract1608); 

            			newLeafNode(lv_description_0_0, grammarAccess.getSimpleAbstractAccess().getDescriptionSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleAbstractRule());
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
    // $ANTLR end "ruleSimpleAbstract"


    // $ANTLR start "entryRuleStructuredAbstract"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:802:1: entryRuleStructuredAbstract returns [EObject current=null] : iv_ruleStructuredAbstract= ruleStructuredAbstract EOF ;
    public final EObject entryRuleStructuredAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredAbstract = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:803:2: (iv_ruleStructuredAbstract= ruleStructuredAbstract EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:804:2: iv_ruleStructuredAbstract= ruleStructuredAbstract EOF
            {
             newCompositeNode(grammarAccess.getStructuredAbstractRule()); 
            pushFollow(FOLLOW_ruleStructuredAbstract_in_entryRuleStructuredAbstract1648);
            iv_ruleStructuredAbstract=ruleStructuredAbstract();

            state._fsp--;

             current =iv_ruleStructuredAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuredAbstract1658); 

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
    // $ANTLR end "entryRuleStructuredAbstract"


    // $ANTLR start "ruleStructuredAbstract"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:811:1: ruleStructuredAbstract returns [EObject current=null] : ( () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStructuredAbstract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_background_2_0=null;
        Token otherlv_3=null;
        Token lv_objective_4_0=null;
        Token otherlv_5=null;
        Token lv_methods_6_0=null;
        Token otherlv_7=null;
        Token lv_results_8_0=null;
        Token otherlv_9=null;
        Token lv_limitations_10_0=null;
        Token otherlv_11=null;
        Token lv_conclusions_12_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:814:28: ( ( () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:815:1: ( () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:815:1: ( () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:815:2: () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:815:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:816:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructuredAbstractAccess().getStructuredAbstractAction_0(),
                        current);
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:821:2: (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:821:4: otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStructuredAbstract1705); 

                        	newLeafNode(otherlv_1, grammarAccess.getStructuredAbstractAccess().getBackgroundKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:825:1: ( (lv_background_2_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:826:1: (lv_background_2_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:826:1: (lv_background_2_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:827:3: lv_background_2_0= RULE_STRING
                    {
                    lv_background_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1722); 

                    			newLeafNode(lv_background_2_0, grammarAccess.getStructuredAbstractAccess().getBackgroundSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructuredAbstractRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"background",
                            		lv_background_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:843:4: (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:843:6: otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleStructuredAbstract1742); 

                        	newLeafNode(otherlv_3, grammarAccess.getStructuredAbstractAccess().getObjectiveKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:847:1: ( (lv_objective_4_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:848:1: (lv_objective_4_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:848:1: (lv_objective_4_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:849:3: lv_objective_4_0= RULE_STRING
                    {
                    lv_objective_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1759); 

                    			newLeafNode(lv_objective_4_0, grammarAccess.getStructuredAbstractAccess().getObjectiveSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructuredAbstractRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"objective",
                            		lv_objective_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:865:4: (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:865:6: otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleStructuredAbstract1779); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructuredAbstractAccess().getMethodsKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:869:1: ( (lv_methods_6_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:870:1: (lv_methods_6_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:870:1: (lv_methods_6_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:871:3: lv_methods_6_0= RULE_STRING
                    {
                    lv_methods_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1796); 

                    			newLeafNode(lv_methods_6_0, grammarAccess.getStructuredAbstractAccess().getMethodsSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructuredAbstractRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"methods",
                            		lv_methods_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:887:4: (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:887:6: otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleStructuredAbstract1816); 

                        	newLeafNode(otherlv_7, grammarAccess.getStructuredAbstractAccess().getResultsKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:891:1: ( (lv_results_8_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:892:1: (lv_results_8_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:892:1: (lv_results_8_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:893:3: lv_results_8_0= RULE_STRING
                    {
                    lv_results_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1833); 

                    			newLeafNode(lv_results_8_0, grammarAccess.getStructuredAbstractAccess().getResultsSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructuredAbstractRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"results",
                            		lv_results_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:909:4: (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:909:6: otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleStructuredAbstract1853); 

                        	newLeafNode(otherlv_9, grammarAccess.getStructuredAbstractAccess().getLimitationsKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:913:1: ( (lv_limitations_10_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:914:1: (lv_limitations_10_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:914:1: (lv_limitations_10_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:915:3: lv_limitations_10_0= RULE_STRING
                    {
                    lv_limitations_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1870); 

                    			newLeafNode(lv_limitations_10_0, grammarAccess.getStructuredAbstractAccess().getLimitationsSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructuredAbstractRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"limitations",
                            		lv_limitations_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:931:4: (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:931:6: otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleStructuredAbstract1890); 

                        	newLeafNode(otherlv_11, grammarAccess.getStructuredAbstractAccess().getConclusionsKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:935:1: ( (lv_conclusions_12_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:936:1: (lv_conclusions_12_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:936:1: (lv_conclusions_12_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:937:3: lv_conclusions_12_0= RULE_STRING
                    {
                    lv_conclusions_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1907); 

                    			newLeafNode(lv_conclusions_12_0, grammarAccess.getStructuredAbstractAccess().getConclusionsSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructuredAbstractRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"conclusions",
                            		lv_conclusions_12_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "ruleStructuredAbstract"


    // $ANTLR start "entryRuleKeyword"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:961:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:962:2: (iv_ruleKeyword= ruleKeyword EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:963:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword1950);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword1960); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:970:1: ruleKeyword returns [EObject current=null] : ( (lv_description_0_0= RULE_STRING ) ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:973:28: ( ( (lv_description_0_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:974:1: ( (lv_description_0_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:974:1: ( (lv_description_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:975:1: (lv_description_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:975:1: (lv_description_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:976:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKeyword2001); 

            			newLeafNode(lv_description_0_0, grammarAccess.getKeywordAccess().getDescriptionSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeywordRule());
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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1000:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1001:2: (iv_ruleGoal= ruleGoal EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1002:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2041);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2051); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1009:1: ruleGoal returns [EObject current=null] : (this_StructuredGoal_0= ruleStructuredGoal | this_SimpleGoal_1= ruleSimpleGoal ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        EObject this_StructuredGoal_0 = null;

        EObject this_SimpleGoal_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1012:28: ( (this_StructuredGoal_0= ruleStructuredGoal | this_SimpleGoal_1= ruleSimpleGoal ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1013:1: (this_StructuredGoal_0= ruleStructuredGoal | this_SimpleGoal_1= ruleSimpleGoal )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1013:1: (this_StructuredGoal_0= ruleStructuredGoal | this_SimpleGoal_1= ruleSimpleGoal )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1014:5: this_StructuredGoal_0= ruleStructuredGoal
                    {
                     
                            newCompositeNode(grammarAccess.getGoalAccess().getStructuredGoalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructuredGoal_in_ruleGoal2098);
                    this_StructuredGoal_0=ruleStructuredGoal();

                    state._fsp--;

                     
                            current = this_StructuredGoal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1024:5: this_SimpleGoal_1= ruleSimpleGoal
                    {
                     
                            newCompositeNode(grammarAccess.getGoalAccess().getSimpleGoalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleGoal_in_ruleGoal2125);
                    this_SimpleGoal_1=ruleSimpleGoal();

                    state._fsp--;

                     
                            current = this_SimpleGoal_1; 
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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleSimpleGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1040:1: entryRuleSimpleGoal returns [EObject current=null] : iv_ruleSimpleGoal= ruleSimpleGoal EOF ;
    public final EObject entryRuleSimpleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleGoal = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1041:2: (iv_ruleSimpleGoal= ruleSimpleGoal EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1042:2: iv_ruleSimpleGoal= ruleSimpleGoal EOF
            {
             newCompositeNode(grammarAccess.getSimpleGoalRule()); 
            pushFollow(FOLLOW_ruleSimpleGoal_in_entryRuleSimpleGoal2160);
            iv_ruleSimpleGoal=ruleSimpleGoal();

            state._fsp--;

             current =iv_ruleSimpleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleGoal2170); 

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
    // $ANTLR end "entryRuleSimpleGoal"


    // $ANTLR start "ruleSimpleGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1049:1: ruleSimpleGoal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleSimpleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1052:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1053:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1053:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1053:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1053:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1054:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1054:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1055:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleGoal2212); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleGoalAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1071:2: ( (lv_description_1_0= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1072:1: (lv_description_1_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1072:1: (lv_description_1_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1073:3: lv_description_1_0= RULE_STRING
                    {
                    lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleGoal2234); 

                    			newLeafNode(lv_description_1_0, grammarAccess.getSimpleGoalAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleGoalRule());
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
    // $ANTLR end "ruleSimpleGoal"


    // $ANTLR start "entryRuleStructuredGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1097:1: entryRuleStructuredGoal returns [EObject current=null] : iv_ruleStructuredGoal= ruleStructuredGoal EOF ;
    public final EObject entryRuleStructuredGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredGoal = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1098:2: (iv_ruleStructuredGoal= ruleStructuredGoal EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1099:2: iv_ruleStructuredGoal= ruleStructuredGoal EOF
            {
             newCompositeNode(grammarAccess.getStructuredGoalRule()); 
            pushFollow(FOLLOW_ruleStructuredGoal_in_entryRuleStructuredGoal2276);
            iv_ruleStructuredGoal=ruleStructuredGoal();

            state._fsp--;

             current =iv_ruleStructuredGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuredGoal2286); 

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
    // $ANTLR end "entryRuleStructuredGoal"


    // $ANTLR start "ruleStructuredGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1106:1: ruleStructuredGoal returns [EObject current=null] : (otherlv_0= 'Analyze' ( (lv_object_1_0= RULE_STRING ) ) otherlv_2= 'for the purpose of' ( (lv_technique_3_0= RULE_STRING ) ) otherlv_4= 'with respect to their' ( (lv_quality_5_0= RULE_STRING ) ) otherlv_6= 'the point of view of the' ( (lv_ptView_7_0= RULE_STRING ) ) otherlv_8= 'in the context of' ( (lv_contextOf_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleStructuredGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_object_1_0=null;
        Token otherlv_2=null;
        Token lv_technique_3_0=null;
        Token otherlv_4=null;
        Token lv_quality_5_0=null;
        Token otherlv_6=null;
        Token lv_ptView_7_0=null;
        Token otherlv_8=null;
        Token lv_contextOf_9_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1109:28: ( (otherlv_0= 'Analyze' ( (lv_object_1_0= RULE_STRING ) ) otherlv_2= 'for the purpose of' ( (lv_technique_3_0= RULE_STRING ) ) otherlv_4= 'with respect to their' ( (lv_quality_5_0= RULE_STRING ) ) otherlv_6= 'the point of view of the' ( (lv_ptView_7_0= RULE_STRING ) ) otherlv_8= 'in the context of' ( (lv_contextOf_9_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1110:1: (otherlv_0= 'Analyze' ( (lv_object_1_0= RULE_STRING ) ) otherlv_2= 'for the purpose of' ( (lv_technique_3_0= RULE_STRING ) ) otherlv_4= 'with respect to their' ( (lv_quality_5_0= RULE_STRING ) ) otherlv_6= 'the point of view of the' ( (lv_ptView_7_0= RULE_STRING ) ) otherlv_8= 'in the context of' ( (lv_contextOf_9_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1110:1: (otherlv_0= 'Analyze' ( (lv_object_1_0= RULE_STRING ) ) otherlv_2= 'for the purpose of' ( (lv_technique_3_0= RULE_STRING ) ) otherlv_4= 'with respect to their' ( (lv_quality_5_0= RULE_STRING ) ) otherlv_6= 'the point of view of the' ( (lv_ptView_7_0= RULE_STRING ) ) otherlv_8= 'in the context of' ( (lv_contextOf_9_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1110:3: otherlv_0= 'Analyze' ( (lv_object_1_0= RULE_STRING ) ) otherlv_2= 'for the purpose of' ( (lv_technique_3_0= RULE_STRING ) ) otherlv_4= 'with respect to their' ( (lv_quality_5_0= RULE_STRING ) ) otherlv_6= 'the point of view of the' ( (lv_ptView_7_0= RULE_STRING ) ) otherlv_8= 'in the context of' ( (lv_contextOf_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleStructuredGoal2323); 

                	newLeafNode(otherlv_0, grammarAccess.getStructuredGoalAccess().getAnalyzeKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1114:1: ( (lv_object_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1115:1: (lv_object_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1115:1: (lv_object_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1116:3: lv_object_1_0= RULE_STRING
            {
            lv_object_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredGoal2340); 

            			newLeafNode(lv_object_1_0, grammarAccess.getStructuredGoalAccess().getObjectSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructuredGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"object",
                    		lv_object_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleStructuredGoal2357); 

                	newLeafNode(otherlv_2, grammarAccess.getStructuredGoalAccess().getForThePurposeOfKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1136:1: ( (lv_technique_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1137:1: (lv_technique_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1137:1: (lv_technique_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1138:3: lv_technique_3_0= RULE_STRING
            {
            lv_technique_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredGoal2374); 

            			newLeafNode(lv_technique_3_0, grammarAccess.getStructuredGoalAccess().getTechniqueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructuredGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"technique",
                    		lv_technique_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleStructuredGoal2391); 

                	newLeafNode(otherlv_4, grammarAccess.getStructuredGoalAccess().getWithRespectToTheirKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1158:1: ( (lv_quality_5_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1159:1: (lv_quality_5_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1159:1: (lv_quality_5_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1160:3: lv_quality_5_0= RULE_STRING
            {
            lv_quality_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredGoal2408); 

            			newLeafNode(lv_quality_5_0, grammarAccess.getStructuredGoalAccess().getQualitySTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructuredGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"quality",
                    		lv_quality_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleStructuredGoal2425); 

                	newLeafNode(otherlv_6, grammarAccess.getStructuredGoalAccess().getThePointOfViewOfTheKeyword_6());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1180:1: ( (lv_ptView_7_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1181:1: (lv_ptView_7_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1181:1: (lv_ptView_7_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1182:3: lv_ptView_7_0= RULE_STRING
            {
            lv_ptView_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredGoal2442); 

            			newLeafNode(lv_ptView_7_0, grammarAccess.getStructuredGoalAccess().getPtViewSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructuredGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ptView",
                    		lv_ptView_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleStructuredGoal2459); 

                	newLeafNode(otherlv_8, grammarAccess.getStructuredGoalAccess().getInTheContextOfKeyword_8());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1202:1: ( (lv_contextOf_9_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1203:1: (lv_contextOf_9_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1203:1: (lv_contextOf_9_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1204:3: lv_contextOf_9_0= RULE_STRING
            {
            lv_contextOf_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredGoal2476); 

            			newLeafNode(lv_contextOf_9_0, grammarAccess.getStructuredGoalAccess().getContextOfSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructuredGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"contextOf",
                    		lv_contextOf_9_0, 
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
    // $ANTLR end "ruleStructuredGoal"


    // $ANTLR start "entryRuleResearchQuestion"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1228:1: entryRuleResearchQuestion returns [EObject current=null] : iv_ruleResearchQuestion= ruleResearchQuestion EOF ;
    public final EObject entryRuleResearchQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchQuestion = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1229:2: (iv_ruleResearchQuestion= ruleResearchQuestion EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1230:2: iv_ruleResearchQuestion= ruleResearchQuestion EOF
            {
             newCompositeNode(grammarAccess.getResearchQuestionRule()); 
            pushFollow(FOLLOW_ruleResearchQuestion_in_entryRuleResearchQuestion2517);
            iv_ruleResearchQuestion=ruleResearchQuestion();

            state._fsp--;

             current =iv_ruleResearchQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResearchQuestion2527); 

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
    // $ANTLR end "entryRuleResearchQuestion"


    // $ANTLR start "ruleResearchQuestion"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1237:1: ruleResearchQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleResearchQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1240:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1241:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1241:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1241:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1241:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1242:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1242:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1243:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResearchQuestion2569); 

            			newLeafNode(lv_name_0_0, grammarAccess.getResearchQuestionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResearchQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1259:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1260:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1260:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1261:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResearchQuestion2591); 

            			newLeafNode(lv_description_1_0, grammarAccess.getResearchQuestionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResearchQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleResearchQuestion2608); 

                	newLeafNode(otherlv_2, grammarAccess.getResearchQuestionAccess().getRelatesToKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1281:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1282:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1282:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1283:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResearchQuestionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResearchQuestionAccess().getGoalGoalCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleResearchQuestion2631);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleResearchQuestion"


    // $ANTLR start "entryRuleResearchHypothesis"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1304:1: entryRuleResearchHypothesis returns [EObject current=null] : iv_ruleResearchHypothesis= ruleResearchHypothesis EOF ;
    public final EObject entryRuleResearchHypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchHypothesis = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1305:2: (iv_ruleResearchHypothesis= ruleResearchHypothesis EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1306:2: iv_ruleResearchHypothesis= ruleResearchHypothesis EOF
            {
             newCompositeNode(grammarAccess.getResearchHypothesisRule()); 
            pushFollow(FOLLOW_ruleResearchHypothesis_in_entryRuleResearchHypothesis2667);
            iv_ruleResearchHypothesis=ruleResearchHypothesis();

            state._fsp--;

             current =iv_ruleResearchHypothesis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResearchHypothesis2677); 

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
    // $ANTLR end "entryRuleResearchHypothesis"


    // $ANTLR start "ruleResearchHypothesis"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1313:1: ruleResearchHypothesis returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleResearchHypothesis() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1316:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1317:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1317:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1317:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1317:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1318:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1318:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1319:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResearchHypothesis2719); 

            			newLeafNode(lv_name_0_0, grammarAccess.getResearchHypothesisAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResearchHypothesisRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1335:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1336:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1336:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1337:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResearchHypothesis2741); 

            			newLeafNode(lv_description_1_0, grammarAccess.getResearchHypothesisAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResearchHypothesisRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleResearchHypothesis2758); 

                	newLeafNode(otherlv_2, grammarAccess.getResearchHypothesisAccess().getRelatesToKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1357:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1358:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1358:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1359:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResearchHypothesisRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResearchHypothesisAccess().getGoalGoalCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleResearchHypothesis2781);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleResearchHypothesis"


    // $ANTLR start "entryRuleVariable"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1380:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1381:2: (iv_ruleVariable= ruleVariable EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1382:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2817);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2827); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1389:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_scaleType_3_0 = null;

        EObject lv_range_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1392:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1393:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1393:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1393:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1393:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1394:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1394:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1395:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2869); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1411:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1412:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1412:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1413:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2891); 

            			newLeafNode(lv_description_1_0, grammarAccess.getVariableAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1429:2: (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1429:4: otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) )
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleVariable2909); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getScaleKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1433:1: ( (lv_scaleType_3_0= ruleScaleType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1434:1: (lv_scaleType_3_0= ruleScaleType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1434:1: (lv_scaleType_3_0= ruleScaleType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1435:3: lv_scaleType_3_0= ruleScaleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getScaleTypeScaleTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScaleType_in_ruleVariable2930);
                    lv_scaleType_3_0=ruleScaleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"scaleType",
                            		lv_scaleType_3_0, 
                            		"ScaleType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1451:4: (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1451:6: otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleVariable2945); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getRangeKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleVariable2957); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1459:1: ( (lv_range_6_0= ruleRange ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1460:1: (lv_range_6_0= ruleRange )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1460:1: (lv_range_6_0= ruleRange )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1461:3: lv_range_6_0= ruleRange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariableAccess().getRangeRangeParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRange_in_ruleVariable2978);
                    	    lv_range_6_0=ruleRange();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"range",
                    	            		lv_range_6_0, 
                    	            		"Range");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleVariable2991); 

                        	newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_3_3());
                        

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleRange"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1489:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1490:2: (iv_ruleRange= ruleRange EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1491:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange3029);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3039); 

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1498:1: ruleRange returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1501:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1502:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1502:1: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1503:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1503:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1504:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRange3080); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRangeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRangeRule());
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleDepVariable"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1528:1: entryRuleDepVariable returns [EObject current=null] : iv_ruleDepVariable= ruleDepVariable EOF ;
    public final EObject entryRuleDepVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepVariable = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1529:2: (iv_ruleDepVariable= ruleDepVariable EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1530:2: iv_ruleDepVariable= ruleDepVariable EOF
            {
             newCompositeNode(grammarAccess.getDepVariableRule()); 
            pushFollow(FOLLOW_ruleDepVariable_in_entryRuleDepVariable3120);
            iv_ruleDepVariable=ruleDepVariable();

            state._fsp--;

             current =iv_ruleDepVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDepVariable3130); 

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
    // $ANTLR end "entryRuleDepVariable"


    // $ANTLR start "ruleDepVariable"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1537:1: ruleDepVariable returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'RQ' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'RH' ( ( ruleQualifiedName ) ) ) ) ) ;
    public final EObject ruleDepVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1540:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'RQ' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'RH' ( ( ruleQualifiedName ) ) ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1541:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'RQ' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'RH' ( ( ruleQualifiedName ) ) ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1541:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'RQ' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'RH' ( ( ruleQualifiedName ) ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1541:2: ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'RQ' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'RH' ( ( ruleQualifiedName ) ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1541:2: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1542:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1542:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1543:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDepVariableRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDepVariableAccess().getVariableVariableCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDepVariable3178);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleDepVariable3190); 

                	newLeafNode(otherlv_1, grammarAccess.getDepVariableAccess().getRelatesToKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1560:1: ( (otherlv_2= 'RQ' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'RH' ( ( ruleQualifiedName ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            else if ( (LA34_0==47) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1560:2: (otherlv_2= 'RQ' ( ( ruleQualifiedName ) ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1560:2: (otherlv_2= 'RQ' ( ( ruleQualifiedName ) ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1560:4: otherlv_2= 'RQ' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleDepVariable3204); 

                        	newLeafNode(otherlv_2, grammarAccess.getDepVariableAccess().getRQKeyword_2_0_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1564:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1565:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1565:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1566:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDepVariableRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDepVariableAccess().getRqResearchQuestionCrossReference_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDepVariable3227);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1580:6: (otherlv_4= 'RH' ( ( ruleQualifiedName ) ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1580:6: (otherlv_4= 'RH' ( ( ruleQualifiedName ) ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1580:8: otherlv_4= 'RH' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleDepVariable3247); 

                        	newLeafNode(otherlv_4, grammarAccess.getDepVariableAccess().getRHKeyword_2_1_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1584:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1585:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1585:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1586:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDepVariableRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDepVariableAccess().getRhResearchHypothesisCrossReference_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDepVariable3270);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleDepVariable"


    // $ANTLR start "entryRuleFactor"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1607:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1608:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1609:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor3308);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor3318); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1616:1: ruleFactor returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1619:28: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1620:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1620:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1621:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1621:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1622:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFactorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFactorAccess().getNameVariableCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFactor3365);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleDOE"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1643:1: entryRuleDOE returns [EObject current=null] : iv_ruleDOE= ruleDOE EOF ;
    public final EObject entryRuleDOE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOE = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1644:2: (iv_ruleDOE= ruleDOE EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1645:2: iv_ruleDOE= ruleDOE EOF
            {
             newCompositeNode(grammarAccess.getDOERule()); 
            pushFollow(FOLLOW_ruleDOE_in_entryRuleDOE3400);
            iv_ruleDOE=ruleDOE();

            state._fsp--;

             current =iv_ruleDOE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOE3410); 

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
    // $ANTLR end "entryRuleDOE"


    // $ANTLR start "ruleDOE"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1652:1: ruleDOE returns [EObject current=null] : (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB ) ;
    public final EObject ruleDOE() throws RecognitionException {
        EObject current = null;

        EObject this_LS_0 = null;

        EObject this_RCBD_1 = null;

        EObject this_CRB_2 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1655:28: ( (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1656:1: (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1656:1: (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt35=1;
                }
                break;
            case 52:
                {
                alt35=2;
                }
                break;
            case 51:
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
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1657:5: this_LS_0= ruleLS
                    {
                     
                            newCompositeNode(grammarAccess.getDOEAccess().getLSParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLS_in_ruleDOE3457);
                    this_LS_0=ruleLS();

                    state._fsp--;

                     
                            current = this_LS_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1667:5: this_RCBD_1= ruleRCBD
                    {
                     
                            newCompositeNode(grammarAccess.getDOEAccess().getRCBDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRCBD_in_ruleDOE3484);
                    this_RCBD_1=ruleRCBD();

                    state._fsp--;

                     
                            current = this_RCBD_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1677:5: this_CRB_2= ruleCRB
                    {
                     
                            newCompositeNode(grammarAccess.getDOEAccess().getCRBParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCRB_in_ruleDOE3511);
                    this_CRB_2=ruleCRB();

                    state._fsp--;

                     
                            current = this_CRB_2; 
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
    // $ANTLR end "ruleDOE"


    // $ANTLR start "entryRuleLS"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1693:1: entryRuleLS returns [EObject current=null] : iv_ruleLS= ruleLS EOF ;
    public final EObject entryRuleLS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLS = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1694:2: (iv_ruleLS= ruleLS EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1695:2: iv_ruleLS= ruleLS EOF
            {
             newCompositeNode(grammarAccess.getLSRule()); 
            pushFollow(FOLLOW_ruleLS_in_entryRuleLS3546);
            iv_ruleLS=ruleLS();

            state._fsp--;

             current =iv_ruleLS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLS3556); 

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
    // $ANTLR end "entryRuleLS"


    // $ANTLR start "ruleLS"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1702:1: ruleLS returns [EObject current=null] : ( () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1705:28: ( ( () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1706:1: ( () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1706:1: ( () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1706:2: () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1706:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1707:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLSAccess().getLSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleLS3602); 

                	newLeafNode(otherlv_1, grammarAccess.getLSAccess().getColumnKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1716:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1717:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1717:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1718:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLSAccess().getColVariableCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLS3625);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleLS3637); 

                	newLeafNode(otherlv_3, grammarAccess.getLSAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleLS3649); 

                	newLeafNode(otherlv_4, grammarAccess.getLSAccess().getRowKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1739:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1740:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1740:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1741:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLSAccess().getRowVariableCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLS3672);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleLS3684); 

                	newLeafNode(otherlv_6, grammarAccess.getLSAccess().getCommaKeyword_6());
                
            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleLS3696); 

                	newLeafNode(otherlv_7, grammarAccess.getLSAccess().getTreatmentKeyword_7());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1762:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1763:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1763:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1764:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLSAccess().getTreatmentVariableCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLS3719);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleLS"


    // $ANTLR start "entryRuleRCBD"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1785:1: entryRuleRCBD returns [EObject current=null] : iv_ruleRCBD= ruleRCBD EOF ;
    public final EObject entryRuleRCBD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRCBD = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1786:2: (iv_ruleRCBD= ruleRCBD EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1787:2: iv_ruleRCBD= ruleRCBD EOF
            {
             newCompositeNode(grammarAccess.getRCBDRule()); 
            pushFollow(FOLLOW_ruleRCBD_in_entryRuleRCBD3755);
            iv_ruleRCBD=ruleRCBD();

            state._fsp--;

             current =iv_ruleRCBD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRCBD3765); 

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
    // $ANTLR end "entryRuleRCBD"


    // $ANTLR start "ruleRCBD"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1794:1: ruleRCBD returns [EObject current=null] : ( () otherlv_1= 'blockVariable =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'treatment =' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRCBD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1797:28: ( ( () otherlv_1= 'blockVariable =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'treatment =' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1798:1: ( () otherlv_1= 'blockVariable =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'treatment =' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1798:1: ( () otherlv_1= 'blockVariable =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'treatment =' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1798:2: () otherlv_1= 'blockVariable =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'treatment =' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1798:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1799:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRCBDAccess().getRCBDAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleRCBD3811); 

                	newLeafNode(otherlv_1, grammarAccess.getRCBDAccess().getBlockVariableKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1808:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1809:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1809:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1810:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRCBDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRCBDAccess().getBlockVariableVariableCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRCBD3834);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleRCBD3846); 

                	newLeafNode(otherlv_3, grammarAccess.getRCBDAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleRCBD3858); 

                	newLeafNode(otherlv_4, grammarAccess.getRCBDAccess().getTreatmentKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1831:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1832:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1832:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1833:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRCBDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRCBDAccess().getTreatmentVariableCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRCBD3881);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleRCBD"


    // $ANTLR start "entryRuleCRB"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1854:1: entryRuleCRB returns [EObject current=null] : iv_ruleCRB= ruleCRB EOF ;
    public final EObject entryRuleCRB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRB = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1855:2: (iv_ruleCRB= ruleCRB EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1856:2: iv_ruleCRB= ruleCRB EOF
            {
             newCompositeNode(grammarAccess.getCRBRule()); 
            pushFollow(FOLLOW_ruleCRB_in_entryRuleCRB3917);
            iv_ruleCRB=ruleCRB();

            state._fsp--;

             current =iv_ruleCRB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCRB3927); 

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
    // $ANTLR end "entryRuleCRB"


    // $ANTLR start "ruleCRB"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1863:1: ruleCRB returns [EObject current=null] : ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleCRB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1866:28: ( ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1867:1: ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1867:1: ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1867:2: () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1867:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1868:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCRBAccess().getCRBAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleCRB3973); 

                	newLeafNode(otherlv_1, grammarAccess.getCRBAccess().getTreatmentKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1877:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1878:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1878:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1879:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCRBRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCRBAccess().getTreatmentVariableCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCRB3996);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleCRB"


    // $ANTLR start "entryRuleParameter"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1900:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1901:2: (iv_ruleParameter= ruleParameter EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1902:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4032);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4042); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1909:1: ruleParameter returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1912:28: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1913:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1913:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1914:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1914:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1915:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getVariableVariableCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleParameter4089);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleProcess"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1936:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1937:2: (iv_ruleProcess= ruleProcess EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1938:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess4124);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess4134); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1945:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1948:28: ( (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1949:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1949:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1949:3: otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )? otherlv_4= '{' (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )? ( (lv_task_7_0= ruleTask ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleProcess4171); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1953:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1954:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1954:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1955:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess4188); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1971:2: (otherlv_2= 'to' ( ( ruleQualifiedName ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1971:4: otherlv_2= 'to' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleProcess4206); 

                        	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getToKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1975:1: ( ( ruleQualifiedName ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1976:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1976:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1977:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProcessRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getTreatmentRangeCrossReference_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProcess4229);
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleProcess4244); 

                	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1994:1: (otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1994:3: otherlv_5= 'Role' ( (lv_role_6_0= ruleRoleType ) )*
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleProcess4257); 

                        	newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getRoleKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1998:1: ( (lv_role_6_0= ruleRoleType ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=76 && LA38_0<=77)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1999:1: (lv_role_6_0= ruleRoleType )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1999:1: (lv_role_6_0= ruleRoleType )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2000:3: lv_role_6_0= ruleRoleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getRoleRoleTypeEnumRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoleType_in_ruleProcess4278);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2016:5: ( (lv_task_7_0= ruleTask ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==56) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2017:1: (lv_task_7_0= ruleTask )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2017:1: (lv_task_7_0= ruleTask )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2018:3: lv_task_7_0= ruleTask
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getTaskTaskParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTask_in_ruleProcess4302);
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
            	    break loop40;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleProcess4315); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2046:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2047:2: (iv_ruleTask= ruleTask EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2048:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask4351);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask4361); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2055:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'metrics' ( (lv_metric_12_0= ruleMetric ) )* )? otherlv_13= '}' ) ;
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
        Enumerator lv_role_7_0 = null;

        EObject lv_artefacts_10_0 = null;

        EObject lv_metric_12_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2058:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'metrics' ( (lv_metric_12_0= ruleMetric ) )* )? otherlv_13= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2059:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'metrics' ( (lv_metric_12_0= ruleMetric ) )* )? otherlv_13= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2059:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'metrics' ( (lv_metric_12_0= ruleMetric ) )* )? otherlv_13= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2059:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? (otherlv_11= 'metrics' ( (lv_metric_12_0= ruleMetric ) )* )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleTask4398); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2063:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2064:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2064:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2065:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask4415); 

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

            otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleTask4432); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2085:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2086:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2086:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2087:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask4449); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2103:2: (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2103:4: otherlv_4= 'to' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleTask4467); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getToKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2107:1: ( ( ruleQualifiedName ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2108:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2108:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2109:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getNextTaskCrossReference_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask4490);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2122:5: (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2122:7: otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )*
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleTask4506); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRoleKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2126:1: ( (lv_role_7_0= ruleRoleType ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=76 && LA43_0<=77)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2127:1: (lv_role_7_0= ruleRoleType )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2127:1: (lv_role_7_0= ruleRoleType )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2128:3: lv_role_7_0= ruleRoleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getRoleRoleTypeEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoleType_in_ruleTask4527);
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTask4542); 

                	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2148:1: (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2148:3: otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )*
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleTask4555); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getArtefactsKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2152:1: ( (lv_artefacts_10_0= ruleArtefact ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2153:1: (lv_artefacts_10_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2153:1: (lv_artefacts_10_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2154:3: lv_artefacts_10_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getArtefactsArtefactParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleTask4576);
                    	    lv_artefacts_10_0=ruleArtefact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2170:5: (otherlv_11= 'metrics' ( (lv_metric_12_0= ruleMetric ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2170:7: otherlv_11= 'metrics' ( (lv_metric_12_0= ruleMetric ) )*
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_59_in_ruleTask4592); 

                        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getMetricsKeyword_8_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2174:1: ( (lv_metric_12_0= ruleMetric ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2175:1: (lv_metric_12_0= ruleMetric )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2175:1: (lv_metric_12_0= ruleMetric )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2176:3: lv_metric_12_0= ruleMetric
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getMetricMetricParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetric_in_ruleTask4613);
                    	    lv_metric_12_0=ruleMetric();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"metric",
                    	            		lv_metric_12_0, 
                    	            		"Metric");
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

            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleTask4628); 

                	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2204:1: entryRuleArtefact returns [EObject current=null] : iv_ruleArtefact= ruleArtefact EOF ;
    public final EObject entryRuleArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefact = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2205:2: (iv_ruleArtefact= ruleArtefact EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2206:2: iv_ruleArtefact= ruleArtefact EOF
            {
             newCompositeNode(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_ruleArtefact_in_entryRuleArtefact4664);
            iv_ruleArtefact=ruleArtefact();

            state._fsp--;

             current =iv_ruleArtefact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefact4674); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2213:1: ruleArtefact returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) ;
    public final EObject ruleArtefact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2216:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2217:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2217:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2217:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2217:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2218:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2218:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2219:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArtefact4716); 

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

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleArtefact4733); 

                	newLeafNode(otherlv_1, grammarAccess.getArtefactAccess().getDescriptionKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2239:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2240:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2240:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2241:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefact4750); 

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

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleArtefact4767); 

                	newLeafNode(otherlv_3, grammarAccess.getArtefactAccess().getTypeKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2261:1: ( (lv_type_4_0= ruleArtefactType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2262:1: (lv_type_4_0= ruleArtefactType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2262:1: (lv_type_4_0= ruleArtefactType )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2263:3: lv_type_4_0= ruleArtefactType
            {
             
            	        newCompositeNode(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleArtefactType_in_ruleArtefact4788);
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


    // $ANTLR start "entryRuleMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2287:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2288:2: (iv_ruleMetric= ruleMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2289:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_ruleMetric_in_entryRuleMetric4824);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetric4834); 

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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2296:1: ruleMetric returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleMetricType ) )? (otherlv_2= 'as' ( (lv_varname_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_varname_3_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2299:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleMetricType ) )? (otherlv_2= 'as' ( (lv_varname_3_0= RULE_ID ) ) )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2300:1: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleMetricType ) )? (otherlv_2= 'as' ( (lv_varname_3_0= RULE_ID ) ) )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2300:1: ( ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleMetricType ) )? (otherlv_2= 'as' ( (lv_varname_3_0= RULE_ID ) ) )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2300:2: ( ( ruleQualifiedName ) ) ( (lv_type_1_0= ruleMetricType ) )? (otherlv_2= 'as' ( (lv_varname_3_0= RULE_ID ) ) )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2300:2: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2301:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2301:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2302:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMetricAccess().getNameVariableCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMetric4882);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2315:2: ( (lv_type_1_0= ruleMetricType ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==81) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2316:1: (lv_type_1_0= ruleMetricType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2316:1: (lv_type_1_0= ruleMetricType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2317:3: lv_type_1_0= ruleMetricType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetricAccess().getTypeMetricTypeEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetricType_in_ruleMetric4903);
                    lv_type_1_0=ruleMetricType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetricRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"MetricType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2333:3: (otherlv_2= 'as' ( (lv_varname_3_0= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2333:5: otherlv_2= 'as' ( (lv_varname_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleMetric4917); 

                        	newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getAsKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2337:1: ( (lv_varname_3_0= RULE_ID ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2338:1: (lv_varname_3_0= RULE_ID )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2338:1: (lv_varname_3_0= RULE_ID )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2339:3: lv_varname_3_0= RULE_ID
                    {
                    lv_varname_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetric4934); 

                    			newLeafNode(lv_varname_3_0, grammarAccess.getMetricAccess().getVarnameIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetricRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"varname",
                            		lv_varname_3_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleQuestionnaire"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2363:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2364:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2365:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire4977);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire4987); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2372:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2375:28: ( (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2376:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2376:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2376:3: otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleQuestionnaire5024); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2380:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2381:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2381:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2382:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire5041); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2398:2: (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==63) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2398:4: otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleQuestionnaire5059); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2402:1: ( (otherlv_3= RULE_ID ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2403:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2403:1: (otherlv_3= RULE_ID )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2404:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQuestionnaireRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire5079); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getRelatesToProcessCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2415:5: (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==60) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2415:7: otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleQuestionnaire5095); 

                        	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getTypeKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2419:1: ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2420:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2420:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2421:3: lv_questionnaireType_5_0= ruleQuestionnaireType
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeQuestionnaireTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire5116);
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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleQuestionnaire5130); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2441:1: ( (lv_question_7_0= ruleQuestion ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2442:1: (lv_question_7_0= ruleQuestion )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2442:1: (lv_question_7_0= ruleQuestion )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2443:3: lv_question_7_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleQuestionnaire5151);
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
            	    break loop54;
                }
            } while (true);

            otherlv_8=(Token)match(input,64,FOLLOW_64_in_ruleQuestionnaire5164); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2471:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2472:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2473:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion5200);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion5210); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2480:1: ruleQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2483:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2484:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2484:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2484:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}'
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2484:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2485:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2485:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2486:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion5252); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleQuestion5269); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2506:1: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2506:3: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleQuestion5282); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getDescriptionKeyword_2_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2510:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2511:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2511:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2512:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion5299); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2528:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2528:5: otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) )
            {
            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleQuestion5318); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getTypeKeyword_3_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2532:1: ( (lv_type_5_0= ruleAnswerType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2533:1: (lv_type_5_0= ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2533:1: (lv_type_5_0= ruleAnswerType )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2534:3: lv_type_5_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion5339);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2550:3: (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==65) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2550:5: otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleQuestion5353); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRequiredKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2554:1: ( (lv_req_7_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2555:1: (lv_req_7_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2555:1: (lv_req_7_0= RULE_INT )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2556:3: lv_req_7_0= RULE_INT
                    {
                    lv_req_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuestion5370); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2572:4: (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==66) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2572:6: otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    {
                    otherlv_8=(Token)match(input,66,FOLLOW_66_in_ruleQuestion5390); 

                        	newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2576:1: ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==67) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2577:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2577:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2578:3: lv_alternatives_9_0= ruleAlternatives
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAlternatives_in_ruleQuestion5411);
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
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleQuestion5426); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2606:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2607:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2608:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives5462);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives5472); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2615:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2618:28: ( (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2619:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2619:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2619:3: otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleAlternatives5509); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getOptionKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2623:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2624:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2624:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2625:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternatives5526); 

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


    // $ANTLR start "ruleScaleType"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2649:1: ruleScaleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Numerical' ) | (enumLiteral_1= 'Ratio' ) | (enumLiteral_2= 'Ordinal' ) | (enumLiteral_3= 'Nominal' ) ) ;
    public final Enumerator ruleScaleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2651:28: ( ( (enumLiteral_0= 'Numerical' ) | (enumLiteral_1= 'Ratio' ) | (enumLiteral_2= 'Ordinal' ) | (enumLiteral_3= 'Nominal' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2652:1: ( (enumLiteral_0= 'Numerical' ) | (enumLiteral_1= 'Ratio' ) | (enumLiteral_2= 'Ordinal' ) | (enumLiteral_3= 'Nominal' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2652:1: ( (enumLiteral_0= 'Numerical' ) | (enumLiteral_1= 'Ratio' ) | (enumLiteral_2= 'Ordinal' ) | (enumLiteral_3= 'Nominal' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt58=1;
                }
                break;
            case 69:
                {
                alt58=2;
                }
                break;
            case 70:
                {
                alt58=3;
                }
                break;
            case 71:
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
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2652:2: (enumLiteral_0= 'Numerical' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2652:2: (enumLiteral_0= 'Numerical' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2652:4: enumLiteral_0= 'Numerical'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleScaleType5581); 

                            current = grammarAccess.getScaleTypeAccess().getNumericialEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getScaleTypeAccess().getNumericialEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2658:6: (enumLiteral_1= 'Ratio' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2658:6: (enumLiteral_1= 'Ratio' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2658:8: enumLiteral_1= 'Ratio'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleScaleType5598); 

                            current = grammarAccess.getScaleTypeAccess().getRatioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getScaleTypeAccess().getRatioEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2664:6: (enumLiteral_2= 'Ordinal' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2664:6: (enumLiteral_2= 'Ordinal' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2664:8: enumLiteral_2= 'Ordinal'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_70_in_ruleScaleType5615); 

                            current = grammarAccess.getScaleTypeAccess().getOrdinalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getScaleTypeAccess().getOrdinalEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2670:6: (enumLiteral_3= 'Nominal' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2670:6: (enumLiteral_3= 'Nominal' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2670:8: enumLiteral_3= 'Nominal'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_71_in_ruleScaleType5632); 

                            current = grammarAccess.getScaleTypeAccess().getNominalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getScaleTypeAccess().getNominalEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleScaleType"


    // $ANTLR start "ruleDesignType"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2680:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2682:28: ( ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2683:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2683:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt59=1;
                }
                break;
            case 73:
                {
                alt59=2;
                }
                break;
            case 74:
                {
                alt59=3;
                }
                break;
            case 75:
                {
                alt59=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2683:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2683:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2683:4: enumLiteral_0= 'CRD - Completely Randomized Design'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleDesignType5677); 

                            current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2689:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2689:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2689:8: enumLiteral_1= 'RCBD - Randomized Complete Block Design'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleDesignType5694); 

                            current = grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2695:6: (enumLiteral_2= 'LS - Latin Square' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2695:6: (enumLiteral_2= 'LS - Latin Square' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2695:8: enumLiteral_2= 'LS - Latin Square'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_74_in_ruleDesignType5711); 

                            current = grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2701:6: (enumLiteral_3= 'Other' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2701:6: (enumLiteral_3= 'Other' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2701:8: enumLiteral_3= 'Other'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_75_in_ruleDesignType5728); 

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


    // $ANTLR start "ruleRoleType"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2711:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2713:28: ( ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2714:1: ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2714:1: ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) )
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
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2714:2: (enumLiteral_0= 'Participant' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2714:2: (enumLiteral_0= 'Participant' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2714:4: enumLiteral_0= 'Participant'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleRoleType5773); 

                            current = grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2720:6: (enumLiteral_1= 'Researcher' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2720:6: (enumLiteral_1= 'Researcher' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2720:8: enumLiteral_1= 'Researcher'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleRoleType5790); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2730:1: ruleArtefactType returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) ;
    public final Enumerator ruleArtefactType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2732:28: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2733:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2733:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
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
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2733:2: (enumLiteral_0= 'input' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2733:2: (enumLiteral_0= 'input' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2733:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_78_in_ruleArtefactType5835); 

                            current = grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2739:6: (enumLiteral_1= 'output' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2739:6: (enumLiteral_1= 'output' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2739:8: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_79_in_ruleArtefactType5852); 

                            current = grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2745:6: (enumLiteral_2= 'inoutput' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2745:6: (enumLiteral_2= 'inoutput' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2745:8: enumLiteral_2= 'inoutput'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_80_in_ruleArtefactType5869); 

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


    // $ANTLR start "ruleMetricType"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2755:1: ruleMetricType returns [Enumerator current=null] : (enumLiteral_0= 'auto-time' ) ;
    public final Enumerator ruleMetricType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2757:28: ( (enumLiteral_0= 'auto-time' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2758:1: (enumLiteral_0= 'auto-time' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2758:1: (enumLiteral_0= 'auto-time' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2758:3: enumLiteral_0= 'auto-time'
            {
            enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleMetricType5913); 

                    current = grammarAccess.getMetricTypeAccess().getAutotimeEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getAutotimeEnumLiteralDeclaration()); 
                

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


    // $ANTLR start "ruleQuestionnaireType"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2768:1: ruleQuestionnaireType returns [Enumerator current=null] : ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) ) ;
    public final Enumerator ruleQuestionnaireType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2770:28: ( ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2771:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2771:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==82) ) {
                alt62=1;
            }
            else if ( (LA62_0==83) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2771:2: (enumLiteral_0= 'Pre' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2771:2: (enumLiteral_0= 'Pre' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2771:4: enumLiteral_0= 'Pre'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleQuestionnaireType5957); 

                            current = grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2777:6: (enumLiteral_1= 'Post' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2777:6: (enumLiteral_1= 'Post' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2777:8: enumLiteral_1= 'Post'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleQuestionnaireType5974); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2787:1: ruleAnswerType returns [Enumerator current=null] : ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2789:28: ( ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2790:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2790:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) )
            int alt63=6;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt63=1;
                }
                break;
            case 85:
                {
                alt63=2;
                }
                break;
            case 86:
                {
                alt63=3;
                }
                break;
            case 87:
                {
                alt63=4;
                }
                break;
            case 44:
                {
                alt63=5;
                }
                break;
            case 88:
                {
                alt63=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2790:2: (enumLiteral_0= 'Text' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2790:2: (enumLiteral_0= 'Text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2790:4: enumLiteral_0= 'Text'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_84_in_ruleAnswerType6019); 

                            current = grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2796:6: (enumLiteral_1= 'ParagraphText' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2796:6: (enumLiteral_1= 'ParagraphText' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2796:8: enumLiteral_1= 'ParagraphText'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_85_in_ruleAnswerType6036); 

                            current = grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2802:6: (enumLiteral_2= 'MultipleChoice' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2802:6: (enumLiteral_2= 'MultipleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2802:8: enumLiteral_2= 'MultipleChoice'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_86_in_ruleAnswerType6053); 

                            current = grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2808:6: (enumLiteral_3= 'SingleChoice' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2808:6: (enumLiteral_3= 'SingleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2808:8: enumLiteral_3= 'SingleChoice'
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_87_in_ruleAnswerType6070); 

                            current = grammarAccess.getAnswerTypeAccess().getSingleChoiceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnswerTypeAccess().getSingleChoiceEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2814:6: (enumLiteral_4= 'Scale' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2814:6: (enumLiteral_4= 'Scale' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2814:8: enumLiteral_4= 'Scale'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_44_in_ruleAnswerType6087); 

                            current = grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2820:6: (enumLiteral_5= 'Grid' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2820:6: (enumLiteral_5= 'Grid' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2820:8: enumLiteral_5= 'Grid'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_88_in_ruleAnswerType6104); 

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
    public static final BitSet FOLLOW_ruleExperimentElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentElement175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExperimentElement212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperimentElement229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentElement251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExperimentElement268 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_ruleExperimentalDesign_in_ruleExperimentElement289 = new BitSet(new long[]{0x0020000000002002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleExperimentElement310 = new BitSet(new long[]{0x0020000000002002L});
    public static final BitSet FOLLOW_13_in_ruleExperimentElement324 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_ruleExperimentElement345 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName436 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName470 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExperimentalDesign_in_entryRuleExperimentalDesign517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentalDesign527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleExperimentalDesign565 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign577 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleAuthor_in_ruleExperimentalDesign598 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign611 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleExperimentalDesign626 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign638 = new BitSet(new long[]{0x0000003F00000020L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleExperimentalDesign659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign671 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleExperimentalDesign686 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign698 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleExperimentalDesign719 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign732 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExperimentalDesign747 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign759 = new BitSet(new long[]{0x0000004000020010L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleExperimentalDesign780 = new BitSet(new long[]{0x0000004000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign793 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_21_in_ruleExperimentalDesign807 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign819 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleResearchQuestion_in_ruleExperimentalDesign840 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign853 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_22_in_ruleExperimentalDesign868 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign880 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleResearchHypothesis_in_ruleExperimentalDesign901 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign914 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleExperimentalDesign929 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign941 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExperimentalDesign962 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign975 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExperimentalDesign990 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign1002 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleDepVariable_in_ruleExperimentalDesign1023 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign1036 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExperimentalDesign1050 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign1062 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExperimentalDesign1083 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign1096 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExperimentalDesign1110 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExperimentalDesign1122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleExperimentalDesign1143 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExperimentalDesign1155 = new BitSet(new long[]{0x0019000000000000L});
    public static final BitSet FOLLOW_ruleDOE_in_ruleExperimentalDesign1176 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExperimentalDesign1188 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleExperimentalDesign1202 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign1214 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExperimentalDesign1235 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign1248 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleExperimentalDesign1263 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExperimentalDesign1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthor_in_entryRuleAuthor1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthor1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAuthor1375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAuthor1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAbstract_in_ruleAbstract1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredAbstract_in_ruleAbstract1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAbstract_in_entryRuleSimpleAbstract1557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAbstract1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleAbstract1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredAbstract_in_entryRuleStructuredAbstract1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuredAbstract1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStructuredAbstract1705 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1722 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_33_in_ruleStructuredAbstract1742 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1759 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_34_in_ruleStructuredAbstract1779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1796 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_35_in_ruleStructuredAbstract1816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1833 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleStructuredAbstract1853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1870 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleStructuredAbstract1890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword1950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKeyword2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredGoal_in_ruleGoal2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleGoal_in_ruleGoal2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleGoal_in_entryRuleSimpleGoal2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleGoal2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleGoal2212 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleGoal2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredGoal_in_entryRuleStructuredGoal2276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuredGoal2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStructuredGoal2323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredGoal2340 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleStructuredGoal2357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredGoal2374 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleStructuredGoal2391 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredGoal2408 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleStructuredGoal2425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredGoal2442 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleStructuredGoal2459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredGoal2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResearchQuestion_in_entryRuleResearchQuestion2517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResearchQuestion2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResearchQuestion2569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResearchQuestion2591 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleResearchQuestion2608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleResearchQuestion2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResearchHypothesis_in_entryRuleResearchHypothesis2667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResearchHypothesis2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResearchHypothesis2719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResearchHypothesis2741 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleResearchHypothesis2758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleResearchHypothesis2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2891 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariable2909 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleScaleType_in_ruleVariable2930 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariable2945 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariable2957 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleRange_in_ruleVariable2978 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleVariable2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange3029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRange3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDepVariable_in_entryRuleDepVariable3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDepVariable3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDepVariable3178 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDepVariable3190 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleDepVariable3204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDepVariable3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDepVariable3247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDepVariable3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor3308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFactor3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOE_in_entryRuleDOE3400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOE3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLS_in_ruleDOE3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRCBD_in_ruleDOE3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCRB_in_ruleDOE3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLS_in_entryRuleLS3546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLS3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLS3602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLS3625 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleLS3637 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleLS3649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLS3672 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleLS3684 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleLS3696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLS3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRCBD_in_entryRuleRCBD3755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRCBD3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleRCBD3811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRCBD3834 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleRCBD3846 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleRCBD3858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRCBD3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCRB_in_entryRuleCRB3917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCRB3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCRB3973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCRB3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParameter4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess4124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleProcess4171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess4188 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_54_in_ruleProcess4206 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProcess4229 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleProcess4244 = new BitSet(new long[]{0x0180000000020000L});
    public static final BitSet FOLLOW_55_in_ruleProcess4257 = new BitSet(new long[]{0x0100000000020000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleRoleType_in_ruleProcess4278 = new BitSet(new long[]{0x0100000000020000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleProcess4302 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProcess4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask4351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTask4398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask4415 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleTask4432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask4449 = new BitSet(new long[]{0x00C0000000010000L});
    public static final BitSet FOLLOW_54_in_ruleTask4467 = new BitSet(new long[]{0x0080000000010010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask4490 = new BitSet(new long[]{0x0080000000010010L});
    public static final BitSet FOLLOW_55_in_ruleTask4506 = new BitSet(new long[]{0x0000000000010000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleRoleType_in_ruleTask4527 = new BitSet(new long[]{0x0000000000010000L,0x0000000000003000L});
    public static final BitSet FOLLOW_16_in_ruleTask4542 = new BitSet(new long[]{0x0C00000000020000L});
    public static final BitSet FOLLOW_58_in_ruleTask4555 = new BitSet(new long[]{0x0800000000020010L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleTask4576 = new BitSet(new long[]{0x0800000000020010L});
    public static final BitSet FOLLOW_59_in_ruleTask4592 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleMetric_in_ruleTask4613 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleTask4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefact_in_entryRuleArtefact4664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefact4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArtefact4716 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleArtefact4733 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefact4750 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleArtefact4767 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_ruleArtefactType_in_ruleArtefact4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetric_in_entryRuleMetric4824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetric4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMetric4882 = new BitSet(new long[]{0x2000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleMetricType_in_ruleMetric4903 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMetric4917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetric4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire4977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleQuestionnaire5024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire5041 = new BitSet(new long[]{0x9000000000010000L});
    public static final BitSet FOLLOW_63_in_ruleQuestionnaire5059 = new BitSet(new long[]{0x1000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire5079 = new BitSet(new long[]{0x1000000000010010L});
    public static final BitSet FOLLOW_60_in_ruleQuestionnaire5095 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire5116 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestionnaire5130 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionnaire5151 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleQuestionnaire5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion5200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion5252 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestion5269 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleQuestion5282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion5299 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleQuestion5318 = new BitSet(new long[]{0x0000100000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion5339 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_ruleQuestion5353 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuestion5370 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleQuestion5390 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleQuestion5411 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_ruleQuestion5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives5462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAlternatives5509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternatives5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleScaleType5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleScaleType5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleScaleType5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleScaleType5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDesignType5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDesignType5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDesignType5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDesignType5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleRoleType5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleRoleType5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleArtefactType5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleArtefactType5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleArtefactType5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleMetricType5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleQuestionnaireType5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleQuestionnaireType5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAnswerType6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAnswerType6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAnswerType6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAnswerType6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAnswerType6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAnswerType6104 = new BitSet(new long[]{0x0000000000000002L});

}