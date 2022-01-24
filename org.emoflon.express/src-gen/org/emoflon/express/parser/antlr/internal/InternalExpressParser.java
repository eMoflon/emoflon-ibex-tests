package org.emoflon.express.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.emoflon.express.services.ExpressGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SCHEMA'", "';'", "'END_SCHEMA;'", "'INTEGER'", "'BOOLEAN'", "'STRING'", "'USE'", "'FROM'", "'('", "')'", "','", "'AS'", "'TYPE'", "'='", "'SELECT'", "');'", "'END_TYPE;'", "'ENUMERATION'", "'OF'", "'ENTITY'", "'SUPERTYPE'", "'SUBTYPE'", "'END_ENTITY;'", "'FUNCTION'", "':'", "'...'", "'END_FUNCTION;'", "'OPTIONAL'", "'REAL'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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

        public InternalExpressParser(TokenStream input, ExpressGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SchemaContainer";
       	}

       	@Override
       	protected ExpressGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchemaContainer"
    // InternalExpress.g:64:1: entryRuleSchemaContainer returns [EObject current=null] : iv_ruleSchemaContainer= ruleSchemaContainer EOF ;
    public final EObject entryRuleSchemaContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaContainer = null;


        try {
            // InternalExpress.g:64:56: (iv_ruleSchemaContainer= ruleSchemaContainer EOF )
            // InternalExpress.g:65:2: iv_ruleSchemaContainer= ruleSchemaContainer EOF
            {
             newCompositeNode(grammarAccess.getSchemaContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchemaContainer=ruleSchemaContainer();

            state._fsp--;

             current =iv_ruleSchemaContainer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchemaContainer"


    // $ANTLR start "ruleSchemaContainer"
    // InternalExpress.g:71:1: ruleSchemaContainer returns [EObject current=null] : ( (lv_schemas_0_0= ruleSchema ) ) ;
    public final EObject ruleSchemaContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_schemas_0_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:77:2: ( ( (lv_schemas_0_0= ruleSchema ) ) )
            // InternalExpress.g:78:2: ( (lv_schemas_0_0= ruleSchema ) )
            {
            // InternalExpress.g:78:2: ( (lv_schemas_0_0= ruleSchema ) )
            // InternalExpress.g:79:3: (lv_schemas_0_0= ruleSchema )
            {
            // InternalExpress.g:79:3: (lv_schemas_0_0= ruleSchema )
            // InternalExpress.g:80:4: lv_schemas_0_0= ruleSchema
            {

            				newCompositeNode(grammarAccess.getSchemaContainerAccess().getSchemasSchemaParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_schemas_0_0=ruleSchema();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSchemaContainerRule());
            				}
            				add(
            					current,
            					"schemas",
            					lv_schemas_0_0,
            					"org.emoflon.express.Express.Schema");
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
    // $ANTLR end "ruleSchemaContainer"


    // $ANTLR start "entryRuleSchema"
    // InternalExpress.g:100:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalExpress.g:100:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalExpress.g:101:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalExpress.g:107:1: ruleSchema returns [EObject current=null] : (otherlv_0= 'SCHEMA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= 'END_SCHEMA;' ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declarations_3_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:113:2: ( (otherlv_0= 'SCHEMA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= 'END_SCHEMA;' ) )
            // InternalExpress.g:114:2: (otherlv_0= 'SCHEMA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= 'END_SCHEMA;' )
            {
            // InternalExpress.g:114:2: (otherlv_0= 'SCHEMA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= 'END_SCHEMA;' )
            // InternalExpress.g:115:3: otherlv_0= 'SCHEMA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= 'END_SCHEMA;'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaAccess().getSCHEMAKeyword_0());
            		
            // InternalExpress.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpress.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpress.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalExpress.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSchemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemaAccess().getSemicolonKeyword_2());
            		
            // InternalExpress.g:141:3: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==23||LA1_0==30||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpress.g:142:4: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalExpress.g:142:4: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalExpress.g:143:5: lv_declarations_3_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getDeclarationsDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_3_0,
            	    						"org.emoflon.express.Express.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSchemaAccess().getEND_SCHEMAKeyword_4());
            		

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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleDeclaration"
    // InternalExpress.g:168:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalExpress.g:168:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalExpress.g:169:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalExpress.g:175:1: ruleDeclaration returns [EObject current=null] : (this_UserDefinedType_0= ruleUserDefinedType | this_Function_1= ruleFunction | this_UseFrom_2= ruleUseFrom ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_UserDefinedType_0 = null;

        EObject this_Function_1 = null;

        EObject this_UseFrom_2 = null;



        	enterRule();

        try {
            // InternalExpress.g:181:2: ( (this_UserDefinedType_0= ruleUserDefinedType | this_Function_1= ruleFunction | this_UseFrom_2= ruleUseFrom ) )
            // InternalExpress.g:182:2: (this_UserDefinedType_0= ruleUserDefinedType | this_Function_1= ruleFunction | this_UseFrom_2= ruleUseFrom )
            {
            // InternalExpress.g:182:2: (this_UserDefinedType_0= ruleUserDefinedType | this_Function_1= ruleFunction | this_UseFrom_2= ruleUseFrom )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
            case 30:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalExpress.g:183:3: this_UserDefinedType_0= ruleUserDefinedType
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getUserDefinedTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UserDefinedType_0=ruleUserDefinedType();

                    state._fsp--;


                    			current = this_UserDefinedType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpress.g:192:3: this_Function_1= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_1=ruleFunction();

                    state._fsp--;


                    			current = this_Function_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExpress.g:201:3: this_UseFrom_2= ruleUseFrom
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getUseFromParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UseFrom_2=ruleUseFrom();

                    state._fsp--;


                    			current = this_UseFrom_2;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleReferenceOrValue"
    // InternalExpress.g:213:1: entryRuleReferenceOrValue returns [EObject current=null] : iv_ruleReferenceOrValue= ruleReferenceOrValue EOF ;
    public final EObject entryRuleReferenceOrValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceOrValue = null;


        try {
            // InternalExpress.g:213:57: (iv_ruleReferenceOrValue= ruleReferenceOrValue EOF )
            // InternalExpress.g:214:2: iv_ruleReferenceOrValue= ruleReferenceOrValue EOF
            {
             newCompositeNode(grammarAccess.getReferenceOrValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceOrValue=ruleReferenceOrValue();

            state._fsp--;

             current =iv_ruleReferenceOrValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferenceOrValue"


    // $ANTLR start "ruleReferenceOrValue"
    // InternalExpress.g:220:1: ruleReferenceOrValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' ) ) ) ) ;
    public final EObject ruleReferenceOrValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_1_3=null;


        	enterRule();

        try {
            // InternalExpress.g:226:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' ) ) ) ) )
            // InternalExpress.g:227:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' ) ) ) )
            {
            // InternalExpress.g:227:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=14 && LA4_0<=16)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpress.g:228:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalExpress.g:228:3: ( (otherlv_0= RULE_ID ) )
                    // InternalExpress.g:229:4: (otherlv_0= RULE_ID )
                    {
                    // InternalExpress.g:229:4: (otherlv_0= RULE_ID )
                    // InternalExpress.g:230:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReferenceOrValueRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getReferenceOrValueAccess().getReferenceUserDefinedTypeCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExpress.g:242:3: ( ( (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' ) ) )
                    {
                    // InternalExpress.g:242:3: ( ( (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' ) ) )
                    // InternalExpress.g:243:4: ( (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' ) )
                    {
                    // InternalExpress.g:243:4: ( (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' ) )
                    // InternalExpress.g:244:5: (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' )
                    {
                    // InternalExpress.g:244:5: (lv_value_1_1= 'INTEGER' | lv_value_1_2= 'BOOLEAN' | lv_value_1_3= 'STRING' )
                    int alt3=3;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        alt3=1;
                        }
                        break;
                    case 15:
                        {
                        alt3=2;
                        }
                        break;
                    case 16:
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
                            // InternalExpress.g:245:6: lv_value_1_1= 'INTEGER'
                            {
                            lv_value_1_1=(Token)match(input,14,FOLLOW_2); 

                            						newLeafNode(lv_value_1_1, grammarAccess.getReferenceOrValueAccess().getValueINTEGERKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getReferenceOrValueRule());
                            						}
                            						setWithLastConsumed(current, "value", lv_value_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalExpress.g:256:6: lv_value_1_2= 'BOOLEAN'
                            {
                            lv_value_1_2=(Token)match(input,15,FOLLOW_2); 

                            						newLeafNode(lv_value_1_2, grammarAccess.getReferenceOrValueAccess().getValueBOOLEANKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getReferenceOrValueRule());
                            						}
                            						setWithLastConsumed(current, "value", lv_value_1_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalExpress.g:267:6: lv_value_1_3= 'STRING'
                            {
                            lv_value_1_3=(Token)match(input,16,FOLLOW_2); 

                            						newLeafNode(lv_value_1_3, grammarAccess.getReferenceOrValueAccess().getValueSTRINGKeyword_1_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getReferenceOrValueRule());
                            						}
                            						setWithLastConsumed(current, "value", lv_value_1_3, null);
                            					

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleReferenceOrValue"


    // $ANTLR start "entryRuleUserDefinedType"
    // InternalExpress.g:284:1: entryRuleUserDefinedType returns [EObject current=null] : iv_ruleUserDefinedType= ruleUserDefinedType EOF ;
    public final EObject entryRuleUserDefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedType = null;


        try {
            // InternalExpress.g:284:56: (iv_ruleUserDefinedType= ruleUserDefinedType EOF )
            // InternalExpress.g:285:2: iv_ruleUserDefinedType= ruleUserDefinedType EOF
            {
             newCompositeNode(grammarAccess.getUserDefinedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserDefinedType=ruleUserDefinedType();

            state._fsp--;

             current =iv_ruleUserDefinedType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserDefinedType"


    // $ANTLR start "ruleUserDefinedType"
    // InternalExpress.g:291:1: ruleUserDefinedType returns [EObject current=null] : (this_SelectType_0= ruleSelectType | this_EnumerationType_1= ruleEnumerationType | this_AliasType_2= ruleAliasType | this_Entity_3= ruleEntity ) ;
    public final EObject ruleUserDefinedType() throws RecognitionException {
        EObject current = null;

        EObject this_SelectType_0 = null;

        EObject this_EnumerationType_1 = null;

        EObject this_AliasType_2 = null;

        EObject this_Entity_3 = null;



        	enterRule();

        try {
            // InternalExpress.g:297:2: ( (this_SelectType_0= ruleSelectType | this_EnumerationType_1= ruleEnumerationType | this_AliasType_2= ruleAliasType | this_Entity_3= ruleEntity ) )
            // InternalExpress.g:298:2: (this_SelectType_0= ruleSelectType | this_EnumerationType_1= ruleEnumerationType | this_AliasType_2= ruleAliasType | this_Entity_3= ruleEntity )
            {
            // InternalExpress.g:298:2: (this_SelectType_0= ruleSelectType | this_EnumerationType_1= ruleEnumerationType | this_AliasType_2= ruleAliasType | this_Entity_3= ruleEntity )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==24) ) {
                        switch ( input.LA(4) ) {
                        case 25:
                            {
                            alt5=1;
                            }
                            break;
                        case 28:
                            {
                            alt5=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            alt5=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==30) ) {
                alt5=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExpress.g:299:3: this_SelectType_0= ruleSelectType
                    {

                    			newCompositeNode(grammarAccess.getUserDefinedTypeAccess().getSelectTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectType_0=ruleSelectType();

                    state._fsp--;


                    			current = this_SelectType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpress.g:308:3: this_EnumerationType_1= ruleEnumerationType
                    {

                    			newCompositeNode(grammarAccess.getUserDefinedTypeAccess().getEnumerationTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumerationType_1=ruleEnumerationType();

                    state._fsp--;


                    			current = this_EnumerationType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExpress.g:317:3: this_AliasType_2= ruleAliasType
                    {

                    			newCompositeNode(grammarAccess.getUserDefinedTypeAccess().getAliasTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AliasType_2=ruleAliasType();

                    state._fsp--;


                    			current = this_AliasType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExpress.g:326:3: this_Entity_3= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getUserDefinedTypeAccess().getEntityParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_3=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_3;
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
    // $ANTLR end "ruleUserDefinedType"


    // $ANTLR start "entryRuleUseFrom"
    // InternalExpress.g:338:1: entryRuleUseFrom returns [EObject current=null] : iv_ruleUseFrom= ruleUseFrom EOF ;
    public final EObject entryRuleUseFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseFrom = null;


        try {
            // InternalExpress.g:338:48: (iv_ruleUseFrom= ruleUseFrom EOF )
            // InternalExpress.g:339:2: iv_ruleUseFrom= ruleUseFrom EOF
            {
             newCompositeNode(grammarAccess.getUseFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseFrom=ruleUseFrom();

            state._fsp--;

             current =iv_ruleUseFrom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUseFrom"


    // $ANTLR start "ruleUseFrom"
    // InternalExpress.g:345:1: ruleUseFrom returns [EObject current=null] : (otherlv_0= 'USE' otherlv_1= 'FROM' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_importedEntities_4_0= ruleImportedEntityList ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleUseFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_importedEntities_4_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:351:2: ( (otherlv_0= 'USE' otherlv_1= 'FROM' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_importedEntities_4_0= ruleImportedEntityList ) ) otherlv_5= ')' )? ) )
            // InternalExpress.g:352:2: (otherlv_0= 'USE' otherlv_1= 'FROM' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_importedEntities_4_0= ruleImportedEntityList ) ) otherlv_5= ')' )? )
            {
            // InternalExpress.g:352:2: (otherlv_0= 'USE' otherlv_1= 'FROM' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_importedEntities_4_0= ruleImportedEntityList ) ) otherlv_5= ')' )? )
            // InternalExpress.g:353:3: otherlv_0= 'USE' otherlv_1= 'FROM' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_importedEntities_4_0= ruleImportedEntityList ) ) otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUseFromAccess().getUSEKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUseFromAccess().getFROMKeyword_1());
            		
            // InternalExpress.g:361:3: ( (otherlv_2= RULE_ID ) )
            // InternalExpress.g:362:4: (otherlv_2= RULE_ID )
            {
            // InternalExpress.g:362:4: (otherlv_2= RULE_ID )
            // InternalExpress.g:363:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseFromRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_2, grammarAccess.getUseFromAccess().getSchemaSchemaCrossReference_2_0());
            				

            }


            }

            // InternalExpress.g:374:3: (otherlv_3= '(' ( (lv_importedEntities_4_0= ruleImportedEntityList ) ) otherlv_5= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalExpress.g:375:4: otherlv_3= '(' ( (lv_importedEntities_4_0= ruleImportedEntityList ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseFromAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalExpress.g:379:4: ( (lv_importedEntities_4_0= ruleImportedEntityList ) )
                    // InternalExpress.g:380:5: (lv_importedEntities_4_0= ruleImportedEntityList )
                    {
                    // InternalExpress.g:380:5: (lv_importedEntities_4_0= ruleImportedEntityList )
                    // InternalExpress.g:381:6: lv_importedEntities_4_0= ruleImportedEntityList
                    {

                    						newCompositeNode(grammarAccess.getUseFromAccess().getImportedEntitiesImportedEntityListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_importedEntities_4_0=ruleImportedEntityList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseFromRule());
                    						}
                    						set(
                    							current,
                    							"importedEntities",
                    							lv_importedEntities_4_0,
                    							"org.emoflon.express.Express.ImportedEntityList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getUseFromAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "ruleUseFrom"


    // $ANTLR start "entryRuleImportedEntityList"
    // InternalExpress.g:407:1: entryRuleImportedEntityList returns [EObject current=null] : iv_ruleImportedEntityList= ruleImportedEntityList EOF ;
    public final EObject entryRuleImportedEntityList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedEntityList = null;


        try {
            // InternalExpress.g:407:59: (iv_ruleImportedEntityList= ruleImportedEntityList EOF )
            // InternalExpress.g:408:2: iv_ruleImportedEntityList= ruleImportedEntityList EOF
            {
             newCompositeNode(grammarAccess.getImportedEntityListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedEntityList=ruleImportedEntityList();

            state._fsp--;

             current =iv_ruleImportedEntityList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportedEntityList"


    // $ANTLR start "ruleImportedEntityList"
    // InternalExpress.g:414:1: ruleImportedEntityList returns [EObject current=null] : ( ( (lv_entities_0_0= ruleImportedEntity ) ) (otherlv_1= ',' ( (lv_entities_2_0= ruleImportedEntity ) ) )* ) ;
    public final EObject ruleImportedEntityList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_entities_0_0 = null;

        EObject lv_entities_2_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:420:2: ( ( ( (lv_entities_0_0= ruleImportedEntity ) ) (otherlv_1= ',' ( (lv_entities_2_0= ruleImportedEntity ) ) )* ) )
            // InternalExpress.g:421:2: ( ( (lv_entities_0_0= ruleImportedEntity ) ) (otherlv_1= ',' ( (lv_entities_2_0= ruleImportedEntity ) ) )* )
            {
            // InternalExpress.g:421:2: ( ( (lv_entities_0_0= ruleImportedEntity ) ) (otherlv_1= ',' ( (lv_entities_2_0= ruleImportedEntity ) ) )* )
            // InternalExpress.g:422:3: ( (lv_entities_0_0= ruleImportedEntity ) ) (otherlv_1= ',' ( (lv_entities_2_0= ruleImportedEntity ) ) )*
            {
            // InternalExpress.g:422:3: ( (lv_entities_0_0= ruleImportedEntity ) )
            // InternalExpress.g:423:4: (lv_entities_0_0= ruleImportedEntity )
            {
            // InternalExpress.g:423:4: (lv_entities_0_0= ruleImportedEntity )
            // InternalExpress.g:424:5: lv_entities_0_0= ruleImportedEntity
            {

            					newCompositeNode(grammarAccess.getImportedEntityListAccess().getEntitiesImportedEntityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_entities_0_0=ruleImportedEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportedEntityListRule());
            					}
            					add(
            						current,
            						"entities",
            						lv_entities_0_0,
            						"org.emoflon.express.Express.ImportedEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpress.g:441:3: (otherlv_1= ',' ( (lv_entities_2_0= ruleImportedEntity ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExpress.g:442:4: otherlv_1= ',' ( (lv_entities_2_0= ruleImportedEntity ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getImportedEntityListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalExpress.g:446:4: ( (lv_entities_2_0= ruleImportedEntity ) )
            	    // InternalExpress.g:447:5: (lv_entities_2_0= ruleImportedEntity )
            	    {
            	    // InternalExpress.g:447:5: (lv_entities_2_0= ruleImportedEntity )
            	    // InternalExpress.g:448:6: lv_entities_2_0= ruleImportedEntity
            	    {

            	    						newCompositeNode(grammarAccess.getImportedEntityListAccess().getEntitiesImportedEntityParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_entities_2_0=ruleImportedEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImportedEntityListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entities",
            	    							lv_entities_2_0,
            	    							"org.emoflon.express.Express.ImportedEntity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleImportedEntityList"


    // $ANTLR start "entryRuleImportedEntity"
    // InternalExpress.g:470:1: entryRuleImportedEntity returns [EObject current=null] : iv_ruleImportedEntity= ruleImportedEntity EOF ;
    public final EObject entryRuleImportedEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedEntity = null;


        try {
            // InternalExpress.g:470:55: (iv_ruleImportedEntity= ruleImportedEntity EOF )
            // InternalExpress.g:471:2: iv_ruleImportedEntity= ruleImportedEntity EOF
            {
             newCompositeNode(grammarAccess.getImportedEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedEntity=ruleImportedEntity();

            state._fsp--;

             current =iv_ruleImportedEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportedEntity"


    // $ANTLR start "ruleImportedEntity"
    // InternalExpress.g:477:1: ruleImportedEntity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleImportedEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalExpress.g:483:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? ) )
            // InternalExpress.g:484:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? )
            {
            // InternalExpress.g:484:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )? )
            // InternalExpress.g:485:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )?
            {
            // InternalExpress.g:485:3: ( (otherlv_0= RULE_ID ) )
            // InternalExpress.g:486:4: (otherlv_0= RULE_ID )
            {
            // InternalExpress.g:486:4: (otherlv_0= RULE_ID )
            // InternalExpress.g:487:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportedEntityRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getImportedEntityAccess().getEntityEntityCrossReference_0_0());
            				

            }


            }

            // InternalExpress.g:498:3: (otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalExpress.g:499:4: otherlv_1= 'AS' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportedEntityAccess().getASKeyword_1_0());
                    			
                    // InternalExpress.g:503:4: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalExpress.g:504:5: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalExpress.g:504:5: (lv_alias_2_0= RULE_ID )
                    // InternalExpress.g:505:6: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_alias_2_0, grammarAccess.getImportedEntityAccess().getAliasIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportedEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    // $ANTLR end "ruleImportedEntity"


    // $ANTLR start "entryRuleSelectType"
    // InternalExpress.g:526:1: entryRuleSelectType returns [EObject current=null] : iv_ruleSelectType= ruleSelectType EOF ;
    public final EObject entryRuleSelectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectType = null;


        try {
            // InternalExpress.g:526:51: (iv_ruleSelectType= ruleSelectType EOF )
            // InternalExpress.g:527:2: iv_ruleSelectType= ruleSelectType EOF
            {
             newCompositeNode(grammarAccess.getSelectTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectType=ruleSelectType();

            state._fsp--;

             current =iv_ruleSelectType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectType"


    // $ANTLR start "ruleSelectType"
    // InternalExpress.g:533:1: ruleSelectType returns [EObject current=null] : (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'SELECT' otherlv_4= '(' ( (lv_types_5_0= ruleUserDefinedTypeList ) ) otherlv_6= ');' otherlv_7= 'END_TYPE;' ) ;
    public final EObject ruleSelectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_types_5_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:539:2: ( (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'SELECT' otherlv_4= '(' ( (lv_types_5_0= ruleUserDefinedTypeList ) ) otherlv_6= ');' otherlv_7= 'END_TYPE;' ) )
            // InternalExpress.g:540:2: (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'SELECT' otherlv_4= '(' ( (lv_types_5_0= ruleUserDefinedTypeList ) ) otherlv_6= ');' otherlv_7= 'END_TYPE;' )
            {
            // InternalExpress.g:540:2: (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'SELECT' otherlv_4= '(' ( (lv_types_5_0= ruleUserDefinedTypeList ) ) otherlv_6= ');' otherlv_7= 'END_TYPE;' )
            // InternalExpress.g:541:3: otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'SELECT' otherlv_4= '(' ( (lv_types_5_0= ruleUserDefinedTypeList ) ) otherlv_6= ');' otherlv_7= 'END_TYPE;'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectTypeAccess().getTYPEKeyword_0());
            		
            // InternalExpress.g:545:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpress.g:546:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpress.g:546:4: (lv_name_1_0= RULE_ID )
            // InternalExpress.g:547:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSelectTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectTypeAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectTypeAccess().getSELECTKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectTypeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalExpress.g:575:3: ( (lv_types_5_0= ruleUserDefinedTypeList ) )
            // InternalExpress.g:576:4: (lv_types_5_0= ruleUserDefinedTypeList )
            {
            // InternalExpress.g:576:4: (lv_types_5_0= ruleUserDefinedTypeList )
            // InternalExpress.g:577:5: lv_types_5_0= ruleUserDefinedTypeList
            {

            					newCompositeNode(grammarAccess.getSelectTypeAccess().getTypesUserDefinedTypeListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_types_5_0=ruleUserDefinedTypeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectTypeRule());
            					}
            					set(
            						current,
            						"types",
            						lv_types_5_0,
            						"org.emoflon.express.Express.UserDefinedTypeList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectTypeAccess().getRightParenthesisSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSelectTypeAccess().getEND_TYPEKeyword_7());
            		

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
    // $ANTLR end "ruleSelectType"


    // $ANTLR start "entryRuleEnumerationType"
    // InternalExpress.g:606:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalExpress.g:606:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalExpress.g:607:2: iv_ruleEnumerationType= ruleEnumerationType EOF
            {
             newCompositeNode(grammarAccess.getEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationType=ruleEnumerationType();

            state._fsp--;

             current =iv_ruleEnumerationType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // InternalExpress.g:613:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'ENUMERATION' otherlv_4= 'OF' otherlv_5= '(' ( (lv_values_6_0= ruleEnumerationValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleEnumerationValue ) ) )? otherlv_9= ');' otherlv_10= 'END_TYPE;' ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_values_6_0 = null;

        EObject lv_values_8_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:619:2: ( (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'ENUMERATION' otherlv_4= 'OF' otherlv_5= '(' ( (lv_values_6_0= ruleEnumerationValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleEnumerationValue ) ) )? otherlv_9= ');' otherlv_10= 'END_TYPE;' ) )
            // InternalExpress.g:620:2: (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'ENUMERATION' otherlv_4= 'OF' otherlv_5= '(' ( (lv_values_6_0= ruleEnumerationValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleEnumerationValue ) ) )? otherlv_9= ');' otherlv_10= 'END_TYPE;' )
            {
            // InternalExpress.g:620:2: (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'ENUMERATION' otherlv_4= 'OF' otherlv_5= '(' ( (lv_values_6_0= ruleEnumerationValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleEnumerationValue ) ) )? otherlv_9= ');' otherlv_10= 'END_TYPE;' )
            // InternalExpress.g:621:3: otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'ENUMERATION' otherlv_4= 'OF' otherlv_5= '(' ( (lv_values_6_0= ruleEnumerationValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleEnumerationValue ) ) )? otherlv_9= ');' otherlv_10= 'END_TYPE;'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getTYPEKeyword_0());
            		
            // InternalExpress.g:625:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpress.g:626:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpress.g:626:4: (lv_name_1_0= RULE_ID )
            // InternalExpress.g:627:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeAccess().getENUMERATIONKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationTypeAccess().getOFKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_5());
            		
            // InternalExpress.g:659:3: ( (lv_values_6_0= ruleEnumerationValue ) )
            // InternalExpress.g:660:4: (lv_values_6_0= ruleEnumerationValue )
            {
            // InternalExpress.g:660:4: (lv_values_6_0= ruleEnumerationValue )
            // InternalExpress.g:661:5: lv_values_6_0= ruleEnumerationValue
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getValuesEnumerationValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_values_6_0=ruleEnumerationValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_6_0,
            						"org.emoflon.express.Express.EnumerationValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpress.g:678:3: (otherlv_7= ',' ( (lv_values_8_0= ruleEnumerationValue ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpress.g:679:4: otherlv_7= ',' ( (lv_values_8_0= ruleEnumerationValue ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_7_0());
                    			
                    // InternalExpress.g:683:4: ( (lv_values_8_0= ruleEnumerationValue ) )
                    // InternalExpress.g:684:5: (lv_values_8_0= ruleEnumerationValue )
                    {
                    // InternalExpress.g:684:5: (lv_values_8_0= ruleEnumerationValue )
                    // InternalExpress.g:685:6: lv_values_8_0= ruleEnumerationValue
                    {

                    						newCompositeNode(grammarAccess.getEnumerationTypeAccess().getValuesEnumerationValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_values_8_0=ruleEnumerationValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_8_0,
                    							"org.emoflon.express.Express.EnumerationValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumerationTypeAccess().getRightParenthesisSemicolonKeyword_8());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEnumerationTypeAccess().getEND_TYPEKeyword_9());
            		

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
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationValue"
    // InternalExpress.g:715:1: entryRuleEnumerationValue returns [EObject current=null] : iv_ruleEnumerationValue= ruleEnumerationValue EOF ;
    public final EObject entryRuleEnumerationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValue = null;


        try {
            // InternalExpress.g:715:57: (iv_ruleEnumerationValue= ruleEnumerationValue EOF )
            // InternalExpress.g:716:2: iv_ruleEnumerationValue= ruleEnumerationValue EOF
            {
             newCompositeNode(grammarAccess.getEnumerationValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationValue=ruleEnumerationValue();

            state._fsp--;

             current =iv_ruleEnumerationValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationValue"


    // $ANTLR start "ruleEnumerationValue"
    // InternalExpress.g:722:1: ruleEnumerationValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalExpress.g:728:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalExpress.g:729:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalExpress.g:729:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpress.g:730:3: (lv_name_0_0= RULE_ID )
            {
            // InternalExpress.g:730:3: (lv_name_0_0= RULE_ID )
            // InternalExpress.g:731:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnumerationValueAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumerationValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEnumerationValue"


    // $ANTLR start "entryRuleAliasType"
    // InternalExpress.g:750:1: entryRuleAliasType returns [EObject current=null] : iv_ruleAliasType= ruleAliasType EOF ;
    public final EObject entryRuleAliasType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasType = null;


        try {
            // InternalExpress.g:750:50: (iv_ruleAliasType= ruleAliasType EOF )
            // InternalExpress.g:751:2: iv_ruleAliasType= ruleAliasType EOF
            {
             newCompositeNode(grammarAccess.getAliasTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasType=ruleAliasType();

            state._fsp--;

             current =iv_ruleAliasType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAliasType"


    // $ANTLR start "ruleAliasType"
    // InternalExpress.g:757:1: ruleAliasType returns [EObject current=null] : (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' otherlv_5= 'END_TYPE;' ) ;
    public final EObject ruleAliasType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalExpress.g:763:2: ( (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' otherlv_5= 'END_TYPE;' ) )
            // InternalExpress.g:764:2: (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' otherlv_5= 'END_TYPE;' )
            {
            // InternalExpress.g:764:2: (otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' otherlv_5= 'END_TYPE;' )
            // InternalExpress.g:765:3: otherlv_0= 'TYPE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' otherlv_5= 'END_TYPE;'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAliasTypeAccess().getTYPEKeyword_0());
            		
            // InternalExpress.g:769:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpress.g:770:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpress.g:770:4: (lv_name_1_0= RULE_ID )
            // InternalExpress.g:771:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAliasTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAliasTypeAccess().getEqualsSignKeyword_2());
            		
            // InternalExpress.g:791:3: ( (otherlv_3= RULE_ID ) )
            // InternalExpress.g:792:4: (otherlv_3= RULE_ID )
            {
            // InternalExpress.g:792:4: (otherlv_3= RULE_ID )
            // InternalExpress.g:793:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasTypeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getAliasTypeAccess().getElementUserDefinedTypeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getAliasTypeAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAliasTypeAccess().getEND_TYPEKeyword_5());
            		

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
    // $ANTLR end "ruleAliasType"


    // $ANTLR start "entryRuleEntity"
    // InternalExpress.g:816:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalExpress.g:816:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalExpress.g:817:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalExpress.g:823:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'ENTITY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'SUPERTYPE' otherlv_4= 'OF' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ');' )? (otherlv_8= 'SUBTYPE' otherlv_9= 'OF' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ');' )? ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= 'END_ENTITY;' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_attributes_13_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:829:2: ( (otherlv_0= 'ENTITY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'SUPERTYPE' otherlv_4= 'OF' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ');' )? (otherlv_8= 'SUBTYPE' otherlv_9= 'OF' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ');' )? ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= 'END_ENTITY;' ) )
            // InternalExpress.g:830:2: (otherlv_0= 'ENTITY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'SUPERTYPE' otherlv_4= 'OF' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ');' )? (otherlv_8= 'SUBTYPE' otherlv_9= 'OF' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ');' )? ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= 'END_ENTITY;' )
            {
            // InternalExpress.g:830:2: (otherlv_0= 'ENTITY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'SUPERTYPE' otherlv_4= 'OF' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ');' )? (otherlv_8= 'SUBTYPE' otherlv_9= 'OF' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ');' )? ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= 'END_ENTITY;' )
            // InternalExpress.g:831:3: otherlv_0= 'ENTITY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'SUPERTYPE' otherlv_4= 'OF' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ');' )? (otherlv_8= 'SUBTYPE' otherlv_9= 'OF' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ');' )? ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= 'END_ENTITY;'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getENTITYKeyword_0());
            		
            // InternalExpress.g:835:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpress.g:836:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpress.g:836:4: (lv_name_1_0= RULE_ID )
            // InternalExpress.g:837:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getSemicolonKeyword_2());
            		
            // InternalExpress.g:857:3: (otherlv_3= 'SUPERTYPE' otherlv_4= 'OF' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ');' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpress.g:858:4: otherlv_3= 'SUPERTYPE' otherlv_4= 'OF' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ');'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSUPERTYPEKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getOFKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalExpress.g:870:4: ( (otherlv_6= RULE_ID ) )
                    // InternalExpress.g:871:5: (otherlv_6= RULE_ID )
                    {
                    // InternalExpress.g:871:5: (otherlv_6= RULE_ID )
                    // InternalExpress.g:872:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getSubTypeEntityCrossReference_3_3_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightParenthesisSemicolonKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalExpress.g:888:3: (otherlv_8= 'SUBTYPE' otherlv_9= 'OF' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ');' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalExpress.g:889:4: otherlv_8= 'SUBTYPE' otherlv_9= 'OF' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ');'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getSUBTYPEKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getOFKeyword_4_1());
                    			
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalExpress.g:901:4: ( (otherlv_11= RULE_ID ) )
                    // InternalExpress.g:902:5: (otherlv_11= RULE_ID )
                    {
                    // InternalExpress.g:902:5: (otherlv_11= RULE_ID )
                    // InternalExpress.g:903:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getRightParenthesisSemicolonKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalExpress.g:919:3: ( (lv_attributes_13_0= ruleAttribute ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExpress.g:920:4: (lv_attributes_13_0= ruleAttribute )
            	    {
            	    // InternalExpress.g:920:4: (lv_attributes_13_0= ruleAttribute )
            	    // InternalExpress.g:921:5: lv_attributes_13_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_attributes_13_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_13_0,
            	    						"org.emoflon.express.Express.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_14=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getEND_ENTITYKeyword_6());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFunction"
    // InternalExpress.g:946:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalExpress.g:946:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalExpress.g:947:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalExpress.g:953:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'FUNCTION' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= ruleReferenceOrValue ) ) ) otherlv_7= ';' otherlv_8= '...' otherlv_9= 'END_FUNCTION;' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_returnType_6_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:959:2: ( (otherlv_0= 'FUNCTION' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= ruleReferenceOrValue ) ) ) otherlv_7= ';' otherlv_8= '...' otherlv_9= 'END_FUNCTION;' ) )
            // InternalExpress.g:960:2: (otherlv_0= 'FUNCTION' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= ruleReferenceOrValue ) ) ) otherlv_7= ';' otherlv_8= '...' otherlv_9= 'END_FUNCTION;' )
            {
            // InternalExpress.g:960:2: (otherlv_0= 'FUNCTION' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= ruleReferenceOrValue ) ) ) otherlv_7= ';' otherlv_8= '...' otherlv_9= 'END_FUNCTION;' )
            // InternalExpress.g:961:3: otherlv_0= 'FUNCTION' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_returnType_6_0= ruleReferenceOrValue ) ) ) otherlv_7= ';' otherlv_8= '...' otherlv_9= 'END_FUNCTION;'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFUNCTIONKeyword_0());
            		
            // InternalExpress.g:965:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpress.g:966:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpress.g:966:4: (lv_name_1_0= RULE_ID )
            // InternalExpress.g:967:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalExpress.g:987:3: ( (lv_parameters_3_0= ruleParameterList ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalExpress.g:988:4: (lv_parameters_3_0= ruleParameterList )
                    {
                    // InternalExpress.g:988:4: (lv_parameters_3_0= ruleParameterList )
                    // InternalExpress.g:989:5: lv_parameters_3_0= ruleParameterList
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_3_0,
                    						"org.emoflon.express.Express.ParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		
            // InternalExpress.g:1010:3: (otherlv_5= ':' ( (lv_returnType_6_0= ruleReferenceOrValue ) ) )
            // InternalExpress.g:1011:4: otherlv_5= ':' ( (lv_returnType_6_0= ruleReferenceOrValue ) )
            {
            otherlv_5=(Token)match(input,35,FOLLOW_24); 

            				newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getColonKeyword_5_0());
            			
            // InternalExpress.g:1015:4: ( (lv_returnType_6_0= ruleReferenceOrValue ) )
            // InternalExpress.g:1016:5: (lv_returnType_6_0= ruleReferenceOrValue )
            {
            // InternalExpress.g:1016:5: (lv_returnType_6_0= ruleReferenceOrValue )
            // InternalExpress.g:1017:6: lv_returnType_6_0= ruleReferenceOrValue
            {

            						newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeReferenceOrValueParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_4);
            lv_returnType_6_0=ruleReferenceOrValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFunctionRule());
            						}
            						set(
            							current,
            							"returnType",
            							lv_returnType_6_0,
            							"org.emoflon.express.Express.ReferenceOrValue");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getSemicolonKeyword_6());
            		
            otherlv_8=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getFullStopFullStopFullStopKeyword_7());
            		
            otherlv_9=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getEND_FUNCTIONKeyword_8());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleParameterList"
    // InternalExpress.g:1051:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalExpress.g:1051:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalExpress.g:1052:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalExpress.g:1058:1: ruleParameterList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ';' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:1064:2: ( ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ';' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // InternalExpress.g:1065:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ';' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // InternalExpress.g:1065:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ';' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // InternalExpress.g:1066:3: ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ';' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // InternalExpress.g:1066:3: ( (lv_parameters_0_0= ruleParameter ) )
            // InternalExpress.g:1067:4: (lv_parameters_0_0= ruleParameter )
            {
            // InternalExpress.g:1067:4: (lv_parameters_0_0= ruleParameter )
            // InternalExpress.g:1068:5: lv_parameters_0_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_parameters_0_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"org.emoflon.express.Express.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpress.g:1085:3: (otherlv_1= ';' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpress.g:1086:4: otherlv_1= ';' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalExpress.g:1090:4: ( (lv_parameters_2_0= ruleParameter ) )
            	    // InternalExpress.g:1091:5: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalExpress.g:1091:5: (lv_parameters_2_0= ruleParameter )
            	    // InternalExpress.g:1092:6: lv_parameters_2_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_2_0,
            	    							"org.emoflon.express.Express.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // InternalExpress.g:1114:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalExpress.g:1114:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalExpress.g:1115:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalExpress.g:1121:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReferenceOrValue ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalExpress.g:1127:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReferenceOrValue ) ) ) )
            // InternalExpress.g:1128:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReferenceOrValue ) ) )
            {
            // InternalExpress.g:1128:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReferenceOrValue ) ) )
            // InternalExpress.g:1129:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReferenceOrValue ) )
            {
            // InternalExpress.g:1129:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpress.g:1130:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpress.g:1130:4: (lv_name_0_0= RULE_ID )
            // InternalExpress.g:1131:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalExpress.g:1151:3: ( (lv_type_2_0= ruleReferenceOrValue ) )
            // InternalExpress.g:1152:4: (lv_type_2_0= ruleReferenceOrValue )
            {
            // InternalExpress.g:1152:4: (lv_type_2_0= ruleReferenceOrValue )
            // InternalExpress.g:1153:5: lv_type_2_0= ruleReferenceOrValue
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceOrValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleReferenceOrValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.emoflon.express.Express.ReferenceOrValue");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleUserDefinedTypeList"
    // InternalExpress.g:1174:1: entryRuleUserDefinedTypeList returns [EObject current=null] : iv_ruleUserDefinedTypeList= ruleUserDefinedTypeList EOF ;
    public final EObject entryRuleUserDefinedTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedTypeList = null;


        try {
            // InternalExpress.g:1174:60: (iv_ruleUserDefinedTypeList= ruleUserDefinedTypeList EOF )
            // InternalExpress.g:1175:2: iv_ruleUserDefinedTypeList= ruleUserDefinedTypeList EOF
            {
             newCompositeNode(grammarAccess.getUserDefinedTypeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserDefinedTypeList=ruleUserDefinedTypeList();

            state._fsp--;

             current =iv_ruleUserDefinedTypeList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserDefinedTypeList"


    // $ANTLR start "ruleUserDefinedTypeList"
    // InternalExpress.g:1181:1: ruleUserDefinedTypeList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleUserDefinedTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExpress.g:1187:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalExpress.g:1188:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalExpress.g:1188:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalExpress.g:1189:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalExpress.g:1189:3: ( (otherlv_0= RULE_ID ) )
            // InternalExpress.g:1190:4: (otherlv_0= RULE_ID )
            {
            // InternalExpress.g:1190:4: (otherlv_0= RULE_ID )
            // InternalExpress.g:1191:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserDefinedTypeListRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeCrossReference_0_0());
            				

            }


            }

            // InternalExpress.g:1202:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpress.g:1203:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getUserDefinedTypeListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalExpress.g:1207:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalExpress.g:1208:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalExpress.g:1208:5: (otherlv_2= RULE_ID )
            	    // InternalExpress.g:1209:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUserDefinedTypeListRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_2, grammarAccess.getUserDefinedTypeListAccess().getElementsUserDefinedTypeCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleUserDefinedTypeList"


    // $ANTLR start "entryRuleAttribute"
    // InternalExpress.g:1225:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalExpress.g:1225:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalExpress.g:1226:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalExpress.g:1232:1: ruleAttribute returns [EObject current=null] : (this_IntegerAttribute_0= ruleIntegerAttribute | this_StringAttribute_1= ruleStringAttribute | this_RealAttribute_2= ruleRealAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_ReferenceAttribute_4= ruleReferenceAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerAttribute_0 = null;

        EObject this_StringAttribute_1 = null;

        EObject this_RealAttribute_2 = null;

        EObject this_BooleanAttribute_3 = null;

        EObject this_ReferenceAttribute_4 = null;



        	enterRule();

        try {
            // InternalExpress.g:1238:2: ( (this_IntegerAttribute_0= ruleIntegerAttribute | this_StringAttribute_1= ruleStringAttribute | this_RealAttribute_2= ruleRealAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_ReferenceAttribute_4= ruleReferenceAttribute ) )
            // InternalExpress.g:1239:2: (this_IntegerAttribute_0= ruleIntegerAttribute | this_StringAttribute_1= ruleStringAttribute | this_RealAttribute_2= ruleRealAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_ReferenceAttribute_4= ruleReferenceAttribute )
            {
            // InternalExpress.g:1239:2: (this_IntegerAttribute_0= ruleIntegerAttribute | this_StringAttribute_1= ruleStringAttribute | this_RealAttribute_2= ruleRealAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_ReferenceAttribute_4= ruleReferenceAttribute )
            int alt16=5;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==35) ) {
                    switch ( input.LA(3) ) {
                    case 38:
                        {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            alt16=1;
                            }
                            break;
                        case 16:
                            {
                            alt16=2;
                            }
                            break;
                        case 39:
                            {
                            alt16=3;
                            }
                            break;
                        case 15:
                            {
                            alt16=4;
                            }
                            break;
                        case RULE_ID:
                            {
                            alt16=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 39:
                        {
                        alt16=3;
                        }
                        break;
                    case 15:
                        {
                        alt16=4;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt16=5;
                        }
                        break;
                    case 14:
                        {
                        alt16=1;
                        }
                        break;
                    case 16:
                        {
                        alt16=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalExpress.g:1240:3: this_IntegerAttribute_0= ruleIntegerAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerAttribute_0=ruleIntegerAttribute();

                    state._fsp--;


                    			current = this_IntegerAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpress.g:1249:3: this_StringAttribute_1= ruleStringAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringAttribute_1=ruleStringAttribute();

                    state._fsp--;


                    			current = this_StringAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExpress.g:1258:3: this_RealAttribute_2= ruleRealAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getRealAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealAttribute_2=ruleRealAttribute();

                    state._fsp--;


                    			current = this_RealAttribute_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExpress.g:1267:3: this_BooleanAttribute_3= ruleBooleanAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanAttribute_3=ruleBooleanAttribute();

                    state._fsp--;


                    			current = this_BooleanAttribute_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalExpress.g:1276:3: this_ReferenceAttribute_4= ruleReferenceAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getReferenceAttributeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceAttribute_4=ruleReferenceAttribute();

                    state._fsp--;


                    			current = this_ReferenceAttribute_4;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleIntegerAttribute"
    // InternalExpress.g:1288:1: entryRuleIntegerAttribute returns [EObject current=null] : iv_ruleIntegerAttribute= ruleIntegerAttribute EOF ;
    public final EObject entryRuleIntegerAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerAttribute = null;


        try {
            // InternalExpress.g:1288:57: (iv_ruleIntegerAttribute= ruleIntegerAttribute EOF )
            // InternalExpress.g:1289:2: iv_ruleIntegerAttribute= ruleIntegerAttribute EOF
            {
             newCompositeNode(grammarAccess.getIntegerAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerAttribute=ruleIntegerAttribute();

            state._fsp--;

             current =iv_ruleIntegerAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerAttribute"


    // $ANTLR start "ruleIntegerAttribute"
    // InternalExpress.g:1295:1: ruleIntegerAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'INTEGER' otherlv_4= ';' ) ;
    public final EObject ruleIntegerAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalExpress.g:1301:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'INTEGER' otherlv_4= ';' ) )
            // InternalExpress.g:1302:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'INTEGER' otherlv_4= ';' )
            {
            // InternalExpress.g:1302:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'INTEGER' otherlv_4= ';' )
            // InternalExpress.g:1303:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'INTEGER' otherlv_4= ';'
            {
            // InternalExpress.g:1303:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpress.g:1304:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpress.g:1304:4: (lv_name_0_0= RULE_ID )
            // InternalExpress.g:1305:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIntegerAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerAttributeAccess().getColonKeyword_1());
            		
            // InternalExpress.g:1325:3: ( (lv_optional_2_0= 'OPTIONAL' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalExpress.g:1326:4: (lv_optional_2_0= 'OPTIONAL' )
                    {
                    // InternalExpress.g:1326:4: (lv_optional_2_0= 'OPTIONAL' )
                    // InternalExpress.g:1327:5: lv_optional_2_0= 'OPTIONAL'
                    {
                    lv_optional_2_0=(Token)match(input,38,FOLLOW_29); 

                    					newLeafNode(lv_optional_2_0, grammarAccess.getIntegerAttributeAccess().getOptionalOPTIONALKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerAttributeRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_2_0 != null, "OPTIONAL");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerAttributeAccess().getINTEGERKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegerAttributeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleIntegerAttribute"


    // $ANTLR start "entryRuleStringAttribute"
    // InternalExpress.g:1351:1: entryRuleStringAttribute returns [EObject current=null] : iv_ruleStringAttribute= ruleStringAttribute EOF ;
    public final EObject entryRuleStringAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttribute = null;


        try {
            // InternalExpress.g:1351:56: (iv_ruleStringAttribute= ruleStringAttribute EOF )
            // InternalExpress.g:1352:2: iv_ruleStringAttribute= ruleStringAttribute EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringAttribute=ruleStringAttribute();

            state._fsp--;

             current =iv_ruleStringAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringAttribute"


    // $ANTLR start "ruleStringAttribute"
    // InternalExpress.g:1358:1: ruleStringAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'STRING' otherlv_4= ';' ) ;
    public final EObject ruleStringAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalExpress.g:1364:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'STRING' otherlv_4= ';' ) )
            // InternalExpress.g:1365:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'STRING' otherlv_4= ';' )
            {
            // InternalExpress.g:1365:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'STRING' otherlv_4= ';' )
            // InternalExpress.g:1366:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'STRING' otherlv_4= ';'
            {
            // InternalExpress.g:1366:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpress.g:1367:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpress.g:1367:4: (lv_name_0_0= RULE_ID )
            // InternalExpress.g:1368:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getStringAttributeAccess().getColonKeyword_1());
            		
            // InternalExpress.g:1388:3: ( (lv_optional_2_0= 'OPTIONAL' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalExpress.g:1389:4: (lv_optional_2_0= 'OPTIONAL' )
                    {
                    // InternalExpress.g:1389:4: (lv_optional_2_0= 'OPTIONAL' )
                    // InternalExpress.g:1390:5: lv_optional_2_0= 'OPTIONAL'
                    {
                    lv_optional_2_0=(Token)match(input,38,FOLLOW_31); 

                    					newLeafNode(lv_optional_2_0, grammarAccess.getStringAttributeAccess().getOptionalOPTIONALKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringAttributeRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_2_0 != null, "OPTIONAL");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStringAttributeAccess().getSTRINGKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringAttributeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleStringAttribute"


    // $ANTLR start "entryRuleRealAttribute"
    // InternalExpress.g:1414:1: entryRuleRealAttribute returns [EObject current=null] : iv_ruleRealAttribute= ruleRealAttribute EOF ;
    public final EObject entryRuleRealAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealAttribute = null;


        try {
            // InternalExpress.g:1414:54: (iv_ruleRealAttribute= ruleRealAttribute EOF )
            // InternalExpress.g:1415:2: iv_ruleRealAttribute= ruleRealAttribute EOF
            {
             newCompositeNode(grammarAccess.getRealAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealAttribute=ruleRealAttribute();

            state._fsp--;

             current =iv_ruleRealAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealAttribute"


    // $ANTLR start "ruleRealAttribute"
    // InternalExpress.g:1421:1: ruleRealAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'REAL' otherlv_4= ';' ) ;
    public final EObject ruleRealAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalExpress.g:1427:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'REAL' otherlv_4= ';' ) )
            // InternalExpress.g:1428:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'REAL' otherlv_4= ';' )
            {
            // InternalExpress.g:1428:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'REAL' otherlv_4= ';' )
            // InternalExpress.g:1429:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'REAL' otherlv_4= ';'
            {
            // InternalExpress.g:1429:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpress.g:1430:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpress.g:1430:4: (lv_name_0_0= RULE_ID )
            // InternalExpress.g:1431:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRealAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRealAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getRealAttributeAccess().getColonKeyword_1());
            		
            // InternalExpress.g:1451:3: ( (lv_optional_2_0= 'OPTIONAL' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalExpress.g:1452:4: (lv_optional_2_0= 'OPTIONAL' )
                    {
                    // InternalExpress.g:1452:4: (lv_optional_2_0= 'OPTIONAL' )
                    // InternalExpress.g:1453:5: lv_optional_2_0= 'OPTIONAL'
                    {
                    lv_optional_2_0=(Token)match(input,38,FOLLOW_33); 

                    					newLeafNode(lv_optional_2_0, grammarAccess.getRealAttributeAccess().getOptionalOPTIONALKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealAttributeRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_2_0 != null, "OPTIONAL");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRealAttributeAccess().getREALKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRealAttributeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleRealAttribute"


    // $ANTLR start "entryRuleBooleanAttribute"
    // InternalExpress.g:1477:1: entryRuleBooleanAttribute returns [EObject current=null] : iv_ruleBooleanAttribute= ruleBooleanAttribute EOF ;
    public final EObject entryRuleBooleanAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAttribute = null;


        try {
            // InternalExpress.g:1477:57: (iv_ruleBooleanAttribute= ruleBooleanAttribute EOF )
            // InternalExpress.g:1478:2: iv_ruleBooleanAttribute= ruleBooleanAttribute EOF
            {
             newCompositeNode(grammarAccess.getBooleanAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanAttribute=ruleBooleanAttribute();

            state._fsp--;

             current =iv_ruleBooleanAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanAttribute"


    // $ANTLR start "ruleBooleanAttribute"
    // InternalExpress.g:1484:1: ruleBooleanAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'BOOLEAN' otherlv_4= ';' ) ;
    public final EObject ruleBooleanAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalExpress.g:1490:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'BOOLEAN' otherlv_4= ';' ) )
            // InternalExpress.g:1491:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'BOOLEAN' otherlv_4= ';' )
            {
            // InternalExpress.g:1491:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'BOOLEAN' otherlv_4= ';' )
            // InternalExpress.g:1492:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? otherlv_3= 'BOOLEAN' otherlv_4= ';'
            {
            // InternalExpress.g:1492:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpress.g:1493:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpress.g:1493:4: (lv_name_0_0= RULE_ID )
            // InternalExpress.g:1494:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBooleanAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanAttributeAccess().getColonKeyword_1());
            		
            // InternalExpress.g:1514:3: ( (lv_optional_2_0= 'OPTIONAL' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalExpress.g:1515:4: (lv_optional_2_0= 'OPTIONAL' )
                    {
                    // InternalExpress.g:1515:4: (lv_optional_2_0= 'OPTIONAL' )
                    // InternalExpress.g:1516:5: lv_optional_2_0= 'OPTIONAL'
                    {
                    lv_optional_2_0=(Token)match(input,38,FOLLOW_35); 

                    					newLeafNode(lv_optional_2_0, grammarAccess.getBooleanAttributeAccess().getOptionalOPTIONALKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanAttributeRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_2_0 != null, "OPTIONAL");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanAttributeAccess().getBOOLEANKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBooleanAttributeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleBooleanAttribute"


    // $ANTLR start "entryRuleReferenceAttribute"
    // InternalExpress.g:1540:1: entryRuleReferenceAttribute returns [EObject current=null] : iv_ruleReferenceAttribute= ruleReferenceAttribute EOF ;
    public final EObject entryRuleReferenceAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceAttribute = null;


        try {
            // InternalExpress.g:1540:59: (iv_ruleReferenceAttribute= ruleReferenceAttribute EOF )
            // InternalExpress.g:1541:2: iv_ruleReferenceAttribute= ruleReferenceAttribute EOF
            {
             newCompositeNode(grammarAccess.getReferenceAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceAttribute=ruleReferenceAttribute();

            state._fsp--;

             current =iv_ruleReferenceAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferenceAttribute"


    // $ANTLR start "ruleReferenceAttribute"
    // InternalExpress.g:1547:1: ruleReferenceAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleReferenceAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalExpress.g:1553:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalExpress.g:1554:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalExpress.g:1554:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalExpress.g:1555:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_optional_2_0= 'OPTIONAL' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            // InternalExpress.g:1555:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpress.g:1556:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpress.g:1556:4: (lv_name_0_0= RULE_ID )
            // InternalExpress.g:1557:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReferenceAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAttributeAccess().getColonKeyword_1());
            		
            // InternalExpress.g:1577:3: ( (lv_optional_2_0= 'OPTIONAL' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalExpress.g:1578:4: (lv_optional_2_0= 'OPTIONAL' )
                    {
                    // InternalExpress.g:1578:4: (lv_optional_2_0= 'OPTIONAL' )
                    // InternalExpress.g:1579:5: lv_optional_2_0= 'OPTIONAL'
                    {
                    lv_optional_2_0=(Token)match(input,38,FOLLOW_3); 

                    					newLeafNode(lv_optional_2_0, grammarAccess.getReferenceAttributeAccess().getOptionalOPTIONALKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReferenceAttributeRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_2_0 != null, "OPTIONAL");
                    				

                    }


                    }
                    break;

            }

            // InternalExpress.g:1591:3: ( (otherlv_3= RULE_ID ) )
            // InternalExpress.g:1592:4: (otherlv_3= RULE_ID )
            {
            // InternalExpress.g:1592:4: (otherlv_3= RULE_ID )
            // InternalExpress.g:1593:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceAttributeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getReferenceAttributeAccess().getReferenceUserDefinedTypeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReferenceAttributeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleReferenceAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000440822000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000380000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000010L});

}