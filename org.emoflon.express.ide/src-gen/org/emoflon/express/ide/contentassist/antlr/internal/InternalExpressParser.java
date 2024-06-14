package org.emoflon.express.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.emoflon.express.services.ExpressGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INTEGER'", "'BOOLEAN'", "'STRING'", "'SCHEMA'", "';'", "'END_SCHEMA;'", "'USE'", "'FROM'", "'('", "')'", "','", "'AS'", "'TYPE'", "'='", "'SELECT'", "');'", "'END_TYPE;'", "'ENUMERATION'", "'OF'", "'ENTITY'", "'END_ENTITY;'", "'SUPERTYPE'", "'SUBTYPE'", "'FUNCTION'", "'...'", "'END_FUNCTION;'", "':'", "'REAL'", "'OPTIONAL'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=21;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExpressParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpress.g"; }


    	private ExpressGrammarAccess grammarAccess;

    	public void setGrammarAccess(ExpressGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSchemaContainer"
    // InternalExpress.g:53:1: entryRuleSchemaContainer : ruleSchemaContainer EOF ;
    public final void entryRuleSchemaContainer() throws RecognitionException {
        try {
            // InternalExpress.g:54:1: ( ruleSchemaContainer EOF )
            // InternalExpress.g:55:1: ruleSchemaContainer EOF
            {
             before(grammarAccess.getSchemaContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleSchemaContainer();

            state._fsp--;

             after(grammarAccess.getSchemaContainerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchemaContainer"


    // $ANTLR start "ruleSchemaContainer"
    // InternalExpress.g:62:1: ruleSchemaContainer : ( ( rule__SchemaContainer__SchemasAssignment ) ) ;
    public final void ruleSchemaContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:66:2: ( ( ( rule__SchemaContainer__SchemasAssignment ) ) )
            // InternalExpress.g:67:2: ( ( rule__SchemaContainer__SchemasAssignment ) )
            {
            // InternalExpress.g:67:2: ( ( rule__SchemaContainer__SchemasAssignment ) )
            // InternalExpress.g:68:3: ( rule__SchemaContainer__SchemasAssignment )
            {
             before(grammarAccess.getSchemaContainerAccess().getSchemasAssignment()); 
            // InternalExpress.g:69:3: ( rule__SchemaContainer__SchemasAssignment )
            // InternalExpress.g:69:4: rule__SchemaContainer__SchemasAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SchemaContainer__SchemasAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSchemaContainerAccess().getSchemasAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemaContainer"


    // $ANTLR start "entryRuleSchema"
    // InternalExpress.g:78:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // InternalExpress.g:79:1: ( ruleSchema EOF )
            // InternalExpress.g:80:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalExpress.g:87:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:91:2: ( ( ( rule__Schema__Group__0 ) ) )
            // InternalExpress.g:92:2: ( ( rule__Schema__Group__0 ) )
            {
            // InternalExpress.g:92:2: ( ( rule__Schema__Group__0 ) )
            // InternalExpress.g:93:3: ( rule__Schema__Group__0 )
            {
             before(grammarAccess.getSchemaAccess().getGroup()); 
            // InternalExpress.g:94:3: ( rule__Schema__Group__0 )
            // InternalExpress.g:94:4: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleDeclaration"
    // InternalExpress.g:103:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalExpress.g:104:1: ( ruleDeclaration EOF )
            // InternalExpress.g:105:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalExpress.g:112:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:116:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalExpress.g:117:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalExpress.g:117:2: ( ( rule__Declaration__Alternatives ) )
            // InternalExpress.g:118:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalExpress.g:119:3: ( rule__Declaration__Alternatives )
            // InternalExpress.g:119:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleReferenceOrValue"
    // InternalExpress.g:128:1: entryRuleReferenceOrValue : ruleReferenceOrValue EOF ;
    public final void entryRuleReferenceOrValue() throws RecognitionException {
        try {
            // InternalExpress.g:129:1: ( ruleReferenceOrValue EOF )
            // InternalExpress.g:130:1: ruleReferenceOrValue EOF
            {
             before(grammarAccess.getReferenceOrValueRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceOrValue();

            state._fsp--;

             after(grammarAccess.getReferenceOrValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferenceOrValue"


    // $ANTLR start "ruleReferenceOrValue"
    // InternalExpress.g:137:1: ruleReferenceOrValue : ( ( rule__ReferenceOrValue__Alternatives ) ) ;
    public final void ruleReferenceOrValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:141:2: ( ( ( rule__ReferenceOrValue__Alternatives ) ) )
            // InternalExpress.g:142:2: ( ( rule__ReferenceOrValue__Alternatives ) )
            {
            // InternalExpress.g:142:2: ( ( rule__ReferenceOrValue__Alternatives ) )
            // InternalExpress.g:143:3: ( rule__ReferenceOrValue__Alternatives )
            {
             before(grammarAccess.getReferenceOrValueAccess().getAlternatives()); 
            // InternalExpress.g:144:3: ( rule__ReferenceOrValue__Alternatives )
            // InternalExpress.g:144:4: rule__ReferenceOrValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceOrValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceOrValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceOrValue"


    // $ANTLR start "entryRuleUserDefinedType"
    // InternalExpress.g:153:1: entryRuleUserDefinedType : ruleUserDefinedType EOF ;
    public final void entryRuleUserDefinedType() throws RecognitionException {
        try {
            // InternalExpress.g:154:1: ( ruleUserDefinedType EOF )
            // InternalExpress.g:155:1: ruleUserDefinedType EOF
            {
             before(grammarAccess.getUserDefinedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUserDefinedType();

            state._fsp--;

             after(grammarAccess.getUserDefinedTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserDefinedType"


    // $ANTLR start "ruleUserDefinedType"
    // InternalExpress.g:162:1: ruleUserDefinedType : ( ( rule__UserDefinedType__Alternatives ) ) ;
    public final void ruleUserDefinedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:166:2: ( ( ( rule__UserDefinedType__Alternatives ) ) )
            // InternalExpress.g:167:2: ( ( rule__UserDefinedType__Alternatives ) )
            {
            // InternalExpress.g:167:2: ( ( rule__UserDefinedType__Alternatives ) )
            // InternalExpress.g:168:3: ( rule__UserDefinedType__Alternatives )
            {
             before(grammarAccess.getUserDefinedTypeAccess().getAlternatives()); 
            // InternalExpress.g:169:3: ( rule__UserDefinedType__Alternatives )
            // InternalExpress.g:169:4: rule__UserDefinedType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UserDefinedType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUserDefinedTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserDefinedType"


    // $ANTLR start "entryRuleUseFrom"
    // InternalExpress.g:178:1: entryRuleUseFrom : ruleUseFrom EOF ;
    public final void entryRuleUseFrom() throws RecognitionException {
        try {
            // InternalExpress.g:179:1: ( ruleUseFrom EOF )
            // InternalExpress.g:180:1: ruleUseFrom EOF
            {
             before(grammarAccess.getUseFromRule()); 
            pushFollow(FOLLOW_1);
            ruleUseFrom();

            state._fsp--;

             after(grammarAccess.getUseFromRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUseFrom"


    // $ANTLR start "ruleUseFrom"
    // InternalExpress.g:187:1: ruleUseFrom : ( ( rule__UseFrom__Group__0 ) ) ;
    public final void ruleUseFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:191:2: ( ( ( rule__UseFrom__Group__0 ) ) )
            // InternalExpress.g:192:2: ( ( rule__UseFrom__Group__0 ) )
            {
            // InternalExpress.g:192:2: ( ( rule__UseFrom__Group__0 ) )
            // InternalExpress.g:193:3: ( rule__UseFrom__Group__0 )
            {
             before(grammarAccess.getUseFromAccess().getGroup()); 
            // InternalExpress.g:194:3: ( rule__UseFrom__Group__0 )
            // InternalExpress.g:194:4: rule__UseFrom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseFrom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseFrom"


    // $ANTLR start "entryRuleImportedEntityList"
    // InternalExpress.g:203:1: entryRuleImportedEntityList : ruleImportedEntityList EOF ;
    public final void entryRuleImportedEntityList() throws RecognitionException {
        try {
            // InternalExpress.g:204:1: ( ruleImportedEntityList EOF )
            // InternalExpress.g:205:1: ruleImportedEntityList EOF
            {
             before(grammarAccess.getImportedEntityListRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedEntityList();

            state._fsp--;

             after(grammarAccess.getImportedEntityListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportedEntityList"


    // $ANTLR start "ruleImportedEntityList"
    // InternalExpress.g:212:1: ruleImportedEntityList : ( ( rule__ImportedEntityList__Group__0 ) ) ;
    public final void ruleImportedEntityList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:216:2: ( ( ( rule__ImportedEntityList__Group__0 ) ) )
            // InternalExpress.g:217:2: ( ( rule__ImportedEntityList__Group__0 ) )
            {
            // InternalExpress.g:217:2: ( ( rule__ImportedEntityList__Group__0 ) )
            // InternalExpress.g:218:3: ( rule__ImportedEntityList__Group__0 )
            {
             before(grammarAccess.getImportedEntityListAccess().getGroup()); 
            // InternalExpress.g:219:3: ( rule__ImportedEntityList__Group__0 )
            // InternalExpress.g:219:4: rule__ImportedEntityList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntityList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportedEntityListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportedEntityList"


    // $ANTLR start "entryRuleImportedEntity"
    // InternalExpress.g:228:1: entryRuleImportedEntity : ruleImportedEntity EOF ;
    public final void entryRuleImportedEntity() throws RecognitionException {
        try {
            // InternalExpress.g:229:1: ( ruleImportedEntity EOF )
            // InternalExpress.g:230:1: ruleImportedEntity EOF
            {
             before(grammarAccess.getImportedEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedEntity();

            state._fsp--;

             after(grammarAccess.getImportedEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportedEntity"


    // $ANTLR start "ruleImportedEntity"
    // InternalExpress.g:237:1: ruleImportedEntity : ( ( rule__ImportedEntity__Group__0 ) ) ;
    public final void ruleImportedEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:241:2: ( ( ( rule__ImportedEntity__Group__0 ) ) )
            // InternalExpress.g:242:2: ( ( rule__ImportedEntity__Group__0 ) )
            {
            // InternalExpress.g:242:2: ( ( rule__ImportedEntity__Group__0 ) )
            // InternalExpress.g:243:3: ( rule__ImportedEntity__Group__0 )
            {
             before(grammarAccess.getImportedEntityAccess().getGroup()); 
            // InternalExpress.g:244:3: ( rule__ImportedEntity__Group__0 )
            // InternalExpress.g:244:4: rule__ImportedEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportedEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportedEntity"


    // $ANTLR start "entryRuleSelectType"
    // InternalExpress.g:253:1: entryRuleSelectType : ruleSelectType EOF ;
    public final void entryRuleSelectType() throws RecognitionException {
        try {
            // InternalExpress.g:254:1: ( ruleSelectType EOF )
            // InternalExpress.g:255:1: ruleSelectType EOF
            {
             before(grammarAccess.getSelectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectType();

            state._fsp--;

             after(grammarAccess.getSelectTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectType"


    // $ANTLR start "ruleSelectType"
    // InternalExpress.g:262:1: ruleSelectType : ( ( rule__SelectType__Group__0 ) ) ;
    public final void ruleSelectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:266:2: ( ( ( rule__SelectType__Group__0 ) ) )
            // InternalExpress.g:267:2: ( ( rule__SelectType__Group__0 ) )
            {
            // InternalExpress.g:267:2: ( ( rule__SelectType__Group__0 ) )
            // InternalExpress.g:268:3: ( rule__SelectType__Group__0 )
            {
             before(grammarAccess.getSelectTypeAccess().getGroup()); 
            // InternalExpress.g:269:3: ( rule__SelectType__Group__0 )
            // InternalExpress.g:269:4: rule__SelectType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectType"


    // $ANTLR start "entryRuleEnumerationType"
    // InternalExpress.g:278:1: entryRuleEnumerationType : ruleEnumerationType EOF ;
    public final void entryRuleEnumerationType() throws RecognitionException {
        try {
            // InternalExpress.g:279:1: ( ruleEnumerationType EOF )
            // InternalExpress.g:280:1: ruleEnumerationType EOF
            {
             before(grammarAccess.getEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationType();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // InternalExpress.g:287:1: ruleEnumerationType : ( ( rule__EnumerationType__Group__0 ) ) ;
    public final void ruleEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:291:2: ( ( ( rule__EnumerationType__Group__0 ) ) )
            // InternalExpress.g:292:2: ( ( rule__EnumerationType__Group__0 ) )
            {
            // InternalExpress.g:292:2: ( ( rule__EnumerationType__Group__0 ) )
            // InternalExpress.g:293:3: ( rule__EnumerationType__Group__0 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup()); 
            // InternalExpress.g:294:3: ( rule__EnumerationType__Group__0 )
            // InternalExpress.g:294:4: rule__EnumerationType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationValue"
    // InternalExpress.g:303:1: entryRuleEnumerationValue : ruleEnumerationValue EOF ;
    public final void entryRuleEnumerationValue() throws RecognitionException {
        try {
            // InternalExpress.g:304:1: ( ruleEnumerationValue EOF )
            // InternalExpress.g:305:1: ruleEnumerationValue EOF
            {
             before(grammarAccess.getEnumerationValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationValue();

            state._fsp--;

             after(grammarAccess.getEnumerationValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationValue"


    // $ANTLR start "ruleEnumerationValue"
    // InternalExpress.g:312:1: ruleEnumerationValue : ( ( rule__EnumerationValue__NameAssignment ) ) ;
    public final void ruleEnumerationValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:316:2: ( ( ( rule__EnumerationValue__NameAssignment ) ) )
            // InternalExpress.g:317:2: ( ( rule__EnumerationValue__NameAssignment ) )
            {
            // InternalExpress.g:317:2: ( ( rule__EnumerationValue__NameAssignment ) )
            // InternalExpress.g:318:3: ( rule__EnumerationValue__NameAssignment )
            {
             before(grammarAccess.getEnumerationValueAccess().getNameAssignment()); 
            // InternalExpress.g:319:3: ( rule__EnumerationValue__NameAssignment )
            // InternalExpress.g:319:4: rule__EnumerationValue__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValue__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationValue"


    // $ANTLR start "entryRuleAliasType"
    // InternalExpress.g:328:1: entryRuleAliasType : ruleAliasType EOF ;
    public final void entryRuleAliasType() throws RecognitionException {
        try {
            // InternalExpress.g:329:1: ( ruleAliasType EOF )
            // InternalExpress.g:330:1: ruleAliasType EOF
            {
             before(grammarAccess.getAliasTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAliasType();

            state._fsp--;

             after(grammarAccess.getAliasTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAliasType"


    // $ANTLR start "ruleAliasType"
    // InternalExpress.g:337:1: ruleAliasType : ( ( rule__AliasType__Group__0 ) ) ;
    public final void ruleAliasType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:341:2: ( ( ( rule__AliasType__Group__0 ) ) )
            // InternalExpress.g:342:2: ( ( rule__AliasType__Group__0 ) )
            {
            // InternalExpress.g:342:2: ( ( rule__AliasType__Group__0 ) )
            // InternalExpress.g:343:3: ( rule__AliasType__Group__0 )
            {
             before(grammarAccess.getAliasTypeAccess().getGroup()); 
            // InternalExpress.g:344:3: ( rule__AliasType__Group__0 )
            // InternalExpress.g:344:4: rule__AliasType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AliasType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasType"


    // $ANTLR start "entryRuleEntity"
    // InternalExpress.g:353:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalExpress.g:354:1: ( ruleEntity EOF )
            // InternalExpress.g:355:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalExpress.g:362:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:366:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalExpress.g:367:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalExpress.g:367:2: ( ( rule__Entity__Group__0 ) )
            // InternalExpress.g:368:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalExpress.g:369:3: ( rule__Entity__Group__0 )
            // InternalExpress.g:369:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFunction"
    // InternalExpress.g:378:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalExpress.g:379:1: ( ruleFunction EOF )
            // InternalExpress.g:380:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalExpress.g:387:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:391:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalExpress.g:392:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalExpress.g:392:2: ( ( rule__Function__Group__0 ) )
            // InternalExpress.g:393:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalExpress.g:394:3: ( rule__Function__Group__0 )
            // InternalExpress.g:394:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleParameterList"
    // InternalExpress.g:403:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalExpress.g:404:1: ( ruleParameterList EOF )
            // InternalExpress.g:405:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalExpress.g:412:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:416:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalExpress.g:417:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalExpress.g:417:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalExpress.g:418:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // InternalExpress.g:419:3: ( rule__ParameterList__Group__0 )
            // InternalExpress.g:419:4: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // InternalExpress.g:428:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalExpress.g:429:1: ( ruleParameter EOF )
            // InternalExpress.g:430:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalExpress.g:437:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:441:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalExpress.g:442:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalExpress.g:442:2: ( ( rule__Parameter__Group__0 ) )
            // InternalExpress.g:443:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalExpress.g:444:3: ( rule__Parameter__Group__0 )
            // InternalExpress.g:444:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleUserDefinedTypeList"
    // InternalExpress.g:453:1: entryRuleUserDefinedTypeList : ruleUserDefinedTypeList EOF ;
    public final void entryRuleUserDefinedTypeList() throws RecognitionException {
        try {
            // InternalExpress.g:454:1: ( ruleUserDefinedTypeList EOF )
            // InternalExpress.g:455:1: ruleUserDefinedTypeList EOF
            {
             before(grammarAccess.getUserDefinedTypeListRule()); 
            pushFollow(FOLLOW_1);
            ruleUserDefinedTypeList();

            state._fsp--;

             after(grammarAccess.getUserDefinedTypeListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserDefinedTypeList"


    // $ANTLR start "ruleUserDefinedTypeList"
    // InternalExpress.g:462:1: ruleUserDefinedTypeList : ( ( rule__UserDefinedTypeList__Group__0 ) ) ;
    public final void ruleUserDefinedTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:466:2: ( ( ( rule__UserDefinedTypeList__Group__0 ) ) )
            // InternalExpress.g:467:2: ( ( rule__UserDefinedTypeList__Group__0 ) )
            {
            // InternalExpress.g:467:2: ( ( rule__UserDefinedTypeList__Group__0 ) )
            // InternalExpress.g:468:3: ( rule__UserDefinedTypeList__Group__0 )
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getGroup()); 
            // InternalExpress.g:469:3: ( rule__UserDefinedTypeList__Group__0 )
            // InternalExpress.g:469:4: rule__UserDefinedTypeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UserDefinedTypeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserDefinedTypeListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserDefinedTypeList"


    // $ANTLR start "entryRuleAttribute"
    // InternalExpress.g:478:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalExpress.g:479:1: ( ruleAttribute EOF )
            // InternalExpress.g:480:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalExpress.g:487:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:491:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalExpress.g:492:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalExpress.g:492:2: ( ( rule__Attribute__Alternatives ) )
            // InternalExpress.g:493:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalExpress.g:494:3: ( rule__Attribute__Alternatives )
            // InternalExpress.g:494:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleIntegerAttribute"
    // InternalExpress.g:503:1: entryRuleIntegerAttribute : ruleIntegerAttribute EOF ;
    public final void entryRuleIntegerAttribute() throws RecognitionException {
        try {
            // InternalExpress.g:504:1: ( ruleIntegerAttribute EOF )
            // InternalExpress.g:505:1: ruleIntegerAttribute EOF
            {
             before(grammarAccess.getIntegerAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerAttribute();

            state._fsp--;

             after(grammarAccess.getIntegerAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerAttribute"


    // $ANTLR start "ruleIntegerAttribute"
    // InternalExpress.g:512:1: ruleIntegerAttribute : ( ( rule__IntegerAttribute__Group__0 ) ) ;
    public final void ruleIntegerAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:516:2: ( ( ( rule__IntegerAttribute__Group__0 ) ) )
            // InternalExpress.g:517:2: ( ( rule__IntegerAttribute__Group__0 ) )
            {
            // InternalExpress.g:517:2: ( ( rule__IntegerAttribute__Group__0 ) )
            // InternalExpress.g:518:3: ( rule__IntegerAttribute__Group__0 )
            {
             before(grammarAccess.getIntegerAttributeAccess().getGroup()); 
            // InternalExpress.g:519:3: ( rule__IntegerAttribute__Group__0 )
            // InternalExpress.g:519:4: rule__IntegerAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerAttribute"


    // $ANTLR start "entryRuleStringAttribute"
    // InternalExpress.g:528:1: entryRuleStringAttribute : ruleStringAttribute EOF ;
    public final void entryRuleStringAttribute() throws RecognitionException {
        try {
            // InternalExpress.g:529:1: ( ruleStringAttribute EOF )
            // InternalExpress.g:530:1: ruleStringAttribute EOF
            {
             before(grammarAccess.getStringAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringAttribute();

            state._fsp--;

             after(grammarAccess.getStringAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringAttribute"


    // $ANTLR start "ruleStringAttribute"
    // InternalExpress.g:537:1: ruleStringAttribute : ( ( rule__StringAttribute__Group__0 ) ) ;
    public final void ruleStringAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:541:2: ( ( ( rule__StringAttribute__Group__0 ) ) )
            // InternalExpress.g:542:2: ( ( rule__StringAttribute__Group__0 ) )
            {
            // InternalExpress.g:542:2: ( ( rule__StringAttribute__Group__0 ) )
            // InternalExpress.g:543:3: ( rule__StringAttribute__Group__0 )
            {
             before(grammarAccess.getStringAttributeAccess().getGroup()); 
            // InternalExpress.g:544:3: ( rule__StringAttribute__Group__0 )
            // InternalExpress.g:544:4: rule__StringAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringAttribute"


    // $ANTLR start "entryRuleRealAttribute"
    // InternalExpress.g:553:1: entryRuleRealAttribute : ruleRealAttribute EOF ;
    public final void entryRuleRealAttribute() throws RecognitionException {
        try {
            // InternalExpress.g:554:1: ( ruleRealAttribute EOF )
            // InternalExpress.g:555:1: ruleRealAttribute EOF
            {
             before(grammarAccess.getRealAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleRealAttribute();

            state._fsp--;

             after(grammarAccess.getRealAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealAttribute"


    // $ANTLR start "ruleRealAttribute"
    // InternalExpress.g:562:1: ruleRealAttribute : ( ( rule__RealAttribute__Group__0 ) ) ;
    public final void ruleRealAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:566:2: ( ( ( rule__RealAttribute__Group__0 ) ) )
            // InternalExpress.g:567:2: ( ( rule__RealAttribute__Group__0 ) )
            {
            // InternalExpress.g:567:2: ( ( rule__RealAttribute__Group__0 ) )
            // InternalExpress.g:568:3: ( rule__RealAttribute__Group__0 )
            {
             before(grammarAccess.getRealAttributeAccess().getGroup()); 
            // InternalExpress.g:569:3: ( rule__RealAttribute__Group__0 )
            // InternalExpress.g:569:4: rule__RealAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RealAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealAttribute"


    // $ANTLR start "entryRuleBooleanAttribute"
    // InternalExpress.g:578:1: entryRuleBooleanAttribute : ruleBooleanAttribute EOF ;
    public final void entryRuleBooleanAttribute() throws RecognitionException {
        try {
            // InternalExpress.g:579:1: ( ruleBooleanAttribute EOF )
            // InternalExpress.g:580:1: ruleBooleanAttribute EOF
            {
             before(grammarAccess.getBooleanAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanAttribute();

            state._fsp--;

             after(grammarAccess.getBooleanAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanAttribute"


    // $ANTLR start "ruleBooleanAttribute"
    // InternalExpress.g:587:1: ruleBooleanAttribute : ( ( rule__BooleanAttribute__Group__0 ) ) ;
    public final void ruleBooleanAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:591:2: ( ( ( rule__BooleanAttribute__Group__0 ) ) )
            // InternalExpress.g:592:2: ( ( rule__BooleanAttribute__Group__0 ) )
            {
            // InternalExpress.g:592:2: ( ( rule__BooleanAttribute__Group__0 ) )
            // InternalExpress.g:593:3: ( rule__BooleanAttribute__Group__0 )
            {
             before(grammarAccess.getBooleanAttributeAccess().getGroup()); 
            // InternalExpress.g:594:3: ( rule__BooleanAttribute__Group__0 )
            // InternalExpress.g:594:4: rule__BooleanAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanAttribute"


    // $ANTLR start "entryRuleReferenceAttribute"
    // InternalExpress.g:603:1: entryRuleReferenceAttribute : ruleReferenceAttribute EOF ;
    public final void entryRuleReferenceAttribute() throws RecognitionException {
        try {
            // InternalExpress.g:604:1: ( ruleReferenceAttribute EOF )
            // InternalExpress.g:605:1: ruleReferenceAttribute EOF
            {
             before(grammarAccess.getReferenceAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceAttribute();

            state._fsp--;

             after(grammarAccess.getReferenceAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferenceAttribute"


    // $ANTLR start "ruleReferenceAttribute"
    // InternalExpress.g:612:1: ruleReferenceAttribute : ( ( rule__ReferenceAttribute__Group__0 ) ) ;
    public final void ruleReferenceAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:616:2: ( ( ( rule__ReferenceAttribute__Group__0 ) ) )
            // InternalExpress.g:617:2: ( ( rule__ReferenceAttribute__Group__0 ) )
            {
            // InternalExpress.g:617:2: ( ( rule__ReferenceAttribute__Group__0 ) )
            // InternalExpress.g:618:3: ( rule__ReferenceAttribute__Group__0 )
            {
             before(grammarAccess.getReferenceAttributeAccess().getGroup()); 
            // InternalExpress.g:619:3: ( rule__ReferenceAttribute__Group__0 )
            // InternalExpress.g:619:4: rule__ReferenceAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceAttribute"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalExpress.g:627:1: rule__Declaration__Alternatives : ( ( ruleUserDefinedType ) | ( ruleFunction ) | ( ruleUseFrom ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:631:1: ( ( ruleUserDefinedType ) | ( ruleFunction ) | ( ruleUseFrom ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
            case 30:
                {
                alt1=1;
                }
                break;
            case 34:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalExpress.g:632:2: ( ruleUserDefinedType )
                    {
                    // InternalExpress.g:632:2: ( ruleUserDefinedType )
                    // InternalExpress.g:633:3: ruleUserDefinedType
                    {
                     before(grammarAccess.getDeclarationAccess().getUserDefinedTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUserDefinedType();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUserDefinedTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpress.g:638:2: ( ruleFunction )
                    {
                    // InternalExpress.g:638:2: ( ruleFunction )
                    // InternalExpress.g:639:3: ruleFunction
                    {
                     before(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpress.g:644:2: ( ruleUseFrom )
                    {
                    // InternalExpress.g:644:2: ( ruleUseFrom )
                    // InternalExpress.g:645:3: ruleUseFrom
                    {
                     before(grammarAccess.getDeclarationAccess().getUseFromParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUseFrom();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUseFromParserRuleCall_2()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__ReferenceOrValue__Alternatives"
    // InternalExpress.g:654:1: rule__ReferenceOrValue__Alternatives : ( ( ( rule__ReferenceOrValue__ReferenceAssignment_0 ) ) | ( ( rule__ReferenceOrValue__ValueAssignment_1 ) ) );
    public final void rule__ReferenceOrValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:658:1: ( ( ( rule__ReferenceOrValue__ReferenceAssignment_0 ) ) | ( ( rule__ReferenceOrValue__ValueAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpress.g:659:2: ( ( rule__ReferenceOrValue__ReferenceAssignment_0 ) )
                    {
                    // InternalExpress.g:659:2: ( ( rule__ReferenceOrValue__ReferenceAssignment_0 ) )
                    // InternalExpress.g:660:3: ( rule__ReferenceOrValue__ReferenceAssignment_0 )
                    {
                     before(grammarAccess.getReferenceOrValueAccess().getReferenceAssignment_0()); 
                    // InternalExpress.g:661:3: ( rule__ReferenceOrValue__ReferenceAssignment_0 )
                    // InternalExpress.g:661:4: rule__ReferenceOrValue__ReferenceAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceOrValue__ReferenceAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceOrValueAccess().getReferenceAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpress.g:665:2: ( ( rule__ReferenceOrValue__ValueAssignment_1 ) )
                    {
                    // InternalExpress.g:665:2: ( ( rule__ReferenceOrValue__ValueAssignment_1 ) )
                    // InternalExpress.g:666:3: ( rule__ReferenceOrValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getReferenceOrValueAccess().getValueAssignment_1()); 
                    // InternalExpress.g:667:3: ( rule__ReferenceOrValue__ValueAssignment_1 )
                    // InternalExpress.g:667:4: rule__ReferenceOrValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceOrValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceOrValueAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ReferenceOrValue__Alternatives"


    // $ANTLR start "rule__ReferenceOrValue__ValueAlternatives_1_0"
    // InternalExpress.g:675:1: rule__ReferenceOrValue__ValueAlternatives_1_0 : ( ( 'INTEGER' ) | ( 'BOOLEAN' ) | ( 'STRING' ) );
    public final void rule__ReferenceOrValue__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:679:1: ( ( 'INTEGER' ) | ( 'BOOLEAN' ) | ( 'STRING' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalExpress.g:680:2: ( 'INTEGER' )
                    {
                    // InternalExpress.g:680:2: ( 'INTEGER' )
                    // InternalExpress.g:681:3: 'INTEGER'
                    {
                     before(grammarAccess.getReferenceOrValueAccess().getValueINTEGERKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getReferenceOrValueAccess().getValueINTEGERKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpress.g:686:2: ( 'BOOLEAN' )
                    {
                    // InternalExpress.g:686:2: ( 'BOOLEAN' )
                    // InternalExpress.g:687:3: 'BOOLEAN'
                    {
                     before(grammarAccess.getReferenceOrValueAccess().getValueBOOLEANKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getReferenceOrValueAccess().getValueBOOLEANKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpress.g:692:2: ( 'STRING' )
                    {
                    // InternalExpress.g:692:2: ( 'STRING' )
                    // InternalExpress.g:693:3: 'STRING'
                    {
                     before(grammarAccess.getReferenceOrValueAccess().getValueSTRINGKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getReferenceOrValueAccess().getValueSTRINGKeyword_1_0_2()); 

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
    // $ANTLR end "rule__ReferenceOrValue__ValueAlternatives_1_0"


    // $ANTLR start "rule__UserDefinedType__Alternatives"
    // InternalExpress.g:702:1: rule__UserDefinedType__Alternatives : ( ( ruleSelectType ) | ( ruleEnumerationType ) | ( ruleAliasType ) | ( ruleEntity ) );
    public final void rule__UserDefinedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:706:1: ( ( ruleSelectType ) | ( ruleEnumerationType ) | ( ruleAliasType ) | ( ruleEntity ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==24) ) {
                        switch ( input.LA(4) ) {
                        case 28:
                            {
                            alt4=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            alt4=3;
                            }
                            break;
                        case 25:
                            {
                            alt4=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==30) ) {
                alt4=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpress.g:707:2: ( ruleSelectType )
                    {
                    // InternalExpress.g:707:2: ( ruleSelectType )
                    // InternalExpress.g:708:3: ruleSelectType
                    {
                     before(grammarAccess.getUserDefinedTypeAccess().getSelectTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectType();

                    state._fsp--;

                     after(grammarAccess.getUserDefinedTypeAccess().getSelectTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpress.g:713:2: ( ruleEnumerationType )
                    {
                    // InternalExpress.g:713:2: ( ruleEnumerationType )
                    // InternalExpress.g:714:3: ruleEnumerationType
                    {
                     before(grammarAccess.getUserDefinedTypeAccess().getEnumerationTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumerationType();

                    state._fsp--;

                     after(grammarAccess.getUserDefinedTypeAccess().getEnumerationTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpress.g:719:2: ( ruleAliasType )
                    {
                    // InternalExpress.g:719:2: ( ruleAliasType )
                    // InternalExpress.g:720:3: ruleAliasType
                    {
                     before(grammarAccess.getUserDefinedTypeAccess().getAliasTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAliasType();

                    state._fsp--;

                     after(grammarAccess.getUserDefinedTypeAccess().getAliasTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpress.g:725:2: ( ruleEntity )
                    {
                    // InternalExpress.g:725:2: ( ruleEntity )
                    // InternalExpress.g:726:3: ruleEntity
                    {
                     before(grammarAccess.getUserDefinedTypeAccess().getEntityParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getUserDefinedTypeAccess().getEntityParserRuleCall_3()); 

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
    // $ANTLR end "rule__UserDefinedType__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalExpress.g:735:1: rule__Attribute__Alternatives : ( ( ruleIntegerAttribute ) | ( ruleStringAttribute ) | ( ruleRealAttribute ) | ( ruleBooleanAttribute ) | ( ruleReferenceAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:739:1: ( ( ruleIntegerAttribute ) | ( ruleStringAttribute ) | ( ruleRealAttribute ) | ( ruleBooleanAttribute ) | ( ruleReferenceAttribute ) )
            int alt5=5;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==37) ) {
                    switch ( input.LA(3) ) {
                    case 39:
                        {
                        switch ( input.LA(4) ) {
                        case 38:
                            {
                            alt5=3;
                            }
                            break;
                        case 13:
                            {
                            alt5=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            alt5=5;
                            }
                            break;
                        case 11:
                            {
                            alt5=1;
                            }
                            break;
                        case 12:
                            {
                            alt5=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 12:
                        {
                        alt5=4;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt5=5;
                        }
                        break;
                    case 11:
                        {
                        alt5=1;
                        }
                        break;
                    case 13:
                        {
                        alt5=2;
                        }
                        break;
                    case 38:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExpress.g:740:2: ( ruleIntegerAttribute )
                    {
                    // InternalExpress.g:740:2: ( ruleIntegerAttribute )
                    // InternalExpress.g:741:3: ruleIntegerAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpress.g:746:2: ( ruleStringAttribute )
                    {
                    // InternalExpress.g:746:2: ( ruleStringAttribute )
                    // InternalExpress.g:747:3: ruleStringAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpress.g:752:2: ( ruleRealAttribute )
                    {
                    // InternalExpress.g:752:2: ( ruleRealAttribute )
                    // InternalExpress.g:753:3: ruleRealAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getRealAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getRealAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpress.g:758:2: ( ruleBooleanAttribute )
                    {
                    // InternalExpress.g:758:2: ( ruleBooleanAttribute )
                    // InternalExpress.g:759:3: ruleBooleanAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpress.g:764:2: ( ruleReferenceAttribute )
                    {
                    // InternalExpress.g:764:2: ( ruleReferenceAttribute )
                    // InternalExpress.g:765:3: ruleReferenceAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getReferenceAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getReferenceAttributeParserRuleCall_4()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Schema__Group__0"
    // InternalExpress.g:774:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:778:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalExpress.g:779:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__1();

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
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // InternalExpress.g:786:1: rule__Schema__Group__0__Impl : ( 'SCHEMA' ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:790:1: ( ( 'SCHEMA' ) )
            // InternalExpress.g:791:1: ( 'SCHEMA' )
            {
            // InternalExpress.g:791:1: ( 'SCHEMA' )
            // InternalExpress.g:792:2: 'SCHEMA'
            {
             before(grammarAccess.getSchemaAccess().getSCHEMAKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSCHEMAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // InternalExpress.g:801:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:805:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalExpress.g:806:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__2();

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
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // InternalExpress.g:813:1: rule__Schema__Group__1__Impl : ( ( rule__Schema__NameAssignment_1 ) ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:817:1: ( ( ( rule__Schema__NameAssignment_1 ) ) )
            // InternalExpress.g:818:1: ( ( rule__Schema__NameAssignment_1 ) )
            {
            // InternalExpress.g:818:1: ( ( rule__Schema__NameAssignment_1 ) )
            // InternalExpress.g:819:2: ( rule__Schema__NameAssignment_1 )
            {
             before(grammarAccess.getSchemaAccess().getNameAssignment_1()); 
            // InternalExpress.g:820:2: ( rule__Schema__NameAssignment_1 )
            // InternalExpress.g:820:3: rule__Schema__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // InternalExpress.g:828:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:832:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalExpress.g:833:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__3();

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
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // InternalExpress.g:840:1: rule__Schema__Group__2__Impl : ( ';' ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:844:1: ( ( ';' ) )
            // InternalExpress.g:845:1: ( ';' )
            {
            // InternalExpress.g:845:1: ( ';' )
            // InternalExpress.g:846:2: ';'
            {
             before(grammarAccess.getSchemaAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__3"
    // InternalExpress.g:855:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:859:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalExpress.g:860:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__4();

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
    // $ANTLR end "rule__Schema__Group__3"


    // $ANTLR start "rule__Schema__Group__3__Impl"
    // InternalExpress.g:867:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__DeclarationsAssignment_3 )* ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:871:1: ( ( ( rule__Schema__DeclarationsAssignment_3 )* ) )
            // InternalExpress.g:872:1: ( ( rule__Schema__DeclarationsAssignment_3 )* )
            {
            // InternalExpress.g:872:1: ( ( rule__Schema__DeclarationsAssignment_3 )* )
            // InternalExpress.g:873:2: ( rule__Schema__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getSchemaAccess().getDeclarationsAssignment_3()); 
            // InternalExpress.g:874:2: ( rule__Schema__DeclarationsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21||LA6_0==23||LA6_0==30||LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExpress.g:874:3: rule__Schema__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Schema__DeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getDeclarationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3__Impl"


    // $ANTLR start "rule__Schema__Group__4"
    // InternalExpress.g:882:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:886:1: ( rule__Schema__Group__4__Impl )
            // InternalExpress.g:887:2: rule__Schema__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__4__Impl();

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
    // $ANTLR end "rule__Schema__Group__4"


    // $ANTLR start "rule__Schema__Group__4__Impl"
    // InternalExpress.g:893:1: rule__Schema__Group__4__Impl : ( 'END_SCHEMA;' ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:897:1: ( ( 'END_SCHEMA;' ) )
            // InternalExpress.g:898:1: ( 'END_SCHEMA;' )
            {
            // InternalExpress.g:898:1: ( 'END_SCHEMA;' )
            // InternalExpress.g:899:2: 'END_SCHEMA;'
            {
             before(grammarAccess.getSchemaAccess().getEND_SCHEMAKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getEND_SCHEMAKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4__Impl"


    // $ANTLR start "rule__UseFrom__Group__0"
    // InternalExpress.g:909:1: rule__UseFrom__Group__0 : rule__UseFrom__Group__0__Impl rule__UseFrom__Group__1 ;
    public final void rule__UseFrom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:913:1: ( rule__UseFrom__Group__0__Impl rule__UseFrom__Group__1 )
            // InternalExpress.g:914:2: rule__UseFrom__Group__0__Impl rule__UseFrom__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__UseFrom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseFrom__Group__1();

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
    // $ANTLR end "rule__UseFrom__Group__0"


    // $ANTLR start "rule__UseFrom__Group__0__Impl"
    // InternalExpress.g:921:1: rule__UseFrom__Group__0__Impl : ( 'USE' ) ;
    public final void rule__UseFrom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:925:1: ( ( 'USE' ) )
            // InternalExpress.g:926:1: ( 'USE' )
            {
            // InternalExpress.g:926:1: ( 'USE' )
            // InternalExpress.g:927:2: 'USE'
            {
             before(grammarAccess.getUseFromAccess().getUSEKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUseFromAccess().getUSEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__Group__0__Impl"


    // $ANTLR start "rule__UseFrom__Group__1"
    // InternalExpress.g:936:1: rule__UseFrom__Group__1 : rule__UseFrom__Group__1__Impl rule__UseFrom__Group__2 ;
    public final void rule__UseFrom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:940:1: ( rule__UseFrom__Group__1__Impl rule__UseFrom__Group__2 )
            // InternalExpress.g:941:2: rule__UseFrom__Group__1__Impl rule__UseFrom__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__UseFrom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseFrom__Group__2();

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
    // $ANTLR end "rule__UseFrom__Group__1"


    // $ANTLR start "rule__UseFrom__Group__1__Impl"
    // InternalExpress.g:948:1: rule__UseFrom__Group__1__Impl : ( 'FROM' ) ;
    public final void rule__UseFrom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:952:1: ( ( 'FROM' ) )
            // InternalExpress.g:953:1: ( 'FROM' )
            {
            // InternalExpress.g:953:1: ( 'FROM' )
            // InternalExpress.g:954:2: 'FROM'
            {
             before(grammarAccess.getUseFromAccess().getFROMKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUseFromAccess().getFROMKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__Group__1__Impl"


    // $ANTLR start "rule__UseFrom__Group__2"
    // InternalExpress.g:963:1: rule__UseFrom__Group__2 : rule__UseFrom__Group__2__Impl rule__UseFrom__Group__3 ;
    public final void rule__UseFrom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:967:1: ( rule__UseFrom__Group__2__Impl rule__UseFrom__Group__3 )
            // InternalExpress.g:968:2: rule__UseFrom__Group__2__Impl rule__UseFrom__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__UseFrom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseFrom__Group__3();

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
    // $ANTLR end "rule__UseFrom__Group__2"


    // $ANTLR start "rule__UseFrom__Group__2__Impl"
    // InternalExpress.g:975:1: rule__UseFrom__Group__2__Impl : ( ( rule__UseFrom__SchemaAssignment_2 ) ) ;
    public final void rule__UseFrom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:979:1: ( ( ( rule__UseFrom__SchemaAssignment_2 ) ) )
            // InternalExpress.g:980:1: ( ( rule__UseFrom__SchemaAssignment_2 ) )
            {
            // InternalExpress.g:980:1: ( ( rule__UseFrom__SchemaAssignment_2 ) )
            // InternalExpress.g:981:2: ( rule__UseFrom__SchemaAssignment_2 )
            {
             before(grammarAccess.getUseFromAccess().getSchemaAssignment_2()); 
            // InternalExpress.g:982:2: ( rule__UseFrom__SchemaAssignment_2 )
            // InternalExpress.g:982:3: rule__UseFrom__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UseFrom__SchemaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUseFromAccess().getSchemaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__Group__2__Impl"


    // $ANTLR start "rule__UseFrom__Group__3"
    // InternalExpress.g:990:1: rule__UseFrom__Group__3 : rule__UseFrom__Group__3__Impl ;
    public final void rule__UseFrom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:994:1: ( rule__UseFrom__Group__3__Impl )
            // InternalExpress.g:995:2: rule__UseFrom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseFrom__Group__3__Impl();

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
    // $ANTLR end "rule__UseFrom__Group__3"


    // $ANTLR start "rule__UseFrom__Group__3__Impl"
    // InternalExpress.g:1001:1: rule__UseFrom__Group__3__Impl : ( ( rule__UseFrom__Group_3__0 )? ) ;
    public final void rule__UseFrom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1005:1: ( ( ( rule__UseFrom__Group_3__0 )? ) )
            // InternalExpress.g:1006:1: ( ( rule__UseFrom__Group_3__0 )? )
            {
            // InternalExpress.g:1006:1: ( ( rule__UseFrom__Group_3__0 )? )
            // InternalExpress.g:1007:2: ( rule__UseFrom__Group_3__0 )?
            {
             before(grammarAccess.getUseFromAccess().getGroup_3()); 
            // InternalExpress.g:1008:2: ( rule__UseFrom__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalExpress.g:1008:3: rule__UseFrom__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseFrom__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseFromAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__Group__3__Impl"


    // $ANTLR start "rule__UseFrom__Group_3__0"
    // InternalExpress.g:1017:1: rule__UseFrom__Group_3__0 : rule__UseFrom__Group_3__0__Impl rule__UseFrom__Group_3__1 ;
    public final void rule__UseFrom__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1021:1: ( rule__UseFrom__Group_3__0__Impl rule__UseFrom__Group_3__1 )
            // InternalExpress.g:1022:2: rule__UseFrom__Group_3__0__Impl rule__UseFrom__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__UseFrom__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseFrom__Group_3__1();

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
    // $ANTLR end "rule__UseFrom__Group_3__0"


    // $ANTLR start "rule__UseFrom__Group_3__0__Impl"
    // InternalExpress.g:1029:1: rule__UseFrom__Group_3__0__Impl : ( '(' ) ;
    public final void rule__UseFrom__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1033:1: ( ( '(' ) )
            // InternalExpress.g:1034:1: ( '(' )
            {
            // InternalExpress.g:1034:1: ( '(' )
            // InternalExpress.g:1035:2: '('
            {
             before(grammarAccess.getUseFromAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUseFromAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__Group_3__0__Impl"


    // $ANTLR start "rule__UseFrom__Group_3__1"
    // InternalExpress.g:1044:1: rule__UseFrom__Group_3__1 : rule__UseFrom__Group_3__1__Impl rule__UseFrom__Group_3__2 ;
    public final void rule__UseFrom__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1048:1: ( rule__UseFrom__Group_3__1__Impl rule__UseFrom__Group_3__2 )
            // InternalExpress.g:1049:2: rule__UseFrom__Group_3__1__Impl rule__UseFrom__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__UseFrom__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseFrom__Group_3__2();

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
    // $ANTLR end "rule__UseFrom__Group_3__1"


    // $ANTLR start "rule__UseFrom__Group_3__1__Impl"
    // InternalExpress.g:1056:1: rule__UseFrom__Group_3__1__Impl : ( ( rule__UseFrom__ImportedEntitiesAssignment_3_1 ) ) ;
    public final void rule__UseFrom__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1060:1: ( ( ( rule__UseFrom__ImportedEntitiesAssignment_3_1 ) ) )
            // InternalExpress.g:1061:1: ( ( rule__UseFrom__ImportedEntitiesAssignment_3_1 ) )
            {
            // InternalExpress.g:1061:1: ( ( rule__UseFrom__ImportedEntitiesAssignment_3_1 ) )
            // InternalExpress.g:1062:2: ( rule__UseFrom__ImportedEntitiesAssignment_3_1 )
            {
             before(grammarAccess.getUseFromAccess().getImportedEntitiesAssignment_3_1()); 
            // InternalExpress.g:1063:2: ( rule__UseFrom__ImportedEntitiesAssignment_3_1 )
            // InternalExpress.g:1063:3: rule__UseFrom__ImportedEntitiesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UseFrom__ImportedEntitiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUseFromAccess().getImportedEntitiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__Group_3__1__Impl"


    // $ANTLR start "rule__UseFrom__Group_3__2"
    // InternalExpress.g:1071:1: rule__UseFrom__Group_3__2 : rule__UseFrom__Group_3__2__Impl ;
    public final void rule__UseFrom__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1075:1: ( rule__UseFrom__Group_3__2__Impl )
            // InternalExpress.g:1076:2: rule__UseFrom__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseFrom__Group_3__2__Impl();

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
    // $ANTLR end "rule__UseFrom__Group_3__2"


    // $ANTLR start "rule__UseFrom__Group_3__2__Impl"
    // InternalExpress.g:1082:1: rule__UseFrom__Group_3__2__Impl : ( ')' ) ;
    public final void rule__UseFrom__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1086:1: ( ( ')' ) )
            // InternalExpress.g:1087:1: ( ')' )
            {
            // InternalExpress.g:1087:1: ( ')' )
            // InternalExpress.g:1088:2: ')'
            {
             before(grammarAccess.getUseFromAccess().getRightParenthesisKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUseFromAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__Group_3__2__Impl"


    // $ANTLR start "rule__ImportedEntityList__Group__0"
    // InternalExpress.g:1098:1: rule__ImportedEntityList__Group__0 : rule__ImportedEntityList__Group__0__Impl rule__ImportedEntityList__Group__1 ;
    public final void rule__ImportedEntityList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1102:1: ( rule__ImportedEntityList__Group__0__Impl rule__ImportedEntityList__Group__1 )
            // InternalExpress.g:1103:2: rule__ImportedEntityList__Group__0__Impl rule__ImportedEntityList__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ImportedEntityList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedEntityList__Group__1();

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
    // $ANTLR end "rule__ImportedEntityList__Group__0"


    // $ANTLR start "rule__ImportedEntityList__Group__0__Impl"
    // InternalExpress.g:1110:1: rule__ImportedEntityList__Group__0__Impl : ( ( rule__ImportedEntityList__EntitiesAssignment_0 ) ) ;
    public final void rule__ImportedEntityList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1114:1: ( ( ( rule__ImportedEntityList__EntitiesAssignment_0 ) ) )
            // InternalExpress.g:1115:1: ( ( rule__ImportedEntityList__EntitiesAssignment_0 ) )
            {
            // InternalExpress.g:1115:1: ( ( rule__ImportedEntityList__EntitiesAssignment_0 ) )
            // InternalExpress.g:1116:2: ( rule__ImportedEntityList__EntitiesAssignment_0 )
            {
             before(grammarAccess.getImportedEntityListAccess().getEntitiesAssignment_0()); 
            // InternalExpress.g:1117:2: ( rule__ImportedEntityList__EntitiesAssignment_0 )
            // InternalExpress.g:1117:3: rule__ImportedEntityList__EntitiesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntityList__EntitiesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportedEntityListAccess().getEntitiesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntityList__Group__0__Impl"


    // $ANTLR start "rule__ImportedEntityList__Group__1"
    // InternalExpress.g:1125:1: rule__ImportedEntityList__Group__1 : rule__ImportedEntityList__Group__1__Impl ;
    public final void rule__ImportedEntityList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1129:1: ( rule__ImportedEntityList__Group__1__Impl )
            // InternalExpress.g:1130:2: rule__ImportedEntityList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntityList__Group__1__Impl();

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
    // $ANTLR end "rule__ImportedEntityList__Group__1"


    // $ANTLR start "rule__ImportedEntityList__Group__1__Impl"
    // InternalExpress.g:1136:1: rule__ImportedEntityList__Group__1__Impl : ( ( rule__ImportedEntityList__Group_1__0 )* ) ;
    public final void rule__ImportedEntityList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1140:1: ( ( ( rule__ImportedEntityList__Group_1__0 )* ) )
            // InternalExpress.g:1141:1: ( ( rule__ImportedEntityList__Group_1__0 )* )
            {
            // InternalExpress.g:1141:1: ( ( rule__ImportedEntityList__Group_1__0 )* )
            // InternalExpress.g:1142:2: ( rule__ImportedEntityList__Group_1__0 )*
            {
             before(grammarAccess.getImportedEntityListAccess().getGroup_1()); 
            // InternalExpress.g:1143:2: ( rule__ImportedEntityList__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExpress.g:1143:3: rule__ImportedEntityList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ImportedEntityList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getImportedEntityListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntityList__Group__1__Impl"


    // $ANTLR start "rule__ImportedEntityList__Group_1__0"
    // InternalExpress.g:1152:1: rule__ImportedEntityList__Group_1__0 : rule__ImportedEntityList__Group_1__0__Impl rule__ImportedEntityList__Group_1__1 ;
    public final void rule__ImportedEntityList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1156:1: ( rule__ImportedEntityList__Group_1__0__Impl rule__ImportedEntityList__Group_1__1 )
            // InternalExpress.g:1157:2: rule__ImportedEntityList__Group_1__0__Impl rule__ImportedEntityList__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ImportedEntityList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedEntityList__Group_1__1();

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
    // $ANTLR end "rule__ImportedEntityList__Group_1__0"


    // $ANTLR start "rule__ImportedEntityList__Group_1__0__Impl"
    // InternalExpress.g:1164:1: rule__ImportedEntityList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ImportedEntityList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1168:1: ( ( ',' ) )
            // InternalExpress.g:1169:1: ( ',' )
            {
            // InternalExpress.g:1169:1: ( ',' )
            // InternalExpress.g:1170:2: ','
            {
             before(grammarAccess.getImportedEntityListAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImportedEntityListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntityList__Group_1__0__Impl"


    // $ANTLR start "rule__ImportedEntityList__Group_1__1"
    // InternalExpress.g:1179:1: rule__ImportedEntityList__Group_1__1 : rule__ImportedEntityList__Group_1__1__Impl ;
    public final void rule__ImportedEntityList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1183:1: ( rule__ImportedEntityList__Group_1__1__Impl )
            // InternalExpress.g:1184:2: rule__ImportedEntityList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntityList__Group_1__1__Impl();

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
    // $ANTLR end "rule__ImportedEntityList__Group_1__1"


    // $ANTLR start "rule__ImportedEntityList__Group_1__1__Impl"
    // InternalExpress.g:1190:1: rule__ImportedEntityList__Group_1__1__Impl : ( ( rule__ImportedEntityList__EntitiesAssignment_1_1 ) ) ;
    public final void rule__ImportedEntityList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1194:1: ( ( ( rule__ImportedEntityList__EntitiesAssignment_1_1 ) ) )
            // InternalExpress.g:1195:1: ( ( rule__ImportedEntityList__EntitiesAssignment_1_1 ) )
            {
            // InternalExpress.g:1195:1: ( ( rule__ImportedEntityList__EntitiesAssignment_1_1 ) )
            // InternalExpress.g:1196:2: ( rule__ImportedEntityList__EntitiesAssignment_1_1 )
            {
             before(grammarAccess.getImportedEntityListAccess().getEntitiesAssignment_1_1()); 
            // InternalExpress.g:1197:2: ( rule__ImportedEntityList__EntitiesAssignment_1_1 )
            // InternalExpress.g:1197:3: rule__ImportedEntityList__EntitiesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntityList__EntitiesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportedEntityListAccess().getEntitiesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntityList__Group_1__1__Impl"


    // $ANTLR start "rule__ImportedEntity__Group__0"
    // InternalExpress.g:1206:1: rule__ImportedEntity__Group__0 : rule__ImportedEntity__Group__0__Impl rule__ImportedEntity__Group__1 ;
    public final void rule__ImportedEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1210:1: ( rule__ImportedEntity__Group__0__Impl rule__ImportedEntity__Group__1 )
            // InternalExpress.g:1211:2: rule__ImportedEntity__Group__0__Impl rule__ImportedEntity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ImportedEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedEntity__Group__1();

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
    // $ANTLR end "rule__ImportedEntity__Group__0"


    // $ANTLR start "rule__ImportedEntity__Group__0__Impl"
    // InternalExpress.g:1218:1: rule__ImportedEntity__Group__0__Impl : ( ( rule__ImportedEntity__EntityAssignment_0 ) ) ;
    public final void rule__ImportedEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1222:1: ( ( ( rule__ImportedEntity__EntityAssignment_0 ) ) )
            // InternalExpress.g:1223:1: ( ( rule__ImportedEntity__EntityAssignment_0 ) )
            {
            // InternalExpress.g:1223:1: ( ( rule__ImportedEntity__EntityAssignment_0 ) )
            // InternalExpress.g:1224:2: ( rule__ImportedEntity__EntityAssignment_0 )
            {
             before(grammarAccess.getImportedEntityAccess().getEntityAssignment_0()); 
            // InternalExpress.g:1225:2: ( rule__ImportedEntity__EntityAssignment_0 )
            // InternalExpress.g:1225:3: rule__ImportedEntity__EntityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntity__EntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportedEntityAccess().getEntityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntity__Group__0__Impl"


    // $ANTLR start "rule__ImportedEntity__Group__1"
    // InternalExpress.g:1233:1: rule__ImportedEntity__Group__1 : rule__ImportedEntity__Group__1__Impl ;
    public final void rule__ImportedEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1237:1: ( rule__ImportedEntity__Group__1__Impl )
            // InternalExpress.g:1238:2: rule__ImportedEntity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntity__Group__1__Impl();

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
    // $ANTLR end "rule__ImportedEntity__Group__1"


    // $ANTLR start "rule__ImportedEntity__Group__1__Impl"
    // InternalExpress.g:1244:1: rule__ImportedEntity__Group__1__Impl : ( ( rule__ImportedEntity__Group_1__0 )? ) ;
    public final void rule__ImportedEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1248:1: ( ( ( rule__ImportedEntity__Group_1__0 )? ) )
            // InternalExpress.g:1249:1: ( ( rule__ImportedEntity__Group_1__0 )? )
            {
            // InternalExpress.g:1249:1: ( ( rule__ImportedEntity__Group_1__0 )? )
            // InternalExpress.g:1250:2: ( rule__ImportedEntity__Group_1__0 )?
            {
             before(grammarAccess.getImportedEntityAccess().getGroup_1()); 
            // InternalExpress.g:1251:2: ( rule__ImportedEntity__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpress.g:1251:3: rule__ImportedEntity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedEntity__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportedEntityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntity__Group__1__Impl"


    // $ANTLR start "rule__ImportedEntity__Group_1__0"
    // InternalExpress.g:1260:1: rule__ImportedEntity__Group_1__0 : rule__ImportedEntity__Group_1__0__Impl rule__ImportedEntity__Group_1__1 ;
    public final void rule__ImportedEntity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1264:1: ( rule__ImportedEntity__Group_1__0__Impl rule__ImportedEntity__Group_1__1 )
            // InternalExpress.g:1265:2: rule__ImportedEntity__Group_1__0__Impl rule__ImportedEntity__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ImportedEntity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedEntity__Group_1__1();

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
    // $ANTLR end "rule__ImportedEntity__Group_1__0"


    // $ANTLR start "rule__ImportedEntity__Group_1__0__Impl"
    // InternalExpress.g:1272:1: rule__ImportedEntity__Group_1__0__Impl : ( 'AS' ) ;
    public final void rule__ImportedEntity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1276:1: ( ( 'AS' ) )
            // InternalExpress.g:1277:1: ( 'AS' )
            {
            // InternalExpress.g:1277:1: ( 'AS' )
            // InternalExpress.g:1278:2: 'AS'
            {
             before(grammarAccess.getImportedEntityAccess().getASKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportedEntityAccess().getASKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntity__Group_1__0__Impl"


    // $ANTLR start "rule__ImportedEntity__Group_1__1"
    // InternalExpress.g:1287:1: rule__ImportedEntity__Group_1__1 : rule__ImportedEntity__Group_1__1__Impl ;
    public final void rule__ImportedEntity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1291:1: ( rule__ImportedEntity__Group_1__1__Impl )
            // InternalExpress.g:1292:2: rule__ImportedEntity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntity__Group_1__1__Impl();

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
    // $ANTLR end "rule__ImportedEntity__Group_1__1"


    // $ANTLR start "rule__ImportedEntity__Group_1__1__Impl"
    // InternalExpress.g:1298:1: rule__ImportedEntity__Group_1__1__Impl : ( ( rule__ImportedEntity__AliasAssignment_1_1 ) ) ;
    public final void rule__ImportedEntity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1302:1: ( ( ( rule__ImportedEntity__AliasAssignment_1_1 ) ) )
            // InternalExpress.g:1303:1: ( ( rule__ImportedEntity__AliasAssignment_1_1 ) )
            {
            // InternalExpress.g:1303:1: ( ( rule__ImportedEntity__AliasAssignment_1_1 ) )
            // InternalExpress.g:1304:2: ( rule__ImportedEntity__AliasAssignment_1_1 )
            {
             before(grammarAccess.getImportedEntityAccess().getAliasAssignment_1_1()); 
            // InternalExpress.g:1305:2: ( rule__ImportedEntity__AliasAssignment_1_1 )
            // InternalExpress.g:1305:3: rule__ImportedEntity__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportedEntity__AliasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportedEntityAccess().getAliasAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntity__Group_1__1__Impl"


    // $ANTLR start "rule__SelectType__Group__0"
    // InternalExpress.g:1314:1: rule__SelectType__Group__0 : rule__SelectType__Group__0__Impl rule__SelectType__Group__1 ;
    public final void rule__SelectType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1318:1: ( rule__SelectType__Group__0__Impl rule__SelectType__Group__1 )
            // InternalExpress.g:1319:2: rule__SelectType__Group__0__Impl rule__SelectType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SelectType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectType__Group__1();

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
    // $ANTLR end "rule__SelectType__Group__0"


    // $ANTLR start "rule__SelectType__Group__0__Impl"
    // InternalExpress.g:1326:1: rule__SelectType__Group__0__Impl : ( 'TYPE' ) ;
    public final void rule__SelectType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1330:1: ( ( 'TYPE' ) )
            // InternalExpress.g:1331:1: ( 'TYPE' )
            {
            // InternalExpress.g:1331:1: ( 'TYPE' )
            // InternalExpress.g:1332:2: 'TYPE'
            {
             before(grammarAccess.getSelectTypeAccess().getTYPEKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSelectTypeAccess().getTYPEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__Group__0__Impl"


    // $ANTLR start "rule__SelectType__Group__1"
    // InternalExpress.g:1341:1: rule__SelectType__Group__1 : rule__SelectType__Group__1__Impl rule__SelectType__Group__2 ;
    public final void rule__SelectType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1345:1: ( rule__SelectType__Group__1__Impl rule__SelectType__Group__2 )
            // InternalExpress.g:1346:2: rule__SelectType__Group__1__Impl rule__SelectType__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SelectType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectType__Group__2();

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
    // $ANTLR end "rule__SelectType__Group__1"


    // $ANTLR start "rule__SelectType__Group__1__Impl"
    // InternalExpress.g:1353:1: rule__SelectType__Group__1__Impl : ( ( rule__SelectType__NameAssignment_1 ) ) ;
    public final void rule__SelectType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1357:1: ( ( ( rule__SelectType__NameAssignment_1 ) ) )
            // InternalExpress.g:1358:1: ( ( rule__SelectType__NameAssignment_1 ) )
            {
            // InternalExpress.g:1358:1: ( ( rule__SelectType__NameAssignment_1 ) )
            // InternalExpress.g:1359:2: ( rule__SelectType__NameAssignment_1 )
            {
             before(grammarAccess.getSelectTypeAccess().getNameAssignment_1()); 
            // InternalExpress.g:1360:2: ( rule__SelectType__NameAssignment_1 )
            // InternalExpress.g:1360:3: rule__SelectType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__Group__1__Impl"


    // $ANTLR start "rule__SelectType__Group__2"
    // InternalExpress.g:1368:1: rule__SelectType__Group__2 : rule__SelectType__Group__2__Impl rule__SelectType__Group__3 ;
    public final void rule__SelectType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1372:1: ( rule__SelectType__Group__2__Impl rule__SelectType__Group__3 )
            // InternalExpress.g:1373:2: rule__SelectType__Group__2__Impl rule__SelectType__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SelectType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectType__Group__3();

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
    // $ANTLR end "rule__SelectType__Group__2"


    // $ANTLR start "rule__SelectType__Group__2__Impl"
    // InternalExpress.g:1380:1: rule__SelectType__Group__2__Impl : ( '=' ) ;
    public final void rule__SelectType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1384:1: ( ( '=' ) )
            // InternalExpress.g:1385:1: ( '=' )
            {
            // InternalExpress.g:1385:1: ( '=' )
            // InternalExpress.g:1386:2: '='
            {
             before(grammarAccess.getSelectTypeAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectTypeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__Group__2__Impl"


    // $ANTLR start "rule__SelectType__Group__3"
    // InternalExpress.g:1395:1: rule__SelectType__Group__3 : rule__SelectType__Group__3__Impl rule__SelectType__Group__4 ;
    public final void rule__SelectType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1399:1: ( rule__SelectType__Group__3__Impl rule__SelectType__Group__4 )
            // InternalExpress.g:1400:2: rule__SelectType__Group__3__Impl rule__SelectType__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SelectType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectType__Group__4();

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
    // $ANTLR end "rule__SelectType__Group__3"


    // $ANTLR start "rule__SelectType__Group__3__Impl"
    // InternalExpress.g:1407:1: rule__SelectType__Group__3__Impl : ( 'SELECT' ) ;
    public final void rule__SelectType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1411:1: ( ( 'SELECT' ) )
            // InternalExpress.g:1412:1: ( 'SELECT' )
            {
            // InternalExpress.g:1412:1: ( 'SELECT' )
            // InternalExpress.g:1413:2: 'SELECT'
            {
             before(grammarAccess.getSelectTypeAccess().getSELECTKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSelectTypeAccess().getSELECTKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__Group__3__Impl"


    // $ANTLR start "rule__SelectType__Group__4"
    // InternalExpress.g:1422:1: rule__SelectType__Group__4 : rule__SelectType__Group__4__Impl rule__SelectType__Group__5 ;
    public final void rule__SelectType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1426:1: ( rule__SelectType__Group__4__Impl rule__SelectType__Group__5 )
            // InternalExpress.g:1427:2: rule__SelectType__Group__4__Impl rule__SelectType__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__SelectType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectType__Group__5();

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
    // $ANTLR end "rule__SelectType__Group__4"


    // $ANTLR start "rule__SelectType__Group__4__Impl"
    // InternalExpress.g:1434:1: rule__SelectType__Group__4__Impl : ( '(' ) ;
    public final void rule__SelectType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1438:1: ( ( '(' ) )
            // InternalExpress.g:1439:1: ( '(' )
            {
            // InternalExpress.g:1439:1: ( '(' )
            // InternalExpress.g:1440:2: '('
            {
             before(grammarAccess.getSelectTypeAccess().getLeftParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectTypeAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__Group__4__Impl"


    // $ANTLR start "rule__SelectType__Group__5"
    // InternalExpress.g:1449:1: rule__SelectType__Group__5 : rule__SelectType__Group__5__Impl rule__SelectType__Group__6 ;
    public final void rule__SelectType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1453:1: ( rule__SelectType__Group__5__Impl rule__SelectType__Group__6 )
            // InternalExpress.g:1454:2: rule__SelectType__Group__5__Impl rule__SelectType__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__SelectType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectType__Group__6();

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
    // $ANTLR end "rule__SelectType__Group__5"


    // $ANTLR start "rule__SelectType__Group__5__Impl"
    // InternalExpress.g:1461:1: rule__SelectType__Group__5__Impl : ( ( rule__SelectType__TypesAssignment_5 ) ) ;
    public final void rule__SelectType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1465:1: ( ( ( rule__SelectType__TypesAssignment_5 ) ) )
            // InternalExpress.g:1466:1: ( ( rule__SelectType__TypesAssignment_5 ) )
            {
            // InternalExpress.g:1466:1: ( ( rule__SelectType__TypesAssignment_5 ) )
            // InternalExpress.g:1467:2: ( rule__SelectType__TypesAssignment_5 )
            {
             before(grammarAccess.getSelectTypeAccess().getTypesAssignment_5()); 
            // InternalExpress.g:1468:2: ( rule__SelectType__TypesAssignment_5 )
            // InternalExpress.g:1468:3: rule__SelectType__TypesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SelectType__TypesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSelectTypeAccess().getTypesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__Group__5__Impl"


    // $ANTLR start "rule__SelectType__Group__6"
    // InternalExpress.g:1476:1: rule__SelectType__Group__6 : rule__SelectType__Group__6__Impl rule__SelectType__Group__7 ;
    public final void rule__SelectType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1480:1: ( rule__SelectType__Group__6__Impl rule__SelectType__Group__7 )
            // InternalExpress.g:1481:2: rule__SelectType__Group__6__Impl rule__SelectType__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__SelectType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectType__Group__7();

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
    // $ANTLR end "rule__SelectType__Group__6"


    // $ANTLR start "rule__SelectType__Group__6__Impl"
    // InternalExpress.g:1488:1: rule__SelectType__Group__6__Impl : ( ');' ) ;
    public final void rule__SelectType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1492:1: ( ( ');' ) )
            // InternalExpress.g:1493:1: ( ');' )
            {
            // InternalExpress.g:1493:1: ( ');' )
            // InternalExpress.g:1494:2: ');'
            {
             before(grammarAccess.getSelectTypeAccess().getRightParenthesisSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSelectTypeAccess().getRightParenthesisSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__Group__6__Impl"


    // $ANTLR start "rule__SelectType__Group__7"
    // InternalExpress.g:1503:1: rule__SelectType__Group__7 : rule__SelectType__Group__7__Impl ;
    public final void rule__SelectType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1507:1: ( rule__SelectType__Group__7__Impl )
            // InternalExpress.g:1508:2: rule__SelectType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectType__Group__7__Impl();

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
    // $ANTLR end "rule__SelectType__Group__7"


    // $ANTLR start "rule__SelectType__Group__7__Impl"
    // InternalExpress.g:1514:1: rule__SelectType__Group__7__Impl : ( 'END_TYPE;' ) ;
    public final void rule__SelectType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1518:1: ( ( 'END_TYPE;' ) )
            // InternalExpress.g:1519:1: ( 'END_TYPE;' )
            {
            // InternalExpress.g:1519:1: ( 'END_TYPE;' )
            // InternalExpress.g:1520:2: 'END_TYPE;'
            {
             before(grammarAccess.getSelectTypeAccess().getEND_TYPEKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectTypeAccess().getEND_TYPEKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__Group__7__Impl"


    // $ANTLR start "rule__EnumerationType__Group__0"
    // InternalExpress.g:1530:1: rule__EnumerationType__Group__0 : rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 ;
    public final void rule__EnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1534:1: ( rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 )
            // InternalExpress.g:1535:2: rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnumerationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__1();

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
    // $ANTLR end "rule__EnumerationType__Group__0"


    // $ANTLR start "rule__EnumerationType__Group__0__Impl"
    // InternalExpress.g:1542:1: rule__EnumerationType__Group__0__Impl : ( 'TYPE' ) ;
    public final void rule__EnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1546:1: ( ( 'TYPE' ) )
            // InternalExpress.g:1547:1: ( 'TYPE' )
            {
            // InternalExpress.g:1547:1: ( 'TYPE' )
            // InternalExpress.g:1548:2: 'TYPE'
            {
             before(grammarAccess.getEnumerationTypeAccess().getTYPEKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getTYPEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group__1"
    // InternalExpress.g:1557:1: rule__EnumerationType__Group__1 : rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 ;
    public final void rule__EnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1561:1: ( rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 )
            // InternalExpress.g:1562:2: rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__EnumerationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__2();

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
    // $ANTLR end "rule__EnumerationType__Group__1"


    // $ANTLR start "rule__EnumerationType__Group__1__Impl"
    // InternalExpress.g:1569:1: rule__EnumerationType__Group__1__Impl : ( ( rule__EnumerationType__NameAssignment_1 ) ) ;
    public final void rule__EnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1573:1: ( ( ( rule__EnumerationType__NameAssignment_1 ) ) )
            // InternalExpress.g:1574:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            {
            // InternalExpress.g:1574:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            // InternalExpress.g:1575:2: ( rule__EnumerationType__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 
            // InternalExpress.g:1576:2: ( rule__EnumerationType__NameAssignment_1 )
            // InternalExpress.g:1576:3: rule__EnumerationType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group__2"
    // InternalExpress.g:1584:1: rule__EnumerationType__Group__2 : rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 ;
    public final void rule__EnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1588:1: ( rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 )
            // InternalExpress.g:1589:2: rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__EnumerationType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__3();

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
    // $ANTLR end "rule__EnumerationType__Group__2"


    // $ANTLR start "rule__EnumerationType__Group__2__Impl"
    // InternalExpress.g:1596:1: rule__EnumerationType__Group__2__Impl : ( '=' ) ;
    public final void rule__EnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1600:1: ( ( '=' ) )
            // InternalExpress.g:1601:1: ( '=' )
            {
            // InternalExpress.g:1601:1: ( '=' )
            // InternalExpress.g:1602:2: '='
            {
             before(grammarAccess.getEnumerationTypeAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__2__Impl"


    // $ANTLR start "rule__EnumerationType__Group__3"
    // InternalExpress.g:1611:1: rule__EnumerationType__Group__3 : rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 ;
    public final void rule__EnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1615:1: ( rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 )
            // InternalExpress.g:1616:2: rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__EnumerationType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__4();

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
    // $ANTLR end "rule__EnumerationType__Group__3"


    // $ANTLR start "rule__EnumerationType__Group__3__Impl"
    // InternalExpress.g:1623:1: rule__EnumerationType__Group__3__Impl : ( 'ENUMERATION' ) ;
    public final void rule__EnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1627:1: ( ( 'ENUMERATION' ) )
            // InternalExpress.g:1628:1: ( 'ENUMERATION' )
            {
            // InternalExpress.g:1628:1: ( 'ENUMERATION' )
            // InternalExpress.g:1629:2: 'ENUMERATION'
            {
             before(grammarAccess.getEnumerationTypeAccess().getENUMERATIONKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getENUMERATIONKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__3__Impl"


    // $ANTLR start "rule__EnumerationType__Group__4"
    // InternalExpress.g:1638:1: rule__EnumerationType__Group__4 : rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 ;
    public final void rule__EnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1642:1: ( rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 )
            // InternalExpress.g:1643:2: rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__EnumerationType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__5();

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
    // $ANTLR end "rule__EnumerationType__Group__4"


    // $ANTLR start "rule__EnumerationType__Group__4__Impl"
    // InternalExpress.g:1650:1: rule__EnumerationType__Group__4__Impl : ( 'OF' ) ;
    public final void rule__EnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1654:1: ( ( 'OF' ) )
            // InternalExpress.g:1655:1: ( 'OF' )
            {
            // InternalExpress.g:1655:1: ( 'OF' )
            // InternalExpress.g:1656:2: 'OF'
            {
             before(grammarAccess.getEnumerationTypeAccess().getOFKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getOFKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__4__Impl"


    // $ANTLR start "rule__EnumerationType__Group__5"
    // InternalExpress.g:1665:1: rule__EnumerationType__Group__5 : rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 ;
    public final void rule__EnumerationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1669:1: ( rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 )
            // InternalExpress.g:1670:2: rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__EnumerationType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__6();

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
    // $ANTLR end "rule__EnumerationType__Group__5"


    // $ANTLR start "rule__EnumerationType__Group__5__Impl"
    // InternalExpress.g:1677:1: rule__EnumerationType__Group__5__Impl : ( '(' ) ;
    public final void rule__EnumerationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1681:1: ( ( '(' ) )
            // InternalExpress.g:1682:1: ( '(' )
            {
            // InternalExpress.g:1682:1: ( '(' )
            // InternalExpress.g:1683:2: '('
            {
             before(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__5__Impl"


    // $ANTLR start "rule__EnumerationType__Group__6"
    // InternalExpress.g:1692:1: rule__EnumerationType__Group__6 : rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7 ;
    public final void rule__EnumerationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1696:1: ( rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7 )
            // InternalExpress.g:1697:2: rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__EnumerationType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__7();

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
    // $ANTLR end "rule__EnumerationType__Group__6"


    // $ANTLR start "rule__EnumerationType__Group__6__Impl"
    // InternalExpress.g:1704:1: rule__EnumerationType__Group__6__Impl : ( ( rule__EnumerationType__ValuesAssignment_6 ) ) ;
    public final void rule__EnumerationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1708:1: ( ( ( rule__EnumerationType__ValuesAssignment_6 ) ) )
            // InternalExpress.g:1709:1: ( ( rule__EnumerationType__ValuesAssignment_6 ) )
            {
            // InternalExpress.g:1709:1: ( ( rule__EnumerationType__ValuesAssignment_6 ) )
            // InternalExpress.g:1710:2: ( rule__EnumerationType__ValuesAssignment_6 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getValuesAssignment_6()); 
            // InternalExpress.g:1711:2: ( rule__EnumerationType__ValuesAssignment_6 )
            // InternalExpress.g:1711:3: rule__EnumerationType__ValuesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__ValuesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getValuesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__6__Impl"


    // $ANTLR start "rule__EnumerationType__Group__7"
    // InternalExpress.g:1719:1: rule__EnumerationType__Group__7 : rule__EnumerationType__Group__7__Impl rule__EnumerationType__Group__8 ;
    public final void rule__EnumerationType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1723:1: ( rule__EnumerationType__Group__7__Impl rule__EnumerationType__Group__8 )
            // InternalExpress.g:1724:2: rule__EnumerationType__Group__7__Impl rule__EnumerationType__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__EnumerationType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__8();

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
    // $ANTLR end "rule__EnumerationType__Group__7"


    // $ANTLR start "rule__EnumerationType__Group__7__Impl"
    // InternalExpress.g:1731:1: rule__EnumerationType__Group__7__Impl : ( ( rule__EnumerationType__Group_7__0 )? ) ;
    public final void rule__EnumerationType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1735:1: ( ( ( rule__EnumerationType__Group_7__0 )? ) )
            // InternalExpress.g:1736:1: ( ( rule__EnumerationType__Group_7__0 )? )
            {
            // InternalExpress.g:1736:1: ( ( rule__EnumerationType__Group_7__0 )? )
            // InternalExpress.g:1737:2: ( rule__EnumerationType__Group_7__0 )?
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup_7()); 
            // InternalExpress.g:1738:2: ( rule__EnumerationType__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpress.g:1738:3: rule__EnumerationType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationType__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationTypeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__7__Impl"


    // $ANTLR start "rule__EnumerationType__Group__8"
    // InternalExpress.g:1746:1: rule__EnumerationType__Group__8 : rule__EnumerationType__Group__8__Impl rule__EnumerationType__Group__9 ;
    public final void rule__EnumerationType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1750:1: ( rule__EnumerationType__Group__8__Impl rule__EnumerationType__Group__9 )
            // InternalExpress.g:1751:2: rule__EnumerationType__Group__8__Impl rule__EnumerationType__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__EnumerationType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__9();

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
    // $ANTLR end "rule__EnumerationType__Group__8"


    // $ANTLR start "rule__EnumerationType__Group__8__Impl"
    // InternalExpress.g:1758:1: rule__EnumerationType__Group__8__Impl : ( ');' ) ;
    public final void rule__EnumerationType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1762:1: ( ( ');' ) )
            // InternalExpress.g:1763:1: ( ');' )
            {
            // InternalExpress.g:1763:1: ( ');' )
            // InternalExpress.g:1764:2: ');'
            {
             before(grammarAccess.getEnumerationTypeAccess().getRightParenthesisSemicolonKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getRightParenthesisSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__8__Impl"


    // $ANTLR start "rule__EnumerationType__Group__9"
    // InternalExpress.g:1773:1: rule__EnumerationType__Group__9 : rule__EnumerationType__Group__9__Impl ;
    public final void rule__EnumerationType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1777:1: ( rule__EnumerationType__Group__9__Impl )
            // InternalExpress.g:1778:2: rule__EnumerationType__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__9__Impl();

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
    // $ANTLR end "rule__EnumerationType__Group__9"


    // $ANTLR start "rule__EnumerationType__Group__9__Impl"
    // InternalExpress.g:1784:1: rule__EnumerationType__Group__9__Impl : ( 'END_TYPE;' ) ;
    public final void rule__EnumerationType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1788:1: ( ( 'END_TYPE;' ) )
            // InternalExpress.g:1789:1: ( 'END_TYPE;' )
            {
            // InternalExpress.g:1789:1: ( 'END_TYPE;' )
            // InternalExpress.g:1790:2: 'END_TYPE;'
            {
             before(grammarAccess.getEnumerationTypeAccess().getEND_TYPEKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getEND_TYPEKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__9__Impl"


    // $ANTLR start "rule__EnumerationType__Group_7__0"
    // InternalExpress.g:1800:1: rule__EnumerationType__Group_7__0 : rule__EnumerationType__Group_7__0__Impl rule__EnumerationType__Group_7__1 ;
    public final void rule__EnumerationType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1804:1: ( rule__EnumerationType__Group_7__0__Impl rule__EnumerationType__Group_7__1 )
            // InternalExpress.g:1805:2: rule__EnumerationType__Group_7__0__Impl rule__EnumerationType__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__EnumerationType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_7__1();

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
    // $ANTLR end "rule__EnumerationType__Group_7__0"


    // $ANTLR start "rule__EnumerationType__Group_7__0__Impl"
    // InternalExpress.g:1812:1: rule__EnumerationType__Group_7__0__Impl : ( ',' ) ;
    public final void rule__EnumerationType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1816:1: ( ( ',' ) )
            // InternalExpress.g:1817:1: ( ',' )
            {
            // InternalExpress.g:1817:1: ( ',' )
            // InternalExpress.g:1818:2: ','
            {
             before(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_7__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group_7__1"
    // InternalExpress.g:1827:1: rule__EnumerationType__Group_7__1 : rule__EnumerationType__Group_7__1__Impl ;
    public final void rule__EnumerationType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1831:1: ( rule__EnumerationType__Group_7__1__Impl )
            // InternalExpress.g:1832:2: rule__EnumerationType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_7__1__Impl();

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
    // $ANTLR end "rule__EnumerationType__Group_7__1"


    // $ANTLR start "rule__EnumerationType__Group_7__1__Impl"
    // InternalExpress.g:1838:1: rule__EnumerationType__Group_7__1__Impl : ( ( rule__EnumerationType__ValuesAssignment_7_1 ) ) ;
    public final void rule__EnumerationType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1842:1: ( ( ( rule__EnumerationType__ValuesAssignment_7_1 ) ) )
            // InternalExpress.g:1843:1: ( ( rule__EnumerationType__ValuesAssignment_7_1 ) )
            {
            // InternalExpress.g:1843:1: ( ( rule__EnumerationType__ValuesAssignment_7_1 ) )
            // InternalExpress.g:1844:2: ( rule__EnumerationType__ValuesAssignment_7_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getValuesAssignment_7_1()); 
            // InternalExpress.g:1845:2: ( rule__EnumerationType__ValuesAssignment_7_1 )
            // InternalExpress.g:1845:3: rule__EnumerationType__ValuesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__ValuesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getValuesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_7__1__Impl"


    // $ANTLR start "rule__AliasType__Group__0"
    // InternalExpress.g:1854:1: rule__AliasType__Group__0 : rule__AliasType__Group__0__Impl rule__AliasType__Group__1 ;
    public final void rule__AliasType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1858:1: ( rule__AliasType__Group__0__Impl rule__AliasType__Group__1 )
            // InternalExpress.g:1859:2: rule__AliasType__Group__0__Impl rule__AliasType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AliasType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasType__Group__1();

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
    // $ANTLR end "rule__AliasType__Group__0"


    // $ANTLR start "rule__AliasType__Group__0__Impl"
    // InternalExpress.g:1866:1: rule__AliasType__Group__0__Impl : ( 'TYPE' ) ;
    public final void rule__AliasType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1870:1: ( ( 'TYPE' ) )
            // InternalExpress.g:1871:1: ( 'TYPE' )
            {
            // InternalExpress.g:1871:1: ( 'TYPE' )
            // InternalExpress.g:1872:2: 'TYPE'
            {
             before(grammarAccess.getAliasTypeAccess().getTYPEKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAliasTypeAccess().getTYPEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasType__Group__0__Impl"


    // $ANTLR start "rule__AliasType__Group__1"
    // InternalExpress.g:1881:1: rule__AliasType__Group__1 : rule__AliasType__Group__1__Impl rule__AliasType__Group__2 ;
    public final void rule__AliasType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1885:1: ( rule__AliasType__Group__1__Impl rule__AliasType__Group__2 )
            // InternalExpress.g:1886:2: rule__AliasType__Group__1__Impl rule__AliasType__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AliasType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasType__Group__2();

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
    // $ANTLR end "rule__AliasType__Group__1"


    // $ANTLR start "rule__AliasType__Group__1__Impl"
    // InternalExpress.g:1893:1: rule__AliasType__Group__1__Impl : ( ( rule__AliasType__NameAssignment_1 ) ) ;
    public final void rule__AliasType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1897:1: ( ( ( rule__AliasType__NameAssignment_1 ) ) )
            // InternalExpress.g:1898:1: ( ( rule__AliasType__NameAssignment_1 ) )
            {
            // InternalExpress.g:1898:1: ( ( rule__AliasType__NameAssignment_1 ) )
            // InternalExpress.g:1899:2: ( rule__AliasType__NameAssignment_1 )
            {
             before(grammarAccess.getAliasTypeAccess().getNameAssignment_1()); 
            // InternalExpress.g:1900:2: ( rule__AliasType__NameAssignment_1 )
            // InternalExpress.g:1900:3: rule__AliasType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AliasType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasType__Group__1__Impl"


    // $ANTLR start "rule__AliasType__Group__2"
    // InternalExpress.g:1908:1: rule__AliasType__Group__2 : rule__AliasType__Group__2__Impl rule__AliasType__Group__3 ;
    public final void rule__AliasType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1912:1: ( rule__AliasType__Group__2__Impl rule__AliasType__Group__3 )
            // InternalExpress.g:1913:2: rule__AliasType__Group__2__Impl rule__AliasType__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__AliasType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasType__Group__3();

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
    // $ANTLR end "rule__AliasType__Group__2"


    // $ANTLR start "rule__AliasType__Group__2__Impl"
    // InternalExpress.g:1920:1: rule__AliasType__Group__2__Impl : ( '=' ) ;
    public final void rule__AliasType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1924:1: ( ( '=' ) )
            // InternalExpress.g:1925:1: ( '=' )
            {
            // InternalExpress.g:1925:1: ( '=' )
            // InternalExpress.g:1926:2: '='
            {
             before(grammarAccess.getAliasTypeAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAliasTypeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasType__Group__2__Impl"


    // $ANTLR start "rule__AliasType__Group__3"
    // InternalExpress.g:1935:1: rule__AliasType__Group__3 : rule__AliasType__Group__3__Impl rule__AliasType__Group__4 ;
    public final void rule__AliasType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1939:1: ( rule__AliasType__Group__3__Impl rule__AliasType__Group__4 )
            // InternalExpress.g:1940:2: rule__AliasType__Group__3__Impl rule__AliasType__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AliasType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasType__Group__4();

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
    // $ANTLR end "rule__AliasType__Group__3"


    // $ANTLR start "rule__AliasType__Group__3__Impl"
    // InternalExpress.g:1947:1: rule__AliasType__Group__3__Impl : ( ( rule__AliasType__ElementAssignment_3 ) ) ;
    public final void rule__AliasType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1951:1: ( ( ( rule__AliasType__ElementAssignment_3 ) ) )
            // InternalExpress.g:1952:1: ( ( rule__AliasType__ElementAssignment_3 ) )
            {
            // InternalExpress.g:1952:1: ( ( rule__AliasType__ElementAssignment_3 ) )
            // InternalExpress.g:1953:2: ( rule__AliasType__ElementAssignment_3 )
            {
             before(grammarAccess.getAliasTypeAccess().getElementAssignment_3()); 
            // InternalExpress.g:1954:2: ( rule__AliasType__ElementAssignment_3 )
            // InternalExpress.g:1954:3: rule__AliasType__ElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AliasType__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAliasTypeAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasType__Group__3__Impl"


    // $ANTLR start "rule__AliasType__Group__4"
    // InternalExpress.g:1962:1: rule__AliasType__Group__4 : rule__AliasType__Group__4__Impl rule__AliasType__Group__5 ;
    public final void rule__AliasType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1966:1: ( rule__AliasType__Group__4__Impl rule__AliasType__Group__5 )
            // InternalExpress.g:1967:2: rule__AliasType__Group__4__Impl rule__AliasType__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__AliasType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasType__Group__5();

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
    // $ANTLR end "rule__AliasType__Group__4"


    // $ANTLR start "rule__AliasType__Group__4__Impl"
    // InternalExpress.g:1974:1: rule__AliasType__Group__4__Impl : ( ';' ) ;
    public final void rule__AliasType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1978:1: ( ( ';' ) )
            // InternalExpress.g:1979:1: ( ';' )
            {
            // InternalExpress.g:1979:1: ( ';' )
            // InternalExpress.g:1980:2: ';'
            {
             before(grammarAccess.getAliasTypeAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAliasTypeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasType__Group__4__Impl"


    // $ANTLR start "rule__AliasType__Group__5"
    // InternalExpress.g:1989:1: rule__AliasType__Group__5 : rule__AliasType__Group__5__Impl ;
    public final void rule__AliasType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:1993:1: ( rule__AliasType__Group__5__Impl )
            // InternalExpress.g:1994:2: rule__AliasType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasType__Group__5__Impl();

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
    // $ANTLR end "rule__AliasType__Group__5"


    // $ANTLR start "rule__AliasType__Group__5__Impl"
    // InternalExpress.g:2000:1: rule__AliasType__Group__5__Impl : ( 'END_TYPE;' ) ;
    public final void rule__AliasType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2004:1: ( ( 'END_TYPE;' ) )
            // InternalExpress.g:2005:1: ( 'END_TYPE;' )
            {
            // InternalExpress.g:2005:1: ( 'END_TYPE;' )
            // InternalExpress.g:2006:2: 'END_TYPE;'
            {
             before(grammarAccess.getAliasTypeAccess().getEND_TYPEKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAliasTypeAccess().getEND_TYPEKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasType__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalExpress.g:2016:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2020:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalExpress.g:2021:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalExpress.g:2028:1: rule__Entity__Group__0__Impl : ( 'ENTITY' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2032:1: ( ( 'ENTITY' ) )
            // InternalExpress.g:2033:1: ( 'ENTITY' )
            {
            // InternalExpress.g:2033:1: ( 'ENTITY' )
            // InternalExpress.g:2034:2: 'ENTITY'
            {
             before(grammarAccess.getEntityAccess().getENTITYKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getENTITYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalExpress.g:2043:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2047:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalExpress.g:2048:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalExpress.g:2055:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2059:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalExpress.g:2060:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalExpress.g:2060:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalExpress.g:2061:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalExpress.g:2062:2: ( rule__Entity__NameAssignment_1 )
            // InternalExpress.g:2062:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalExpress.g:2070:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2074:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalExpress.g:2075:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalExpress.g:2082:1: rule__Entity__Group__2__Impl : ( ';' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2086:1: ( ( ';' ) )
            // InternalExpress.g:2087:1: ( ';' )
            {
            // InternalExpress.g:2087:1: ( ';' )
            // InternalExpress.g:2088:2: ';'
            {
             before(grammarAccess.getEntityAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalExpress.g:2097:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2101:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalExpress.g:2102:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalExpress.g:2109:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2113:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalExpress.g:2114:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalExpress.g:2114:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalExpress.g:2115:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalExpress.g:2116:2: ( rule__Entity__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalExpress.g:2116:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalExpress.g:2124:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2128:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalExpress.g:2129:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalExpress.g:2136:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2140:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalExpress.g:2141:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalExpress.g:2141:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalExpress.g:2142:2: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalExpress.g:2143:2: ( rule__Entity__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalExpress.g:2143:3: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalExpress.g:2151:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2155:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalExpress.g:2156:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalExpress.g:2163:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__AttributesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2167:1: ( ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // InternalExpress.g:2168:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // InternalExpress.g:2168:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            // InternalExpress.g:2169:2: ( rule__Entity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            // InternalExpress.g:2170:2: ( rule__Entity__AttributesAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExpress.g:2170:3: rule__Entity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Entity__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalExpress.g:2178:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2182:1: ( rule__Entity__Group__6__Impl )
            // InternalExpress.g:2183:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalExpress.g:2189:1: rule__Entity__Group__6__Impl : ( 'END_ENTITY;' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2193:1: ( ( 'END_ENTITY;' ) )
            // InternalExpress.g:2194:1: ( 'END_ENTITY;' )
            {
            // InternalExpress.g:2194:1: ( 'END_ENTITY;' )
            // InternalExpress.g:2195:2: 'END_ENTITY;'
            {
             before(grammarAccess.getEntityAccess().getEND_ENTITYKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEND_ENTITYKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalExpress.g:2205:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2209:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalExpress.g:2210:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalExpress.g:2217:1: rule__Entity__Group_3__0__Impl : ( 'SUPERTYPE' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2221:1: ( ( 'SUPERTYPE' ) )
            // InternalExpress.g:2222:1: ( 'SUPERTYPE' )
            {
            // InternalExpress.g:2222:1: ( 'SUPERTYPE' )
            // InternalExpress.g:2223:2: 'SUPERTYPE'
            {
             before(grammarAccess.getEntityAccess().getSUPERTYPEKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSUPERTYPEKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalExpress.g:2232:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2236:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalExpress.g:2237:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__2();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalExpress.g:2244:1: rule__Entity__Group_3__1__Impl : ( 'OF' ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2248:1: ( ( 'OF' ) )
            // InternalExpress.g:2249:1: ( 'OF' )
            {
            // InternalExpress.g:2249:1: ( 'OF' )
            // InternalExpress.g:2250:2: 'OF'
            {
             before(grammarAccess.getEntityAccess().getOFKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getOFKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // InternalExpress.g:2259:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2263:1: ( rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 )
            // InternalExpress.g:2264:2: rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__3();

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
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // InternalExpress.g:2271:1: rule__Entity__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2275:1: ( ( '(' ) )
            // InternalExpress.g:2276:1: ( '(' )
            {
            // InternalExpress.g:2276:1: ( '(' )
            // InternalExpress.g:2277:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__Entity__Group_3__3"
    // InternalExpress.g:2286:1: rule__Entity__Group_3__3 : rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 ;
    public final void rule__Entity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2290:1: ( rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 )
            // InternalExpress.g:2291:2: rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__4();

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
    // $ANTLR end "rule__Entity__Group_3__3"


    // $ANTLR start "rule__Entity__Group_3__3__Impl"
    // InternalExpress.g:2298:1: rule__Entity__Group_3__3__Impl : ( ( rule__Entity__SubTypeAssignment_3_3 ) ) ;
    public final void rule__Entity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2302:1: ( ( ( rule__Entity__SubTypeAssignment_3_3 ) ) )
            // InternalExpress.g:2303:1: ( ( rule__Entity__SubTypeAssignment_3_3 ) )
            {
            // InternalExpress.g:2303:1: ( ( rule__Entity__SubTypeAssignment_3_3 ) )
            // InternalExpress.g:2304:2: ( rule__Entity__SubTypeAssignment_3_3 )
            {
             before(grammarAccess.getEntityAccess().getSubTypeAssignment_3_3()); 
            // InternalExpress.g:2305:2: ( rule__Entity__SubTypeAssignment_3_3 )
            // InternalExpress.g:2305:3: rule__Entity__SubTypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SubTypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSubTypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__3__Impl"


    // $ANTLR start "rule__Entity__Group_3__4"
    // InternalExpress.g:2313:1: rule__Entity__Group_3__4 : rule__Entity__Group_3__4__Impl ;
    public final void rule__Entity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2317:1: ( rule__Entity__Group_3__4__Impl )
            // InternalExpress.g:2318:2: rule__Entity__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__4"


    // $ANTLR start "rule__Entity__Group_3__4__Impl"
    // InternalExpress.g:2324:1: rule__Entity__Group_3__4__Impl : ( ');' ) ;
    public final void rule__Entity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2328:1: ( ( ');' ) )
            // InternalExpress.g:2329:1: ( ');' )
            {
            // InternalExpress.g:2329:1: ( ');' )
            // InternalExpress.g:2330:2: ');'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisSemicolonKeyword_3_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightParenthesisSemicolonKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__4__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalExpress.g:2340:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2344:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalExpress.g:2345:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalExpress.g:2352:1: rule__Entity__Group_4__0__Impl : ( 'SUBTYPE' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2356:1: ( ( 'SUBTYPE' ) )
            // InternalExpress.g:2357:1: ( 'SUBTYPE' )
            {
            // InternalExpress.g:2357:1: ( 'SUBTYPE' )
            // InternalExpress.g:2358:2: 'SUBTYPE'
            {
             before(grammarAccess.getEntityAccess().getSUBTYPEKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSUBTYPEKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalExpress.g:2367:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2371:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // InternalExpress.g:2372:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__2();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalExpress.g:2379:1: rule__Entity__Group_4__1__Impl : ( 'OF' ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2383:1: ( ( 'OF' ) )
            // InternalExpress.g:2384:1: ( 'OF' )
            {
            // InternalExpress.g:2384:1: ( 'OF' )
            // InternalExpress.g:2385:2: 'OF'
            {
             before(grammarAccess.getEntityAccess().getOFKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getOFKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__2"
    // InternalExpress.g:2394:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2398:1: ( rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 )
            // InternalExpress.g:2399:2: rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__3();

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
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // InternalExpress.g:2406:1: rule__Entity__Group_4__2__Impl : ( '(' ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2410:1: ( ( '(' ) )
            // InternalExpress.g:2411:1: ( '(' )
            {
            // InternalExpress.g:2411:1: ( '(' )
            // InternalExpress.g:2412:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_4__3"
    // InternalExpress.g:2421:1: rule__Entity__Group_4__3 : rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 ;
    public final void rule__Entity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2425:1: ( rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 )
            // InternalExpress.g:2426:2: rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4();

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
    // $ANTLR end "rule__Entity__Group_4__3"


    // $ANTLR start "rule__Entity__Group_4__3__Impl"
    // InternalExpress.g:2433:1: rule__Entity__Group_4__3__Impl : ( ( rule__Entity__SuperTypeAssignment_4_3 ) ) ;
    public final void rule__Entity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2437:1: ( ( ( rule__Entity__SuperTypeAssignment_4_3 ) ) )
            // InternalExpress.g:2438:1: ( ( rule__Entity__SuperTypeAssignment_4_3 ) )
            {
            // InternalExpress.g:2438:1: ( ( rule__Entity__SuperTypeAssignment_4_3 ) )
            // InternalExpress.g:2439:2: ( rule__Entity__SuperTypeAssignment_4_3 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_4_3()); 
            // InternalExpress.g:2440:2: ( rule__Entity__SuperTypeAssignment_4_3 )
            // InternalExpress.g:2440:3: rule__Entity__SuperTypeAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__3__Impl"


    // $ANTLR start "rule__Entity__Group_4__4"
    // InternalExpress.g:2448:1: rule__Entity__Group_4__4 : rule__Entity__Group_4__4__Impl ;
    public final void rule__Entity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2452:1: ( rule__Entity__Group_4__4__Impl )
            // InternalExpress.g:2453:2: rule__Entity__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__4"


    // $ANTLR start "rule__Entity__Group_4__4__Impl"
    // InternalExpress.g:2459:1: rule__Entity__Group_4__4__Impl : ( ');' ) ;
    public final void rule__Entity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2463:1: ( ( ');' ) )
            // InternalExpress.g:2464:1: ( ');' )
            {
            // InternalExpress.g:2464:1: ( ');' )
            // InternalExpress.g:2465:2: ');'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisSemicolonKeyword_4_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightParenthesisSemicolonKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__4__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalExpress.g:2475:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2479:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalExpress.g:2480:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalExpress.g:2487:1: rule__Function__Group__0__Impl : ( 'FUNCTION' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2491:1: ( ( 'FUNCTION' ) )
            // InternalExpress.g:2492:1: ( 'FUNCTION' )
            {
            // InternalExpress.g:2492:1: ( 'FUNCTION' )
            // InternalExpress.g:2493:2: 'FUNCTION'
            {
             before(grammarAccess.getFunctionAccess().getFUNCTIONKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFUNCTIONKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalExpress.g:2502:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2506:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalExpress.g:2507:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalExpress.g:2514:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2518:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalExpress.g:2519:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalExpress.g:2519:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalExpress.g:2520:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalExpress.g:2521:2: ( rule__Function__NameAssignment_1 )
            // InternalExpress.g:2521:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalExpress.g:2529:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2533:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalExpress.g:2534:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalExpress.g:2541:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2545:1: ( ( '(' ) )
            // InternalExpress.g:2546:1: ( '(' )
            {
            // InternalExpress.g:2546:1: ( '(' )
            // InternalExpress.g:2547:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalExpress.g:2556:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2560:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalExpress.g:2561:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalExpress.g:2568:1: rule__Function__Group__3__Impl : ( ( rule__Function__ParametersAssignment_3 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2572:1: ( ( ( rule__Function__ParametersAssignment_3 )? ) )
            // InternalExpress.g:2573:1: ( ( rule__Function__ParametersAssignment_3 )? )
            {
            // InternalExpress.g:2573:1: ( ( rule__Function__ParametersAssignment_3 )? )
            // InternalExpress.g:2574:2: ( rule__Function__ParametersAssignment_3 )?
            {
             before(grammarAccess.getFunctionAccess().getParametersAssignment_3()); 
            // InternalExpress.g:2575:2: ( rule__Function__ParametersAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalExpress.g:2575:3: rule__Function__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__ParametersAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalExpress.g:2583:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2587:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalExpress.g:2588:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalExpress.g:2595:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2599:1: ( ( ')' ) )
            // InternalExpress.g:2600:1: ( ')' )
            {
            // InternalExpress.g:2600:1: ( ')' )
            // InternalExpress.g:2601:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalExpress.g:2610:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2614:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalExpress.g:2615:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalExpress.g:2622:1: rule__Function__Group__5__Impl : ( ( rule__Function__Group_5__0 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2626:1: ( ( ( rule__Function__Group_5__0 ) ) )
            // InternalExpress.g:2627:1: ( ( rule__Function__Group_5__0 ) )
            {
            // InternalExpress.g:2627:1: ( ( rule__Function__Group_5__0 ) )
            // InternalExpress.g:2628:2: ( rule__Function__Group_5__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup_5()); 
            // InternalExpress.g:2629:2: ( rule__Function__Group_5__0 )
            // InternalExpress.g:2629:3: rule__Function__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalExpress.g:2637:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2641:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // InternalExpress.g:2642:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__7();

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
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalExpress.g:2649:1: rule__Function__Group__6__Impl : ( ';' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2653:1: ( ( ';' ) )
            // InternalExpress.g:2654:1: ( ';' )
            {
            // InternalExpress.g:2654:1: ( ';' )
            // InternalExpress.g:2655:2: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__7"
    // InternalExpress.g:2664:1: rule__Function__Group__7 : rule__Function__Group__7__Impl rule__Function__Group__8 ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2668:1: ( rule__Function__Group__7__Impl rule__Function__Group__8 )
            // InternalExpress.g:2669:2: rule__Function__Group__7__Impl rule__Function__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Function__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__8();

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
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // InternalExpress.g:2676:1: rule__Function__Group__7__Impl : ( '...' ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2680:1: ( ( '...' ) )
            // InternalExpress.g:2681:1: ( '...' )
            {
            // InternalExpress.g:2681:1: ( '...' )
            // InternalExpress.g:2682:2: '...'
            {
             before(grammarAccess.getFunctionAccess().getFullStopFullStopFullStopKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFullStopFullStopFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Function__Group__8"
    // InternalExpress.g:2691:1: rule__Function__Group__8 : rule__Function__Group__8__Impl ;
    public final void rule__Function__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2695:1: ( rule__Function__Group__8__Impl )
            // InternalExpress.g:2696:2: rule__Function__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__8__Impl();

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
    // $ANTLR end "rule__Function__Group__8"


    // $ANTLR start "rule__Function__Group__8__Impl"
    // InternalExpress.g:2702:1: rule__Function__Group__8__Impl : ( 'END_FUNCTION;' ) ;
    public final void rule__Function__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2706:1: ( ( 'END_FUNCTION;' ) )
            // InternalExpress.g:2707:1: ( 'END_FUNCTION;' )
            {
            // InternalExpress.g:2707:1: ( 'END_FUNCTION;' )
            // InternalExpress.g:2708:2: 'END_FUNCTION;'
            {
             before(grammarAccess.getFunctionAccess().getEND_FUNCTIONKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getEND_FUNCTIONKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__8__Impl"


    // $ANTLR start "rule__Function__Group_5__0"
    // InternalExpress.g:2718:1: rule__Function__Group_5__0 : rule__Function__Group_5__0__Impl rule__Function__Group_5__1 ;
    public final void rule__Function__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2722:1: ( rule__Function__Group_5__0__Impl rule__Function__Group_5__1 )
            // InternalExpress.g:2723:2: rule__Function__Group_5__0__Impl rule__Function__Group_5__1
            {
            pushFollow(FOLLOW_26);
            rule__Function__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_5__1();

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
    // $ANTLR end "rule__Function__Group_5__0"


    // $ANTLR start "rule__Function__Group_5__0__Impl"
    // InternalExpress.g:2730:1: rule__Function__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Function__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2734:1: ( ( ':' ) )
            // InternalExpress.g:2735:1: ( ':' )
            {
            // InternalExpress.g:2735:1: ( ':' )
            // InternalExpress.g:2736:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_5__0__Impl"


    // $ANTLR start "rule__Function__Group_5__1"
    // InternalExpress.g:2745:1: rule__Function__Group_5__1 : rule__Function__Group_5__1__Impl ;
    public final void rule__Function__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2749:1: ( rule__Function__Group_5__1__Impl )
            // InternalExpress.g:2750:2: rule__Function__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_5__1__Impl();

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
    // $ANTLR end "rule__Function__Group_5__1"


    // $ANTLR start "rule__Function__Group_5__1__Impl"
    // InternalExpress.g:2756:1: rule__Function__Group_5__1__Impl : ( ( rule__Function__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__Function__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2760:1: ( ( ( rule__Function__ReturnTypeAssignment_5_1 ) ) )
            // InternalExpress.g:2761:1: ( ( rule__Function__ReturnTypeAssignment_5_1 ) )
            {
            // InternalExpress.g:2761:1: ( ( rule__Function__ReturnTypeAssignment_5_1 ) )
            // InternalExpress.g:2762:2: ( rule__Function__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeAssignment_5_1()); 
            // InternalExpress.g:2763:2: ( rule__Function__ReturnTypeAssignment_5_1 )
            // InternalExpress.g:2763:3: rule__Function__ReturnTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__ReturnTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getReturnTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_5__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // InternalExpress.g:2772:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2776:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalExpress.g:2777:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__1();

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
    // $ANTLR end "rule__ParameterList__Group__0"


    // $ANTLR start "rule__ParameterList__Group__0__Impl"
    // InternalExpress.g:2784:1: rule__ParameterList__Group__0__Impl : ( ( rule__ParameterList__ParametersAssignment_0 ) ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2788:1: ( ( ( rule__ParameterList__ParametersAssignment_0 ) ) )
            // InternalExpress.g:2789:1: ( ( rule__ParameterList__ParametersAssignment_0 ) )
            {
            // InternalExpress.g:2789:1: ( ( rule__ParameterList__ParametersAssignment_0 ) )
            // InternalExpress.g:2790:2: ( rule__ParameterList__ParametersAssignment_0 )
            {
             before(grammarAccess.getParameterListAccess().getParametersAssignment_0()); 
            // InternalExpress.g:2791:2: ( rule__ParameterList__ParametersAssignment_0 )
            // InternalExpress.g:2791:3: rule__ParameterList__ParametersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0__Impl"


    // $ANTLR start "rule__ParameterList__Group__1"
    // InternalExpress.g:2799:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2803:1: ( rule__ParameterList__Group__1__Impl )
            // InternalExpress.g:2804:2: rule__ParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterList__Group__1"


    // $ANTLR start "rule__ParameterList__Group__1__Impl"
    // InternalExpress.g:2810:1: rule__ParameterList__Group__1__Impl : ( ( rule__ParameterList__Group_1__0 )* ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2814:1: ( ( ( rule__ParameterList__Group_1__0 )* ) )
            // InternalExpress.g:2815:1: ( ( rule__ParameterList__Group_1__0 )* )
            {
            // InternalExpress.g:2815:1: ( ( rule__ParameterList__Group_1__0 )* )
            // InternalExpress.g:2816:2: ( rule__ParameterList__Group_1__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_1()); 
            // InternalExpress.g:2817:2: ( rule__ParameterList__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpress.g:2817:3: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ParameterList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group_1__0"
    // InternalExpress.g:2826:1: rule__ParameterList__Group_1__0 : rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2830:1: ( rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1 )
            // InternalExpress.g:2831:2: rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_1__1();

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
    // $ANTLR end "rule__ParameterList__Group_1__0"


    // $ANTLR start "rule__ParameterList__Group_1__0__Impl"
    // InternalExpress.g:2838:1: rule__ParameterList__Group_1__0__Impl : ( ';' ) ;
    public final void rule__ParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2842:1: ( ( ';' ) )
            // InternalExpress.g:2843:1: ( ';' )
            {
            // InternalExpress.g:2843:1: ( ';' )
            // InternalExpress.g:2844:2: ';'
            {
             before(grammarAccess.getParameterListAccess().getSemicolonKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_1__1"
    // InternalExpress.g:2853:1: rule__ParameterList__Group_1__1 : rule__ParameterList__Group_1__1__Impl ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2857:1: ( rule__ParameterList__Group_1__1__Impl )
            // InternalExpress.g:2858:2: rule__ParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_1__1__Impl();

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
    // $ANTLR end "rule__ParameterList__Group_1__1"


    // $ANTLR start "rule__ParameterList__Group_1__1__Impl"
    // InternalExpress.g:2864:1: rule__ParameterList__Group_1__1__Impl : ( ( rule__ParameterList__ParametersAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2868:1: ( ( ( rule__ParameterList__ParametersAssignment_1_1 ) ) )
            // InternalExpress.g:2869:1: ( ( rule__ParameterList__ParametersAssignment_1_1 ) )
            {
            // InternalExpress.g:2869:1: ( ( rule__ParameterList__ParametersAssignment_1_1 ) )
            // InternalExpress.g:2870:2: ( rule__ParameterList__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); 
            // InternalExpress.g:2871:2: ( rule__ParameterList__ParametersAssignment_1_1 )
            // InternalExpress.g:2871:3: rule__ParameterList__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalExpress.g:2880:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2884:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalExpress.g:2885:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalExpress.g:2892:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2896:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalExpress.g:2897:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalExpress.g:2897:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalExpress.g:2898:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalExpress.g:2899:2: ( rule__Parameter__NameAssignment_0 )
            // InternalExpress.g:2899:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalExpress.g:2907:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2911:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalExpress.g:2912:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalExpress.g:2919:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2923:1: ( ( ':' ) )
            // InternalExpress.g:2924:1: ( ':' )
            {
            // InternalExpress.g:2924:1: ( ':' )
            // InternalExpress.g:2925:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalExpress.g:2934:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2938:1: ( rule__Parameter__Group__2__Impl )
            // InternalExpress.g:2939:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

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
    // InternalExpress.g:2945:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2949:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalExpress.g:2950:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalExpress.g:2950:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalExpress.g:2951:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalExpress.g:2952:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalExpress.g:2952:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__UserDefinedTypeList__Group__0"
    // InternalExpress.g:2961:1: rule__UserDefinedTypeList__Group__0 : rule__UserDefinedTypeList__Group__0__Impl rule__UserDefinedTypeList__Group__1 ;
    public final void rule__UserDefinedTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2965:1: ( rule__UserDefinedTypeList__Group__0__Impl rule__UserDefinedTypeList__Group__1 )
            // InternalExpress.g:2966:2: rule__UserDefinedTypeList__Group__0__Impl rule__UserDefinedTypeList__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__UserDefinedTypeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserDefinedTypeList__Group__1();

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
    // $ANTLR end "rule__UserDefinedTypeList__Group__0"


    // $ANTLR start "rule__UserDefinedTypeList__Group__0__Impl"
    // InternalExpress.g:2973:1: rule__UserDefinedTypeList__Group__0__Impl : ( ( rule__UserDefinedTypeList__ElementsAssignment_0 ) ) ;
    public final void rule__UserDefinedTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2977:1: ( ( ( rule__UserDefinedTypeList__ElementsAssignment_0 ) ) )
            // InternalExpress.g:2978:1: ( ( rule__UserDefinedTypeList__ElementsAssignment_0 ) )
            {
            // InternalExpress.g:2978:1: ( ( rule__UserDefinedTypeList__ElementsAssignment_0 ) )
            // InternalExpress.g:2979:2: ( rule__UserDefinedTypeList__ElementsAssignment_0 )
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getElementsAssignment_0()); 
            // InternalExpress.g:2980:2: ( rule__UserDefinedTypeList__ElementsAssignment_0 )
            // InternalExpress.g:2980:3: rule__UserDefinedTypeList__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UserDefinedTypeList__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUserDefinedTypeListAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDefinedTypeList__Group__0__Impl"


    // $ANTLR start "rule__UserDefinedTypeList__Group__1"
    // InternalExpress.g:2988:1: rule__UserDefinedTypeList__Group__1 : rule__UserDefinedTypeList__Group__1__Impl ;
    public final void rule__UserDefinedTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:2992:1: ( rule__UserDefinedTypeList__Group__1__Impl )
            // InternalExpress.g:2993:2: rule__UserDefinedTypeList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserDefinedTypeList__Group__1__Impl();

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
    // $ANTLR end "rule__UserDefinedTypeList__Group__1"


    // $ANTLR start "rule__UserDefinedTypeList__Group__1__Impl"
    // InternalExpress.g:2999:1: rule__UserDefinedTypeList__Group__1__Impl : ( ( rule__UserDefinedTypeList__Group_1__0 )* ) ;
    public final void rule__UserDefinedTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3003:1: ( ( ( rule__UserDefinedTypeList__Group_1__0 )* ) )
            // InternalExpress.g:3004:1: ( ( rule__UserDefinedTypeList__Group_1__0 )* )
            {
            // InternalExpress.g:3004:1: ( ( rule__UserDefinedTypeList__Group_1__0 )* )
            // InternalExpress.g:3005:2: ( rule__UserDefinedTypeList__Group_1__0 )*
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getGroup_1()); 
            // InternalExpress.g:3006:2: ( rule__UserDefinedTypeList__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpress.g:3006:3: rule__UserDefinedTypeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UserDefinedTypeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getUserDefinedTypeListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDefinedTypeList__Group__1__Impl"


    // $ANTLR start "rule__UserDefinedTypeList__Group_1__0"
    // InternalExpress.g:3015:1: rule__UserDefinedTypeList__Group_1__0 : rule__UserDefinedTypeList__Group_1__0__Impl rule__UserDefinedTypeList__Group_1__1 ;
    public final void rule__UserDefinedTypeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3019:1: ( rule__UserDefinedTypeList__Group_1__0__Impl rule__UserDefinedTypeList__Group_1__1 )
            // InternalExpress.g:3020:2: rule__UserDefinedTypeList__Group_1__0__Impl rule__UserDefinedTypeList__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__UserDefinedTypeList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserDefinedTypeList__Group_1__1();

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
    // $ANTLR end "rule__UserDefinedTypeList__Group_1__0"


    // $ANTLR start "rule__UserDefinedTypeList__Group_1__0__Impl"
    // InternalExpress.g:3027:1: rule__UserDefinedTypeList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__UserDefinedTypeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3031:1: ( ( ',' ) )
            // InternalExpress.g:3032:1: ( ',' )
            {
            // InternalExpress.g:3032:1: ( ',' )
            // InternalExpress.g:3033:2: ','
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUserDefinedTypeListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDefinedTypeList__Group_1__0__Impl"


    // $ANTLR start "rule__UserDefinedTypeList__Group_1__1"
    // InternalExpress.g:3042:1: rule__UserDefinedTypeList__Group_1__1 : rule__UserDefinedTypeList__Group_1__1__Impl ;
    public final void rule__UserDefinedTypeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3046:1: ( rule__UserDefinedTypeList__Group_1__1__Impl )
            // InternalExpress.g:3047:2: rule__UserDefinedTypeList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserDefinedTypeList__Group_1__1__Impl();

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
    // $ANTLR end "rule__UserDefinedTypeList__Group_1__1"


    // $ANTLR start "rule__UserDefinedTypeList__Group_1__1__Impl"
    // InternalExpress.g:3053:1: rule__UserDefinedTypeList__Group_1__1__Impl : ( ( rule__UserDefinedTypeList__ElementsAssignment_1_1 ) ) ;
    public final void rule__UserDefinedTypeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3057:1: ( ( ( rule__UserDefinedTypeList__ElementsAssignment_1_1 ) ) )
            // InternalExpress.g:3058:1: ( ( rule__UserDefinedTypeList__ElementsAssignment_1_1 ) )
            {
            // InternalExpress.g:3058:1: ( ( rule__UserDefinedTypeList__ElementsAssignment_1_1 ) )
            // InternalExpress.g:3059:2: ( rule__UserDefinedTypeList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getElementsAssignment_1_1()); 
            // InternalExpress.g:3060:2: ( rule__UserDefinedTypeList__ElementsAssignment_1_1 )
            // InternalExpress.g:3060:3: rule__UserDefinedTypeList__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UserDefinedTypeList__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUserDefinedTypeListAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDefinedTypeList__Group_1__1__Impl"


    // $ANTLR start "rule__IntegerAttribute__Group__0"
    // InternalExpress.g:3069:1: rule__IntegerAttribute__Group__0 : rule__IntegerAttribute__Group__0__Impl rule__IntegerAttribute__Group__1 ;
    public final void rule__IntegerAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3073:1: ( rule__IntegerAttribute__Group__0__Impl rule__IntegerAttribute__Group__1 )
            // InternalExpress.g:3074:2: rule__IntegerAttribute__Group__0__Impl rule__IntegerAttribute__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__IntegerAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerAttribute__Group__1();

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
    // $ANTLR end "rule__IntegerAttribute__Group__0"


    // $ANTLR start "rule__IntegerAttribute__Group__0__Impl"
    // InternalExpress.g:3081:1: rule__IntegerAttribute__Group__0__Impl : ( ( rule__IntegerAttribute__NameAssignment_0 ) ) ;
    public final void rule__IntegerAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3085:1: ( ( ( rule__IntegerAttribute__NameAssignment_0 ) ) )
            // InternalExpress.g:3086:1: ( ( rule__IntegerAttribute__NameAssignment_0 ) )
            {
            // InternalExpress.g:3086:1: ( ( rule__IntegerAttribute__NameAssignment_0 ) )
            // InternalExpress.g:3087:2: ( rule__IntegerAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getIntegerAttributeAccess().getNameAssignment_0()); 
            // InternalExpress.g:3088:2: ( rule__IntegerAttribute__NameAssignment_0 )
            // InternalExpress.g:3088:3: rule__IntegerAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAttribute__Group__0__Impl"


    // $ANTLR start "rule__IntegerAttribute__Group__1"
    // InternalExpress.g:3096:1: rule__IntegerAttribute__Group__1 : rule__IntegerAttribute__Group__1__Impl rule__IntegerAttribute__Group__2 ;
    public final void rule__IntegerAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3100:1: ( rule__IntegerAttribute__Group__1__Impl rule__IntegerAttribute__Group__2 )
            // InternalExpress.g:3101:2: rule__IntegerAttribute__Group__1__Impl rule__IntegerAttribute__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__IntegerAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerAttribute__Group__2();

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
    // $ANTLR end "rule__IntegerAttribute__Group__1"


    // $ANTLR start "rule__IntegerAttribute__Group__1__Impl"
    // InternalExpress.g:3108:1: rule__IntegerAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__IntegerAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3112:1: ( ( ':' ) )
            // InternalExpress.g:3113:1: ( ':' )
            {
            // InternalExpress.g:3113:1: ( ':' )
            // InternalExpress.g:3114:2: ':'
            {
             before(grammarAccess.getIntegerAttributeAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIntegerAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAttribute__Group__1__Impl"


    // $ANTLR start "rule__IntegerAttribute__Group__2"
    // InternalExpress.g:3123:1: rule__IntegerAttribute__Group__2 : rule__IntegerAttribute__Group__2__Impl rule__IntegerAttribute__Group__3 ;
    public final void rule__IntegerAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3127:1: ( rule__IntegerAttribute__Group__2__Impl rule__IntegerAttribute__Group__3 )
            // InternalExpress.g:3128:2: rule__IntegerAttribute__Group__2__Impl rule__IntegerAttribute__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__IntegerAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerAttribute__Group__3();

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
    // $ANTLR end "rule__IntegerAttribute__Group__2"


    // $ANTLR start "rule__IntegerAttribute__Group__2__Impl"
    // InternalExpress.g:3135:1: rule__IntegerAttribute__Group__2__Impl : ( ( rule__IntegerAttribute__OptionalAssignment_2 )? ) ;
    public final void rule__IntegerAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3139:1: ( ( ( rule__IntegerAttribute__OptionalAssignment_2 )? ) )
            // InternalExpress.g:3140:1: ( ( rule__IntegerAttribute__OptionalAssignment_2 )? )
            {
            // InternalExpress.g:3140:1: ( ( rule__IntegerAttribute__OptionalAssignment_2 )? )
            // InternalExpress.g:3141:2: ( rule__IntegerAttribute__OptionalAssignment_2 )?
            {
             before(grammarAccess.getIntegerAttributeAccess().getOptionalAssignment_2()); 
            // InternalExpress.g:3142:2: ( rule__IntegerAttribute__OptionalAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalExpress.g:3142:3: rule__IntegerAttribute__OptionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerAttribute__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerAttributeAccess().getOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAttribute__Group__2__Impl"


    // $ANTLR start "rule__IntegerAttribute__Group__3"
    // InternalExpress.g:3150:1: rule__IntegerAttribute__Group__3 : rule__IntegerAttribute__Group__3__Impl rule__IntegerAttribute__Group__4 ;
    public final void rule__IntegerAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3154:1: ( rule__IntegerAttribute__Group__3__Impl rule__IntegerAttribute__Group__4 )
            // InternalExpress.g:3155:2: rule__IntegerAttribute__Group__3__Impl rule__IntegerAttribute__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__IntegerAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerAttribute__Group__4();

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
    // $ANTLR end "rule__IntegerAttribute__Group__3"


    // $ANTLR start "rule__IntegerAttribute__Group__3__Impl"
    // InternalExpress.g:3162:1: rule__IntegerAttribute__Group__3__Impl : ( 'INTEGER' ) ;
    public final void rule__IntegerAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3166:1: ( ( 'INTEGER' ) )
            // InternalExpress.g:3167:1: ( 'INTEGER' )
            {
            // InternalExpress.g:3167:1: ( 'INTEGER' )
            // InternalExpress.g:3168:2: 'INTEGER'
            {
             before(grammarAccess.getIntegerAttributeAccess().getINTEGERKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getIntegerAttributeAccess().getINTEGERKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAttribute__Group__3__Impl"


    // $ANTLR start "rule__IntegerAttribute__Group__4"
    // InternalExpress.g:3177:1: rule__IntegerAttribute__Group__4 : rule__IntegerAttribute__Group__4__Impl ;
    public final void rule__IntegerAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3181:1: ( rule__IntegerAttribute__Group__4__Impl )
            // InternalExpress.g:3182:2: rule__IntegerAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerAttribute__Group__4__Impl();

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
    // $ANTLR end "rule__IntegerAttribute__Group__4"


    // $ANTLR start "rule__IntegerAttribute__Group__4__Impl"
    // InternalExpress.g:3188:1: rule__IntegerAttribute__Group__4__Impl : ( ';' ) ;
    public final void rule__IntegerAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3192:1: ( ( ';' ) )
            // InternalExpress.g:3193:1: ( ';' )
            {
            // InternalExpress.g:3193:1: ( ';' )
            // InternalExpress.g:3194:2: ';'
            {
             before(grammarAccess.getIntegerAttributeAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIntegerAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAttribute__Group__4__Impl"


    // $ANTLR start "rule__StringAttribute__Group__0"
    // InternalExpress.g:3204:1: rule__StringAttribute__Group__0 : rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1 ;
    public final void rule__StringAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3208:1: ( rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1 )
            // InternalExpress.g:3209:2: rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__StringAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringAttribute__Group__1();

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
    // $ANTLR end "rule__StringAttribute__Group__0"


    // $ANTLR start "rule__StringAttribute__Group__0__Impl"
    // InternalExpress.g:3216:1: rule__StringAttribute__Group__0__Impl : ( ( rule__StringAttribute__NameAssignment_0 ) ) ;
    public final void rule__StringAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3220:1: ( ( ( rule__StringAttribute__NameAssignment_0 ) ) )
            // InternalExpress.g:3221:1: ( ( rule__StringAttribute__NameAssignment_0 ) )
            {
            // InternalExpress.g:3221:1: ( ( rule__StringAttribute__NameAssignment_0 ) )
            // InternalExpress.g:3222:2: ( rule__StringAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getStringAttributeAccess().getNameAssignment_0()); 
            // InternalExpress.g:3223:2: ( rule__StringAttribute__NameAssignment_0 )
            // InternalExpress.g:3223:3: rule__StringAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__0__Impl"


    // $ANTLR start "rule__StringAttribute__Group__1"
    // InternalExpress.g:3231:1: rule__StringAttribute__Group__1 : rule__StringAttribute__Group__1__Impl rule__StringAttribute__Group__2 ;
    public final void rule__StringAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3235:1: ( rule__StringAttribute__Group__1__Impl rule__StringAttribute__Group__2 )
            // InternalExpress.g:3236:2: rule__StringAttribute__Group__1__Impl rule__StringAttribute__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__StringAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringAttribute__Group__2();

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
    // $ANTLR end "rule__StringAttribute__Group__1"


    // $ANTLR start "rule__StringAttribute__Group__1__Impl"
    // InternalExpress.g:3243:1: rule__StringAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__StringAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3247:1: ( ( ':' ) )
            // InternalExpress.g:3248:1: ( ':' )
            {
            // InternalExpress.g:3248:1: ( ':' )
            // InternalExpress.g:3249:2: ':'
            {
             before(grammarAccess.getStringAttributeAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStringAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__1__Impl"


    // $ANTLR start "rule__StringAttribute__Group__2"
    // InternalExpress.g:3258:1: rule__StringAttribute__Group__2 : rule__StringAttribute__Group__2__Impl rule__StringAttribute__Group__3 ;
    public final void rule__StringAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3262:1: ( rule__StringAttribute__Group__2__Impl rule__StringAttribute__Group__3 )
            // InternalExpress.g:3263:2: rule__StringAttribute__Group__2__Impl rule__StringAttribute__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__StringAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringAttribute__Group__3();

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
    // $ANTLR end "rule__StringAttribute__Group__2"


    // $ANTLR start "rule__StringAttribute__Group__2__Impl"
    // InternalExpress.g:3270:1: rule__StringAttribute__Group__2__Impl : ( ( rule__StringAttribute__OptionalAssignment_2 )? ) ;
    public final void rule__StringAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3274:1: ( ( ( rule__StringAttribute__OptionalAssignment_2 )? ) )
            // InternalExpress.g:3275:1: ( ( rule__StringAttribute__OptionalAssignment_2 )? )
            {
            // InternalExpress.g:3275:1: ( ( rule__StringAttribute__OptionalAssignment_2 )? )
            // InternalExpress.g:3276:2: ( rule__StringAttribute__OptionalAssignment_2 )?
            {
             before(grammarAccess.getStringAttributeAccess().getOptionalAssignment_2()); 
            // InternalExpress.g:3277:2: ( rule__StringAttribute__OptionalAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalExpress.g:3277:3: rule__StringAttribute__OptionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringAttribute__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringAttributeAccess().getOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__2__Impl"


    // $ANTLR start "rule__StringAttribute__Group__3"
    // InternalExpress.g:3285:1: rule__StringAttribute__Group__3 : rule__StringAttribute__Group__3__Impl rule__StringAttribute__Group__4 ;
    public final void rule__StringAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3289:1: ( rule__StringAttribute__Group__3__Impl rule__StringAttribute__Group__4 )
            // InternalExpress.g:3290:2: rule__StringAttribute__Group__3__Impl rule__StringAttribute__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__StringAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringAttribute__Group__4();

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
    // $ANTLR end "rule__StringAttribute__Group__3"


    // $ANTLR start "rule__StringAttribute__Group__3__Impl"
    // InternalExpress.g:3297:1: rule__StringAttribute__Group__3__Impl : ( 'STRING' ) ;
    public final void rule__StringAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3301:1: ( ( 'STRING' ) )
            // InternalExpress.g:3302:1: ( 'STRING' )
            {
            // InternalExpress.g:3302:1: ( 'STRING' )
            // InternalExpress.g:3303:2: 'STRING'
            {
             before(grammarAccess.getStringAttributeAccess().getSTRINGKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStringAttributeAccess().getSTRINGKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__3__Impl"


    // $ANTLR start "rule__StringAttribute__Group__4"
    // InternalExpress.g:3312:1: rule__StringAttribute__Group__4 : rule__StringAttribute__Group__4__Impl ;
    public final void rule__StringAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3316:1: ( rule__StringAttribute__Group__4__Impl )
            // InternalExpress.g:3317:2: rule__StringAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringAttribute__Group__4__Impl();

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
    // $ANTLR end "rule__StringAttribute__Group__4"


    // $ANTLR start "rule__StringAttribute__Group__4__Impl"
    // InternalExpress.g:3323:1: rule__StringAttribute__Group__4__Impl : ( ';' ) ;
    public final void rule__StringAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3327:1: ( ( ';' ) )
            // InternalExpress.g:3328:1: ( ';' )
            {
            // InternalExpress.g:3328:1: ( ';' )
            // InternalExpress.g:3329:2: ';'
            {
             before(grammarAccess.getStringAttributeAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStringAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__4__Impl"


    // $ANTLR start "rule__RealAttribute__Group__0"
    // InternalExpress.g:3339:1: rule__RealAttribute__Group__0 : rule__RealAttribute__Group__0__Impl rule__RealAttribute__Group__1 ;
    public final void rule__RealAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3343:1: ( rule__RealAttribute__Group__0__Impl rule__RealAttribute__Group__1 )
            // InternalExpress.g:3344:2: rule__RealAttribute__Group__0__Impl rule__RealAttribute__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RealAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealAttribute__Group__1();

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
    // $ANTLR end "rule__RealAttribute__Group__0"


    // $ANTLR start "rule__RealAttribute__Group__0__Impl"
    // InternalExpress.g:3351:1: rule__RealAttribute__Group__0__Impl : ( ( rule__RealAttribute__NameAssignment_0 ) ) ;
    public final void rule__RealAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3355:1: ( ( ( rule__RealAttribute__NameAssignment_0 ) ) )
            // InternalExpress.g:3356:1: ( ( rule__RealAttribute__NameAssignment_0 ) )
            {
            // InternalExpress.g:3356:1: ( ( rule__RealAttribute__NameAssignment_0 ) )
            // InternalExpress.g:3357:2: ( rule__RealAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getRealAttributeAccess().getNameAssignment_0()); 
            // InternalExpress.g:3358:2: ( rule__RealAttribute__NameAssignment_0 )
            // InternalExpress.g:3358:3: rule__RealAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RealAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRealAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealAttribute__Group__0__Impl"


    // $ANTLR start "rule__RealAttribute__Group__1"
    // InternalExpress.g:3366:1: rule__RealAttribute__Group__1 : rule__RealAttribute__Group__1__Impl rule__RealAttribute__Group__2 ;
    public final void rule__RealAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3370:1: ( rule__RealAttribute__Group__1__Impl rule__RealAttribute__Group__2 )
            // InternalExpress.g:3371:2: rule__RealAttribute__Group__1__Impl rule__RealAttribute__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__RealAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealAttribute__Group__2();

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
    // $ANTLR end "rule__RealAttribute__Group__1"


    // $ANTLR start "rule__RealAttribute__Group__1__Impl"
    // InternalExpress.g:3378:1: rule__RealAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__RealAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3382:1: ( ( ':' ) )
            // InternalExpress.g:3383:1: ( ':' )
            {
            // InternalExpress.g:3383:1: ( ':' )
            // InternalExpress.g:3384:2: ':'
            {
             before(grammarAccess.getRealAttributeAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRealAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealAttribute__Group__1__Impl"


    // $ANTLR start "rule__RealAttribute__Group__2"
    // InternalExpress.g:3393:1: rule__RealAttribute__Group__2 : rule__RealAttribute__Group__2__Impl rule__RealAttribute__Group__3 ;
    public final void rule__RealAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3397:1: ( rule__RealAttribute__Group__2__Impl rule__RealAttribute__Group__3 )
            // InternalExpress.g:3398:2: rule__RealAttribute__Group__2__Impl rule__RealAttribute__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__RealAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealAttribute__Group__3();

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
    // $ANTLR end "rule__RealAttribute__Group__2"


    // $ANTLR start "rule__RealAttribute__Group__2__Impl"
    // InternalExpress.g:3405:1: rule__RealAttribute__Group__2__Impl : ( ( rule__RealAttribute__OptionalAssignment_2 )? ) ;
    public final void rule__RealAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3409:1: ( ( ( rule__RealAttribute__OptionalAssignment_2 )? ) )
            // InternalExpress.g:3410:1: ( ( rule__RealAttribute__OptionalAssignment_2 )? )
            {
            // InternalExpress.g:3410:1: ( ( rule__RealAttribute__OptionalAssignment_2 )? )
            // InternalExpress.g:3411:2: ( rule__RealAttribute__OptionalAssignment_2 )?
            {
             before(grammarAccess.getRealAttributeAccess().getOptionalAssignment_2()); 
            // InternalExpress.g:3412:2: ( rule__RealAttribute__OptionalAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalExpress.g:3412:3: rule__RealAttribute__OptionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RealAttribute__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRealAttributeAccess().getOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealAttribute__Group__2__Impl"


    // $ANTLR start "rule__RealAttribute__Group__3"
    // InternalExpress.g:3420:1: rule__RealAttribute__Group__3 : rule__RealAttribute__Group__3__Impl rule__RealAttribute__Group__4 ;
    public final void rule__RealAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3424:1: ( rule__RealAttribute__Group__3__Impl rule__RealAttribute__Group__4 )
            // InternalExpress.g:3425:2: rule__RealAttribute__Group__3__Impl rule__RealAttribute__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__RealAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealAttribute__Group__4();

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
    // $ANTLR end "rule__RealAttribute__Group__3"


    // $ANTLR start "rule__RealAttribute__Group__3__Impl"
    // InternalExpress.g:3432:1: rule__RealAttribute__Group__3__Impl : ( 'REAL' ) ;
    public final void rule__RealAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3436:1: ( ( 'REAL' ) )
            // InternalExpress.g:3437:1: ( 'REAL' )
            {
            // InternalExpress.g:3437:1: ( 'REAL' )
            // InternalExpress.g:3438:2: 'REAL'
            {
             before(grammarAccess.getRealAttributeAccess().getREALKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRealAttributeAccess().getREALKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealAttribute__Group__3__Impl"


    // $ANTLR start "rule__RealAttribute__Group__4"
    // InternalExpress.g:3447:1: rule__RealAttribute__Group__4 : rule__RealAttribute__Group__4__Impl ;
    public final void rule__RealAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3451:1: ( rule__RealAttribute__Group__4__Impl )
            // InternalExpress.g:3452:2: rule__RealAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealAttribute__Group__4__Impl();

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
    // $ANTLR end "rule__RealAttribute__Group__4"


    // $ANTLR start "rule__RealAttribute__Group__4__Impl"
    // InternalExpress.g:3458:1: rule__RealAttribute__Group__4__Impl : ( ';' ) ;
    public final void rule__RealAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3462:1: ( ( ';' ) )
            // InternalExpress.g:3463:1: ( ';' )
            {
            // InternalExpress.g:3463:1: ( ';' )
            // InternalExpress.g:3464:2: ';'
            {
             before(grammarAccess.getRealAttributeAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRealAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealAttribute__Group__4__Impl"


    // $ANTLR start "rule__BooleanAttribute__Group__0"
    // InternalExpress.g:3474:1: rule__BooleanAttribute__Group__0 : rule__BooleanAttribute__Group__0__Impl rule__BooleanAttribute__Group__1 ;
    public final void rule__BooleanAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3478:1: ( rule__BooleanAttribute__Group__0__Impl rule__BooleanAttribute__Group__1 )
            // InternalExpress.g:3479:2: rule__BooleanAttribute__Group__0__Impl rule__BooleanAttribute__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__BooleanAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanAttribute__Group__1();

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
    // $ANTLR end "rule__BooleanAttribute__Group__0"


    // $ANTLR start "rule__BooleanAttribute__Group__0__Impl"
    // InternalExpress.g:3486:1: rule__BooleanAttribute__Group__0__Impl : ( ( rule__BooleanAttribute__NameAssignment_0 ) ) ;
    public final void rule__BooleanAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3490:1: ( ( ( rule__BooleanAttribute__NameAssignment_0 ) ) )
            // InternalExpress.g:3491:1: ( ( rule__BooleanAttribute__NameAssignment_0 ) )
            {
            // InternalExpress.g:3491:1: ( ( rule__BooleanAttribute__NameAssignment_0 ) )
            // InternalExpress.g:3492:2: ( rule__BooleanAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getBooleanAttributeAccess().getNameAssignment_0()); 
            // InternalExpress.g:3493:2: ( rule__BooleanAttribute__NameAssignment_0 )
            // InternalExpress.g:3493:3: rule__BooleanAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAttribute__Group__0__Impl"


    // $ANTLR start "rule__BooleanAttribute__Group__1"
    // InternalExpress.g:3501:1: rule__BooleanAttribute__Group__1 : rule__BooleanAttribute__Group__1__Impl rule__BooleanAttribute__Group__2 ;
    public final void rule__BooleanAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3505:1: ( rule__BooleanAttribute__Group__1__Impl rule__BooleanAttribute__Group__2 )
            // InternalExpress.g:3506:2: rule__BooleanAttribute__Group__1__Impl rule__BooleanAttribute__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__BooleanAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanAttribute__Group__2();

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
    // $ANTLR end "rule__BooleanAttribute__Group__1"


    // $ANTLR start "rule__BooleanAttribute__Group__1__Impl"
    // InternalExpress.g:3513:1: rule__BooleanAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__BooleanAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3517:1: ( ( ':' ) )
            // InternalExpress.g:3518:1: ( ':' )
            {
            // InternalExpress.g:3518:1: ( ':' )
            // InternalExpress.g:3519:2: ':'
            {
             before(grammarAccess.getBooleanAttributeAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBooleanAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAttribute__Group__1__Impl"


    // $ANTLR start "rule__BooleanAttribute__Group__2"
    // InternalExpress.g:3528:1: rule__BooleanAttribute__Group__2 : rule__BooleanAttribute__Group__2__Impl rule__BooleanAttribute__Group__3 ;
    public final void rule__BooleanAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3532:1: ( rule__BooleanAttribute__Group__2__Impl rule__BooleanAttribute__Group__3 )
            // InternalExpress.g:3533:2: rule__BooleanAttribute__Group__2__Impl rule__BooleanAttribute__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__BooleanAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanAttribute__Group__3();

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
    // $ANTLR end "rule__BooleanAttribute__Group__2"


    // $ANTLR start "rule__BooleanAttribute__Group__2__Impl"
    // InternalExpress.g:3540:1: rule__BooleanAttribute__Group__2__Impl : ( ( rule__BooleanAttribute__OptionalAssignment_2 )? ) ;
    public final void rule__BooleanAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3544:1: ( ( ( rule__BooleanAttribute__OptionalAssignment_2 )? ) )
            // InternalExpress.g:3545:1: ( ( rule__BooleanAttribute__OptionalAssignment_2 )? )
            {
            // InternalExpress.g:3545:1: ( ( rule__BooleanAttribute__OptionalAssignment_2 )? )
            // InternalExpress.g:3546:2: ( rule__BooleanAttribute__OptionalAssignment_2 )?
            {
             before(grammarAccess.getBooleanAttributeAccess().getOptionalAssignment_2()); 
            // InternalExpress.g:3547:2: ( rule__BooleanAttribute__OptionalAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalExpress.g:3547:3: rule__BooleanAttribute__OptionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanAttribute__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanAttributeAccess().getOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAttribute__Group__2__Impl"


    // $ANTLR start "rule__BooleanAttribute__Group__3"
    // InternalExpress.g:3555:1: rule__BooleanAttribute__Group__3 : rule__BooleanAttribute__Group__3__Impl rule__BooleanAttribute__Group__4 ;
    public final void rule__BooleanAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3559:1: ( rule__BooleanAttribute__Group__3__Impl rule__BooleanAttribute__Group__4 )
            // InternalExpress.g:3560:2: rule__BooleanAttribute__Group__3__Impl rule__BooleanAttribute__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__BooleanAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanAttribute__Group__4();

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
    // $ANTLR end "rule__BooleanAttribute__Group__3"


    // $ANTLR start "rule__BooleanAttribute__Group__3__Impl"
    // InternalExpress.g:3567:1: rule__BooleanAttribute__Group__3__Impl : ( 'BOOLEAN' ) ;
    public final void rule__BooleanAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3571:1: ( ( 'BOOLEAN' ) )
            // InternalExpress.g:3572:1: ( 'BOOLEAN' )
            {
            // InternalExpress.g:3572:1: ( 'BOOLEAN' )
            // InternalExpress.g:3573:2: 'BOOLEAN'
            {
             before(grammarAccess.getBooleanAttributeAccess().getBOOLEANKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBooleanAttributeAccess().getBOOLEANKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAttribute__Group__3__Impl"


    // $ANTLR start "rule__BooleanAttribute__Group__4"
    // InternalExpress.g:3582:1: rule__BooleanAttribute__Group__4 : rule__BooleanAttribute__Group__4__Impl ;
    public final void rule__BooleanAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3586:1: ( rule__BooleanAttribute__Group__4__Impl )
            // InternalExpress.g:3587:2: rule__BooleanAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAttribute__Group__4__Impl();

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
    // $ANTLR end "rule__BooleanAttribute__Group__4"


    // $ANTLR start "rule__BooleanAttribute__Group__4__Impl"
    // InternalExpress.g:3593:1: rule__BooleanAttribute__Group__4__Impl : ( ';' ) ;
    public final void rule__BooleanAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3597:1: ( ( ';' ) )
            // InternalExpress.g:3598:1: ( ';' )
            {
            // InternalExpress.g:3598:1: ( ';' )
            // InternalExpress.g:3599:2: ';'
            {
             before(grammarAccess.getBooleanAttributeAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBooleanAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAttribute__Group__4__Impl"


    // $ANTLR start "rule__ReferenceAttribute__Group__0"
    // InternalExpress.g:3609:1: rule__ReferenceAttribute__Group__0 : rule__ReferenceAttribute__Group__0__Impl rule__ReferenceAttribute__Group__1 ;
    public final void rule__ReferenceAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3613:1: ( rule__ReferenceAttribute__Group__0__Impl rule__ReferenceAttribute__Group__1 )
            // InternalExpress.g:3614:2: rule__ReferenceAttribute__Group__0__Impl rule__ReferenceAttribute__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ReferenceAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAttribute__Group__1();

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
    // $ANTLR end "rule__ReferenceAttribute__Group__0"


    // $ANTLR start "rule__ReferenceAttribute__Group__0__Impl"
    // InternalExpress.g:3621:1: rule__ReferenceAttribute__Group__0__Impl : ( ( rule__ReferenceAttribute__NameAssignment_0 ) ) ;
    public final void rule__ReferenceAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3625:1: ( ( ( rule__ReferenceAttribute__NameAssignment_0 ) ) )
            // InternalExpress.g:3626:1: ( ( rule__ReferenceAttribute__NameAssignment_0 ) )
            {
            // InternalExpress.g:3626:1: ( ( rule__ReferenceAttribute__NameAssignment_0 ) )
            // InternalExpress.g:3627:2: ( rule__ReferenceAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceAttributeAccess().getNameAssignment_0()); 
            // InternalExpress.g:3628:2: ( rule__ReferenceAttribute__NameAssignment_0 )
            // InternalExpress.g:3628:3: rule__ReferenceAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAttribute__Group__0__Impl"


    // $ANTLR start "rule__ReferenceAttribute__Group__1"
    // InternalExpress.g:3636:1: rule__ReferenceAttribute__Group__1 : rule__ReferenceAttribute__Group__1__Impl rule__ReferenceAttribute__Group__2 ;
    public final void rule__ReferenceAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3640:1: ( rule__ReferenceAttribute__Group__1__Impl rule__ReferenceAttribute__Group__2 )
            // InternalExpress.g:3641:2: rule__ReferenceAttribute__Group__1__Impl rule__ReferenceAttribute__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ReferenceAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAttribute__Group__2();

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
    // $ANTLR end "rule__ReferenceAttribute__Group__1"


    // $ANTLR start "rule__ReferenceAttribute__Group__1__Impl"
    // InternalExpress.g:3648:1: rule__ReferenceAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__ReferenceAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3652:1: ( ( ':' ) )
            // InternalExpress.g:3653:1: ( ':' )
            {
            // InternalExpress.g:3653:1: ( ':' )
            // InternalExpress.g:3654:2: ':'
            {
             before(grammarAccess.getReferenceAttributeAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReferenceAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAttribute__Group__1__Impl"


    // $ANTLR start "rule__ReferenceAttribute__Group__2"
    // InternalExpress.g:3663:1: rule__ReferenceAttribute__Group__2 : rule__ReferenceAttribute__Group__2__Impl rule__ReferenceAttribute__Group__3 ;
    public final void rule__ReferenceAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3667:1: ( rule__ReferenceAttribute__Group__2__Impl rule__ReferenceAttribute__Group__3 )
            // InternalExpress.g:3668:2: rule__ReferenceAttribute__Group__2__Impl rule__ReferenceAttribute__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ReferenceAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAttribute__Group__3();

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
    // $ANTLR end "rule__ReferenceAttribute__Group__2"


    // $ANTLR start "rule__ReferenceAttribute__Group__2__Impl"
    // InternalExpress.g:3675:1: rule__ReferenceAttribute__Group__2__Impl : ( ( rule__ReferenceAttribute__OptionalAssignment_2 )? ) ;
    public final void rule__ReferenceAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3679:1: ( ( ( rule__ReferenceAttribute__OptionalAssignment_2 )? ) )
            // InternalExpress.g:3680:1: ( ( rule__ReferenceAttribute__OptionalAssignment_2 )? )
            {
            // InternalExpress.g:3680:1: ( ( rule__ReferenceAttribute__OptionalAssignment_2 )? )
            // InternalExpress.g:3681:2: ( rule__ReferenceAttribute__OptionalAssignment_2 )?
            {
             before(grammarAccess.getReferenceAttributeAccess().getOptionalAssignment_2()); 
            // InternalExpress.g:3682:2: ( rule__ReferenceAttribute__OptionalAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalExpress.g:3682:3: rule__ReferenceAttribute__OptionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceAttribute__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAttributeAccess().getOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAttribute__Group__2__Impl"


    // $ANTLR start "rule__ReferenceAttribute__Group__3"
    // InternalExpress.g:3690:1: rule__ReferenceAttribute__Group__3 : rule__ReferenceAttribute__Group__3__Impl rule__ReferenceAttribute__Group__4 ;
    public final void rule__ReferenceAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3694:1: ( rule__ReferenceAttribute__Group__3__Impl rule__ReferenceAttribute__Group__4 )
            // InternalExpress.g:3695:2: rule__ReferenceAttribute__Group__3__Impl rule__ReferenceAttribute__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAttribute__Group__4();

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
    // $ANTLR end "rule__ReferenceAttribute__Group__3"


    // $ANTLR start "rule__ReferenceAttribute__Group__3__Impl"
    // InternalExpress.g:3702:1: rule__ReferenceAttribute__Group__3__Impl : ( ( rule__ReferenceAttribute__ReferenceAssignment_3 ) ) ;
    public final void rule__ReferenceAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3706:1: ( ( ( rule__ReferenceAttribute__ReferenceAssignment_3 ) ) )
            // InternalExpress.g:3707:1: ( ( rule__ReferenceAttribute__ReferenceAssignment_3 ) )
            {
            // InternalExpress.g:3707:1: ( ( rule__ReferenceAttribute__ReferenceAssignment_3 ) )
            // InternalExpress.g:3708:2: ( rule__ReferenceAttribute__ReferenceAssignment_3 )
            {
             before(grammarAccess.getReferenceAttributeAccess().getReferenceAssignment_3()); 
            // InternalExpress.g:3709:2: ( rule__ReferenceAttribute__ReferenceAssignment_3 )
            // InternalExpress.g:3709:3: rule__ReferenceAttribute__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAttribute__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAttributeAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAttribute__Group__3__Impl"


    // $ANTLR start "rule__ReferenceAttribute__Group__4"
    // InternalExpress.g:3717:1: rule__ReferenceAttribute__Group__4 : rule__ReferenceAttribute__Group__4__Impl ;
    public final void rule__ReferenceAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3721:1: ( rule__ReferenceAttribute__Group__4__Impl )
            // InternalExpress.g:3722:2: rule__ReferenceAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAttribute__Group__4__Impl();

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
    // $ANTLR end "rule__ReferenceAttribute__Group__4"


    // $ANTLR start "rule__ReferenceAttribute__Group__4__Impl"
    // InternalExpress.g:3728:1: rule__ReferenceAttribute__Group__4__Impl : ( ';' ) ;
    public final void rule__ReferenceAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3732:1: ( ( ';' ) )
            // InternalExpress.g:3733:1: ( ';' )
            {
            // InternalExpress.g:3733:1: ( ';' )
            // InternalExpress.g:3734:2: ';'
            {
             before(grammarAccess.getReferenceAttributeAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReferenceAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAttribute__Group__4__Impl"


    // $ANTLR start "rule__SchemaContainer__SchemasAssignment"
    // InternalExpress.g:3744:1: rule__SchemaContainer__SchemasAssignment : ( ruleSchema ) ;
    public final void rule__SchemaContainer__SchemasAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3748:1: ( ( ruleSchema ) )
            // InternalExpress.g:3749:2: ( ruleSchema )
            {
            // InternalExpress.g:3749:2: ( ruleSchema )
            // InternalExpress.g:3750:3: ruleSchema
            {
             before(grammarAccess.getSchemaContainerAccess().getSchemasSchemaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaContainerAccess().getSchemasSchemaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaContainer__SchemasAssignment"


    // $ANTLR start "rule__Schema__NameAssignment_1"
    // InternalExpress.g:3759:1: rule__Schema__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Schema__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3763:1: ( ( RULE_ID ) )
            // InternalExpress.g:3764:2: ( RULE_ID )
            {
            // InternalExpress.g:3764:2: ( RULE_ID )
            // InternalExpress.g:3765:3: RULE_ID
            {
             before(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__NameAssignment_1"


    // $ANTLR start "rule__Schema__DeclarationsAssignment_3"
    // InternalExpress.g:3774:1: rule__Schema__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Schema__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3778:1: ( ( ruleDeclaration ) )
            // InternalExpress.g:3779:2: ( ruleDeclaration )
            {
            // InternalExpress.g:3779:2: ( ruleDeclaration )
            // InternalExpress.g:3780:3: ruleDeclaration
            {
             before(grammarAccess.getSchemaAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__DeclarationsAssignment_3"


    // $ANTLR start "rule__ReferenceOrValue__ReferenceAssignment_0"
    // InternalExpress.g:3789:1: rule__ReferenceOrValue__ReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceOrValue__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3793:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:3794:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:3794:2: ( ( RULE_ID ) )
            // InternalExpress.g:3795:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceOrValueAccess().getReferenceUserDefinedTypeCrossReference_0_0()); 
            // InternalExpress.g:3796:3: ( RULE_ID )
            // InternalExpress.g:3797:4: RULE_ID
            {
             before(grammarAccess.getReferenceOrValueAccess().getReferenceUserDefinedTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceOrValueAccess().getReferenceUserDefinedTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReferenceOrValueAccess().getReferenceUserDefinedTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceOrValue__ReferenceAssignment_0"


    // $ANTLR start "rule__ReferenceOrValue__ValueAssignment_1"
    // InternalExpress.g:3808:1: rule__ReferenceOrValue__ValueAssignment_1 : ( ( rule__ReferenceOrValue__ValueAlternatives_1_0 ) ) ;
    public final void rule__ReferenceOrValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3812:1: ( ( ( rule__ReferenceOrValue__ValueAlternatives_1_0 ) ) )
            // InternalExpress.g:3813:2: ( ( rule__ReferenceOrValue__ValueAlternatives_1_0 ) )
            {
            // InternalExpress.g:3813:2: ( ( rule__ReferenceOrValue__ValueAlternatives_1_0 ) )
            // InternalExpress.g:3814:3: ( rule__ReferenceOrValue__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getReferenceOrValueAccess().getValueAlternatives_1_0()); 
            // InternalExpress.g:3815:3: ( rule__ReferenceOrValue__ValueAlternatives_1_0 )
            // InternalExpress.g:3815:4: rule__ReferenceOrValue__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceOrValue__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceOrValueAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceOrValue__ValueAssignment_1"


    // $ANTLR start "rule__UseFrom__SchemaAssignment_2"
    // InternalExpress.g:3823:1: rule__UseFrom__SchemaAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__UseFrom__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3827:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:3828:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:3828:2: ( ( RULE_ID ) )
            // InternalExpress.g:3829:3: ( RULE_ID )
            {
             before(grammarAccess.getUseFromAccess().getSchemaSchemaCrossReference_2_0()); 
            // InternalExpress.g:3830:3: ( RULE_ID )
            // InternalExpress.g:3831:4: RULE_ID
            {
             before(grammarAccess.getUseFromAccess().getSchemaSchemaIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseFromAccess().getSchemaSchemaIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getUseFromAccess().getSchemaSchemaCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__SchemaAssignment_2"


    // $ANTLR start "rule__UseFrom__ImportedEntitiesAssignment_3_1"
    // InternalExpress.g:3842:1: rule__UseFrom__ImportedEntitiesAssignment_3_1 : ( ruleImportedEntityList ) ;
    public final void rule__UseFrom__ImportedEntitiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3846:1: ( ( ruleImportedEntityList ) )
            // InternalExpress.g:3847:2: ( ruleImportedEntityList )
            {
            // InternalExpress.g:3847:2: ( ruleImportedEntityList )
            // InternalExpress.g:3848:3: ruleImportedEntityList
            {
             before(grammarAccess.getUseFromAccess().getImportedEntitiesImportedEntityListParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedEntityList();

            state._fsp--;

             after(grammarAccess.getUseFromAccess().getImportedEntitiesImportedEntityListParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseFrom__ImportedEntitiesAssignment_3_1"


    // $ANTLR start "rule__ImportedEntityList__EntitiesAssignment_0"
    // InternalExpress.g:3857:1: rule__ImportedEntityList__EntitiesAssignment_0 : ( ruleImportedEntity ) ;
    public final void rule__ImportedEntityList__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3861:1: ( ( ruleImportedEntity ) )
            // InternalExpress.g:3862:2: ( ruleImportedEntity )
            {
            // InternalExpress.g:3862:2: ( ruleImportedEntity )
            // InternalExpress.g:3863:3: ruleImportedEntity
            {
             before(grammarAccess.getImportedEntityListAccess().getEntitiesImportedEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedEntity();

            state._fsp--;

             after(grammarAccess.getImportedEntityListAccess().getEntitiesImportedEntityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntityList__EntitiesAssignment_0"


    // $ANTLR start "rule__ImportedEntityList__EntitiesAssignment_1_1"
    // InternalExpress.g:3872:1: rule__ImportedEntityList__EntitiesAssignment_1_1 : ( ruleImportedEntity ) ;
    public final void rule__ImportedEntityList__EntitiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3876:1: ( ( ruleImportedEntity ) )
            // InternalExpress.g:3877:2: ( ruleImportedEntity )
            {
            // InternalExpress.g:3877:2: ( ruleImportedEntity )
            // InternalExpress.g:3878:3: ruleImportedEntity
            {
             before(grammarAccess.getImportedEntityListAccess().getEntitiesImportedEntityParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedEntity();

            state._fsp--;

             after(grammarAccess.getImportedEntityListAccess().getEntitiesImportedEntityParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntityList__EntitiesAssignment_1_1"


    // $ANTLR start "rule__ImportedEntity__EntityAssignment_0"
    // InternalExpress.g:3887:1: rule__ImportedEntity__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ImportedEntity__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3891:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:3892:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:3892:2: ( ( RULE_ID ) )
            // InternalExpress.g:3893:3: ( RULE_ID )
            {
             before(grammarAccess.getImportedEntityAccess().getEntityEntityCrossReference_0_0()); 
            // InternalExpress.g:3894:3: ( RULE_ID )
            // InternalExpress.g:3895:4: RULE_ID
            {
             before(grammarAccess.getImportedEntityAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportedEntityAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getImportedEntityAccess().getEntityEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntity__EntityAssignment_0"


    // $ANTLR start "rule__ImportedEntity__AliasAssignment_1_1"
    // InternalExpress.g:3906:1: rule__ImportedEntity__AliasAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ImportedEntity__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3910:1: ( ( RULE_ID ) )
            // InternalExpress.g:3911:2: ( RULE_ID )
            {
            // InternalExpress.g:3911:2: ( RULE_ID )
            // InternalExpress.g:3912:3: RULE_ID
            {
             before(grammarAccess.getImportedEntityAccess().getAliasIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportedEntityAccess().getAliasIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedEntity__AliasAssignment_1_1"


    // $ANTLR start "rule__SelectType__NameAssignment_1"
    // InternalExpress.g:3921:1: rule__SelectType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SelectType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3925:1: ( ( RULE_ID ) )
            // InternalExpress.g:3926:2: ( RULE_ID )
            {
            // InternalExpress.g:3926:2: ( RULE_ID )
            // InternalExpress.g:3927:3: RULE_ID
            {
             before(grammarAccess.getSelectTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__NameAssignment_1"


    // $ANTLR start "rule__SelectType__TypesAssignment_5"
    // InternalExpress.g:3936:1: rule__SelectType__TypesAssignment_5 : ( ruleUserDefinedTypeList ) ;
    public final void rule__SelectType__TypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3940:1: ( ( ruleUserDefinedTypeList ) )
            // InternalExpress.g:3941:2: ( ruleUserDefinedTypeList )
            {
            // InternalExpress.g:3941:2: ( ruleUserDefinedTypeList )
            // InternalExpress.g:3942:3: ruleUserDefinedTypeList
            {
             before(grammarAccess.getSelectTypeAccess().getTypesUserDefinedTypeListParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUserDefinedTypeList();

            state._fsp--;

             after(grammarAccess.getSelectTypeAccess().getTypesUserDefinedTypeListParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectType__TypesAssignment_5"


    // $ANTLR start "rule__EnumerationType__NameAssignment_1"
    // InternalExpress.g:3951:1: rule__EnumerationType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3955:1: ( ( RULE_ID ) )
            // InternalExpress.g:3956:2: ( RULE_ID )
            {
            // InternalExpress.g:3956:2: ( RULE_ID )
            // InternalExpress.g:3957:3: RULE_ID
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__NameAssignment_1"


    // $ANTLR start "rule__EnumerationType__ValuesAssignment_6"
    // InternalExpress.g:3966:1: rule__EnumerationType__ValuesAssignment_6 : ( ruleEnumerationValue ) ;
    public final void rule__EnumerationType__ValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3970:1: ( ( ruleEnumerationValue ) )
            // InternalExpress.g:3971:2: ( ruleEnumerationValue )
            {
            // InternalExpress.g:3971:2: ( ruleEnumerationValue )
            // InternalExpress.g:3972:3: ruleEnumerationValue
            {
             before(grammarAccess.getEnumerationTypeAccess().getValuesEnumerationValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationValue();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getValuesEnumerationValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__ValuesAssignment_6"


    // $ANTLR start "rule__EnumerationType__ValuesAssignment_7_1"
    // InternalExpress.g:3981:1: rule__EnumerationType__ValuesAssignment_7_1 : ( ruleEnumerationValue ) ;
    public final void rule__EnumerationType__ValuesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:3985:1: ( ( ruleEnumerationValue ) )
            // InternalExpress.g:3986:2: ( ruleEnumerationValue )
            {
            // InternalExpress.g:3986:2: ( ruleEnumerationValue )
            // InternalExpress.g:3987:3: ruleEnumerationValue
            {
             before(grammarAccess.getEnumerationTypeAccess().getValuesEnumerationValueParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationValue();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getValuesEnumerationValueParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__ValuesAssignment_7_1"


    // $ANTLR start "rule__EnumerationValue__NameAssignment"
    // InternalExpress.g:3996:1: rule__EnumerationValue__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumerationValue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4000:1: ( ( RULE_ID ) )
            // InternalExpress.g:4001:2: ( RULE_ID )
            {
            // InternalExpress.g:4001:2: ( RULE_ID )
            // InternalExpress.g:4002:3: RULE_ID
            {
             before(grammarAccess.getEnumerationValueAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__NameAssignment"


    // $ANTLR start "rule__AliasType__NameAssignment_1"
    // InternalExpress.g:4011:1: rule__AliasType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AliasType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4015:1: ( ( RULE_ID ) )
            // InternalExpress.g:4016:2: ( RULE_ID )
            {
            // InternalExpress.g:4016:2: ( RULE_ID )
            // InternalExpress.g:4017:3: RULE_ID
            {
             before(grammarAccess.getAliasTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasType__NameAssignment_1"


    // $ANTLR start "rule__AliasType__ElementAssignment_3"
    // InternalExpress.g:4026:1: rule__AliasType__ElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AliasType__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4030:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:4031:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:4031:2: ( ( RULE_ID ) )
            // InternalExpress.g:4032:3: ( RULE_ID )
            {
             before(grammarAccess.getAliasTypeAccess().getElementUserDefinedTypeCrossReference_3_0()); 
            // InternalExpress.g:4033:3: ( RULE_ID )
            // InternalExpress.g:4034:4: RULE_ID
            {
             before(grammarAccess.getAliasTypeAccess().getElementUserDefinedTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasTypeAccess().getElementUserDefinedTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAliasTypeAccess().getElementUserDefinedTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasType__ElementAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalExpress.g:4045:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4049:1: ( ( RULE_ID ) )
            // InternalExpress.g:4050:2: ( RULE_ID )
            {
            // InternalExpress.g:4050:2: ( RULE_ID )
            // InternalExpress.g:4051:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SubTypeAssignment_3_3"
    // InternalExpress.g:4060:1: rule__Entity__SubTypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SubTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4064:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:4065:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:4065:2: ( ( RULE_ID ) )
            // InternalExpress.g:4066:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSubTypeEntityCrossReference_3_3_0()); 
            // InternalExpress.g:4067:3: ( RULE_ID )
            // InternalExpress.g:4068:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSubTypeEntityIDTerminalRuleCall_3_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSubTypeEntityIDTerminalRuleCall_3_3_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSubTypeEntityCrossReference_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SubTypeAssignment_3_3"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_4_3"
    // InternalExpress.g:4079:1: rule__Entity__SuperTypeAssignment_4_3 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4083:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:4084:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:4084:2: ( ( RULE_ID ) )
            // InternalExpress.g:4085:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_4_3_0()); 
            // InternalExpress.g:4086:3: ( RULE_ID )
            // InternalExpress.g:4087:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_4_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_4_3_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_4_3"


    // $ANTLR start "rule__Entity__AttributesAssignment_5"
    // InternalExpress.g:4098:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4102:1: ( ( ruleAttribute ) )
            // InternalExpress.g:4103:2: ( ruleAttribute )
            {
            // InternalExpress.g:4103:2: ( ruleAttribute )
            // InternalExpress.g:4104:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_5"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalExpress.g:4113:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4117:1: ( ( RULE_ID ) )
            // InternalExpress.g:4118:2: ( RULE_ID )
            {
            // InternalExpress.g:4118:2: ( RULE_ID )
            // InternalExpress.g:4119:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__ParametersAssignment_3"
    // InternalExpress.g:4128:1: rule__Function__ParametersAssignment_3 : ( ruleParameterList ) ;
    public final void rule__Function__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4132:1: ( ( ruleParameterList ) )
            // InternalExpress.g:4133:2: ( ruleParameterList )
            {
            // InternalExpress.g:4133:2: ( ruleParameterList )
            // InternalExpress.g:4134:3: ruleParameterList
            {
             before(grammarAccess.getFunctionAccess().getParametersParameterListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParametersParameterListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_3"


    // $ANTLR start "rule__Function__ReturnTypeAssignment_5_1"
    // InternalExpress.g:4143:1: rule__Function__ReturnTypeAssignment_5_1 : ( ruleReferenceOrValue ) ;
    public final void rule__Function__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4147:1: ( ( ruleReferenceOrValue ) )
            // InternalExpress.g:4148:2: ( ruleReferenceOrValue )
            {
            // InternalExpress.g:4148:2: ( ruleReferenceOrValue )
            // InternalExpress.g:4149:3: ruleReferenceOrValue
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeReferenceOrValueParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceOrValue();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getReturnTypeReferenceOrValueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ReturnTypeAssignment_5_1"


    // $ANTLR start "rule__ParameterList__ParametersAssignment_0"
    // InternalExpress.g:4158:1: rule__ParameterList__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4162:1: ( ( ruleParameter ) )
            // InternalExpress.g:4163:2: ( ruleParameter )
            {
            // InternalExpress.g:4163:2: ( ruleParameter )
            // InternalExpress.g:4164:3: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ParametersAssignment_0"


    // $ANTLR start "rule__ParameterList__ParametersAssignment_1_1"
    // InternalExpress.g:4173:1: rule__ParameterList__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4177:1: ( ( ruleParameter ) )
            // InternalExpress.g:4178:2: ( ruleParameter )
            {
            // InternalExpress.g:4178:2: ( ruleParameter )
            // InternalExpress.g:4179:3: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ParametersAssignment_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalExpress.g:4188:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4192:1: ( ( RULE_ID ) )
            // InternalExpress.g:4193:2: ( RULE_ID )
            {
            // InternalExpress.g:4193:2: ( RULE_ID )
            // InternalExpress.g:4194:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalExpress.g:4203:1: rule__Parameter__TypeAssignment_2 : ( ruleReferenceOrValue ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4207:1: ( ( ruleReferenceOrValue ) )
            // InternalExpress.g:4208:2: ( ruleReferenceOrValue )
            {
            // InternalExpress.g:4208:2: ( ruleReferenceOrValue )
            // InternalExpress.g:4209:3: ruleReferenceOrValue
            {
             before(grammarAccess.getParameterAccess().getTypeReferenceOrValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceOrValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeReferenceOrValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__UserDefinedTypeList__ElementsAssignment_0"
    // InternalExpress.g:4218:1: rule__UserDefinedTypeList__ElementsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UserDefinedTypeList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4222:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:4223:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:4223:2: ( ( RULE_ID ) )
            // InternalExpress.g:4224:3: ( RULE_ID )
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeCrossReference_0_0()); 
            // InternalExpress.g:4225:3: ( RULE_ID )
            // InternalExpress.g:4226:4: RULE_ID
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDefinedTypeList__ElementsAssignment_0"


    // $ANTLR start "rule__UserDefinedTypeList__ElementsAssignment_1_1"
    // InternalExpress.g:4237:1: rule__UserDefinedTypeList__ElementsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__UserDefinedTypeList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4241:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:4242:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:4242:2: ( ( RULE_ID ) )
            // InternalExpress.g:4243:3: ( RULE_ID )
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeCrossReference_1_1_0()); 
            // InternalExpress.g:4244:3: ( RULE_ID )
            // InternalExpress.g:4245:4: RULE_ID
            {
             before(grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDefinedTypeList__ElementsAssignment_1_1"


    // $ANTLR start "rule__IntegerAttribute__NameAssignment_0"
    // InternalExpress.g:4256:1: rule__IntegerAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IntegerAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4260:1: ( ( RULE_ID ) )
            // InternalExpress.g:4261:2: ( RULE_ID )
            {
            // InternalExpress.g:4261:2: ( RULE_ID )
            // InternalExpress.g:4262:3: RULE_ID
            {
             before(grammarAccess.getIntegerAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAttribute__NameAssignment_0"


    // $ANTLR start "rule__IntegerAttribute__OptionalAssignment_2"
    // InternalExpress.g:4271:1: rule__IntegerAttribute__OptionalAssignment_2 : ( ( 'OPTIONAL' ) ) ;
    public final void rule__IntegerAttribute__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4275:1: ( ( ( 'OPTIONAL' ) ) )
            // InternalExpress.g:4276:2: ( ( 'OPTIONAL' ) )
            {
            // InternalExpress.g:4276:2: ( ( 'OPTIONAL' ) )
            // InternalExpress.g:4277:3: ( 'OPTIONAL' )
            {
             before(grammarAccess.getIntegerAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            // InternalExpress.g:4278:3: ( 'OPTIONAL' )
            // InternalExpress.g:4279:4: 'OPTIONAL'
            {
             before(grammarAccess.getIntegerAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntegerAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }

             after(grammarAccess.getIntegerAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAttribute__OptionalAssignment_2"


    // $ANTLR start "rule__StringAttribute__NameAssignment_0"
    // InternalExpress.g:4290:1: rule__StringAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StringAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4294:1: ( ( RULE_ID ) )
            // InternalExpress.g:4295:2: ( RULE_ID )
            {
            // InternalExpress.g:4295:2: ( RULE_ID )
            // InternalExpress.g:4296:3: RULE_ID
            {
             before(grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__NameAssignment_0"


    // $ANTLR start "rule__StringAttribute__OptionalAssignment_2"
    // InternalExpress.g:4305:1: rule__StringAttribute__OptionalAssignment_2 : ( ( 'OPTIONAL' ) ) ;
    public final void rule__StringAttribute__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4309:1: ( ( ( 'OPTIONAL' ) ) )
            // InternalExpress.g:4310:2: ( ( 'OPTIONAL' ) )
            {
            // InternalExpress.g:4310:2: ( ( 'OPTIONAL' ) )
            // InternalExpress.g:4311:3: ( 'OPTIONAL' )
            {
             before(grammarAccess.getStringAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            // InternalExpress.g:4312:3: ( 'OPTIONAL' )
            // InternalExpress.g:4313:4: 'OPTIONAL'
            {
             before(grammarAccess.getStringAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }

             after(grammarAccess.getStringAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__OptionalAssignment_2"


    // $ANTLR start "rule__RealAttribute__NameAssignment_0"
    // InternalExpress.g:4324:1: rule__RealAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RealAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4328:1: ( ( RULE_ID ) )
            // InternalExpress.g:4329:2: ( RULE_ID )
            {
            // InternalExpress.g:4329:2: ( RULE_ID )
            // InternalExpress.g:4330:3: RULE_ID
            {
             before(grammarAccess.getRealAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRealAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealAttribute__NameAssignment_0"


    // $ANTLR start "rule__RealAttribute__OptionalAssignment_2"
    // InternalExpress.g:4339:1: rule__RealAttribute__OptionalAssignment_2 : ( ( 'OPTIONAL' ) ) ;
    public final void rule__RealAttribute__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4343:1: ( ( ( 'OPTIONAL' ) ) )
            // InternalExpress.g:4344:2: ( ( 'OPTIONAL' ) )
            {
            // InternalExpress.g:4344:2: ( ( 'OPTIONAL' ) )
            // InternalExpress.g:4345:3: ( 'OPTIONAL' )
            {
             before(grammarAccess.getRealAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            // InternalExpress.g:4346:3: ( 'OPTIONAL' )
            // InternalExpress.g:4347:4: 'OPTIONAL'
            {
             before(grammarAccess.getRealAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRealAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }

             after(grammarAccess.getRealAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealAttribute__OptionalAssignment_2"


    // $ANTLR start "rule__BooleanAttribute__NameAssignment_0"
    // InternalExpress.g:4358:1: rule__BooleanAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BooleanAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4362:1: ( ( RULE_ID ) )
            // InternalExpress.g:4363:2: ( RULE_ID )
            {
            // InternalExpress.g:4363:2: ( RULE_ID )
            // InternalExpress.g:4364:3: RULE_ID
            {
             before(grammarAccess.getBooleanAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBooleanAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAttribute__NameAssignment_0"


    // $ANTLR start "rule__BooleanAttribute__OptionalAssignment_2"
    // InternalExpress.g:4373:1: rule__BooleanAttribute__OptionalAssignment_2 : ( ( 'OPTIONAL' ) ) ;
    public final void rule__BooleanAttribute__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4377:1: ( ( ( 'OPTIONAL' ) ) )
            // InternalExpress.g:4378:2: ( ( 'OPTIONAL' ) )
            {
            // InternalExpress.g:4378:2: ( ( 'OPTIONAL' ) )
            // InternalExpress.g:4379:3: ( 'OPTIONAL' )
            {
             before(grammarAccess.getBooleanAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            // InternalExpress.g:4380:3: ( 'OPTIONAL' )
            // InternalExpress.g:4381:4: 'OPTIONAL'
            {
             before(grammarAccess.getBooleanAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBooleanAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }

             after(grammarAccess.getBooleanAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAttribute__OptionalAssignment_2"


    // $ANTLR start "rule__ReferenceAttribute__NameAssignment_0"
    // InternalExpress.g:4392:1: rule__ReferenceAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReferenceAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4396:1: ( ( RULE_ID ) )
            // InternalExpress.g:4397:2: ( RULE_ID )
            {
            // InternalExpress.g:4397:2: ( RULE_ID )
            // InternalExpress.g:4398:3: RULE_ID
            {
             before(grammarAccess.getReferenceAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAttribute__NameAssignment_0"


    // $ANTLR start "rule__ReferenceAttribute__OptionalAssignment_2"
    // InternalExpress.g:4407:1: rule__ReferenceAttribute__OptionalAssignment_2 : ( ( 'OPTIONAL' ) ) ;
    public final void rule__ReferenceAttribute__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4411:1: ( ( ( 'OPTIONAL' ) ) )
            // InternalExpress.g:4412:2: ( ( 'OPTIONAL' ) )
            {
            // InternalExpress.g:4412:2: ( ( 'OPTIONAL' ) )
            // InternalExpress.g:4413:3: ( 'OPTIONAL' )
            {
             before(grammarAccess.getReferenceAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            // InternalExpress.g:4414:3: ( 'OPTIONAL' )
            // InternalExpress.g:4415:4: 'OPTIONAL'
            {
             before(grammarAccess.getReferenceAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReferenceAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }

             after(grammarAccess.getReferenceAttributeAccess().getOptionalOPTIONALKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAttribute__OptionalAssignment_2"


    // $ANTLR start "rule__ReferenceAttribute__ReferenceAssignment_3"
    // InternalExpress.g:4426:1: rule__ReferenceAttribute__ReferenceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceAttribute__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpress.g:4430:1: ( ( ( RULE_ID ) ) )
            // InternalExpress.g:4431:2: ( ( RULE_ID ) )
            {
            // InternalExpress.g:4431:2: ( ( RULE_ID ) )
            // InternalExpress.g:4432:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAttributeAccess().getReferenceUserDefinedTypeCrossReference_3_0()); 
            // InternalExpress.g:4433:3: ( RULE_ID )
            // InternalExpress.g:4434:4: RULE_ID
            {
             before(grammarAccess.getReferenceAttributeAccess().getReferenceUserDefinedTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAttributeAccess().getReferenceUserDefinedTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReferenceAttributeAccess().getReferenceUserDefinedTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAttribute__ReferenceAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000440830000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000440820002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000380000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000010L});

}