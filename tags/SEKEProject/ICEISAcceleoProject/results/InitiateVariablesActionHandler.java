package br.ufrn.dimap.ppgsc;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class InitiateVariablesActionHandler implements ActionHandler{
	
	private static final long serialVersionUID = 1L;

	 
	public void execute(ExecutionContext context) throws Exception {
		Double value = new Double(0);
		System.out.println("\n\n Iniciando variaveis....\n\n");
			context.getContextInstance().createVariable("UCDevTime", value);
			context.getContextInstance().createVariable("UCReqTime", value);
			context.getContextInstance().createVariable("UCDevTime", value);
		
	
	}

}
	
