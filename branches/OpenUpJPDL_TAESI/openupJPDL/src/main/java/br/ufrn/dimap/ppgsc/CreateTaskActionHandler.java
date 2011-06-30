package br.ufrn.dimap.ppgsc;

import java.util.List;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.graph.exe.Token;
import org.jbpm.graph.node.TaskNode;
import org.jbpm.taskmgmt.def.Task;
import org.jbpm.taskmgmt.exe.TaskInstance;
import org.jbpm.taskmgmt.exe.TaskMgmtInstance;

public class CreateTaskActionHandler implements ActionHandler {
		  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


		public void execute(ExecutionContext executionContext) throws Exception {
			
		    Token token = executionContext.getToken();
		    TaskMgmtInstance tmi = executionContext.getTaskMgmtInstance();
		    TaskNode taskNode = (TaskNode) executionContext.getNode();
		    
		    
		    Task requirements = taskNode.getTask("identify_and_refine_requirements");
		    Task desenv = taskNode.getTask("develop_solution");
		    Task test = taskNode.getTask("test_solution");

		    List<String> users = (List<String>)executionContext.getContextInstance().getVariable("cdus");


		    if (requirements != null){
		    	//Criação das instâncias das atividades de requisitos para cada CDU
		    	for(String cdu: users){
		    		TaskInstance	tarefa = tmi.createTaskInstance(requirements, token);
		    		
		    		tarefa.setVariable("description",cdu);
		    		tarefa.setDescription(cdu);		    	
		    		System.out.println("Tarefa: " + tarefa.getDescription() + "  "+tarefa.getVariable("description"));
		    	}
		    }
		    else if(desenv != null){  
		    	//Criação das instâncias das atividades de codificação para cada CDU
		    	for(String cdu: users){
		    		TaskInstance	tarefa = tmi.createTaskInstance(desenv, token);
		    		tarefa.setVariable("description",cdu);
		    		tarefa.setDescription(cdu);
		    		System.out.println("Tarefa: " + tarefa.getDescription() + "  "+tarefa.getVariable("description"));

		    	}
		    }
		    else if(test != null){
		    	//Criação das instâncias das atividades de testes para cada CDU
		    	for(String cdu: users){
		    		TaskInstance tarefa = tmi.createTaskInstance(test, token);
		    		tarefa.setVariable("description",cdu);
		    		tarefa.setDescription(cdu);
		    		System.out.println("Tarefa: " + tarefa.getDescription() + "  "+tarefa.getVariable("description"));


		    	}
		    }
		}
}
