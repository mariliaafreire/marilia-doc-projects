package org.xtext.project.validation;

import java.util.List;

import org.eclipse.xtext.validation.Check;

import org.xtext.project.expDSL.*;
import org.xtext.project.expDSL.Activity;
import org.xtext.project.expDSL.Process; 
import org.xtext.project.expDSL.Artefact;
import org.xtext.project.expDSL.ActivityMetric; 

public class ExpDSLJavaValidator extends AbstractExpDSLJavaValidator {

	@Check
	public void checkDesign(ExperimentalPlan plan) {
		int mainFactorNumber = 0, levels = 0, blockFactor =0, biggerSizeLevel=0; 
		
		for (Factor f : plan.getFactor()) {
			if(f.getIsDesiredVariation().equalsIgnoreCase("True"))
				mainFactorNumber++;
			else
				blockFactor++;
			for(Levels l: f.getLevel()){
				levels++;
			}
			if(levels>biggerSizeLevel){
				biggerSizeLevel = levels;
				levels = 0;
			}
		} 
		if (plan.getType().equals(DesignType.CDR)){
			if(!(mainFactorNumber>0))
				warning("CDR Design Type must have a factor with isDesiredVariation settled as True", null);
			if(blockFactor>0)
				warning("CDR Design Type mustn't have a block factor (isDesiredVariation settled as False)", null);
		} else if (plan.getType().equals(DesignType.RCBD)){
			if(!(mainFactorNumber>0))
				warning("RCBD Design Type must have a factor with isDesiredVariation settled as True", null);
			if(blockFactor==0)
				warning("RCBD Design Type must have a block factor (isDesiredVariation settled as False)", null);
		
		} else { // LS - Latin Square
			for (Factor f : plan.getFactor()) {
				levels = 0;
				for(Levels l: f.getLevel()){
					levels++;
				}
				if(levels != biggerSizeLevel) 
				  warning("In LS Design Type you should use the same number of factor levels for all Factor elements", null);
				
		}
			if(!(mainFactorNumber>0))
				warning("LS Design Type must have a factor with isDesiredVariation settled as True", null);
			if(blockFactor!=2)
				warning("LS Design Type must have two block factors (isDesiredVariation settled as False)", null);
		}
	 
	 
	}
	
	@Check
	public void checkGreetingStartsWithCapital(Activity act) {
		
		if (act.getNext().size()==0){
			warning("Activity " + act.getName() + " without next!", null);
		}
		
	 
	 
	}
	/*@Check
	public void checkReferenceIsValid(Metrics metrics) {
		boolean existe = false;		
		if (metrics.getDetail() instanceof ArtefactMetric) {		
			for (Artefact _artifact : metrics.getRelatesTo().getArtefact()) {	
				for (Artefact artifact : ((ArtefactMetric)metrics.getDetail()).getArtefacts())					
					if (artifact.getName().equals(_artifact.getName())) {						
						existe = true;
						break;
					}				
			}
			if (!existe) error("Invalid artifact reference. Artifact exists in different process related", MetricDslPackage.Literals.METRICS__DETAILS);
		}
		else if (metrics.getDetails() instanceof ActivityMetric) {
				for (EObject _activity : metrics.getRelatesTo().getLifecyleElement()) {
					//if (_activity instanceof Activity) {
						if (((ActivityMetric)metrics.getDetails()).getActivityBegin().getName().equals(((Activity)_activity).getName())) {			
							existe = true;
							break;
						}
						if (((ActivityMetric)metrics.getDetails()).getActivityEnd().getName().equals(((Activity)_activity).getName())) {						
							existe = true;
							break;
						} else existe = false;
					//}
				}
			if (!existe) error(" Invalid activity reference. \n Activity exists in different process related", MetricDslPackage.Literals.METRICS__DETAILS);
		}	
		
		/*
		 else if (metrics.getDetails() instanceof ActivityMetric) {
			//if (metrics.getRelatesTo().getLifecyleElement() instanceof Activity) {
				//System.out.print("ENTROU");
				for (EObject _activity : metrics.getRelatesTo().getLifecyleElement()) {	
					if (((ActivityMetric)metrics.getRelatesTo()).getActivityBegin().getName().equals(((Activity)_activity).getName())) {			
						existe = true;
						break;
					}
					if (((ActivityMetric)metrics.getRelatesTo()).getActivityEnd().getName().equals(((Activity)_activity).getName())) {						
						existe = true;
						break;
					}
				}
			//} //else if...
			if (!existe) error("Invalid activity reference", MetricDslPackage.Literals.METRICS__DETAILS);
		}
		 */
	/*	else if (metrics.getDetails() instanceof TaskMetric) {		
			for (Task _task : metrics.getRelatesTo().getTasks() ) {	
				for (Task task : ((TaskMetric)metrics.getDetails()).getTasks())
					//System.out.print("Process-TASK: "+ _task.getName() + " Metric-TASK: "+ task.getName() + " v/f: " + task.getName().equals(_task.getName()) + "\n");
					if (task.getName().equals(_task.getName())) {
						existe = true;
						break;
					}
			}
			if (!existe) error("Invalid task reference. Task exists in different process related", MetricDslPackage.Literals.METRICS__DETAILS);
		}
		//if (!existe) 
			//error("Invalid task reference", MetricDslPackage.Literals.METRICS__DETAILS);
		
		//System.out.print("NOME DO ARTEFACT do processo: "+ _artifact.getName() + " \n");
		//System.out.print("NOME DO ARTEFACT: "+ artifact + " \n");
	}
	*/
	
}
