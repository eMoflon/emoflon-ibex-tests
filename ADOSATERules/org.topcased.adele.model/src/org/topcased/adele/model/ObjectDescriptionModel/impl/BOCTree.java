package org.topcased.adele.model.ObjectDescriptionModel.impl;

import java.lang.reflect.Method;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.BasicEList;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * BOCTree (Boolean Object Condition Tree) is a binary tree that represents 
 * the boolean object condition expression in an ODSection. 
 */
public class BOCTree {

	private String value = null;
	private BOCTree left = null;
	private BOCTree right = null;
		
	public BOCTree() {
		super();
	}

	public BOCTree(String p_expr) throws BOCTreeException {
		super();
		BasicEList<String> lexemes = this.scanner(p_expr);
		BOCTree boctree = new BOCTree(lexemes);
		value = boctree.value;
		left = boctree.left;
		right = boctree.right;
	}

	public BOCTree(Node node) throws BOCTreeException {
		super();
		BasicEList<String> lexemes = this.scanner(node);
		BOCTree boctree = new BOCTree(lexemes);
		value = boctree.value;
		left = boctree.left;
		right = boctree.right;
	}
	
	public BOCTree(BasicEList<String> p_lexemes) throws BOCTreeException {
		super();
		if (! p_lexemes.isEmpty()) {
			int index =  0;
			if (this.isExp_Bracketed(p_lexemes)) {
				BOCTree boctree = new BOCTree(this.lexemes(p_lexemes));
				value = boctree.value;
				left = boctree.left;
				right = boctree.right;
			} else if ((index = this.firstLexemeIndex(p_lexemes, "&")) > 0) {
				value = "AND";
				left = new BOCTree(this.lexemes(p_lexemes, 0, index - 1 ));
				if (left.isNull()) throw new BOCTreeException("ERROR : '&' operator need left operand");
				right = new BOCTree(this.lexemes(p_lexemes, index + 1));
				if (right.isNull()) throw new BOCTreeException("ERROR : '&' operator need right operand");				
			} else if ((index = this.firstLexemeIndex(p_lexemes, "|")) > 0) {
				value = "OR";
				left = new BOCTree(this.lexemes(p_lexemes, 0, index - 1));
				if (left.isNull()) throw new BOCTreeException("ERROR : '|' operator need left operand");
				right = new BOCTree(this.lexemes(p_lexemes, index + 1));
				if (right.isNull()) throw new BOCTreeException("ERROR : '|' operator need right operand");
			} else if (this.isExp_NOT(p_lexemes)) {
				value = "NOT";
				right = new BOCTree(this.lexemes(p_lexemes, 1));
				if (right.isNull()) throw new BOCTreeException("ERROR : '!' operator need right operand");
			} else if ((index = this.firstLexemeIndex(p_lexemes, "=")) > 0) {
				value = "EQUAL";
				left = new BOCTree(this.lexemes(p_lexemes, 0, index - 1 ));
				if (left.isNull()) throw new BOCTreeException("ERROR : '=' operator need left operand");
				right = new BOCTree(this.lexemes(p_lexemes, index + 1));
				if (right.isNull()) throw new BOCTreeException("ERROR : '=' operator need right operand");								
			} else if (p_lexemes.size() == 1) {
				value = this.firstLexeme(p_lexemes);
			}				
		}
	}

	public BasicEList<String> scanner(String p_string) {
	     StringTokenizer st = new StringTokenizer(p_string, " ()&|!=", true);
	     BasicEList<String> lexemes = new BasicEList<String>();
	     String lexeme = new String();
	     while (st.hasMoreTokens()) {
	    	 lexeme = st.nextToken();
	    	 if (!lexeme.equals(" ")) lexemes.add(lexeme);
	     }
	     return lexemes;
	}

	public BasicEList<String> scanner(Node node) {
	     BasicEList<String> lexemes = new BasicEList<String>();
	     
	     String nodeName = node.getNodeName();
	     if (nodeName.equals("condition")) {
	    	 lexemes.add(node.getAttributes().getNamedItem("value").getNodeValue());
	     } else if (nodeName.equals("aND")) {
	    	 lexemes.addAll(this.addANDcondition(node));
	     } else if (nodeName.equals("oR")) {
	    	 lexemes.addAll(this.addORcondition(node));
	     } else if (nodeName.equals("nOT")) {
	    	 lexemes.addAll(this.addNOTcondition(node));
	     }
	     
	     return lexemes;
	}
	
	protected BasicEList<String> addANDcondition(Node node) {
	     BasicEList<String> lexemes = new BasicEList<String>();
	     NodeList children = node.getChildNodes();
	     int childrenLength = children.getLength();
	     boolean flag = false;
	     
	     if (childrenLength>3) {
	    	 lexemes.add("(");
	     }
	     
	     for (int i=0; i<childrenLength;i++) {
		     String nodeName = children.item(i).getNodeName();
		     if (nodeName.equals("condition")) {
		    	 if (flag) {
		    		 lexemes.add("&");
		    	 } else {
		    		 flag = true;
		    	 }
		    	 lexemes.add(children.item(i).getAttributes().getNamedItem("value").getNodeValue());
		     } else if (nodeName.equals("aND")) {
		    	 if (flag) {
		    		 lexemes.add("&");
		    	 } else {
		    		 flag = true;
		    	 }
		    	 lexemes.addAll(this.addANDcondition(children.item(i)));
		     } else if (nodeName.equals("oR")) {
		    	 if (flag) {
		    		 lexemes.add("&");
		    	 } else {
		    		 flag = true;
		    	 }
		    	 lexemes.addAll(this.addORcondition(children.item(i)));
		     } else if (nodeName.equals("nOT")) {
		    	 if (flag) {
		    		 lexemes.add("&");
		    	 } else {
		    		 flag = true;
		    	 }
		    	 lexemes.addAll(this.addNOTcondition(children.item(i)));
		     }
	     }	     

	     if (childrenLength>3) {
	    	 lexemes.add(")");
	     }
	     
	     return lexemes;
	}
	
	protected BasicEList<String> addORcondition(Node node) {
	     BasicEList<String> lexemes = new BasicEList<String>();
	     NodeList children = node.getChildNodes();
	     int childrenLength = children.getLength();
	     boolean flag = false;
	     
	     if (childrenLength>3) {
	    	 lexemes.add("(");
	     }
	     
	     for (int i=0; i<childrenLength;i++) {
		     String nodeName = children.item(i).getNodeName();
		     if (nodeName.equals("condition")) {
		    	 if (flag) {
		    		 lexemes.add("|");
		    	 } else {
		    		 flag = true;
		    	 }
		    	 lexemes.add(children.item(i).getAttributes().getNamedItem("value").getNodeValue());
		     } else if (nodeName.equals("aND")) {
		    	 if (flag) {
		    		 lexemes.add("|");
		    	 } else {
		    		 flag = true;
		    	 }
		    	 lexemes.addAll(this.addANDcondition(children.item(i)));
		     } else if (nodeName.equals("oR")) {
		    	 if (flag) {
		    		 lexemes.add("|");
		    	 } else {
		    		 flag = true;
		    	 }
		    	 lexemes.addAll(this.addORcondition(children.item(i)));
		     } else if (nodeName.equals("nOT")) {
		    	 if (flag) {
		    		 lexemes.add("|");
		    	 } else {
		    		 flag = true;
		    	 }
		    	 lexemes.addAll(this.addNOTcondition(children.item(i)));
		     }
	     }	     

	     if (childrenLength>3) {
	    	 lexemes.add(")");
	     }
	     
	     return lexemes;
	}
	
	protected BasicEList<String> addNOTcondition(Node node) {
	     BasicEList<String> lexemes = new BasicEList<String>();
	     NodeList children = node.getChildNodes();
	     int childrenLength = children.getLength();

    	 lexemes.add("!");
	     if (childrenLength>3) {
	    	 lexemes.add("(");
	     }
	     
	     for (int i=0; i<childrenLength;i++) {
		     String nodeName = children.item(i).getNodeName();
		     if (nodeName.equals("condition")) {
		    	 lexemes.add(children.item(i).getAttributes().getNamedItem("value").getNodeValue());
		     } else if (nodeName.equals("aND")) {
		    	 lexemes.addAll(this.addANDcondition(children.item(i)));
		     } else if (nodeName.equals("oR")) {
		    	 lexemes.addAll(this.addORcondition(children.item(i)));
		     } else if (nodeName.equals("nOT")) {
		    	 lexemes.addAll(this.addNOTcondition(children.item(i)));
		     }
	     }	     

	     if (childrenLength>3) {
	    	 lexemes.add(")");
	     }
	     
	     return lexemes;
	}
	
	
	public boolean isNull() {
		return value == null;
	}
	
	public boolean eval(SKHierarchicalObject p_object) throws SKHierarchicalObjectException {	
		try {
			if (value.equals("NOT"))
				return (! right.eval(p_object));
			else if (value.equals("AND"))
				return (left.eval(p_object) && right.eval(p_object));
			else if (value.equals("OR"))
				return (left.eval(p_object) || right.eval(p_object));
			else if (value.equals("EQUAL")) 
				return(left.sEval(p_object).equals(right.sEval(p_object)));
			else {				
				Method method = p_object.getClass().getMethod(value, (Class []) null);
				return (Boolean) method.invoke(p_object, (Object []) null);	
			} 
		} catch (NoSuchMethodException ne) {
			return false;
		} catch (Exception e) {
			throw new SKHierarchicalObjectException(e.getMessage(), e );
		}
	}
	
	private String sEval(SKHierarchicalObject p_object) throws  SKHierarchicalObjectException {
		try {
			if (value.charAt(0) == '"') {
				if (value.charAt(value.length() - 1) != '"') throw new SKHierarchicalObjectException("ERROR : '\"' is missing");
				return value.substring(1, value.length() - 1);
			} else {
				Method method = p_object.getClass().getMethod(value, (Class []) null);
				return (String) method.invoke(p_object, (Object []) null);
			}
		} catch (Exception e) {
			throw new SKHierarchicalObjectException(e.getMessage());			
		}		
	}
	
	private String firstLexeme(BasicEList<String> p_lexemes) {
		return (String) p_lexemes.get(0);
	}
	
	private String lastLexeme(BasicEList<String> p_lexemes) {
		return (String) p_lexemes.get(p_lexemes.size() - 1);
	}
	
	/*
	 * Returns copy of p_lexemese list from index p_from (included) to 
	 * index p_to (included)
	 */
	private BasicEList<String> lexemes(BasicEList<String> p_lexemes, int p_from, int p_to) {
		BasicEList<String> lexemes = new BasicEList<String>();
		for (int i = p_from; i <= p_to; i++) lexemes.add(p_lexemes.get(i));
		return lexemes;
	}
	
	/*
	 * Returns copy of p_lexemes list from index p_from (included) to the
	 * last lexemes (included)
	 */
	private BasicEList<String> lexemes(BasicEList<String> p_lexemes, int p_from) {
		return this.lexemes(p_lexemes, p_from, (p_lexemes.size() - 1));
	}
	
	/*
	 * Returns copy of p_lexemes whithout first and last lexemes
	 */
	private BasicEList<String> lexemes(BasicEList<String> p_lexemes) {
		return this.lexemes(p_lexemes, 1, p_lexemes.size() - 2);
	}
	
	/*
	 * Returns first lexeme index that name is p_name and that not includes
	 * in brackets
	 */
	private int firstLexemeIndex(BasicEList<String> p_lexemes, String p_name) {
		int bracketCounter = 0;
		for (int i = 0; i < p_lexemes.size(); i++) {
			if (((String) p_lexemes.get(i)).equals("(")) bracketCounter++;
			if (((String) p_lexemes.get(i)).equals(")")) bracketCounter--;
			if (bracketCounter == 0 && ((String) p_lexemes.get(i)).equals(p_name)) return i;
		}
		return -1;
	}
	
	private Boolean isExp_NOT(BasicEList<String> p_lexemes) {
		return (this.firstLexeme(p_lexemes).equals("!"));
	}

	private Boolean isExp_Bracketed(BasicEList<String> p_lexemes) {
		return (this.firstLexeme(p_lexemes)).equals("(") 
				&& (this.lastLexeme(p_lexemes).equals(")"));	
	}
}
