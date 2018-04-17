package strategiesdecisions.agreestrategies;

import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.beans.Binding;
import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.replystrategies.NoReply;

/**
 * <b>SAG2.1</b> - Agent "Y" does not immediately accept agent "X"'s binding 
 * request but waits for a length of time "Dt" to elapse. The binder agent 
 * is then contacted in order for the physical binding to be done
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredAgreeImplicitReply implements IAgreeStrategy {
	
	private String agent;
	private List<Message> selections;
	private int Dt;
	
	public DeferredAgreeImplicitReply(LinkedList<Message> selections) {
		this.selections = selections;
	}

	public List<Message> getSelections(){
		return selections;
	}

	public void setSelections(LinkedList<Message> selections){
		this.selections = selections;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Agreement-Implicit-Response");
//		Selection bestSelection = best(selections)
//		String refBinder = bestSelection.getBinder();
		String refBinder = "Binder agent"; // to remove
		
		while (Dt > 0){
			(new NoReply()).executer(comm); // on ne fait rien
			Dt--;
		}
		
		Message binding = new Binding(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
