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
		    // now, 2 task instances are created for the same task.
		    int i=0;

		    if (requirements != null){
		    for(String cdu: users){
		       TaskInstance	tarefa = tmi.createTaskInstance(requirements, token);
		       tarefa.setVariable("description",cdu);
		       //tarefa.addComment(cdu);
		       //tarefa.setDescription(cdu);
		       /*
		       if(i==0){
		    	   tarefa.setDescription(cdu);
		    	  // tarefa.setActorId("user");
		    	   i++;
		       }*/
		    }
		    }
		     if(desenv != null){  
		       for(String cdu: users){
			       TaskInstance	tarefa = tmi.createTaskInstance(desenv, token);
			       tarefa.setVariable("description",cdu);
			       //tarefa.setDescription(cdu);
			       
			       /*if(i==0){
			    	   tarefa.setDescription(cdu);
			    	  // tarefa.setActorId("user");
			    	   i++;
			       }
		    	*/
		    }
		     }
		     if(test != null){
		      
		       for(String cdu: users){
			       TaskInstance	tarefa = tmi.createTaskInstance(test, token);
			       tarefa.setVariable("description",cdu);
			       //tarefa.addComment(cdu);
			       //tarefa.setDescription(cdu);
			       /*
			       if(i==0){
			    	   tarefa.setDescription(cdu);
			    	   //tarefa.setActorId("user");
			    	   i++;
			       }
			       */
		    	
		    }
		     }
		  }
		}
