package br.ufrn.dimap.ppgsc;

import java.util.ArrayList;
import java.util.List;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.graph.exe.Token;
import org.jbpm.graph.node.TaskNode;
import org.jbpm.taskmgmt.def.Task;
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
		    List<String> users = (List<String>)executionContext.getContextInstance().getVariable("cdus");
		    // now, 2 task instances are created for the same task.
		    for(String cdu: users){
		    	tmi.createTaskInstance(requirements, token).addComment(cdu);
		    }
		    
		  }
		}
