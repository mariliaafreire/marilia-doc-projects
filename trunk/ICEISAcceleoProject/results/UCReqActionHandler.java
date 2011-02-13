package com.sample.action;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class UCReqActionHandler implements ActionHandler {

	private static final long serialVersionUID = 1L;
	Log log = LogFactory.getLog(this.getClass());
	 
	public void execute(ExecutionContext context) throws Exception {
		long develop = (Long)context.getContextInstance().getVariable("UCReqTime");
		
		Date inicio = context.getTaskInstance().getStart();
		Date fim = context.getTaskInstance().getEnd();
		
		long timeTotal = fim.getTime() - inicio.getTime();
		
		System.out.println("Time took for  UCReq " + timeTotal + " milliseconds");
		
		double hoursTime = timeTotal / (1000.0 * 60.0 * 60.0);
		
		log.info(context.getTaskInstance().getName()+ " Updating   UCReq " + hoursTime + "h(s)"));
		
		context.getTaskInstance().setVariable("UCReq", hoursTime);
	}
	
	

}
	
