package br.ufrn.dimap.ppgsc;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

import br.ufrn.dimap.ppgsc.infra.Dados;
import br.ufrn.dimap.ppgsc.jri.CustomJavaGD;

public class InitiateVariablesActionHandler implements ActionHandler{
	
	private static final long serialVersionUID = 1L;
	private static List<String> users = new ArrayList<String>();
	private static List<String> time = new ArrayList<String>();
	private static List<Double> ucDev = new ArrayList<Double>();
	private static List<Double> ucTest = new ArrayList<Double>();
	private static List<Double> ucReq = new ArrayList<Double>();
	private static Double UCDevTime = new Double(0);
	private static Double UCReqTime = new Double(0);
	public void execute(ExecutionContext context) throws Exception {
		//Double value = new Double(0);
		users.add("SIGA-CDU-22");
		users.add("SIGA-CDU-23");
		users.add("SIGA-CDU-24");
		time.add("João");
		time.add("Lucas");
		time.add("Maria");
		ucDev.add(new Double(0));
		ucDev.add(new Double(0));
		ucDev.add(new Double(0));
		ucTest.add(new Double(0));
		ucTest.add(new Double(0));
		ucTest.add(new Double(0));
		ucReq.add(new Double(0));
		ucReq.add(new Double(0));
		ucReq.add(new Double(0));

		//carregando o R
		System.out.println(Dados.class.getResource("Dados.class"));
		System.out.println("Carregando o R...");
		Dados.iniciarDados();
		System.out.println("Carregou!");
		
		System.out.println(CustomJavaGD.class.getResource("CustomJavaGD.class"));
		System.out.println(System.getProperty("java.class.path"));
		
		System.out.println("\n\n Iniciando variaveis....\n\n");
			context.getContextInstance().createVariable("UCDevTime", UCDevTime);
			//context.getContextInstance().createVariable("UCDevTime", value);
			context.getContextInstance().createVariable("UCReqTime", UCReqTime);
			context.getContextInstance().createVariable("cdus", users);
			context.getContextInstance().createVariable("nomes", time );
			context.getContextInstance().createVariable("ucDev", ucDev);
			context.getContextInstance().createVariable("ucTest", ucTest);
			context.getContextInstance().createVariable("ucReq", ucReq);
	}

}
	
