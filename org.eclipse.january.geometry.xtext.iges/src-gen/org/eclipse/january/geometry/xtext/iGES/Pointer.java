/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.january.geometry.xtext.iGES;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.Pointer#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.eclipse.january.geometry.xtext.iGES.IGESPackage#getPointer()
 * @model
 * @generated
 */
public interface Pointer extends Value
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see org.eclipse.january.geometry.xtext.iGES.IGESPackage#getPointer_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link org.eclipse.january.geometry.xtext.iGES.Pointer#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

} // Pointer
