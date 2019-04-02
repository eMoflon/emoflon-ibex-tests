/**
 * <copyright>
 * </copyright>
 *
 * $Id: BAStateKind.java,v 1.2 2013-01-04 15:20:56 aschach Exp $
 */
package org.topcased.adele.model.ba_components;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BA State Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ba_components.Ba_componentsPackage#getBAStateKind()
 * @model
 * @generated
 */
public enum BAStateKind implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(7, "none", "none"), /**
	 * The '<em><b>Initial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL(0, "initial", "initial"),

	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(1, "complete", "complete"),

	/**
	 * The '<em><b>Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL(2, "final", "final"), /**
	 * The '<em><b>Initial final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL_FINAL(3, "initial_final", "initial_final"), /**
	 * The '<em><b>Initial complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL_COMPLETE(4, "initial_complete", "initial_complete"), /**
	 * The '<em><b>Initial complete final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_COMPLETE_FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL_COMPLETE_FINAL(5, "initial_complete_final", "initial_complete_final"), /**
	 * The '<em><b>Complete final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE_FINAL(6, "complete_final", "complete_final");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 7;

	/**
	 * The '<em><b>Initial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @model name="initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_VALUE = 0;

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @model name="complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 1;

	/**
	 * The '<em><b>Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Final</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINAL
	 * @model name="final"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_VALUE = 2;

	/**
	 * The '<em><b>Initial final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initial final</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL_FINAL
	 * @model name="initial_final"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_FINAL_VALUE = 3;

	/**
	 * The '<em><b>Initial complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initial complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL_COMPLETE
	 * @model name="initial_complete"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_COMPLETE_VALUE = 4;

	/**
	 * The '<em><b>Initial complete final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initial final complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL_COMPLETE_FINAL
	 * @model name="initial_complete_final"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_COMPLETE_FINAL_VALUE = 5;

	/**
	 * The '<em><b>Complete final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Final complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_FINAL
	 * @model name="complete_final"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_FINAL_VALUE = 6;

	/**
	 * An array of all the '<em><b>BA State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BAStateKind[] VALUES_ARRAY =
		new BAStateKind[] {
			NONE,
			INITIAL,
			COMPLETE,
			FINAL,
			INITIAL_FINAL,
			INITIAL_COMPLETE,
			INITIAL_COMPLETE_FINAL,
			COMPLETE_FINAL,
		};

	/**
	 * A public read-only list of all the '<em><b>BA State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BAStateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BA State Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BAStateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BAStateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BA State Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BAStateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BAStateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BA State Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BAStateKind get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case INITIAL_VALUE: return INITIAL;
			case COMPLETE_VALUE: return COMPLETE;
			case FINAL_VALUE: return FINAL;
			case INITIAL_FINAL_VALUE: return INITIAL_FINAL;
			case INITIAL_COMPLETE_VALUE: return INITIAL_COMPLETE;
			case INITIAL_COMPLETE_FINAL_VALUE: return INITIAL_COMPLETE_FINAL;
			case COMPLETE_FINAL_VALUE: return COMPLETE_FINAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BAStateKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BAStateKind
