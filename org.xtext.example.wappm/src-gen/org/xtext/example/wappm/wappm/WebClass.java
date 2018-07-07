/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.wappm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.wappm.wappm.WebClass#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.wappm.wappm.WebClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.example.wappm.wappm.WebClass#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.wappm.wappm.WappmPackage#getWebClass()
 * @model
 * @generated
 */
public interface WebClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.wappm.wappm.WappmPackage#getWebClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.wappm.wappm.WebClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.wappm.wappm.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.xtext.example.wappm.wappm.WappmPackage#getWebClass_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.wappm.wappm.Reference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see org.xtext.example.wappm.wappm.WappmPackage#getWebClass_References()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getReferences();

} // WebClass
