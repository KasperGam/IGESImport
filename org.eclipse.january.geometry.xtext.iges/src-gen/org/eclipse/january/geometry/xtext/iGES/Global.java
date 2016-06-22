/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.january.geometry.xtext.iGES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.Global#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.eclipse.january.geometry.xtext.iGES.IGESPackage#getGlobal()
 * @model
 * @generated
 */
public interface Global extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.january.geometry.xtext.iGES.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.eclipse.january.geometry.xtext.iGES.IGESPackage#getGlobal_Values()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValues();

} // Global