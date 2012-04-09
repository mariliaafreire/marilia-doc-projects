package org.xtext.project.validation;

import java.util.List;

import org.eclipse.xtext.validation.Check;
import org.xtext.project.expDSL.Activity;
import org.xtext.project.expDSL.Process; 

public class ExpDSLJavaValidator extends AbstractExpDSLJavaValidator {

	@Check
	public void checkGreetingStartsWithCapital(Activity act) {
		
		if (act.getNext().size()==0){
			warning("Activity " + act.getName() + " without next!", null);
		}
		
	 
	 
	}
	
}
