/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.wappm.validation.AbstractWappmValidator;
import org.xtext.example.wappm.wappm.WappmPackage;
import org.xtext.example.wappm.wappm.WebClass;
import org.xtext.example.wappm.wappm.WebModel;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class WappmValidator extends AbstractWappmValidator {
  @Check
  public void checkWebModelNameStartsWithCapital(final WebModel webmodel) {
    boolean _isUpperCase = Character.isUpperCase(webmodel.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with a capital letter", 
        WappmPackage.Literals.WEB_MODEL__NAME);
    }
  }
  
  @Check
  public void checkClassNameNameStartsWithCapital(final WebClass webclass) {
    boolean _isUpperCase = Character.isUpperCase(webclass.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with a capital letter", 
        WappmPackage.Literals.WEB_CLASS__NAME);
    }
  }
}
