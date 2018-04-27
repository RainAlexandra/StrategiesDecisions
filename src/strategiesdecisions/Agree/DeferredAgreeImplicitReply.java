package strategiesdecisions.Agree;

import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.Message.BindingMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Reply.NoReply;
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
	private List<MessageAgent> selections;
	private int dt;
	
	public DeferredAgreeImplicitReply(LinkedList<MessageAgent> selections) {
		this.selections = selections;
	}

	public void setSelections(LinkedList<MessageAgent> selections){
		this.selections = selections;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Agreement-Implicit-Response");

		while (dt > 0){
			(new NoReply()).executer(comm); // on ne fait rien
			dt--;
		}
		
//		Selection bestSelection = best(selections)
//		String refBinder = bestSelection.getBinder();
		String refBinder = "Binder agent"; // to remove
		
		MessageAgent binding = new BindingMessage(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
