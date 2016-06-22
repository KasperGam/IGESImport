/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.january.geometry.xtext.iGES;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.january.geometry.xtext.iGES.IGESPackage
 * @generated
 */
public interface IGESFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IGESFactory eINSTANCE = org.eclipse.january.geometry.xtext.iGES.impl.IGESFactoryImpl.init();

  /**
   * Returns a new object of class '<em>IGES</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IGES</em>'.
   * @generated
   */
  IGES createIGES();

  /**
   * Returns a new object of class '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start</em>'.
   * @generated
   */
  Start createStart();

  /**
   * Returns a new object of class '<em>Global</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global</em>'.
   * @generated
   */
  Global createGlobal();

  /**
   * Returns a new object of class '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data</em>'.
   * @generated
   */
  Data createData();

  /**
   * Returns a new object of class '<em>Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry</em>'.
   * @generated
   */
  Entry createEntry();

  /**
   * Returns a new object of class '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameters</em>'.
   * @generated
   */
  Parameters createParameters();

  /**
   * Returns a new object of class '<em>PEntry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PEntry</em>'.
   * @generated
   */
  PEntry createPEntry();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>HString</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HString</em>'.
   * @generated
   */
  HString createHString();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pointer</em>'.
   * @generated
   */
  Pointer createPointer();

  /**
   * Returns a new object of class '<em>End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End</em>'.
   * @generated
   */
  End createEnd();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IGESPackage getIGESPackage();

} //IGESFactory
