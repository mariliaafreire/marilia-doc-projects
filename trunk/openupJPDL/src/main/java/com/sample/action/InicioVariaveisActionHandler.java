package com.sample.action;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class InicioVariaveisActionHandler implements ActionHandler{
	
	private static final long serialVersionUID = 1L;

	 
	public void execute(ExecutionContext context) throws Exception {
		Long value = new Long(0);
		System.out.println("\n\n Iniciando variaveis....\n\n");
		context.getContextInstance().createVariable("developTime", value);
		context.getContextInstance().createVariable("requirementTime", value);
		//context.getContextInstance()
		//context.getContextInstance().setVariable("developTime", value);
		//context.getContextInstance().setVariable("requirementTime", value);
		
	}

}
