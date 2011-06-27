package br.ufrn.dimap.ppgsc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class UCDevActionHandler implements ActionHandler {

	private static final long serialVersionUID = 1L;
	Log log = LogFactory.getLog(this.getClass());
	 
	public void execute(ExecutionContext context) throws Exception {
		Double develop = (Double)context.getContextInstance().getVariable("UCDevTime");
		List<Double> dev = (ArrayList<Double>)context.getContextInstance().getVariable("ucDev");
		List<Double> tes = (ArrayList<Double>)context.getContextInstance().getVariable("ucTest");
		
		Date inicio = context.getTaskInstance().getStart();
		Date fim = context.getTaskInstance().getEnd();
		
		long timeTotal = fim.getTime() - inicio.getTime();
		
		System.out.println("Time took for  UCDev " + timeTotal + " milliseconds");
		
		double hoursTime = timeTotal / (1000.0 * 60.0 );
		System.out.println("\n\n\n"+context.getTaskInstance().getName());
		System.out.println("\n\n\n"+context.getTaskInstance().getTask().getName()+"\n\n\n");
		System.out.println("\n\n\n"+"description" + context.getTaskInstance().getDescription()+"\n\n\n");
		
		if(context.getTaskInstance().getTask().getName().equalsIgnoreCase("test_solution")){
			if(context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-22")){
				System.out.println(context.getTaskInstance().getDescription());
				tes.set(0,new Double(hoursTime));
			}else if (context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-23")){
				System.out.println(context.getTaskInstance().getDescription());
				tes.set(1,new Double(hoursTime));
			}else {tes.set(2,new Double(hoursTime));
			System.out.println(context.getTaskInstance().getDescription());
			}
	
		} else if(context.getTaskInstance().getTask().getName().equalsIgnoreCase("develop_solution")){
			if(context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-22")){
				dev.set(0,new Double(hoursTime));
			}else if (context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-23")){
				dev.set(1,new Double(hoursTime));
			}else dev.set(2,new Double(hoursTime));
			
		}
		
		log.info(context.getTaskInstance().getName()+ " Updating   UCDev " + hoursTime + "h(s)");
		
		
		
		
		context.getTaskInstance().setVariable("UCDevTime", new Double(Math.round(hoursTime + develop)) );
		context.getTaskInstance().setVariable("ucTest",tes );
		context.getTaskInstance().setVariable("ucDev",dev );
	}
	
	

}
	
