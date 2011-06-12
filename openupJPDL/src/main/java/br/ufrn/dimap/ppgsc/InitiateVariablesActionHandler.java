package br.ufrn.dimap.ppgsc;

import java.util.ArrayList;
import java.util.List;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class InitiateVariablesActionHandler implements ActionHandler{
	
	private static final long serialVersionUID = 1L;
	private static List<String> users = new ArrayList<String>();

	 
	public void execute(ExecutionContext context) throws Exception {
		Double value = new Double(0);
		users.add("SIGA-CDU-22");
		users.add("SIGA-CDU-23");
		users.add("SIGA-CDU-24");
		System.out.println("\n\n Iniciando variaveis....\n\n");
			context.getContextInstance().createVariable("UCDevTime", value);
			//context.getContextInstance().createVariable("UCDevTime", value);
			context.getContextInstance().createVariable("UCReqTime", value);
			context.getContextInstance().createVariable("cdus", users);
		
	
	}

}
	
