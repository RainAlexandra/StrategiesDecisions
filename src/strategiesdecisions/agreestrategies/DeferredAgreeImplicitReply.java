package strategiesdecisions.agreestrategies;

import java.util.LinkedList;

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
public class DeferredAgreeImplicitReply extends AgreeStrategy {
	
	private int Dt;

	public DeferredAgreeImplicitReply(String agent, LinkedList<Message> selections) {
		super(agent, selections);
	}
		
	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Agreement-Implicit-Response");
//		Selection bestSelection = best(selections)
//		String refBinder = bestSelection.getBinder();
		String refBinder = "Binder agent"; // to remove
		
		while (Dt > 0){
			(new NoReply(agent, null)).executer(comm); // on ne fait rien
			Dt--;
		}
		
		Message binding = new Binding(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
