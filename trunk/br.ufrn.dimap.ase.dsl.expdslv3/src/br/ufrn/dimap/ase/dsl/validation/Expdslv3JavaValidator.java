package br.ufrn.dimap.ase.dsl.validation;

import java.util.List;
import org.eclipse.xtext.validation.Check;
import br.ufrn.dimap.ase.dsl.expdslv3.*;
import br.ufrn.dimap.ase.dsl.expdslv3.Process;

public class Expdslv3JavaValidator extends AbstractExpdslv3JavaValidator {
	@Check
	public void checkLSDesign(ExperimentalDesign plan){
		
		if(plan.getType() == DesignType.LS){
			if(plan.getDoe() instanceof LS){
				LS ls = (LS)plan.getDoe();
			    if(plan.getFactor().size()!=3)
			    	warning("The LS design needs at least three factors (treatment, column, row)",plan, Expdslv3Package.Literals.EXPERIMENTAL_DESIGN__FACTOR,-1);
			    if(!(ls.getCol().getRange().size() == ls.getRow().getRange().size() && ls.getRow().getRange().size() == ls.getTreatment().getRange().size())){
			    	warning("The factors should have a equal number of levels",plan, Expdslv3Package.Literals.EXPERIMENTAL_DESIGN__FACTOR,-1);
			    }
		
		} else {
			error("The doe LS have to specify the column, row and treatment factors",plan, Expdslv3Package.Literals.EXPERIMENTAL_DESIGN__DOE,-1);
		}
	  }
	}
	
	@Check
	public void checkRCBDDesign(ExperimentalDesign plan){
		
		if(plan.getType() == DesignType.RCBD){
			if(plan.getDoe() instanceof RCBD){
				RCBD rcbd = (RCBD)plan.getDoe();
			    if(plan.getFactor().size()!=2)
			    	warning("The RCBD design needs at least two factors (treatment, block variable)",plan, Expdslv3Package.Literals.EXPERIMENTAL_DESIGN__FACTOR,-1);
			   
		} else {
			error("The doe specification have to specify the treatment and block variable factors",plan, Expdslv3Package.Literals.EXPERIMENTAL_DESIGN__DOE,-1);
		}
		}
	}
	
	@Check
	public void checkVariables(ExperimentalDesign plan) {	
		DOE doe = plan.getDoe();
		if(plan.getType() == DesignType.CDR) {
			CRB crb = (CRB) doe;
			int achou = 0;
			for(Factor f: plan.getFactor()) {
				if(f.getName().equalsIgnoreCase(doe.getTreatment().getName())) {
					achou = 1;
				}
			}
			if(achou==0) {
				error("The treatment has to be from a defined Factor", doe, Expdslv3Package.Literals.DOE__TREATMENT,-1);
			}	 
		} else if(plan.getType()==DesignType.RCBD) {
			RCBD rcbd = (RCBD) doe;
			int achou = 0;
			for(Factor f: plan.getFactor()) {
				if(f.getName().equalsIgnoreCase(doe.getTreatment().getName())) {
					achou = 1;
				}
			}
			if(achou==0) {
				error("The treatment has to be from a defined Factor", doe, Expdslv3Package.Literals.DOE__TREATMENT,-1);
			}	
			achou =0;
			for(Factor f: plan.getFactor()) {
				if(f.getName().equalsIgnoreCase(rcbd.getBlockVariable().getName())) {
					achou = 1;
				}
			}
			if(achou==0) {
				error("The block variable has to be a defined Factor", rcbd, Expdslv3Package.Literals.RCBD__BLOCK_VARIABLE,-1);
			} 
		}else if(plan.getType()==DesignType.LS) {
			LS ls = (LS) doe;
			int achou = 0;
			for(Factor f: plan.getFactor()) {
				if(f.getName().equalsIgnoreCase(doe.getTreatment().getName())) {
					achou = 1;
				}
			}
			if(achou==0) {
				error("The treatment has to be from a defined Factor", doe, Expdslv3Package.Literals.DOE__TREATMENT,-1);
			}	
			achou =0;
			for(Factor f: plan.getFactor()) {
				if(f.getName().equalsIgnoreCase(ls.getCol().getName())) {
					achou = 1;
				}
			}
			if(achou==0) {
				error("The column has to be a defined Factor", ls, Expdslv3Package.Literals.LS__COL,-1);
			}
			achou =0;
			for(Factor f: plan.getFactor()) {
				if(f.getName().equalsIgnoreCase(ls.getRow().getName())) {
					achou = 1;
				}
			}
			if(achou==0) {
				error("The row has to be a defined Factor", ls, Expdslv3Package.Literals.LS__ROW,-1);
			}	
			
			
		}
	}
	
	@Check
	public void checkMetricDepVariables(ExperimentElement exp) {
		
		List<Process> processes = exp.getProcess();
		
		for (Process process : processes) {
			List<Task> tasks = process.getTask();
			for(Task task : tasks){
				List<Metric> metrics = task.getMetric();
				for(Metric metric: metrics) {
					List<DepVariable> depvars = exp.getExperiments().getDepVar();
					int flag = 0;
					for (DepVariable depVariable : depvars) {
						if(metric.getName().getName().equalsIgnoreCase(depVariable.getVariable().getName())){
							flag = 1;
						}
						
					}
					if(flag==0)
						error("The metric has to refer a Dependente Variable", metric, Expdslv3Package.Literals.METRIC__NAME, -1);
					
				}
			}
		}
		
	}
	
	@Check
	public void checkDepVariables(ExperimentalDesign design) {
		List<DepVariable> depVars = design.getDepVar();
		
		for (DepVariable depVar : depVars) {
			for (Factor f : design.getFactor()) {
				if(f.getName().equalsIgnoreCase(depVar.getVariable().getName()))
					error("A variable cannot be a Dependente Variable and a Factor at the same time", depVar,Expdslv3Package.Literals.DEP_VARIABLE__VARIABLE,-1);
			}	
			for (Parameter p : design.getParameter()) {
				if(p.getVariable().getName().equalsIgnoreCase(depVar.getVariable().getName()))
					error("A variable cannot be a Dependente Variable and a Parameter at the same time", depVar,Expdslv3Package.Literals.DEP_VARIABLE__VARIABLE,-1);
			}	
				
			
		}
			
	}
	
	@Check
	public void checkFactor(ExperimentalDesign design) {
			for (Factor f : design.getFactor()) {
				for (Parameter p : design.getParameter()) { {
				if(f.getName().equalsIgnoreCase(p.getVariable().getName()))
					error("A variable cannot be a Factor and a Context Variable at the same time", f,Expdslv3Package.Literals.FACTOR__NAME,-1);
			}			
			
		}
			
	}
	}
}