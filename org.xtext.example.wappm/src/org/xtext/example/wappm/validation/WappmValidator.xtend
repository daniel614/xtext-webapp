/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.wappm.wappm.WebModel
import org.xtext.example.wappm.wappm.WappmPackage

/**	
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class WappmValidator extends AbstractWappmValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					WappmPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def void checkWebModelNameStartsWithCapital(WebModel webmodel) {
		if (!Character.isUpperCase(webmodel.name.charAt(0))) {
        	warning("Name should start with a capital letter", 
            	WappmPackage.Literals.WEB_MODEL__NAME)
    	}
	}
	
}
