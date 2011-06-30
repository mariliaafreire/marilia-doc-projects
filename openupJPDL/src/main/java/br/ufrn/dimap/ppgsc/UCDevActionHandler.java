package br.ufrn.dimap.ppgsc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

import br.ufrn.dimap.ppgsc.infra.Metricas;
import br.ufrn.dimap.ppgsc.jri.Shewhart;

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
		Map<String, Double> val = Shewhart.recuperarValoresLimites(Metricas.DESENVOLVIMENTO);
		
		
		
		if(context.getTaskInstance().getTask().getName().equalsIgnoreCase("test_solution")){
			
			if(context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-22")){
				System.out.println(context.getTaskInstance().getDescription());
				tes.set(0,new Double(hoursTime));
				if((hoursTime + tes.get(0)) > val.get("UCL") || (hoursTime +tes.get(0)) < val.get("LDL")){
					System.out.println("WARNING:: VALOR FORA DOS LIMITES");
					Shewhart.gerarGraficoShewhart(hoursTime+tes.get(0),Metricas.DESENVOLVIMENTO);
				}
			}else if (context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-23")){
				System.out.println(context.getTaskInstance().getDescription());
				tes.set(1,new Double(hoursTime));
				if((hoursTime + tes.get(1)) > val.get("UCL") || (hoursTime +tes.get(1)) < val.get("LDL")){
					System.out.println("WARNING:: VALOR FORA DOS LIMITES");
					Shewhart.gerarGraficoShewhart(hoursTime+tes.get(1),Metricas.DESENVOLVIMENTO);
				}
			}else {
			
			System.out.println(context.getTaskInstance().getDescription());
			tes.set(2,new Double(hoursTime));
			if((hoursTime + tes.get(2)) > val.get("UCL") || (hoursTime +tes.get(2)) < val.get("LDL")){
				System.out.println("WARNING:: VALOR FORA DOS LIMITES");
				Shewhart.gerarGraficoShewhart(hoursTime + tes.get(2),Metricas.DESENVOLVIMENTO);
			}
		}
	
		} else if(context.getTaskInstance().getTask().getName().equalsIgnoreCase("develop_solution")){
			if(context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-22")){
				dev.set(0,new Double(hoursTime));
				if((hoursTime + dev.get(0)) > val.get("UCL") || (hoursTime +dev.get(0)) < val.get("LDL")){
					System.out.println("WARNING:: VALOR FORA DOS LIMITES");
					Shewhart.gerarGraficoShewhart(hoursTime+dev.get(0),Metricas.DESENVOLVIMENTO);
				}
			}else if (context.getTaskInstance().getDescription().equalsIgnoreCase("SIGA-CDU-23")){
				dev.set(1,new Double(hoursTime));
				if((hoursTime + dev.get(0)) > val.get("UCL") || (hoursTime +dev.get(0)) < val.get("LDL")){
					System.out.println("WARNING:: VALOR FORA DOS LIMITES");
					Shewhart.gerarGraficoShewhart(hoursTime+dev.get(1),Metricas.DESENVOLVIMENTO);
				}
			}else {
				dev.set(2,new Double(hoursTime));
				if((hoursTime + dev.get(0)) > val.get("UCL") || (hoursTime +dev.get(0)) < val.get("LDL")){
					System.out.println("WARNING:: VALOR FORA DOS LIMITES");
					Shewhart.gerarGraficoShewhart(hoursTime+dev.get(2),Metricas.DESENVOLVIMENTO);
				}
			}
			
		}
		
		
		log.info(context.getTaskInstance().getName()+ " Updating   UCDev " + hoursTime + "h(s)");
		
		
		
		
		context.getTaskInstance().setVariable("UCDevTime", new Double(Math.round(hoursTime + develop)) );
		context.getTaskInstance().setVariable("ucTest",tes );
		context.getTaskInstance().setVariable("ucDev",dev );
	}
	
	

}
	
