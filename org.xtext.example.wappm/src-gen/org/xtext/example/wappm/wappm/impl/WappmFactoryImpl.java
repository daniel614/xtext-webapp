/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.wappm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.wappm.wappm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WappmFactoryImpl extends EFactoryImpl implements WappmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WappmFactory init()
  {
    try
    {
      WappmFactory theWappmFactory = (WappmFactory)EPackage.Registry.INSTANCE.getEFactory(WappmPackage.eNS_URI);
      if (theWappmFactory != null)
      {
        return theWappmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WappmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WappmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WappmPackage.WEB_MODEL: return createWebModel();
      case WappmPackage.HYPERTEXT_LAYER: return createHypertextLayer();
      case WappmPackage.PAGE: return createPage();
      case WappmPackage.STATIC_PAGE: return createStaticPage();
      case WappmPackage.DYNAMIC_PAGE: return createDynamicPage();
      case WappmPackage.DETAIL_PAGE: return createDetailPage();
      case WappmPackage.INDEX_PAGE: return createIndexPage();
      case WappmPackage.LINK: return createLink();
      case WappmPackage.CONTENT_LAYER: return createContentLayer();
      case WappmPackage.WEB_CLASS: return createWebClass();
      case WappmPackage.ATTRIBUTE: return createAttribute();
      case WappmPackage.URL: return createURL();
      case WappmPackage.URL_ADDITION: return createURL_ADDITION();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WappmPackage.APP_TYPES:
        return createAppTypesFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WappmPackage.APP_TYPES:
        return convertAppTypesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebModel createWebModel()
  {
    WebModelImpl webModel = new WebModelImpl();
    return webModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HypertextLayer createHypertextLayer()
  {
    HypertextLayerImpl hypertextLayer = new HypertextLayerImpl();
    return hypertextLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticPage createStaticPage()
  {
    StaticPageImpl staticPage = new StaticPageImpl();
    return staticPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicPage createDynamicPage()
  {
    DynamicPageImpl dynamicPage = new DynamicPageImpl();
    return dynamicPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailPage createDetailPage()
  {
    DetailPageImpl detailPage = new DetailPageImpl();
    return detailPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexPage createIndexPage()
  {
    IndexPageImpl indexPage = new IndexPageImpl();
    return indexPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentLayer createContentLayer()
  {
    ContentLayerImpl contentLayer = new ContentLayerImpl();
    return contentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebClass createWebClass()
  {
    WebClassImpl webClass = new WebClassImpl();
    return webClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URL createURL()
  {
    URLImpl url = new URLImpl();
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URL_ADDITION createURL_ADDITION()
  {
    URL_ADDITIONImpl urL_ADDITION = new URL_ADDITIONImpl();
    return urL_ADDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppTypes createAppTypesFromString(EDataType eDataType, String initialValue)
  {
    AppTypes result = AppTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAppTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WappmPackage getWappmPackage()
  {
    return (WappmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WappmPackage getPackage()
  {
    return WappmPackage.eINSTANCE;
  }

} //WappmFactoryImpl
