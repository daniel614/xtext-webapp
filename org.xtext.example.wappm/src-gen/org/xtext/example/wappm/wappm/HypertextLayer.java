/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.wappm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypertext Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.wappm.wappm.HypertextLayer#getHyperName <em>Hyper Name</em>}</li>
 *   <li>{@link org.xtext.example.wappm.wappm.HypertextLayer#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.wappm.wappm.WappmPackage#getHypertextLayer()
 * @model
 * @generated
 */
public interface HypertextLayer extends EObject
{
  /**
   * Returns the value of the '<em><b>Hyper Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hyper Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hyper Name</em>' attribute.
   * @see #setHyperName(String)
   * @see org.xtext.example.wappm.wappm.WappmPackage#getHypertextLayer_HyperName()
   * @model
   * @generated
   */
  String getHyperName();

  /**
   * Sets the value of the '{@link org.xtext.example.wappm.wappm.HypertextLayer#getHyperName <em>Hyper Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hyper Name</em>' attribute.
   * @see #getHyperName()
   * @generated
   */
  void setHyperName(String value);

  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.wappm.wappm.Page}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference list.
   * @see org.xtext.example.wappm.wappm.WappmPackage#getHypertextLayer_Pages()
   * @model containment="true"
   * @generated
   */
  EList<Page> getPages();

} // HypertextLayer