package br.ufrn.dimap.ase.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import br.ufrn.dimap.ase.dsl.services.ExpDslv2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpDslv2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'=='", "'<>'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'null_'", "'alternative'", "'CRD - Completely Randomized Design'", "'RCBD - Randomized Complete Block Design'", "'LS - Latin Square'", "'Other'", "'Chi-2'", "'Binomial Test'", "'t-test'", "'F-test'", "'McNemar Test'", "'Mann-Whitney'", "'Paired t-test'", "'Wilcoxon'", "'Sign test'", "'ANOVA'", "'Kruskal-Wallis'", "'Others'", "'Participant'", "'Researcher'", "'input'", "'output'", "'inoutput'", "'number'", "'text'", "'Pre'", "'Post'", "'Text'", "'ParagraphText'", "'MultipleChoice'", "'SingleChoice'", "'Scale'", "'Grid'", "'Experiment'", "'Experimental Plan'", "'Questionnaires'", "'.'", "'Goals'", "'{'", "'}'", "'DesignOfExperiment'", "'Statistical Analysis Technique'", "'Internal Replication '", "':'", "'('", "')'", "'Parameter'", "'Dependent Variable'", "'Factor'", "'isDesiredVariation'", "'Process'", "'to'", "'Role'", "'Task'", "'description'", "'var'", "'artefacts'", "'quest'", "'type'", "'Metric'", "'relates'", "'taskBegin'", "'taskEnd'", "'collectedData'", "'artefact'", "'Questionnaire'", "'};'", "'required'", "'Alternatives'", "'Option'"
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


        public InternalExpDslv2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpDslv2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpDslv2Parser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g"; }


     
     	private ExpDslv2GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpDslv2GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:61:1: ( ruleModel EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:73:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:75:1: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:76:1: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==54) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:76:2: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExperimentElement"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:88:1: entryRuleExperimentElement : ruleExperimentElement EOF ;
    public final void entryRuleExperimentElement() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:89:1: ( ruleExperimentElement EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:90:1: ruleExperimentElement EOF
            {
             before(grammarAccess.getExperimentElementRule()); 
            pushFollow(FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement122);
            ruleExperimentElement();

            state._fsp--;

             after(grammarAccess.getExperimentElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentElement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperimentElement"


    // $ANTLR start "ruleExperimentElement"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:97:1: ruleExperimentElement : ( ( rule__ExperimentElement__Group__0 ) ) ;
    public final void ruleExperimentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:101:2: ( ( ( rule__ExperimentElement__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:102:1: ( ( rule__ExperimentElement__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:102:1: ( ( rule__ExperimentElement__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:103:1: ( rule__ExperimentElement__Group__0 )
            {
             before(grammarAccess.getExperimentElementAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:104:1: ( rule__ExperimentElement__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:104:2: rule__ExperimentElement__Group__0
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group__0_in_ruleExperimentElement155);
            rule__ExperimentElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperimentElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:117:1: ( ruleQualifiedName EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:118:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName182);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:132:1: ( rule__QualifiedName__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:132:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName215);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExperimentalPlan"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:144:1: entryRuleExperimentalPlan : ruleExperimentalPlan EOF ;
    public final void entryRuleExperimentalPlan() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:145:1: ( ruleExperimentalPlan EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:146:1: ruleExperimentalPlan EOF
            {
             before(grammarAccess.getExperimentalPlanRule()); 
            pushFollow(FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan242);
            ruleExperimentalPlan();

            state._fsp--;

             after(grammarAccess.getExperimentalPlanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentalPlan249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperimentalPlan"


    // $ANTLR start "ruleExperimentalPlan"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:153:1: ruleExperimentalPlan : ( ( rule__ExperimentalPlan__Group__0 ) ) ;
    public final void ruleExperimentalPlan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:157:2: ( ( ( rule__ExperimentalPlan__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:158:1: ( ( rule__ExperimentalPlan__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:158:1: ( ( rule__ExperimentalPlan__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:159:1: ( rule__ExperimentalPlan__Group__0 )
            {
             before(grammarAccess.getExperimentalPlanAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:160:1: ( rule__ExperimentalPlan__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:160:2: rule__ExperimentalPlan__Group__0
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__0_in_ruleExperimentalPlan275);
            rule__ExperimentalPlan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentalPlanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperimentalPlan"


    // $ANTLR start "entryRuleGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:172:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:173:1: ( ruleGoal EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:174:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal302);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:181:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:185:2: ( ( ( rule__Goal__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:186:1: ( ( rule__Goal__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:186:1: ( ( rule__Goal__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:187:1: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:188:1: ( rule__Goal__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:188:2: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_rule__Goal__Group__0_in_ruleGoal335);
            rule__Goal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleHypotheses"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:200:1: entryRuleHypotheses : ruleHypotheses EOF ;
    public final void entryRuleHypotheses() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:201:1: ( ruleHypotheses EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:202:1: ruleHypotheses EOF
            {
             before(grammarAccess.getHypothesesRule()); 
            pushFollow(FOLLOW_ruleHypotheses_in_entryRuleHypotheses362);
            ruleHypotheses();

            state._fsp--;

             after(grammarAccess.getHypothesesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHypotheses369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHypotheses"


    // $ANTLR start "ruleHypotheses"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:209:1: ruleHypotheses : ( ( rule__Hypotheses__Alternatives ) ) ;
    public final void ruleHypotheses() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:213:2: ( ( ( rule__Hypotheses__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:214:1: ( ( rule__Hypotheses__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:214:1: ( ( rule__Hypotheses__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:215:1: ( rule__Hypotheses__Alternatives )
            {
             before(grammarAccess.getHypothesesAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:216:1: ( rule__Hypotheses__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:216:2: rule__Hypotheses__Alternatives
            {
            pushFollow(FOLLOW_rule__Hypotheses__Alternatives_in_ruleHypotheses395);
            rule__Hypotheses__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHypotheses"


    // $ANTLR start "entryRuleParameter"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:229:1: ( ruleParameter EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:230:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter422);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:242:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:242:1: ( ( rule__Parameter__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:243:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:244:1: ( rule__Parameter__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:244:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter455);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleDependentVariable"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:256:1: entryRuleDependentVariable : ruleDependentVariable EOF ;
    public final void entryRuleDependentVariable() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:257:1: ( ruleDependentVariable EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:258:1: ruleDependentVariable EOF
            {
             before(grammarAccess.getDependentVariableRule()); 
            pushFollow(FOLLOW_ruleDependentVariable_in_entryRuleDependentVariable482);
            ruleDependentVariable();

            state._fsp--;

             after(grammarAccess.getDependentVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependentVariable489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependentVariable"


    // $ANTLR start "ruleDependentVariable"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:265:1: ruleDependentVariable : ( ( rule__DependentVariable__Group__0 ) ) ;
    public final void ruleDependentVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:269:2: ( ( ( rule__DependentVariable__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:270:1: ( ( rule__DependentVariable__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:270:1: ( ( rule__DependentVariable__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:271:1: ( rule__DependentVariable__Group__0 )
            {
             before(grammarAccess.getDependentVariableAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:272:1: ( rule__DependentVariable__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:272:2: rule__DependentVariable__Group__0
            {
            pushFollow(FOLLOW_rule__DependentVariable__Group__0_in_ruleDependentVariable515);
            rule__DependentVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependentVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependentVariable"


    // $ANTLR start "entryRuleFactor"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:284:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:285:1: ( ruleFactor EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:286:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor542);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:293:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:297:2: ( ( ( rule__Factor__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:298:1: ( ( rule__Factor__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:298:1: ( ( rule__Factor__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:299:1: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:300:1: ( rule__Factor__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:300:2: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_rule__Factor__Group__0_in_ruleFactor575);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleLevels"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:312:1: entryRuleLevels : ruleLevels EOF ;
    public final void entryRuleLevels() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:313:1: ( ruleLevels EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:314:1: ruleLevels EOF
            {
             before(grammarAccess.getLevelsRule()); 
            pushFollow(FOLLOW_ruleLevels_in_entryRuleLevels602);
            ruleLevels();

            state._fsp--;

             after(grammarAccess.getLevelsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLevels609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLevels"


    // $ANTLR start "ruleLevels"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:321:1: ruleLevels : ( ( rule__Levels__NameAssignment ) ) ;
    public final void ruleLevels() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:325:2: ( ( ( rule__Levels__NameAssignment ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:326:1: ( ( rule__Levels__NameAssignment ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:326:1: ( ( rule__Levels__NameAssignment ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:327:1: ( rule__Levels__NameAssignment )
            {
             before(grammarAccess.getLevelsAccess().getNameAssignment()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:328:1: ( rule__Levels__NameAssignment )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:328:2: rule__Levels__NameAssignment
            {
            pushFollow(FOLLOW_rule__Levels__NameAssignment_in_ruleLevels635);
            rule__Levels__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLevelsAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevels"


    // $ANTLR start "entryRuleProcess"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:340:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:341:1: ( ruleProcess EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:342:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess662);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:349:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:353:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:354:1: ( ( rule__Process__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:354:1: ( ( rule__Process__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:355:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:356:1: ( rule__Process__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:356:2: rule__Process__Group__0
            {
            pushFollow(FOLLOW_rule__Process__Group__0_in_ruleProcess695);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleTask"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:368:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:369:1: ( ruleTask EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:370:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask722);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:377:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:381:2: ( ( ( rule__Task__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:382:1: ( ( rule__Task__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:382:1: ( ( rule__Task__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:383:1: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:384:1: ( rule__Task__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:384:2: rule__Task__Group__0
            {
            pushFollow(FOLLOW_rule__Task__Group__0_in_ruleTask755);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleArtefact"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:396:1: entryRuleArtefact : ruleArtefact EOF ;
    public final void entryRuleArtefact() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:397:1: ( ruleArtefact EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:398:1: ruleArtefact EOF
            {
             before(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_ruleArtefact_in_entryRuleArtefact782);
            ruleArtefact();

            state._fsp--;

             after(grammarAccess.getArtefactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtefact789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArtefact"


    // $ANTLR start "ruleArtefact"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:405:1: ruleArtefact : ( ( rule__Artefact__Group__0 ) ) ;
    public final void ruleArtefact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:409:2: ( ( ( rule__Artefact__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:410:1: ( ( rule__Artefact__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:410:1: ( ( rule__Artefact__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:411:1: ( rule__Artefact__Group__0 )
            {
             before(grammarAccess.getArtefactAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:412:1: ( rule__Artefact__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:412:2: rule__Artefact__Group__0
            {
            pushFollow(FOLLOW_rule__Artefact__Group__0_in_ruleArtefact815);
            rule__Artefact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtefactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtefact"


    // $ANTLR start "entryRuleMetrics"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:424:1: entryRuleMetrics : ruleMetrics EOF ;
    public final void entryRuleMetrics() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:425:1: ( ruleMetrics EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:426:1: ruleMetrics EOF
            {
             before(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_ruleMetrics_in_entryRuleMetrics842);
            ruleMetrics();

            state._fsp--;

             after(grammarAccess.getMetricsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetrics849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetrics"


    // $ANTLR start "ruleMetrics"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:433:1: ruleMetrics : ( ( rule__Metrics__Group__0 ) ) ;
    public final void ruleMetrics() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:437:2: ( ( ( rule__Metrics__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:438:1: ( ( rule__Metrics__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:438:1: ( ( rule__Metrics__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:439:1: ( rule__Metrics__Group__0 )
            {
             before(grammarAccess.getMetricsAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:440:1: ( rule__Metrics__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:440:2: rule__Metrics__Group__0
            {
            pushFollow(FOLLOW_rule__Metrics__Group__0_in_ruleMetrics875);
            rule__Metrics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetrics"


    // $ANTLR start "entryRuleDetail"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:452:1: entryRuleDetail : ruleDetail EOF ;
    public final void entryRuleDetail() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:453:1: ( ruleDetail EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:454:1: ruleDetail EOF
            {
             before(grammarAccess.getDetailRule()); 
            pushFollow(FOLLOW_ruleDetail_in_entryRuleDetail902);
            ruleDetail();

            state._fsp--;

             after(grammarAccess.getDetailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetail909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDetail"


    // $ANTLR start "ruleDetail"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:461:1: ruleDetail : ( ( rule__Detail__Alternatives ) ) ;
    public final void ruleDetail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:465:2: ( ( ( rule__Detail__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:466:1: ( ( rule__Detail__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:466:1: ( ( rule__Detail__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:467:1: ( rule__Detail__Alternatives )
            {
             before(grammarAccess.getDetailAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:468:1: ( rule__Detail__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:468:2: rule__Detail__Alternatives
            {
            pushFollow(FOLLOW_rule__Detail__Alternatives_in_ruleDetail935);
            rule__Detail__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDetailAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDetail"


    // $ANTLR start "entryRuleTaskMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:480:1: entryRuleTaskMetric : ruleTaskMetric EOF ;
    public final void entryRuleTaskMetric() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:481:1: ( ruleTaskMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:482:1: ruleTaskMetric EOF
            {
             before(grammarAccess.getTaskMetricRule()); 
            pushFollow(FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric962);
            ruleTaskMetric();

            state._fsp--;

             after(grammarAccess.getTaskMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskMetric969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskMetric"


    // $ANTLR start "ruleTaskMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:489:1: ruleTaskMetric : ( ( rule__TaskMetric__Group__0 ) ) ;
    public final void ruleTaskMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:493:2: ( ( ( rule__TaskMetric__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:494:1: ( ( rule__TaskMetric__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:494:1: ( ( rule__TaskMetric__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:495:1: ( rule__TaskMetric__Group__0 )
            {
             before(grammarAccess.getTaskMetricAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:496:1: ( rule__TaskMetric__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:496:2: rule__TaskMetric__Group__0
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group__0_in_ruleTaskMetric995);
            rule__TaskMetric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskMetricAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskMetric"


    // $ANTLR start "entryRuleDataMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:508:1: entryRuleDataMetric : ruleDataMetric EOF ;
    public final void entryRuleDataMetric() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:509:1: ( ruleDataMetric EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:510:1: ruleDataMetric EOF
            {
             before(grammarAccess.getDataMetricRule()); 
            pushFollow(FOLLOW_ruleDataMetric_in_entryRuleDataMetric1022);
            ruleDataMetric();

            state._fsp--;

             after(grammarAccess.getDataMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataMetric1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataMetric"


    // $ANTLR start "ruleDataMetric"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:517:1: ruleDataMetric : ( ( rule__DataMetric__Group__0 ) ) ;
    public final void ruleDataMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:521:2: ( ( ( rule__DataMetric__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:522:1: ( ( rule__DataMetric__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:522:1: ( ( rule__DataMetric__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:523:1: ( rule__DataMetric__Group__0 )
            {
             before(grammarAccess.getDataMetricAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:524:1: ( rule__DataMetric__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:524:2: rule__DataMetric__Group__0
            {
            pushFollow(FOLLOW_rule__DataMetric__Group__0_in_ruleDataMetric1055);
            rule__DataMetric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataMetricAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataMetric"


    // $ANTLR start "entryRuleCollectedData"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:536:1: entryRuleCollectedData : ruleCollectedData EOF ;
    public final void entryRuleCollectedData() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:537:1: ( ruleCollectedData EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:538:1: ruleCollectedData EOF
            {
             before(grammarAccess.getCollectedDataRule()); 
            pushFollow(FOLLOW_ruleCollectedData_in_entryRuleCollectedData1082);
            ruleCollectedData();

            state._fsp--;

             after(grammarAccess.getCollectedDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectedData1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectedData"


    // $ANTLR start "ruleCollectedData"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:545:1: ruleCollectedData : ( ( rule__CollectedData__NameAssignment ) ) ;
    public final void ruleCollectedData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:549:2: ( ( ( rule__CollectedData__NameAssignment ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:550:1: ( ( rule__CollectedData__NameAssignment ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:550:1: ( ( rule__CollectedData__NameAssignment ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:551:1: ( rule__CollectedData__NameAssignment )
            {
             before(grammarAccess.getCollectedDataAccess().getNameAssignment()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:552:1: ( rule__CollectedData__NameAssignment )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:552:2: rule__CollectedData__NameAssignment
            {
            pushFollow(FOLLOW_rule__CollectedData__NameAssignment_in_ruleCollectedData1115);
            rule__CollectedData__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCollectedDataAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectedData"


    // $ANTLR start "entryRuleQuestionnaire"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:564:1: entryRuleQuestionnaire : ruleQuestionnaire EOF ;
    public final void entryRuleQuestionnaire() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:565:1: ( ruleQuestionnaire EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:566:1: ruleQuestionnaire EOF
            {
             before(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire1142);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getQuestionnaireRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:573:1: ruleQuestionnaire : ( ( rule__Questionnaire__Group__0 ) ) ;
    public final void ruleQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:577:2: ( ( ( rule__Questionnaire__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:578:1: ( ( rule__Questionnaire__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:578:1: ( ( rule__Questionnaire__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:579:1: ( rule__Questionnaire__Group__0 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:580:1: ( rule__Questionnaire__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:580:2: rule__Questionnaire__Group__0
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire1175);
            rule__Questionnaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleQuestion"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:592:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:593:1: ( ruleQuestion EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:594:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion1202);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:601:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:605:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:606:1: ( ( rule__Question__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:606:1: ( ( rule__Question__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:607:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:608:1: ( rule__Question__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:608:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion1235);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAlternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:620:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:621:1: ( ruleAlternatives EOF )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:622:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives1262);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:629:1: ruleAlternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:633:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:634:1: ( ( rule__Alternatives__Group__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:634:1: ( ( rule__Alternatives__Group__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:635:1: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:636:1: ( rule__Alternatives__Group__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:636:2: rule__Alternatives__Group__0
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0_in_ruleAlternatives1295);
            rule__Alternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "ruleRelationType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:649:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:653:1: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:654:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:654:1: ( ( rule__RelationType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:655:1: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:656:1: ( rule__RelationType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:656:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1332);
            rule__RelationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "ruleOperatorType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:668:1: ruleOperatorType : ( ( rule__OperatorType__Alternatives ) ) ;
    public final void ruleOperatorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:672:1: ( ( ( rule__OperatorType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:673:1: ( ( rule__OperatorType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:673:1: ( ( rule__OperatorType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:674:1: ( rule__OperatorType__Alternatives )
            {
             before(grammarAccess.getOperatorTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:675:1: ( rule__OperatorType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:675:2: rule__OperatorType__Alternatives
            {
            pushFollow(FOLLOW_rule__OperatorType__Alternatives_in_ruleOperatorType1368);
            rule__OperatorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperatorType"


    // $ANTLR start "ruleHypothesisType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:687:1: ruleHypothesisType : ( ( rule__HypothesisType__Alternatives ) ) ;
    public final void ruleHypothesisType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:691:1: ( ( ( rule__HypothesisType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:692:1: ( ( rule__HypothesisType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:692:1: ( ( rule__HypothesisType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:693:1: ( rule__HypothesisType__Alternatives )
            {
             before(grammarAccess.getHypothesisTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:694:1: ( rule__HypothesisType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:694:2: rule__HypothesisType__Alternatives
            {
            pushFollow(FOLLOW_rule__HypothesisType__Alternatives_in_ruleHypothesisType1404);
            rule__HypothesisType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHypothesisTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHypothesisType"


    // $ANTLR start "ruleDesignType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:706:1: ruleDesignType : ( ( rule__DesignType__Alternatives ) ) ;
    public final void ruleDesignType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:710:1: ( ( ( rule__DesignType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:711:1: ( ( rule__DesignType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:711:1: ( ( rule__DesignType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:712:1: ( rule__DesignType__Alternatives )
            {
             before(grammarAccess.getDesignTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:713:1: ( rule__DesignType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:713:2: rule__DesignType__Alternatives
            {
            pushFollow(FOLLOW_rule__DesignType__Alternatives_in_ruleDesignType1440);
            rule__DesignType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDesignTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDesignType"


    // $ANTLR start "ruleAnalysisTechiqueType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:725:1: ruleAnalysisTechiqueType : ( ( rule__AnalysisTechiqueType__Alternatives ) ) ;
    public final void ruleAnalysisTechiqueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:729:1: ( ( ( rule__AnalysisTechiqueType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:730:1: ( ( rule__AnalysisTechiqueType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:730:1: ( ( rule__AnalysisTechiqueType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:731:1: ( rule__AnalysisTechiqueType__Alternatives )
            {
             before(grammarAccess.getAnalysisTechiqueTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:732:1: ( rule__AnalysisTechiqueType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:732:2: rule__AnalysisTechiqueType__Alternatives
            {
            pushFollow(FOLLOW_rule__AnalysisTechiqueType__Alternatives_in_ruleAnalysisTechiqueType1476);
            rule__AnalysisTechiqueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisTechiqueTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnalysisTechiqueType"


    // $ANTLR start "ruleRoleType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:744:1: ruleRoleType : ( ( rule__RoleType__Alternatives ) ) ;
    public final void ruleRoleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:748:1: ( ( ( rule__RoleType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:749:1: ( ( rule__RoleType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:749:1: ( ( rule__RoleType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:750:1: ( rule__RoleType__Alternatives )
            {
             before(grammarAccess.getRoleTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:751:1: ( rule__RoleType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:751:2: rule__RoleType__Alternatives
            {
            pushFollow(FOLLOW_rule__RoleType__Alternatives_in_ruleRoleType1512);
            rule__RoleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleType"


    // $ANTLR start "ruleArtefactType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:763:1: ruleArtefactType : ( ( rule__ArtefactType__Alternatives ) ) ;
    public final void ruleArtefactType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:767:1: ( ( ( rule__ArtefactType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:768:1: ( ( rule__ArtefactType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:768:1: ( ( rule__ArtefactType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:769:1: ( rule__ArtefactType__Alternatives )
            {
             before(grammarAccess.getArtefactTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:770:1: ( rule__ArtefactType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:770:2: rule__ArtefactType__Alternatives
            {
            pushFollow(FOLLOW_rule__ArtefactType__Alternatives_in_ruleArtefactType1548);
            rule__ArtefactType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArtefactTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtefactType"


    // $ANTLR start "ruleDataType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:782:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:786:1: ( ( ( rule__DataType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:787:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:787:1: ( ( rule__DataType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:788:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:789:1: ( rule__DataType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:789:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType1584);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleQuestionnaireType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:801:1: ruleQuestionnaireType : ( ( rule__QuestionnaireType__Alternatives ) ) ;
    public final void ruleQuestionnaireType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:805:1: ( ( ( rule__QuestionnaireType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:806:1: ( ( rule__QuestionnaireType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:806:1: ( ( rule__QuestionnaireType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:807:1: ( rule__QuestionnaireType__Alternatives )
            {
             before(grammarAccess.getQuestionnaireTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:808:1: ( rule__QuestionnaireType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:808:2: rule__QuestionnaireType__Alternatives
            {
            pushFollow(FOLLOW_rule__QuestionnaireType__Alternatives_in_ruleQuestionnaireType1620);
            rule__QuestionnaireType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionnaireType"


    // $ANTLR start "ruleAnswerType"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:820:1: ruleAnswerType : ( ( rule__AnswerType__Alternatives ) ) ;
    public final void ruleAnswerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:824:1: ( ( ( rule__AnswerType__Alternatives ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:825:1: ( ( rule__AnswerType__Alternatives ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:825:1: ( ( rule__AnswerType__Alternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:826:1: ( rule__AnswerType__Alternatives )
            {
             before(grammarAccess.getAnswerTypeAccess().getAlternatives()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:827:1: ( rule__AnswerType__Alternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:827:2: rule__AnswerType__Alternatives
            {
            pushFollow(FOLLOW_rule__AnswerType__Alternatives_in_ruleAnswerType1656);
            rule__AnswerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnswerTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswerType"


    // $ANTLR start "rule__Hypotheses__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:838:1: rule__Hypotheses__Alternatives : ( ( ( rule__Hypotheses__Group_0__0 ) ) | ( ( rule__Hypotheses__Group_1__0 ) ) );
    public final void rule__Hypotheses__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:842:1: ( ( ( rule__Hypotheses__Group_0__0 ) ) | ( ( rule__Hypotheses__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==65) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_STRING||(LA2_1>=21 && LA2_1<=22)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:843:1: ( ( rule__Hypotheses__Group_0__0 ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:843:1: ( ( rule__Hypotheses__Group_0__0 ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:844:1: ( rule__Hypotheses__Group_0__0 )
                    {
                     before(grammarAccess.getHypothesesAccess().getGroup_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:845:1: ( rule__Hypotheses__Group_0__0 )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:845:2: rule__Hypotheses__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Hypotheses__Group_0__0_in_rule__Hypotheses__Alternatives1691);
                    rule__Hypotheses__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHypothesesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:849:6: ( ( rule__Hypotheses__Group_1__0 ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:849:6: ( ( rule__Hypotheses__Group_1__0 ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:850:1: ( rule__Hypotheses__Group_1__0 )
                    {
                     before(grammarAccess.getHypothesesAccess().getGroup_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:851:1: ( rule__Hypotheses__Group_1__0 )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:851:2: rule__Hypotheses__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Hypotheses__Group_1__0_in_rule__Hypotheses__Alternatives1709);
                    rule__Hypotheses__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHypothesesAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Alternatives"


    // $ANTLR start "rule__Factor__IsDesiredVariationAlternatives_3_0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:860:1: rule__Factor__IsDesiredVariationAlternatives_3_0 : ( ( 'True' ) | ( 'False' ) );
    public final void rule__Factor__IsDesiredVariationAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:864:1: ( ( 'True' ) | ( 'False' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:865:1: ( 'True' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:865:1: ( 'True' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:866:1: 'True'
                    {
                     before(grammarAccess.getFactorAccess().getIsDesiredVariationTrueKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Factor__IsDesiredVariationAlternatives_3_01743); 
                     after(grammarAccess.getFactorAccess().getIsDesiredVariationTrueKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:873:6: ( 'False' )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:873:6: ( 'False' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:874:1: 'False'
                    {
                     before(grammarAccess.getFactorAccess().getIsDesiredVariationFalseKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Factor__IsDesiredVariationAlternatives_3_01763); 
                     after(grammarAccess.getFactorAccess().getIsDesiredVariationFalseKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__IsDesiredVariationAlternatives_3_0"


    // $ANTLR start "rule__Detail__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:886:1: rule__Detail__Alternatives : ( ( ruleTaskMetric ) | ( ruleDataMetric ) );
    public final void rule__Detail__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:890:1: ( ( ruleTaskMetric ) | ( ruleDataMetric ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==82) ) {
                alt4=1;
            }
            else if ( (LA4_0==EOF||LA4_0==60||LA4_0==78||(LA4_0>=84 && LA4_0<=85)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:891:1: ( ruleTaskMetric )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:891:1: ( ruleTaskMetric )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:892:1: ruleTaskMetric
                    {
                     before(grammarAccess.getDetailAccess().getTaskMetricParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTaskMetric_in_rule__Detail__Alternatives1797);
                    ruleTaskMetric();

                    state._fsp--;

                     after(grammarAccess.getDetailAccess().getTaskMetricParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:897:6: ( ruleDataMetric )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:897:6: ( ruleDataMetric )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:898:1: ruleDataMetric
                    {
                     before(grammarAccess.getDetailAccess().getDataMetricParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataMetric_in_rule__Detail__Alternatives1814);
                    ruleDataMetric();

                    state._fsp--;

                     after(grammarAccess.getDetailAccess().getDataMetricParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detail__Alternatives"


    // $ANTLR start "rule__RelationType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:908:1: rule__RelationType__Alternatives : ( ( ( '==' ) ) | ( ( '<>' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:912:1: ( ( ( '==' ) ) | ( ( '<>' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:913:1: ( ( '==' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:913:1: ( ( '==' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:914:1: ( '==' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getIsRelatedEnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:915:1: ( '==' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:915:3: '=='
                    {
                    match(input,13,FOLLOW_13_in_rule__RelationType__Alternatives1847); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getIsRelatedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:920:6: ( ( '<>' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:920:6: ( ( '<>' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:921:1: ( '<>' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getIsNotRelatedEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:922:1: ( '<>' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:922:3: '<>'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelationType__Alternatives1868); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getIsNotRelatedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationType__Alternatives"


    // $ANTLR start "rule__OperatorType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:932:1: rule__OperatorType__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__OperatorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:936:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:937:1: ( ( '=' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:937:1: ( ( '=' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:938:1: ( '=' )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:939:1: ( '=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:939:3: '='
                    {
                    match(input,15,FOLLOW_15_in_rule__OperatorType__Alternatives1904); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:944:6: ( ( '!=' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:944:6: ( ( '!=' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:945:1: ( '!=' )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getDifferentEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:946:1: ( '!=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:946:3: '!='
                    {
                    match(input,16,FOLLOW_16_in_rule__OperatorType__Alternatives1925); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getDifferentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:951:6: ( ( '>' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:951:6: ( ( '>' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:952:1: ( '>' )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getMoreEnumLiteralDeclaration_2()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:953:1: ( '>' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:953:3: '>'
                    {
                    match(input,17,FOLLOW_17_in_rule__OperatorType__Alternatives1946); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getMoreEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:958:6: ( ( '<' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:958:6: ( ( '<' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:959:1: ( '<' )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getLessEnumLiteralDeclaration_3()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:960:1: ( '<' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:960:3: '<'
                    {
                    match(input,18,FOLLOW_18_in_rule__OperatorType__Alternatives1967); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getLessEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:965:6: ( ( '>=' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:965:6: ( ( '>=' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:966:1: ( '>=' )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getMoreEqualEnumLiteralDeclaration_4()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:967:1: ( '>=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:967:3: '>='
                    {
                    match(input,19,FOLLOW_19_in_rule__OperatorType__Alternatives1988); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getMoreEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:972:6: ( ( '<=' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:972:6: ( ( '<=' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:973:1: ( '<=' )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getLessEqualEnumLiteralDeclaration_5()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:974:1: ( '<=' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:974:3: '<='
                    {
                    match(input,20,FOLLOW_20_in_rule__OperatorType__Alternatives2009); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getLessEqualEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorType__Alternatives"


    // $ANTLR start "rule__HypothesisType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:984:1: rule__HypothesisType__Alternatives : ( ( ( 'null_' ) ) | ( ( 'alternative' ) ) );
    public final void rule__HypothesisType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:988:1: ( ( ( 'null_' ) ) | ( ( 'alternative' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:989:1: ( ( 'null_' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:989:1: ( ( 'null_' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:990:1: ( 'null_' )
                    {
                     before(grammarAccess.getHypothesisTypeAccess().getNull_EnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:991:1: ( 'null_' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:991:3: 'null_'
                    {
                    match(input,21,FOLLOW_21_in_rule__HypothesisType__Alternatives2045); 

                    }

                     after(grammarAccess.getHypothesisTypeAccess().getNull_EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:996:6: ( ( 'alternative' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:996:6: ( ( 'alternative' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:997:1: ( 'alternative' )
                    {
                     before(grammarAccess.getHypothesisTypeAccess().getAlternativeEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:998:1: ( 'alternative' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:998:3: 'alternative'
                    {
                    match(input,22,FOLLOW_22_in_rule__HypothesisType__Alternatives2066); 

                    }

                     after(grammarAccess.getHypothesisTypeAccess().getAlternativeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HypothesisType__Alternatives"


    // $ANTLR start "rule__DesignType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1008:1: rule__DesignType__Alternatives : ( ( ( 'CRD - Completely Randomized Design' ) ) | ( ( 'RCBD - Randomized Complete Block Design' ) ) | ( ( 'LS - Latin Square' ) ) | ( ( 'Other' ) ) );
    public final void rule__DesignType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1012:1: ( ( ( 'CRD - Completely Randomized Design' ) ) | ( ( 'RCBD - Randomized Complete Block Design' ) ) | ( ( 'LS - Latin Square' ) ) | ( ( 'Other' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
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
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1013:1: ( ( 'CRD - Completely Randomized Design' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1013:1: ( ( 'CRD - Completely Randomized Design' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1014:1: ( 'CRD - Completely Randomized Design' )
                    {
                     before(grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1015:1: ( 'CRD - Completely Randomized Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1015:3: 'CRD - Completely Randomized Design'
                    {
                    match(input,23,FOLLOW_23_in_rule__DesignType__Alternatives2102); 

                    }

                     after(grammarAccess.getDesignTypeAccess().getCDREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1020:6: ( ( 'RCBD - Randomized Complete Block Design' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1020:6: ( ( 'RCBD - Randomized Complete Block Design' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1021:1: ( 'RCBD - Randomized Complete Block Design' )
                    {
                     before(grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1022:1: ( 'RCBD - Randomized Complete Block Design' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1022:3: 'RCBD - Randomized Complete Block Design'
                    {
                    match(input,24,FOLLOW_24_in_rule__DesignType__Alternatives2123); 

                    }

                     after(grammarAccess.getDesignTypeAccess().getRCBDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1027:6: ( ( 'LS - Latin Square' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1027:6: ( ( 'LS - Latin Square' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1028:1: ( 'LS - Latin Square' )
                    {
                     before(grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1029:1: ( 'LS - Latin Square' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1029:3: 'LS - Latin Square'
                    {
                    match(input,25,FOLLOW_25_in_rule__DesignType__Alternatives2144); 

                    }

                     after(grammarAccess.getDesignTypeAccess().getLSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1034:6: ( ( 'Other' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1034:6: ( ( 'Other' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1035:1: ( 'Other' )
                    {
                     before(grammarAccess.getDesignTypeAccess().getOtherEnumLiteralDeclaration_3()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1036:1: ( 'Other' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1036:3: 'Other'
                    {
                    match(input,26,FOLLOW_26_in_rule__DesignType__Alternatives2165); 

                    }

                     after(grammarAccess.getDesignTypeAccess().getOtherEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DesignType__Alternatives"


    // $ANTLR start "rule__AnalysisTechiqueType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1046:1: rule__AnalysisTechiqueType__Alternatives : ( ( ( 'Chi-2' ) ) | ( ( 'Binomial Test' ) ) | ( ( 't-test' ) ) | ( ( 'F-test' ) ) | ( ( 'McNemar Test' ) ) | ( ( 'Mann-Whitney' ) ) | ( ( 'Paired t-test' ) ) | ( ( 'Wilcoxon' ) ) | ( ( 'Sign test' ) ) | ( ( 'ANOVA' ) ) | ( ( 'Kruskal-Wallis' ) ) | ( ( 'Others' ) ) );
    public final void rule__AnalysisTechiqueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1050:1: ( ( ( 'Chi-2' ) ) | ( ( 'Binomial Test' ) ) | ( ( 't-test' ) ) | ( ( 'F-test' ) ) | ( ( 'McNemar Test' ) ) | ( ( 'Mann-Whitney' ) ) | ( ( 'Paired t-test' ) ) | ( ( 'Wilcoxon' ) ) | ( ( 'Sign test' ) ) | ( ( 'ANOVA' ) ) | ( ( 'Kruskal-Wallis' ) ) | ( ( 'Others' ) ) )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            case 31:
                {
                alt9=5;
                }
                break;
            case 32:
                {
                alt9=6;
                }
                break;
            case 33:
                {
                alt9=7;
                }
                break;
            case 34:
                {
                alt9=8;
                }
                break;
            case 35:
                {
                alt9=9;
                }
                break;
            case 36:
                {
                alt9=10;
                }
                break;
            case 37:
                {
                alt9=11;
                }
                break;
            case 38:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1051:1: ( ( 'Chi-2' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1051:1: ( ( 'Chi-2' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1052:1: ( 'Chi-2' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getChi2EnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1053:1: ( 'Chi-2' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1053:3: 'Chi-2'
                    {
                    match(input,27,FOLLOW_27_in_rule__AnalysisTechiqueType__Alternatives2201); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getChi2EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1058:6: ( ( 'Binomial Test' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1058:6: ( ( 'Binomial Test' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1059:1: ( 'Binomial Test' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getBinomialTestEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1060:1: ( 'Binomial Test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1060:3: 'Binomial Test'
                    {
                    match(input,28,FOLLOW_28_in_rule__AnalysisTechiqueType__Alternatives2222); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getBinomialTestEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1065:6: ( ( 't-test' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1065:6: ( ( 't-test' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1066:1: ( 't-test' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getTTestEnumLiteralDeclaration_2()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1067:1: ( 't-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1067:3: 't-test'
                    {
                    match(input,29,FOLLOW_29_in_rule__AnalysisTechiqueType__Alternatives2243); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getTTestEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1072:6: ( ( 'F-test' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1072:6: ( ( 'F-test' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1073:1: ( 'F-test' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getFTestEnumLiteralDeclaration_3()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1074:1: ( 'F-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1074:3: 'F-test'
                    {
                    match(input,30,FOLLOW_30_in_rule__AnalysisTechiqueType__Alternatives2264); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getFTestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1079:6: ( ( 'McNemar Test' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1079:6: ( ( 'McNemar Test' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1080:1: ( 'McNemar Test' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getMcNemarTestEnumLiteralDeclaration_4()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1081:1: ( 'McNemar Test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1081:3: 'McNemar Test'
                    {
                    match(input,31,FOLLOW_31_in_rule__AnalysisTechiqueType__Alternatives2285); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getMcNemarTestEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1086:6: ( ( 'Mann-Whitney' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1086:6: ( ( 'Mann-Whitney' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1087:1: ( 'Mann-Whitney' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getMannWhitneyEnumLiteralDeclaration_5()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1088:1: ( 'Mann-Whitney' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1088:3: 'Mann-Whitney'
                    {
                    match(input,32,FOLLOW_32_in_rule__AnalysisTechiqueType__Alternatives2306); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getMannWhitneyEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1093:6: ( ( 'Paired t-test' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1093:6: ( ( 'Paired t-test' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1094:1: ( 'Paired t-test' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getPairedEnumLiteralDeclaration_6()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1095:1: ( 'Paired t-test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1095:3: 'Paired t-test'
                    {
                    match(input,33,FOLLOW_33_in_rule__AnalysisTechiqueType__Alternatives2327); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getPairedEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1100:6: ( ( 'Wilcoxon' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1100:6: ( ( 'Wilcoxon' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1101:1: ( 'Wilcoxon' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getWilcoxonEnumLiteralDeclaration_7()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1102:1: ( 'Wilcoxon' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1102:3: 'Wilcoxon'
                    {
                    match(input,34,FOLLOW_34_in_rule__AnalysisTechiqueType__Alternatives2348); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getWilcoxonEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1107:6: ( ( 'Sign test' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1107:6: ( ( 'Sign test' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1108:1: ( 'Sign test' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getSignTestEnumLiteralDeclaration_8()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1109:1: ( 'Sign test' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1109:3: 'Sign test'
                    {
                    match(input,35,FOLLOW_35_in_rule__AnalysisTechiqueType__Alternatives2369); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getSignTestEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1114:6: ( ( 'ANOVA' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1114:6: ( ( 'ANOVA' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1115:1: ( 'ANOVA' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getAnovaEnumLiteralDeclaration_9()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1116:1: ( 'ANOVA' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1116:3: 'ANOVA'
                    {
                    match(input,36,FOLLOW_36_in_rule__AnalysisTechiqueType__Alternatives2390); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getAnovaEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1121:6: ( ( 'Kruskal-Wallis' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1121:6: ( ( 'Kruskal-Wallis' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1122:1: ( 'Kruskal-Wallis' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getKruskalWallisEnumLiteralDeclaration_10()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1123:1: ( 'Kruskal-Wallis' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1123:3: 'Kruskal-Wallis'
                    {
                    match(input,37,FOLLOW_37_in_rule__AnalysisTechiqueType__Alternatives2411); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getKruskalWallisEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1128:6: ( ( 'Others' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1128:6: ( ( 'Others' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1129:1: ( 'Others' )
                    {
                     before(grammarAccess.getAnalysisTechiqueTypeAccess().getOthersEnumLiteralDeclaration_11()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1130:1: ( 'Others' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1130:3: 'Others'
                    {
                    match(input,38,FOLLOW_38_in_rule__AnalysisTechiqueType__Alternatives2432); 

                    }

                     after(grammarAccess.getAnalysisTechiqueTypeAccess().getOthersEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalysisTechiqueType__Alternatives"


    // $ANTLR start "rule__RoleType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1140:1: rule__RoleType__Alternatives : ( ( ( 'Participant' ) ) | ( ( 'Researcher' ) ) );
    public final void rule__RoleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1144:1: ( ( ( 'Participant' ) ) | ( ( 'Researcher' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            else if ( (LA10_0==40) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1145:1: ( ( 'Participant' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1145:1: ( ( 'Participant' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1146:1: ( 'Participant' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1147:1: ( 'Participant' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1147:3: 'Participant'
                    {
                    match(input,39,FOLLOW_39_in_rule__RoleType__Alternatives2468); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getParticipantEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1152:6: ( ( 'Researcher' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1152:6: ( ( 'Researcher' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1153:1: ( 'Researcher' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getResearcherEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1154:1: ( 'Researcher' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1154:3: 'Researcher'
                    {
                    match(input,40,FOLLOW_40_in_rule__RoleType__Alternatives2489); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getResearcherEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleType__Alternatives"


    // $ANTLR start "rule__ArtefactType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1164:1: rule__ArtefactType__Alternatives : ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'inoutput' ) ) );
    public final void rule__ArtefactType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1168:1: ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'inoutput' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt11=1;
                }
                break;
            case 42:
                {
                alt11=2;
                }
                break;
            case 43:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1169:1: ( ( 'input' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1169:1: ( ( 'input' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1170:1: ( 'input' )
                    {
                     before(grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1171:1: ( 'input' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1171:3: 'input'
                    {
                    match(input,41,FOLLOW_41_in_rule__ArtefactType__Alternatives2525); 

                    }

                     after(grammarAccess.getArtefactTypeAccess().getIn_EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1176:6: ( ( 'output' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1176:6: ( ( 'output' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1177:1: ( 'output' )
                    {
                     before(grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1178:1: ( 'output' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1178:3: 'output'
                    {
                    match(input,42,FOLLOW_42_in_rule__ArtefactType__Alternatives2546); 

                    }

                     after(grammarAccess.getArtefactTypeAccess().getOut_EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1183:6: ( ( 'inoutput' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1183:6: ( ( 'inoutput' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1184:1: ( 'inoutput' )
                    {
                     before(grammarAccess.getArtefactTypeAccess().getInout_EnumLiteralDeclaration_2()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1185:1: ( 'inoutput' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1185:3: 'inoutput'
                    {
                    match(input,43,FOLLOW_43_in_rule__ArtefactType__Alternatives2567); 

                    }

                     after(grammarAccess.getArtefactTypeAccess().getInout_EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtefactType__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1195:1: rule__DataType__Alternatives : ( ( ( 'number' ) ) | ( ( 'text' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1199:1: ( ( ( 'number' ) ) | ( ( 'text' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            else if ( (LA12_0==45) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1200:1: ( ( 'number' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1200:1: ( ( 'number' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1201:1: ( 'number' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNumEnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1202:1: ( 'number' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1202:3: 'number'
                    {
                    match(input,44,FOLLOW_44_in_rule__DataType__Alternatives2603); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNumEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1207:6: ( ( 'text' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1207:6: ( ( 'text' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1208:1: ( 'text' )
                    {
                     before(grammarAccess.getDataTypeAccess().getTextEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1209:1: ( 'text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1209:3: 'text'
                    {
                    match(input,45,FOLLOW_45_in_rule__DataType__Alternatives2624); 

                    }

                     after(grammarAccess.getDataTypeAccess().getTextEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__QuestionnaireType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1219:1: rule__QuestionnaireType__Alternatives : ( ( ( 'Pre' ) ) | ( ( 'Post' ) ) );
    public final void rule__QuestionnaireType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1223:1: ( ( ( 'Pre' ) ) | ( ( 'Post' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            else if ( (LA13_0==47) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1224:1: ( ( 'Pre' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1224:1: ( ( 'Pre' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1225:1: ( 'Pre' )
                    {
                     before(grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1226:1: ( 'Pre' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1226:3: 'Pre'
                    {
                    match(input,46,FOLLOW_46_in_rule__QuestionnaireType__Alternatives2660); 

                    }

                     after(grammarAccess.getQuestionnaireTypeAccess().getPreEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1231:6: ( ( 'Post' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1231:6: ( ( 'Post' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1232:1: ( 'Post' )
                    {
                     before(grammarAccess.getQuestionnaireTypeAccess().getPostEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1233:1: ( 'Post' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1233:3: 'Post'
                    {
                    match(input,47,FOLLOW_47_in_rule__QuestionnaireType__Alternatives2681); 

                    }

                     after(grammarAccess.getQuestionnaireTypeAccess().getPostEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionnaireType__Alternatives"


    // $ANTLR start "rule__AnswerType__Alternatives"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1243:1: rule__AnswerType__Alternatives : ( ( ( 'Text' ) ) | ( ( 'ParagraphText' ) ) | ( ( 'MultipleChoice' ) ) | ( ( 'SingleChoice' ) ) | ( ( 'Scale' ) ) | ( ( 'Grid' ) ) );
    public final void rule__AnswerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1247:1: ( ( ( 'Text' ) ) | ( ( 'ParagraphText' ) ) | ( ( 'MultipleChoice' ) ) | ( ( 'SingleChoice' ) ) | ( ( 'Scale' ) ) | ( ( 'Grid' ) ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt14=1;
                }
                break;
            case 49:
                {
                alt14=2;
                }
                break;
            case 50:
                {
                alt14=3;
                }
                break;
            case 51:
                {
                alt14=4;
                }
                break;
            case 52:
                {
                alt14=5;
                }
                break;
            case 53:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1248:1: ( ( 'Text' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1248:1: ( ( 'Text' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1249:1: ( 'Text' )
                    {
                     before(grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1250:1: ( 'Text' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1250:3: 'Text'
                    {
                    match(input,48,FOLLOW_48_in_rule__AnswerType__Alternatives2717); 

                    }

                     after(grammarAccess.getAnswerTypeAccess().getTextEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1255:6: ( ( 'ParagraphText' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1255:6: ( ( 'ParagraphText' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1256:1: ( 'ParagraphText' )
                    {
                     before(grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1257:1: ( 'ParagraphText' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1257:3: 'ParagraphText'
                    {
                    match(input,49,FOLLOW_49_in_rule__AnswerType__Alternatives2738); 

                    }

                     after(grammarAccess.getAnswerTypeAccess().getParagraphTextEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1262:6: ( ( 'MultipleChoice' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1262:6: ( ( 'MultipleChoice' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1263:1: ( 'MultipleChoice' )
                    {
                     before(grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1264:1: ( 'MultipleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1264:3: 'MultipleChoice'
                    {
                    match(input,50,FOLLOW_50_in_rule__AnswerType__Alternatives2759); 

                    }

                     after(grammarAccess.getAnswerTypeAccess().getMultipleChoiceEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1269:6: ( ( 'SingleChoice' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1269:6: ( ( 'SingleChoice' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1270:1: ( 'SingleChoice' )
                    {
                     before(grammarAccess.getAnswerTypeAccess().getSingleChoiceEnumLiteralDeclaration_3()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1271:1: ( 'SingleChoice' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1271:3: 'SingleChoice'
                    {
                    match(input,51,FOLLOW_51_in_rule__AnswerType__Alternatives2780); 

                    }

                     after(grammarAccess.getAnswerTypeAccess().getSingleChoiceEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1276:6: ( ( 'Scale' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1276:6: ( ( 'Scale' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1277:1: ( 'Scale' )
                    {
                     before(grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_4()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1278:1: ( 'Scale' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1278:3: 'Scale'
                    {
                    match(input,52,FOLLOW_52_in_rule__AnswerType__Alternatives2801); 

                    }

                     after(grammarAccess.getAnswerTypeAccess().getScaleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1283:6: ( ( 'Grid' ) )
                    {
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1283:6: ( ( 'Grid' ) )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1284:1: ( 'Grid' )
                    {
                     before(grammarAccess.getAnswerTypeAccess().getGridEnumLiteralDeclaration_5()); 
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1285:1: ( 'Grid' )
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1285:3: 'Grid'
                    {
                    match(input,53,FOLLOW_53_in_rule__AnswerType__Alternatives2822); 

                    }

                     after(grammarAccess.getAnswerTypeAccess().getGridEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerType__Alternatives"


    // $ANTLR start "rule__ExperimentElement__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1297:1: rule__ExperimentElement__Group__0 : rule__ExperimentElement__Group__0__Impl rule__ExperimentElement__Group__1 ;
    public final void rule__ExperimentElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1301:1: ( rule__ExperimentElement__Group__0__Impl rule__ExperimentElement__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1302:2: rule__ExperimentElement__Group__0__Impl rule__ExperimentElement__Group__1
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group__0__Impl_in_rule__ExperimentElement__Group__02855);
            rule__ExperimentElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentElement__Group__1_in_rule__ExperimentElement__Group__02858);
            rule__ExperimentElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__0"


    // $ANTLR start "rule__ExperimentElement__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1309:1: rule__ExperimentElement__Group__0__Impl : ( 'Experiment' ) ;
    public final void rule__ExperimentElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1313:1: ( ( 'Experiment' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1314:1: ( 'Experiment' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1314:1: ( 'Experiment' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1315:1: 'Experiment'
            {
             before(grammarAccess.getExperimentElementAccess().getExperimentKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__ExperimentElement__Group__0__Impl2886); 
             after(grammarAccess.getExperimentElementAccess().getExperimentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__0__Impl"


    // $ANTLR start "rule__ExperimentElement__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1328:1: rule__ExperimentElement__Group__1 : rule__ExperimentElement__Group__1__Impl rule__ExperimentElement__Group__2 ;
    public final void rule__ExperimentElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1332:1: ( rule__ExperimentElement__Group__1__Impl rule__ExperimentElement__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1333:2: rule__ExperimentElement__Group__1__Impl rule__ExperimentElement__Group__2
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group__1__Impl_in_rule__ExperimentElement__Group__12917);
            rule__ExperimentElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentElement__Group__2_in_rule__ExperimentElement__Group__12920);
            rule__ExperimentElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__1"


    // $ANTLR start "rule__ExperimentElement__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1340:1: rule__ExperimentElement__Group__1__Impl : ( ( rule__ExperimentElement__NameAssignment_1 ) ) ;
    public final void rule__ExperimentElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1344:1: ( ( ( rule__ExperimentElement__NameAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1345:1: ( ( rule__ExperimentElement__NameAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1345:1: ( ( rule__ExperimentElement__NameAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1346:1: ( rule__ExperimentElement__NameAssignment_1 )
            {
             before(grammarAccess.getExperimentElementAccess().getNameAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1347:1: ( rule__ExperimentElement__NameAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1347:2: rule__ExperimentElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExperimentElement__NameAssignment_1_in_rule__ExperimentElement__Group__1__Impl2947);
            rule__ExperimentElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__1__Impl"


    // $ANTLR start "rule__ExperimentElement__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1357:1: rule__ExperimentElement__Group__2 : rule__ExperimentElement__Group__2__Impl rule__ExperimentElement__Group__3 ;
    public final void rule__ExperimentElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1361:1: ( rule__ExperimentElement__Group__2__Impl rule__ExperimentElement__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1362:2: rule__ExperimentElement__Group__2__Impl rule__ExperimentElement__Group__3
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group__2__Impl_in_rule__ExperimentElement__Group__22977);
            rule__ExperimentElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentElement__Group__3_in_rule__ExperimentElement__Group__22980);
            rule__ExperimentElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__2"


    // $ANTLR start "rule__ExperimentElement__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1369:1: rule__ExperimentElement__Group__2__Impl : ( ( rule__ExperimentElement__Group_2__0 ) ) ;
    public final void rule__ExperimentElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1373:1: ( ( ( rule__ExperimentElement__Group_2__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1374:1: ( ( rule__ExperimentElement__Group_2__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1374:1: ( ( rule__ExperimentElement__Group_2__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1375:1: ( rule__ExperimentElement__Group_2__0 )
            {
             before(grammarAccess.getExperimentElementAccess().getGroup_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1376:1: ( rule__ExperimentElement__Group_2__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1376:2: rule__ExperimentElement__Group_2__0
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group_2__0_in_rule__ExperimentElement__Group__2__Impl3007);
            rule__ExperimentElement__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentElementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__2__Impl"


    // $ANTLR start "rule__ExperimentElement__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1386:1: rule__ExperimentElement__Group__3 : rule__ExperimentElement__Group__3__Impl rule__ExperimentElement__Group__4 ;
    public final void rule__ExperimentElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1390:1: ( rule__ExperimentElement__Group__3__Impl rule__ExperimentElement__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1391:2: rule__ExperimentElement__Group__3__Impl rule__ExperimentElement__Group__4
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group__3__Impl_in_rule__ExperimentElement__Group__33037);
            rule__ExperimentElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentElement__Group__4_in_rule__ExperimentElement__Group__33040);
            rule__ExperimentElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__3"


    // $ANTLR start "rule__ExperimentElement__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1398:1: rule__ExperimentElement__Group__3__Impl : ( ( rule__ExperimentElement__ProcessAssignment_3 )* ) ;
    public final void rule__ExperimentElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1402:1: ( ( ( rule__ExperimentElement__ProcessAssignment_3 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1403:1: ( ( rule__ExperimentElement__ProcessAssignment_3 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1403:1: ( ( rule__ExperimentElement__ProcessAssignment_3 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1404:1: ( rule__ExperimentElement__ProcessAssignment_3 )*
            {
             before(grammarAccess.getExperimentElementAccess().getProcessAssignment_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1405:1: ( rule__ExperimentElement__ProcessAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==71) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1405:2: rule__ExperimentElement__ProcessAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentElement__ProcessAssignment_3_in_rule__ExperimentElement__Group__3__Impl3067);
            	    rule__ExperimentElement__ProcessAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExperimentElementAccess().getProcessAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__3__Impl"


    // $ANTLR start "rule__ExperimentElement__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1415:1: rule__ExperimentElement__Group__4 : rule__ExperimentElement__Group__4__Impl rule__ExperimentElement__Group__5 ;
    public final void rule__ExperimentElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1419:1: ( rule__ExperimentElement__Group__4__Impl rule__ExperimentElement__Group__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1420:2: rule__ExperimentElement__Group__4__Impl rule__ExperimentElement__Group__5
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group__4__Impl_in_rule__ExperimentElement__Group__43098);
            rule__ExperimentElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentElement__Group__5_in_rule__ExperimentElement__Group__43101);
            rule__ExperimentElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__4"


    // $ANTLR start "rule__ExperimentElement__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1427:1: rule__ExperimentElement__Group__4__Impl : ( ( rule__ExperimentElement__MetricsAssignment_4 )* ) ;
    public final void rule__ExperimentElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1431:1: ( ( ( rule__ExperimentElement__MetricsAssignment_4 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1432:1: ( ( rule__ExperimentElement__MetricsAssignment_4 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1432:1: ( ( rule__ExperimentElement__MetricsAssignment_4 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1433:1: ( rule__ExperimentElement__MetricsAssignment_4 )*
            {
             before(grammarAccess.getExperimentElementAccess().getMetricsAssignment_4()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1434:1: ( rule__ExperimentElement__MetricsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==80) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1434:2: rule__ExperimentElement__MetricsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentElement__MetricsAssignment_4_in_rule__ExperimentElement__Group__4__Impl3128);
            	    rule__ExperimentElement__MetricsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExperimentElementAccess().getMetricsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__4__Impl"


    // $ANTLR start "rule__ExperimentElement__Group__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1444:1: rule__ExperimentElement__Group__5 : rule__ExperimentElement__Group__5__Impl ;
    public final void rule__ExperimentElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1448:1: ( rule__ExperimentElement__Group__5__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1449:2: rule__ExperimentElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group__5__Impl_in_rule__ExperimentElement__Group__53159);
            rule__ExperimentElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__5"


    // $ANTLR start "rule__ExperimentElement__Group__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1455:1: rule__ExperimentElement__Group__5__Impl : ( ( rule__ExperimentElement__Group_5__0 )? ) ;
    public final void rule__ExperimentElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1459:1: ( ( ( rule__ExperimentElement__Group_5__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1460:1: ( ( rule__ExperimentElement__Group_5__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1460:1: ( ( rule__ExperimentElement__Group_5__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1461:1: ( rule__ExperimentElement__Group_5__0 )?
            {
             before(grammarAccess.getExperimentElementAccess().getGroup_5()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1462:1: ( rule__ExperimentElement__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1462:2: rule__ExperimentElement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ExperimentElement__Group_5__0_in_rule__ExperimentElement__Group__5__Impl3186);
                    rule__ExperimentElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExperimentElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group__5__Impl"


    // $ANTLR start "rule__ExperimentElement__Group_2__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1484:1: rule__ExperimentElement__Group_2__0 : rule__ExperimentElement__Group_2__0__Impl rule__ExperimentElement__Group_2__1 ;
    public final void rule__ExperimentElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1488:1: ( rule__ExperimentElement__Group_2__0__Impl rule__ExperimentElement__Group_2__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1489:2: rule__ExperimentElement__Group_2__0__Impl rule__ExperimentElement__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group_2__0__Impl_in_rule__ExperimentElement__Group_2__03229);
            rule__ExperimentElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentElement__Group_2__1_in_rule__ExperimentElement__Group_2__03232);
            rule__ExperimentElement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group_2__0"


    // $ANTLR start "rule__ExperimentElement__Group_2__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1496:1: rule__ExperimentElement__Group_2__0__Impl : ( 'Experimental Plan' ) ;
    public final void rule__ExperimentElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1500:1: ( ( 'Experimental Plan' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1501:1: ( 'Experimental Plan' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1501:1: ( 'Experimental Plan' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1502:1: 'Experimental Plan'
            {
             before(grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_2_0()); 
            match(input,55,FOLLOW_55_in_rule__ExperimentElement__Group_2__0__Impl3260); 
             after(grammarAccess.getExperimentElementAccess().getExperimentalPlanKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group_2__0__Impl"


    // $ANTLR start "rule__ExperimentElement__Group_2__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1515:1: rule__ExperimentElement__Group_2__1 : rule__ExperimentElement__Group_2__1__Impl ;
    public final void rule__ExperimentElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1519:1: ( rule__ExperimentElement__Group_2__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1520:2: rule__ExperimentElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group_2__1__Impl_in_rule__ExperimentElement__Group_2__13291);
            rule__ExperimentElement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group_2__1"


    // $ANTLR start "rule__ExperimentElement__Group_2__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1526:1: rule__ExperimentElement__Group_2__1__Impl : ( ( rule__ExperimentElement__ExperimentsAssignment_2_1 )* ) ;
    public final void rule__ExperimentElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1530:1: ( ( ( rule__ExperimentElement__ExperimentsAssignment_2_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1531:1: ( ( rule__ExperimentElement__ExperimentsAssignment_2_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1531:1: ( ( rule__ExperimentElement__ExperimentsAssignment_2_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1532:1: ( rule__ExperimentElement__ExperimentsAssignment_2_1 )*
            {
             before(grammarAccess.getExperimentElementAccess().getExperimentsAssignment_2_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1533:1: ( rule__ExperimentElement__ExperimentsAssignment_2_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==58) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1533:2: rule__ExperimentElement__ExperimentsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentElement__ExperimentsAssignment_2_1_in_rule__ExperimentElement__Group_2__1__Impl3318);
            	    rule__ExperimentElement__ExperimentsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getExperimentElementAccess().getExperimentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group_2__1__Impl"


    // $ANTLR start "rule__ExperimentElement__Group_5__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1547:1: rule__ExperimentElement__Group_5__0 : rule__ExperimentElement__Group_5__0__Impl rule__ExperimentElement__Group_5__1 ;
    public final void rule__ExperimentElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1551:1: ( rule__ExperimentElement__Group_5__0__Impl rule__ExperimentElement__Group_5__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1552:2: rule__ExperimentElement__Group_5__0__Impl rule__ExperimentElement__Group_5__1
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group_5__0__Impl_in_rule__ExperimentElement__Group_5__03353);
            rule__ExperimentElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentElement__Group_5__1_in_rule__ExperimentElement__Group_5__03356);
            rule__ExperimentElement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group_5__0"


    // $ANTLR start "rule__ExperimentElement__Group_5__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1559:1: rule__ExperimentElement__Group_5__0__Impl : ( 'Questionnaires' ) ;
    public final void rule__ExperimentElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1563:1: ( ( 'Questionnaires' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1564:1: ( 'Questionnaires' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1564:1: ( 'Questionnaires' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1565:1: 'Questionnaires'
            {
             before(grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_5_0()); 
            match(input,56,FOLLOW_56_in_rule__ExperimentElement__Group_5__0__Impl3384); 
             after(grammarAccess.getExperimentElementAccess().getQuestionnairesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group_5__0__Impl"


    // $ANTLR start "rule__ExperimentElement__Group_5__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1578:1: rule__ExperimentElement__Group_5__1 : rule__ExperimentElement__Group_5__1__Impl ;
    public final void rule__ExperimentElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1582:1: ( rule__ExperimentElement__Group_5__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1583:2: rule__ExperimentElement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ExperimentElement__Group_5__1__Impl_in_rule__ExperimentElement__Group_5__13415);
            rule__ExperimentElement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group_5__1"


    // $ANTLR start "rule__ExperimentElement__Group_5__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1589:1: rule__ExperimentElement__Group_5__1__Impl : ( ( rule__ExperimentElement__QuestionnaireAssignment_5_1 )* ) ;
    public final void rule__ExperimentElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1593:1: ( ( ( rule__ExperimentElement__QuestionnaireAssignment_5_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1594:1: ( ( rule__ExperimentElement__QuestionnaireAssignment_5_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1594:1: ( ( rule__ExperimentElement__QuestionnaireAssignment_5_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1595:1: ( rule__ExperimentElement__QuestionnaireAssignment_5_1 )*
            {
             before(grammarAccess.getExperimentElementAccess().getQuestionnaireAssignment_5_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1596:1: ( rule__ExperimentElement__QuestionnaireAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==86) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1596:2: rule__ExperimentElement__QuestionnaireAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentElement__QuestionnaireAssignment_5_1_in_rule__ExperimentElement__Group_5__1__Impl3442);
            	    rule__ExperimentElement__QuestionnaireAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getExperimentElementAccess().getQuestionnaireAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__Group_5__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1610:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1614:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1615:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03477);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03480);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1622:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1626:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1627:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1627:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1628:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3507); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1639:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1643:1: ( rule__QualifiedName__Group__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1644:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13536);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1650:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1654:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1655:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1655:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1656:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1657:1: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==57) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1657:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3563);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1671:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1675:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1676:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03598);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03601);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1683:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1687:1: ( ( '.' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1688:1: ( '.' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1688:1: ( '.' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1689:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,57,FOLLOW_57_in_rule__QualifiedName__Group_1__0__Impl3629); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1702:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1706:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1707:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13660);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1713:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1717:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1718:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1718:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1719:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3687); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1734:1: rule__ExperimentalPlan__Group__0 : rule__ExperimentalPlan__Group__0__Impl rule__ExperimentalPlan__Group__1 ;
    public final void rule__ExperimentalPlan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1738:1: ( rule__ExperimentalPlan__Group__0__Impl rule__ExperimentalPlan__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1739:2: rule__ExperimentalPlan__Group__0__Impl rule__ExperimentalPlan__Group__1
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__0__Impl_in_rule__ExperimentalPlan__Group__03720);
            rule__ExperimentalPlan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__1_in_rule__ExperimentalPlan__Group__03723);
            rule__ExperimentalPlan__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__0"


    // $ANTLR start "rule__ExperimentalPlan__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1746:1: rule__ExperimentalPlan__Group__0__Impl : ( 'Goals' ) ;
    public final void rule__ExperimentalPlan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1750:1: ( ( 'Goals' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1751:1: ( 'Goals' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1751:1: ( 'Goals' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1752:1: 'Goals'
            {
             before(grammarAccess.getExperimentalPlanAccess().getGoalsKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__ExperimentalPlan__Group__0__Impl3751); 
             after(grammarAccess.getExperimentalPlanAccess().getGoalsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__0__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1765:1: rule__ExperimentalPlan__Group__1 : rule__ExperimentalPlan__Group__1__Impl rule__ExperimentalPlan__Group__2 ;
    public final void rule__ExperimentalPlan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1769:1: ( rule__ExperimentalPlan__Group__1__Impl rule__ExperimentalPlan__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1770:2: rule__ExperimentalPlan__Group__1__Impl rule__ExperimentalPlan__Group__2
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__1__Impl_in_rule__ExperimentalPlan__Group__13782);
            rule__ExperimentalPlan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__2_in_rule__ExperimentalPlan__Group__13785);
            rule__ExperimentalPlan__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__1"


    // $ANTLR start "rule__ExperimentalPlan__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1777:1: rule__ExperimentalPlan__Group__1__Impl : ( '{' ) ;
    public final void rule__ExperimentalPlan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1781:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1782:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1782:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1783:1: '{'
            {
             before(grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__ExperimentalPlan__Group__1__Impl3813); 
             after(grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__1__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1796:1: rule__ExperimentalPlan__Group__2 : rule__ExperimentalPlan__Group__2__Impl rule__ExperimentalPlan__Group__3 ;
    public final void rule__ExperimentalPlan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1800:1: ( rule__ExperimentalPlan__Group__2__Impl rule__ExperimentalPlan__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1801:2: rule__ExperimentalPlan__Group__2__Impl rule__ExperimentalPlan__Group__3
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__2__Impl_in_rule__ExperimentalPlan__Group__23844);
            rule__ExperimentalPlan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__3_in_rule__ExperimentalPlan__Group__23847);
            rule__ExperimentalPlan__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__2"


    // $ANTLR start "rule__ExperimentalPlan__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1808:1: rule__ExperimentalPlan__Group__2__Impl : ( ( rule__ExperimentalPlan__GoalAssignment_2 )* ) ;
    public final void rule__ExperimentalPlan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1812:1: ( ( ( rule__ExperimentalPlan__GoalAssignment_2 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1813:1: ( ( rule__ExperimentalPlan__GoalAssignment_2 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1813:1: ( ( rule__ExperimentalPlan__GoalAssignment_2 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1814:1: ( rule__ExperimentalPlan__GoalAssignment_2 )*
            {
             before(grammarAccess.getExperimentalPlanAccess().getGoalAssignment_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1815:1: ( rule__ExperimentalPlan__GoalAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1815:2: rule__ExperimentalPlan__GoalAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentalPlan__GoalAssignment_2_in_rule__ExperimentalPlan__Group__2__Impl3874);
            	    rule__ExperimentalPlan__GoalAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getExperimentalPlanAccess().getGoalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__2__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1825:1: rule__ExperimentalPlan__Group__3 : rule__ExperimentalPlan__Group__3__Impl rule__ExperimentalPlan__Group__4 ;
    public final void rule__ExperimentalPlan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1829:1: ( rule__ExperimentalPlan__Group__3__Impl rule__ExperimentalPlan__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1830:2: rule__ExperimentalPlan__Group__3__Impl rule__ExperimentalPlan__Group__4
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__3__Impl_in_rule__ExperimentalPlan__Group__33905);
            rule__ExperimentalPlan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__4_in_rule__ExperimentalPlan__Group__33908);
            rule__ExperimentalPlan__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__3"


    // $ANTLR start "rule__ExperimentalPlan__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1837:1: rule__ExperimentalPlan__Group__3__Impl : ( '}' ) ;
    public final void rule__ExperimentalPlan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1841:1: ( ( '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1842:1: ( '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1842:1: ( '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1843:1: '}'
            {
             before(grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_3()); 
            match(input,60,FOLLOW_60_in_rule__ExperimentalPlan__Group__3__Impl3936); 
             after(grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__3__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1856:1: rule__ExperimentalPlan__Group__4 : rule__ExperimentalPlan__Group__4__Impl rule__ExperimentalPlan__Group__5 ;
    public final void rule__ExperimentalPlan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1860:1: ( rule__ExperimentalPlan__Group__4__Impl rule__ExperimentalPlan__Group__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1861:2: rule__ExperimentalPlan__Group__4__Impl rule__ExperimentalPlan__Group__5
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__4__Impl_in_rule__ExperimentalPlan__Group__43967);
            rule__ExperimentalPlan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__5_in_rule__ExperimentalPlan__Group__43970);
            rule__ExperimentalPlan__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__4"


    // $ANTLR start "rule__ExperimentalPlan__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1868:1: rule__ExperimentalPlan__Group__4__Impl : ( 'DesignOfExperiment' ) ;
    public final void rule__ExperimentalPlan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1872:1: ( ( 'DesignOfExperiment' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1873:1: ( 'DesignOfExperiment' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1873:1: ( 'DesignOfExperiment' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1874:1: 'DesignOfExperiment'
            {
             before(grammarAccess.getExperimentalPlanAccess().getDesignOfExperimentKeyword_4()); 
            match(input,61,FOLLOW_61_in_rule__ExperimentalPlan__Group__4__Impl3998); 
             after(grammarAccess.getExperimentalPlanAccess().getDesignOfExperimentKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__4__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1887:1: rule__ExperimentalPlan__Group__5 : rule__ExperimentalPlan__Group__5__Impl rule__ExperimentalPlan__Group__6 ;
    public final void rule__ExperimentalPlan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1891:1: ( rule__ExperimentalPlan__Group__5__Impl rule__ExperimentalPlan__Group__6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1892:2: rule__ExperimentalPlan__Group__5__Impl rule__ExperimentalPlan__Group__6
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__5__Impl_in_rule__ExperimentalPlan__Group__54029);
            rule__ExperimentalPlan__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__6_in_rule__ExperimentalPlan__Group__54032);
            rule__ExperimentalPlan__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__5"


    // $ANTLR start "rule__ExperimentalPlan__Group__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1899:1: rule__ExperimentalPlan__Group__5__Impl : ( '=' ) ;
    public final void rule__ExperimentalPlan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1903:1: ( ( '=' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1904:1: ( '=' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1904:1: ( '=' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1905:1: '='
            {
             before(grammarAccess.getExperimentalPlanAccess().getEqualsSignKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__ExperimentalPlan__Group__5__Impl4060); 
             after(grammarAccess.getExperimentalPlanAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__5__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1918:1: rule__ExperimentalPlan__Group__6 : rule__ExperimentalPlan__Group__6__Impl rule__ExperimentalPlan__Group__7 ;
    public final void rule__ExperimentalPlan__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1922:1: ( rule__ExperimentalPlan__Group__6__Impl rule__ExperimentalPlan__Group__7 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1923:2: rule__ExperimentalPlan__Group__6__Impl rule__ExperimentalPlan__Group__7
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__6__Impl_in_rule__ExperimentalPlan__Group__64091);
            rule__ExperimentalPlan__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__7_in_rule__ExperimentalPlan__Group__64094);
            rule__ExperimentalPlan__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__6"


    // $ANTLR start "rule__ExperimentalPlan__Group__6__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1930:1: rule__ExperimentalPlan__Group__6__Impl : ( ( rule__ExperimentalPlan__TypeAssignment_6 ) ) ;
    public final void rule__ExperimentalPlan__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1934:1: ( ( ( rule__ExperimentalPlan__TypeAssignment_6 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1935:1: ( ( rule__ExperimentalPlan__TypeAssignment_6 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1935:1: ( ( rule__ExperimentalPlan__TypeAssignment_6 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1936:1: ( rule__ExperimentalPlan__TypeAssignment_6 )
            {
             before(grammarAccess.getExperimentalPlanAccess().getTypeAssignment_6()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1937:1: ( rule__ExperimentalPlan__TypeAssignment_6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1937:2: rule__ExperimentalPlan__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__TypeAssignment_6_in_rule__ExperimentalPlan__Group__6__Impl4121);
            rule__ExperimentalPlan__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExperimentalPlanAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__6__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__7"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1947:1: rule__ExperimentalPlan__Group__7 : rule__ExperimentalPlan__Group__7__Impl rule__ExperimentalPlan__Group__8 ;
    public final void rule__ExperimentalPlan__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1951:1: ( rule__ExperimentalPlan__Group__7__Impl rule__ExperimentalPlan__Group__8 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1952:2: rule__ExperimentalPlan__Group__7__Impl rule__ExperimentalPlan__Group__8
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__7__Impl_in_rule__ExperimentalPlan__Group__74151);
            rule__ExperimentalPlan__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__8_in_rule__ExperimentalPlan__Group__74154);
            rule__ExperimentalPlan__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__7"


    // $ANTLR start "rule__ExperimentalPlan__Group__7__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1959:1: rule__ExperimentalPlan__Group__7__Impl : ( '{' ) ;
    public final void rule__ExperimentalPlan__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1963:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1964:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1964:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1965:1: '{'
            {
             before(grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,59,FOLLOW_59_in_rule__ExperimentalPlan__Group__7__Impl4182); 
             after(grammarAccess.getExperimentalPlanAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__7__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__8"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1978:1: rule__ExperimentalPlan__Group__8 : rule__ExperimentalPlan__Group__8__Impl rule__ExperimentalPlan__Group__9 ;
    public final void rule__ExperimentalPlan__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1982:1: ( rule__ExperimentalPlan__Group__8__Impl rule__ExperimentalPlan__Group__9 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1983:2: rule__ExperimentalPlan__Group__8__Impl rule__ExperimentalPlan__Group__9
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__8__Impl_in_rule__ExperimentalPlan__Group__84213);
            rule__ExperimentalPlan__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__9_in_rule__ExperimentalPlan__Group__84216);
            rule__ExperimentalPlan__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__8"


    // $ANTLR start "rule__ExperimentalPlan__Group__8__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1990:1: rule__ExperimentalPlan__Group__8__Impl : ( ( rule__ExperimentalPlan__ParameterAssignment_8 )* ) ;
    public final void rule__ExperimentalPlan__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1994:1: ( ( ( rule__ExperimentalPlan__ParameterAssignment_8 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1995:1: ( ( rule__ExperimentalPlan__ParameterAssignment_8 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1995:1: ( ( rule__ExperimentalPlan__ParameterAssignment_8 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1996:1: ( rule__ExperimentalPlan__ParameterAssignment_8 )*
            {
             before(grammarAccess.getExperimentalPlanAccess().getParameterAssignment_8()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1997:1: ( rule__ExperimentalPlan__ParameterAssignment_8 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==67) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:1997:2: rule__ExperimentalPlan__ParameterAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentalPlan__ParameterAssignment_8_in_rule__ExperimentalPlan__Group__8__Impl4243);
            	    rule__ExperimentalPlan__ParameterAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getExperimentalPlanAccess().getParameterAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__8__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__9"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2007:1: rule__ExperimentalPlan__Group__9 : rule__ExperimentalPlan__Group__9__Impl rule__ExperimentalPlan__Group__10 ;
    public final void rule__ExperimentalPlan__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2011:1: ( rule__ExperimentalPlan__Group__9__Impl rule__ExperimentalPlan__Group__10 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2012:2: rule__ExperimentalPlan__Group__9__Impl rule__ExperimentalPlan__Group__10
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__9__Impl_in_rule__ExperimentalPlan__Group__94274);
            rule__ExperimentalPlan__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__10_in_rule__ExperimentalPlan__Group__94277);
            rule__ExperimentalPlan__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__9"


    // $ANTLR start "rule__ExperimentalPlan__Group__9__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2019:1: rule__ExperimentalPlan__Group__9__Impl : ( ( rule__ExperimentalPlan__DependentVariableAssignment_9 )* ) ;
    public final void rule__ExperimentalPlan__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2023:1: ( ( ( rule__ExperimentalPlan__DependentVariableAssignment_9 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2024:1: ( ( rule__ExperimentalPlan__DependentVariableAssignment_9 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2024:1: ( ( rule__ExperimentalPlan__DependentVariableAssignment_9 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2025:1: ( rule__ExperimentalPlan__DependentVariableAssignment_9 )*
            {
             before(grammarAccess.getExperimentalPlanAccess().getDependentVariableAssignment_9()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2026:1: ( rule__ExperimentalPlan__DependentVariableAssignment_9 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==68) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2026:2: rule__ExperimentalPlan__DependentVariableAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentalPlan__DependentVariableAssignment_9_in_rule__ExperimentalPlan__Group__9__Impl4304);
            	    rule__ExperimentalPlan__DependentVariableAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getExperimentalPlanAccess().getDependentVariableAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__9__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__10"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2036:1: rule__ExperimentalPlan__Group__10 : rule__ExperimentalPlan__Group__10__Impl rule__ExperimentalPlan__Group__11 ;
    public final void rule__ExperimentalPlan__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2040:1: ( rule__ExperimentalPlan__Group__10__Impl rule__ExperimentalPlan__Group__11 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2041:2: rule__ExperimentalPlan__Group__10__Impl rule__ExperimentalPlan__Group__11
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__10__Impl_in_rule__ExperimentalPlan__Group__104335);
            rule__ExperimentalPlan__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__11_in_rule__ExperimentalPlan__Group__104338);
            rule__ExperimentalPlan__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__10"


    // $ANTLR start "rule__ExperimentalPlan__Group__10__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2048:1: rule__ExperimentalPlan__Group__10__Impl : ( ( rule__ExperimentalPlan__FactorAssignment_10 )* ) ;
    public final void rule__ExperimentalPlan__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2052:1: ( ( ( rule__ExperimentalPlan__FactorAssignment_10 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2053:1: ( ( rule__ExperimentalPlan__FactorAssignment_10 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2053:1: ( ( rule__ExperimentalPlan__FactorAssignment_10 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2054:1: ( rule__ExperimentalPlan__FactorAssignment_10 )*
            {
             before(grammarAccess.getExperimentalPlanAccess().getFactorAssignment_10()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2055:1: ( rule__ExperimentalPlan__FactorAssignment_10 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==69) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2055:2: rule__ExperimentalPlan__FactorAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentalPlan__FactorAssignment_10_in_rule__ExperimentalPlan__Group__10__Impl4365);
            	    rule__ExperimentalPlan__FactorAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getExperimentalPlanAccess().getFactorAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__10__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__11"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2065:1: rule__ExperimentalPlan__Group__11 : rule__ExperimentalPlan__Group__11__Impl rule__ExperimentalPlan__Group__12 ;
    public final void rule__ExperimentalPlan__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2069:1: ( rule__ExperimentalPlan__Group__11__Impl rule__ExperimentalPlan__Group__12 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2070:2: rule__ExperimentalPlan__Group__11__Impl rule__ExperimentalPlan__Group__12
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__11__Impl_in_rule__ExperimentalPlan__Group__114396);
            rule__ExperimentalPlan__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__12_in_rule__ExperimentalPlan__Group__114399);
            rule__ExperimentalPlan__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__11"


    // $ANTLR start "rule__ExperimentalPlan__Group__11__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2077:1: rule__ExperimentalPlan__Group__11__Impl : ( 'Statistical Analysis Technique' ) ;
    public final void rule__ExperimentalPlan__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2081:1: ( ( 'Statistical Analysis Technique' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2082:1: ( 'Statistical Analysis Technique' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2082:1: ( 'Statistical Analysis Technique' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2083:1: 'Statistical Analysis Technique'
            {
             before(grammarAccess.getExperimentalPlanAccess().getStatisticalAnalysisTechniqueKeyword_11()); 
            match(input,62,FOLLOW_62_in_rule__ExperimentalPlan__Group__11__Impl4427); 
             after(grammarAccess.getExperimentalPlanAccess().getStatisticalAnalysisTechniqueKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__11__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__12"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2096:1: rule__ExperimentalPlan__Group__12 : rule__ExperimentalPlan__Group__12__Impl rule__ExperimentalPlan__Group__13 ;
    public final void rule__ExperimentalPlan__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2100:1: ( rule__ExperimentalPlan__Group__12__Impl rule__ExperimentalPlan__Group__13 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2101:2: rule__ExperimentalPlan__Group__12__Impl rule__ExperimentalPlan__Group__13
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__12__Impl_in_rule__ExperimentalPlan__Group__124458);
            rule__ExperimentalPlan__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__13_in_rule__ExperimentalPlan__Group__124461);
            rule__ExperimentalPlan__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__12"


    // $ANTLR start "rule__ExperimentalPlan__Group__12__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2108:1: rule__ExperimentalPlan__Group__12__Impl : ( ( rule__ExperimentalPlan__Group_12__0 )* ) ;
    public final void rule__ExperimentalPlan__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2112:1: ( ( ( rule__ExperimentalPlan__Group_12__0 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2113:1: ( ( rule__ExperimentalPlan__Group_12__0 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2113:1: ( ( rule__ExperimentalPlan__Group_12__0 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2114:1: ( rule__ExperimentalPlan__Group_12__0 )*
            {
             before(grammarAccess.getExperimentalPlanAccess().getGroup_12()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2115:1: ( rule__ExperimentalPlan__Group_12__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==64) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2115:2: rule__ExperimentalPlan__Group_12__0
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentalPlan__Group_12__0_in_rule__ExperimentalPlan__Group__12__Impl4488);
            	    rule__ExperimentalPlan__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getExperimentalPlanAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__12__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__13"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2125:1: rule__ExperimentalPlan__Group__13 : rule__ExperimentalPlan__Group__13__Impl rule__ExperimentalPlan__Group__14 ;
    public final void rule__ExperimentalPlan__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2129:1: ( rule__ExperimentalPlan__Group__13__Impl rule__ExperimentalPlan__Group__14 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2130:2: rule__ExperimentalPlan__Group__13__Impl rule__ExperimentalPlan__Group__14
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__13__Impl_in_rule__ExperimentalPlan__Group__134519);
            rule__ExperimentalPlan__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__14_in_rule__ExperimentalPlan__Group__134522);
            rule__ExperimentalPlan__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__13"


    // $ANTLR start "rule__ExperimentalPlan__Group__13__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2137:1: rule__ExperimentalPlan__Group__13__Impl : ( 'Internal Replication ' ) ;
    public final void rule__ExperimentalPlan__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2141:1: ( ( 'Internal Replication ' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2142:1: ( 'Internal Replication ' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2142:1: ( 'Internal Replication ' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2143:1: 'Internal Replication '
            {
             before(grammarAccess.getExperimentalPlanAccess().getInternalReplicationKeyword_13()); 
            match(input,63,FOLLOW_63_in_rule__ExperimentalPlan__Group__13__Impl4550); 
             after(grammarAccess.getExperimentalPlanAccess().getInternalReplicationKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__13__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__14"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2156:1: rule__ExperimentalPlan__Group__14 : rule__ExperimentalPlan__Group__14__Impl rule__ExperimentalPlan__Group__15 ;
    public final void rule__ExperimentalPlan__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2160:1: ( rule__ExperimentalPlan__Group__14__Impl rule__ExperimentalPlan__Group__15 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2161:2: rule__ExperimentalPlan__Group__14__Impl rule__ExperimentalPlan__Group__15
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__14__Impl_in_rule__ExperimentalPlan__Group__144581);
            rule__ExperimentalPlan__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__15_in_rule__ExperimentalPlan__Group__144584);
            rule__ExperimentalPlan__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__14"


    // $ANTLR start "rule__ExperimentalPlan__Group__14__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2168:1: rule__ExperimentalPlan__Group__14__Impl : ( ( rule__ExperimentalPlan__InternalReplicationAssignment_14 ) ) ;
    public final void rule__ExperimentalPlan__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2172:1: ( ( ( rule__ExperimentalPlan__InternalReplicationAssignment_14 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2173:1: ( ( rule__ExperimentalPlan__InternalReplicationAssignment_14 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2173:1: ( ( rule__ExperimentalPlan__InternalReplicationAssignment_14 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2174:1: ( rule__ExperimentalPlan__InternalReplicationAssignment_14 )
            {
             before(grammarAccess.getExperimentalPlanAccess().getInternalReplicationAssignment_14()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2175:1: ( rule__ExperimentalPlan__InternalReplicationAssignment_14 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2175:2: rule__ExperimentalPlan__InternalReplicationAssignment_14
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__InternalReplicationAssignment_14_in_rule__ExperimentalPlan__Group__14__Impl4611);
            rule__ExperimentalPlan__InternalReplicationAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getExperimentalPlanAccess().getInternalReplicationAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__14__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group__15"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2185:1: rule__ExperimentalPlan__Group__15 : rule__ExperimentalPlan__Group__15__Impl ;
    public final void rule__ExperimentalPlan__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2189:1: ( rule__ExperimentalPlan__Group__15__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2190:2: rule__ExperimentalPlan__Group__15__Impl
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group__15__Impl_in_rule__ExperimentalPlan__Group__154641);
            rule__ExperimentalPlan__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__15"


    // $ANTLR start "rule__ExperimentalPlan__Group__15__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2196:1: rule__ExperimentalPlan__Group__15__Impl : ( '}' ) ;
    public final void rule__ExperimentalPlan__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2200:1: ( ( '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2201:1: ( '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2201:1: ( '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2202:1: '}'
            {
             before(grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_15()); 
            match(input,60,FOLLOW_60_in_rule__ExperimentalPlan__Group__15__Impl4669); 
             after(grammarAccess.getExperimentalPlanAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group__15__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group_12__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2247:1: rule__ExperimentalPlan__Group_12__0 : rule__ExperimentalPlan__Group_12__0__Impl rule__ExperimentalPlan__Group_12__1 ;
    public final void rule__ExperimentalPlan__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2251:1: ( rule__ExperimentalPlan__Group_12__0__Impl rule__ExperimentalPlan__Group_12__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2252:2: rule__ExperimentalPlan__Group_12__0__Impl rule__ExperimentalPlan__Group_12__1
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group_12__0__Impl_in_rule__ExperimentalPlan__Group_12__04732);
            rule__ExperimentalPlan__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group_12__1_in_rule__ExperimentalPlan__Group_12__04735);
            rule__ExperimentalPlan__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group_12__0"


    // $ANTLR start "rule__ExperimentalPlan__Group_12__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2259:1: rule__ExperimentalPlan__Group_12__0__Impl : ( ( rule__ExperimentalPlan__TohypothesesAssignment_12_0 )* ) ;
    public final void rule__ExperimentalPlan__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2263:1: ( ( ( rule__ExperimentalPlan__TohypothesesAssignment_12_0 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2264:1: ( ( rule__ExperimentalPlan__TohypothesesAssignment_12_0 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2264:1: ( ( rule__ExperimentalPlan__TohypothesesAssignment_12_0 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2265:1: ( rule__ExperimentalPlan__TohypothesesAssignment_12_0 )*
            {
             before(grammarAccess.getExperimentalPlanAccess().getTohypothesesAssignment_12_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2266:1: ( rule__ExperimentalPlan__TohypothesesAssignment_12_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2266:2: rule__ExperimentalPlan__TohypothesesAssignment_12_0
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentalPlan__TohypothesesAssignment_12_0_in_rule__ExperimentalPlan__Group_12__0__Impl4762);
            	    rule__ExperimentalPlan__TohypothesesAssignment_12_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getExperimentalPlanAccess().getTohypothesesAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group_12__0__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group_12__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2276:1: rule__ExperimentalPlan__Group_12__1 : rule__ExperimentalPlan__Group_12__1__Impl rule__ExperimentalPlan__Group_12__2 ;
    public final void rule__ExperimentalPlan__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2280:1: ( rule__ExperimentalPlan__Group_12__1__Impl rule__ExperimentalPlan__Group_12__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2281:2: rule__ExperimentalPlan__Group_12__1__Impl rule__ExperimentalPlan__Group_12__2
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group_12__1__Impl_in_rule__ExperimentalPlan__Group_12__14793);
            rule__ExperimentalPlan__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExperimentalPlan__Group_12__2_in_rule__ExperimentalPlan__Group_12__14796);
            rule__ExperimentalPlan__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group_12__1"


    // $ANTLR start "rule__ExperimentalPlan__Group_12__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2288:1: rule__ExperimentalPlan__Group_12__1__Impl : ( ':' ) ;
    public final void rule__ExperimentalPlan__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2292:1: ( ( ':' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2293:1: ( ':' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2293:1: ( ':' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2294:1: ':'
            {
             before(grammarAccess.getExperimentalPlanAccess().getColonKeyword_12_1()); 
            match(input,64,FOLLOW_64_in_rule__ExperimentalPlan__Group_12__1__Impl4824); 
             after(grammarAccess.getExperimentalPlanAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group_12__1__Impl"


    // $ANTLR start "rule__ExperimentalPlan__Group_12__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2307:1: rule__ExperimentalPlan__Group_12__2 : rule__ExperimentalPlan__Group_12__2__Impl ;
    public final void rule__ExperimentalPlan__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2311:1: ( rule__ExperimentalPlan__Group_12__2__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2312:2: rule__ExperimentalPlan__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__ExperimentalPlan__Group_12__2__Impl_in_rule__ExperimentalPlan__Group_12__24855);
            rule__ExperimentalPlan__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group_12__2"


    // $ANTLR start "rule__ExperimentalPlan__Group_12__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2318:1: rule__ExperimentalPlan__Group_12__2__Impl : ( ( rule__ExperimentalPlan__TechniqueAssignment_12_2 )* ) ;
    public final void rule__ExperimentalPlan__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2322:1: ( ( ( rule__ExperimentalPlan__TechniqueAssignment_12_2 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2323:1: ( ( rule__ExperimentalPlan__TechniqueAssignment_12_2 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2323:1: ( ( rule__ExperimentalPlan__TechniqueAssignment_12_2 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2324:1: ( rule__ExperimentalPlan__TechniqueAssignment_12_2 )*
            {
             before(grammarAccess.getExperimentalPlanAccess().getTechniqueAssignment_12_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2325:1: ( rule__ExperimentalPlan__TechniqueAssignment_12_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=27 && LA27_0<=38)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2325:2: rule__ExperimentalPlan__TechniqueAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_rule__ExperimentalPlan__TechniqueAssignment_12_2_in_rule__ExperimentalPlan__Group_12__2__Impl4882);
            	    rule__ExperimentalPlan__TechniqueAssignment_12_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getExperimentalPlanAccess().getTechniqueAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__Group_12__2__Impl"


    // $ANTLR start "rule__Goal__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2341:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2345:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2346:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__04919);
            rule__Goal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__04922);
            rule__Goal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__0"


    // $ANTLR start "rule__Goal__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2353:1: rule__Goal__Group__0__Impl : ( ( rule__Goal__NameAssignment_0 ) ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2357:1: ( ( ( rule__Goal__NameAssignment_0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2358:1: ( ( rule__Goal__NameAssignment_0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2358:1: ( ( rule__Goal__NameAssignment_0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2359:1: ( rule__Goal__NameAssignment_0 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2360:1: ( rule__Goal__NameAssignment_0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2360:2: rule__Goal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Goal__NameAssignment_0_in_rule__Goal__Group__0__Impl4949);
            rule__Goal__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__0__Impl"


    // $ANTLR start "rule__Goal__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2370:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2374:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2375:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__14979);
            rule__Goal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__14982);
            rule__Goal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__1"


    // $ANTLR start "rule__Goal__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2382:1: rule__Goal__Group__1__Impl : ( ( rule__Goal__DescriptionAssignment_1 ) ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2386:1: ( ( ( rule__Goal__DescriptionAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2387:1: ( ( rule__Goal__DescriptionAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2387:1: ( ( rule__Goal__DescriptionAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2388:1: ( rule__Goal__DescriptionAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getDescriptionAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2389:1: ( rule__Goal__DescriptionAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2389:2: rule__Goal__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Goal__DescriptionAssignment_1_in_rule__Goal__Group__1__Impl5009);
            rule__Goal__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__1__Impl"


    // $ANTLR start "rule__Goal__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2399:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl rule__Goal__Group__3 ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2403:1: ( rule__Goal__Group__2__Impl rule__Goal__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2404:2: rule__Goal__Group__2__Impl rule__Goal__Group__3
            {
            pushFollow(FOLLOW_rule__Goal__Group__2__Impl_in_rule__Goal__Group__25039);
            rule__Goal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__3_in_rule__Goal__Group__25042);
            rule__Goal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__2"


    // $ANTLR start "rule__Goal__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2411:1: rule__Goal__Group__2__Impl : ( '{' ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2415:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2416:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2416:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2417:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_59_in_rule__Goal__Group__2__Impl5070); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__2__Impl"


    // $ANTLR start "rule__Goal__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2430:1: rule__Goal__Group__3 : rule__Goal__Group__3__Impl rule__Goal__Group__4 ;
    public final void rule__Goal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2434:1: ( rule__Goal__Group__3__Impl rule__Goal__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2435:2: rule__Goal__Group__3__Impl rule__Goal__Group__4
            {
            pushFollow(FOLLOW_rule__Goal__Group__3__Impl_in_rule__Goal__Group__35101);
            rule__Goal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__4_in_rule__Goal__Group__35104);
            rule__Goal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__3"


    // $ANTLR start "rule__Goal__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2442:1: rule__Goal__Group__3__Impl : ( ( rule__Goal__HypothesesAssignment_3 )* ) ;
    public final void rule__Goal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2446:1: ( ( ( rule__Goal__HypothesesAssignment_3 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2447:1: ( ( rule__Goal__HypothesesAssignment_3 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2447:1: ( ( rule__Goal__HypothesesAssignment_3 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2448:1: ( rule__Goal__HypothesesAssignment_3 )*
            {
             before(grammarAccess.getGoalAccess().getHypothesesAssignment_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2449:1: ( rule__Goal__HypothesesAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2449:2: rule__Goal__HypothesesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Goal__HypothesesAssignment_3_in_rule__Goal__Group__3__Impl5131);
            	    rule__Goal__HypothesesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getHypothesesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__3__Impl"


    // $ANTLR start "rule__Goal__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2459:1: rule__Goal__Group__4 : rule__Goal__Group__4__Impl ;
    public final void rule__Goal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2463:1: ( rule__Goal__Group__4__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2464:2: rule__Goal__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Goal__Group__4__Impl_in_rule__Goal__Group__45162);
            rule__Goal__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__4"


    // $ANTLR start "rule__Goal__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2470:1: rule__Goal__Group__4__Impl : ( '}' ) ;
    public final void rule__Goal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2474:1: ( ( '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2475:1: ( '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2475:1: ( '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2476:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,60,FOLLOW_60_in_rule__Goal__Group__4__Impl5190); 
             after(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__4__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2499:1: rule__Hypotheses__Group_0__0 : rule__Hypotheses__Group_0__0__Impl rule__Hypotheses__Group_0__1 ;
    public final void rule__Hypotheses__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2503:1: ( rule__Hypotheses__Group_0__0__Impl rule__Hypotheses__Group_0__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2504:2: rule__Hypotheses__Group_0__0__Impl rule__Hypotheses__Group_0__1
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__0__Impl_in_rule__Hypotheses__Group_0__05231);
            rule__Hypotheses__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__1_in_rule__Hypotheses__Group_0__05234);
            rule__Hypotheses__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__0"


    // $ANTLR start "rule__Hypotheses__Group_0__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2511:1: rule__Hypotheses__Group_0__0__Impl : ( ( rule__Hypotheses__NameAssignment_0_0 ) ) ;
    public final void rule__Hypotheses__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2515:1: ( ( ( rule__Hypotheses__NameAssignment_0_0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2516:1: ( ( rule__Hypotheses__NameAssignment_0_0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2516:1: ( ( rule__Hypotheses__NameAssignment_0_0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2517:1: ( rule__Hypotheses__NameAssignment_0_0 )
            {
             before(grammarAccess.getHypothesesAccess().getNameAssignment_0_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2518:1: ( rule__Hypotheses__NameAssignment_0_0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2518:2: rule__Hypotheses__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Hypotheses__NameAssignment_0_0_in_rule__Hypotheses__Group_0__0__Impl5261);
            rule__Hypotheses__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__0__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2528:1: rule__Hypotheses__Group_0__1 : rule__Hypotheses__Group_0__1__Impl rule__Hypotheses__Group_0__2 ;
    public final void rule__Hypotheses__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2532:1: ( rule__Hypotheses__Group_0__1__Impl rule__Hypotheses__Group_0__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2533:2: rule__Hypotheses__Group_0__1__Impl rule__Hypotheses__Group_0__2
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__1__Impl_in_rule__Hypotheses__Group_0__15291);
            rule__Hypotheses__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__2_in_rule__Hypotheses__Group_0__15294);
            rule__Hypotheses__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__1"


    // $ANTLR start "rule__Hypotheses__Group_0__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2540:1: rule__Hypotheses__Group_0__1__Impl : ( ( rule__Hypotheses__DescriptionAssignment_0_1 )? ) ;
    public final void rule__Hypotheses__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2544:1: ( ( ( rule__Hypotheses__DescriptionAssignment_0_1 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2545:1: ( ( rule__Hypotheses__DescriptionAssignment_0_1 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2545:1: ( ( rule__Hypotheses__DescriptionAssignment_0_1 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2546:1: ( rule__Hypotheses__DescriptionAssignment_0_1 )?
            {
             before(grammarAccess.getHypothesesAccess().getDescriptionAssignment_0_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2547:1: ( rule__Hypotheses__DescriptionAssignment_0_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2547:2: rule__Hypotheses__DescriptionAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Hypotheses__DescriptionAssignment_0_1_in_rule__Hypotheses__Group_0__1__Impl5321);
                    rule__Hypotheses__DescriptionAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHypothesesAccess().getDescriptionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__1__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2557:1: rule__Hypotheses__Group_0__2 : rule__Hypotheses__Group_0__2__Impl rule__Hypotheses__Group_0__3 ;
    public final void rule__Hypotheses__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2561:1: ( rule__Hypotheses__Group_0__2__Impl rule__Hypotheses__Group_0__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2562:2: rule__Hypotheses__Group_0__2__Impl rule__Hypotheses__Group_0__3
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__2__Impl_in_rule__Hypotheses__Group_0__25352);
            rule__Hypotheses__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__3_in_rule__Hypotheses__Group_0__25355);
            rule__Hypotheses__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__2"


    // $ANTLR start "rule__Hypotheses__Group_0__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2569:1: rule__Hypotheses__Group_0__2__Impl : ( ( rule__Hypotheses__TypeAssignment_0_2 ) ) ;
    public final void rule__Hypotheses__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2573:1: ( ( ( rule__Hypotheses__TypeAssignment_0_2 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2574:1: ( ( rule__Hypotheses__TypeAssignment_0_2 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2574:1: ( ( rule__Hypotheses__TypeAssignment_0_2 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2575:1: ( rule__Hypotheses__TypeAssignment_0_2 )
            {
             before(grammarAccess.getHypothesesAccess().getTypeAssignment_0_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2576:1: ( rule__Hypotheses__TypeAssignment_0_2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2576:2: rule__Hypotheses__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Hypotheses__TypeAssignment_0_2_in_rule__Hypotheses__Group_0__2__Impl5382);
            rule__Hypotheses__TypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getTypeAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__2__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2586:1: rule__Hypotheses__Group_0__3 : rule__Hypotheses__Group_0__3__Impl rule__Hypotheses__Group_0__4 ;
    public final void rule__Hypotheses__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2590:1: ( rule__Hypotheses__Group_0__3__Impl rule__Hypotheses__Group_0__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2591:2: rule__Hypotheses__Group_0__3__Impl rule__Hypotheses__Group_0__4
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__3__Impl_in_rule__Hypotheses__Group_0__35412);
            rule__Hypotheses__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__4_in_rule__Hypotheses__Group_0__35415);
            rule__Hypotheses__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__3"


    // $ANTLR start "rule__Hypotheses__Group_0__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2598:1: rule__Hypotheses__Group_0__3__Impl : ( ( rule__Hypotheses__DependentVariableAssignment_0_3 ) ) ;
    public final void rule__Hypotheses__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2602:1: ( ( ( rule__Hypotheses__DependentVariableAssignment_0_3 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2603:1: ( ( rule__Hypotheses__DependentVariableAssignment_0_3 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2603:1: ( ( rule__Hypotheses__DependentVariableAssignment_0_3 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2604:1: ( rule__Hypotheses__DependentVariableAssignment_0_3 )
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableAssignment_0_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2605:1: ( rule__Hypotheses__DependentVariableAssignment_0_3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2605:2: rule__Hypotheses__DependentVariableAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Hypotheses__DependentVariableAssignment_0_3_in_rule__Hypotheses__Group_0__3__Impl5442);
            rule__Hypotheses__DependentVariableAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getDependentVariableAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__3__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2615:1: rule__Hypotheses__Group_0__4 : rule__Hypotheses__Group_0__4__Impl rule__Hypotheses__Group_0__5 ;
    public final void rule__Hypotheses__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2619:1: ( rule__Hypotheses__Group_0__4__Impl rule__Hypotheses__Group_0__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2620:2: rule__Hypotheses__Group_0__4__Impl rule__Hypotheses__Group_0__5
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__4__Impl_in_rule__Hypotheses__Group_0__45472);
            rule__Hypotheses__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__5_in_rule__Hypotheses__Group_0__45475);
            rule__Hypotheses__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__4"


    // $ANTLR start "rule__Hypotheses__Group_0__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2627:1: rule__Hypotheses__Group_0__4__Impl : ( '(' ) ;
    public final void rule__Hypotheses__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2631:1: ( ( '(' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2632:1: ( '(' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2632:1: ( '(' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2633:1: '('
            {
             before(grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_0_4()); 
            match(input,65,FOLLOW_65_in_rule__Hypotheses__Group_0__4__Impl5503); 
             after(grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__4__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2646:1: rule__Hypotheses__Group_0__5 : rule__Hypotheses__Group_0__5__Impl rule__Hypotheses__Group_0__6 ;
    public final void rule__Hypotheses__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2650:1: ( rule__Hypotheses__Group_0__5__Impl rule__Hypotheses__Group_0__6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2651:2: rule__Hypotheses__Group_0__5__Impl rule__Hypotheses__Group_0__6
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__5__Impl_in_rule__Hypotheses__Group_0__55534);
            rule__Hypotheses__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__6_in_rule__Hypotheses__Group_0__55537);
            rule__Hypotheses__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__5"


    // $ANTLR start "rule__Hypotheses__Group_0__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2658:1: rule__Hypotheses__Group_0__5__Impl : ( ( rule__Hypotheses__LevelsAssignment_0_5 )* ) ;
    public final void rule__Hypotheses__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2662:1: ( ( ( rule__Hypotheses__LevelsAssignment_0_5 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2663:1: ( ( rule__Hypotheses__LevelsAssignment_0_5 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2663:1: ( ( rule__Hypotheses__LevelsAssignment_0_5 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2664:1: ( rule__Hypotheses__LevelsAssignment_0_5 )*
            {
             before(grammarAccess.getHypothesesAccess().getLevelsAssignment_0_5()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2665:1: ( rule__Hypotheses__LevelsAssignment_0_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2665:2: rule__Hypotheses__LevelsAssignment_0_5
            	    {
            	    pushFollow(FOLLOW_rule__Hypotheses__LevelsAssignment_0_5_in_rule__Hypotheses__Group_0__5__Impl5564);
            	    rule__Hypotheses__LevelsAssignment_0_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getHypothesesAccess().getLevelsAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__5__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2675:1: rule__Hypotheses__Group_0__6 : rule__Hypotheses__Group_0__6__Impl rule__Hypotheses__Group_0__7 ;
    public final void rule__Hypotheses__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2679:1: ( rule__Hypotheses__Group_0__6__Impl rule__Hypotheses__Group_0__7 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2680:2: rule__Hypotheses__Group_0__6__Impl rule__Hypotheses__Group_0__7
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__6__Impl_in_rule__Hypotheses__Group_0__65595);
            rule__Hypotheses__Group_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__7_in_rule__Hypotheses__Group_0__65598);
            rule__Hypotheses__Group_0__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__6"


    // $ANTLR start "rule__Hypotheses__Group_0__6__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2687:1: rule__Hypotheses__Group_0__6__Impl : ( ')' ) ;
    public final void rule__Hypotheses__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2691:1: ( ( ')' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2692:1: ( ')' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2692:1: ( ')' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2693:1: ')'
            {
             before(grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_0_6()); 
            match(input,66,FOLLOW_66_in_rule__Hypotheses__Group_0__6__Impl5626); 
             after(grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__6__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__7"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2706:1: rule__Hypotheses__Group_0__7 : rule__Hypotheses__Group_0__7__Impl rule__Hypotheses__Group_0__8 ;
    public final void rule__Hypotheses__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2710:1: ( rule__Hypotheses__Group_0__7__Impl rule__Hypotheses__Group_0__8 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2711:2: rule__Hypotheses__Group_0__7__Impl rule__Hypotheses__Group_0__8
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__7__Impl_in_rule__Hypotheses__Group_0__75657);
            rule__Hypotheses__Group_0__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__8_in_rule__Hypotheses__Group_0__75660);
            rule__Hypotheses__Group_0__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__7"


    // $ANTLR start "rule__Hypotheses__Group_0__7__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2718:1: rule__Hypotheses__Group_0__7__Impl : ( ( rule__Hypotheses__OperatorAssignment_0_7 ) ) ;
    public final void rule__Hypotheses__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2722:1: ( ( ( rule__Hypotheses__OperatorAssignment_0_7 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2723:1: ( ( rule__Hypotheses__OperatorAssignment_0_7 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2723:1: ( ( rule__Hypotheses__OperatorAssignment_0_7 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2724:1: ( rule__Hypotheses__OperatorAssignment_0_7 )
            {
             before(grammarAccess.getHypothesesAccess().getOperatorAssignment_0_7()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2725:1: ( rule__Hypotheses__OperatorAssignment_0_7 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2725:2: rule__Hypotheses__OperatorAssignment_0_7
            {
            pushFollow(FOLLOW_rule__Hypotheses__OperatorAssignment_0_7_in_rule__Hypotheses__Group_0__7__Impl5687);
            rule__Hypotheses__OperatorAssignment_0_7();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getOperatorAssignment_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__7__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__8"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2735:1: rule__Hypotheses__Group_0__8 : rule__Hypotheses__Group_0__8__Impl rule__Hypotheses__Group_0__9 ;
    public final void rule__Hypotheses__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2739:1: ( rule__Hypotheses__Group_0__8__Impl rule__Hypotheses__Group_0__9 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2740:2: rule__Hypotheses__Group_0__8__Impl rule__Hypotheses__Group_0__9
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__8__Impl_in_rule__Hypotheses__Group_0__85717);
            rule__Hypotheses__Group_0__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__9_in_rule__Hypotheses__Group_0__85720);
            rule__Hypotheses__Group_0__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__8"


    // $ANTLR start "rule__Hypotheses__Group_0__8__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2747:1: rule__Hypotheses__Group_0__8__Impl : ( ( rule__Hypotheses__DependentVariableAssignment_0_8 ) ) ;
    public final void rule__Hypotheses__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2751:1: ( ( ( rule__Hypotheses__DependentVariableAssignment_0_8 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2752:1: ( ( rule__Hypotheses__DependentVariableAssignment_0_8 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2752:1: ( ( rule__Hypotheses__DependentVariableAssignment_0_8 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2753:1: ( rule__Hypotheses__DependentVariableAssignment_0_8 )
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableAssignment_0_8()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2754:1: ( rule__Hypotheses__DependentVariableAssignment_0_8 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2754:2: rule__Hypotheses__DependentVariableAssignment_0_8
            {
            pushFollow(FOLLOW_rule__Hypotheses__DependentVariableAssignment_0_8_in_rule__Hypotheses__Group_0__8__Impl5747);
            rule__Hypotheses__DependentVariableAssignment_0_8();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getDependentVariableAssignment_0_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__8__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__9"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2764:1: rule__Hypotheses__Group_0__9 : rule__Hypotheses__Group_0__9__Impl rule__Hypotheses__Group_0__10 ;
    public final void rule__Hypotheses__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2768:1: ( rule__Hypotheses__Group_0__9__Impl rule__Hypotheses__Group_0__10 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2769:2: rule__Hypotheses__Group_0__9__Impl rule__Hypotheses__Group_0__10
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__9__Impl_in_rule__Hypotheses__Group_0__95777);
            rule__Hypotheses__Group_0__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__10_in_rule__Hypotheses__Group_0__95780);
            rule__Hypotheses__Group_0__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__9"


    // $ANTLR start "rule__Hypotheses__Group_0__9__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2776:1: rule__Hypotheses__Group_0__9__Impl : ( '(' ) ;
    public final void rule__Hypotheses__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2780:1: ( ( '(' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2781:1: ( '(' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2781:1: ( '(' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2782:1: '('
            {
             before(grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_0_9()); 
            match(input,65,FOLLOW_65_in_rule__Hypotheses__Group_0__9__Impl5808); 
             after(grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_0_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__9__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__10"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2795:1: rule__Hypotheses__Group_0__10 : rule__Hypotheses__Group_0__10__Impl rule__Hypotheses__Group_0__11 ;
    public final void rule__Hypotheses__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2799:1: ( rule__Hypotheses__Group_0__10__Impl rule__Hypotheses__Group_0__11 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2800:2: rule__Hypotheses__Group_0__10__Impl rule__Hypotheses__Group_0__11
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__10__Impl_in_rule__Hypotheses__Group_0__105839);
            rule__Hypotheses__Group_0__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_0__11_in_rule__Hypotheses__Group_0__105842);
            rule__Hypotheses__Group_0__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__10"


    // $ANTLR start "rule__Hypotheses__Group_0__10__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2807:1: rule__Hypotheses__Group_0__10__Impl : ( ( rule__Hypotheses__LevelsAssignment_0_10 )* ) ;
    public final void rule__Hypotheses__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2811:1: ( ( ( rule__Hypotheses__LevelsAssignment_0_10 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2812:1: ( ( rule__Hypotheses__LevelsAssignment_0_10 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2812:1: ( ( rule__Hypotheses__LevelsAssignment_0_10 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2813:1: ( rule__Hypotheses__LevelsAssignment_0_10 )*
            {
             before(grammarAccess.getHypothesesAccess().getLevelsAssignment_0_10()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2814:1: ( rule__Hypotheses__LevelsAssignment_0_10 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2814:2: rule__Hypotheses__LevelsAssignment_0_10
            	    {
            	    pushFollow(FOLLOW_rule__Hypotheses__LevelsAssignment_0_10_in_rule__Hypotheses__Group_0__10__Impl5869);
            	    rule__Hypotheses__LevelsAssignment_0_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getHypothesesAccess().getLevelsAssignment_0_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__10__Impl"


    // $ANTLR start "rule__Hypotheses__Group_0__11"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2824:1: rule__Hypotheses__Group_0__11 : rule__Hypotheses__Group_0__11__Impl ;
    public final void rule__Hypotheses__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2828:1: ( rule__Hypotheses__Group_0__11__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2829:2: rule__Hypotheses__Group_0__11__Impl
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_0__11__Impl_in_rule__Hypotheses__Group_0__115900);
            rule__Hypotheses__Group_0__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__11"


    // $ANTLR start "rule__Hypotheses__Group_0__11__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2835:1: rule__Hypotheses__Group_0__11__Impl : ( ')' ) ;
    public final void rule__Hypotheses__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2839:1: ( ( ')' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2840:1: ( ')' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2840:1: ( ')' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2841:1: ')'
            {
             before(grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_0_11()); 
            match(input,66,FOLLOW_66_in_rule__Hypotheses__Group_0__11__Impl5928); 
             after(grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_0_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_0__11__Impl"


    // $ANTLR start "rule__Hypotheses__Group_1__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2878:1: rule__Hypotheses__Group_1__0 : rule__Hypotheses__Group_1__0__Impl rule__Hypotheses__Group_1__1 ;
    public final void rule__Hypotheses__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2882:1: ( rule__Hypotheses__Group_1__0__Impl rule__Hypotheses__Group_1__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2883:2: rule__Hypotheses__Group_1__0__Impl rule__Hypotheses__Group_1__1
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_1__0__Impl_in_rule__Hypotheses__Group_1__05983);
            rule__Hypotheses__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_1__1_in_rule__Hypotheses__Group_1__05986);
            rule__Hypotheses__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__0"


    // $ANTLR start "rule__Hypotheses__Group_1__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2890:1: rule__Hypotheses__Group_1__0__Impl : ( ( rule__Hypotheses__NameAssignment_1_0 ) ) ;
    public final void rule__Hypotheses__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2894:1: ( ( ( rule__Hypotheses__NameAssignment_1_0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2895:1: ( ( rule__Hypotheses__NameAssignment_1_0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2895:1: ( ( rule__Hypotheses__NameAssignment_1_0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2896:1: ( rule__Hypotheses__NameAssignment_1_0 )
            {
             before(grammarAccess.getHypothesesAccess().getNameAssignment_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2897:1: ( rule__Hypotheses__NameAssignment_1_0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2897:2: rule__Hypotheses__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Hypotheses__NameAssignment_1_0_in_rule__Hypotheses__Group_1__0__Impl6013);
            rule__Hypotheses__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__0__Impl"


    // $ANTLR start "rule__Hypotheses__Group_1__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2907:1: rule__Hypotheses__Group_1__1 : rule__Hypotheses__Group_1__1__Impl rule__Hypotheses__Group_1__2 ;
    public final void rule__Hypotheses__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2911:1: ( rule__Hypotheses__Group_1__1__Impl rule__Hypotheses__Group_1__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2912:2: rule__Hypotheses__Group_1__1__Impl rule__Hypotheses__Group_1__2
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_1__1__Impl_in_rule__Hypotheses__Group_1__16043);
            rule__Hypotheses__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_1__2_in_rule__Hypotheses__Group_1__16046);
            rule__Hypotheses__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__1"


    // $ANTLR start "rule__Hypotheses__Group_1__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2919:1: rule__Hypotheses__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Hypotheses__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2923:1: ( ( '(' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2924:1: ( '(' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2924:1: ( '(' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2925:1: '('
            {
             before(grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,65,FOLLOW_65_in_rule__Hypotheses__Group_1__1__Impl6074); 
             after(grammarAccess.getHypothesesAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__1__Impl"


    // $ANTLR start "rule__Hypotheses__Group_1__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2938:1: rule__Hypotheses__Group_1__2 : rule__Hypotheses__Group_1__2__Impl rule__Hypotheses__Group_1__3 ;
    public final void rule__Hypotheses__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2942:1: ( rule__Hypotheses__Group_1__2__Impl rule__Hypotheses__Group_1__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2943:2: rule__Hypotheses__Group_1__2__Impl rule__Hypotheses__Group_1__3
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_1__2__Impl_in_rule__Hypotheses__Group_1__26105);
            rule__Hypotheses__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_1__3_in_rule__Hypotheses__Group_1__26108);
            rule__Hypotheses__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__2"


    // $ANTLR start "rule__Hypotheses__Group_1__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2950:1: rule__Hypotheses__Group_1__2__Impl : ( ( rule__Hypotheses__DependentVariableAssignment_1_2 ) ) ;
    public final void rule__Hypotheses__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2954:1: ( ( ( rule__Hypotheses__DependentVariableAssignment_1_2 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2955:1: ( ( rule__Hypotheses__DependentVariableAssignment_1_2 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2955:1: ( ( rule__Hypotheses__DependentVariableAssignment_1_2 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2956:1: ( rule__Hypotheses__DependentVariableAssignment_1_2 )
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableAssignment_1_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2957:1: ( rule__Hypotheses__DependentVariableAssignment_1_2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2957:2: rule__Hypotheses__DependentVariableAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Hypotheses__DependentVariableAssignment_1_2_in_rule__Hypotheses__Group_1__2__Impl6135);
            rule__Hypotheses__DependentVariableAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getDependentVariableAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__2__Impl"


    // $ANTLR start "rule__Hypotheses__Group_1__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2967:1: rule__Hypotheses__Group_1__3 : rule__Hypotheses__Group_1__3__Impl rule__Hypotheses__Group_1__4 ;
    public final void rule__Hypotheses__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2971:1: ( rule__Hypotheses__Group_1__3__Impl rule__Hypotheses__Group_1__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2972:2: rule__Hypotheses__Group_1__3__Impl rule__Hypotheses__Group_1__4
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_1__3__Impl_in_rule__Hypotheses__Group_1__36165);
            rule__Hypotheses__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_1__4_in_rule__Hypotheses__Group_1__36168);
            rule__Hypotheses__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__3"


    // $ANTLR start "rule__Hypotheses__Group_1__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2979:1: rule__Hypotheses__Group_1__3__Impl : ( ( rule__Hypotheses__RelationAssignment_1_3 ) ) ;
    public final void rule__Hypotheses__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2983:1: ( ( ( rule__Hypotheses__RelationAssignment_1_3 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2984:1: ( ( rule__Hypotheses__RelationAssignment_1_3 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2984:1: ( ( rule__Hypotheses__RelationAssignment_1_3 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2985:1: ( rule__Hypotheses__RelationAssignment_1_3 )
            {
             before(grammarAccess.getHypothesesAccess().getRelationAssignment_1_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2986:1: ( rule__Hypotheses__RelationAssignment_1_3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2986:2: rule__Hypotheses__RelationAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Hypotheses__RelationAssignment_1_3_in_rule__Hypotheses__Group_1__3__Impl6195);
            rule__Hypotheses__RelationAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getHypothesesAccess().getRelationAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__3__Impl"


    // $ANTLR start "rule__Hypotheses__Group_1__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:2996:1: rule__Hypotheses__Group_1__4 : rule__Hypotheses__Group_1__4__Impl rule__Hypotheses__Group_1__5 ;
    public final void rule__Hypotheses__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3000:1: ( rule__Hypotheses__Group_1__4__Impl rule__Hypotheses__Group_1__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3001:2: rule__Hypotheses__Group_1__4__Impl rule__Hypotheses__Group_1__5
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_1__4__Impl_in_rule__Hypotheses__Group_1__46225);
            rule__Hypotheses__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hypotheses__Group_1__5_in_rule__Hypotheses__Group_1__46228);
            rule__Hypotheses__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__4"


    // $ANTLR start "rule__Hypotheses__Group_1__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3008:1: rule__Hypotheses__Group_1__4__Impl : ( ( rule__Hypotheses__FactorAssignment_1_4 )* ) ;
    public final void rule__Hypotheses__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3012:1: ( ( ( rule__Hypotheses__FactorAssignment_1_4 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3013:1: ( ( rule__Hypotheses__FactorAssignment_1_4 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3013:1: ( ( rule__Hypotheses__FactorAssignment_1_4 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3014:1: ( rule__Hypotheses__FactorAssignment_1_4 )*
            {
             before(grammarAccess.getHypothesesAccess().getFactorAssignment_1_4()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3015:1: ( rule__Hypotheses__FactorAssignment_1_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3015:2: rule__Hypotheses__FactorAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_rule__Hypotheses__FactorAssignment_1_4_in_rule__Hypotheses__Group_1__4__Impl6255);
            	    rule__Hypotheses__FactorAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getHypothesesAccess().getFactorAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__4__Impl"


    // $ANTLR start "rule__Hypotheses__Group_1__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3025:1: rule__Hypotheses__Group_1__5 : rule__Hypotheses__Group_1__5__Impl ;
    public final void rule__Hypotheses__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3029:1: ( rule__Hypotheses__Group_1__5__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3030:2: rule__Hypotheses__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__Hypotheses__Group_1__5__Impl_in_rule__Hypotheses__Group_1__56286);
            rule__Hypotheses__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__5"


    // $ANTLR start "rule__Hypotheses__Group_1__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3036:1: rule__Hypotheses__Group_1__5__Impl : ( ')' ) ;
    public final void rule__Hypotheses__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3040:1: ( ( ')' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3041:1: ( ')' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3041:1: ( ')' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3042:1: ')'
            {
             before(grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_1_5()); 
            match(input,66,FOLLOW_66_in_rule__Hypotheses__Group_1__5__Impl6314); 
             after(grammarAccess.getHypothesesAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__Group_1__5__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3067:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3071:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3072:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06357);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06360);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3079:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3083:1: ( ( 'Parameter' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3084:1: ( 'Parameter' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3084:1: ( 'Parameter' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3085:1: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,67,FOLLOW_67_in_rule__Parameter__Group__0__Impl6388); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3098:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3102:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3103:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16419);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16422);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3110:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__VariableAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3114:1: ( ( ( rule__Parameter__VariableAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3115:1: ( ( rule__Parameter__VariableAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3115:1: ( ( rule__Parameter__VariableAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3116:1: ( rule__Parameter__VariableAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getVariableAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3117:1: ( rule__Parameter__VariableAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3117:2: rule__Parameter__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__VariableAssignment_1_in_rule__Parameter__Group__1__Impl6449);
            rule__Parameter__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3127:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3131:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3132:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26479);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__26482);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3139:1: rule__Parameter__Group__2__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3143:1: ( ( '=' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3144:1: ( '=' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3144:1: ( '=' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3145:1: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Parameter__Group__2__Impl6510); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3158:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3162:1: ( rule__Parameter__Group__3__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3163:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__36541);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3169:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ValueAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3173:1: ( ( ( rule__Parameter__ValueAssignment_3 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3174:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3174:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3175:1: ( rule__Parameter__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3176:1: ( rule__Parameter__ValueAssignment_3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3176:2: rule__Parameter__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__ValueAssignment_3_in_rule__Parameter__Group__3__Impl6568);
            rule__Parameter__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__DependentVariable__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3194:1: rule__DependentVariable__Group__0 : rule__DependentVariable__Group__0__Impl rule__DependentVariable__Group__1 ;
    public final void rule__DependentVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3198:1: ( rule__DependentVariable__Group__0__Impl rule__DependentVariable__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3199:2: rule__DependentVariable__Group__0__Impl rule__DependentVariable__Group__1
            {
            pushFollow(FOLLOW_rule__DependentVariable__Group__0__Impl_in_rule__DependentVariable__Group__06606);
            rule__DependentVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DependentVariable__Group__1_in_rule__DependentVariable__Group__06609);
            rule__DependentVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__Group__0"


    // $ANTLR start "rule__DependentVariable__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3206:1: rule__DependentVariable__Group__0__Impl : ( 'Dependent Variable' ) ;
    public final void rule__DependentVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3210:1: ( ( 'Dependent Variable' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3211:1: ( 'Dependent Variable' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3211:1: ( 'Dependent Variable' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3212:1: 'Dependent Variable'
            {
             before(grammarAccess.getDependentVariableAccess().getDependentVariableKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__DependentVariable__Group__0__Impl6637); 
             after(grammarAccess.getDependentVariableAccess().getDependentVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__Group__0__Impl"


    // $ANTLR start "rule__DependentVariable__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3225:1: rule__DependentVariable__Group__1 : rule__DependentVariable__Group__1__Impl rule__DependentVariable__Group__2 ;
    public final void rule__DependentVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3229:1: ( rule__DependentVariable__Group__1__Impl rule__DependentVariable__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3230:2: rule__DependentVariable__Group__1__Impl rule__DependentVariable__Group__2
            {
            pushFollow(FOLLOW_rule__DependentVariable__Group__1__Impl_in_rule__DependentVariable__Group__16668);
            rule__DependentVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DependentVariable__Group__2_in_rule__DependentVariable__Group__16671);
            rule__DependentVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__Group__1"


    // $ANTLR start "rule__DependentVariable__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3237:1: rule__DependentVariable__Group__1__Impl : ( ( rule__DependentVariable__NameAssignment_1 ) ) ;
    public final void rule__DependentVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3241:1: ( ( ( rule__DependentVariable__NameAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3242:1: ( ( rule__DependentVariable__NameAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3242:1: ( ( rule__DependentVariable__NameAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3243:1: ( rule__DependentVariable__NameAssignment_1 )
            {
             before(grammarAccess.getDependentVariableAccess().getNameAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3244:1: ( rule__DependentVariable__NameAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3244:2: rule__DependentVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DependentVariable__NameAssignment_1_in_rule__DependentVariable__Group__1__Impl6698);
            rule__DependentVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependentVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__Group__1__Impl"


    // $ANTLR start "rule__DependentVariable__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3254:1: rule__DependentVariable__Group__2 : rule__DependentVariable__Group__2__Impl rule__DependentVariable__Group__3 ;
    public final void rule__DependentVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3258:1: ( rule__DependentVariable__Group__2__Impl rule__DependentVariable__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3259:2: rule__DependentVariable__Group__2__Impl rule__DependentVariable__Group__3
            {
            pushFollow(FOLLOW_rule__DependentVariable__Group__2__Impl_in_rule__DependentVariable__Group__26728);
            rule__DependentVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DependentVariable__Group__3_in_rule__DependentVariable__Group__26731);
            rule__DependentVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__Group__2"


    // $ANTLR start "rule__DependentVariable__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3266:1: rule__DependentVariable__Group__2__Impl : ( ( rule__DependentVariable__DescriptionAssignment_2 ) ) ;
    public final void rule__DependentVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3270:1: ( ( ( rule__DependentVariable__DescriptionAssignment_2 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3271:1: ( ( rule__DependentVariable__DescriptionAssignment_2 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3271:1: ( ( rule__DependentVariable__DescriptionAssignment_2 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3272:1: ( rule__DependentVariable__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDependentVariableAccess().getDescriptionAssignment_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3273:1: ( rule__DependentVariable__DescriptionAssignment_2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3273:2: rule__DependentVariable__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__DependentVariable__DescriptionAssignment_2_in_rule__DependentVariable__Group__2__Impl6758);
            rule__DependentVariable__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDependentVariableAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__Group__2__Impl"


    // $ANTLR start "rule__DependentVariable__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3283:1: rule__DependentVariable__Group__3 : rule__DependentVariable__Group__3__Impl ;
    public final void rule__DependentVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3287:1: ( rule__DependentVariable__Group__3__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3288:2: rule__DependentVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DependentVariable__Group__3__Impl_in_rule__DependentVariable__Group__36788);
            rule__DependentVariable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__Group__3"


    // $ANTLR start "rule__DependentVariable__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3294:1: rule__DependentVariable__Group__3__Impl : ( ( rule__DependentVariable__MetricsAssignment_3 )* ) ;
    public final void rule__DependentVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3298:1: ( ( ( rule__DependentVariable__MetricsAssignment_3 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3299:1: ( ( rule__DependentVariable__MetricsAssignment_3 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3299:1: ( ( rule__DependentVariable__MetricsAssignment_3 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3300:1: ( rule__DependentVariable__MetricsAssignment_3 )*
            {
             before(grammarAccess.getDependentVariableAccess().getMetricsAssignment_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3301:1: ( rule__DependentVariable__MetricsAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3301:2: rule__DependentVariable__MetricsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DependentVariable__MetricsAssignment_3_in_rule__DependentVariable__Group__3__Impl6815);
            	    rule__DependentVariable__MetricsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getDependentVariableAccess().getMetricsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__Group__3__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3319:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3323:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3324:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__06854);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__06857);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3331:1: rule__Factor__Group__0__Impl : ( 'Factor' ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3335:1: ( ( 'Factor' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3336:1: ( 'Factor' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3336:1: ( 'Factor' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3337:1: 'Factor'
            {
             before(grammarAccess.getFactorAccess().getFactorKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__Factor__Group__0__Impl6885); 
             after(grammarAccess.getFactorAccess().getFactorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3350:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl rule__Factor__Group__2 ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3354:1: ( rule__Factor__Group__1__Impl rule__Factor__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3355:2: rule__Factor__Group__1__Impl rule__Factor__Group__2
            {
            pushFollow(FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__16916);
            rule__Factor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group__2_in_rule__Factor__Group__16919);
            rule__Factor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3362:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__NameAssignment_1 ) ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3366:1: ( ( ( rule__Factor__NameAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3367:1: ( ( rule__Factor__NameAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3367:1: ( ( rule__Factor__NameAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3368:1: ( rule__Factor__NameAssignment_1 )
            {
             before(grammarAccess.getFactorAccess().getNameAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3369:1: ( rule__Factor__NameAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3369:2: rule__Factor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Factor__NameAssignment_1_in_rule__Factor__Group__1__Impl6946);
            rule__Factor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3379:1: rule__Factor__Group__2 : rule__Factor__Group__2__Impl rule__Factor__Group__3 ;
    public final void rule__Factor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3383:1: ( rule__Factor__Group__2__Impl rule__Factor__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3384:2: rule__Factor__Group__2__Impl rule__Factor__Group__3
            {
            pushFollow(FOLLOW_rule__Factor__Group__2__Impl_in_rule__Factor__Group__26976);
            rule__Factor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group__3_in_rule__Factor__Group__26979);
            rule__Factor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__2"


    // $ANTLR start "rule__Factor__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3391:1: rule__Factor__Group__2__Impl : ( 'isDesiredVariation' ) ;
    public final void rule__Factor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3395:1: ( ( 'isDesiredVariation' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3396:1: ( 'isDesiredVariation' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3396:1: ( 'isDesiredVariation' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3397:1: 'isDesiredVariation'
            {
             before(grammarAccess.getFactorAccess().getIsDesiredVariationKeyword_2()); 
            match(input,70,FOLLOW_70_in_rule__Factor__Group__2__Impl7007); 
             after(grammarAccess.getFactorAccess().getIsDesiredVariationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__2__Impl"


    // $ANTLR start "rule__Factor__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3410:1: rule__Factor__Group__3 : rule__Factor__Group__3__Impl rule__Factor__Group__4 ;
    public final void rule__Factor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3414:1: ( rule__Factor__Group__3__Impl rule__Factor__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3415:2: rule__Factor__Group__3__Impl rule__Factor__Group__4
            {
            pushFollow(FOLLOW_rule__Factor__Group__3__Impl_in_rule__Factor__Group__37038);
            rule__Factor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group__4_in_rule__Factor__Group__37041);
            rule__Factor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__3"


    // $ANTLR start "rule__Factor__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3422:1: rule__Factor__Group__3__Impl : ( ( rule__Factor__IsDesiredVariationAssignment_3 ) ) ;
    public final void rule__Factor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3426:1: ( ( ( rule__Factor__IsDesiredVariationAssignment_3 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3427:1: ( ( rule__Factor__IsDesiredVariationAssignment_3 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3427:1: ( ( rule__Factor__IsDesiredVariationAssignment_3 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3428:1: ( rule__Factor__IsDesiredVariationAssignment_3 )
            {
             before(grammarAccess.getFactorAccess().getIsDesiredVariationAssignment_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3429:1: ( rule__Factor__IsDesiredVariationAssignment_3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3429:2: rule__Factor__IsDesiredVariationAssignment_3
            {
            pushFollow(FOLLOW_rule__Factor__IsDesiredVariationAssignment_3_in_rule__Factor__Group__3__Impl7068);
            rule__Factor__IsDesiredVariationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getIsDesiredVariationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__3__Impl"


    // $ANTLR start "rule__Factor__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3439:1: rule__Factor__Group__4 : rule__Factor__Group__4__Impl ;
    public final void rule__Factor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3443:1: ( rule__Factor__Group__4__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3444:2: rule__Factor__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group__4__Impl_in_rule__Factor__Group__47098);
            rule__Factor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__4"


    // $ANTLR start "rule__Factor__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3450:1: rule__Factor__Group__4__Impl : ( ( rule__Factor__Group_4__0 )? ) ;
    public final void rule__Factor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3454:1: ( ( ( rule__Factor__Group_4__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3455:1: ( ( rule__Factor__Group_4__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3455:1: ( ( rule__Factor__Group_4__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3456:1: ( rule__Factor__Group_4__0 )?
            {
             before(grammarAccess.getFactorAccess().getGroup_4()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3457:1: ( rule__Factor__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3457:2: rule__Factor__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_4__0_in_rule__Factor__Group__4__Impl7125);
                    rule__Factor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__4__Impl"


    // $ANTLR start "rule__Factor__Group_4__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3477:1: rule__Factor__Group_4__0 : rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 ;
    public final void rule__Factor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3481:1: ( rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3482:2: rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_4__0__Impl_in_rule__Factor__Group_4__07166);
            rule__Factor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_4__1_in_rule__Factor__Group_4__07169);
            rule__Factor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__0"


    // $ANTLR start "rule__Factor__Group_4__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3489:1: rule__Factor__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Factor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3493:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3494:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3494:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3495:1: '{'
            {
             before(grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,59,FOLLOW_59_in_rule__Factor__Group_4__0__Impl7197); 
             after(grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__0__Impl"


    // $ANTLR start "rule__Factor__Group_4__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3508:1: rule__Factor__Group_4__1 : rule__Factor__Group_4__1__Impl rule__Factor__Group_4__2 ;
    public final void rule__Factor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3512:1: ( rule__Factor__Group_4__1__Impl rule__Factor__Group_4__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3513:2: rule__Factor__Group_4__1__Impl rule__Factor__Group_4__2
            {
            pushFollow(FOLLOW_rule__Factor__Group_4__1__Impl_in_rule__Factor__Group_4__17228);
            rule__Factor__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_4__2_in_rule__Factor__Group_4__17231);
            rule__Factor__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__1"


    // $ANTLR start "rule__Factor__Group_4__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3520:1: rule__Factor__Group_4__1__Impl : ( ( rule__Factor__LevelAssignment_4_1 )* ) ;
    public final void rule__Factor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3524:1: ( ( ( rule__Factor__LevelAssignment_4_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3525:1: ( ( rule__Factor__LevelAssignment_4_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3525:1: ( ( rule__Factor__LevelAssignment_4_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3526:1: ( rule__Factor__LevelAssignment_4_1 )*
            {
             before(grammarAccess.getFactorAccess().getLevelAssignment_4_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3527:1: ( rule__Factor__LevelAssignment_4_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3527:2: rule__Factor__LevelAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Factor__LevelAssignment_4_1_in_rule__Factor__Group_4__1__Impl7258);
            	    rule__Factor__LevelAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getLevelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__1__Impl"


    // $ANTLR start "rule__Factor__Group_4__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3537:1: rule__Factor__Group_4__2 : rule__Factor__Group_4__2__Impl ;
    public final void rule__Factor__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3541:1: ( rule__Factor__Group_4__2__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3542:2: rule__Factor__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_4__2__Impl_in_rule__Factor__Group_4__27289);
            rule__Factor__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__2"


    // $ANTLR start "rule__Factor__Group_4__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3548:1: rule__Factor__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Factor__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3552:1: ( ( '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3553:1: ( '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3553:1: ( '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3554:1: '}'
            {
             before(grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,60,FOLLOW_60_in_rule__Factor__Group_4__2__Impl7317); 
             after(grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__2__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3573:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3577:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3578:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__07354);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__1_in_rule__Process__Group__07357);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3585:1: rule__Process__Group__0__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3589:1: ( ( 'Process' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3590:1: ( 'Process' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3590:1: ( 'Process' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3591:1: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,71,FOLLOW_71_in_rule__Process__Group__0__Impl7385); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3604:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3608:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3609:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__17416);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__2_in_rule__Process__Group__17419);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3616:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3620:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3621:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3621:1: ( ( rule__Process__NameAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3622:1: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3623:1: ( rule__Process__NameAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3623:2: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Process__NameAssignment_1_in_rule__Process__Group__1__Impl7446);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3633:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3637:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3638:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__27476);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__3_in_rule__Process__Group__27479);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3645:1: rule__Process__Group__2__Impl : ( ( rule__Process__Group_2__0 )? ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3649:1: ( ( ( rule__Process__Group_2__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3650:1: ( ( rule__Process__Group_2__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3650:1: ( ( rule__Process__Group_2__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3651:1: ( rule__Process__Group_2__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3652:1: ( rule__Process__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3652:2: rule__Process__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_2__0_in_rule__Process__Group__2__Impl7506);
                    rule__Process__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3662:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3666:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3667:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__37537);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__4_in_rule__Process__Group__37540);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3674:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3678:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3679:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3679:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3680:1: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,59,FOLLOW_59_in_rule__Process__Group__3__Impl7568); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3693:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3697:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3698:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__47599);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__5_in_rule__Process__Group__47602);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3705:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3709:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3710:1: ( ( rule__Process__Group_4__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3710:1: ( ( rule__Process__Group_4__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3711:1: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3712:1: ( rule__Process__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==73) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3712:2: rule__Process__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_4__0_in_rule__Process__Group__4__Impl7629);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3722:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3726:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3727:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_rule__Process__Group__5__Impl_in_rule__Process__Group__57660);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__6_in_rule__Process__Group__57663);
            rule__Process__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3734:1: rule__Process__Group__5__Impl : ( ( rule__Process__TaskAssignment_5 )* ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3738:1: ( ( ( rule__Process__TaskAssignment_5 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3739:1: ( ( rule__Process__TaskAssignment_5 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3739:1: ( ( rule__Process__TaskAssignment_5 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3740:1: ( rule__Process__TaskAssignment_5 )*
            {
             before(grammarAccess.getProcessAccess().getTaskAssignment_5()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3741:1: ( rule__Process__TaskAssignment_5 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==74) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3741:2: rule__Process__TaskAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Process__TaskAssignment_5_in_rule__Process__Group__5__Impl7690);
            	    rule__Process__TaskAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getTaskAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3751:1: rule__Process__Group__6 : rule__Process__Group__6__Impl ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3755:1: ( rule__Process__Group__6__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3756:2: rule__Process__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group__6__Impl_in_rule__Process__Group__67721);
            rule__Process__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3762:1: rule__Process__Group__6__Impl : ( '}' ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3766:1: ( ( '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3767:1: ( '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3767:1: ( '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3768:1: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6()); 
            match(input,60,FOLLOW_60_in_rule__Process__Group__6__Impl7749); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group_2__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3795:1: rule__Process__Group_2__0 : rule__Process__Group_2__0__Impl rule__Process__Group_2__1 ;
    public final void rule__Process__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3799:1: ( rule__Process__Group_2__0__Impl rule__Process__Group_2__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3800:2: rule__Process__Group_2__0__Impl rule__Process__Group_2__1
            {
            pushFollow(FOLLOW_rule__Process__Group_2__0__Impl_in_rule__Process__Group_2__07794);
            rule__Process__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group_2__1_in_rule__Process__Group_2__07797);
            rule__Process__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_2__0"


    // $ANTLR start "rule__Process__Group_2__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3807:1: rule__Process__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__Process__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3811:1: ( ( 'to' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3812:1: ( 'to' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3812:1: ( 'to' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3813:1: 'to'
            {
             before(grammarAccess.getProcessAccess().getToKeyword_2_0()); 
            match(input,72,FOLLOW_72_in_rule__Process__Group_2__0__Impl7825); 
             after(grammarAccess.getProcessAccess().getToKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_2__0__Impl"


    // $ANTLR start "rule__Process__Group_2__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3826:1: rule__Process__Group_2__1 : rule__Process__Group_2__1__Impl ;
    public final void rule__Process__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3830:1: ( rule__Process__Group_2__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3831:2: rule__Process__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_2__1__Impl_in_rule__Process__Group_2__17856);
            rule__Process__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_2__1"


    // $ANTLR start "rule__Process__Group_2__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3837:1: rule__Process__Group_2__1__Impl : ( ( rule__Process__TreatmentAssignment_2_1 )* ) ;
    public final void rule__Process__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3841:1: ( ( ( rule__Process__TreatmentAssignment_2_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3842:1: ( ( rule__Process__TreatmentAssignment_2_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3842:1: ( ( rule__Process__TreatmentAssignment_2_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3843:1: ( rule__Process__TreatmentAssignment_2_1 )*
            {
             before(grammarAccess.getProcessAccess().getTreatmentAssignment_2_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3844:1: ( rule__Process__TreatmentAssignment_2_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3844:2: rule__Process__TreatmentAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Process__TreatmentAssignment_2_1_in_rule__Process__Group_2__1__Impl7883);
            	    rule__Process__TreatmentAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getTreatmentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_2__1__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3858:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3862:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3863:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_rule__Process__Group_4__0__Impl_in_rule__Process__Group_4__07918);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group_4__1_in_rule__Process__Group_4__07921);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3870:1: rule__Process__Group_4__0__Impl : ( 'Role' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3874:1: ( ( 'Role' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3875:1: ( 'Role' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3875:1: ( 'Role' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3876:1: 'Role'
            {
             before(grammarAccess.getProcessAccess().getRoleKeyword_4_0()); 
            match(input,73,FOLLOW_73_in_rule__Process__Group_4__0__Impl7949); 
             after(grammarAccess.getProcessAccess().getRoleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3889:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3893:1: ( rule__Process__Group_4__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3894:2: rule__Process__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_4__1__Impl_in_rule__Process__Group_4__17980);
            rule__Process__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3900:1: rule__Process__Group_4__1__Impl : ( ( rule__Process__RoleAssignment_4_1 )* ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3904:1: ( ( ( rule__Process__RoleAssignment_4_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3905:1: ( ( rule__Process__RoleAssignment_4_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3905:1: ( ( rule__Process__RoleAssignment_4_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3906:1: ( rule__Process__RoleAssignment_4_1 )*
            {
             before(grammarAccess.getProcessAccess().getRoleAssignment_4_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3907:1: ( rule__Process__RoleAssignment_4_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=39 && LA40_0<=40)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3907:2: rule__Process__RoleAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Process__RoleAssignment_4_1_in_rule__Process__Group_4__1__Impl8007);
            	    rule__Process__RoleAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getRoleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3921:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3925:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3926:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__08042);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__08045);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3933:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3937:1: ( ( 'Task' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3938:1: ( 'Task' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3938:1: ( 'Task' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3939:1: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,74,FOLLOW_74_in_rule__Task__Group__0__Impl8073); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3952:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3956:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3957:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__18104);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__2_in_rule__Task__Group__18107);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3964:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3968:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3969:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3969:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3970:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3971:1: ( rule__Task__NameAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3971:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl8134);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3981:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3985:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3986:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_rule__Task__Group__2__Impl_in_rule__Task__Group__28164);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__3_in_rule__Task__Group__28167);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3993:1: rule__Task__Group__2__Impl : ( 'description' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3997:1: ( ( 'description' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3998:1: ( 'description' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3998:1: ( 'description' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:3999:1: 'description'
            {
             before(grammarAccess.getTaskAccess().getDescriptionKeyword_2()); 
            match(input,75,FOLLOW_75_in_rule__Task__Group__2__Impl8195); 
             after(grammarAccess.getTaskAccess().getDescriptionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4012:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4016:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4017:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_rule__Task__Group__3__Impl_in_rule__Task__Group__38226);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__4_in_rule__Task__Group__38229);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4024:1: rule__Task__Group__3__Impl : ( ( rule__Task__DescriptionAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4028:1: ( ( ( rule__Task__DescriptionAssignment_3 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4029:1: ( ( rule__Task__DescriptionAssignment_3 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4029:1: ( ( rule__Task__DescriptionAssignment_3 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4030:1: ( rule__Task__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getDescriptionAssignment_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4031:1: ( rule__Task__DescriptionAssignment_3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4031:2: rule__Task__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Task__DescriptionAssignment_3_in_rule__Task__Group__3__Impl8256);
            rule__Task__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4041:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4045:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4046:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_rule__Task__Group__4__Impl_in_rule__Task__Group__48286);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__5_in_rule__Task__Group__48289);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4053:1: rule__Task__Group__4__Impl : ( ( rule__Task__Group_4__0 )? ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4057:1: ( ( ( rule__Task__Group_4__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4058:1: ( ( rule__Task__Group_4__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4058:1: ( ( rule__Task__Group_4__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4059:1: ( rule__Task__Group_4__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_4()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4060:1: ( rule__Task__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==72) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4060:2: rule__Task__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_4__0_in_rule__Task__Group__4__Impl8316);
                    rule__Task__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4070:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4074:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4075:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_rule__Task__Group__5__Impl_in_rule__Task__Group__58347);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__6_in_rule__Task__Group__58350);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4082:1: rule__Task__Group__5__Impl : ( ( rule__Task__Group_5__0 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4086:1: ( ( ( rule__Task__Group_5__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4087:1: ( ( rule__Task__Group_5__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4087:1: ( ( rule__Task__Group_5__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4088:1: ( rule__Task__Group_5__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_5()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4089:1: ( rule__Task__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==73) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4089:2: rule__Task__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_5__0_in_rule__Task__Group__5__Impl8377);
                    rule__Task__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4099:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4103:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4104:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_rule__Task__Group__6__Impl_in_rule__Task__Group__68408);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__7_in_rule__Task__Group__68411);
            rule__Task__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4111:1: rule__Task__Group__6__Impl : ( '{' ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4115:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4116:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4116:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4117:1: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,59,FOLLOW_59_in_rule__Task__Group__6__Impl8439); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4130:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4134:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4135:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_rule__Task__Group__7__Impl_in_rule__Task__Group__78470);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__8_in_rule__Task__Group__78473);
            rule__Task__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4142:1: rule__Task__Group__7__Impl : ( ( rule__Task__Group_7__0 )? ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4146:1: ( ( ( rule__Task__Group_7__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4147:1: ( ( rule__Task__Group_7__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4147:1: ( ( rule__Task__Group_7__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4148:1: ( rule__Task__Group_7__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_7()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4149:1: ( rule__Task__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==76) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4149:2: rule__Task__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_7__0_in_rule__Task__Group__7__Impl8500);
                    rule__Task__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4159:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4163:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4164:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_rule__Task__Group__8__Impl_in_rule__Task__Group__88531);
            rule__Task__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__9_in_rule__Task__Group__88534);
            rule__Task__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4171:1: rule__Task__Group__8__Impl : ( ( rule__Task__Group_8__0 )? ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4175:1: ( ( ( rule__Task__Group_8__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4176:1: ( ( rule__Task__Group_8__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4176:1: ( ( rule__Task__Group_8__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4177:1: ( rule__Task__Group_8__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_8()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4178:1: ( rule__Task__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==77) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4178:2: rule__Task__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_8__0_in_rule__Task__Group__8__Impl8561);
                    rule__Task__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__9"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4188:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4192:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4193:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_rule__Task__Group__9__Impl_in_rule__Task__Group__98592);
            rule__Task__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__10_in_rule__Task__Group__98595);
            rule__Task__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9"


    // $ANTLR start "rule__Task__Group__9__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4200:1: rule__Task__Group__9__Impl : ( ( rule__Task__Group_9__0 )? ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4204:1: ( ( ( rule__Task__Group_9__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4205:1: ( ( rule__Task__Group_9__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4205:1: ( ( rule__Task__Group_9__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4206:1: ( rule__Task__Group_9__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_9()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4207:1: ( rule__Task__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==78) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4207:2: rule__Task__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_9__0_in_rule__Task__Group__9__Impl8622);
                    rule__Task__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9__Impl"


    // $ANTLR start "rule__Task__Group__10"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4217:1: rule__Task__Group__10 : rule__Task__Group__10__Impl ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4221:1: ( rule__Task__Group__10__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4222:2: rule__Task__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group__10__Impl_in_rule__Task__Group__108653);
            rule__Task__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10"


    // $ANTLR start "rule__Task__Group__10__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4228:1: rule__Task__Group__10__Impl : ( '}' ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4232:1: ( ( '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4233:1: ( '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4233:1: ( '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4234:1: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_10()); 
            match(input,60,FOLLOW_60_in_rule__Task__Group__10__Impl8681); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10__Impl"


    // $ANTLR start "rule__Task__Group_4__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4269:1: rule__Task__Group_4__0 : rule__Task__Group_4__0__Impl rule__Task__Group_4__1 ;
    public final void rule__Task__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4273:1: ( rule__Task__Group_4__0__Impl rule__Task__Group_4__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4274:2: rule__Task__Group_4__0__Impl rule__Task__Group_4__1
            {
            pushFollow(FOLLOW_rule__Task__Group_4__0__Impl_in_rule__Task__Group_4__08734);
            rule__Task__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_4__1_in_rule__Task__Group_4__08737);
            rule__Task__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__0"


    // $ANTLR start "rule__Task__Group_4__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4281:1: rule__Task__Group_4__0__Impl : ( 'to' ) ;
    public final void rule__Task__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4285:1: ( ( 'to' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4286:1: ( 'to' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4286:1: ( 'to' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4287:1: 'to'
            {
             before(grammarAccess.getTaskAccess().getToKeyword_4_0()); 
            match(input,72,FOLLOW_72_in_rule__Task__Group_4__0__Impl8765); 
             after(grammarAccess.getTaskAccess().getToKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__0__Impl"


    // $ANTLR start "rule__Task__Group_4__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4300:1: rule__Task__Group_4__1 : rule__Task__Group_4__1__Impl ;
    public final void rule__Task__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4304:1: ( rule__Task__Group_4__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4305:2: rule__Task__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_4__1__Impl_in_rule__Task__Group_4__18796);
            rule__Task__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__1"


    // $ANTLR start "rule__Task__Group_4__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4311:1: rule__Task__Group_4__1__Impl : ( ( rule__Task__NextAssignment_4_1 )* ) ;
    public final void rule__Task__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4315:1: ( ( ( rule__Task__NextAssignment_4_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4316:1: ( ( rule__Task__NextAssignment_4_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4316:1: ( ( rule__Task__NextAssignment_4_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4317:1: ( rule__Task__NextAssignment_4_1 )*
            {
             before(grammarAccess.getTaskAccess().getNextAssignment_4_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4318:1: ( rule__Task__NextAssignment_4_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4318:2: rule__Task__NextAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__NextAssignment_4_1_in_rule__Task__Group_4__1__Impl8823);
            	    rule__Task__NextAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getNextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__1__Impl"


    // $ANTLR start "rule__Task__Group_5__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4332:1: rule__Task__Group_5__0 : rule__Task__Group_5__0__Impl rule__Task__Group_5__1 ;
    public final void rule__Task__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4336:1: ( rule__Task__Group_5__0__Impl rule__Task__Group_5__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4337:2: rule__Task__Group_5__0__Impl rule__Task__Group_5__1
            {
            pushFollow(FOLLOW_rule__Task__Group_5__0__Impl_in_rule__Task__Group_5__08858);
            rule__Task__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_5__1_in_rule__Task__Group_5__08861);
            rule__Task__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__0"


    // $ANTLR start "rule__Task__Group_5__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4344:1: rule__Task__Group_5__0__Impl : ( 'Role' ) ;
    public final void rule__Task__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4348:1: ( ( 'Role' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4349:1: ( 'Role' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4349:1: ( 'Role' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4350:1: 'Role'
            {
             before(grammarAccess.getTaskAccess().getRoleKeyword_5_0()); 
            match(input,73,FOLLOW_73_in_rule__Task__Group_5__0__Impl8889); 
             after(grammarAccess.getTaskAccess().getRoleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__0__Impl"


    // $ANTLR start "rule__Task__Group_5__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4363:1: rule__Task__Group_5__1 : rule__Task__Group_5__1__Impl ;
    public final void rule__Task__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4367:1: ( rule__Task__Group_5__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4368:2: rule__Task__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_5__1__Impl_in_rule__Task__Group_5__18920);
            rule__Task__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__1"


    // $ANTLR start "rule__Task__Group_5__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4374:1: rule__Task__Group_5__1__Impl : ( ( rule__Task__RoleAssignment_5_1 )* ) ;
    public final void rule__Task__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4378:1: ( ( ( rule__Task__RoleAssignment_5_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4379:1: ( ( rule__Task__RoleAssignment_5_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4379:1: ( ( rule__Task__RoleAssignment_5_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4380:1: ( rule__Task__RoleAssignment_5_1 )*
            {
             before(grammarAccess.getTaskAccess().getRoleAssignment_5_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4381:1: ( rule__Task__RoleAssignment_5_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=39 && LA47_0<=40)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4381:2: rule__Task__RoleAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__RoleAssignment_5_1_in_rule__Task__Group_5__1__Impl8947);
            	    rule__Task__RoleAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getRoleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__1__Impl"


    // $ANTLR start "rule__Task__Group_7__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4395:1: rule__Task__Group_7__0 : rule__Task__Group_7__0__Impl rule__Task__Group_7__1 ;
    public final void rule__Task__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4399:1: ( rule__Task__Group_7__0__Impl rule__Task__Group_7__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4400:2: rule__Task__Group_7__0__Impl rule__Task__Group_7__1
            {
            pushFollow(FOLLOW_rule__Task__Group_7__0__Impl_in_rule__Task__Group_7__08982);
            rule__Task__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_7__1_in_rule__Task__Group_7__08985);
            rule__Task__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__0"


    // $ANTLR start "rule__Task__Group_7__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4407:1: rule__Task__Group_7__0__Impl : ( 'var' ) ;
    public final void rule__Task__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4411:1: ( ( 'var' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4412:1: ( 'var' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4412:1: ( 'var' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4413:1: 'var'
            {
             before(grammarAccess.getTaskAccess().getVarKeyword_7_0()); 
            match(input,76,FOLLOW_76_in_rule__Task__Group_7__0__Impl9013); 
             after(grammarAccess.getTaskAccess().getVarKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__0__Impl"


    // $ANTLR start "rule__Task__Group_7__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4426:1: rule__Task__Group_7__1 : rule__Task__Group_7__1__Impl ;
    public final void rule__Task__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4430:1: ( rule__Task__Group_7__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4431:2: rule__Task__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_7__1__Impl_in_rule__Task__Group_7__19044);
            rule__Task__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__1"


    // $ANTLR start "rule__Task__Group_7__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4437:1: rule__Task__Group_7__1__Impl : ( ( rule__Task__CollectDataAssignment_7_1 )* ) ;
    public final void rule__Task__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4441:1: ( ( ( rule__Task__CollectDataAssignment_7_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4442:1: ( ( rule__Task__CollectDataAssignment_7_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4442:1: ( ( rule__Task__CollectDataAssignment_7_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4443:1: ( rule__Task__CollectDataAssignment_7_1 )*
            {
             before(grammarAccess.getTaskAccess().getCollectDataAssignment_7_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4444:1: ( rule__Task__CollectDataAssignment_7_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4444:2: rule__Task__CollectDataAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__CollectDataAssignment_7_1_in_rule__Task__Group_7__1__Impl9071);
            	    rule__Task__CollectDataAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getCollectDataAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__1__Impl"


    // $ANTLR start "rule__Task__Group_8__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4458:1: rule__Task__Group_8__0 : rule__Task__Group_8__0__Impl rule__Task__Group_8__1 ;
    public final void rule__Task__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4462:1: ( rule__Task__Group_8__0__Impl rule__Task__Group_8__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4463:2: rule__Task__Group_8__0__Impl rule__Task__Group_8__1
            {
            pushFollow(FOLLOW_rule__Task__Group_8__0__Impl_in_rule__Task__Group_8__09106);
            rule__Task__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_8__1_in_rule__Task__Group_8__09109);
            rule__Task__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__0"


    // $ANTLR start "rule__Task__Group_8__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4470:1: rule__Task__Group_8__0__Impl : ( 'artefacts' ) ;
    public final void rule__Task__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4474:1: ( ( 'artefacts' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4475:1: ( 'artefacts' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4475:1: ( 'artefacts' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4476:1: 'artefacts'
            {
             before(grammarAccess.getTaskAccess().getArtefactsKeyword_8_0()); 
            match(input,77,FOLLOW_77_in_rule__Task__Group_8__0__Impl9137); 
             after(grammarAccess.getTaskAccess().getArtefactsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__0__Impl"


    // $ANTLR start "rule__Task__Group_8__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4489:1: rule__Task__Group_8__1 : rule__Task__Group_8__1__Impl ;
    public final void rule__Task__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4493:1: ( rule__Task__Group_8__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4494:2: rule__Task__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_8__1__Impl_in_rule__Task__Group_8__19168);
            rule__Task__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__1"


    // $ANTLR start "rule__Task__Group_8__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4500:1: rule__Task__Group_8__1__Impl : ( ( rule__Task__ArtefactsAssignment_8_1 )* ) ;
    public final void rule__Task__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4504:1: ( ( ( rule__Task__ArtefactsAssignment_8_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4505:1: ( ( rule__Task__ArtefactsAssignment_8_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4505:1: ( ( rule__Task__ArtefactsAssignment_8_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4506:1: ( rule__Task__ArtefactsAssignment_8_1 )*
            {
             before(grammarAccess.getTaskAccess().getArtefactsAssignment_8_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4507:1: ( rule__Task__ArtefactsAssignment_8_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4507:2: rule__Task__ArtefactsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__ArtefactsAssignment_8_1_in_rule__Task__Group_8__1__Impl9195);
            	    rule__Task__ArtefactsAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getArtefactsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__1__Impl"


    // $ANTLR start "rule__Task__Group_9__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4521:1: rule__Task__Group_9__0 : rule__Task__Group_9__0__Impl rule__Task__Group_9__1 ;
    public final void rule__Task__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4525:1: ( rule__Task__Group_9__0__Impl rule__Task__Group_9__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4526:2: rule__Task__Group_9__0__Impl rule__Task__Group_9__1
            {
            pushFollow(FOLLOW_rule__Task__Group_9__0__Impl_in_rule__Task__Group_9__09230);
            rule__Task__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_9__1_in_rule__Task__Group_9__09233);
            rule__Task__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_9__0"


    // $ANTLR start "rule__Task__Group_9__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4533:1: rule__Task__Group_9__0__Impl : ( 'quest' ) ;
    public final void rule__Task__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4537:1: ( ( 'quest' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4538:1: ( 'quest' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4538:1: ( 'quest' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4539:1: 'quest'
            {
             before(grammarAccess.getTaskAccess().getQuestKeyword_9_0()); 
            match(input,78,FOLLOW_78_in_rule__Task__Group_9__0__Impl9261); 
             after(grammarAccess.getTaskAccess().getQuestKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_9__0__Impl"


    // $ANTLR start "rule__Task__Group_9__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4552:1: rule__Task__Group_9__1 : rule__Task__Group_9__1__Impl ;
    public final void rule__Task__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4556:1: ( rule__Task__Group_9__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4557:2: rule__Task__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_9__1__Impl_in_rule__Task__Group_9__19292);
            rule__Task__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_9__1"


    // $ANTLR start "rule__Task__Group_9__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4563:1: rule__Task__Group_9__1__Impl : ( ( rule__Task__QuestionnaireAssignment_9_1 )* ) ;
    public final void rule__Task__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4567:1: ( ( ( rule__Task__QuestionnaireAssignment_9_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4568:1: ( ( rule__Task__QuestionnaireAssignment_9_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4568:1: ( ( rule__Task__QuestionnaireAssignment_9_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4569:1: ( rule__Task__QuestionnaireAssignment_9_1 )*
            {
             before(grammarAccess.getTaskAccess().getQuestionnaireAssignment_9_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4570:1: ( rule__Task__QuestionnaireAssignment_9_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4570:2: rule__Task__QuestionnaireAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__QuestionnaireAssignment_9_1_in_rule__Task__Group_9__1__Impl9319);
            	    rule__Task__QuestionnaireAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getQuestionnaireAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_9__1__Impl"


    // $ANTLR start "rule__Artefact__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4584:1: rule__Artefact__Group__0 : rule__Artefact__Group__0__Impl rule__Artefact__Group__1 ;
    public final void rule__Artefact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4588:1: ( rule__Artefact__Group__0__Impl rule__Artefact__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4589:2: rule__Artefact__Group__0__Impl rule__Artefact__Group__1
            {
            pushFollow(FOLLOW_rule__Artefact__Group__0__Impl_in_rule__Artefact__Group__09354);
            rule__Artefact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Artefact__Group__1_in_rule__Artefact__Group__09357);
            rule__Artefact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__0"


    // $ANTLR start "rule__Artefact__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4596:1: rule__Artefact__Group__0__Impl : ( ( rule__Artefact__NameAssignment_0 ) ) ;
    public final void rule__Artefact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4600:1: ( ( ( rule__Artefact__NameAssignment_0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4601:1: ( ( rule__Artefact__NameAssignment_0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4601:1: ( ( rule__Artefact__NameAssignment_0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4602:1: ( rule__Artefact__NameAssignment_0 )
            {
             before(grammarAccess.getArtefactAccess().getNameAssignment_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4603:1: ( rule__Artefact__NameAssignment_0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4603:2: rule__Artefact__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Artefact__NameAssignment_0_in_rule__Artefact__Group__0__Impl9384);
            rule__Artefact__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArtefactAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__0__Impl"


    // $ANTLR start "rule__Artefact__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4613:1: rule__Artefact__Group__1 : rule__Artefact__Group__1__Impl rule__Artefact__Group__2 ;
    public final void rule__Artefact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4617:1: ( rule__Artefact__Group__1__Impl rule__Artefact__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4618:2: rule__Artefact__Group__1__Impl rule__Artefact__Group__2
            {
            pushFollow(FOLLOW_rule__Artefact__Group__1__Impl_in_rule__Artefact__Group__19414);
            rule__Artefact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Artefact__Group__2_in_rule__Artefact__Group__19417);
            rule__Artefact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__1"


    // $ANTLR start "rule__Artefact__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4625:1: rule__Artefact__Group__1__Impl : ( 'description' ) ;
    public final void rule__Artefact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4629:1: ( ( 'description' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4630:1: ( 'description' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4630:1: ( 'description' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4631:1: 'description'
            {
             before(grammarAccess.getArtefactAccess().getDescriptionKeyword_1()); 
            match(input,75,FOLLOW_75_in_rule__Artefact__Group__1__Impl9445); 
             after(grammarAccess.getArtefactAccess().getDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__1__Impl"


    // $ANTLR start "rule__Artefact__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4644:1: rule__Artefact__Group__2 : rule__Artefact__Group__2__Impl rule__Artefact__Group__3 ;
    public final void rule__Artefact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4648:1: ( rule__Artefact__Group__2__Impl rule__Artefact__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4649:2: rule__Artefact__Group__2__Impl rule__Artefact__Group__3
            {
            pushFollow(FOLLOW_rule__Artefact__Group__2__Impl_in_rule__Artefact__Group__29476);
            rule__Artefact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Artefact__Group__3_in_rule__Artefact__Group__29479);
            rule__Artefact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__2"


    // $ANTLR start "rule__Artefact__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4656:1: rule__Artefact__Group__2__Impl : ( ( rule__Artefact__DescriptionAssignment_2 ) ) ;
    public final void rule__Artefact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4660:1: ( ( ( rule__Artefact__DescriptionAssignment_2 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4661:1: ( ( rule__Artefact__DescriptionAssignment_2 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4661:1: ( ( rule__Artefact__DescriptionAssignment_2 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4662:1: ( rule__Artefact__DescriptionAssignment_2 )
            {
             before(grammarAccess.getArtefactAccess().getDescriptionAssignment_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4663:1: ( rule__Artefact__DescriptionAssignment_2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4663:2: rule__Artefact__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Artefact__DescriptionAssignment_2_in_rule__Artefact__Group__2__Impl9506);
            rule__Artefact__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArtefactAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__2__Impl"


    // $ANTLR start "rule__Artefact__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4673:1: rule__Artefact__Group__3 : rule__Artefact__Group__3__Impl rule__Artefact__Group__4 ;
    public final void rule__Artefact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4677:1: ( rule__Artefact__Group__3__Impl rule__Artefact__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4678:2: rule__Artefact__Group__3__Impl rule__Artefact__Group__4
            {
            pushFollow(FOLLOW_rule__Artefact__Group__3__Impl_in_rule__Artefact__Group__39536);
            rule__Artefact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Artefact__Group__4_in_rule__Artefact__Group__39539);
            rule__Artefact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__3"


    // $ANTLR start "rule__Artefact__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4685:1: rule__Artefact__Group__3__Impl : ( 'type' ) ;
    public final void rule__Artefact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4689:1: ( ( 'type' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4690:1: ( 'type' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4690:1: ( 'type' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4691:1: 'type'
            {
             before(grammarAccess.getArtefactAccess().getTypeKeyword_3()); 
            match(input,79,FOLLOW_79_in_rule__Artefact__Group__3__Impl9567); 
             after(grammarAccess.getArtefactAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__3__Impl"


    // $ANTLR start "rule__Artefact__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4704:1: rule__Artefact__Group__4 : rule__Artefact__Group__4__Impl ;
    public final void rule__Artefact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4708:1: ( rule__Artefact__Group__4__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4709:2: rule__Artefact__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Artefact__Group__4__Impl_in_rule__Artefact__Group__49598);
            rule__Artefact__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__4"


    // $ANTLR start "rule__Artefact__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4715:1: rule__Artefact__Group__4__Impl : ( ( rule__Artefact__TypeAssignment_4 ) ) ;
    public final void rule__Artefact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4719:1: ( ( ( rule__Artefact__TypeAssignment_4 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4720:1: ( ( rule__Artefact__TypeAssignment_4 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4720:1: ( ( rule__Artefact__TypeAssignment_4 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4721:1: ( rule__Artefact__TypeAssignment_4 )
            {
             before(grammarAccess.getArtefactAccess().getTypeAssignment_4()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4722:1: ( rule__Artefact__TypeAssignment_4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4722:2: rule__Artefact__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Artefact__TypeAssignment_4_in_rule__Artefact__Group__4__Impl9625);
            rule__Artefact__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArtefactAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__Group__4__Impl"


    // $ANTLR start "rule__Metrics__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4742:1: rule__Metrics__Group__0 : rule__Metrics__Group__0__Impl rule__Metrics__Group__1 ;
    public final void rule__Metrics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4746:1: ( rule__Metrics__Group__0__Impl rule__Metrics__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4747:2: rule__Metrics__Group__0__Impl rule__Metrics__Group__1
            {
            pushFollow(FOLLOW_rule__Metrics__Group__0__Impl_in_rule__Metrics__Group__09665);
            rule__Metrics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metrics__Group__1_in_rule__Metrics__Group__09668);
            rule__Metrics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__0"


    // $ANTLR start "rule__Metrics__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4754:1: rule__Metrics__Group__0__Impl : ( 'Metric' ) ;
    public final void rule__Metrics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4758:1: ( ( 'Metric' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4759:1: ( 'Metric' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4759:1: ( 'Metric' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4760:1: 'Metric'
            {
             before(grammarAccess.getMetricsAccess().getMetricKeyword_0()); 
            match(input,80,FOLLOW_80_in_rule__Metrics__Group__0__Impl9696); 
             after(grammarAccess.getMetricsAccess().getMetricKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__0__Impl"


    // $ANTLR start "rule__Metrics__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4773:1: rule__Metrics__Group__1 : rule__Metrics__Group__1__Impl rule__Metrics__Group__2 ;
    public final void rule__Metrics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4777:1: ( rule__Metrics__Group__1__Impl rule__Metrics__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4778:2: rule__Metrics__Group__1__Impl rule__Metrics__Group__2
            {
            pushFollow(FOLLOW_rule__Metrics__Group__1__Impl_in_rule__Metrics__Group__19727);
            rule__Metrics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metrics__Group__2_in_rule__Metrics__Group__19730);
            rule__Metrics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__1"


    // $ANTLR start "rule__Metrics__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4785:1: rule__Metrics__Group__1__Impl : ( ( rule__Metrics__NameAssignment_1 ) ) ;
    public final void rule__Metrics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4789:1: ( ( ( rule__Metrics__NameAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4790:1: ( ( rule__Metrics__NameAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4790:1: ( ( rule__Metrics__NameAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4791:1: ( rule__Metrics__NameAssignment_1 )
            {
             before(grammarAccess.getMetricsAccess().getNameAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4792:1: ( rule__Metrics__NameAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4792:2: rule__Metrics__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Metrics__NameAssignment_1_in_rule__Metrics__Group__1__Impl9757);
            rule__Metrics__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__1__Impl"


    // $ANTLR start "rule__Metrics__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4802:1: rule__Metrics__Group__2 : rule__Metrics__Group__2__Impl rule__Metrics__Group__3 ;
    public final void rule__Metrics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4806:1: ( rule__Metrics__Group__2__Impl rule__Metrics__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4807:2: rule__Metrics__Group__2__Impl rule__Metrics__Group__3
            {
            pushFollow(FOLLOW_rule__Metrics__Group__2__Impl_in_rule__Metrics__Group__29787);
            rule__Metrics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metrics__Group__3_in_rule__Metrics__Group__29790);
            rule__Metrics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__2"


    // $ANTLR start "rule__Metrics__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4814:1: rule__Metrics__Group__2__Impl : ( 'relates' ) ;
    public final void rule__Metrics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4818:1: ( ( 'relates' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4819:1: ( 'relates' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4819:1: ( 'relates' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4820:1: 'relates'
            {
             before(grammarAccess.getMetricsAccess().getRelatesKeyword_2()); 
            match(input,81,FOLLOW_81_in_rule__Metrics__Group__2__Impl9818); 
             after(grammarAccess.getMetricsAccess().getRelatesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__2__Impl"


    // $ANTLR start "rule__Metrics__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4833:1: rule__Metrics__Group__3 : rule__Metrics__Group__3__Impl rule__Metrics__Group__4 ;
    public final void rule__Metrics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4837:1: ( rule__Metrics__Group__3__Impl rule__Metrics__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4838:2: rule__Metrics__Group__3__Impl rule__Metrics__Group__4
            {
            pushFollow(FOLLOW_rule__Metrics__Group__3__Impl_in_rule__Metrics__Group__39849);
            rule__Metrics__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metrics__Group__4_in_rule__Metrics__Group__39852);
            rule__Metrics__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__3"


    // $ANTLR start "rule__Metrics__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4845:1: rule__Metrics__Group__3__Impl : ( ( rule__Metrics__RelatesToAssignment_3 ) ) ;
    public final void rule__Metrics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4849:1: ( ( ( rule__Metrics__RelatesToAssignment_3 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4850:1: ( ( rule__Metrics__RelatesToAssignment_3 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4850:1: ( ( rule__Metrics__RelatesToAssignment_3 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4851:1: ( rule__Metrics__RelatesToAssignment_3 )
            {
             before(grammarAccess.getMetricsAccess().getRelatesToAssignment_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4852:1: ( rule__Metrics__RelatesToAssignment_3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4852:2: rule__Metrics__RelatesToAssignment_3
            {
            pushFollow(FOLLOW_rule__Metrics__RelatesToAssignment_3_in_rule__Metrics__Group__3__Impl9879);
            rule__Metrics__RelatesToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getRelatesToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__3__Impl"


    // $ANTLR start "rule__Metrics__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4862:1: rule__Metrics__Group__4 : rule__Metrics__Group__4__Impl rule__Metrics__Group__5 ;
    public final void rule__Metrics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4866:1: ( rule__Metrics__Group__4__Impl rule__Metrics__Group__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4867:2: rule__Metrics__Group__4__Impl rule__Metrics__Group__5
            {
            pushFollow(FOLLOW_rule__Metrics__Group__4__Impl_in_rule__Metrics__Group__49909);
            rule__Metrics__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metrics__Group__5_in_rule__Metrics__Group__49912);
            rule__Metrics__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__4"


    // $ANTLR start "rule__Metrics__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4874:1: rule__Metrics__Group__4__Impl : ( '{' ) ;
    public final void rule__Metrics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4878:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4879:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4879:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4880:1: '{'
            {
             before(grammarAccess.getMetricsAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,59,FOLLOW_59_in_rule__Metrics__Group__4__Impl9940); 
             after(grammarAccess.getMetricsAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__4__Impl"


    // $ANTLR start "rule__Metrics__Group__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4893:1: rule__Metrics__Group__5 : rule__Metrics__Group__5__Impl rule__Metrics__Group__6 ;
    public final void rule__Metrics__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4897:1: ( rule__Metrics__Group__5__Impl rule__Metrics__Group__6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4898:2: rule__Metrics__Group__5__Impl rule__Metrics__Group__6
            {
            pushFollow(FOLLOW_rule__Metrics__Group__5__Impl_in_rule__Metrics__Group__59971);
            rule__Metrics__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metrics__Group__6_in_rule__Metrics__Group__59974);
            rule__Metrics__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__5"


    // $ANTLR start "rule__Metrics__Group__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4905:1: rule__Metrics__Group__5__Impl : ( ( rule__Metrics__Group_5__0 ) ) ;
    public final void rule__Metrics__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4909:1: ( ( ( rule__Metrics__Group_5__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4910:1: ( ( rule__Metrics__Group_5__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4910:1: ( ( rule__Metrics__Group_5__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4911:1: ( rule__Metrics__Group_5__0 )
            {
             before(grammarAccess.getMetricsAccess().getGroup_5()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4912:1: ( rule__Metrics__Group_5__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4912:2: rule__Metrics__Group_5__0
            {
            pushFollow(FOLLOW_rule__Metrics__Group_5__0_in_rule__Metrics__Group__5__Impl10001);
            rule__Metrics__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__5__Impl"


    // $ANTLR start "rule__Metrics__Group__6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4922:1: rule__Metrics__Group__6 : rule__Metrics__Group__6__Impl rule__Metrics__Group__7 ;
    public final void rule__Metrics__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4926:1: ( rule__Metrics__Group__6__Impl rule__Metrics__Group__7 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4927:2: rule__Metrics__Group__6__Impl rule__Metrics__Group__7
            {
            pushFollow(FOLLOW_rule__Metrics__Group__6__Impl_in_rule__Metrics__Group__610031);
            rule__Metrics__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metrics__Group__7_in_rule__Metrics__Group__610034);
            rule__Metrics__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__6"


    // $ANTLR start "rule__Metrics__Group__6__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4934:1: rule__Metrics__Group__6__Impl : ( ( rule__Metrics__DetailAssignment_6 ) ) ;
    public final void rule__Metrics__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4938:1: ( ( ( rule__Metrics__DetailAssignment_6 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4939:1: ( ( rule__Metrics__DetailAssignment_6 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4939:1: ( ( rule__Metrics__DetailAssignment_6 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4940:1: ( rule__Metrics__DetailAssignment_6 )
            {
             before(grammarAccess.getMetricsAccess().getDetailAssignment_6()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4941:1: ( rule__Metrics__DetailAssignment_6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4941:2: rule__Metrics__DetailAssignment_6
            {
            pushFollow(FOLLOW_rule__Metrics__DetailAssignment_6_in_rule__Metrics__Group__6__Impl10061);
            rule__Metrics__DetailAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getDetailAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__6__Impl"


    // $ANTLR start "rule__Metrics__Group__7"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4951:1: rule__Metrics__Group__7 : rule__Metrics__Group__7__Impl ;
    public final void rule__Metrics__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4955:1: ( rule__Metrics__Group__7__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4956:2: rule__Metrics__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Metrics__Group__7__Impl_in_rule__Metrics__Group__710091);
            rule__Metrics__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__7"


    // $ANTLR start "rule__Metrics__Group__7__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4962:1: rule__Metrics__Group__7__Impl : ( '}' ) ;
    public final void rule__Metrics__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4966:1: ( ( '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4967:1: ( '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4967:1: ( '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4968:1: '}'
            {
             before(grammarAccess.getMetricsAccess().getRightCurlyBracketKeyword_7()); 
            match(input,60,FOLLOW_60_in_rule__Metrics__Group__7__Impl10119); 
             after(grammarAccess.getMetricsAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__7__Impl"


    // $ANTLR start "rule__Metrics__Group_5__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:4997:1: rule__Metrics__Group_5__0 : rule__Metrics__Group_5__0__Impl rule__Metrics__Group_5__1 ;
    public final void rule__Metrics__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5001:1: ( rule__Metrics__Group_5__0__Impl rule__Metrics__Group_5__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5002:2: rule__Metrics__Group_5__0__Impl rule__Metrics__Group_5__1
            {
            pushFollow(FOLLOW_rule__Metrics__Group_5__0__Impl_in_rule__Metrics__Group_5__010166);
            rule__Metrics__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metrics__Group_5__1_in_rule__Metrics__Group_5__010169);
            rule__Metrics__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group_5__0"


    // $ANTLR start "rule__Metrics__Group_5__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5009:1: rule__Metrics__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Metrics__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5013:1: ( ( 'description' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5014:1: ( 'description' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5014:1: ( 'description' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5015:1: 'description'
            {
             before(grammarAccess.getMetricsAccess().getDescriptionKeyword_5_0()); 
            match(input,75,FOLLOW_75_in_rule__Metrics__Group_5__0__Impl10197); 
             after(grammarAccess.getMetricsAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group_5__0__Impl"


    // $ANTLR start "rule__Metrics__Group_5__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5028:1: rule__Metrics__Group_5__1 : rule__Metrics__Group_5__1__Impl ;
    public final void rule__Metrics__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5032:1: ( rule__Metrics__Group_5__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5033:2: rule__Metrics__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Metrics__Group_5__1__Impl_in_rule__Metrics__Group_5__110228);
            rule__Metrics__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group_5__1"


    // $ANTLR start "rule__Metrics__Group_5__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5039:1: rule__Metrics__Group_5__1__Impl : ( ( rule__Metrics__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Metrics__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5043:1: ( ( ( rule__Metrics__DescriptionAssignment_5_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5044:1: ( ( rule__Metrics__DescriptionAssignment_5_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5044:1: ( ( rule__Metrics__DescriptionAssignment_5_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5045:1: ( rule__Metrics__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getMetricsAccess().getDescriptionAssignment_5_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5046:1: ( rule__Metrics__DescriptionAssignment_5_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5046:2: rule__Metrics__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Metrics__DescriptionAssignment_5_1_in_rule__Metrics__Group_5__1__Impl10255);
            rule__Metrics__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group_5__1__Impl"


    // $ANTLR start "rule__TaskMetric__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5060:1: rule__TaskMetric__Group__0 : rule__TaskMetric__Group__0__Impl rule__TaskMetric__Group__1 ;
    public final void rule__TaskMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5064:1: ( rule__TaskMetric__Group__0__Impl rule__TaskMetric__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5065:2: rule__TaskMetric__Group__0__Impl rule__TaskMetric__Group__1
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group__0__Impl_in_rule__TaskMetric__Group__010289);
            rule__TaskMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskMetric__Group__1_in_rule__TaskMetric__Group__010292);
            rule__TaskMetric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group__0"


    // $ANTLR start "rule__TaskMetric__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5072:1: rule__TaskMetric__Group__0__Impl : ( () ) ;
    public final void rule__TaskMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5076:1: ( ( () ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5077:1: ( () )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5077:1: ( () )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5078:1: ()
            {
             before(grammarAccess.getTaskMetricAccess().getTaskMetricAction_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5079:1: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5081:1: 
            {
            }

             after(grammarAccess.getTaskMetricAccess().getTaskMetricAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group__0__Impl"


    // $ANTLR start "rule__TaskMetric__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5091:1: rule__TaskMetric__Group__1 : rule__TaskMetric__Group__1__Impl rule__TaskMetric__Group__2 ;
    public final void rule__TaskMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5095:1: ( rule__TaskMetric__Group__1__Impl rule__TaskMetric__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5096:2: rule__TaskMetric__Group__1__Impl rule__TaskMetric__Group__2
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group__1__Impl_in_rule__TaskMetric__Group__110350);
            rule__TaskMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskMetric__Group__2_in_rule__TaskMetric__Group__110353);
            rule__TaskMetric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group__1"


    // $ANTLR start "rule__TaskMetric__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5103:1: rule__TaskMetric__Group__1__Impl : ( ( rule__TaskMetric__Group_1__0 ) ) ;
    public final void rule__TaskMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5107:1: ( ( ( rule__TaskMetric__Group_1__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5108:1: ( ( rule__TaskMetric__Group_1__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5108:1: ( ( rule__TaskMetric__Group_1__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5109:1: ( rule__TaskMetric__Group_1__0 )
            {
             before(grammarAccess.getTaskMetricAccess().getGroup_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5110:1: ( rule__TaskMetric__Group_1__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5110:2: rule__TaskMetric__Group_1__0
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group_1__0_in_rule__TaskMetric__Group__1__Impl10380);
            rule__TaskMetric__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskMetricAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group__1__Impl"


    // $ANTLR start "rule__TaskMetric__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5120:1: rule__TaskMetric__Group__2 : rule__TaskMetric__Group__2__Impl ;
    public final void rule__TaskMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5124:1: ( rule__TaskMetric__Group__2__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5125:2: rule__TaskMetric__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group__2__Impl_in_rule__TaskMetric__Group__210410);
            rule__TaskMetric__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group__2"


    // $ANTLR start "rule__TaskMetric__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5131:1: rule__TaskMetric__Group__2__Impl : ( ( rule__TaskMetric__Group_2__0 )? ) ;
    public final void rule__TaskMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5135:1: ( ( ( rule__TaskMetric__Group_2__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5136:1: ( ( rule__TaskMetric__Group_2__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5136:1: ( ( rule__TaskMetric__Group_2__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5137:1: ( rule__TaskMetric__Group_2__0 )?
            {
             before(grammarAccess.getTaskMetricAccess().getGroup_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5138:1: ( rule__TaskMetric__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==83) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5138:2: rule__TaskMetric__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TaskMetric__Group_2__0_in_rule__TaskMetric__Group__2__Impl10437);
                    rule__TaskMetric__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskMetricAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group__2__Impl"


    // $ANTLR start "rule__TaskMetric__Group_1__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5154:1: rule__TaskMetric__Group_1__0 : rule__TaskMetric__Group_1__0__Impl rule__TaskMetric__Group_1__1 ;
    public final void rule__TaskMetric__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5158:1: ( rule__TaskMetric__Group_1__0__Impl rule__TaskMetric__Group_1__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5159:2: rule__TaskMetric__Group_1__0__Impl rule__TaskMetric__Group_1__1
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group_1__0__Impl_in_rule__TaskMetric__Group_1__010474);
            rule__TaskMetric__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskMetric__Group_1__1_in_rule__TaskMetric__Group_1__010477);
            rule__TaskMetric__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group_1__0"


    // $ANTLR start "rule__TaskMetric__Group_1__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5166:1: rule__TaskMetric__Group_1__0__Impl : ( 'taskBegin' ) ;
    public final void rule__TaskMetric__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5170:1: ( ( 'taskBegin' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5171:1: ( 'taskBegin' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5171:1: ( 'taskBegin' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5172:1: 'taskBegin'
            {
             before(grammarAccess.getTaskMetricAccess().getTaskBeginKeyword_1_0()); 
            match(input,82,FOLLOW_82_in_rule__TaskMetric__Group_1__0__Impl10505); 
             after(grammarAccess.getTaskMetricAccess().getTaskBeginKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group_1__0__Impl"


    // $ANTLR start "rule__TaskMetric__Group_1__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5185:1: rule__TaskMetric__Group_1__1 : rule__TaskMetric__Group_1__1__Impl ;
    public final void rule__TaskMetric__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5189:1: ( rule__TaskMetric__Group_1__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5190:2: rule__TaskMetric__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group_1__1__Impl_in_rule__TaskMetric__Group_1__110536);
            rule__TaskMetric__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group_1__1"


    // $ANTLR start "rule__TaskMetric__Group_1__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5196:1: rule__TaskMetric__Group_1__1__Impl : ( ( rule__TaskMetric__TaskBeginAssignment_1_1 ) ) ;
    public final void rule__TaskMetric__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5200:1: ( ( ( rule__TaskMetric__TaskBeginAssignment_1_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5201:1: ( ( rule__TaskMetric__TaskBeginAssignment_1_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5201:1: ( ( rule__TaskMetric__TaskBeginAssignment_1_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5202:1: ( rule__TaskMetric__TaskBeginAssignment_1_1 )
            {
             before(grammarAccess.getTaskMetricAccess().getTaskBeginAssignment_1_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5203:1: ( rule__TaskMetric__TaskBeginAssignment_1_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5203:2: rule__TaskMetric__TaskBeginAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TaskMetric__TaskBeginAssignment_1_1_in_rule__TaskMetric__Group_1__1__Impl10563);
            rule__TaskMetric__TaskBeginAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskMetricAccess().getTaskBeginAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group_1__1__Impl"


    // $ANTLR start "rule__TaskMetric__Group_2__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5217:1: rule__TaskMetric__Group_2__0 : rule__TaskMetric__Group_2__0__Impl rule__TaskMetric__Group_2__1 ;
    public final void rule__TaskMetric__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5221:1: ( rule__TaskMetric__Group_2__0__Impl rule__TaskMetric__Group_2__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5222:2: rule__TaskMetric__Group_2__0__Impl rule__TaskMetric__Group_2__1
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group_2__0__Impl_in_rule__TaskMetric__Group_2__010597);
            rule__TaskMetric__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskMetric__Group_2__1_in_rule__TaskMetric__Group_2__010600);
            rule__TaskMetric__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group_2__0"


    // $ANTLR start "rule__TaskMetric__Group_2__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5229:1: rule__TaskMetric__Group_2__0__Impl : ( 'taskEnd' ) ;
    public final void rule__TaskMetric__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5233:1: ( ( 'taskEnd' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5234:1: ( 'taskEnd' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5234:1: ( 'taskEnd' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5235:1: 'taskEnd'
            {
             before(grammarAccess.getTaskMetricAccess().getTaskEndKeyword_2_0()); 
            match(input,83,FOLLOW_83_in_rule__TaskMetric__Group_2__0__Impl10628); 
             after(grammarAccess.getTaskMetricAccess().getTaskEndKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group_2__0__Impl"


    // $ANTLR start "rule__TaskMetric__Group_2__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5248:1: rule__TaskMetric__Group_2__1 : rule__TaskMetric__Group_2__1__Impl ;
    public final void rule__TaskMetric__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5252:1: ( rule__TaskMetric__Group_2__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5253:2: rule__TaskMetric__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TaskMetric__Group_2__1__Impl_in_rule__TaskMetric__Group_2__110659);
            rule__TaskMetric__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group_2__1"


    // $ANTLR start "rule__TaskMetric__Group_2__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5259:1: rule__TaskMetric__Group_2__1__Impl : ( ( rule__TaskMetric__TaskEndAssignment_2_1 ) ) ;
    public final void rule__TaskMetric__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5263:1: ( ( ( rule__TaskMetric__TaskEndAssignment_2_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5264:1: ( ( rule__TaskMetric__TaskEndAssignment_2_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5264:1: ( ( rule__TaskMetric__TaskEndAssignment_2_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5265:1: ( rule__TaskMetric__TaskEndAssignment_2_1 )
            {
             before(grammarAccess.getTaskMetricAccess().getTaskEndAssignment_2_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5266:1: ( rule__TaskMetric__TaskEndAssignment_2_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5266:2: rule__TaskMetric__TaskEndAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TaskMetric__TaskEndAssignment_2_1_in_rule__TaskMetric__Group_2__1__Impl10686);
            rule__TaskMetric__TaskEndAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskMetricAccess().getTaskEndAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__Group_2__1__Impl"


    // $ANTLR start "rule__DataMetric__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5280:1: rule__DataMetric__Group__0 : rule__DataMetric__Group__0__Impl rule__DataMetric__Group__1 ;
    public final void rule__DataMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5284:1: ( rule__DataMetric__Group__0__Impl rule__DataMetric__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5285:2: rule__DataMetric__Group__0__Impl rule__DataMetric__Group__1
            {
            pushFollow(FOLLOW_rule__DataMetric__Group__0__Impl_in_rule__DataMetric__Group__010720);
            rule__DataMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataMetric__Group__1_in_rule__DataMetric__Group__010723);
            rule__DataMetric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group__0"


    // $ANTLR start "rule__DataMetric__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5292:1: rule__DataMetric__Group__0__Impl : ( () ) ;
    public final void rule__DataMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5296:1: ( ( () ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5297:1: ( () )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5297:1: ( () )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5298:1: ()
            {
             before(grammarAccess.getDataMetricAccess().getDataMetricAction_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5299:1: ()
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5301:1: 
            {
            }

             after(grammarAccess.getDataMetricAccess().getDataMetricAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group__0__Impl"


    // $ANTLR start "rule__DataMetric__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5311:1: rule__DataMetric__Group__1 : rule__DataMetric__Group__1__Impl rule__DataMetric__Group__2 ;
    public final void rule__DataMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5315:1: ( rule__DataMetric__Group__1__Impl rule__DataMetric__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5316:2: rule__DataMetric__Group__1__Impl rule__DataMetric__Group__2
            {
            pushFollow(FOLLOW_rule__DataMetric__Group__1__Impl_in_rule__DataMetric__Group__110781);
            rule__DataMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataMetric__Group__2_in_rule__DataMetric__Group__110784);
            rule__DataMetric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group__1"


    // $ANTLR start "rule__DataMetric__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5323:1: rule__DataMetric__Group__1__Impl : ( ( rule__DataMetric__Group_1__0 )? ) ;
    public final void rule__DataMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5327:1: ( ( ( rule__DataMetric__Group_1__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5328:1: ( ( rule__DataMetric__Group_1__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5328:1: ( ( rule__DataMetric__Group_1__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5329:1: ( rule__DataMetric__Group_1__0 )?
            {
             before(grammarAccess.getDataMetricAccess().getGroup_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5330:1: ( rule__DataMetric__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==84) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5330:2: rule__DataMetric__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DataMetric__Group_1__0_in_rule__DataMetric__Group__1__Impl10811);
                    rule__DataMetric__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataMetricAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group__1__Impl"


    // $ANTLR start "rule__DataMetric__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5340:1: rule__DataMetric__Group__2 : rule__DataMetric__Group__2__Impl rule__DataMetric__Group__3 ;
    public final void rule__DataMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5344:1: ( rule__DataMetric__Group__2__Impl rule__DataMetric__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5345:2: rule__DataMetric__Group__2__Impl rule__DataMetric__Group__3
            {
            pushFollow(FOLLOW_rule__DataMetric__Group__2__Impl_in_rule__DataMetric__Group__210842);
            rule__DataMetric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataMetric__Group__3_in_rule__DataMetric__Group__210845);
            rule__DataMetric__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group__2"


    // $ANTLR start "rule__DataMetric__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5352:1: rule__DataMetric__Group__2__Impl : ( ( rule__DataMetric__Group_2__0 )? ) ;
    public final void rule__DataMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5356:1: ( ( ( rule__DataMetric__Group_2__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5357:1: ( ( rule__DataMetric__Group_2__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5357:1: ( ( rule__DataMetric__Group_2__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5358:1: ( rule__DataMetric__Group_2__0 )?
            {
             before(grammarAccess.getDataMetricAccess().getGroup_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5359:1: ( rule__DataMetric__Group_2__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==85) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5359:2: rule__DataMetric__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DataMetric__Group_2__0_in_rule__DataMetric__Group__2__Impl10872);
                    rule__DataMetric__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataMetricAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group__2__Impl"


    // $ANTLR start "rule__DataMetric__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5369:1: rule__DataMetric__Group__3 : rule__DataMetric__Group__3__Impl ;
    public final void rule__DataMetric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5373:1: ( rule__DataMetric__Group__3__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5374:2: rule__DataMetric__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DataMetric__Group__3__Impl_in_rule__DataMetric__Group__310903);
            rule__DataMetric__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group__3"


    // $ANTLR start "rule__DataMetric__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5380:1: rule__DataMetric__Group__3__Impl : ( ( rule__DataMetric__Group_3__0 )? ) ;
    public final void rule__DataMetric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5384:1: ( ( ( rule__DataMetric__Group_3__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5385:1: ( ( rule__DataMetric__Group_3__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5385:1: ( ( rule__DataMetric__Group_3__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5386:1: ( rule__DataMetric__Group_3__0 )?
            {
             before(grammarAccess.getDataMetricAccess().getGroup_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5387:1: ( rule__DataMetric__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==78) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5387:2: rule__DataMetric__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DataMetric__Group_3__0_in_rule__DataMetric__Group__3__Impl10930);
                    rule__DataMetric__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataMetricAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group__3__Impl"


    // $ANTLR start "rule__DataMetric__Group_1__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5405:1: rule__DataMetric__Group_1__0 : rule__DataMetric__Group_1__0__Impl rule__DataMetric__Group_1__1 ;
    public final void rule__DataMetric__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5409:1: ( rule__DataMetric__Group_1__0__Impl rule__DataMetric__Group_1__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5410:2: rule__DataMetric__Group_1__0__Impl rule__DataMetric__Group_1__1
            {
            pushFollow(FOLLOW_rule__DataMetric__Group_1__0__Impl_in_rule__DataMetric__Group_1__010969);
            rule__DataMetric__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataMetric__Group_1__1_in_rule__DataMetric__Group_1__010972);
            rule__DataMetric__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_1__0"


    // $ANTLR start "rule__DataMetric__Group_1__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5417:1: rule__DataMetric__Group_1__0__Impl : ( 'collectedData' ) ;
    public final void rule__DataMetric__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5421:1: ( ( 'collectedData' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5422:1: ( 'collectedData' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5422:1: ( 'collectedData' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5423:1: 'collectedData'
            {
             before(grammarAccess.getDataMetricAccess().getCollectedDataKeyword_1_0()); 
            match(input,84,FOLLOW_84_in_rule__DataMetric__Group_1__0__Impl11000); 
             after(grammarAccess.getDataMetricAccess().getCollectedDataKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_1__0__Impl"


    // $ANTLR start "rule__DataMetric__Group_1__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5436:1: rule__DataMetric__Group_1__1 : rule__DataMetric__Group_1__1__Impl rule__DataMetric__Group_1__2 ;
    public final void rule__DataMetric__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5440:1: ( rule__DataMetric__Group_1__1__Impl rule__DataMetric__Group_1__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5441:2: rule__DataMetric__Group_1__1__Impl rule__DataMetric__Group_1__2
            {
            pushFollow(FOLLOW_rule__DataMetric__Group_1__1__Impl_in_rule__DataMetric__Group_1__111031);
            rule__DataMetric__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataMetric__Group_1__2_in_rule__DataMetric__Group_1__111034);
            rule__DataMetric__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_1__1"


    // $ANTLR start "rule__DataMetric__Group_1__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5448:1: rule__DataMetric__Group_1__1__Impl : ( ( rule__DataMetric__CollectedDataAssignment_1_1 )* ) ;
    public final void rule__DataMetric__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5452:1: ( ( ( rule__DataMetric__CollectedDataAssignment_1_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5453:1: ( ( rule__DataMetric__CollectedDataAssignment_1_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5453:1: ( ( rule__DataMetric__CollectedDataAssignment_1_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5454:1: ( rule__DataMetric__CollectedDataAssignment_1_1 )*
            {
             before(grammarAccess.getDataMetricAccess().getCollectedDataAssignment_1_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5455:1: ( rule__DataMetric__CollectedDataAssignment_1_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5455:2: rule__DataMetric__CollectedDataAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__DataMetric__CollectedDataAssignment_1_1_in_rule__DataMetric__Group_1__1__Impl11061);
            	    rule__DataMetric__CollectedDataAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getDataMetricAccess().getCollectedDataAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_1__1__Impl"


    // $ANTLR start "rule__DataMetric__Group_1__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5465:1: rule__DataMetric__Group_1__2 : rule__DataMetric__Group_1__2__Impl rule__DataMetric__Group_1__3 ;
    public final void rule__DataMetric__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5469:1: ( rule__DataMetric__Group_1__2__Impl rule__DataMetric__Group_1__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5470:2: rule__DataMetric__Group_1__2__Impl rule__DataMetric__Group_1__3
            {
            pushFollow(FOLLOW_rule__DataMetric__Group_1__2__Impl_in_rule__DataMetric__Group_1__211092);
            rule__DataMetric__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataMetric__Group_1__3_in_rule__DataMetric__Group_1__211095);
            rule__DataMetric__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_1__2"


    // $ANTLR start "rule__DataMetric__Group_1__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5477:1: rule__DataMetric__Group_1__2__Impl : ( ':' ) ;
    public final void rule__DataMetric__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5481:1: ( ( ':' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5482:1: ( ':' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5482:1: ( ':' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5483:1: ':'
            {
             before(grammarAccess.getDataMetricAccess().getColonKeyword_1_2()); 
            match(input,64,FOLLOW_64_in_rule__DataMetric__Group_1__2__Impl11123); 
             after(grammarAccess.getDataMetricAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_1__2__Impl"


    // $ANTLR start "rule__DataMetric__Group_1__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5496:1: rule__DataMetric__Group_1__3 : rule__DataMetric__Group_1__3__Impl ;
    public final void rule__DataMetric__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5500:1: ( rule__DataMetric__Group_1__3__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5501:2: rule__DataMetric__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__DataMetric__Group_1__3__Impl_in_rule__DataMetric__Group_1__311154);
            rule__DataMetric__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_1__3"


    // $ANTLR start "rule__DataMetric__Group_1__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5507:1: rule__DataMetric__Group_1__3__Impl : ( ( rule__DataMetric__DataTypeAssignment_1_3 ) ) ;
    public final void rule__DataMetric__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5511:1: ( ( ( rule__DataMetric__DataTypeAssignment_1_3 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5512:1: ( ( rule__DataMetric__DataTypeAssignment_1_3 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5512:1: ( ( rule__DataMetric__DataTypeAssignment_1_3 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5513:1: ( rule__DataMetric__DataTypeAssignment_1_3 )
            {
             before(grammarAccess.getDataMetricAccess().getDataTypeAssignment_1_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5514:1: ( rule__DataMetric__DataTypeAssignment_1_3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5514:2: rule__DataMetric__DataTypeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__DataMetric__DataTypeAssignment_1_3_in_rule__DataMetric__Group_1__3__Impl11181);
            rule__DataMetric__DataTypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDataMetricAccess().getDataTypeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_1__3__Impl"


    // $ANTLR start "rule__DataMetric__Group_2__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5532:1: rule__DataMetric__Group_2__0 : rule__DataMetric__Group_2__0__Impl rule__DataMetric__Group_2__1 ;
    public final void rule__DataMetric__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5536:1: ( rule__DataMetric__Group_2__0__Impl rule__DataMetric__Group_2__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5537:2: rule__DataMetric__Group_2__0__Impl rule__DataMetric__Group_2__1
            {
            pushFollow(FOLLOW_rule__DataMetric__Group_2__0__Impl_in_rule__DataMetric__Group_2__011219);
            rule__DataMetric__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataMetric__Group_2__1_in_rule__DataMetric__Group_2__011222);
            rule__DataMetric__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_2__0"


    // $ANTLR start "rule__DataMetric__Group_2__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5544:1: rule__DataMetric__Group_2__0__Impl : ( 'artefact' ) ;
    public final void rule__DataMetric__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5548:1: ( ( 'artefact' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5549:1: ( 'artefact' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5549:1: ( 'artefact' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5550:1: 'artefact'
            {
             before(grammarAccess.getDataMetricAccess().getArtefactKeyword_2_0()); 
            match(input,85,FOLLOW_85_in_rule__DataMetric__Group_2__0__Impl11250); 
             after(grammarAccess.getDataMetricAccess().getArtefactKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_2__0__Impl"


    // $ANTLR start "rule__DataMetric__Group_2__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5563:1: rule__DataMetric__Group_2__1 : rule__DataMetric__Group_2__1__Impl ;
    public final void rule__DataMetric__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5567:1: ( rule__DataMetric__Group_2__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5568:2: rule__DataMetric__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DataMetric__Group_2__1__Impl_in_rule__DataMetric__Group_2__111281);
            rule__DataMetric__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_2__1"


    // $ANTLR start "rule__DataMetric__Group_2__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5574:1: rule__DataMetric__Group_2__1__Impl : ( ( rule__DataMetric__ArtefactsAssignment_2_1 )* ) ;
    public final void rule__DataMetric__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5578:1: ( ( ( rule__DataMetric__ArtefactsAssignment_2_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5579:1: ( ( rule__DataMetric__ArtefactsAssignment_2_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5579:1: ( ( rule__DataMetric__ArtefactsAssignment_2_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5580:1: ( rule__DataMetric__ArtefactsAssignment_2_1 )*
            {
             before(grammarAccess.getDataMetricAccess().getArtefactsAssignment_2_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5581:1: ( rule__DataMetric__ArtefactsAssignment_2_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5581:2: rule__DataMetric__ArtefactsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__DataMetric__ArtefactsAssignment_2_1_in_rule__DataMetric__Group_2__1__Impl11308);
            	    rule__DataMetric__ArtefactsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getDataMetricAccess().getArtefactsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_2__1__Impl"


    // $ANTLR start "rule__DataMetric__Group_3__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5595:1: rule__DataMetric__Group_3__0 : rule__DataMetric__Group_3__0__Impl rule__DataMetric__Group_3__1 ;
    public final void rule__DataMetric__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5599:1: ( rule__DataMetric__Group_3__0__Impl rule__DataMetric__Group_3__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5600:2: rule__DataMetric__Group_3__0__Impl rule__DataMetric__Group_3__1
            {
            pushFollow(FOLLOW_rule__DataMetric__Group_3__0__Impl_in_rule__DataMetric__Group_3__011343);
            rule__DataMetric__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataMetric__Group_3__1_in_rule__DataMetric__Group_3__011346);
            rule__DataMetric__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_3__0"


    // $ANTLR start "rule__DataMetric__Group_3__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5607:1: rule__DataMetric__Group_3__0__Impl : ( 'quest' ) ;
    public final void rule__DataMetric__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5611:1: ( ( 'quest' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5612:1: ( 'quest' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5612:1: ( 'quest' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5613:1: 'quest'
            {
             before(grammarAccess.getDataMetricAccess().getQuestKeyword_3_0()); 
            match(input,78,FOLLOW_78_in_rule__DataMetric__Group_3__0__Impl11374); 
             after(grammarAccess.getDataMetricAccess().getQuestKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_3__0__Impl"


    // $ANTLR start "rule__DataMetric__Group_3__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5626:1: rule__DataMetric__Group_3__1 : rule__DataMetric__Group_3__1__Impl ;
    public final void rule__DataMetric__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5630:1: ( rule__DataMetric__Group_3__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5631:2: rule__DataMetric__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DataMetric__Group_3__1__Impl_in_rule__DataMetric__Group_3__111405);
            rule__DataMetric__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_3__1"


    // $ANTLR start "rule__DataMetric__Group_3__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5637:1: rule__DataMetric__Group_3__1__Impl : ( ( rule__DataMetric__QuestionnairesAssignment_3_1 )* ) ;
    public final void rule__DataMetric__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5641:1: ( ( ( rule__DataMetric__QuestionnairesAssignment_3_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5642:1: ( ( rule__DataMetric__QuestionnairesAssignment_3_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5642:1: ( ( rule__DataMetric__QuestionnairesAssignment_3_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5643:1: ( rule__DataMetric__QuestionnairesAssignment_3_1 )*
            {
             before(grammarAccess.getDataMetricAccess().getQuestionnairesAssignment_3_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5644:1: ( rule__DataMetric__QuestionnairesAssignment_3_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5644:2: rule__DataMetric__QuestionnairesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__DataMetric__QuestionnairesAssignment_3_1_in_rule__DataMetric__Group_3__1__Impl11432);
            	    rule__DataMetric__QuestionnairesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getDataMetricAccess().getQuestionnairesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__Group_3__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5658:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5662:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5663:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__011467);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__011470);
            rule__Questionnaire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__0"


    // $ANTLR start "rule__Questionnaire__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5670:1: rule__Questionnaire__Group__0__Impl : ( 'Questionnaire' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5674:1: ( ( 'Questionnaire' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5675:1: ( 'Questionnaire' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5675:1: ( 'Questionnaire' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5676:1: 'Questionnaire'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,86,FOLLOW_86_in_rule__Questionnaire__Group__0__Impl11498); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5689:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5693:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5694:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__111529);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__111532);
            rule__Questionnaire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__1"


    // $ANTLR start "rule__Questionnaire__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5701:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NameAssignment_1 ) ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5705:1: ( ( ( rule__Questionnaire__NameAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5706:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5706:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5707:1: ( rule__Questionnaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5708:1: ( rule__Questionnaire__NameAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5708:2: rule__Questionnaire__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl11559);
            rule__Questionnaire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5718:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5722:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5723:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__211589);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__211592);
            rule__Questionnaire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__2"


    // $ANTLR start "rule__Questionnaire__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5730:1: rule__Questionnaire__Group__2__Impl : ( ( rule__Questionnaire__Group_2__0 )? ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5734:1: ( ( ( rule__Questionnaire__Group_2__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5735:1: ( ( rule__Questionnaire__Group_2__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5735:1: ( ( rule__Questionnaire__Group_2__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5736:1: ( rule__Questionnaire__Group_2__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5737:1: ( rule__Questionnaire__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==81) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5737:2: rule__Questionnaire__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Questionnaire__Group_2__0_in_rule__Questionnaire__Group__2__Impl11619);
                    rule__Questionnaire__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__2__Impl"


    // $ANTLR start "rule__Questionnaire__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5747:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5751:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5752:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__311650);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__311653);
            rule__Questionnaire__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__3"


    // $ANTLR start "rule__Questionnaire__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5759:1: rule__Questionnaire__Group__3__Impl : ( ( rule__Questionnaire__Group_3__0 )? ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5763:1: ( ( ( rule__Questionnaire__Group_3__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5764:1: ( ( rule__Questionnaire__Group_3__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5764:1: ( ( rule__Questionnaire__Group_3__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5765:1: ( rule__Questionnaire__Group_3__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5766:1: ( rule__Questionnaire__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==79) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5766:2: rule__Questionnaire__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Questionnaire__Group_3__0_in_rule__Questionnaire__Group__3__Impl11680);
                    rule__Questionnaire__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__3__Impl"


    // $ANTLR start "rule__Questionnaire__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5776:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5780:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5781:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__411711);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__411714);
            rule__Questionnaire__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__4"


    // $ANTLR start "rule__Questionnaire__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5788:1: rule__Questionnaire__Group__4__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5792:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5793:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5793:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5794:1: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,59,FOLLOW_59_in_rule__Questionnaire__Group__4__Impl11742); 
             after(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__4__Impl"


    // $ANTLR start "rule__Questionnaire__Group__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5807:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5811:1: ( rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5812:2: rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__511773);
            rule__Questionnaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__511776);
            rule__Questionnaire__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__5"


    // $ANTLR start "rule__Questionnaire__Group__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5819:1: rule__Questionnaire__Group__5__Impl : ( ( rule__Questionnaire__QuestionAssignment_5 )* ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5823:1: ( ( ( rule__Questionnaire__QuestionAssignment_5 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5824:1: ( ( rule__Questionnaire__QuestionAssignment_5 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5824:1: ( ( rule__Questionnaire__QuestionAssignment_5 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5825:1: ( rule__Questionnaire__QuestionAssignment_5 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_5()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5826:1: ( rule__Questionnaire__QuestionAssignment_5 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5826:2: rule__Questionnaire__QuestionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__QuestionAssignment_5_in_rule__Questionnaire__Group__5__Impl11803);
            	    rule__Questionnaire__QuestionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__5__Impl"


    // $ANTLR start "rule__Questionnaire__Group__6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5836:1: rule__Questionnaire__Group__6 : rule__Questionnaire__Group__6__Impl ;
    public final void rule__Questionnaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5840:1: ( rule__Questionnaire__Group__6__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5841:2: rule__Questionnaire__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__611834);
            rule__Questionnaire__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__6"


    // $ANTLR start "rule__Questionnaire__Group__6__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5847:1: rule__Questionnaire__Group__6__Impl : ( '};' ) ;
    public final void rule__Questionnaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5851:1: ( ( '};' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5852:1: ( '};' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5852:1: ( '};' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5853:1: '};'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketSemicolonKeyword_6()); 
            match(input,87,FOLLOW_87_in_rule__Questionnaire__Group__6__Impl11862); 
             after(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__6__Impl"


    // $ANTLR start "rule__Questionnaire__Group_2__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5880:1: rule__Questionnaire__Group_2__0 : rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1 ;
    public final void rule__Questionnaire__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5884:1: ( rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5885:2: rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group_2__0__Impl_in_rule__Questionnaire__Group_2__011907);
            rule__Questionnaire__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group_2__1_in_rule__Questionnaire__Group_2__011910);
            rule__Questionnaire__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_2__0"


    // $ANTLR start "rule__Questionnaire__Group_2__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5892:1: rule__Questionnaire__Group_2__0__Impl : ( 'relates' ) ;
    public final void rule__Questionnaire__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5896:1: ( ( 'relates' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5897:1: ( 'relates' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5897:1: ( 'relates' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5898:1: 'relates'
            {
             before(grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0()); 
            match(input,81,FOLLOW_81_in_rule__Questionnaire__Group_2__0__Impl11938); 
             after(grammarAccess.getQuestionnaireAccess().getRelatesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_2__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_2__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5911:1: rule__Questionnaire__Group_2__1 : rule__Questionnaire__Group_2__1__Impl ;
    public final void rule__Questionnaire__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5915:1: ( rule__Questionnaire__Group_2__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5916:2: rule__Questionnaire__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group_2__1__Impl_in_rule__Questionnaire__Group_2__111969);
            rule__Questionnaire__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_2__1"


    // $ANTLR start "rule__Questionnaire__Group_2__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5922:1: rule__Questionnaire__Group_2__1__Impl : ( ( rule__Questionnaire__RelatesToAssignment_2_1 )* ) ;
    public final void rule__Questionnaire__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5926:1: ( ( ( rule__Questionnaire__RelatesToAssignment_2_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5927:1: ( ( rule__Questionnaire__RelatesToAssignment_2_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5927:1: ( ( rule__Questionnaire__RelatesToAssignment_2_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5928:1: ( rule__Questionnaire__RelatesToAssignment_2_1 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getRelatesToAssignment_2_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5929:1: ( rule__Questionnaire__RelatesToAssignment_2_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5929:2: rule__Questionnaire__RelatesToAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__RelatesToAssignment_2_1_in_rule__Questionnaire__Group_2__1__Impl11996);
            	    rule__Questionnaire__RelatesToAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getRelatesToAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_2__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group_3__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5943:1: rule__Questionnaire__Group_3__0 : rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1 ;
    public final void rule__Questionnaire__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5947:1: ( rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5948:2: rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group_3__0__Impl_in_rule__Questionnaire__Group_3__012031);
            rule__Questionnaire__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group_3__1_in_rule__Questionnaire__Group_3__012034);
            rule__Questionnaire__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_3__0"


    // $ANTLR start "rule__Questionnaire__Group_3__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5955:1: rule__Questionnaire__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Questionnaire__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5959:1: ( ( 'type' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5960:1: ( 'type' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5960:1: ( 'type' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5961:1: 'type'
            {
             before(grammarAccess.getQuestionnaireAccess().getTypeKeyword_3_0()); 
            match(input,79,FOLLOW_79_in_rule__Questionnaire__Group_3__0__Impl12062); 
             after(grammarAccess.getQuestionnaireAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_3__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_3__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5974:1: rule__Questionnaire__Group_3__1 : rule__Questionnaire__Group_3__1__Impl ;
    public final void rule__Questionnaire__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5978:1: ( rule__Questionnaire__Group_3__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5979:2: rule__Questionnaire__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group_3__1__Impl_in_rule__Questionnaire__Group_3__112093);
            rule__Questionnaire__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_3__1"


    // $ANTLR start "rule__Questionnaire__Group_3__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5985:1: rule__Questionnaire__Group_3__1__Impl : ( ( rule__Questionnaire__QuestionnaireTypeAssignment_3_1 ) ) ;
    public final void rule__Questionnaire__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5989:1: ( ( ( rule__Questionnaire__QuestionnaireTypeAssignment_3_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5990:1: ( ( rule__Questionnaire__QuestionnaireTypeAssignment_3_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5990:1: ( ( rule__Questionnaire__QuestionnaireTypeAssignment_3_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5991:1: ( rule__Questionnaire__QuestionnaireTypeAssignment_3_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeAssignment_3_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5992:1: ( rule__Questionnaire__QuestionnaireTypeAssignment_3_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:5992:2: rule__Questionnaire__QuestionnaireTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__QuestionnaireTypeAssignment_3_1_in_rule__Questionnaire__Group_3__1__Impl12120);
            rule__Questionnaire__QuestionnaireTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_3__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6006:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6010:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6011:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__012154);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__012157);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6018:1: rule__Question__Group__0__Impl : ( ( rule__Question__NameAssignment_0 ) ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6022:1: ( ( ( rule__Question__NameAssignment_0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6023:1: ( ( rule__Question__NameAssignment_0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6023:1: ( ( rule__Question__NameAssignment_0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6024:1: ( rule__Question__NameAssignment_0 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6025:1: ( rule__Question__NameAssignment_0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6025:2: rule__Question__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Question__NameAssignment_0_in_rule__Question__Group__0__Impl12184);
            rule__Question__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6035:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6039:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6040:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__112214);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__112217);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6047:1: rule__Question__Group__1__Impl : ( '{' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6051:1: ( ( '{' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6052:1: ( '{' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6052:1: ( '{' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6053:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__Question__Group__1__Impl12245); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6066:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6070:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6071:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__212276);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__212279);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6078:1: rule__Question__Group__2__Impl : ( ( rule__Question__Group_2__0 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6082:1: ( ( ( rule__Question__Group_2__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6083:1: ( ( rule__Question__Group_2__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6083:1: ( ( rule__Question__Group_2__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6084:1: ( rule__Question__Group_2__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup_2()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6085:1: ( rule__Question__Group_2__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6085:2: rule__Question__Group_2__0
            {
            pushFollow(FOLLOW_rule__Question__Group_2__0_in_rule__Question__Group__2__Impl12306);
            rule__Question__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6095:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6099:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6100:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__312336);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__312339);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6107:1: rule__Question__Group__3__Impl : ( ( rule__Question__Group_3__0 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6111:1: ( ( ( rule__Question__Group_3__0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6112:1: ( ( rule__Question__Group_3__0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6112:1: ( ( rule__Question__Group_3__0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6113:1: ( rule__Question__Group_3__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup_3()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6114:1: ( rule__Question__Group_3__0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6114:2: rule__Question__Group_3__0
            {
            pushFollow(FOLLOW_rule__Question__Group_3__0_in_rule__Question__Group__3__Impl12366);
            rule__Question__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6124:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6128:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6129:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__412396);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__412399);
            rule__Question__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6136:1: rule__Question__Group__4__Impl : ( ( rule__Question__Group_4__0 )? ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6140:1: ( ( ( rule__Question__Group_4__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6141:1: ( ( rule__Question__Group_4__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6141:1: ( ( rule__Question__Group_4__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6142:1: ( rule__Question__Group_4__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_4()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6143:1: ( rule__Question__Group_4__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==88) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6143:2: rule__Question__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_4__0_in_rule__Question__Group__4__Impl12426);
                    rule__Question__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6153:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6157:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6158:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__512457);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__6_in_rule__Question__Group__512460);
            rule__Question__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6165:1: rule__Question__Group__5__Impl : ( ( rule__Question__Group_5__0 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6169:1: ( ( ( rule__Question__Group_5__0 )? ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6170:1: ( ( rule__Question__Group_5__0 )? )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6170:1: ( ( rule__Question__Group_5__0 )? )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6171:1: ( rule__Question__Group_5__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_5()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6172:1: ( rule__Question__Group_5__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==89) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6172:2: rule__Question__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_5__0_in_rule__Question__Group__5__Impl12487);
                    rule__Question__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6182:1: rule__Question__Group__6 : rule__Question__Group__6__Impl ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6186:1: ( rule__Question__Group__6__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6187:2: rule__Question__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__612518);
            rule__Question__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6193:1: rule__Question__Group__6__Impl : ( '}' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6197:1: ( ( '}' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6198:1: ( '}' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6198:1: ( '}' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6199:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,60,FOLLOW_60_in_rule__Question__Group__6__Impl12546); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Question__Group_2__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6226:1: rule__Question__Group_2__0 : rule__Question__Group_2__0__Impl rule__Question__Group_2__1 ;
    public final void rule__Question__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6230:1: ( rule__Question__Group_2__0__Impl rule__Question__Group_2__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6231:2: rule__Question__Group_2__0__Impl rule__Question__Group_2__1
            {
            pushFollow(FOLLOW_rule__Question__Group_2__0__Impl_in_rule__Question__Group_2__012591);
            rule__Question__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2__1_in_rule__Question__Group_2__012594);
            rule__Question__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2__0"


    // $ANTLR start "rule__Question__Group_2__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6238:1: rule__Question__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__Question__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6242:1: ( ( 'description' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6243:1: ( 'description' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6243:1: ( 'description' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6244:1: 'description'
            {
             before(grammarAccess.getQuestionAccess().getDescriptionKeyword_2_0()); 
            match(input,75,FOLLOW_75_in_rule__Question__Group_2__0__Impl12622); 
             after(grammarAccess.getQuestionAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2__0__Impl"


    // $ANTLR start "rule__Question__Group_2__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6257:1: rule__Question__Group_2__1 : rule__Question__Group_2__1__Impl ;
    public final void rule__Question__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6261:1: ( rule__Question__Group_2__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6262:2: rule__Question__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_2__1__Impl_in_rule__Question__Group_2__112653);
            rule__Question__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2__1"


    // $ANTLR start "rule__Question__Group_2__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6268:1: rule__Question__Group_2__1__Impl : ( ( rule__Question__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Question__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6272:1: ( ( ( rule__Question__DescriptionAssignment_2_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6273:1: ( ( rule__Question__DescriptionAssignment_2_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6273:1: ( ( rule__Question__DescriptionAssignment_2_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6274:1: ( rule__Question__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getDescriptionAssignment_2_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6275:1: ( rule__Question__DescriptionAssignment_2_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6275:2: rule__Question__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Question__DescriptionAssignment_2_1_in_rule__Question__Group_2__1__Impl12680);
            rule__Question__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2__1__Impl"


    // $ANTLR start "rule__Question__Group_3__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6289:1: rule__Question__Group_3__0 : rule__Question__Group_3__0__Impl rule__Question__Group_3__1 ;
    public final void rule__Question__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6293:1: ( rule__Question__Group_3__0__Impl rule__Question__Group_3__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6294:2: rule__Question__Group_3__0__Impl rule__Question__Group_3__1
            {
            pushFollow(FOLLOW_rule__Question__Group_3__0__Impl_in_rule__Question__Group_3__012714);
            rule__Question__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_3__1_in_rule__Question__Group_3__012717);
            rule__Question__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3__0"


    // $ANTLR start "rule__Question__Group_3__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6301:1: rule__Question__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Question__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6305:1: ( ( 'type' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6306:1: ( 'type' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6306:1: ( 'type' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6307:1: 'type'
            {
             before(grammarAccess.getQuestionAccess().getTypeKeyword_3_0()); 
            match(input,79,FOLLOW_79_in_rule__Question__Group_3__0__Impl12745); 
             after(grammarAccess.getQuestionAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3__0__Impl"


    // $ANTLR start "rule__Question__Group_3__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6320:1: rule__Question__Group_3__1 : rule__Question__Group_3__1__Impl ;
    public final void rule__Question__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6324:1: ( rule__Question__Group_3__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6325:2: rule__Question__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_3__1__Impl_in_rule__Question__Group_3__112776);
            rule__Question__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3__1"


    // $ANTLR start "rule__Question__Group_3__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6331:1: rule__Question__Group_3__1__Impl : ( ( rule__Question__TypeAssignment_3_1 ) ) ;
    public final void rule__Question__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6335:1: ( ( ( rule__Question__TypeAssignment_3_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6336:1: ( ( rule__Question__TypeAssignment_3_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6336:1: ( ( rule__Question__TypeAssignment_3_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6337:1: ( rule__Question__TypeAssignment_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getTypeAssignment_3_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6338:1: ( rule__Question__TypeAssignment_3_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6338:2: rule__Question__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Question__TypeAssignment_3_1_in_rule__Question__Group_3__1__Impl12803);
            rule__Question__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3__1__Impl"


    // $ANTLR start "rule__Question__Group_4__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6352:1: rule__Question__Group_4__0 : rule__Question__Group_4__0__Impl rule__Question__Group_4__1 ;
    public final void rule__Question__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6356:1: ( rule__Question__Group_4__0__Impl rule__Question__Group_4__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6357:2: rule__Question__Group_4__0__Impl rule__Question__Group_4__1
            {
            pushFollow(FOLLOW_rule__Question__Group_4__0__Impl_in_rule__Question__Group_4__012837);
            rule__Question__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_4__1_in_rule__Question__Group_4__012840);
            rule__Question__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__0"


    // $ANTLR start "rule__Question__Group_4__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6364:1: rule__Question__Group_4__0__Impl : ( 'required' ) ;
    public final void rule__Question__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6368:1: ( ( 'required' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6369:1: ( 'required' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6369:1: ( 'required' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6370:1: 'required'
            {
             before(grammarAccess.getQuestionAccess().getRequiredKeyword_4_0()); 
            match(input,88,FOLLOW_88_in_rule__Question__Group_4__0__Impl12868); 
             after(grammarAccess.getQuestionAccess().getRequiredKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__0__Impl"


    // $ANTLR start "rule__Question__Group_4__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6383:1: rule__Question__Group_4__1 : rule__Question__Group_4__1__Impl ;
    public final void rule__Question__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6387:1: ( rule__Question__Group_4__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6388:2: rule__Question__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_4__1__Impl_in_rule__Question__Group_4__112899);
            rule__Question__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__1"


    // $ANTLR start "rule__Question__Group_4__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6394:1: rule__Question__Group_4__1__Impl : ( ( rule__Question__ReqAssignment_4_1 ) ) ;
    public final void rule__Question__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6398:1: ( ( ( rule__Question__ReqAssignment_4_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6399:1: ( ( rule__Question__ReqAssignment_4_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6399:1: ( ( rule__Question__ReqAssignment_4_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6400:1: ( rule__Question__ReqAssignment_4_1 )
            {
             before(grammarAccess.getQuestionAccess().getReqAssignment_4_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6401:1: ( rule__Question__ReqAssignment_4_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6401:2: rule__Question__ReqAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Question__ReqAssignment_4_1_in_rule__Question__Group_4__1__Impl12926);
            rule__Question__ReqAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReqAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__1__Impl"


    // $ANTLR start "rule__Question__Group_5__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6415:1: rule__Question__Group_5__0 : rule__Question__Group_5__0__Impl rule__Question__Group_5__1 ;
    public final void rule__Question__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6419:1: ( rule__Question__Group_5__0__Impl rule__Question__Group_5__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6420:2: rule__Question__Group_5__0__Impl rule__Question__Group_5__1
            {
            pushFollow(FOLLOW_rule__Question__Group_5__0__Impl_in_rule__Question__Group_5__012960);
            rule__Question__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_5__1_in_rule__Question__Group_5__012963);
            rule__Question__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_5__0"


    // $ANTLR start "rule__Question__Group_5__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6427:1: rule__Question__Group_5__0__Impl : ( 'Alternatives' ) ;
    public final void rule__Question__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6431:1: ( ( 'Alternatives' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6432:1: ( 'Alternatives' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6432:1: ( 'Alternatives' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6433:1: 'Alternatives'
            {
             before(grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0()); 
            match(input,89,FOLLOW_89_in_rule__Question__Group_5__0__Impl12991); 
             after(grammarAccess.getQuestionAccess().getAlternativesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_5__0__Impl"


    // $ANTLR start "rule__Question__Group_5__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6446:1: rule__Question__Group_5__1 : rule__Question__Group_5__1__Impl ;
    public final void rule__Question__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6450:1: ( rule__Question__Group_5__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6451:2: rule__Question__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_5__1__Impl_in_rule__Question__Group_5__113022);
            rule__Question__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_5__1"


    // $ANTLR start "rule__Question__Group_5__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6457:1: rule__Question__Group_5__1__Impl : ( ( rule__Question__AlternativesAssignment_5_1 )* ) ;
    public final void rule__Question__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6461:1: ( ( ( rule__Question__AlternativesAssignment_5_1 )* ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6462:1: ( ( rule__Question__AlternativesAssignment_5_1 )* )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6462:1: ( ( rule__Question__AlternativesAssignment_5_1 )* )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6463:1: ( rule__Question__AlternativesAssignment_5_1 )*
            {
             before(grammarAccess.getQuestionAccess().getAlternativesAssignment_5_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6464:1: ( rule__Question__AlternativesAssignment_5_1 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==90) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6464:2: rule__Question__AlternativesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Question__AlternativesAssignment_5_1_in_rule__Question__Group_5__1__Impl13049);
            	    rule__Question__AlternativesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getAlternativesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_5__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6478:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6482:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6483:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__013084);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__013087);
            rule__Alternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0"


    // $ANTLR start "rule__Alternatives__Group__0__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6490:1: rule__Alternatives__Group__0__Impl : ( 'Option' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6494:1: ( ( 'Option' ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6495:1: ( 'Option' )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6495:1: ( 'Option' )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6496:1: 'Option'
            {
             before(grammarAccess.getAlternativesAccess().getOptionKeyword_0()); 
            match(input,90,FOLLOW_90_in_rule__Alternatives__Group__0__Impl13115); 
             after(grammarAccess.getAlternativesAccess().getOptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0__Impl"


    // $ANTLR start "rule__Alternatives__Group__1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6509:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6513:1: ( rule__Alternatives__Group__1__Impl )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6514:2: rule__Alternatives__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__113146);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1"


    // $ANTLR start "rule__Alternatives__Group__1__Impl"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6520:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__DescriptionAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6524:1: ( ( ( rule__Alternatives__DescriptionAssignment_1 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6525:1: ( ( rule__Alternatives__DescriptionAssignment_1 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6525:1: ( ( rule__Alternatives__DescriptionAssignment_1 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6526:1: ( rule__Alternatives__DescriptionAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getDescriptionAssignment_1()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6527:1: ( rule__Alternatives__DescriptionAssignment_1 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6527:2: rule__Alternatives__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Alternatives__DescriptionAssignment_1_in_rule__Alternatives__Group__1__Impl13173);
            rule__Alternatives__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6542:1: rule__Model__ElementsAssignment : ( ruleExperimentElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6546:1: ( ( ruleExperimentElement ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6547:1: ( ruleExperimentElement )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6547:1: ( ruleExperimentElement )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6548:1: ruleExperimentElement
            {
             before(grammarAccess.getModelAccess().getElementsExperimentElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExperimentElement_in_rule__Model__ElementsAssignment13212);
            ruleExperimentElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsExperimentElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__ExperimentElement__NameAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6557:1: rule__ExperimentElement__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ExperimentElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6561:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6562:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6562:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6563:1: RULE_STRING
            {
             before(grammarAccess.getExperimentElementAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExperimentElement__NameAssignment_113243); 
             after(grammarAccess.getExperimentElementAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__NameAssignment_1"


    // $ANTLR start "rule__ExperimentElement__ExperimentsAssignment_2_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6572:1: rule__ExperimentElement__ExperimentsAssignment_2_1 : ( ruleExperimentalPlan ) ;
    public final void rule__ExperimentElement__ExperimentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6576:1: ( ( ruleExperimentalPlan ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6577:1: ( ruleExperimentalPlan )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6577:1: ( ruleExperimentalPlan )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6578:1: ruleExperimentalPlan
            {
             before(grammarAccess.getExperimentElementAccess().getExperimentsExperimentalPlanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleExperimentalPlan_in_rule__ExperimentElement__ExperimentsAssignment_2_113274);
            ruleExperimentalPlan();

            state._fsp--;

             after(grammarAccess.getExperimentElementAccess().getExperimentsExperimentalPlanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__ExperimentsAssignment_2_1"


    // $ANTLR start "rule__ExperimentElement__ProcessAssignment_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6587:1: rule__ExperimentElement__ProcessAssignment_3 : ( ruleProcess ) ;
    public final void rule__ExperimentElement__ProcessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6591:1: ( ( ruleProcess ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6592:1: ( ruleProcess )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6592:1: ( ruleProcess )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6593:1: ruleProcess
            {
             before(grammarAccess.getExperimentElementAccess().getProcessProcessParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProcess_in_rule__ExperimentElement__ProcessAssignment_313305);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getExperimentElementAccess().getProcessProcessParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__ProcessAssignment_3"


    // $ANTLR start "rule__ExperimentElement__MetricsAssignment_4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6602:1: rule__ExperimentElement__MetricsAssignment_4 : ( ruleMetrics ) ;
    public final void rule__ExperimentElement__MetricsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6606:1: ( ( ruleMetrics ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6607:1: ( ruleMetrics )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6607:1: ( ruleMetrics )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6608:1: ruleMetrics
            {
             before(grammarAccess.getExperimentElementAccess().getMetricsMetricsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMetrics_in_rule__ExperimentElement__MetricsAssignment_413336);
            ruleMetrics();

            state._fsp--;

             after(grammarAccess.getExperimentElementAccess().getMetricsMetricsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__MetricsAssignment_4"


    // $ANTLR start "rule__ExperimentElement__QuestionnaireAssignment_5_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6617:1: rule__ExperimentElement__QuestionnaireAssignment_5_1 : ( ruleQuestionnaire ) ;
    public final void rule__ExperimentElement__QuestionnaireAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6621:1: ( ( ruleQuestionnaire ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6622:1: ( ruleQuestionnaire )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6622:1: ( ruleQuestionnaire )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6623:1: ruleQuestionnaire
            {
             before(grammarAccess.getExperimentElementAccess().getQuestionnaireQuestionnaireParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_rule__ExperimentElement__QuestionnaireAssignment_5_113367);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getExperimentElementAccess().getQuestionnaireQuestionnaireParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentElement__QuestionnaireAssignment_5_1"


    // $ANTLR start "rule__ExperimentalPlan__GoalAssignment_2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6632:1: rule__ExperimentalPlan__GoalAssignment_2 : ( ruleGoal ) ;
    public final void rule__ExperimentalPlan__GoalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6636:1: ( ( ruleGoal ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6637:1: ( ruleGoal )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6637:1: ( ruleGoal )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6638:1: ruleGoal
            {
             before(grammarAccess.getExperimentalPlanAccess().getGoalGoalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGoal_in_rule__ExperimentalPlan__GoalAssignment_213398);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getExperimentalPlanAccess().getGoalGoalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__GoalAssignment_2"


    // $ANTLR start "rule__ExperimentalPlan__TypeAssignment_6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6647:1: rule__ExperimentalPlan__TypeAssignment_6 : ( ruleDesignType ) ;
    public final void rule__ExperimentalPlan__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6651:1: ( ( ruleDesignType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6652:1: ( ruleDesignType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6652:1: ( ruleDesignType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6653:1: ruleDesignType
            {
             before(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDesignType_in_rule__ExperimentalPlan__TypeAssignment_613429);
            ruleDesignType();

            state._fsp--;

             after(grammarAccess.getExperimentalPlanAccess().getTypeDesignTypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__TypeAssignment_6"


    // $ANTLR start "rule__ExperimentalPlan__ParameterAssignment_8"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6662:1: rule__ExperimentalPlan__ParameterAssignment_8 : ( ruleParameter ) ;
    public final void rule__ExperimentalPlan__ParameterAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6666:1: ( ( ruleParameter ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6667:1: ( ruleParameter )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6667:1: ( ruleParameter )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6668:1: ruleParameter
            {
             before(grammarAccess.getExperimentalPlanAccess().getParameterParameterParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ExperimentalPlan__ParameterAssignment_813460);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getExperimentalPlanAccess().getParameterParameterParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__ParameterAssignment_8"


    // $ANTLR start "rule__ExperimentalPlan__DependentVariableAssignment_9"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6677:1: rule__ExperimentalPlan__DependentVariableAssignment_9 : ( ruleDependentVariable ) ;
    public final void rule__ExperimentalPlan__DependentVariableAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6681:1: ( ( ruleDependentVariable ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6682:1: ( ruleDependentVariable )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6682:1: ( ruleDependentVariable )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6683:1: ruleDependentVariable
            {
             before(grammarAccess.getExperimentalPlanAccess().getDependentVariableDependentVariableParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleDependentVariable_in_rule__ExperimentalPlan__DependentVariableAssignment_913491);
            ruleDependentVariable();

            state._fsp--;

             after(grammarAccess.getExperimentalPlanAccess().getDependentVariableDependentVariableParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__DependentVariableAssignment_9"


    // $ANTLR start "rule__ExperimentalPlan__FactorAssignment_10"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6692:1: rule__ExperimentalPlan__FactorAssignment_10 : ( ruleFactor ) ;
    public final void rule__ExperimentalPlan__FactorAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6696:1: ( ( ruleFactor ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6697:1: ( ruleFactor )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6697:1: ( ruleFactor )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6698:1: ruleFactor
            {
             before(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleFactor_in_rule__ExperimentalPlan__FactorAssignment_1013522);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExperimentalPlanAccess().getFactorFactorParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__FactorAssignment_10"


    // $ANTLR start "rule__ExperimentalPlan__TohypothesesAssignment_12_0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6707:1: rule__ExperimentalPlan__TohypothesesAssignment_12_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ExperimentalPlan__TohypothesesAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6711:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6712:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6712:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6713:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getExperimentalPlanAccess().getTohypothesesHypothesesCrossReference_12_0_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6714:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6715:1: ruleQualifiedName
            {
             before(grammarAccess.getExperimentalPlanAccess().getTohypothesesHypothesesQualifiedNameParserRuleCall_12_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ExperimentalPlan__TohypothesesAssignment_12_013557);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getExperimentalPlanAccess().getTohypothesesHypothesesQualifiedNameParserRuleCall_12_0_0_1()); 

            }

             after(grammarAccess.getExperimentalPlanAccess().getTohypothesesHypothesesCrossReference_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__TohypothesesAssignment_12_0"


    // $ANTLR start "rule__ExperimentalPlan__TechniqueAssignment_12_2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6726:1: rule__ExperimentalPlan__TechniqueAssignment_12_2 : ( ruleAnalysisTechiqueType ) ;
    public final void rule__ExperimentalPlan__TechniqueAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6730:1: ( ( ruleAnalysisTechiqueType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6731:1: ( ruleAnalysisTechiqueType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6731:1: ( ruleAnalysisTechiqueType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6732:1: ruleAnalysisTechiqueType
            {
             before(grammarAccess.getExperimentalPlanAccess().getTechniqueAnalysisTechiqueTypeEnumRuleCall_12_2_0()); 
            pushFollow(FOLLOW_ruleAnalysisTechiqueType_in_rule__ExperimentalPlan__TechniqueAssignment_12_213592);
            ruleAnalysisTechiqueType();

            state._fsp--;

             after(grammarAccess.getExperimentalPlanAccess().getTechniqueAnalysisTechiqueTypeEnumRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__TechniqueAssignment_12_2"


    // $ANTLR start "rule__ExperimentalPlan__InternalReplicationAssignment_14"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6741:1: rule__ExperimentalPlan__InternalReplicationAssignment_14 : ( RULE_INT ) ;
    public final void rule__ExperimentalPlan__InternalReplicationAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6745:1: ( ( RULE_INT ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6746:1: ( RULE_INT )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6746:1: ( RULE_INT )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6747:1: RULE_INT
            {
             before(grammarAccess.getExperimentalPlanAccess().getInternalReplicationINTTerminalRuleCall_14_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ExperimentalPlan__InternalReplicationAssignment_1413623); 
             after(grammarAccess.getExperimentalPlanAccess().getInternalReplicationINTTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentalPlan__InternalReplicationAssignment_14"


    // $ANTLR start "rule__Goal__NameAssignment_0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6756:1: rule__Goal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6760:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6761:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6761:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6762:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_013654); 
             after(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__NameAssignment_0"


    // $ANTLR start "rule__Goal__DescriptionAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6771:1: rule__Goal__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Goal__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6775:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6776:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6776:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6777:1: RULE_STRING
            {
             before(grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Goal__DescriptionAssignment_113685); 
             after(grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__DescriptionAssignment_1"


    // $ANTLR start "rule__Goal__HypothesesAssignment_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6786:1: rule__Goal__HypothesesAssignment_3 : ( ruleHypotheses ) ;
    public final void rule__Goal__HypothesesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6790:1: ( ( ruleHypotheses ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6791:1: ( ruleHypotheses )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6791:1: ( ruleHypotheses )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6792:1: ruleHypotheses
            {
             before(grammarAccess.getGoalAccess().getHypothesesHypothesesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleHypotheses_in_rule__Goal__HypothesesAssignment_313716);
            ruleHypotheses();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getHypothesesHypothesesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__HypothesesAssignment_3"


    // $ANTLR start "rule__Hypotheses__NameAssignment_0_0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6801:1: rule__Hypotheses__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Hypotheses__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6805:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6806:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6806:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6807:1: RULE_ID
            {
             before(grammarAccess.getHypothesesAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Hypotheses__NameAssignment_0_013747); 
             after(grammarAccess.getHypothesesAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__NameAssignment_0_0"


    // $ANTLR start "rule__Hypotheses__DescriptionAssignment_0_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6816:1: rule__Hypotheses__DescriptionAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Hypotheses__DescriptionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6820:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6821:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6821:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6822:1: RULE_STRING
            {
             before(grammarAccess.getHypothesesAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Hypotheses__DescriptionAssignment_0_113778); 
             after(grammarAccess.getHypothesesAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__DescriptionAssignment_0_1"


    // $ANTLR start "rule__Hypotheses__TypeAssignment_0_2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6831:1: rule__Hypotheses__TypeAssignment_0_2 : ( ruleHypothesisType ) ;
    public final void rule__Hypotheses__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6835:1: ( ( ruleHypothesisType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6836:1: ( ruleHypothesisType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6836:1: ( ruleHypothesisType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6837:1: ruleHypothesisType
            {
             before(grammarAccess.getHypothesesAccess().getTypeHypothesisTypeEnumRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleHypothesisType_in_rule__Hypotheses__TypeAssignment_0_213809);
            ruleHypothesisType();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getTypeHypothesisTypeEnumRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__TypeAssignment_0_2"


    // $ANTLR start "rule__Hypotheses__DependentVariableAssignment_0_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6846:1: rule__Hypotheses__DependentVariableAssignment_0_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Hypotheses__DependentVariableAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6850:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6851:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6851:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6852:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_0_3_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6853:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6854:1: ruleQualifiedName
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableQualifiedNameParserRuleCall_0_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Hypotheses__DependentVariableAssignment_0_313844);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableQualifiedNameParserRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__DependentVariableAssignment_0_3"


    // $ANTLR start "rule__Hypotheses__LevelsAssignment_0_5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6865:1: rule__Hypotheses__LevelsAssignment_0_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Hypotheses__LevelsAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6869:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6870:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6870:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6871:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getHypothesesAccess().getLevelsLevelsCrossReference_0_5_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6872:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6873:1: ruleQualifiedName
            {
             before(grammarAccess.getHypothesesAccess().getLevelsLevelsQualifiedNameParserRuleCall_0_5_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Hypotheses__LevelsAssignment_0_513883);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getLevelsLevelsQualifiedNameParserRuleCall_0_5_0_1()); 

            }

             after(grammarAccess.getHypothesesAccess().getLevelsLevelsCrossReference_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__LevelsAssignment_0_5"


    // $ANTLR start "rule__Hypotheses__OperatorAssignment_0_7"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6884:1: rule__Hypotheses__OperatorAssignment_0_7 : ( ruleOperatorType ) ;
    public final void rule__Hypotheses__OperatorAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6888:1: ( ( ruleOperatorType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6889:1: ( ruleOperatorType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6889:1: ( ruleOperatorType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6890:1: ruleOperatorType
            {
             before(grammarAccess.getHypothesesAccess().getOperatorOperatorTypeEnumRuleCall_0_7_0()); 
            pushFollow(FOLLOW_ruleOperatorType_in_rule__Hypotheses__OperatorAssignment_0_713918);
            ruleOperatorType();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getOperatorOperatorTypeEnumRuleCall_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__OperatorAssignment_0_7"


    // $ANTLR start "rule__Hypotheses__DependentVariableAssignment_0_8"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6899:1: rule__Hypotheses__DependentVariableAssignment_0_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Hypotheses__DependentVariableAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6903:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6904:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6904:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6905:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_0_8_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6906:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6907:1: ruleQualifiedName
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableQualifiedNameParserRuleCall_0_8_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Hypotheses__DependentVariableAssignment_0_813953);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableQualifiedNameParserRuleCall_0_8_0_1()); 

            }

             after(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_0_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__DependentVariableAssignment_0_8"


    // $ANTLR start "rule__Hypotheses__LevelsAssignment_0_10"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6918:1: rule__Hypotheses__LevelsAssignment_0_10 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Hypotheses__LevelsAssignment_0_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6922:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6923:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6923:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6924:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getHypothesesAccess().getLevelsLevelsCrossReference_0_10_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6925:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6926:1: ruleQualifiedName
            {
             before(grammarAccess.getHypothesesAccess().getLevelsLevelsQualifiedNameParserRuleCall_0_10_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Hypotheses__LevelsAssignment_0_1013992);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getLevelsLevelsQualifiedNameParserRuleCall_0_10_0_1()); 

            }

             after(grammarAccess.getHypothesesAccess().getLevelsLevelsCrossReference_0_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__LevelsAssignment_0_10"


    // $ANTLR start "rule__Hypotheses__NameAssignment_1_0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6937:1: rule__Hypotheses__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Hypotheses__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6941:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6942:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6942:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6943:1: RULE_ID
            {
             before(grammarAccess.getHypothesesAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Hypotheses__NameAssignment_1_014027); 
             after(grammarAccess.getHypothesesAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__NameAssignment_1_0"


    // $ANTLR start "rule__Hypotheses__DependentVariableAssignment_1_2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6952:1: rule__Hypotheses__DependentVariableAssignment_1_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Hypotheses__DependentVariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6956:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6957:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6957:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6958:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_1_2_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6959:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6960:1: ruleQualifiedName
            {
             before(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableQualifiedNameParserRuleCall_1_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Hypotheses__DependentVariableAssignment_1_214062);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableQualifiedNameParserRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getHypothesesAccess().getDependentVariableDependentVariableCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__DependentVariableAssignment_1_2"


    // $ANTLR start "rule__Hypotheses__RelationAssignment_1_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6971:1: rule__Hypotheses__RelationAssignment_1_3 : ( ruleRelationType ) ;
    public final void rule__Hypotheses__RelationAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6975:1: ( ( ruleRelationType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6976:1: ( ruleRelationType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6976:1: ( ruleRelationType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6977:1: ruleRelationType
            {
             before(grammarAccess.getHypothesesAccess().getRelationRelationTypeEnumRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__Hypotheses__RelationAssignment_1_314097);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getRelationRelationTypeEnumRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__RelationAssignment_1_3"


    // $ANTLR start "rule__Hypotheses__FactorAssignment_1_4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6986:1: rule__Hypotheses__FactorAssignment_1_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Hypotheses__FactorAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6990:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6991:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6991:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6992:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getHypothesesAccess().getFactorFactorCrossReference_1_4_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6993:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:6994:1: ruleQualifiedName
            {
             before(grammarAccess.getHypothesesAccess().getFactorFactorQualifiedNameParserRuleCall_1_4_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Hypotheses__FactorAssignment_1_414132);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHypothesesAccess().getFactorFactorQualifiedNameParserRuleCall_1_4_0_1()); 

            }

             after(grammarAccess.getHypothesesAccess().getFactorFactorCrossReference_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypotheses__FactorAssignment_1_4"


    // $ANTLR start "rule__Parameter__VariableAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7005:1: rule__Parameter__VariableAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7009:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7010:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7010:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7011:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getVariableIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__VariableAssignment_114167); 
             after(grammarAccess.getParameterAccess().getVariableIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__VariableAssignment_1"


    // $ANTLR start "rule__Parameter__ValueAssignment_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7020:1: rule__Parameter__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Parameter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7024:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7025:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7025:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7026:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Parameter__ValueAssignment_314198); 
             after(grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_3"


    // $ANTLR start "rule__DependentVariable__NameAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7035:1: rule__DependentVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DependentVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7039:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7040:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7040:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7041:1: RULE_ID
            {
             before(grammarAccess.getDependentVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DependentVariable__NameAssignment_114229); 
             after(grammarAccess.getDependentVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__NameAssignment_1"


    // $ANTLR start "rule__DependentVariable__DescriptionAssignment_2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7050:1: rule__DependentVariable__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DependentVariable__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7054:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7055:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7055:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7056:1: RULE_STRING
            {
             before(grammarAccess.getDependentVariableAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DependentVariable__DescriptionAssignment_214260); 
             after(grammarAccess.getDependentVariableAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__DescriptionAssignment_2"


    // $ANTLR start "rule__DependentVariable__MetricsAssignment_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7065:1: rule__DependentVariable__MetricsAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DependentVariable__MetricsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7069:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7070:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7070:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7071:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDependentVariableAccess().getMetricsMetricsCrossReference_3_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7072:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7073:1: ruleQualifiedName
            {
             before(grammarAccess.getDependentVariableAccess().getMetricsMetricsQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DependentVariable__MetricsAssignment_314295);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependentVariableAccess().getMetricsMetricsQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDependentVariableAccess().getMetricsMetricsCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariable__MetricsAssignment_3"


    // $ANTLR start "rule__Factor__NameAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7084:1: rule__Factor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Factor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7088:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7089:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7089:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7090:1: RULE_ID
            {
             before(grammarAccess.getFactorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Factor__NameAssignment_114330); 
             after(grammarAccess.getFactorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NameAssignment_1"


    // $ANTLR start "rule__Factor__IsDesiredVariationAssignment_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7099:1: rule__Factor__IsDesiredVariationAssignment_3 : ( ( rule__Factor__IsDesiredVariationAlternatives_3_0 ) ) ;
    public final void rule__Factor__IsDesiredVariationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7103:1: ( ( ( rule__Factor__IsDesiredVariationAlternatives_3_0 ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7104:1: ( ( rule__Factor__IsDesiredVariationAlternatives_3_0 ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7104:1: ( ( rule__Factor__IsDesiredVariationAlternatives_3_0 ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7105:1: ( rule__Factor__IsDesiredVariationAlternatives_3_0 )
            {
             before(grammarAccess.getFactorAccess().getIsDesiredVariationAlternatives_3_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7106:1: ( rule__Factor__IsDesiredVariationAlternatives_3_0 )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7106:2: rule__Factor__IsDesiredVariationAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Factor__IsDesiredVariationAlternatives_3_0_in_rule__Factor__IsDesiredVariationAssignment_314361);
            rule__Factor__IsDesiredVariationAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getIsDesiredVariationAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__IsDesiredVariationAssignment_3"


    // $ANTLR start "rule__Factor__LevelAssignment_4_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7115:1: rule__Factor__LevelAssignment_4_1 : ( ruleLevels ) ;
    public final void rule__Factor__LevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7119:1: ( ( ruleLevels ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7120:1: ( ruleLevels )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7120:1: ( ruleLevels )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7121:1: ruleLevels
            {
             before(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleLevels_in_rule__Factor__LevelAssignment_4_114394);
            ruleLevels();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getLevelLevelsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__LevelAssignment_4_1"


    // $ANTLR start "rule__Levels__NameAssignment"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7130:1: rule__Levels__NameAssignment : ( RULE_ID ) ;
    public final void rule__Levels__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7134:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7135:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7135:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7136:1: RULE_ID
            {
             before(grammarAccess.getLevelsAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Levels__NameAssignment14425); 
             after(grammarAccess.getLevelsAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Levels__NameAssignment"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7145:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7149:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7150:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7150:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7151:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__NameAssignment_114456); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__TreatmentAssignment_2_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7160:1: rule__Process__TreatmentAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Process__TreatmentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7164:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7165:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7165:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7166:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getProcessAccess().getTreatmentLevelsCrossReference_2_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7167:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7168:1: ruleQualifiedName
            {
             before(grammarAccess.getProcessAccess().getTreatmentLevelsQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Process__TreatmentAssignment_2_114491);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getTreatmentLevelsQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getProcessAccess().getTreatmentLevelsCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__TreatmentAssignment_2_1"


    // $ANTLR start "rule__Process__RoleAssignment_4_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7179:1: rule__Process__RoleAssignment_4_1 : ( ruleRoleType ) ;
    public final void rule__Process__RoleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7183:1: ( ( ruleRoleType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7184:1: ( ruleRoleType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7184:1: ( ruleRoleType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7185:1: ruleRoleType
            {
             before(grammarAccess.getProcessAccess().getRoleRoleTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleRoleType_in_rule__Process__RoleAssignment_4_114526);
            ruleRoleType();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getRoleRoleTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__RoleAssignment_4_1"


    // $ANTLR start "rule__Process__TaskAssignment_5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7194:1: rule__Process__TaskAssignment_5 : ( ruleTask ) ;
    public final void rule__Process__TaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7198:1: ( ( ruleTask ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7199:1: ( ruleTask )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7199:1: ( ruleTask )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7200:1: ruleTask
            {
             before(grammarAccess.getProcessAccess().getTaskTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTask_in_rule__Process__TaskAssignment_514557);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getTaskTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__TaskAssignment_5"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7209:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7213:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7214:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7214:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7215:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_114588); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__DescriptionAssignment_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7224:1: rule__Task__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Task__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7228:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7229:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7229:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7230:1: RULE_STRING
            {
             before(grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Task__DescriptionAssignment_314619); 
             after(grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DescriptionAssignment_3"


    // $ANTLR start "rule__Task__NextAssignment_4_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7239:1: rule__Task__NextAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Task__NextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7243:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7244:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7244:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7245:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTaskAccess().getNextTaskCrossReference_4_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7246:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7247:1: ruleQualifiedName
            {
             before(grammarAccess.getTaskAccess().getNextTaskQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Task__NextAssignment_4_114654);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getNextTaskQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getNextTaskCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NextAssignment_4_1"


    // $ANTLR start "rule__Task__RoleAssignment_5_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7258:1: rule__Task__RoleAssignment_5_1 : ( ruleRoleType ) ;
    public final void rule__Task__RoleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7262:1: ( ( ruleRoleType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7263:1: ( ruleRoleType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7263:1: ( ruleRoleType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7264:1: ruleRoleType
            {
             before(grammarAccess.getTaskAccess().getRoleRoleTypeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleRoleType_in_rule__Task__RoleAssignment_5_114689);
            ruleRoleType();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getRoleRoleTypeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__RoleAssignment_5_1"


    // $ANTLR start "rule__Task__CollectDataAssignment_7_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7273:1: rule__Task__CollectDataAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Task__CollectDataAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7277:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7278:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7278:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7279:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTaskAccess().getCollectDataCollectedDataCrossReference_7_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7280:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7281:1: ruleQualifiedName
            {
             before(grammarAccess.getTaskAccess().getCollectDataCollectedDataQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Task__CollectDataAssignment_7_114724);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getCollectDataCollectedDataQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getCollectDataCollectedDataCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CollectDataAssignment_7_1"


    // $ANTLR start "rule__Task__ArtefactsAssignment_8_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7292:1: rule__Task__ArtefactsAssignment_8_1 : ( ruleArtefact ) ;
    public final void rule__Task__ArtefactsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7296:1: ( ( ruleArtefact ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7297:1: ( ruleArtefact )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7297:1: ( ruleArtefact )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7298:1: ruleArtefact
            {
             before(grammarAccess.getTaskAccess().getArtefactsArtefactParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleArtefact_in_rule__Task__ArtefactsAssignment_8_114759);
            ruleArtefact();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getArtefactsArtefactParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ArtefactsAssignment_8_1"


    // $ANTLR start "rule__Task__QuestionnaireAssignment_9_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7307:1: rule__Task__QuestionnaireAssignment_9_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Task__QuestionnaireAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7311:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7312:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7312:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7313:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTaskAccess().getQuestionnaireQuestionnaireCrossReference_9_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7314:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7315:1: ruleQualifiedName
            {
             before(grammarAccess.getTaskAccess().getQuestionnaireQuestionnaireQualifiedNameParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Task__QuestionnaireAssignment_9_114794);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getQuestionnaireQuestionnaireQualifiedNameParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getQuestionnaireQuestionnaireCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__QuestionnaireAssignment_9_1"


    // $ANTLR start "rule__Artefact__NameAssignment_0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7326:1: rule__Artefact__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Artefact__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7330:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7331:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7331:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7332:1: RULE_ID
            {
             before(grammarAccess.getArtefactAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Artefact__NameAssignment_014829); 
             after(grammarAccess.getArtefactAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__NameAssignment_0"


    // $ANTLR start "rule__Artefact__DescriptionAssignment_2"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7341:1: rule__Artefact__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Artefact__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7345:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7346:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7346:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7347:1: RULE_STRING
            {
             before(grammarAccess.getArtefactAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Artefact__DescriptionAssignment_214860); 
             after(grammarAccess.getArtefactAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__DescriptionAssignment_2"


    // $ANTLR start "rule__Artefact__TypeAssignment_4"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7356:1: rule__Artefact__TypeAssignment_4 : ( ruleArtefactType ) ;
    public final void rule__Artefact__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7360:1: ( ( ruleArtefactType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7361:1: ( ruleArtefactType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7361:1: ( ruleArtefactType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7362:1: ruleArtefactType
            {
             before(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArtefactType_in_rule__Artefact__TypeAssignment_414891);
            ruleArtefactType();

            state._fsp--;

             after(grammarAccess.getArtefactAccess().getTypeArtefactTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefact__TypeAssignment_4"


    // $ANTLR start "rule__Metrics__NameAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7371:1: rule__Metrics__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Metrics__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7375:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7376:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7376:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7377:1: RULE_ID
            {
             before(grammarAccess.getMetricsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metrics__NameAssignment_114922); 
             after(grammarAccess.getMetricsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__NameAssignment_1"


    // $ANTLR start "rule__Metrics__RelatesToAssignment_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7386:1: rule__Metrics__RelatesToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Metrics__RelatesToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7390:1: ( ( ( RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7391:1: ( ( RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7391:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7392:1: ( RULE_ID )
            {
             before(grammarAccess.getMetricsAccess().getRelatesToProcessCrossReference_3_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7393:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7394:1: RULE_ID
            {
             before(grammarAccess.getMetricsAccess().getRelatesToProcessIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metrics__RelatesToAssignment_314957); 
             after(grammarAccess.getMetricsAccess().getRelatesToProcessIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMetricsAccess().getRelatesToProcessCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__RelatesToAssignment_3"


    // $ANTLR start "rule__Metrics__DescriptionAssignment_5_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7405:1: rule__Metrics__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Metrics__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7409:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7410:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7410:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7411:1: RULE_STRING
            {
             before(grammarAccess.getMetricsAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Metrics__DescriptionAssignment_5_114992); 
             after(grammarAccess.getMetricsAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Metrics__DetailAssignment_6"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7420:1: rule__Metrics__DetailAssignment_6 : ( ruleDetail ) ;
    public final void rule__Metrics__DetailAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7424:1: ( ( ruleDetail ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7425:1: ( ruleDetail )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7425:1: ( ruleDetail )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7426:1: ruleDetail
            {
             before(grammarAccess.getMetricsAccess().getDetailDetailParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDetail_in_rule__Metrics__DetailAssignment_615023);
            ruleDetail();

            state._fsp--;

             after(grammarAccess.getMetricsAccess().getDetailDetailParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__DetailAssignment_6"


    // $ANTLR start "rule__TaskMetric__TaskBeginAssignment_1_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7435:1: rule__TaskMetric__TaskBeginAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TaskMetric__TaskBeginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7439:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7440:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7440:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7441:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTaskMetricAccess().getTaskBeginTaskCrossReference_1_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7442:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7443:1: ruleQualifiedName
            {
             before(grammarAccess.getTaskMetricAccess().getTaskBeginTaskQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TaskMetric__TaskBeginAssignment_1_115058);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTaskMetricAccess().getTaskBeginTaskQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTaskMetricAccess().getTaskBeginTaskCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__TaskBeginAssignment_1_1"


    // $ANTLR start "rule__TaskMetric__TaskEndAssignment_2_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7454:1: rule__TaskMetric__TaskEndAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TaskMetric__TaskEndAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7458:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7459:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7459:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7460:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTaskMetricAccess().getTaskEndTaskCrossReference_2_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7461:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7462:1: ruleQualifiedName
            {
             before(grammarAccess.getTaskMetricAccess().getTaskEndTaskQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TaskMetric__TaskEndAssignment_2_115097);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTaskMetricAccess().getTaskEndTaskQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTaskMetricAccess().getTaskEndTaskCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskMetric__TaskEndAssignment_2_1"


    // $ANTLR start "rule__DataMetric__CollectedDataAssignment_1_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7473:1: rule__DataMetric__CollectedDataAssignment_1_1 : ( ruleCollectedData ) ;
    public final void rule__DataMetric__CollectedDataAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7477:1: ( ( ruleCollectedData ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7478:1: ( ruleCollectedData )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7478:1: ( ruleCollectedData )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7479:1: ruleCollectedData
            {
             before(grammarAccess.getDataMetricAccess().getCollectedDataCollectedDataParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCollectedData_in_rule__DataMetric__CollectedDataAssignment_1_115132);
            ruleCollectedData();

            state._fsp--;

             after(grammarAccess.getDataMetricAccess().getCollectedDataCollectedDataParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__CollectedDataAssignment_1_1"


    // $ANTLR start "rule__DataMetric__DataTypeAssignment_1_3"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7488:1: rule__DataMetric__DataTypeAssignment_1_3 : ( ruleDataType ) ;
    public final void rule__DataMetric__DataTypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7492:1: ( ( ruleDataType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7493:1: ( ruleDataType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7493:1: ( ruleDataType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7494:1: ruleDataType
            {
             before(grammarAccess.getDataMetricAccess().getDataTypeDataTypeEnumRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__DataMetric__DataTypeAssignment_1_315163);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataMetricAccess().getDataTypeDataTypeEnumRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__DataTypeAssignment_1_3"


    // $ANTLR start "rule__DataMetric__ArtefactsAssignment_2_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7503:1: rule__DataMetric__ArtefactsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataMetric__ArtefactsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7507:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7508:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7508:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7509:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataMetricAccess().getArtefactsArtefactCrossReference_2_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7510:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7511:1: ruleQualifiedName
            {
             before(grammarAccess.getDataMetricAccess().getArtefactsArtefactQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DataMetric__ArtefactsAssignment_2_115198);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataMetricAccess().getArtefactsArtefactQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataMetricAccess().getArtefactsArtefactCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__ArtefactsAssignment_2_1"


    // $ANTLR start "rule__DataMetric__QuestionnairesAssignment_3_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7522:1: rule__DataMetric__QuestionnairesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataMetric__QuestionnairesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7526:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7527:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7527:1: ( ( ruleQualifiedName ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7528:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataMetricAccess().getQuestionnairesQuestionnaireCrossReference_3_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7529:1: ( ruleQualifiedName )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7530:1: ruleQualifiedName
            {
             before(grammarAccess.getDataMetricAccess().getQuestionnairesQuestionnaireQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DataMetric__QuestionnairesAssignment_3_115237);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataMetricAccess().getQuestionnairesQuestionnaireQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDataMetricAccess().getQuestionnairesQuestionnaireCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataMetric__QuestionnairesAssignment_3_1"


    // $ANTLR start "rule__CollectedData__NameAssignment"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7541:1: rule__CollectedData__NameAssignment : ( RULE_ID ) ;
    public final void rule__CollectedData__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7545:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7546:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7546:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7547:1: RULE_ID
            {
             before(grammarAccess.getCollectedDataAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectedData__NameAssignment15272); 
             after(grammarAccess.getCollectedDataAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectedData__NameAssignment"


    // $ANTLR start "rule__Questionnaire__NameAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7556:1: rule__Questionnaire__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Questionnaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7560:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7561:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7561:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7562:1: RULE_ID
            {
             before(grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Questionnaire__NameAssignment_115303); 
             after(grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__NameAssignment_1"


    // $ANTLR start "rule__Questionnaire__RelatesToAssignment_2_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7571:1: rule__Questionnaire__RelatesToAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Questionnaire__RelatesToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7575:1: ( ( ( RULE_ID ) ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7576:1: ( ( RULE_ID ) )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7576:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7577:1: ( RULE_ID )
            {
             before(grammarAccess.getQuestionnaireAccess().getRelatesToProcessCrossReference_2_1_0()); 
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7578:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7579:1: RULE_ID
            {
             before(grammarAccess.getQuestionnaireAccess().getRelatesToProcessIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Questionnaire__RelatesToAssignment_2_115338); 
             after(grammarAccess.getQuestionnaireAccess().getRelatesToProcessIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getQuestionnaireAccess().getRelatesToProcessCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__RelatesToAssignment_2_1"


    // $ANTLR start "rule__Questionnaire__QuestionnaireTypeAssignment_3_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7590:1: rule__Questionnaire__QuestionnaireTypeAssignment_3_1 : ( ruleQuestionnaireType ) ;
    public final void rule__Questionnaire__QuestionnaireTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7594:1: ( ( ruleQuestionnaireType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7595:1: ( ruleQuestionnaireType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7595:1: ( ruleQuestionnaireType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7596:1: ruleQuestionnaireType
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeQuestionnaireTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleQuestionnaireType_in_rule__Questionnaire__QuestionnaireTypeAssignment_3_115373);
            ruleQuestionnaireType();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireTypeQuestionnaireTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__QuestionnaireTypeAssignment_3_1"


    // $ANTLR start "rule__Questionnaire__QuestionAssignment_5"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7605:1: rule__Questionnaire__QuestionAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7609:1: ( ( ruleQuestion ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7610:1: ( ruleQuestion )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7610:1: ( ruleQuestion )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7611:1: ruleQuestion
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Questionnaire__QuestionAssignment_515404);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__QuestionAssignment_5"


    // $ANTLR start "rule__Question__NameAssignment_0"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7620:1: rule__Question__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Question__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7624:1: ( ( RULE_ID ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7625:1: ( RULE_ID )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7625:1: ( RULE_ID )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7626:1: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Question__NameAssignment_015435); 
             after(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__NameAssignment_0"


    // $ANTLR start "rule__Question__DescriptionAssignment_2_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7635:1: rule__Question__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Question__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7639:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7640:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7640:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7641:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Question__DescriptionAssignment_2_115466); 
             after(grammarAccess.getQuestionAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__DescriptionAssignment_2_1"


    // $ANTLR start "rule__Question__TypeAssignment_3_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7650:1: rule__Question__TypeAssignment_3_1 : ( ruleAnswerType ) ;
    public final void rule__Question__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7654:1: ( ( ruleAnswerType ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7655:1: ( ruleAnswerType )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7655:1: ( ruleAnswerType )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7656:1: ruleAnswerType
            {
             before(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnswerType_in_rule__Question__TypeAssignment_3_115497);
            ruleAnswerType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTypeAnswerTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TypeAssignment_3_1"


    // $ANTLR start "rule__Question__ReqAssignment_4_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7665:1: rule__Question__ReqAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Question__ReqAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7669:1: ( ( RULE_INT ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7670:1: ( RULE_INT )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7670:1: ( RULE_INT )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7671:1: RULE_INT
            {
             before(grammarAccess.getQuestionAccess().getReqINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Question__ReqAssignment_4_115528); 
             after(grammarAccess.getQuestionAccess().getReqINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ReqAssignment_4_1"


    // $ANTLR start "rule__Question__AlternativesAssignment_5_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7680:1: rule__Question__AlternativesAssignment_5_1 : ( ruleAlternatives ) ;
    public final void rule__Question__AlternativesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7684:1: ( ( ruleAlternatives ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7685:1: ( ruleAlternatives )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7685:1: ( ruleAlternatives )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7686:1: ruleAlternatives
            {
             before(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAlternatives_in_rule__Question__AlternativesAssignment_5_115559);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAlternativesAlternativesParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__AlternativesAssignment_5_1"


    // $ANTLR start "rule__Alternatives__DescriptionAssignment_1"
    // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7695:1: rule__Alternatives__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Alternatives__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7699:1: ( ( RULE_STRING ) )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7700:1: ( RULE_STRING )
            {
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7700:1: ( RULE_STRING )
            // ../br.ufrn.dimap.ase.dsl.expdslv2.ui/src-gen/br/ufrn/dimap/ase/dsl/ui/contentassist/antlr/internal/InternalExpDslv2.g:7701:1: RULE_STRING
            {
             before(grammarAccess.getAlternativesAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Alternatives__DescriptionAssignment_115590); 
             after(grammarAccess.getAlternativesAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__DescriptionAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_entryRuleExperimentElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__0_in_ruleExperimentElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_entryRuleExperimentalPlan242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentalPlan249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__0_in_ruleExperimentalPlan275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__0_in_ruleGoal335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypotheses_in_entryRuleHypotheses362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHypotheses369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Alternatives_in_ruleHypotheses395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependentVariable_in_entryRuleDependentVariable482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependentVariable489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependentVariable__Group__0_in_ruleDependentVariable515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0_in_ruleFactor575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevels_in_entryRuleLevels602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLevels609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Levels__NameAssignment_in_ruleLevels635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0_in_ruleProcess695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__0_in_ruleTask755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefact_in_entryRuleArtefact782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtefact789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artefact__Group__0_in_ruleArtefact815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetrics_in_entryRuleMetrics842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetrics849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__0_in_ruleMetrics875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetail_in_entryRuleDetail902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetail909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Detail__Alternatives_in_ruleDetail935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_entryRuleTaskMetric962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskMetric969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group__0_in_ruleTaskMetric995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataMetric_in_entryRuleDataMetric1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataMetric1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group__0_in_ruleDataMetric1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectedData_in_entryRuleCollectedData1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectedData1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectedData__NameAssignment_in_ruleCollectedData1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0_in_ruleAlternatives1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorType__Alternatives_in_ruleOperatorType1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HypothesisType__Alternatives_in_ruleHypothesisType1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DesignType__Alternatives_in_ruleDesignType1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnalysisTechiqueType__Alternatives_in_ruleAnalysisTechiqueType1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleType__Alternatives_in_ruleRoleType1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArtefactType__Alternatives_in_ruleArtefactType1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionnaireType__Alternatives_in_ruleQuestionnaireType1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__Alternatives_in_ruleAnswerType1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__0_in_rule__Hypotheses__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__0_in_rule__Hypotheses__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Factor__IsDesiredVariationAlternatives_3_01743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Factor__IsDesiredVariationAlternatives_3_01763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskMetric_in_rule__Detail__Alternatives1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataMetric_in_rule__Detail__Alternatives1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationType__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationType__Alternatives1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OperatorType__Alternatives1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OperatorType__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OperatorType__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__OperatorType__Alternatives1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__OperatorType__Alternatives1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__OperatorType__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HypothesisType__Alternatives2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HypothesisType__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DesignType__Alternatives2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DesignType__Alternatives2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DesignType__Alternatives2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DesignType__Alternatives2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AnalysisTechiqueType__Alternatives2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AnalysisTechiqueType__Alternatives2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AnalysisTechiqueType__Alternatives2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AnalysisTechiqueType__Alternatives2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AnalysisTechiqueType__Alternatives2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AnalysisTechiqueType__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AnalysisTechiqueType__Alternatives2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AnalysisTechiqueType__Alternatives2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AnalysisTechiqueType__Alternatives2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AnalysisTechiqueType__Alternatives2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AnalysisTechiqueType__Alternatives2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AnalysisTechiqueType__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RoleType__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__RoleType__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ArtefactType__Alternatives2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ArtefactType__Alternatives2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ArtefactType__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DataType__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__DataType__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__QuestionnaireType__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__QuestionnaireType__Alternatives2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AnswerType__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AnswerType__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__AnswerType__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__AnswerType__Alternatives2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__AnswerType__Alternatives2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__AnswerType__Alternatives2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__0__Impl_in_rule__ExperimentElement__Group__02855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__1_in_rule__ExperimentElement__Group__02858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ExperimentElement__Group__0__Impl2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__1__Impl_in_rule__ExperimentElement__Group__12917 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__2_in_rule__ExperimentElement__Group__12920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__NameAssignment_1_in_rule__ExperimentElement__Group__1__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__2__Impl_in_rule__ExperimentElement__Group__22977 = new BitSet(new long[]{0x0100000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__3_in_rule__ExperimentElement__Group__22980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group_2__0_in_rule__ExperimentElement__Group__2__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__3__Impl_in_rule__ExperimentElement__Group__33037 = new BitSet(new long[]{0x0100000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__4_in_rule__ExperimentElement__Group__33040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__ProcessAssignment_3_in_rule__ExperimentElement__Group__3__Impl3067 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__4__Impl_in_rule__ExperimentElement__Group__43098 = new BitSet(new long[]{0x0100000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__5_in_rule__ExperimentElement__Group__43101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__MetricsAssignment_4_in_rule__ExperimentElement__Group__4__Impl3128 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group__5__Impl_in_rule__ExperimentElement__Group__53159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group_5__0_in_rule__ExperimentElement__Group__5__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group_2__0__Impl_in_rule__ExperimentElement__Group_2__03229 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group_2__1_in_rule__ExperimentElement__Group_2__03232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ExperimentElement__Group_2__0__Impl3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group_2__1__Impl_in_rule__ExperimentElement__Group_2__13291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__ExperimentsAssignment_2_1_in_rule__ExperimentElement__Group_2__1__Impl3318 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group_5__0__Impl_in_rule__ExperimentElement__Group_5__03353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group_5__1_in_rule__ExperimentElement__Group_5__03356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ExperimentElement__Group_5__0__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__Group_5__1__Impl_in_rule__ExperimentElement__Group_5__13415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentElement__QuestionnaireAssignment_5_1_in_rule__ExperimentElement__Group_5__1__Impl3442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03477 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3563 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__QualifiedName__Group_1__0__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__0__Impl_in_rule__ExperimentalPlan__Group__03720 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__1_in_rule__ExperimentalPlan__Group__03723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__ExperimentalPlan__Group__0__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__1__Impl_in_rule__ExperimentalPlan__Group__13782 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__2_in_rule__ExperimentalPlan__Group__13785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ExperimentalPlan__Group__1__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__2__Impl_in_rule__ExperimentalPlan__Group__23844 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__3_in_rule__ExperimentalPlan__Group__23847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__GoalAssignment_2_in_rule__ExperimentalPlan__Group__2__Impl3874 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__3__Impl_in_rule__ExperimentalPlan__Group__33905 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__4_in_rule__ExperimentalPlan__Group__33908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ExperimentalPlan__Group__3__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__4__Impl_in_rule__ExperimentalPlan__Group__43967 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__5_in_rule__ExperimentalPlan__Group__43970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__ExperimentalPlan__Group__4__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__5__Impl_in_rule__ExperimentalPlan__Group__54029 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__6_in_rule__ExperimentalPlan__Group__54032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExperimentalPlan__Group__5__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__6__Impl_in_rule__ExperimentalPlan__Group__64091 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__7_in_rule__ExperimentalPlan__Group__64094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__TypeAssignment_6_in_rule__ExperimentalPlan__Group__6__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__7__Impl_in_rule__ExperimentalPlan__Group__74151 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__8_in_rule__ExperimentalPlan__Group__74154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ExperimentalPlan__Group__7__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__8__Impl_in_rule__ExperimentalPlan__Group__84213 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__9_in_rule__ExperimentalPlan__Group__84216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__ParameterAssignment_8_in_rule__ExperimentalPlan__Group__8__Impl4243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__9__Impl_in_rule__ExperimentalPlan__Group__94274 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__10_in_rule__ExperimentalPlan__Group__94277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__DependentVariableAssignment_9_in_rule__ExperimentalPlan__Group__9__Impl4304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__10__Impl_in_rule__ExperimentalPlan__Group__104335 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__11_in_rule__ExperimentalPlan__Group__104338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__FactorAssignment_10_in_rule__ExperimentalPlan__Group__10__Impl4365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__11__Impl_in_rule__ExperimentalPlan__Group__114396 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__12_in_rule__ExperimentalPlan__Group__114399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__ExperimentalPlan__Group__11__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__12__Impl_in_rule__ExperimentalPlan__Group__124458 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__13_in_rule__ExperimentalPlan__Group__124461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group_12__0_in_rule__ExperimentalPlan__Group__12__Impl4488 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__13__Impl_in_rule__ExperimentalPlan__Group__134519 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__14_in_rule__ExperimentalPlan__Group__134522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ExperimentalPlan__Group__13__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__14__Impl_in_rule__ExperimentalPlan__Group__144581 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__15_in_rule__ExperimentalPlan__Group__144584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__InternalReplicationAssignment_14_in_rule__ExperimentalPlan__Group__14__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group__15__Impl_in_rule__ExperimentalPlan__Group__154641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ExperimentalPlan__Group__15__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group_12__0__Impl_in_rule__ExperimentalPlan__Group_12__04732 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group_12__1_in_rule__ExperimentalPlan__Group_12__04735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__TohypothesesAssignment_12_0_in_rule__ExperimentalPlan__Group_12__0__Impl4762 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group_12__1__Impl_in_rule__ExperimentalPlan__Group_12__14793 = new BitSet(new long[]{0x0000007FF8000000L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group_12__2_in_rule__ExperimentalPlan__Group_12__14796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__ExperimentalPlan__Group_12__1__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__Group_12__2__Impl_in_rule__ExperimentalPlan__Group_12__24855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExperimentalPlan__TechniqueAssignment_12_2_in_rule__ExperimentalPlan__Group_12__2__Impl4882 = new BitSet(new long[]{0x0000007FF8000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__04919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__04922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__NameAssignment_0_in_rule__Goal__Group__0__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__14979 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__14982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DescriptionAssignment_1_in_rule__Goal__Group__1__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__2__Impl_in_rule__Goal__Group__25039 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_rule__Goal__Group__3_in_rule__Goal__Group__25042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Goal__Group__2__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__3__Impl_in_rule__Goal__Group__35101 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_rule__Goal__Group__4_in_rule__Goal__Group__35104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__HypothesesAssignment_3_in_rule__Goal__Group__3__Impl5131 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Goal__Group__4__Impl_in_rule__Goal__Group__45162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Goal__Group__4__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__0__Impl_in_rule__Hypotheses__Group_0__05231 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__1_in_rule__Hypotheses__Group_0__05234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__NameAssignment_0_0_in_rule__Hypotheses__Group_0__0__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__1__Impl_in_rule__Hypotheses__Group_0__15291 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__2_in_rule__Hypotheses__Group_0__15294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__DescriptionAssignment_0_1_in_rule__Hypotheses__Group_0__1__Impl5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__2__Impl_in_rule__Hypotheses__Group_0__25352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__3_in_rule__Hypotheses__Group_0__25355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__TypeAssignment_0_2_in_rule__Hypotheses__Group_0__2__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__3__Impl_in_rule__Hypotheses__Group_0__35412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__4_in_rule__Hypotheses__Group_0__35415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__DependentVariableAssignment_0_3_in_rule__Hypotheses__Group_0__3__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__4__Impl_in_rule__Hypotheses__Group_0__45472 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__5_in_rule__Hypotheses__Group_0__45475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Hypotheses__Group_0__4__Impl5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__5__Impl_in_rule__Hypotheses__Group_0__55534 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__6_in_rule__Hypotheses__Group_0__55537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__LevelsAssignment_0_5_in_rule__Hypotheses__Group_0__5__Impl5564 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__6__Impl_in_rule__Hypotheses__Group_0__65595 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__7_in_rule__Hypotheses__Group_0__65598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Hypotheses__Group_0__6__Impl5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__7__Impl_in_rule__Hypotheses__Group_0__75657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__8_in_rule__Hypotheses__Group_0__75660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__OperatorAssignment_0_7_in_rule__Hypotheses__Group_0__7__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__8__Impl_in_rule__Hypotheses__Group_0__85717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__9_in_rule__Hypotheses__Group_0__85720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__DependentVariableAssignment_0_8_in_rule__Hypotheses__Group_0__8__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__9__Impl_in_rule__Hypotheses__Group_0__95777 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__10_in_rule__Hypotheses__Group_0__95780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Hypotheses__Group_0__9__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__10__Impl_in_rule__Hypotheses__Group_0__105839 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__11_in_rule__Hypotheses__Group_0__105842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__LevelsAssignment_0_10_in_rule__Hypotheses__Group_0__10__Impl5869 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_0__11__Impl_in_rule__Hypotheses__Group_0__115900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Hypotheses__Group_0__11__Impl5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__0__Impl_in_rule__Hypotheses__Group_1__05983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__1_in_rule__Hypotheses__Group_1__05986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__NameAssignment_1_0_in_rule__Hypotheses__Group_1__0__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__1__Impl_in_rule__Hypotheses__Group_1__16043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__2_in_rule__Hypotheses__Group_1__16046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Hypotheses__Group_1__1__Impl6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__2__Impl_in_rule__Hypotheses__Group_1__26105 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__3_in_rule__Hypotheses__Group_1__26108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__DependentVariableAssignment_1_2_in_rule__Hypotheses__Group_1__2__Impl6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__3__Impl_in_rule__Hypotheses__Group_1__36165 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__4_in_rule__Hypotheses__Group_1__36168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__RelationAssignment_1_3_in_rule__Hypotheses__Group_1__3__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__4__Impl_in_rule__Hypotheses__Group_1__46225 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__5_in_rule__Hypotheses__Group_1__46228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hypotheses__FactorAssignment_1_4_in_rule__Hypotheses__Group_1__4__Impl6255 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Hypotheses__Group_1__5__Impl_in_rule__Hypotheses__Group_1__56286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Hypotheses__Group_1__5__Impl6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Parameter__Group__0__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16419 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__VariableAssignment_1_in_rule__Parameter__Group__1__Impl6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__26482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Parameter__Group__2__Impl6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__36541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ValueAssignment_3_in_rule__Parameter__Group__3__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependentVariable__Group__0__Impl_in_rule__DependentVariable__Group__06606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DependentVariable__Group__1_in_rule__DependentVariable__Group__06609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__DependentVariable__Group__0__Impl6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependentVariable__Group__1__Impl_in_rule__DependentVariable__Group__16668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DependentVariable__Group__2_in_rule__DependentVariable__Group__16671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependentVariable__NameAssignment_1_in_rule__DependentVariable__Group__1__Impl6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependentVariable__Group__2__Impl_in_rule__DependentVariable__Group__26728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DependentVariable__Group__3_in_rule__DependentVariable__Group__26731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependentVariable__DescriptionAssignment_2_in_rule__DependentVariable__Group__2__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependentVariable__Group__3__Impl_in_rule__DependentVariable__Group__36788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependentVariable__MetricsAssignment_3_in_rule__DependentVariable__Group__3__Impl6815 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__06854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__06857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Factor__Group__0__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__16916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Factor__Group__2_in_rule__Factor__Group__16919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__NameAssignment_1_in_rule__Factor__Group__1__Impl6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__2__Impl_in_rule__Factor__Group__26976 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Factor__Group__3_in_rule__Factor__Group__26979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Factor__Group__2__Impl7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__3__Impl_in_rule__Factor__Group__37038 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Factor__Group__4_in_rule__Factor__Group__37041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__IsDesiredVariationAssignment_3_in_rule__Factor__Group__3__Impl7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__4__Impl_in_rule__Factor__Group__47098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__0_in_rule__Factor__Group__4__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__0__Impl_in_rule__Factor__Group_4__07166 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__1_in_rule__Factor__Group_4__07169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Factor__Group_4__0__Impl7197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__1__Impl_in_rule__Factor__Group_4__17228 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__2_in_rule__Factor__Group_4__17231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__LevelAssignment_4_1_in_rule__Factor__Group_4__1__Impl7258 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Factor__Group_4__2__Impl_in_rule__Factor__Group_4__27289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Factor__Group_4__2__Impl7317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__07354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__07357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__Process__Group__0__Impl7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__17416 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__17419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__NameAssignment_1_in_rule__Process__Group__1__Impl7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__27476 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__27479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_2__0_in_rule__Process__Group__2__Impl7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__37537 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__37540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Process__Group__3__Impl7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__47599 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Process__Group__5_in_rule__Process__Group__47602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_4__0_in_rule__Process__Group__4__Impl7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__5__Impl_in_rule__Process__Group__57660 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Process__Group__6_in_rule__Process__Group__57663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TaskAssignment_5_in_rule__Process__Group__5__Impl7690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Process__Group__6__Impl_in_rule__Process__Group__67721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Process__Group__6__Impl7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_2__0__Impl_in_rule__Process__Group_2__07794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Process__Group_2__1_in_rule__Process__Group_2__07797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Process__Group_2__0__Impl7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_2__1__Impl_in_rule__Process__Group_2__17856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TreatmentAssignment_2_1_in_rule__Process__Group_2__1__Impl7883 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Process__Group_4__0__Impl_in_rule__Process__Group_4__07918 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Process__Group_4__1_in_rule__Process__Group_4__07921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__Process__Group_4__0__Impl7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_4__1__Impl_in_rule__Process__Group_4__17980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__RoleAssignment_4_1_in_rule__Process__Group_4__1__Impl8007 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__08042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__08045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__Task__Group__0__Impl8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__18104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Task__Group__2_in_rule__Task__Group__18107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl8134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__2__Impl_in_rule__Task__Group__28164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Task__Group__3_in_rule__Task__Group__28167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__Task__Group__2__Impl8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__3__Impl_in_rule__Task__Group__38226 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Task__Group__4_in_rule__Task__Group__38229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__DescriptionAssignment_3_in_rule__Task__Group__3__Impl8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__4__Impl_in_rule__Task__Group__48286 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Task__Group__5_in_rule__Task__Group__48289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__0_in_rule__Task__Group__4__Impl8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__5__Impl_in_rule__Task__Group__58347 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Task__Group__6_in_rule__Task__Group__58350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_5__0_in_rule__Task__Group__5__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__6__Impl_in_rule__Task__Group__68408 = new BitSet(new long[]{0x1000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Task__Group__7_in_rule__Task__Group__68411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Task__Group__6__Impl8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__7__Impl_in_rule__Task__Group__78470 = new BitSet(new long[]{0x1000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Task__Group__8_in_rule__Task__Group__78473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__0_in_rule__Task__Group__7__Impl8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__8__Impl_in_rule__Task__Group__88531 = new BitSet(new long[]{0x1000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Task__Group__9_in_rule__Task__Group__88534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_8__0_in_rule__Task__Group__8__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__9__Impl_in_rule__Task__Group__98592 = new BitSet(new long[]{0x1000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Task__Group__10_in_rule__Task__Group__98595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_9__0_in_rule__Task__Group__9__Impl8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__10__Impl_in_rule__Task__Group__108653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Task__Group__10__Impl8681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__0__Impl_in_rule__Task__Group_4__08734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_4__1_in_rule__Task__Group_4__08737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Task__Group_4__0__Impl8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__1__Impl_in_rule__Task__Group_4__18796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NextAssignment_4_1_in_rule__Task__Group_4__1__Impl8823 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_5__0__Impl_in_rule__Task__Group_5__08858 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Task__Group_5__1_in_rule__Task__Group_5__08861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__Task__Group_5__0__Impl8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_5__1__Impl_in_rule__Task__Group_5__18920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__RoleAssignment_5_1_in_rule__Task__Group_5__1__Impl8947 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__0__Impl_in_rule__Task__Group_7__08982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_7__1_in_rule__Task__Group_7__08985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__Task__Group_7__0__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__1__Impl_in_rule__Task__Group_7__19044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__CollectDataAssignment_7_1_in_rule__Task__Group_7__1__Impl9071 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_8__0__Impl_in_rule__Task__Group_8__09106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_8__1_in_rule__Task__Group_8__09109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__Task__Group_8__0__Impl9137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_8__1__Impl_in_rule__Task__Group_8__19168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__ArtefactsAssignment_8_1_in_rule__Task__Group_8__1__Impl9195 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_9__0__Impl_in_rule__Task__Group_9__09230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_9__1_in_rule__Task__Group_9__09233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__Task__Group_9__0__Impl9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_9__1__Impl_in_rule__Task__Group_9__19292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__QuestionnaireAssignment_9_1_in_rule__Task__Group_9__1__Impl9319 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Artefact__Group__0__Impl_in_rule__Artefact__Group__09354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Artefact__Group__1_in_rule__Artefact__Group__09357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artefact__NameAssignment_0_in_rule__Artefact__Group__0__Impl9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artefact__Group__1__Impl_in_rule__Artefact__Group__19414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Artefact__Group__2_in_rule__Artefact__Group__19417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__Artefact__Group__1__Impl9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artefact__Group__2__Impl_in_rule__Artefact__Group__29476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Artefact__Group__3_in_rule__Artefact__Group__29479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artefact__DescriptionAssignment_2_in_rule__Artefact__Group__2__Impl9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artefact__Group__3__Impl_in_rule__Artefact__Group__39536 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__Artefact__Group__4_in_rule__Artefact__Group__39539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__Artefact__Group__3__Impl9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artefact__Group__4__Impl_in_rule__Artefact__Group__49598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artefact__TypeAssignment_4_in_rule__Artefact__Group__4__Impl9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__0__Impl_in_rule__Metrics__Group__09665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Metrics__Group__1_in_rule__Metrics__Group__09668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__Metrics__Group__0__Impl9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__1__Impl_in_rule__Metrics__Group__19727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Metrics__Group__2_in_rule__Metrics__Group__19730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__NameAssignment_1_in_rule__Metrics__Group__1__Impl9757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__2__Impl_in_rule__Metrics__Group__29787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Metrics__Group__3_in_rule__Metrics__Group__29790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__Metrics__Group__2__Impl9818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__3__Impl_in_rule__Metrics__Group__39849 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Metrics__Group__4_in_rule__Metrics__Group__39852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__RelatesToAssignment_3_in_rule__Metrics__Group__3__Impl9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__4__Impl_in_rule__Metrics__Group__49909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Metrics__Group__5_in_rule__Metrics__Group__49912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Metrics__Group__4__Impl9940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__5__Impl_in_rule__Metrics__Group__59971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000344000L});
    public static final BitSet FOLLOW_rule__Metrics__Group__6_in_rule__Metrics__Group__59974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group_5__0_in_rule__Metrics__Group__5__Impl10001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__6__Impl_in_rule__Metrics__Group__610031 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Metrics__Group__7_in_rule__Metrics__Group__610034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__DetailAssignment_6_in_rule__Metrics__Group__6__Impl10061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group__7__Impl_in_rule__Metrics__Group__710091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Metrics__Group__7__Impl10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group_5__0__Impl_in_rule__Metrics__Group_5__010166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Metrics__Group_5__1_in_rule__Metrics__Group_5__010169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__Metrics__Group_5__0__Impl10197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__Group_5__1__Impl_in_rule__Metrics__Group_5__110228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metrics__DescriptionAssignment_5_1_in_rule__Metrics__Group_5__1__Impl10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group__0__Impl_in_rule__TaskMetric__Group__010289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group__1_in_rule__TaskMetric__Group__010292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group__1__Impl_in_rule__TaskMetric__Group__110350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group__2_in_rule__TaskMetric__Group__110353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group_1__0_in_rule__TaskMetric__Group__1__Impl10380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group__2__Impl_in_rule__TaskMetric__Group__210410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group_2__0_in_rule__TaskMetric__Group__2__Impl10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group_1__0__Impl_in_rule__TaskMetric__Group_1__010474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group_1__1_in_rule__TaskMetric__Group_1__010477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__TaskMetric__Group_1__0__Impl10505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group_1__1__Impl_in_rule__TaskMetric__Group_1__110536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__TaskBeginAssignment_1_1_in_rule__TaskMetric__Group_1__1__Impl10563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group_2__0__Impl_in_rule__TaskMetric__Group_2__010597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group_2__1_in_rule__TaskMetric__Group_2__010600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__TaskMetric__Group_2__0__Impl10628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__Group_2__1__Impl_in_rule__TaskMetric__Group_2__110659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskMetric__TaskEndAssignment_2_1_in_rule__TaskMetric__Group_2__1__Impl10686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group__0__Impl_in_rule__DataMetric__Group__010720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000344000L});
    public static final BitSet FOLLOW_rule__DataMetric__Group__1_in_rule__DataMetric__Group__010723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group__1__Impl_in_rule__DataMetric__Group__110781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000344000L});
    public static final BitSet FOLLOW_rule__DataMetric__Group__2_in_rule__DataMetric__Group__110784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_1__0_in_rule__DataMetric__Group__1__Impl10811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group__2__Impl_in_rule__DataMetric__Group__210842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000344000L});
    public static final BitSet FOLLOW_rule__DataMetric__Group__3_in_rule__DataMetric__Group__210845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_2__0_in_rule__DataMetric__Group__2__Impl10872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group__3__Impl_in_rule__DataMetric__Group__310903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_3__0_in_rule__DataMetric__Group__3__Impl10930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_1__0__Impl_in_rule__DataMetric__Group_1__010969 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_1__1_in_rule__DataMetric__Group_1__010972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__DataMetric__Group_1__0__Impl11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_1__1__Impl_in_rule__DataMetric__Group_1__111031 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_1__2_in_rule__DataMetric__Group_1__111034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__CollectedDataAssignment_1_1_in_rule__DataMetric__Group_1__1__Impl11061 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_1__2__Impl_in_rule__DataMetric__Group_1__211092 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_1__3_in_rule__DataMetric__Group_1__211095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__DataMetric__Group_1__2__Impl11123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_1__3__Impl_in_rule__DataMetric__Group_1__311154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__DataTypeAssignment_1_3_in_rule__DataMetric__Group_1__3__Impl11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_2__0__Impl_in_rule__DataMetric__Group_2__011219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_2__1_in_rule__DataMetric__Group_2__011222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__DataMetric__Group_2__0__Impl11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_2__1__Impl_in_rule__DataMetric__Group_2__111281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__ArtefactsAssignment_2_1_in_rule__DataMetric__Group_2__1__Impl11308 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_3__0__Impl_in_rule__DataMetric__Group_3__011343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_3__1_in_rule__DataMetric__Group_3__011346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__DataMetric__Group_3__0__Impl11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__Group_3__1__Impl_in_rule__DataMetric__Group_3__111405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataMetric__QuestionnairesAssignment_3_1_in_rule__DataMetric__Group_3__1__Impl11432 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__011467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__011470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__Questionnaire__Group__0__Impl11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__111529 = new BitSet(new long[]{0x0800000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__111532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__211589 = new BitSet(new long[]{0x0800000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__211592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_2__0_in_rule__Questionnaire__Group__2__Impl11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__311650 = new BitSet(new long[]{0x0800000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__311653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_3__0_in_rule__Questionnaire__Group__3__Impl11680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__411711 = new BitSet(new long[]{0x0000000000000010L,0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__411714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Questionnaire__Group__4__Impl11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__511773 = new BitSet(new long[]{0x0000000000000010L,0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__511776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__QuestionAssignment_5_in_rule__Questionnaire__Group__5__Impl11803 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__611834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__Questionnaire__Group__6__Impl11862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_2__0__Impl_in_rule__Questionnaire__Group_2__011907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_2__1_in_rule__Questionnaire__Group_2__011910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__Questionnaire__Group_2__0__Impl11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_2__1__Impl_in_rule__Questionnaire__Group_2__111969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__RelatesToAssignment_2_1_in_rule__Questionnaire__Group_2__1__Impl11996 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_3__0__Impl_in_rule__Questionnaire__Group_3__012031 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_3__1_in_rule__Questionnaire__Group_3__012034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__Questionnaire__Group_3__0__Impl12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_3__1__Impl_in_rule__Questionnaire__Group_3__112093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__QuestionnaireTypeAssignment_3_1_in_rule__Questionnaire__Group_3__1__Impl12120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__012154 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__012157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_0_in_rule__Question__Group__0__Impl12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__112214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__112217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Question__Group__1__Impl12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__212276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__212279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2__0_in_rule__Question__Group__2__Impl12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__312336 = new BitSet(new long[]{0x1000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__312339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_3__0_in_rule__Question__Group__3__Impl12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__412396 = new BitSet(new long[]{0x1000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__412399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_4__0_in_rule__Question__Group__4__Impl12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__512457 = new BitSet(new long[]{0x1000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__512460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_5__0_in_rule__Question__Group__5__Impl12487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__612518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Question__Group__6__Impl12546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2__0__Impl_in_rule__Question__Group_2__012591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Question__Group_2__1_in_rule__Question__Group_2__012594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__Question__Group_2__0__Impl12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2__1__Impl_in_rule__Question__Group_2__112653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__DescriptionAssignment_2_1_in_rule__Question__Group_2__1__Impl12680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_3__0__Impl_in_rule__Question__Group_3__012714 = new BitSet(new long[]{0x003F000000000000L});
    public static final BitSet FOLLOW_rule__Question__Group_3__1_in_rule__Question__Group_3__012717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__Question__Group_3__0__Impl12745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_3__1__Impl_in_rule__Question__Group_3__112776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__TypeAssignment_3_1_in_rule__Question__Group_3__1__Impl12803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_4__0__Impl_in_rule__Question__Group_4__012837 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Question__Group_4__1_in_rule__Question__Group_4__012840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__Question__Group_4__0__Impl12868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_4__1__Impl_in_rule__Question__Group_4__112899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__ReqAssignment_4_1_in_rule__Question__Group_4__1__Impl12926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_5__0__Impl_in_rule__Question__Group_5__012960 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Question__Group_5__1_in_rule__Question__Group_5__012963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__Question__Group_5__0__Impl12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_5__1__Impl_in_rule__Question__Group_5__113022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__AlternativesAssignment_5_1_in_rule__Question__Group_5__1__Impl13049 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__013084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__013087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__Alternatives__Group__0__Impl13115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__113146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__DescriptionAssignment_1_in_rule__Alternatives__Group__1__Impl13173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentElement_in_rule__Model__ElementsAssignment13212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExperimentElement__NameAssignment_113243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentalPlan_in_rule__ExperimentElement__ExperimentsAssignment_2_113274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__ExperimentElement__ProcessAssignment_313305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetrics_in_rule__ExperimentElement__MetricsAssignment_413336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_rule__ExperimentElement__QuestionnaireAssignment_5_113367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__ExperimentalPlan__GoalAssignment_213398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignType_in_rule__ExperimentalPlan__TypeAssignment_613429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ExperimentalPlan__ParameterAssignment_813460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependentVariable_in_rule__ExperimentalPlan__DependentVariableAssignment_913491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__ExperimentalPlan__FactorAssignment_1013522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ExperimentalPlan__TohypothesesAssignment_12_013557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnalysisTechiqueType_in_rule__ExperimentalPlan__TechniqueAssignment_12_213592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ExperimentalPlan__InternalReplicationAssignment_1413623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_013654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Goal__DescriptionAssignment_113685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypotheses_in_rule__Goal__HypothesesAssignment_313716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Hypotheses__NameAssignment_0_013747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Hypotheses__DescriptionAssignment_0_113778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypothesisType_in_rule__Hypotheses__TypeAssignment_0_213809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Hypotheses__DependentVariableAssignment_0_313844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Hypotheses__LevelsAssignment_0_513883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorType_in_rule__Hypotheses__OperatorAssignment_0_713918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Hypotheses__DependentVariableAssignment_0_813953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Hypotheses__LevelsAssignment_0_1013992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Hypotheses__NameAssignment_1_014027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Hypotheses__DependentVariableAssignment_1_214062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__Hypotheses__RelationAssignment_1_314097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Hypotheses__FactorAssignment_1_414132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__VariableAssignment_114167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__ValueAssignment_314198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DependentVariable__NameAssignment_114229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DependentVariable__DescriptionAssignment_214260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DependentVariable__MetricsAssignment_314295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Factor__NameAssignment_114330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__IsDesiredVariationAlternatives_3_0_in_rule__Factor__IsDesiredVariationAssignment_314361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevels_in_rule__Factor__LevelAssignment_4_114394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Levels__NameAssignment14425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__NameAssignment_114456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Process__TreatmentAssignment_2_114491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleType_in_rule__Process__RoleAssignment_4_114526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__Process__TaskAssignment_514557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_114588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Task__DescriptionAssignment_314619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Task__NextAssignment_4_114654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleType_in_rule__Task__RoleAssignment_5_114689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Task__CollectDataAssignment_7_114724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefact_in_rule__Task__ArtefactsAssignment_8_114759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Task__QuestionnaireAssignment_9_114794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Artefact__NameAssignment_014829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Artefact__DescriptionAssignment_214860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtefactType_in_rule__Artefact__TypeAssignment_414891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metrics__NameAssignment_114922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metrics__RelatesToAssignment_314957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Metrics__DescriptionAssignment_5_114992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetail_in_rule__Metrics__DetailAssignment_615023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TaskMetric__TaskBeginAssignment_1_115058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TaskMetric__TaskEndAssignment_2_115097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectedData_in_rule__DataMetric__CollectedDataAssignment_1_115132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__DataMetric__DataTypeAssignment_1_315163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DataMetric__ArtefactsAssignment_2_115198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DataMetric__QuestionnairesAssignment_3_115237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectedData__NameAssignment15272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Questionnaire__NameAssignment_115303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Questionnaire__RelatesToAssignment_2_115338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaireType_in_rule__Questionnaire__QuestionnaireTypeAssignment_3_115373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Questionnaire__QuestionAssignment_515404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Question__NameAssignment_015435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Question__DescriptionAssignment_2_115466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswerType_in_rule__Question__TypeAssignment_3_115497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Question__ReqAssignment_4_115528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_rule__Question__AlternativesAssignment_5_115559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Alternatives__DescriptionAssignment_115590 = new BitSet(new long[]{0x0000000000000002L});

}