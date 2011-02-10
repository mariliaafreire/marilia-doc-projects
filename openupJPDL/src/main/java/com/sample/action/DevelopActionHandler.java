package com.sample.action;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class DevelopActionHandler implements ActionHandler {

	private static final long serialVersionUID = 1L;
	Log log = LogFactory.getLog(this.getClass());
	 
	public void execute(ExecutionContext context) throws Exception {
		long develop = (Long)context.getContextInstance().getVariable("developTime");
		
		Date inicio = context.getTaskInstance().getStart();
		Date fim = context.getTaskInstance().getEnd();
		
		long timeTotal = fim.getTime() - inicio.getTime();
		
		System.out.println("That took " + timeTotal + " milliseconds");
		log.info(context.getTaskInstance().getName()+ " Updating conceptionTime"+ timeTotal/ (1000 * 60 * 60));
		
		context.getTaskInstance().setVariable("developTime", new Long(timeTotal + develop));
	}

}
