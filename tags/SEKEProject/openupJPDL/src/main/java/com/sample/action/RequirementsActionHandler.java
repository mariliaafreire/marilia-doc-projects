package com.sample.action;

import java.util.Date;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RequirementsActionHandler implements ActionHandler {

	private static final long serialVersionUID = 1L;
	Log log = LogFactory.getLog(this.getClass());
	
		public void execute(ExecutionContext context) throws Exception {
			
			long requirement = (Long)context.getContextInstance().getVariable("requirementTime");
			System.out.println("Valor de requirement atual: " + requirement);
			
			Date inicio = context.getTaskInstance().getStart();
			Date fim = context.getTaskInstance().getEnd();
			System.out.println("Inicio: " + inicio.toString());
			System.out.println("Fim: " + fim.toString());
		
			long timeTotal = fim.getTime() - inicio.getTime();
			
			System.out.println("That took " + timeTotal + " milliseconds");
			log.info(context.getTaskInstance().getName()+ " Updating conceptionTime"+ (timeTotal/ (1000 * 60 * 60)));
			
			requirement += timeTotal;
			context.getTaskInstance().setVariable("requirementTime", requirement);
			
	}
		
}
