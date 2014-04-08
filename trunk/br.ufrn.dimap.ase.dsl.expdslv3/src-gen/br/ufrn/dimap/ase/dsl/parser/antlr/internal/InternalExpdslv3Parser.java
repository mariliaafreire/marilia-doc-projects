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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Experiment'", "'Experimental Design'", "'Questionnaires'", "'.'", "'Autorship'", "'{'", "'}'", "'Abstract'", "'Keywords'", "'Goals'", "'Research Questions'", "'Research Hypotheses'", "'Variables'", "'Dependent Variables'", "'Factors'", "'DoE'", "'='", "'('", "')'", "'Context'", "'Background'", "'Objective'", "'Methods'", "'Results'", "'Limitations'", "'Conclusions'", "'relates to'", "'Scale'", "'Range'", "'question'", "'hypothesis'", "'column ='", "','", "'row ='", "'treatment ='", "'blockVariable ='", "'Parameter'", "'Process'", "'Role'", "'Task'", "'description'", "'to'", "'artefacts'", "'type'", "'Questionnaire'", "'relates'", "'};'", "'required'", "'Alternatives'", "'Option'", "'Numerical'", "'Ordinal'", "'Nominal'", "'CRD - Completely Randomized Design'", "'RCBD - Randomized Complete Block Design'", "'LS - Latin Square'", "'Other'", "'Participant'", "'Researcher'", "'input'", "'output'", "'inoutput'", "'Pre'", "'Post'", "'Text'", "'ParagraphText'", "'MultipleChoice'", "'SingleChoice'", "'Grid'"
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

                if ( (LA1_0==48) ) {
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

                        if ( (LA2_0==55) ) {
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:280:1: ruleExperimentalDesign returns [EObject current=null] : ( (otherlv_0= 'Autorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' ( (lv_keyword_9_0= ruleKeyword ) )* )? (otherlv_10= 'Goals' otherlv_11= '{' ( (lv_goal_12_0= ruleGoal ) )* otherlv_13= '}' ) (otherlv_14= 'Research Questions' otherlv_15= '{' ( (lv_researchQuestion_16_0= ruleResearchQuestion ) )* otherlv_17= '}' )? (otherlv_18= 'Research Hypotheses' otherlv_19= '{' ( (lv_researchHypothesis_20_0= ruleResearchHypothesis ) )* otherlv_21= '}' )? (otherlv_22= 'Variables' otherlv_23= '{' ( (lv_variable_24_0= ruleVariable ) )* otherlv_25= '}' )? (otherlv_26= 'Dependent Variables' otherlv_27= '{' ( (lv_depVar_28_0= ruleDepVariable ) )* otherlv_29= '}' ) (otherlv_30= 'Factors' otherlv_31= '{' ( (lv_factor_32_0= ruleFactor ) )* otherlv_33= '}' ) (otherlv_34= 'DoE' otherlv_35= '=' ( (lv_type_36_0= ruleDesignType ) ) otherlv_37= '(' ( (lv_doe_38_0= ruleDOE ) ) otherlv_39= ')' ) (otherlv_40= 'Context' ( (lv_parameter_41_0= ruleParameter ) )* )? ) ;
    public final EObject ruleExperimentalDesign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        EObject lv_author_2_0 = null;

        EObject lv_abstract_6_0 = null;

        EObject lv_keyword_9_0 = null;

        EObject lv_goal_12_0 = null;

        EObject lv_researchQuestion_16_0 = null;

        EObject lv_researchHypothesis_20_0 = null;

        EObject lv_variable_24_0 = null;

        EObject lv_depVar_28_0 = null;

        EObject lv_factor_32_0 = null;

        Enumerator lv_type_36_0 = null;

        EObject lv_doe_38_0 = null;

        EObject lv_parameter_41_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:283:28: ( ( (otherlv_0= 'Autorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' ( (lv_keyword_9_0= ruleKeyword ) )* )? (otherlv_10= 'Goals' otherlv_11= '{' ( (lv_goal_12_0= ruleGoal ) )* otherlv_13= '}' ) (otherlv_14= 'Research Questions' otherlv_15= '{' ( (lv_researchQuestion_16_0= ruleResearchQuestion ) )* otherlv_17= '}' )? (otherlv_18= 'Research Hypotheses' otherlv_19= '{' ( (lv_researchHypothesis_20_0= ruleResearchHypothesis ) )* otherlv_21= '}' )? (otherlv_22= 'Variables' otherlv_23= '{' ( (lv_variable_24_0= ruleVariable ) )* otherlv_25= '}' )? (otherlv_26= 'Dependent Variables' otherlv_27= '{' ( (lv_depVar_28_0= ruleDepVariable ) )* otherlv_29= '}' ) (otherlv_30= 'Factors' otherlv_31= '{' ( (lv_factor_32_0= ruleFactor ) )* otherlv_33= '}' ) (otherlv_34= 'DoE' otherlv_35= '=' ( (lv_type_36_0= ruleDesignType ) ) otherlv_37= '(' ( (lv_doe_38_0= ruleDOE ) ) otherlv_39= ')' ) (otherlv_40= 'Context' ( (lv_parameter_41_0= ruleParameter ) )* )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:1: ( (otherlv_0= 'Autorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' ( (lv_keyword_9_0= ruleKeyword ) )* )? (otherlv_10= 'Goals' otherlv_11= '{' ( (lv_goal_12_0= ruleGoal ) )* otherlv_13= '}' ) (otherlv_14= 'Research Questions' otherlv_15= '{' ( (lv_researchQuestion_16_0= ruleResearchQuestion ) )* otherlv_17= '}' )? (otherlv_18= 'Research Hypotheses' otherlv_19= '{' ( (lv_researchHypothesis_20_0= ruleResearchHypothesis ) )* otherlv_21= '}' )? (otherlv_22= 'Variables' otherlv_23= '{' ( (lv_variable_24_0= ruleVariable ) )* otherlv_25= '}' )? (otherlv_26= 'Dependent Variables' otherlv_27= '{' ( (lv_depVar_28_0= ruleDepVariable ) )* otherlv_29= '}' ) (otherlv_30= 'Factors' otherlv_31= '{' ( (lv_factor_32_0= ruleFactor ) )* otherlv_33= '}' ) (otherlv_34= 'DoE' otherlv_35= '=' ( (lv_type_36_0= ruleDesignType ) ) otherlv_37= '(' ( (lv_doe_38_0= ruleDOE ) ) otherlv_39= ')' ) (otherlv_40= 'Context' ( (lv_parameter_41_0= ruleParameter ) )* )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:1: ( (otherlv_0= 'Autorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' ( (lv_keyword_9_0= ruleKeyword ) )* )? (otherlv_10= 'Goals' otherlv_11= '{' ( (lv_goal_12_0= ruleGoal ) )* otherlv_13= '}' ) (otherlv_14= 'Research Questions' otherlv_15= '{' ( (lv_researchQuestion_16_0= ruleResearchQuestion ) )* otherlv_17= '}' )? (otherlv_18= 'Research Hypotheses' otherlv_19= '{' ( (lv_researchHypothesis_20_0= ruleResearchHypothesis ) )* otherlv_21= '}' )? (otherlv_22= 'Variables' otherlv_23= '{' ( (lv_variable_24_0= ruleVariable ) )* otherlv_25= '}' )? (otherlv_26= 'Dependent Variables' otherlv_27= '{' ( (lv_depVar_28_0= ruleDepVariable ) )* otherlv_29= '}' ) (otherlv_30= 'Factors' otherlv_31= '{' ( (lv_factor_32_0= ruleFactor ) )* otherlv_33= '}' ) (otherlv_34= 'DoE' otherlv_35= '=' ( (lv_type_36_0= ruleDesignType ) ) otherlv_37= '(' ( (lv_doe_38_0= ruleDOE ) ) otherlv_39= ')' ) (otherlv_40= 'Context' ( (lv_parameter_41_0= ruleParameter ) )* )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:2: (otherlv_0= 'Autorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )? (otherlv_4= 'Abstract' otherlv_5= '{' ( (lv_abstract_6_0= ruleAbstract ) ) otherlv_7= '}' )? (otherlv_8= 'Keywords' ( (lv_keyword_9_0= ruleKeyword ) )* )? (otherlv_10= 'Goals' otherlv_11= '{' ( (lv_goal_12_0= ruleGoal ) )* otherlv_13= '}' ) (otherlv_14= 'Research Questions' otherlv_15= '{' ( (lv_researchQuestion_16_0= ruleResearchQuestion ) )* otherlv_17= '}' )? (otherlv_18= 'Research Hypotheses' otherlv_19= '{' ( (lv_researchHypothesis_20_0= ruleResearchHypothesis ) )* otherlv_21= '}' )? (otherlv_22= 'Variables' otherlv_23= '{' ( (lv_variable_24_0= ruleVariable ) )* otherlv_25= '}' )? (otherlv_26= 'Dependent Variables' otherlv_27= '{' ( (lv_depVar_28_0= ruleDepVariable ) )* otherlv_29= '}' ) (otherlv_30= 'Factors' otherlv_31= '{' ( (lv_factor_32_0= ruleFactor ) )* otherlv_33= '}' ) (otherlv_34= 'DoE' otherlv_35= '=' ( (lv_type_36_0= ruleDesignType ) ) otherlv_37= '(' ( (lv_doe_38_0= ruleDOE ) ) otherlv_39= ')' ) (otherlv_40= 'Context' ( (lv_parameter_41_0= ruleParameter ) )* )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:2: (otherlv_0= 'Autorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:284:4: otherlv_0= 'Autorship' otherlv_1= '{' ( (lv_author_2_0= ruleAuthor ) )* otherlv_3= '}'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExperimentalDesign565); 

                        	newLeafNode(otherlv_0, grammarAccess.getExperimentalDesignAccess().getAutorshipKeyword_0_0());
                        
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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:344:3: (otherlv_8= 'Keywords' ( (lv_keyword_9_0= ruleKeyword ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:344:5: otherlv_8= 'Keywords' ( (lv_keyword_9_0= ruleKeyword ) )*
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleExperimentalDesign686); 

                        	newLeafNode(otherlv_8, grammarAccess.getExperimentalDesignAccess().getKeywordsKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:348:1: ( (lv_keyword_9_0= ruleKeyword ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_STRING) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:349:1: (lv_keyword_9_0= ruleKeyword )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:349:1: (lv_keyword_9_0= ruleKeyword )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:350:3: lv_keyword_9_0= ruleKeyword
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getKeywordKeywordParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleKeyword_in_ruleExperimentalDesign707);
                    	    lv_keyword_9_0=ruleKeyword();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"keyword",
                    	            		lv_keyword_9_0, 
                    	            		"Keyword");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:366:5: (otherlv_10= 'Goals' otherlv_11= '{' ( (lv_goal_12_0= ruleGoal ) )* otherlv_13= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:366:7: otherlv_10= 'Goals' otherlv_11= '{' ( (lv_goal_12_0= ruleGoal ) )* otherlv_13= '}'
            {
            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleExperimentalDesign723); 

                	newLeafNode(otherlv_10, grammarAccess.getExperimentalDesignAccess().getGoalsKeyword_3_0());
                
            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign735); 

                	newLeafNode(otherlv_11, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_3_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:374:1: ( (lv_goal_12_0= ruleGoal ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:375:1: (lv_goal_12_0= ruleGoal )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:375:1: (lv_goal_12_0= ruleGoal )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:376:3: lv_goal_12_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getGoalGoalParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleExperimentalDesign756);
            	    lv_goal_12_0=ruleGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goal",
            	            		lv_goal_12_0, 
            	            		"Goal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign769); 

                	newLeafNode(otherlv_13, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_3_3());
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:396:2: (otherlv_14= 'Research Questions' otherlv_15= '{' ( (lv_researchQuestion_16_0= ruleResearchQuestion ) )* otherlv_17= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:396:4: otherlv_14= 'Research Questions' otherlv_15= '{' ( (lv_researchQuestion_16_0= ruleResearchQuestion ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleExperimentalDesign783); 

                        	newLeafNode(otherlv_14, grammarAccess.getExperimentalDesignAccess().getResearchQuestionsKeyword_4_0());
                        
                    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign795); 

                        	newLeafNode(otherlv_15, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:404:1: ( (lv_researchQuestion_16_0= ruleResearchQuestion ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:405:1: (lv_researchQuestion_16_0= ruleResearchQuestion )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:405:1: (lv_researchQuestion_16_0= ruleResearchQuestion )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:406:3: lv_researchQuestion_16_0= ruleResearchQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getResearchQuestionResearchQuestionParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResearchQuestion_in_ruleExperimentalDesign816);
                    	    lv_researchQuestion_16_0=ruleResearchQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"researchQuestion",
                    	            		lv_researchQuestion_16_0, 
                    	            		"ResearchQuestion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign829); 

                        	newLeafNode(otherlv_17, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:426:3: (otherlv_18= 'Research Hypotheses' otherlv_19= '{' ( (lv_researchHypothesis_20_0= ruleResearchHypothesis ) )* otherlv_21= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:426:5: otherlv_18= 'Research Hypotheses' otherlv_19= '{' ( (lv_researchHypothesis_20_0= ruleResearchHypothesis ) )* otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleExperimentalDesign844); 

                        	newLeafNode(otherlv_18, grammarAccess.getExperimentalDesignAccess().getResearchHypothesesKeyword_5_0());
                        
                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign856); 

                        	newLeafNode(otherlv_19, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:434:1: ( (lv_researchHypothesis_20_0= ruleResearchHypothesis ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:435:1: (lv_researchHypothesis_20_0= ruleResearchHypothesis )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:435:1: (lv_researchHypothesis_20_0= ruleResearchHypothesis )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:436:3: lv_researchHypothesis_20_0= ruleResearchHypothesis
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getResearchHypothesisResearchHypothesisParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResearchHypothesis_in_ruleExperimentalDesign877);
                    	    lv_researchHypothesis_20_0=ruleResearchHypothesis();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"researchHypothesis",
                    	            		lv_researchHypothesis_20_0, 
                    	            		"ResearchHypothesis");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign890); 

                        	newLeafNode(otherlv_21, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:456:3: (otherlv_22= 'Variables' otherlv_23= '{' ( (lv_variable_24_0= ruleVariable ) )* otherlv_25= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:456:5: otherlv_22= 'Variables' otherlv_23= '{' ( (lv_variable_24_0= ruleVariable ) )* otherlv_25= '}'
                    {
                    otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleExperimentalDesign905); 

                        	newLeafNode(otherlv_22, grammarAccess.getExperimentalDesignAccess().getVariablesKeyword_6_0());
                        
                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign917); 

                        	newLeafNode(otherlv_23, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:464:1: ( (lv_variable_24_0= ruleVariable ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:465:1: (lv_variable_24_0= ruleVariable )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:465:1: (lv_variable_24_0= ruleVariable )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:466:3: lv_variable_24_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getVariableVariableParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleExperimentalDesign938);
                    	    lv_variable_24_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variable",
                    	            		lv_variable_24_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign951); 

                        	newLeafNode(otherlv_25, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:486:3: (otherlv_26= 'Dependent Variables' otherlv_27= '{' ( (lv_depVar_28_0= ruleDepVariable ) )* otherlv_29= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:486:5: otherlv_26= 'Dependent Variables' otherlv_27= '{' ( (lv_depVar_28_0= ruleDepVariable ) )* otherlv_29= '}'
            {
            otherlv_26=(Token)match(input,24,FOLLOW_24_in_ruleExperimentalDesign966); 

                	newLeafNode(otherlv_26, grammarAccess.getExperimentalDesignAccess().getDependentVariablesKeyword_7_0());
                
            otherlv_27=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign978); 

                	newLeafNode(otherlv_27, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_7_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:494:1: ( (lv_depVar_28_0= ruleDepVariable ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:495:1: (lv_depVar_28_0= ruleDepVariable )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:495:1: (lv_depVar_28_0= ruleDepVariable )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:496:3: lv_depVar_28_0= ruleDepVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getDepVarDepVariableParserRuleCall_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDepVariable_in_ruleExperimentalDesign999);
            	    lv_depVar_28_0=ruleDepVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"depVar",
            	            		lv_depVar_28_0, 
            	            		"DepVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_29=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign1012); 

                	newLeafNode(otherlv_29, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_7_3());
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:516:2: (otherlv_30= 'Factors' otherlv_31= '{' ( (lv_factor_32_0= ruleFactor ) )* otherlv_33= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:516:4: otherlv_30= 'Factors' otherlv_31= '{' ( (lv_factor_32_0= ruleFactor ) )* otherlv_33= '}'
            {
            otherlv_30=(Token)match(input,25,FOLLOW_25_in_ruleExperimentalDesign1026); 

                	newLeafNode(otherlv_30, grammarAccess.getExperimentalDesignAccess().getFactorsKeyword_8_0());
                
            otherlv_31=(Token)match(input,16,FOLLOW_16_in_ruleExperimentalDesign1038); 

                	newLeafNode(otherlv_31, grammarAccess.getExperimentalDesignAccess().getLeftCurlyBracketKeyword_8_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:524:1: ( (lv_factor_32_0= ruleFactor ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:525:1: (lv_factor_32_0= ruleFactor )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:525:1: (lv_factor_32_0= ruleFactor )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:526:3: lv_factor_32_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getFactorFactorParserRuleCall_8_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleExperimentalDesign1059);
            	    lv_factor_32_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factor",
            	            		lv_factor_32_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_33=(Token)match(input,17,FOLLOW_17_in_ruleExperimentalDesign1072); 

                	newLeafNode(otherlv_33, grammarAccess.getExperimentalDesignAccess().getRightCurlyBracketKeyword_8_3());
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:546:2: (otherlv_34= 'DoE' otherlv_35= '=' ( (lv_type_36_0= ruleDesignType ) ) otherlv_37= '(' ( (lv_doe_38_0= ruleDOE ) ) otherlv_39= ')' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:546:4: otherlv_34= 'DoE' otherlv_35= '=' ( (lv_type_36_0= ruleDesignType ) ) otherlv_37= '(' ( (lv_doe_38_0= ruleDOE ) ) otherlv_39= ')'
            {
            otherlv_34=(Token)match(input,26,FOLLOW_26_in_ruleExperimentalDesign1086); 

                	newLeafNode(otherlv_34, grammarAccess.getExperimentalDesignAccess().getDoEKeyword_9_0());
                
            otherlv_35=(Token)match(input,27,FOLLOW_27_in_ruleExperimentalDesign1098); 

                	newLeafNode(otherlv_35, grammarAccess.getExperimentalDesignAccess().getEqualsSignKeyword_9_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:554:1: ( (lv_type_36_0= ruleDesignType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:555:1: (lv_type_36_0= ruleDesignType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:555:1: (lv_type_36_0= ruleDesignType )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:556:3: lv_type_36_0= ruleDesignType
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getTypeDesignTypeEnumRuleCall_9_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignType_in_ruleExperimentalDesign1119);
            lv_type_36_0=ruleDesignType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_36_0, 
                    		"DesignType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_37=(Token)match(input,28,FOLLOW_28_in_ruleExperimentalDesign1131); 

                	newLeafNode(otherlv_37, grammarAccess.getExperimentalDesignAccess().getLeftParenthesisKeyword_9_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:576:1: ( (lv_doe_38_0= ruleDOE ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:577:1: (lv_doe_38_0= ruleDOE )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:577:1: (lv_doe_38_0= ruleDOE )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:578:3: lv_doe_38_0= ruleDOE
            {
             
            	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getDoeDOEParserRuleCall_9_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDOE_in_ruleExperimentalDesign1152);
            lv_doe_38_0=ruleDOE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
            	        }
                   		set(
                   			current, 
                   			"doe",
                    		lv_doe_38_0, 
                    		"DOE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_39=(Token)match(input,29,FOLLOW_29_in_ruleExperimentalDesign1164); 

                	newLeafNode(otherlv_39, grammarAccess.getExperimentalDesignAccess().getRightParenthesisKeyword_9_5());
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:598:2: (otherlv_40= 'Context' ( (lv_parameter_41_0= ruleParameter ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:598:4: otherlv_40= 'Context' ( (lv_parameter_41_0= ruleParameter ) )*
                    {
                    otherlv_40=(Token)match(input,30,FOLLOW_30_in_ruleExperimentalDesign1178); 

                        	newLeafNode(otherlv_40, grammarAccess.getExperimentalDesignAccess().getContextKeyword_10_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:602:1: ( (lv_parameter_41_0= ruleParameter ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==47) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:603:1: (lv_parameter_41_0= ruleParameter )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:603:1: (lv_parameter_41_0= ruleParameter )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:604:3: lv_parameter_41_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentalDesignAccess().getParameterParameterParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleExperimentalDesign1199);
                    	    lv_parameter_41_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentalDesignRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameter",
                    	            		lv_parameter_41_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // $ANTLR end "ruleExperimentalDesign"


    // $ANTLR start "entryRuleAuthor"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:628:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:629:2: (iv_ruleAuthor= ruleAuthor EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:630:2: iv_ruleAuthor= ruleAuthor EOF
            {
             newCompositeNode(grammarAccess.getAuthorRule()); 
            pushFollow(FOLLOW_ruleAuthor_in_entryRuleAuthor1238);
            iv_ruleAuthor=ruleAuthor();

            state._fsp--;

             current =iv_ruleAuthor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthor1248); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:637:1: ruleAuthor returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:640:28: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:641:1: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:641:1: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:641:2: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:641:2: ( (lv_identifier_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:642:1: (lv_identifier_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:642:1: (lv_identifier_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:643:3: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAuthor1290); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:659:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:660:1: (lv_name_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:660:1: (lv_name_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:661:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAuthor1312); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:685:1: entryRuleAbstract returns [EObject current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final EObject entryRuleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstract = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:686:2: (iv_ruleAbstract= ruleAbstract EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:687:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract1353);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract1363); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:694:1: ruleAbstract returns [EObject current=null] : (this_SimpleAbstract_0= ruleSimpleAbstract | this_StructuredAbstract_1= ruleStructuredAbstract ) ;
    public final EObject ruleAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAbstract_0 = null;

        EObject this_StructuredAbstract_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:697:28: ( (this_SimpleAbstract_0= ruleSimpleAbstract | this_StructuredAbstract_1= ruleStructuredAbstract ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:698:1: (this_SimpleAbstract_0= ruleSimpleAbstract | this_StructuredAbstract_1= ruleStructuredAbstract )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:698:1: (this_SimpleAbstract_0= ruleSimpleAbstract | this_StructuredAbstract_1= ruleStructuredAbstract )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==EOF||LA21_0==17||(LA21_0>=31 && LA21_0<=36)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:699:5: this_SimpleAbstract_0= ruleSimpleAbstract
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getSimpleAbstractParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleAbstract_in_ruleAbstract1410);
                    this_SimpleAbstract_0=ruleSimpleAbstract();

                    state._fsp--;

                     
                            current = this_SimpleAbstract_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:709:5: this_StructuredAbstract_1= ruleStructuredAbstract
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getStructuredAbstractParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStructuredAbstract_in_ruleAbstract1437);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:725:1: entryRuleSimpleAbstract returns [EObject current=null] : iv_ruleSimpleAbstract= ruleSimpleAbstract EOF ;
    public final EObject entryRuleSimpleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAbstract = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:726:2: (iv_ruleSimpleAbstract= ruleSimpleAbstract EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:727:2: iv_ruleSimpleAbstract= ruleSimpleAbstract EOF
            {
             newCompositeNode(grammarAccess.getSimpleAbstractRule()); 
            pushFollow(FOLLOW_ruleSimpleAbstract_in_entryRuleSimpleAbstract1472);
            iv_ruleSimpleAbstract=ruleSimpleAbstract();

            state._fsp--;

             current =iv_ruleSimpleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAbstract1482); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:734:1: ruleSimpleAbstract returns [EObject current=null] : ( (lv_description_0_0= RULE_STRING ) ) ;
    public final EObject ruleSimpleAbstract() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:737:28: ( ( (lv_description_0_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:738:1: ( (lv_description_0_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:738:1: ( (lv_description_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:739:1: (lv_description_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:739:1: (lv_description_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:740:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleAbstract1523); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:764:1: entryRuleStructuredAbstract returns [EObject current=null] : iv_ruleStructuredAbstract= ruleStructuredAbstract EOF ;
    public final EObject entryRuleStructuredAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredAbstract = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:765:2: (iv_ruleStructuredAbstract= ruleStructuredAbstract EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:766:2: iv_ruleStructuredAbstract= ruleStructuredAbstract EOF
            {
             newCompositeNode(grammarAccess.getStructuredAbstractRule()); 
            pushFollow(FOLLOW_ruleStructuredAbstract_in_entryRuleStructuredAbstract1563);
            iv_ruleStructuredAbstract=ruleStructuredAbstract();

            state._fsp--;

             current =iv_ruleStructuredAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuredAbstract1573); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:773:1: ruleStructuredAbstract returns [EObject current=null] : ( () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:776:28: ( ( () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:777:1: ( () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:777:1: ( () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:777:2: () (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )? (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )? (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )? (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )? (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )? (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:777:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:778:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructuredAbstractAccess().getStructuredAbstractAction_0(),
                        current);
                

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:783:2: (otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:783:4: otherlv_1= 'Background' ( (lv_background_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleStructuredAbstract1620); 

                        	newLeafNode(otherlv_1, grammarAccess.getStructuredAbstractAccess().getBackgroundKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:787:1: ( (lv_background_2_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:788:1: (lv_background_2_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:788:1: (lv_background_2_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:789:3: lv_background_2_0= RULE_STRING
                    {
                    lv_background_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1637); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:805:4: (otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:805:6: otherlv_3= 'Objective' ( (lv_objective_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleStructuredAbstract1657); 

                        	newLeafNode(otherlv_3, grammarAccess.getStructuredAbstractAccess().getObjectiveKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:809:1: ( (lv_objective_4_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:810:1: (lv_objective_4_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:810:1: (lv_objective_4_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:811:3: lv_objective_4_0= RULE_STRING
                    {
                    lv_objective_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1674); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:827:4: (otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:827:6: otherlv_5= 'Methods' ( (lv_methods_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleStructuredAbstract1694); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructuredAbstractAccess().getMethodsKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:831:1: ( (lv_methods_6_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:832:1: (lv_methods_6_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:832:1: (lv_methods_6_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:833:3: lv_methods_6_0= RULE_STRING
                    {
                    lv_methods_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1711); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:849:4: (otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:849:6: otherlv_7= 'Results' ( (lv_results_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleStructuredAbstract1731); 

                        	newLeafNode(otherlv_7, grammarAccess.getStructuredAbstractAccess().getResultsKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:853:1: ( (lv_results_8_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:854:1: (lv_results_8_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:854:1: (lv_results_8_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:855:3: lv_results_8_0= RULE_STRING
                    {
                    lv_results_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1748); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:871:4: (otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:871:6: otherlv_9= 'Limitations' ( (lv_limitations_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleStructuredAbstract1768); 

                        	newLeafNode(otherlv_9, grammarAccess.getStructuredAbstractAccess().getLimitationsKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:875:1: ( (lv_limitations_10_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:876:1: (lv_limitations_10_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:876:1: (lv_limitations_10_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:877:3: lv_limitations_10_0= RULE_STRING
                    {
                    lv_limitations_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1785); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:893:4: (otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:893:6: otherlv_11= 'Conclusions' ( (lv_conclusions_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleStructuredAbstract1805); 

                        	newLeafNode(otherlv_11, grammarAccess.getStructuredAbstractAccess().getConclusionsKeyword_6_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:897:1: ( (lv_conclusions_12_0= RULE_STRING ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:898:1: (lv_conclusions_12_0= RULE_STRING )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:898:1: (lv_conclusions_12_0= RULE_STRING )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:899:3: lv_conclusions_12_0= RULE_STRING
                    {
                    lv_conclusions_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructuredAbstract1822); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:923:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:924:2: (iv_ruleKeyword= ruleKeyword EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:925:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword1865);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword1875); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:932:1: ruleKeyword returns [EObject current=null] : ( (lv_description_0_0= RULE_STRING ) ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:935:28: ( ( (lv_description_0_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:936:1: ( (lv_description_0_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:936:1: ( (lv_description_0_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:937:1: (lv_description_0_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:937:1: (lv_description_0_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:938:3: lv_description_0_0= RULE_STRING
            {
            lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKeyword1916); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:962:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:963:2: (iv_ruleGoal= ruleGoal EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:964:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1956);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1966); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:971:1: ruleGoal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:974:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:975:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:975:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:975:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:975:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:976:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:976:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:977:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2008); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:993:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:994:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:994:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:995:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal2030); 

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


    // $ANTLR start "entryRuleResearchQuestion"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1019:1: entryRuleResearchQuestion returns [EObject current=null] : iv_ruleResearchQuestion= ruleResearchQuestion EOF ;
    public final EObject entryRuleResearchQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchQuestion = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1020:2: (iv_ruleResearchQuestion= ruleResearchQuestion EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1021:2: iv_ruleResearchQuestion= ruleResearchQuestion EOF
            {
             newCompositeNode(grammarAccess.getResearchQuestionRule()); 
            pushFollow(FOLLOW_ruleResearchQuestion_in_entryRuleResearchQuestion2071);
            iv_ruleResearchQuestion=ruleResearchQuestion();

            state._fsp--;

             current =iv_ruleResearchQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResearchQuestion2081); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1028:1: ruleResearchQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleResearchQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1031:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1032:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1032:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1032:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1032:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1033:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1033:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1034:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResearchQuestion2123); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1050:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1051:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1051:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1052:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResearchQuestion2145); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleResearchQuestion2162); 

                	newLeafNode(otherlv_2, grammarAccess.getResearchQuestionAccess().getRelatesToKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1072:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1073:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1073:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1074:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResearchQuestionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResearchQuestionAccess().getGoalGoalCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleResearchQuestion2185);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1095:1: entryRuleResearchHypothesis returns [EObject current=null] : iv_ruleResearchHypothesis= ruleResearchHypothesis EOF ;
    public final EObject entryRuleResearchHypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchHypothesis = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1096:2: (iv_ruleResearchHypothesis= ruleResearchHypothesis EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1097:2: iv_ruleResearchHypothesis= ruleResearchHypothesis EOF
            {
             newCompositeNode(grammarAccess.getResearchHypothesisRule()); 
            pushFollow(FOLLOW_ruleResearchHypothesis_in_entryRuleResearchHypothesis2221);
            iv_ruleResearchHypothesis=ruleResearchHypothesis();

            state._fsp--;

             current =iv_ruleResearchHypothesis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResearchHypothesis2231); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1104:1: ruleResearchHypothesis returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleResearchHypothesis() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1107:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1108:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1108:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1108:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'relates to' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1108:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1109:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1109:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1110:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResearchHypothesis2273); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1126:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1127:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1127:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1128:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResearchHypothesis2295); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleResearchHypothesis2312); 

                	newLeafNode(otherlv_2, grammarAccess.getResearchHypothesisAccess().getRelatesToKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1148:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1149:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1149:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1150:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResearchHypothesisRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResearchHypothesisAccess().getGoalGoalCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleResearchHypothesis2335);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1171:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1172:2: (iv_ruleVariable= ruleVariable EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1173:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2371);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2381); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1180:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )? ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1183:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1184:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1184:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1184:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )? (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1184:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1185:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1185:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1186:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2423); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1202:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1203:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1203:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1204:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2445); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1220:2: (otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1220:4: otherlv_2= 'Scale' ( (lv_scaleType_3_0= ruleScaleType ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleVariable2463); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getScaleKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1224:1: ( (lv_scaleType_3_0= ruleScaleType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1225:1: (lv_scaleType_3_0= ruleScaleType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1225:1: (lv_scaleType_3_0= ruleScaleType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1226:3: lv_scaleType_3_0= ruleScaleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getScaleTypeScaleTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScaleType_in_ruleVariable2484);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1242:4: (otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1242:6: otherlv_4= 'Range' otherlv_5= '{' ( (lv_range_6_0= ruleRange ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleVariable2499); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getRangeKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleVariable2511); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1250:1: ( (lv_range_6_0= ruleRange ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1251:1: (lv_range_6_0= ruleRange )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1251:1: (lv_range_6_0= ruleRange )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1252:3: lv_range_6_0= ruleRange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariableAccess().getRangeRangeParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRange_in_ruleVariable2532);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleVariable2545); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1280:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1281:2: (iv_ruleRange= ruleRange EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1282:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange2583);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange2593); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1289:1: ruleRange returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1292:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1293:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1293:1: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1294:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1294:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1295:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRange2634); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1319:1: entryRuleDepVariable returns [EObject current=null] : iv_ruleDepVariable= ruleDepVariable EOF ;
    public final EObject entryRuleDepVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepVariable = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1320:2: (iv_ruleDepVariable= ruleDepVariable EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1321:2: iv_ruleDepVariable= ruleDepVariable EOF
            {
             newCompositeNode(grammarAccess.getDepVariableRule()); 
            pushFollow(FOLLOW_ruleDepVariable_in_entryRuleDepVariable2674);
            iv_ruleDepVariable=ruleDepVariable();

            state._fsp--;

             current =iv_ruleDepVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDepVariable2684); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1328:1: ruleDepVariable returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'question' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) ) ) ) ) ;
    public final EObject ruleDepVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1331:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'question' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) ) ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1332:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'question' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) ) ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1332:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'question' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1332:2: ( ( ruleQualifiedName ) ) otherlv_1= 'relates to' ( (otherlv_2= 'question' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1332:2: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1333:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1333:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1334:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDepVariableRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDepVariableAccess().getVariableVariableCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDepVariable2732);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleDepVariable2744); 

                	newLeafNode(otherlv_1, grammarAccess.getDepVariableAccess().getRelatesToKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1351:1: ( (otherlv_2= 'question' ( ( ruleQualifiedName ) ) ) | (otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            else if ( (LA31_0==41) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1351:2: (otherlv_2= 'question' ( ( ruleQualifiedName ) ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1351:2: (otherlv_2= 'question' ( ( ruleQualifiedName ) ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1351:4: otherlv_2= 'question' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleDepVariable2758); 

                        	newLeafNode(otherlv_2, grammarAccess.getDepVariableAccess().getQuestionKeyword_2_0_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1355:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1356:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1356:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1357:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDepVariableRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDepVariableAccess().getRqResearchQuestionCrossReference_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDepVariable2781);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1371:6: (otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1371:6: (otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1371:8: otherlv_4= 'hypothesis' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleDepVariable2801); 

                        	newLeafNode(otherlv_4, grammarAccess.getDepVariableAccess().getHypothesisKeyword_2_1_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1375:1: ( ( ruleQualifiedName ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1376:1: ( ruleQualifiedName )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1376:1: ( ruleQualifiedName )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1377:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDepVariableRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDepVariableAccess().getRhResearchHypothesisCrossReference_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDepVariable2824);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1398:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1399:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1400:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor2862);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor2872); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1407:1: ruleFactor returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_level_2_0= ruleLevel ) )* otherlv_3= ')' )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_level_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1410:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_level_2_0= ruleLevel ) )* otherlv_3= ')' )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1411:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_level_2_0= ruleLevel ) )* otherlv_3= ')' )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1411:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_level_2_0= ruleLevel ) )* otherlv_3= ')' )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1411:2: ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_level_2_0= ruleLevel ) )* otherlv_3= ')' )?
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1411:2: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1412:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1412:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1413:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFactorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFactor2920);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1426:2: (otherlv_1= '(' ( (lv_level_2_0= ruleLevel ) )* otherlv_3= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1426:4: otherlv_1= '(' ( (lv_level_2_0= ruleLevel ) )* otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleFactor2933); 

                        	newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1430:1: ( (lv_level_2_0= ruleLevel ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1431:1: (lv_level_2_0= ruleLevel )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1431:1: (lv_level_2_0= ruleLevel )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1432:3: lv_level_2_0= ruleLevel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFactorAccess().getLevelLevelParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLevel_in_ruleFactor2954);
                    	    lv_level_2_0=ruleLevel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"level",
                    	            		lv_level_2_0, 
                    	            		"Level");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleFactor2967); 

                        	newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
                        

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


    // $ANTLR start "entryRuleLevel"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1460:1: entryRuleLevel returns [EObject current=null] : iv_ruleLevel= ruleLevel EOF ;
    public final EObject entryRuleLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1461:2: (iv_ruleLevel= ruleLevel EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1462:2: iv_ruleLevel= ruleLevel EOF
            {
             newCompositeNode(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_ruleLevel_in_entryRuleLevel3005);
            iv_ruleLevel=ruleLevel();

            state._fsp--;

             current =iv_ruleLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevel3015); 

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
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1469:1: ruleLevel returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleLevel() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1472:28: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1473:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1473:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1474:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1474:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1475:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLevelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLevelAccess().getLevRangeCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLevel3062);
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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRuleDOE"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1496:1: entryRuleDOE returns [EObject current=null] : iv_ruleDOE= ruleDOE EOF ;
    public final EObject entryRuleDOE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOE = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1497:2: (iv_ruleDOE= ruleDOE EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1498:2: iv_ruleDOE= ruleDOE EOF
            {
             newCompositeNode(grammarAccess.getDOERule()); 
            pushFollow(FOLLOW_ruleDOE_in_entryRuleDOE3097);
            iv_ruleDOE=ruleDOE();

            state._fsp--;

             current =iv_ruleDOE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOE3107); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1505:1: ruleDOE returns [EObject current=null] : (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB ) ;
    public final EObject ruleDOE() throws RecognitionException {
        EObject current = null;

        EObject this_LS_0 = null;

        EObject this_RCBD_1 = null;

        EObject this_CRB_2 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1508:28: ( (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1509:1: (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1509:1: (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB )
            int alt34=3;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1510:5: this_LS_0= ruleLS
                    {
                     
                            newCompositeNode(grammarAccess.getDOEAccess().getLSParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLS_in_ruleDOE3154);
                    this_LS_0=ruleLS();

                    state._fsp--;

                     
                            current = this_LS_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1520:5: this_RCBD_1= ruleRCBD
                    {
                     
                            newCompositeNode(grammarAccess.getDOEAccess().getRCBDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRCBD_in_ruleDOE3181);
                    this_RCBD_1=ruleRCBD();

                    state._fsp--;

                     
                            current = this_RCBD_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1530:5: this_CRB_2= ruleCRB
                    {
                     
                            newCompositeNode(grammarAccess.getDOEAccess().getCRBParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCRB_in_ruleDOE3208);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1546:1: entryRuleLS returns [EObject current=null] : iv_ruleLS= ruleLS EOF ;
    public final EObject entryRuleLS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLS = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1547:2: (iv_ruleLS= ruleLS EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1548:2: iv_ruleLS= ruleLS EOF
            {
             newCompositeNode(grammarAccess.getLSRule()); 
            pushFollow(FOLLOW_ruleLS_in_entryRuleLS3243);
            iv_ruleLS=ruleLS();

            state._fsp--;

             current =iv_ruleLS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLS3253); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1555:1: ruleLS returns [EObject current=null] : ( () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1558:28: ( ( () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1559:1: ( () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1559:1: ( () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1559:2: () otherlv_1= 'column =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'row =' ( ( ruleQualifiedName ) ) otherlv_6= ',' otherlv_7= 'treatment =' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1559:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1560:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLSAccess().getLSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleLS3299); 

                	newLeafNode(otherlv_1, grammarAccess.getLSAccess().getColumnKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1569:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1570:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1570:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1571:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLSAccess().getColFactorCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLS3322);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleLS3334); 

                	newLeafNode(otherlv_3, grammarAccess.getLSAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleLS3346); 

                	newLeafNode(otherlv_4, grammarAccess.getLSAccess().getRowKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1592:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1593:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1593:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1594:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLSAccess().getRowFactorCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLS3369);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleLS3381); 

                	newLeafNode(otherlv_6, grammarAccess.getLSAccess().getCommaKeyword_6());
                
            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleLS3393); 

                	newLeafNode(otherlv_7, grammarAccess.getLSAccess().getTreatmentKeyword_7());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1615:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1616:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1616:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1617:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLSRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLSAccess().getTreatmentFactorCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLS3416);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1638:1: entryRuleRCBD returns [EObject current=null] : iv_ruleRCBD= ruleRCBD EOF ;
    public final EObject entryRuleRCBD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRCBD = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1639:2: (iv_ruleRCBD= ruleRCBD EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1640:2: iv_ruleRCBD= ruleRCBD EOF
            {
             newCompositeNode(grammarAccess.getRCBDRule()); 
            pushFollow(FOLLOW_ruleRCBD_in_entryRuleRCBD3452);
            iv_ruleRCBD=ruleRCBD();

            state._fsp--;

             current =iv_ruleRCBD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRCBD3462); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1647:1: ruleRCBD returns [EObject current=null] : ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'blockVariable =' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRCBD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1650:28: ( ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'blockVariable =' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1651:1: ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'blockVariable =' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1651:1: ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'blockVariable =' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1651:2: () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) otherlv_3= ',' otherlv_4= 'blockVariable =' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1651:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1652:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRCBDAccess().getRCBDAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleRCBD3508); 

                	newLeafNode(otherlv_1, grammarAccess.getRCBDAccess().getTreatmentKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1661:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1662:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1662:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1663:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRCBDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRCBDAccess().getTreatmentFactorCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRCBD3531);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleRCBD3543); 

                	newLeafNode(otherlv_3, grammarAccess.getRCBDAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleRCBD3555); 

                	newLeafNode(otherlv_4, grammarAccess.getRCBDAccess().getBlockVariableKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1684:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1685:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1685:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1686:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRCBDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRCBDAccess().getBlockVariableFactorCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRCBD3578);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1707:1: entryRuleCRB returns [EObject current=null] : iv_ruleCRB= ruleCRB EOF ;
    public final EObject entryRuleCRB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRB = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1708:2: (iv_ruleCRB= ruleCRB EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1709:2: iv_ruleCRB= ruleCRB EOF
            {
             newCompositeNode(grammarAccess.getCRBRule()); 
            pushFollow(FOLLOW_ruleCRB_in_entryRuleCRB3614);
            iv_ruleCRB=ruleCRB();

            state._fsp--;

             current =iv_ruleCRB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCRB3624); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1716:1: ruleCRB returns [EObject current=null] : ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleCRB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1719:28: ( ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1720:1: ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1720:1: ( () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1720:2: () otherlv_1= 'treatment =' ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1720:2: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1721:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCRBAccess().getCRBAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleCRB3670); 

                	newLeafNode(otherlv_1, grammarAccess.getCRBAccess().getTreatmentKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1730:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1731:1: ( ruleQualifiedName )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1731:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1732:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCRBRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCRBAccess().getTreatmentFactorCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCRB3693);
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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1753:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1754:2: (iv_ruleParameter= ruleParameter EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1755:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3729);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3739); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1762:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1765:28: ( (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1766:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1766:1: (otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1766:3: otherlv_0= 'Parameter' ( (lv_variable_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleParameter3776); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1770:1: ( (lv_variable_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1771:1: (lv_variable_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1771:1: (lv_variable_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1772:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3793); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleParameter3810); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1792:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1793:1: (lv_value_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1793:1: (lv_value_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1794:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter3827); 

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


    // $ANTLR start "entryRuleProcess"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1818:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1819:2: (iv_ruleProcess= ruleProcess EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1820:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess3868);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess3878); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1827:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Role' ( (lv_role_3_0= ruleRoleType ) )* )? ( (lv_task_4_0= ruleTask ) )* otherlv_5= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_role_3_0 = null;

        EObject lv_task_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1830:28: ( (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Role' ( (lv_role_3_0= ruleRoleType ) )* )? ( (lv_task_4_0= ruleTask ) )* otherlv_5= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1831:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Role' ( (lv_role_3_0= ruleRoleType ) )* )? ( (lv_task_4_0= ruleTask ) )* otherlv_5= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1831:1: (otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Role' ( (lv_role_3_0= ruleRoleType ) )* )? ( (lv_task_4_0= ruleTask ) )* otherlv_5= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1831:3: otherlv_0= 'Process' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Role' ( (lv_role_3_0= ruleRoleType ) )* )? ( (lv_task_4_0= ruleTask ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleProcess3915); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1835:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1836:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1836:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1837:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess3932); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1853:2: (otherlv_2= 'Role' ( (lv_role_3_0= ruleRoleType ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1853:4: otherlv_2= 'Role' ( (lv_role_3_0= ruleRoleType ) )*
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleProcess3950); 

                        	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getRoleKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1857:1: ( (lv_role_3_0= ruleRoleType ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=68 && LA35_0<=69)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1858:1: (lv_role_3_0= ruleRoleType )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1858:1: (lv_role_3_0= ruleRoleType )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1859:3: lv_role_3_0= ruleRoleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getRoleRoleTypeEnumRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoleType_in_ruleProcess3971);
                    	    lv_role_3_0=ruleRoleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"role",
                    	            		lv_role_3_0, 
                    	            		"RoleType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1875:5: ( (lv_task_4_0= ruleTask ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==50) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1876:1: (lv_task_4_0= ruleTask )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1876:1: (lv_task_4_0= ruleTask )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1877:3: lv_task_4_0= ruleTask
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getTaskTaskParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTask_in_ruleProcess3995);
            	    lv_task_4_0=ruleTask();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"task",
            	            		lv_task_4_0, 
            	            		"Task");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleProcess4008); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1905:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1906:2: (iv_ruleTask= ruleTask EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1907:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask4044);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask4054); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1914:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? otherlv_11= '}' ) ;
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
        Enumerator lv_role_7_0 = null;

        EObject lv_artefacts_10_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1917:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? otherlv_11= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1918:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? otherlv_11= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1918:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? otherlv_11= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1918:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )? (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )? otherlv_8= '{' (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleTask4091); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1922:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1923:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1923:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1924:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask4108); 

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

            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleTask4125); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDescriptionKeyword_2());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1944:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1945:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1945:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1946:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask4142); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1962:2: (otherlv_4= 'to' ( ( ruleQualifiedName ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==52) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1962:4: otherlv_4= 'to' ( ( ruleQualifiedName ) )*
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleTask4160); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getToKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1966:1: ( ( ruleQualifiedName ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1967:1: ( ruleQualifiedName )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1967:1: ( ruleQualifiedName )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1968:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getNextTaskCrossReference_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask4183);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1981:5: (otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1981:7: otherlv_6= 'Role' ( (lv_role_7_0= ruleRoleType ) )*
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleTask4199); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRoleKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1985:1: ( (lv_role_7_0= ruleRoleType ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=68 && LA40_0<=69)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1986:1: (lv_role_7_0= ruleRoleType )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1986:1: (lv_role_7_0= ruleRoleType )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:1987:3: lv_role_7_0= ruleRoleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getRoleRoleTypeEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoleType_in_ruleTask4220);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTask4235); 

                	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2007:1: (otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2007:3: otherlv_9= 'artefacts' ( (lv_artefacts_10_0= ruleArtefact ) )*
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_53_in_ruleTask4248); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getArtefactsKeyword_7_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2011:1: ( (lv_artefacts_10_0= ruleArtefact ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2012:1: (lv_artefacts_10_0= ruleArtefact )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2012:1: (lv_artefacts_10_0= ruleArtefact )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2013:3: lv_artefacts_10_0= ruleArtefact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getArtefactsArtefactParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArtefact_in_ruleTask4269);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleTask4284); 

                	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2041:1: entryRuleArtefact returns [EObject current=null] : iv_ruleArtefact= ruleArtefact EOF ;
    public final EObject entryRuleArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefact = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2042:2: (iv_ruleArtefact= ruleArtefact EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2043:2: iv_ruleArtefact= ruleArtefact EOF
            {
             newCompositeNode(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_ruleArtefact_in_entryRuleArtefact4320);
            iv_ruleArtefact=ruleArtefact();

            state._fsp--;

             current =iv_ruleArtefact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefact4330); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2050:1: ruleArtefact returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) ;
    public final EObject ruleArtefact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2053:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2054:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2054:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2054:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'description' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= 'type' ( (lv_type_4_0= ruleArtefactType ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2054:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2055:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2055:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2056:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArtefact4372); 

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

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleArtefact4389); 

                	newLeafNode(otherlv_1, grammarAccess.getArtefactAccess().getDescriptionKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2076:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2077:1: (lv_description_2_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2077:1: (lv_description_2_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2078:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtefact4406); 

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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleArtefact4423); 

                	newLeafNode(otherlv_3, grammarAccess.getArtefactAccess().getTypeKeyword_3());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2098:1: ( (lv_type_4_0= ruleArtefactType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2099:1: (lv_type_4_0= ruleArtefactType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2099:1: (lv_type_4_0= ruleArtefactType )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2100:3: lv_type_4_0= ruleArtefactType
            {
             
            	        newCompositeNode(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleArtefactType_in_ruleArtefact4444);
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


    // $ANTLR start "entryRuleQuestionnaire"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2124:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2125:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2126:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire4480);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire4490); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2133:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2136:28: ( (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2137:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2137:1: (otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2137:3: otherlv_0= 'Questionnaire' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )? (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )? otherlv_6= '{' ( (lv_question_7_0= ruleQuestion ) )* otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleQuestionnaire4527); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2142:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2142:1: (lv_name_1_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire4544); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2159:2: (otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2159:4: otherlv_2= 'relates' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleQuestionnaire4562); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2163:1: ( (otherlv_3= RULE_ID ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_ID) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2164:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2164:1: (otherlv_3= RULE_ID )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2165:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQuestionnaireRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire4582); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getRelatesToProcessCrossReference_2_1_0()); 
                    	    	

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2176:5: (otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==54) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2176:7: otherlv_4= 'type' ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleQuestionnaire4598); 

                        	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getTypeKeyword_3_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2180:1: ( (lv_questionnaireType_5_0= ruleQuestionnaireType ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2181:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2181:1: (lv_questionnaireType_5_0= ruleQuestionnaireType )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2182:3: lv_questionnaireType_5_0= ruleQuestionnaireType
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeQuestionnaireTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire4619);
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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleQuestionnaire4633); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2202:1: ( (lv_question_7_0= ruleQuestion ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2203:1: (lv_question_7_0= ruleQuestion )
            	    {
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2203:1: (lv_question_7_0= ruleQuestion )
            	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2204:3: lv_question_7_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleQuestionnaire4654);
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
            	    break loop47;
                }
            } while (true);

            otherlv_8=(Token)match(input,57,FOLLOW_57_in_ruleQuestionnaire4667); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2232:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2233:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2234:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion4703);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion4713); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2241:1: ruleQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2244:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2245:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2245:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2245:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) ) (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )? (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )? otherlv_10= '}'
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2245:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2246:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2246:1: (lv_name_0_0= RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2247:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion4755); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleQuestion4772); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2267:1: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2267:3: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleQuestion4785); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getDescriptionKeyword_2_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2271:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2272:1: (lv_description_3_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2272:1: (lv_description_3_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2273:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion4802); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2289:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2289:5: otherlv_4= 'type' ( (lv_type_5_0= ruleAnswerType ) )
            {
            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleQuestion4821); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getTypeKeyword_3_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2293:1: ( (lv_type_5_0= ruleAnswerType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2294:1: (lv_type_5_0= ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2294:1: (lv_type_5_0= ruleAnswerType )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2295:3: lv_type_5_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion4842);
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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2311:3: (otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2311:5: otherlv_6= 'required' ( (lv_req_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_58_in_ruleQuestion4856); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRequiredKeyword_4_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2315:1: ( (lv_req_7_0= RULE_INT ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2316:1: (lv_req_7_0= RULE_INT )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2316:1: (lv_req_7_0= RULE_INT )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2317:3: lv_req_7_0= RULE_INT
                    {
                    lv_req_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuestion4873); 

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

            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2333:4: (otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2333:6: otherlv_8= 'Alternatives' ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_59_in_ruleQuestion4893); 

                        	newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0());
                        
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2337:1: ( (lv_alternatives_9_0= ruleAlternatives ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==60) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2338:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    {
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2338:1: (lv_alternatives_9_0= ruleAlternatives )
                    	    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2339:3: lv_alternatives_9_0= ruleAlternatives
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAlternatives_in_ruleQuestion4914);
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
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleQuestion4929); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2367:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2368:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2369:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives4965);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives4975); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2376:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2379:28: ( (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2380:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2380:1: (otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2380:3: otherlv_0= 'Option' ( (lv_description_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleAlternatives5012); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getOptionKeyword_0());
                
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2384:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2385:1: (lv_description_1_0= RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2385:1: (lv_description_1_0= RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2386:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternatives5029); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2410:1: ruleScaleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Numerical' ) | (enumLiteral_1= 'Ordinal' ) | (enumLiteral_2= 'Nominal' ) ) ;
    public final Enumerator ruleScaleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2412:28: ( ( (enumLiteral_0= 'Numerical' ) | (enumLiteral_1= 'Ordinal' ) | (enumLiteral_2= 'Nominal' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2413:1: ( (enumLiteral_0= 'Numerical' ) | (enumLiteral_1= 'Ordinal' ) | (enumLiteral_2= 'Nominal' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2413:1: ( (enumLiteral_0= 'Numerical' ) | (enumLiteral_1= 'Ordinal' ) | (enumLiteral_2= 'Nominal' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt51=1;
                }
                break;
            case 62:
                {
                alt51=2;
                }
                break;
            case 63:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2413:2: (enumLiteral_0= 'Numerical' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2413:2: (enumLiteral_0= 'Numerical' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2413:4: enumLiteral_0= 'Numerical'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleScaleType5084); 

                            current = grammarAccess.getScaleTypeAccess().getNumericialEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getScaleTypeAccess().getNumericialEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2419:6: (enumLiteral_1= 'Ordinal' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2419:6: (enumLiteral_1= 'Ordinal' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2419:8: enumLiteral_1= 'Ordinal'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_62_in_ruleScaleType5101); 

                            current = grammarAccess.getScaleTypeAccess().getOrdinalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getScaleTypeAccess().getOrdinalEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2425:6: (enumLiteral_2= 'Nominal' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2425:6: (enumLiteral_2= 'Nominal' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2425:8: enumLiteral_2= 'Nominal'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_63_in_ruleScaleType5118); 

                            current = grammarAccess.getScaleTypeAccess().getNominalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getScaleTypeAccess().getNominalEnumLiteralDeclaration_2()); 
                        

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2435:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2437:28: ( ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2438:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2438:1: ( (enumLiteral_0= 'CRD - Completely Randomized Design' ) | (enumLiteral_1= 'RCBD - Randomized Complete Block Design' ) | (enumLiteral_2= 'LS - Latin Square' ) | (enumLiteral_3= 'Other' ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt52=1;
                }
                break;
            case 65:
                {
                alt52=2;
                }
                break;
            case 66:
                {
                alt52=3;
                }
                break;
            case 67:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2438:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2438:2: (enumLiteral_0= 'CRD - Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2438:4: enumLiteral_0= 'CRD - Completely Randomized Design'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleDesignType5163); 

                            current = grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2444:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2444:6: (enumLiteral_1= 'RCBD - Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2444:8: enumLiteral_1= 'RCBD - Randomized Complete Block Design'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleDesignType5180); 

                            current = grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2450:6: (enumLiteral_2= 'LS - Latin Square' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2450:6: (enumLiteral_2= 'LS - Latin Square' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2450:8: enumLiteral_2= 'LS - Latin Square'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleDesignType5197); 

                            current = grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2456:6: (enumLiteral_3= 'Other' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2456:6: (enumLiteral_3= 'Other' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2456:8: enumLiteral_3= 'Other'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_67_in_ruleDesignType5214); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2466:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2468:28: ( ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2469:1: ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2469:1: ( (enumLiteral_0= 'Participant' ) | (enumLiteral_1= 'Researcher' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==68) ) {
                alt53=1;
            }
            else if ( (LA53_0==69) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2469:2: (enumLiteral_0= 'Participant' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2469:2: (enumLiteral_0= 'Participant' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2469:4: enumLiteral_0= 'Participant'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleRoleType5259); 

                            current = grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2475:6: (enumLiteral_1= 'Researcher' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2475:6: (enumLiteral_1= 'Researcher' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2475:8: enumLiteral_1= 'Researcher'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleRoleType5276); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2485:1: ruleArtefactType returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) ;
    public final Enumerator ruleArtefactType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2487:28: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2488:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2488:1: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'inoutput' ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt54=1;
                }
                break;
            case 71:
                {
                alt54=2;
                }
                break;
            case 72:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2488:2: (enumLiteral_0= 'input' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2488:2: (enumLiteral_0= 'input' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2488:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleArtefactType5321); 

                            current = grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2494:6: (enumLiteral_1= 'output' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2494:6: (enumLiteral_1= 'output' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2494:8: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleArtefactType5338); 

                            current = grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2500:6: (enumLiteral_2= 'inoutput' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2500:6: (enumLiteral_2= 'inoutput' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2500:8: enumLiteral_2= 'inoutput'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_72_in_ruleArtefactType5355); 

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


    // $ANTLR start "ruleQuestionnaireType"
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2510:1: ruleQuestionnaireType returns [Enumerator current=null] : ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) ) ;
    public final Enumerator ruleQuestionnaireType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2512:28: ( ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2513:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2513:1: ( (enumLiteral_0= 'Pre' ) | (enumLiteral_1= 'Post' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==73) ) {
                alt55=1;
            }
            else if ( (LA55_0==74) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2513:2: (enumLiteral_0= 'Pre' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2513:2: (enumLiteral_0= 'Pre' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2513:4: enumLiteral_0= 'Pre'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleQuestionnaireType5400); 

                            current = grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2519:6: (enumLiteral_1= 'Post' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2519:6: (enumLiteral_1= 'Post' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2519:8: enumLiteral_1= 'Post'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleQuestionnaireType5417); 

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
    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2529:1: ruleAnswerType returns [Enumerator current=null] : ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) ) ;
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
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2531:28: ( ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2532:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2532:1: ( (enumLiteral_0= 'Text' ) | (enumLiteral_1= 'ParagraphText' ) | (enumLiteral_2= 'MultipleChoice' ) | (enumLiteral_3= 'SingleChoice' ) | (enumLiteral_4= 'Scale' ) | (enumLiteral_5= 'Grid' ) )
            int alt56=6;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt56=1;
                }
                break;
            case 76:
                {
                alt56=2;
                }
                break;
            case 77:
                {
                alt56=3;
                }
                break;
            case 78:
                {
                alt56=4;
                }
                break;
            case 38:
                {
                alt56=5;
                }
                break;
            case 79:
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
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2532:2: (enumLiteral_0= 'Text' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2532:2: (enumLiteral_0= 'Text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2532:4: enumLiteral_0= 'Text'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleAnswerType5462); 

                            current = grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2538:6: (enumLiteral_1= 'ParagraphText' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2538:6: (enumLiteral_1= 'ParagraphText' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2538:8: enumLiteral_1= 'ParagraphText'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleAnswerType5479); 

                            current = grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2544:6: (enumLiteral_2= 'MultipleChoice' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2544:6: (enumLiteral_2= 'MultipleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2544:8: enumLiteral_2= 'MultipleChoice'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleAnswerType5496); 

                            current = grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2550:6: (enumLiteral_3= 'SingleChoice' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2550:6: (enumLiteral_3= 'SingleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2550:8: enumLiteral_3= 'SingleChoice'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleAnswerType5513); 

                            current = grammarAccess.getAnswerTypeAccess().getSingleChoiceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnswerTypeAccess().getSingleChoiceEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2556:6: (enumLiteral_4= 'Scale' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2556:6: (enumLiteral_4= 'Scale' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2556:8: enumLiteral_4= 'Scale'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_38_in_ruleAnswerType5530); 

                            current = grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2562:6: (enumLiteral_5= 'Grid' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2562:6: (enumLiteral_5= 'Grid' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv3/src-gen/br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.g:2562:8: enumLiteral_5= 'Grid'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleAnswerType5547); 

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


    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA34_eotS =
        "\10\uffff";
    static final String DFA34_eofS =
        "\3\uffff\1\6\3\uffff\1\6";
    static final String DFA34_minS =
        "\1\52\1\uffff\1\4\1\16\1\4\2\uffff\1\16";
    static final String DFA34_maxS =
        "\1\55\1\uffff\1\4\1\53\1\4\2\uffff\1\53";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\1\3\1\uffff";
    static final String DFA34_specialS =
        "\10\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\2\uffff\1\2",
            "",
            "\1\3",
            "\1\4\16\uffff\1\6\15\uffff\1\5",
            "\1\7",
            "",
            "",
            "\1\4\16\uffff\1\6\15\uffff\1\5"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1509:1: (this_LS_0= ruleLS | this_RCBD_1= ruleRCBD | this_CRB_2= ruleCRB )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentElement175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExperimentElement212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperimentElement229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentElement251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExperimentElement268 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_ruleExperimentalDesign_in_ruleExperimentElement289 = new BitSet(new long[]{0x0001000000002002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleExperimentElement310 = new BitSet(new long[]{0x0001000000002002L});
    public static final BitSet FOLLOW_13_in_ruleExperimentElement324 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_ruleExperimentElement345 = new BitSet(new long[]{0x0080000000000002L});
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
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign638 = new BitSet(new long[]{0x0000001F80000020L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleExperimentalDesign659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign671 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleExperimentalDesign686 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleExperimentalDesign707 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_20_in_ruleExperimentalDesign723 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign735 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleExperimentalDesign756 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign769 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_21_in_ruleExperimentalDesign783 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign795 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleResearchQuestion_in_ruleExperimentalDesign816 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign829 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_22_in_ruleExperimentalDesign844 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign856 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleResearchHypothesis_in_ruleExperimentalDesign877 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign890 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleExperimentalDesign905 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign917 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExperimentalDesign938 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign951 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExperimentalDesign966 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign978 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleDepVariable_in_ruleExperimentalDesign999 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign1012 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExperimentalDesign1026 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentalDesign1038 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExperimentalDesign1059 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleExperimentalDesign1072 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExperimentalDesign1086 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExperimentalDesign1098 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleDesignType_in_ruleExperimentalDesign1119 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExperimentalDesign1131 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_ruleDOE_in_ruleExperimentalDesign1152 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExperimentalDesign1164 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleExperimentalDesign1178 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExperimentalDesign1199 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleAuthor_in_entryRuleAuthor1238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthor1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAuthor1290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAuthor1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAbstract_in_ruleAbstract1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredAbstract_in_ruleAbstract1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAbstract_in_entryRuleSimpleAbstract1472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAbstract1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleAbstract1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuredAbstract_in_entryRuleStructuredAbstract1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuredAbstract1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStructuredAbstract1620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1637 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_32_in_ruleStructuredAbstract1657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1674 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_33_in_ruleStructuredAbstract1694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1711 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_34_in_ruleStructuredAbstract1731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1748 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_ruleStructuredAbstract1768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1785 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleStructuredAbstract1805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructuredAbstract1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword1865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKeyword1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResearchQuestion_in_entryRuleResearchQuestion2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResearchQuestion2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResearchQuestion2123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResearchQuestion2145 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleResearchQuestion2162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleResearchQuestion2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResearchHypothesis_in_entryRuleResearchHypothesis2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResearchHypothesis2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResearchHypothesis2273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResearchHypothesis2295 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleResearchHypothesis2312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleResearchHypothesis2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2445 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleVariable2463 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_ruleScaleType_in_ruleVariable2484 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleVariable2499 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariable2511 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleRange_in_ruleVariable2532 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleVariable2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRange2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDepVariable_in_entryRuleDepVariable2674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDepVariable2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDepVariable2732 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDepVariable2744 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_ruleDepVariable2758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDepVariable2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDepVariable2801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDepVariable2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor2862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFactor2920 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleFactor2933 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleLevel_in_ruleFactor2954 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleFactor2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel_in_entryRuleLevel3005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevel3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLevel3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOE_in_entryRuleDOE3097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOE3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLS_in_ruleDOE3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRCBD_in_ruleDOE3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCRB_in_ruleDOE3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLS_in_entryRuleLS3243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLS3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLS3299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLS3322 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleLS3334 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleLS3346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLS3369 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleLS3381 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleLS3393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLS3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRCBD_in_entryRuleRCBD3452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRCBD3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRCBD3508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRCBD3531 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleRCBD3543 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleRCBD3555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRCBD3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCRB_in_entryRuleCRB3614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCRB3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCRB3670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCRB3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleParameter3776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3793 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParameter3810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess3868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleProcess3915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess3932 = new BitSet(new long[]{0x0006000000020000L});
    public static final BitSet FOLLOW_49_in_ruleProcess3950 = new BitSet(new long[]{0x0004000000020000L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRoleType_in_ruleProcess3971 = new BitSet(new long[]{0x0004000000020000L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleTask_in_ruleProcess3995 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProcess4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask4044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTask4091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask4108 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTask4125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask4142 = new BitSet(new long[]{0x0012000000010000L});
    public static final BitSet FOLLOW_52_in_ruleTask4160 = new BitSet(new long[]{0x0002000000010010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask4183 = new BitSet(new long[]{0x0002000000010010L});
    public static final BitSet FOLLOW_49_in_ruleTask4199 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRoleType_in_ruleTask4220 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000030L});
    public static final BitSet FOLLOW_16_in_ruleTask4235 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_53_in_ruleTask4248 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleArtefact_in_ruleTask4269 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleTask4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefact_in_entryRuleArtefact4320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefact4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArtefact4372 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleArtefact4389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtefact4406 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleArtefact4423 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_ruleArtefactType_in_ruleArtefact4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire4480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQuestionnaire4527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire4544 = new BitSet(new long[]{0x0140000000010000L});
    public static final BitSet FOLLOW_56_in_ruleQuestionnaire4562 = new BitSet(new long[]{0x0040000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire4582 = new BitSet(new long[]{0x0040000000010010L});
    public static final BitSet FOLLOW_54_in_ruleQuestionnaire4598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleQuestionnaireType_in_ruleQuestionnaire4619 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestionnaire4633 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionnaire4654 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_57_in_ruleQuestionnaire4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion4703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion4755 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuestion4772 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleQuestion4785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion4802 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleQuestion4821 = new BitSet(new long[]{0x0000004000000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion4842 = new BitSet(new long[]{0x0C00000000020000L});
    public static final BitSet FOLLOW_58_in_ruleQuestion4856 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuestion4873 = new BitSet(new long[]{0x0800000000020000L});
    public static final BitSet FOLLOW_59_in_ruleQuestion4893 = new BitSet(new long[]{0x1000000000020000L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleQuestion4914 = new BitSet(new long[]{0x1000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuestion4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives4965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAlternatives5012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternatives5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleScaleType5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleScaleType5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleScaleType5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDesignType5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDesignType5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDesignType5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDesignType5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleRoleType5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleRoleType5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleArtefactType5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleArtefactType5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleArtefactType5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleQuestionnaireType5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleQuestionnaireType5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAnswerType5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAnswerType5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAnswerType5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAnswerType5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAnswerType5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAnswerType5547 = new BitSet(new long[]{0x0000000000000002L});

}