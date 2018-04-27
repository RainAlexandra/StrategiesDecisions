package strategiesdecisions.agreestrategies;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.beans.Binding;
import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.Selection;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG2.1</b> - Agent "Y" does not immediately accept agent "X"'s binding 
 * request but waits for a length of time "dt" to elapse. The binder agent 
 * is then contacted in order for the physical binding to be done
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredAgreeImplicitReply implements IAgreeStrategy {
	
	private String agent;
	private List<Message> selections;
	private int dt;
	
	public DeferredAgreeImplicitReply(String agent, ArrayList<Message> selections, int dt) {
		this.agent = agent;
		this.selections = selections;
		this.dt = dt;
	}

	public void setSelections(ArrayList<Message> selections){
		this.selections = selections;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Agreement-Implicit-Response");
		
		System.out.println("Wait for " + dt + " cycles");
		while (dt > 0){
			dt--;
		}
		System.out.println("Wait over.");

//		Message bestSelection = best(selections)
		Message bestSelection = selections.get(0);
		String refBinder = ((Selection) bestSelection).getBinder();
		
		Message binding = new Binding(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
