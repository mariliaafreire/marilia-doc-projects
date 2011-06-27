package br.ufrn.dimap.ppgsc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class UCReqActionHandler implements ActionHandler {

	private static final long serialVersionUID = 1L;
	Log log = LogFactory.getLog(this.getClass());
	 
	public void execute(ExecutionContext context) throws Exception {
		double develop = (Double)context.getContextInstance().getVariable("UCReqTime");
		List<Double> req = (ArrayList<Double>)context.getContextInstance().getVariable("ucReq");
		
		Date inicio = context.getTaskInstance().getStart();
		Date fim = context.getTaskInstance().getEnd();
		
		long timeTotal = fim.getTime() - inicio.getTime();
		
		System.out.println("Time took for  UCReq " + timeTotal + " milliseconds");
		
		double hoursTime = timeTotal / (1000.0 * 60.0 );
		
		if(context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-22")){
			req.set(0, new Double(hoursTime));
		}else if (context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-23")){
			req.set(1, new Double(hoursTime));
		}else req.set(2
				, new Double(hoursTime));;

	
		
		log.info(context.getTaskInstance().getName()+ " Updating   UCReq " + hoursTime + "h(s)");
		
		context.getTaskInstance().setVariable("UCReqTime",new Double (Math.round(hoursTime + develop)));
		context.getTaskInstance().setVariable("ucReq",req );
	}
	
	

}
	
